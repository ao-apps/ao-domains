package com.aoindustries.domains.manual;
/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.domains.Domain;
import com.aoindustries.domains.Tld;
import com.aoindustries.domains.wwd.WildWestDomains;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests WWD web services for certification.
 *
 * @author  AO Industries, Inc.
 */
public class ManualRegistrarTest extends TestCase {
    
    private static Properties config;
    synchronized private static String getConfig(String name) throws IOException {
        if(config==null) {
            InputStream in = ManualRegistrarTest.class.getResourceAsStream("ManualRegistrarTest.properties");
            if(in==null) throw new IOException("Unable to find resource: ManualRegistrarTest.properties");
            try {
                Properties props = new Properties();
                props.load(in);
                config = props;
            } finally {
                in.close();
            }
        }
        return config.getProperty(name);
    }

    private ManualRegistrar registrar;

    public ManualRegistrarTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        registrar = new ManualRegistrar("ManualRegistrarTest", WildWestDomains.PRODUCTION_PORT_ADDRESS, getConfig("account"), getConfig("password"));
    }

    @Override
    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ManualRegistrarTest.class);
        return suite;
    }

    private static final Map<Tld, String> existingSlds = new HashMap<Tld, String>();
    static {
        existingSlds.put(Tld.COM, "aoindustries");
        existingSlds.put(Tld.NET, "aointernet");
        existingSlds.put(Tld.ORG, "best");
        existingSlds.put(Tld.BIZ, "best");
        existingSlds.put(Tld.INFO, "best");
        existingSlds.put(Tld.JOBS, "best");
        existingSlds.put(Tld.MOBI, "best");
        //
        existingSlds.put(Tld.AG, "best");
        existingSlds.put(Tld.COM_AG, "google");
        existingSlds.put(Tld.NET_AG, "google");
        existingSlds.put(Tld.ORG_AG, "google");
        existingSlds.put(Tld.AM, "best");
        existingSlds.put(Tld.ASIA, "best");
        existingSlds.put(Tld.AT, "best");
        existingSlds.put(Tld.BE, "best");
        existingSlds.put(Tld.BZ, "best");
        existingSlds.put(Tld.COM_BZ, "best");
        existingSlds.put(Tld.NET_BZ, "google");
        existingSlds.put(Tld.CA, "best");
        existingSlds.put(Tld.CC, "best");
        existingSlds.put(Tld.CN, "best");
        existingSlds.put(Tld.COM_CN, "best");
        existingSlds.put(Tld.NET_CN, "best");
        existingSlds.put(Tld.ORG_CN, "best");
        existingSlds.put(Tld.DE, "best");
        existingSlds.put(Tld.ES, "best");
        //TLD.COM_ES,
        //TLD.NOM_ES,
        //TLD.ORG_ES,
        existingSlds.put(Tld.EU, "best");
        existingSlds.put(Tld.FM, "best");
        existingSlds.put(Tld.GS, "best");
        existingSlds.put(Tld.IN, "best");
        existingSlds.put(Tld.CO_IN, "best");
        existingSlds.put(Tld.FIRM_IN, "google");
        existingSlds.put(Tld.GEN_IN, "best");
        existingSlds.put(Tld.IND_IN, "best");
        existingSlds.put(Tld.NET_IN, "google");
        existingSlds.put(Tld.ORG_IN, "best");
        existingSlds.put(Tld.IT, "best");
        existingSlds.put(Tld.JP, "best");
        existingSlds.put(Tld.ME, "best");
        existingSlds.put(Tld.MS, "best");
        //existingSlds.put(Tld.MX, "best");
        existingSlds.put(Tld.COM_MX, "best");
        existingSlds.put(Tld.NL, "best");
        existingSlds.put(Tld.NU, "best");
        existingSlds.put(Tld.CO_NZ, "best");
        existingSlds.put(Tld.NET_NZ, "best");
        existingSlds.put(Tld.ORG_NZ, "google");
        existingSlds.put(Tld.TC, "best");
        existingSlds.put(Tld.TK, "best");
        existingSlds.put(Tld.TV, "best");
        existingSlds.put(Tld.TW, "best");
        existingSlds.put(Tld.COM_TW, "best");
        existingSlds.put(Tld.IDV_TW, "best");
        existingSlds.put(Tld.ORG_TW, "best");
        existingSlds.put(Tld.CO_UK, "best");
        existingSlds.put(Tld.ME_UK, "best");
        existingSlds.put(Tld.ORG_UK, "best");
        existingSlds.put(Tld.US, "best");
        existingSlds.put(Tld.VG, "best");
        existingSlds.put(Tld.WS, "best");
    }
    public void testCheckAvailability() throws Exception {
        for(Tld tld : registrar.getRegisterTlds()) {
            String existingSld = existingSlds.get(tld);
            assertNotNull("Please add to existingSlds: "+tld, existingSld);
            Domain domain = new Domain(existingSld, tld);
            System.out.println(domain+":");
            System.out.flush();
            Map<Domain,Boolean> results = registrar.checkAvailability(Collections.singleton(domain));
            Boolean avail = results.get(domain);
            assertNotNull("Domain has no response: "+domain, avail);
            System.out.println(avail ? "    Available" : "    Unavailable");
            System.out.flush();
            assertFalse("Domain is available: "+domain, avail);
        }
        for(Tld tld : registrar.getRegisterTlds()) {
            Domain domain = new Domain("ao1234test5678", tld);
            System.out.println(domain+":");
            System.out.flush();
            Map<Domain,Boolean> results = registrar.checkAvailability(Collections.singleton(domain));
            Boolean avail = results.get(domain);
            assertNotNull("Domain has no response: "+domain, avail);
            System.out.println(avail ? "    Available" : "    Unavailable");
            System.out.flush();
            assertTrue("Domain is not available: "+domain, avail);
        }
    }
}
