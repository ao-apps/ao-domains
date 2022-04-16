/*
 * Copyright 2009-2011, 2020, 2021, 2022 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */

package com.aoindustries.domains.wwd;

import com.aoindustries.collections.AoCollections;
import com.aoindustries.domains.Domain;
import com.aoindustries.domains.DomainRegistrar;
import com.aoindustries.domains.Tld;
import com.aoindustries.domains.wwd.wapi.ContactInfo;
import com.aoindustries.domains.wwd.wapi.Credential;
import com.aoindustries.domains.wwd.wapi.DomainByProxy;
import com.aoindustries.domains.wwd.wapi.DomainRegistration;
import com.aoindustries.domains.wwd.wapi.DomainRenewal;
import com.aoindustries.domains.wwd.wapi.DomainTransfer;
import com.aoindustries.domains.wwd.wapi.NS;
import com.aoindustries.domains.wwd.wapi.Nexus;
import com.aoindustries.domains.wwd.wapi.OrderItem;
import com.aoindustries.domains.wwd.wapi.ResourceRenewal;
import com.aoindustries.domains.wwd.wapi.Shopper;
import com.aoindustries.domains.wwd.wapi.WAPILocator;
import com.aoindustries.domains.wwd.wapi.WAPISoap_PortType;
import com.aoindustries.util.i18n.Money;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.axis.types.UnsignedInt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Provider for Wild West Domains<br>
 * <br>
 * Configuration parameters:
 * <ol>
 *   <li>portAddress - The web services port address</li>
 *   <li>account - The web services account ID</li>
 *   <li>password - The web services account password</li>
 * </ol>
 *
 * Note: Commands to build .java files from WSDL:
 * <ol>
 *   <li>cd /path/to/project/src</li>
 *   <li>java -classpath ../lib/saaj.jar:../lib/jaxrpc.jar:../lib/commons-discovery-0.2.jar:../lib/commons-logging-1.0.4.jar:../lib/wsdl4j-1.5.1.jar:../lib/axis.jar org.apache.axis.wsdl.WSDL2Java --package com.aoindustries.domains.wwd.wapi https://api.ote.wildwestdomains.com/wswwdapi/wapi.asmx?wsdl</li>
 * </ol>
 *
 * @author  AO Industries, Inc.
 */
public class WildWestDomains implements DomainRegistrar {

	/**
	 * The production web services URL.
	 */
	public static final String PRODUCTION_PORT_ADDRESS = "https://api.wildwestdomains.com/wswwdapi/wapi.asmx?wsdl";

	/**
	 * The test web services URL.
	 */
	public static final String OTE_PORT_ADDRESS = "https://api.ote.wildwestdomains.com/wswwdapi/wapi.asmx?wsdl";

	private static final Logger logger = Logger.getLogger(WildWestDomains.class.getName());

	/**
	 * Transforms a Document to a String.
	 */
	private static String transform(Document document) throws IOException {
		try {
			StringWriter cout = new StringWriter();
			TransformerFactory factory = TransformerFactory.newInstance();
			try {
				factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			} catch(TransformerConfigurationException e) {
				throw new AssertionError("All implementations are required to support the javax.xml.XMLConstants.FEATURE_SECURE_PROCESSING feature.", e);
			}
			// See https://github.com/OWASP/CheatSheetSeries/blob/master/cheatsheets/XML_External_Entity_Prevention_Cheat_Sheet.md#java
			// See https://rules.sonarsource.com/java/RSPEC-2755
			factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
			factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");
			Transformer transformer = factory.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.transform(new DOMSource(document), new StreamResult(cout));
			return cout.toString();
		} catch(TransformerException err) {
			throw new IOException(err);
		}
	}

