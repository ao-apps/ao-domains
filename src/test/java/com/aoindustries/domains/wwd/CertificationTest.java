/*
 * Copyright 2009-2011, 2021 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.domains.wwd;

import com.aoindustries.util.PropertiesUtils;
import java.io.IOException;
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
	private static synchronized String getConfig(String name) throws IOException {
		if(config==null) config = PropertiesUtils.loadFromResource(CertificationTest.class, "CertificationTest.properties");
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
		// Do nothing
	}

	public static Test suite() {
		TestSuite suite = new TestSuite(CertificationTest.class);
		return suite;
	}

	public void testCertification() throws Exception {
		registrar.certify();
	}
}
