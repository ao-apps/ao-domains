package com.aoindustries.domains.wwd;
/*
 * Copyright 2009-2010 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.domains.DomainRegistrar;
import com.aoindustries.domains.DomainRegistrarParent;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author  AO Industries, Inc.
 */
public class WildWestDomainsTest extends DomainRegistrarParent {
    
    private static Properties config;
    synchronized private static String getConfig(String name) throws IOException {
        if(config==null) {
            InputStream in = WildWestDomainsTest.class.getResourceAsStream("WildWestDomainsTest.properties");
            if(in==null) throw new IOException("Unable to find resource: WildWestDomainsTest.properties");
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

    public WildWestDomainsTest(String testName) {
        super(testName);
    }

    public DomainRegistrar getDomainRegistrar() throws Exception {
        return new WildWestDomains("WildWestDomainsTest", WildWestDomains.PRODUCTION_PORT_ADDRESS, getConfig("account"), getConfig("password"));
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(WildWestDomainsTest.class);
        return suite;
    }
}
