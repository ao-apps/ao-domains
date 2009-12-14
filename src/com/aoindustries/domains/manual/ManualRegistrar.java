package com.aoindustries.domains.manual;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.domains.Domain;
import com.aoindustries.domains.DomainRegistrar;
import com.aoindustries.domains.TLD;
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

    private final String providerId;

    public ManualRegistrar(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderId() {
        return providerId;
    }

    private static final Set<TLD> registerTlds = Collections.unmodifiableSet(
        EnumSet.of(
            TLD.COM,
            TLD.NET,
            TLD.ORG,
            TLD.BIZ,
            TLD.INFO,
            TLD.JOBS,
            TLD.MOBI,
            //
            TLD.AG,
            TLD.COM_AG,
            TLD.NET_AG,
            TLD.ORG_AG,
            TLD.AM,
            TLD.ASIA,
            TLD.AT,
            TLD.BE,
            TLD.BZ,
            TLD.COM_BZ,
            TLD.NET_BZ,
            TLD.CA,
            TLD.CC,
            TLD.CN,
            TLD.COM_CN,
            TLD.NET_CN,
            TLD.ORG_CN,
            TLD.DE,
            TLD.ES,
            TLD.COM_ES,
            TLD.NOM_ES,
            TLD.ORG_ES,
            TLD.EU,
            TLD.FM,
            TLD.GS,
            TLD.IN,
            TLD.CO_IN,
            TLD.FIRM_IN,
            TLD.GEN_IN,
            TLD.IND_IN,
            TLD.NET_IN,
            TLD.ORG_IN,
            TLD.IT,
            TLD.JP,
            TLD.ME,
            TLD.MS,
            TLD.MX,
            TLD.COM_MX,
            TLD.NL,
            TLD.NU,
            TLD.CO_NZ,
            TLD.NET_NZ,
            TLD.ORG_NZ,
            TLD.TC,
            TLD.TK,
            TLD.TV,
            TLD.TW,
            TLD.COM_TW,
            TLD.IDV_TW,
            TLD.ORG_TW,
            TLD.CO_UK,
            TLD.ME_UK,
            TLD.ORG_UK,
            TLD.US,
            TLD.VG,
            TLD.WS
        )
    );

    public Set<TLD> getRegisterTlds() {
        return registerTlds;
    }

    private static final Set<TLD> transferTlds = Collections.unmodifiableSet(
        EnumSet.of(
            TLD.COM,
            TLD.INFO,
            TLD.NET,
            TLD.ME,
            TLD.BIZ,
            TLD.IT,
            TLD.ORG,
            TLD.MOBI,
            TLD.COM_ES,
            //TLD.MX,
            TLD.WS,
            TLD.NOM_ES,
            TLD.US,
            TLD.ES,
            TLD.ORG_ES,
            //TLD.NL,
            TLD.IN,
            TLD.COM_MX,
            TLD.BZ,
            TLD.COM_BZ,
            TLD.NET_BZ,
            TLD.CO_IN,
            TLD.FIRM_IN,
            TLD.GEN_IN,
            TLD.IND_IN,
            TLD.NET_IN,
            TLD.ORG_IN,
            TLD.TV,
            // Below here manual only
            TLD.CA,
            TLD.ASIA,
            TLD.CC,
            TLD.EU
        )
    );

    public Set<TLD> getTransferTlds() {
        return transferTlds;
    }

    public Map<Domain,Boolean> checkAvailability(Set<Domain> domains) throws IOException {
        // TODO
        throw new RuntimeException("TODO: Implement method");
    }
}
