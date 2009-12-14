package com.aoindustries.domains.manual;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.domains.Domain;
import com.aoindustries.domains.DomainRegistrar;
import com.aoindustries.domains.Tld;
import com.aoindustries.domains.wwd.WildWestDomains;
import java.io.IOException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Provider for domains that must be registered manually.
 *
 * @author  AO Industries, Inc.
 */
public class ManualRegistrar implements DomainRegistrar {

    private static final Logger logger = Logger.getLogger(ManualRegistrar.class.getName());

    private final WildWestDomains wwd;

    public ManualRegistrar(String providerId, String portAddress, String account, String password) {
        this.wwd = new WildWestDomains(providerId, portAddress, account, password);
    }

    public String getProviderId() {
        return wwd.getProviderId();
    }

    private static final Set<Tld> registerTlds = Collections.unmodifiableSet(
        EnumSet.of(
            Tld.COM,
            Tld.NET,
            Tld.ORG,
            Tld.BIZ,
            Tld.INFO,
            Tld.JOBS,
            Tld.MOBI,
            //
            Tld.AG,
            Tld.COM_AG,
            Tld.NET_AG,
            Tld.ORG_AG,
            Tld.AM,
            Tld.ASIA,
            Tld.AT,
            Tld.BE,
            Tld.BZ,
            Tld.COM_BZ,
            Tld.NET_BZ,
            Tld.CA,
            Tld.CC,
            Tld.CN,
            Tld.COM_CN,
            Tld.NET_CN,
            Tld.ORG_CN,
            Tld.DE,
            Tld.ES,
            //TLD.COM_ES,
            //TLD.NOM_ES,
            //TLD.ORG_ES,
            Tld.EU,
            Tld.FM,
            Tld.GS,
            Tld.IN,
            Tld.CO_IN,
            Tld.FIRM_IN,
            Tld.GEN_IN,
            Tld.IND_IN,
            Tld.NET_IN,
            Tld.ORG_IN,
            Tld.IT,
            Tld.JP,
            Tld.ME,
            Tld.MS,
            //Tld.MX,
            Tld.COM_MX,
            Tld.NL,
            Tld.NU,
            Tld.CO_NZ,
            Tld.NET_NZ,
            Tld.ORG_NZ,
            Tld.TC,
            Tld.TK,
            Tld.TV,
            Tld.TW,
            Tld.COM_TW,
            Tld.IDV_TW,
            Tld.ORG_TW,
            Tld.CO_UK,
            Tld.ME_UK,
            Tld.ORG_UK,
            Tld.US,
            Tld.VG,
            Tld.WS
        )
    );

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
            Tld.IT,
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
            Tld.TV,
            // Below here manual only
            Tld.CA,
            Tld.ASIA,
            Tld.CC,
            Tld.EU
        )
    );

    public Set<Tld> getTransferTlds() {
        return transferTlds;
    }

    public String getPortAddress() {
        return wwd.getPortAddress();
    }

    public String getAccount() {
        return wwd.getAccount();
    }

    public String getPassword() {
        return wwd.getPassword();
    }

    public Map<Domain,Boolean> checkAvailability(Set<Domain> domains) throws IOException {
        return wwd.checkAvailability(domains);
    }
}