	/**
	 * Creates a new Document.
	 */
	private static Document newDocument() throws IOException {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			try {
				dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			} catch(ParserConfigurationException e) {
				throw new AssertionError("All implementations are required to support the javax.xml.XMLConstants.FEATURE_SECURE_PROCESSING feature.", e);
			}
			// See https://github.com/OWASP/CheatSheetSeries/blob/master/cheatsheets/XML_External_Entity_Prevention_Cheat_Sheet.md#java
			// See https://rules.sonarsource.com/java/RSPEC-2755
			dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
			dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
			dbf.setNamespaceAware(true);
			return dbf.newDocumentBuilder().newDocument();
		} catch(ParserConfigurationException err) {
			throw new IOException(err);
		}
	}

	/**
	 * Transforms a String to a Document.
	 */
	private static Document transform(String xml) throws IOException {
		try {
			Document document = newDocument();
			TransformerFactory factory = TransformerFactory.newInstance();
			try {
				factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			} catch(TransformerConfigurationException e) {
				throw new AssertionError("All implementations are required to support the javax.xml.XMLConstants.FEATURE_SECURE_PROCESSING feature.", e);
			}
			// See https://github.com/OWASP/CheatSheetSeries/blob/master/cheatsheets/XML_External_Entity_Prevention_Cheat_Sheet.md#java
			// See https://rules.sonarsource.com/java/RSPEC-2755
			factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
			factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");
			factory.newTransformer().transform(new StreamSource(new StringReader(xml)), new DOMResult(document));
			return document;
		} catch(TransformerException err) {
			throw new IOException(err);
		}
	}

	private final String providerId;
	private final String portAddress;
	private final String account;
	private final String password;

	public WildWestDomains(String providerId, String portAddress, String account, String password) {
		this.providerId = providerId;
		this.portAddress = portAddress;
		this.account = account;
		this.password = password;
	}

	@Override
	public String getProviderId() {
		return providerId;
	}

	private static final Set<Tld> registerTlds = Collections.unmodifiableSet(
		EnumSet.of(
			Tld.COM,
			Tld.INFO,
			Tld.NET,
			Tld.ME,
			Tld.BIZ,
			// No pricing available: Tld.IT,
			Tld.ORG,
			Tld.MOBI,
			//TLD.COM_ES,
			//Tld.MX,
			Tld.WS,
			//TLD.NOM_ES,
			Tld.US,
			Tld.ES,
			//TLD.ORG_ES,
			Tld.NL,
			Tld.IN,
			Tld.COM_MX,
			Tld.BZ,
			Tld.COM_BZ,
			Tld.NET_BZ,
			Tld.CO_IN,
			Tld.FIRM_IN,
			Tld.GEN_IN,
			Tld.IND_IN,
			Tld.NET_IN,
			Tld.ORG_IN,
			Tld.TV
		)
	);

	@Override
	public Set<Tld> getRegisterTlds() {
		return registerTlds;
	}

	private static final Set<Tld> transferTlds = Collections.unmodifiableSet(
		EnumSet.of(
			Tld.COM,
			Tld.INFO,
			Tld.NET,
			Tld.ME,
			Tld.BIZ,
			// No pricing available: Tld.IT,
			Tld.ORG,
			Tld.MOBI,
			//TLD.COM_ES,
			//TLD.MX,
			Tld.WS,
			//TLD.NOM_ES,
			Tld.US,
			Tld.ES,
			//TLD.ORG_ES,
			//TLD.NL,
			Tld.IN,
			Tld.COM_MX,
			Tld.BZ,
			Tld.COM_BZ,
			Tld.NET_BZ,
			Tld.CO_IN,
			Tld.FIRM_IN,
			Tld.GEN_IN,
			Tld.IND_IN,
			Tld.NET_IN,
			Tld.ORG_IN,
			Tld.TV
		)
	);

	@Override
	public Set<Tld> getTransferTlds() {
		return transferTlds;
	}

	public String getPortAddress() {
		return portAddress;
	}

	public String getAccount() {
		return account;
	}

	public String getPassword() {
		return password;
	}

	private WAPISoap_PortType getSoap() throws IOException {
		try {
			return new WAPILocator().getWAPISoap(new URL(portAddress));
		} catch(ServiceException err) {
			throw new IOException(err);
		}
	}

	@Override
	public Map<Domain, Boolean> checkAvailability(Set<Domain> domains) throws IOException {
		Map<String, Domain> byString = AoCollections.newLinkedHashMap(domains.size());
		for(Domain domain : domains) byString.put(domain.toString().toLowerCase(Locale.ENGLISH), domain);
		String response = getSoap().checkAvailability(
			UUID.randomUUID().toString(),
			new Credential(account, password),
			byString.keySet().toArray(new String[byString.size()]),
			null,
			null
		);
		logger.fine(response);
		Document document = transform(response);
		if(document.getFirstChild().getNodeName().equals("error")) throw new IOException("TODO: "+response);
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			NodeList nodeList = (NodeList)xpath.evaluate("/check/domain", document, XPathConstants.NODESET);
			Map<Domain, Boolean> results = AoCollections.newLinkedHashMap(nodeList.getLength());
			for(int c=0; c<nodeList.getLength(); c++) {
				Node node = nodeList.item(c);
				if(!(node instanceof Element)) throw new IOException("TODO: "+response);
				Element elem = (Element)node;
				results.put(byString.get(elem.getAttribute("name").toLowerCase(Locale.ENGLISH)), "1".equals(elem.getAttribute("avail")));
			}
			// Make sure each domain was found
			for(Domain domain : domains) if(!results.containsKey(domain)) throw new IOException("TODO: Domain not in results: "+domain);
			return Collections.unmodifiableMap(results);
		} catch(XPathExpressionException err) {
			throw new IOException(err);
		}
	}

	public void createNewShopper(
		String password,
		String email,
		String firstName,
		String lastName,
		String phone,
		String passwordHint,
		String fax,
		String company,
		String address,
		String city,
		String state,
		String zip,
		String country,
		String pin
	) throws IOException {
		String response = getSoap().createNewShopper(
			UUID.randomUUID().toString(),
			new Credential(account, this.password),
			password,
			email,
			firstName,
			lastName,
			phone,
			passwordHint,
			fax,
			company,
			address,
			city,
			state,
			zip,
			country,
			pin
		);
		logger.info(response);
		// TODO
	}

	public class OrderDomainsResult {

		private String user;
		private String orderid;

		public OrderDomainsResult(String user, String orderid) {
			this.user = user;
			this.orderid = orderid;
		}

		public String getUser() {
			return user;
		}

		public String getOrderid() {
			return orderid;
		}
	}

	public OrderDomainsResult orderDomains(
		String password,
		String passwordHint,
		String email,
		String firstName,
		String lastName,
		String org,
		String phone,
		String fax,
		String address1,
		String address2,
		String city,
		String state,
		String postalCode,
		String country,
		String pin
	) throws IOException {
		String response = getSoap().orderDomains(
			UUID.randomUUID().toString(),
			new Credential(account, this.password),
			new Shopper(
				"createNew",
				password,
				passwordHint,
				email,
				firstName,
				lastName,
				phone,
				pin,
				null,
				null,
				null,
				null,
				null
			),
			new DomainRegistration[] {
				new DomainRegistration(
					new OrderItem(
						350127,
						new UnsignedInt(1),
						null,
						1
					),
					"example",
					"us",
					2,
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					new Nexus("citizen of US", "personal", null),
					new NS[] {
						new NS("ns1.example.com"),
						new NS("ns2.example.com")
					},
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					1
				),
				new DomainRegistration(
					new OrderItem(
						350077,
						new UnsignedInt(1),
						null,
						1
					),
					"example",
					"biz",
					2,
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					null,
					new NS[] {
						new NS("ns1.example.com"),
						new NS("ns2.example.com")
					},
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					new ContactInfo(firstName, lastName, org, email, address1, address2, city, state, postalCode, country, phone, fax),
					1
				)
			},
			new DomainByProxy[0],
			null
		);
		logger.fine(response);
		Document document = transform(response);
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			if(!"1000".equals(xpath.evaluate("/response/result/@code", document))) throw new IOException("TODO: "+response);
			return new OrderDomainsResult(
				xpath.evaluate("/response/@user", document),
				xpath.evaluate("/response/resdata/orderid", document)
			);
		} catch(XPathExpressionException err) {
			throw new IOException(err);
		}
	}

	private void resetCertification() throws IOException {
		// Create document
		Document document = newDocument();
		Element wapi = document.createElement("wapi");
		document.appendChild(wapi);
		wapi.setAttribute("clTRID", UUID.randomUUID().toString());
		wapi.setAttribute("account", account);
		wapi.setAttribute("pwd", password);
		Element manage = document.createElement("manage");
		wapi.appendChild(manage);
		Element script = document.createElement("script");
		manage.appendChild(script);
		script.setAttribute("cmd", "reset");
		// Perform request
		String request = transform(document);
		logger.fine(request);
		String response = getSoap().processRequest(request);
		logger.fine(response);
		// Parse response
		if(!"scripting status reset".equals(response)) throw new IOException("TODO: "+response);
	}

	public Map<String, List<String>> poll() throws IOException {
		String response = getSoap().poll(
			UUID.randomUUID().toString(),
			new Credential(account, this.password),
			null
		);
		logger.fine(response);
		Document document = transform(response);
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			if(!"1004".equals(xpath.evaluate("/response/result/@code", document))) throw new IOException("TODO: "+response);
			NodeList nodeList = (NodeList)xpath.evaluate("/response/resdata/REPORT/ITEM", document, XPathConstants.NODESET);
			Map<String, List<String>> results = AoCollections.newLinkedHashMap(nodeList.getLength());
			for(int c=0; c<nodeList.getLength(); c++) {
				Node node = nodeList.item(c);
				if(!(node instanceof Element)) throw new IOException("TODO: "+response);
				Element elem = (Element)node;
				String orderid = elem.getAttribute("orderid");
				String resourceid = elem.getAttribute("resourceid");
				List<String> resources = results.get(orderid);
				if(resources == null) results.put(orderid, resources = new ArrayList<>());
				resources.add(resourceid);
			}
			return results;
		} catch(XPathExpressionException err) {
			throw new IOException(err);
		}
	}

	public class OrderDomainPrivacyResult {

		private String dbpuser;
		private String orderid;

		public OrderDomainPrivacyResult(String dbpuser, String orderid) {
			this.dbpuser = dbpuser;
			this.orderid = orderid;
		}

		public String getDbpUser() {
			return dbpuser;
		}

		public String getOrderid() {
			return orderid;
		}
	}

	public OrderDomainPrivacyResult orderDomainPrivacy(String user, String resourceId, String dbppwd, String dbpemail) throws IOException {
		String response = getSoap().orderDomainPrivacy(
			UUID.randomUUID().toString(),
			new Credential(account, this.password),
			new Shopper(user, null, null, null, null, null, null, null, "createNew", dbppwd, null, dbpemail, null),
			new DomainByProxy[] {
				new DomainByProxy(
					new OrderItem(
						377001,
						new UnsignedInt(1),
						null,
						1
					),
					"example",
					"biz",
					resourceId
				)
			},
			null
		);
		logger.fine(response);
		Document document = transform(response);
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			if(!"1000".equals(xpath.evaluate("/response/result/@code", document))) throw new IOException("TODO: "+response);
			return new OrderDomainPrivacyResult(
				xpath.evaluate("/response/@dbpuser", document),
				xpath.evaluate("/response/resdata/orderid", document)
			);
		} catch(XPathExpressionException err) {
			throw new IOException(err);
		}
	}

	public void info(String resourceId) throws IOException {
		String response = getSoap().info(
			UUID.randomUUID().toString(),
			new Credential(account, this.password),
			resourceId,
			"standard",
			null,
			null
		);
		logger.fine(response);
		Document document = transform(response);
		XPath xpath = XPathFactory.newInstance().newXPath();
		// TODO
	}

	public String orderPrivateDomainRenewals(String user, String dbpuser, String dbppwd, String usResourceid, String bizResourceid, String bizPdResourceid) throws IOException {
		String response = getSoap().orderPrivateDomainRenewals(
			UUID.randomUUID().toString(),
			new Credential(account, this.password),
			new Shopper(user, null, null, null, null, null, null, null, dbpuser, dbppwd, null, null, null),
			new DomainRenewal[] {
				new DomainRenewal(
					new OrderItem(
						350137,
						new UnsignedInt(1),
						null,
						1
					),
					usResourceid,
					"example",
					"us",
					1
				),
				new DomainRenewal(
					new OrderItem(
						350087,
						new UnsignedInt(1),
						null,
						1
					),
					bizResourceid,
					"example",
					"biz",
					1
				)
			},
			new ResourceRenewal[] {
				new ResourceRenewal(
					new OrderItem(
						387001,
						new UnsignedInt(1),
						null,
						1
					),
					bizPdResourceid
				)
			},
			null
		);
		logger.fine(response);
		Document document = transform(response);
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			if(!"1000".equals(xpath.evaluate("/response/result/@code", document))) throw new IOException("TODO: "+response);
			return xpath.evaluate("/response/resdata/orderid", document);
		} catch(XPathExpressionException err) {
			throw new IOException(err);
		}
	}

	public String orderDomainTransfer(
		String password,
		String email,
		String firstName,
		String lastName,
		String phone,
		String passwordHint,
		String fax,
		String company,
		String address,
		String city,
		String state,
		String zip,
		String country,
		String pin
	) throws IOException {
		String response = getSoap().orderDomainTransfers(
			UUID.randomUUID().toString(),
			new Credential(account, this.password),
			new Shopper(
				"createNew",
				password,
				passwordHint,
				email,
				firstName,
				lastName,
				phone,
				pin,
				null,
				null,
				null,
				null,
				null
			),
			new DomainTransfer[] {
				new DomainTransfer(
					new OrderItem(
						350011,
						new UnsignedInt(1),
						null,
						1
					),
					"example",
					"com",
					null
				)
			},
			null
		);
		logger.fine(response);
		Document document = transform(response);
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			if(!"1000".equals(xpath.evaluate("/response/result/@code", document))) throw new IOException("TODO: "+response);
			return xpath.evaluate("/response/resdata/orderid", document);
		} catch(XPathExpressionException err) {
			throw new IOException(err);
		}
	}

	public void certify() throws IOException {
		// reset
		resetCertification();
		// availability
		Domain exampleUs = new Domain("example", Tld.US);
		Domain exampleBiz = new Domain("example", Tld.BIZ);
		Map<Domain, Boolean> availability = checkAvailability(new LinkedHashSet<>(Arrays.asList(new Domain[] {exampleUs, exampleBiz})));
		if(!Boolean.TRUE.equals(availability.get(exampleUs))) throw new IOException("TODO: example.us is not available");
		if(!Boolean.TRUE.equals(availability.get(exampleBiz))) throw new IOException("TODO: example.biz is not available");
		// order domains
		OrderDomainsResult orderDomainsResult = orderDomains(
			"abcde",
			null,
			"agordon@wildwestdomains.com",
			"Artemus",
			"Gordon",
			null,
			"+1.8885551212",
			null,
			"2 N. Main St.",
			null,
			"Valdosta",
			"Georgia",
			"17123",
			"United States",
			null
		);
		// privacy purchase
		Map<String, List<String>> poll1Results = poll();
		String usResourceid = poll1Results.get(orderDomainsResult.getOrderid()).get(0);
		String bizResourceid = poll1Results.get(orderDomainsResult.getOrderid()).get(1);
		OrderDomainPrivacyResult orderDomainPrivacyResult = orderDomainPrivacy(orderDomainsResult.getUser(), bizResourceid, "defgh", "info@example.biz");
		// availability check
		Map<Domain, Boolean> availability2 = checkAvailability(new LinkedHashSet<>(Arrays.asList(new Domain[] {exampleUs, exampleBiz})));
		if(!Boolean.FALSE.equals(availability2.get(exampleUs))) throw new IOException("TODO: example.us is available");
		if(!Boolean.FALSE.equals(availability2.get(exampleBiz))) throw new IOException("TODO: example.biz is available");
		// information query
		info(bizResourceid);
		// renewal
		Map<String, List<String>> poll2Results = poll();
		String bizPdResourceid = poll2Results.get(orderDomainPrivacyResult.getOrderid()).get(0);
		String renewalOrderid = orderPrivateDomainRenewals(orderDomainsResult.getUser(), orderDomainPrivacyResult.getDbpUser(), "defgh", usResourceid, bizResourceid, bizPdResourceid);
		// transfer
		String transferOrderId = orderDomainTransfer(
			"ghijk",
			"joe@smith.us",
			"Joe",
			"Smith",
			"+1.7775551212",
			null,
			null,
			null,
			"1 S. Main St.",
			"Oakland",
			"California",
			"97123",
			"United States",
			null
		);
	}

	private static final Currency USD = Currency.getInstance("USD");

	@Override
	public Money getRegisterCost(Currency currency, Tld tld, int numYears) throws IOException {
		int minYears = tld.getMinRegistrationYears();
		if(numYears<minYears) throw new IllegalArgumentException("numYears<minYears: "+numYears+"<"+minYears);
		int maxYears = tld.getMaxRegistrationYears();
		if(numYears>maxYears) throw new IllegalArgumentException("numYears>maxYears: "+numYears+">"+maxYears);
		if(currency==USD) {
			// Prices last set on 2009-12-14
			switch(tld) {
				case COM:
				case NET:
				case ORG:
				case INFO:
				case BIZ:
				case US:
					return new Money(USD, new BigDecimal("7.49"));
				case WS:
					return new Money(USD, new BigDecimal("7.99"));
				case ES:
					return new Money(USD, new BigDecimal("11.99"));
				case MOBI:
				case IN:
				case CO_IN:
				case FIRM_IN:
				case GEN_IN:
				case IND_IN:
				case NET_IN:
				case ORG_IN:
					return new Money(USD, new BigDecimal("12.99"));
				case ME:
					return new Money(USD, new BigDecimal("16.99"));
				case BZ:
					return new Money(USD, new BigDecimal("17.49"));
				case COM_BZ:
				case NET_BZ:
				case NL:
					return new Money(USD, new BigDecimal("19.99"));
				case COM_MX:
					return new Money(USD, new BigDecimal("28.99"));
				//case MX:
				//    return new Money(USD, new BigDecimal("31.99"));
				case TV:
					return new Money(USD, new BigDecimal("39.99"));
				default:
					throw new IOException("Registration cost not known: currency="+currency+", tld="+tld);
			}
		} else throw new IllegalArgumentException("Unsupported currency: "+currency);
	}
}
