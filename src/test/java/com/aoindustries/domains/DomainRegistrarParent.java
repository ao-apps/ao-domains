package com.aoindustries.domains;
/*
 * Copyright 2009-2011, 2021 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import java.util.Currency;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import junit.framework.TestCase;

/**
 * Tests domain registrars.
 *
 * @author  AO Industries, Inc.
 */
public abstract class DomainRegistrarParent extends TestCase {

    public abstract DomainRegistrar getDomainRegistrar() throws Exception;

    private DomainRegistrar registrar;

    protected DomainRegistrarParent(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        registrar = getDomainRegistrar();
    }

    @Override
    protected void tearDown() throws Exception {
        registrar = null;
    }

    public void testGetRegisterCost() throws Exception {
        Currency USD = Currency.getInstance("USD");
        for(Tld tld : registrar.getRegisterTlds()) {
            System.out.println("tld="+tld);
            for(int numYears=tld.getMinRegistrationYears(), maxYears=tld.getMaxRegistrationYears(); numYears<=maxYears; numYears++) {
                System.out.println("    "+numYears+": "+registrar.getRegisterCost(USD, tld, numYears));
            }
        }
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
    public void testCheckUnavailability() throws Exception {
        Map<Tld, Domain> domains = new EnumMap<>(Tld.class);
        for(Tld tld : registrar.getRegisterTlds()) {
            String existingSld = existingSlds.get(tld);
            assertNotNull("Please add to existingSlds: "+tld, existingSld);
            domains.put(tld, new Domain(existingSld, tld));
        }
        Map<Domain, Boolean> results = registrar.checkAvailability(new HashSet<Domain>(domains.values()));
        for(Tld tld : registrar.getRegisterTlds()) {
            Domain domain = domains.get(tld);
            Boolean avail = results.get(domain);
            assertNotNull("Domain has no response: "+domain, avail);
            System.out.print(domain);
            System.out.println(avail ? ": Available" : ": Unavailable");
            System.out.flush();
            assertFalse("Domain is available: "+domain, avail);
        }
    }

    public void testCheckAvailability() throws Exception {
        Map<Tld, Domain> domains = new EnumMap<>(Tld.class);
        for(Tld tld : registrar.getRegisterTlds()) {
            domains.put(tld, new Domain("ao1234test5678", tld));
        }
        Map<Domain, Boolean> results = registrar.checkAvailability(new HashSet<Domain>(domains.values()));
        for(Tld tld : registrar.getRegisterTlds()) {
            Domain domain = domains.get(tld);
            Boolean avail = results.get(domain);
            assertNotNull("Domain has no response: "+domain, avail);
            System.out.print(domain);
            System.out.println(avail ? ": Available" : ": Unavailable");
            System.out.flush();
            assertTrue("Domain is unavailable: "+domain, avail);
        }
    }
}
