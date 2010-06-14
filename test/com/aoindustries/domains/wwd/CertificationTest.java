package com.aoindustries.domains.wwd;
/*
 * Copyright 2009-2010 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests WWD web services for certification.
 *
 * @author  AO Industries, Inc.
 */
public class CertificationTest extends TestCase {
    
    private static Properties config;
    synchronized private static String getConfig(String name) throws IOException {
        if(config==null) {
            InputStream in = CertificationTest.class.getResourceAsStream("CertificationTest.properties");
            if(in==null) throw new IOException("Unable to find resource: CertificationTest.properties");
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

    private WildWestDomains registrar;

    public CertificationTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        registrar = new WildWestDomains("CertificationTest", WildWestDomains.OTE_PORT_ADDRESS, getConfig("account"), getConfig("password"));
    }

    @Override
    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CertificationTest.class);
        return suite;
    }

    public void testCertification() throws Exception {
        registrar.certify();
    }
}
