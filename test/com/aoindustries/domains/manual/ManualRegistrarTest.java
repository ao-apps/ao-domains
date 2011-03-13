package com.aoindustries.domains.manual;
/*
 * Copyright 2009-2011 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.domains.DomainRegistrar;
import com.aoindustries.domains.DomainRegistrarParent;
import com.aoindustries.domains.wwd.WildWestDomains;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author  AO Industries, Inc.
 */
public class ManualRegistrarTest extends DomainRegistrarParent {
    
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

    public ManualRegistrarTest(String testName) {
        super(testName);
    }

    public DomainRegistrar getDomainRegistrar() throws Exception {
        return new ManualRegistrar("ManualRegistrarTest", WildWestDomains.PRODUCTION_PORT_ADDRESS, getConfig("account"), getConfig("password"));
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ManualRegistrarTest.class);
        return suite;
    }
}
