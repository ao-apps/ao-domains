/**
 * WAPISoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class WAPISoap_BindingStub extends org.apache.axis.client.Stub implements com.aoindustries.domains.wwd.wapi.WAPISoap_PortType {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc [] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[37];
		_initOperationDesc1();
		_initOperationDesc2();
		_initOperationDesc3();
		_initOperationDesc4();
	}

	private static void _initOperationDesc1(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("ProcessRequest");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sRequestXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ProcessRequestResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("Describe");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DescribeResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("CheckAvailability");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sDomainArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfString"), java.lang.String[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "string"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sHostArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfString"), java.lang.String[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "string"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sNSArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfString"), java.lang.String[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "string"));
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "CheckAvailabilityResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("Info");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sResourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sOrderID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "InfoResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("NameGen");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sSLD"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sTLD"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sTLDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bHypens"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bNumbers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nMaxLen"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bIntelliSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NameGenResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("NameGenDB");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nMaxResults"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bExcludeTaken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sTLDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddSuffix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddDashes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddRelated"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAdvancedSplit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bBaseOnTop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NameGenDBResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("NameGenDBWithTimeLimit");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nMaxResults"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bExcludeTaken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sTLDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddSuffix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddDashes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAddRelated"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bAdvancedSplit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "bBaseOnTop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nMaxWaitSeconds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NameGenDBWithTimeLimitResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("Poll");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sOp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "PollResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderCredits");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfOrderItem"), com.aoindustries.domains.wwd.wapi.OrderItem[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderCreditsResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderDomains");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainRegistration"), com.aoindustries.domains.wwd.wapi.DomainRegistration[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRegistration"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "dbpItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainByProxy"), com.aoindustries.domains.wwd.wapi.DomainByProxy[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainByProxy"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainsResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderDomainRenewals");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainRenewal"), com.aoindustries.domains.wwd.wapi.DomainRenewal[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRenewal"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainRenewalsResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderPrivateDomainRenewals");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainRenewal"), com.aoindustries.domains.wwd.wapi.DomainRenewal[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRenewal"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "dbpItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfResourceRenewal"), com.aoindustries.domains.wwd.wapi.ResourceRenewal[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResourceRenewal"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderPrivateDomainRenewalsResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderDomainTransfers");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainTransfer"), com.aoindustries.domains.wwd.wapi.DomainTransfer[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainTransfer"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainTransfersResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderDomainPrivacy");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainByProxy"), com.aoindustries.domains.wwd.wapi.DomainByProxy[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainByProxy"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainPrivacyResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderResourceRenewals");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfResourceRenewal"), com.aoindustries.domains.wwd.wapi.ResourceRenewal[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResourceRenewal"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderResourceRenewalsResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("OrderDomainBackOrders");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopper"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper"), com.aoindustries.domains.wwd.wapi.Shopper.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainBackOrder"), com.aoindustries.domains.wwd.wapi.DomainBackOrder[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainBackOrder"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sROID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainBackOrdersResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("Cancel");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sIDArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfString"), java.lang.String[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "string"));
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "CancelResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[16] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("UpdateDomainOwnership");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sResourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sLosingOwner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "gaining"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GainingOwner"), com.aoindustries.domains.wwd.wapi.GainingOwner.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainOwnershipResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[17] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("ResetPassword");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sPwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sPwdHint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResetPasswordResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[18] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SetShopperInfo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sFirstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sLastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sPhone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sFax"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCompany"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sZip"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCountry"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sShopperPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "SetShopperInfoResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[19] = oper;

	}

	private static void _initOperationDesc3(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("CreateNewShopper");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sPwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sFirstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sLastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sPhone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sPwdHint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sFax"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCompany"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sZip"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCountry"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sShopperPin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "CreateNewShopperResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[20] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("CheckUser");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sPwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "CheckUserResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[21] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SetupDomainAlert");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainAlert"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainAlert"), com.aoindustries.domains.wwd.wapi.DomainAlert.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "registrant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"), com.aoindustries.domains.wwd.wapi.ContactInfo.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "SetupDomainAlertResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[22] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("UpdateDomainAlert");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainAlert"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainAlert"), com.aoindustries.domains.wwd.wapi.DomainAlert.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sDomainMonitorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "registrant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"), com.aoindustries.domains.wwd.wapi.ContactInfo.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainAlertResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[23] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("RemoveDomainAlert");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sDomainMonitorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "RemoveDomainAlertResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[24] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GetDomainAlertCredits");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GetDomainAlertCreditsResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[25] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GetMonitoredDomainList");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nRowsPerPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GetMonitoredDomainListResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[26] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GetExpiringNameList");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nLength"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sDashes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sNumbers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sWildCardSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sSearchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sTLDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nRowsPerPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GetExpiringNameListResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[27] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DomainForwarding");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nDomainID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sForwardingURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sMngTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainForwardingResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[28] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("UpdateNameServer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomain"), com.aoindustries.domains.wwd.wapi.Domain[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nsArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfNS"), com.aoindustries.domains.wwd.wapi.NS[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NS"));
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateNameServerResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[29] = oper;

	}

	private static void _initOperationDesc4(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("UpdateDomainContact");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomain"), com.aoindustries.domains.wwd.wapi.Domain[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "registrant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"), com.aoindustries.domains.wwd.wapi.ContactInfo.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "admin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"), com.aoindustries.domains.wwd.wapi.ContactInfo.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "billing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"), com.aoindustries.domains.wwd.wapi.ContactInfo.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "tech"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"), com.aoindustries.domains.wwd.wapi.ContactInfo.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainContactResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[30] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SetDomainLocking");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomain"), com.aoindustries.domains.wwd.wapi.Domain[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sLock"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "SetDomainLockingResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[31] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("ManageTransfer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomain"), com.aoindustries.domains.wwd.wapi.Domain[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ManageTransferResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[32] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("UpdateDomainForwarding");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomain"), com.aoindustries.domains.wwd.wapi.Domain[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sForwardingURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainForwardingResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[33] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("UpdateDomainMasking");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomain"), com.aoindustries.domains.wwd.wapi.Domain[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sForwardingURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sMaskingMetatagTitle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sMaskingMetatagDesc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sMaskingMetatagKeyword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainMaskingResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[34] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("ModifyDNS");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "dnsRequestArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDNSRequest"), com.aoindustries.domains.wwd.wapi.DNSRequest[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DNSRequest"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ModifyDNSResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[35] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("ValidateRegistration");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sCLTRID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential"), com.aoindustries.domains.wwd.wapi.Credential.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainContacts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainContacts"), com.aoindustries.domains.wwd.wapi.DomainContacts.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domainDataArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainData"), com.aoindustries.domains.wwd.wapi.DomainData[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainData"));
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ValidateRegistrationResult"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[36] = oper;

	}

	public WAPISoap_BindingStub() throws org.apache.axis.AxisFault {
		 this(null);
	}

	public WAPISoap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		 this(service);
		 super.cachedEndpoint = endpointURL;
	}

	public WAPISoap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
			java.lang.Class cls;
			javax.xml.namespace.QName qName;
			javax.xml.namespace.QName qName2;
			java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
			java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
			java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
			java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
			java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
			java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
			java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
			java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
			java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
			java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDNSRequest");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DNSRequest[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DNSRequest");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DNSRequest");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomain");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.Domain[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainBackOrder");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainBackOrder[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainBackOrder");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainBackOrder");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainByProxy");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainByProxy[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainByProxy");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainByProxy");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainData");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainData[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainData");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainData");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainRegistration");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainRegistration[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRegistration");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRegistration");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainRenewal");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainRenewal[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRenewal");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRenewal");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfDomainTransfer");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainTransfer[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainTransfer");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainTransfer");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfNS");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.NS[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NS");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NS");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfOrderItem");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.OrderItem[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfResourceRenewal");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.ResourceRenewal[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResourceRenewal");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResourceRenewal");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ArrayOfString");
			cachedSerQNames.add(qName);
			cls = java.lang.String[].class;
			cachedSerClasses.add(cls);
			qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
			qName2 = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "string");
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.ContactInfo.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Credential");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.Credential.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DNSRequest");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DNSRequest.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.Domain.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainAlert");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainAlert.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainBackOrder");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainBackOrder.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainByProxy");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainByProxy.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainContacts");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainContacts.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainData");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainData.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRegistration");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainRegistration.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRenewal");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainRenewal.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainTransfer");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.DomainTransfer.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GainingOwner");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.GainingOwner.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Nexus");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.Nexus.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NS");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.NS.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Order");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.Order.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.OrderItem.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResourceRenewal");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.ResourceRenewal.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Shopper");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.Shopper.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ShopperNoDBP");
			cachedSerQNames.add(qName);
			cls = com.aoindustries.domains.wwd.wapi.ShopperNoDBP.class;
			cachedSerClasses.add(cls);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName =
								(javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class)
								 cachedSerFactories.get(i);
							java.lang.Class df = (java.lang.Class)
								 cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
						else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
								 cachedSerFactories.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
								 cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		}
		catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	public java.lang.String processRequest(java.lang.String sRequestXML) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/ProcessRequest");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ProcessRequest"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sRequestXML});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String describe(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/Describe");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Describe"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String checkAvailability(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String[] sDomainArray, java.lang.String[] sHostArray, java.lang.String[] sNSArray) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/CheckAvailability");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "CheckAvailability"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sDomainArray, sHostArray, sNSArray});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String info(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sResourceID, java.lang.String sType, java.lang.String sDomain, java.lang.String sOrderID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/Info");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Info"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sResourceID, sType, sDomain, sOrderID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String nameGen(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sSLD, java.lang.String sTLD, java.lang.String sTLDs, org.apache.axis.types.UnsignedShort nRows, boolean bHypens, boolean bNumbers, org.apache.axis.types.UnsignedShort nMaxLen, boolean bIntelliSearch, org.apache.axis.types.UnsignedShort nPage, java.lang.String sTime) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/NameGen");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NameGen"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sSLD, sTLD, sTLDs, nRows, new java.lang.Boolean(bHypens), new java.lang.Boolean(bNumbers), nMaxLen, new java.lang.Boolean(bIntelliSearch), nPage, sTime});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String nameGenDB(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sKey, int nMaxResults, boolean bExcludeTaken, java.lang.String sTLDs, boolean bAddPrefix, boolean bAddSuffix, boolean bAddDashes, boolean bAddRelated, boolean bAdvancedSplit, boolean bBaseOnTop) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/NameGenDB");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NameGenDB"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sKey, new java.lang.Integer(nMaxResults), new java.lang.Boolean(bExcludeTaken), sTLDs, new java.lang.Boolean(bAddPrefix), new java.lang.Boolean(bAddSuffix), new java.lang.Boolean(bAddDashes), new java.lang.Boolean(bAddRelated), new java.lang.Boolean(bAdvancedSplit), new java.lang.Boolean(bBaseOnTop)});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String nameGenDBWithTimeLimit(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sKey, int nMaxResults, boolean bExcludeTaken, java.lang.String sTLDs, boolean bAddPrefix, boolean bAddSuffix, boolean bAddDashes, boolean bAddRelated, boolean bAdvancedSplit, boolean bBaseOnTop, int nMaxWaitSeconds) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/NameGenDBWithTimeLimit");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NameGenDBWithTimeLimit"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sKey, new java.lang.Integer(nMaxResults), new java.lang.Boolean(bExcludeTaken), sTLDs, new java.lang.Boolean(bAddPrefix), new java.lang.Boolean(bAddSuffix), new java.lang.Boolean(bAddDashes), new java.lang.Boolean(bAddRelated), new java.lang.Boolean(bAdvancedSplit), new java.lang.Boolean(bBaseOnTop), new java.lang.Integer(nMaxWaitSeconds)});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String poll(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sOp) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/Poll");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Poll"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sOp});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderCredits(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.OrderItem[] items, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderCredits");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderCredits"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderDomains(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainRegistration[] items, com.aoindustries.domains.wwd.wapi.DomainByProxy[] dbpItems, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderDomains");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomains"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, dbpItems, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderDomainRenewals(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainRenewal[] items, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderDomainRenewals");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainRenewals"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderPrivateDomainRenewals(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainRenewal[] items, com.aoindustries.domains.wwd.wapi.ResourceRenewal[] dbpItems, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderPrivateDomainRenewals");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderPrivateDomainRenewals"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, dbpItems, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderDomainTransfers(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainTransfer[] items, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderDomainTransfers");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainTransfers"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderDomainPrivacy(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainByProxy[] items, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderDomainPrivacy");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainPrivacy"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderResourceRenewals(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.ResourceRenewal[] items, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderResourceRenewals");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderResourceRenewals"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String orderDomainBackOrders(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainBackOrder[] items, java.lang.String sROID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/OrderDomainBackOrders");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderDomainBackOrders"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, shopper, items, sROID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String cancel(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sType, java.lang.String[] sIDArray) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/Cancel");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Cancel"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sType, sIDArray});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String updateDomainOwnership(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sResourceID, java.lang.String sLosingOwner, com.aoindustries.domains.wwd.wapi.GainingOwner gaining) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/UpdateDomainOwnership");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainOwnership"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sResourceID, sLosingOwner, gaining});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String resetPassword(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, java.lang.String sPwd, java.lang.String sEmail, java.lang.String sPwdHint) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/ResetPassword");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResetPassword"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sUser, sPwd, sEmail, sPwdHint});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String setShopperInfo(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, java.lang.String sEmail, java.lang.String sFirstName, java.lang.String sLastName, java.lang.String sPhone, java.lang.String sFax, java.lang.String sCompany, java.lang.String sAddress, java.lang.String sCity, java.lang.String sState, java.lang.String sZip, java.lang.String sCountry, java.lang.String sShopperPin) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/SetShopperInfo");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "SetShopperInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sUser, sEmail, sFirstName, sLastName, sPhone, sFax, sCompany, sAddress, sCity, sState, sZip, sCountry, sShopperPin});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String createNewShopper(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sPwd, java.lang.String sEmail, java.lang.String sFirstName, java.lang.String sLastName, java.lang.String sPhone, java.lang.String sPwdHint, java.lang.String sFax, java.lang.String sCompany, java.lang.String sAddress, java.lang.String sCity, java.lang.String sState, java.lang.String sZip, java.lang.String sCountry, java.lang.String sShopperPin) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[20]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/CreateNewShopper");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "CreateNewShopper"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sPwd, sEmail, sFirstName, sLastName, sPhone, sPwdHint, sFax, sCompany, sAddress, sCity, sState, sZip, sCountry, sShopperPin});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String checkUser(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sType, java.lang.String sUser, java.lang.String sPwd) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[21]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/CheckUser");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "CheckUser"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sType, sUser, sPwd});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String setupDomainAlert(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DomainAlert domainAlert, com.aoindustries.domains.wwd.wapi.ContactInfo registrant) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[22]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/SetupDomainAlert");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "SetupDomainAlert"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainAlert, registrant});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String updateDomainAlert(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DomainAlert domainAlert, java.lang.String sDomainMonitorID, com.aoindustries.domains.wwd.wapi.ContactInfo registrant) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[23]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/UpdateDomainAlert");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainAlert"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainAlert, sDomainMonitorID, registrant});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String removeDomainAlert(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sDomainMonitorID, java.lang.String sUser) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[24]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/RemoveDomainAlert");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "RemoveDomainAlert"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sDomainMonitorID, sUser});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String getDomainAlertCredits(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[25]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/GetDomainAlertCredits");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GetDomainAlertCredits"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sUser});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String getMonitoredDomainList(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, int nPage, int nRowsPerPage) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[26]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/GetMonitoredDomainList");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GetMonitoredDomainList"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sUser, new java.lang.Integer(nPage), new java.lang.Integer(nRowsPerPage)});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String getExpiringNameList(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, int nLength, java.lang.String sDashes, java.lang.String sNumbers, java.lang.String sWildCardSearch, java.lang.String sSearchCriteria, java.lang.String sTLDs, int nPage, int nRowsPerPage) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[27]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/GetExpiringNameList");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GetExpiringNameList"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sUser, new java.lang.Integer(nLength), sDashes, sNumbers, sWildCardSearch, sSearchCriteria, sTLDs, new java.lang.Integer(nPage), new java.lang.Integer(nRowsPerPage)});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String domainForwarding(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, int nDomainID, java.lang.String sForwardingURL, java.lang.String sMngTRID) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[28]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/DomainForwarding");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainForwarding"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, sUser, new java.lang.Integer(nDomainID), sForwardingURL, sMngTRID});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String updateNameServer(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, com.aoindustries.domains.wwd.wapi.NS[] nsArray) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[29]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/UpdateNameServer");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateNameServer"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainArray, nsArray});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String updateDomainContact(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, com.aoindustries.domains.wwd.wapi.ContactInfo registrant, com.aoindustries.domains.wwd.wapi.ContactInfo admin, com.aoindustries.domains.wwd.wapi.ContactInfo billing, com.aoindustries.domains.wwd.wapi.ContactInfo tech) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[30]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/UpdateDomainContact");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainContact"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainArray, registrant, admin, billing, tech});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String setDomainLocking(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sLock) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[31]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/SetDomainLocking");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "SetDomainLocking"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainArray, sLock});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String manageTransfer(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sAction) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[32]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/ManageTransfer");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ManageTransfer"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainArray, sAction});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String updateDomainForwarding(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sAction, java.lang.String sForwardingURL) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[33]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/UpdateDomainForwarding");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainForwarding"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainArray, sAction, sForwardingURL});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String updateDomainMasking(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sAction, java.lang.String sForwardingURL, java.lang.String sMaskingMetatagTitle, java.lang.String sMaskingMetatagDesc, java.lang.String sMaskingMetatagKeyword) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[34]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/UpdateDomainMasking");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "UpdateDomainMasking"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainArray, sAction, sForwardingURL, sMaskingMetatagTitle, sMaskingMetatagDesc, sMaskingMetatagKeyword});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String modifyDNS(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DNSRequest[] dnsRequestArray, java.lang.String sDomain) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[35]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/ModifyDNS");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ModifyDNS"));

		setRequestHeaders(_call);
		setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, dnsRequestArray, sDomain});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (java.lang.String) _resp;
			} catch (java.lang.Exception _exception) {
				return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
			}
		}
} catch (org.apache.axis.AxisFault axisFaultException) {
	throw axisFaultException;
}
	}

	public java.lang.String validateRegistration(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DomainContacts domainContacts, com.aoindustries.domains.wwd.wapi.DomainData[] domainDataArray) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[36]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://wildwestdomains.com/webservices/ValidateRegistration");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ValidateRegistration"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCLTRID, credential, domainContacts, domainDataArray});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)_resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
