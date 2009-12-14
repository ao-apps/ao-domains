package com.aoindustries.domains;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */

/**
 * @author  AO Industries, Inc.
 */
public enum Tld {
    // General
    COM(TldCategory.GENERAL),
    NET(TldCategory.GENERAL),
    ORG(TldCategory.GENERAL),
    INFO(TldCategory.GENERAL),
    BIZ(TldCategory.GENERAL),
    JOBS(TldCategory.GENERAL),
    ME(TldCategory.GENERAL),
    MOBI(TldCategory.GENERAL),
    // All Others
    AG(TldCategory.AMERICAS),
    COM_AG(TldCategory.AMERICAS),
    NET_AG(TldCategory.AMERICAS),
    ORG_AG(TldCategory.AMERICAS),
    AM(TldCategory.EUROPE),
    ASIA(TldCategory.ASIA),
    AT(TldCategory.EUROPE),
    BE(TldCategory.EUROPE),
    BZ(TldCategory.AMERICAS),
    COM_BZ(TldCategory.AMERICAS),
    NET_BZ(TldCategory.AMERICAS),
    CA(TldCategory.AMERICAS),
    CC(TldCategory.ASIA),
    CN(TldCategory.ASIA),
    COM_CN(TldCategory.ASIA),
    NET_CN(TldCategory.ASIA),
    ORG_CN(TldCategory.ASIA),
    DE(TldCategory.EUROPE),
    ES(TldCategory.EUROPE),
    // Failed checkAvailable call: COM_ES,
    // Failed checkAvailable call: NOM_ES,
    // Failed checkAvailable call: ORG_ES,
    EU(TldCategory.EUROPE),
    FM(TldCategory.ASIA),
    GS(TldCategory.AMERICAS),
    IN(TldCategory.ASIA),
    CO_IN(TldCategory.ASIA),
    FIRM_IN(TldCategory.ASIA),
    GEN_IN(TldCategory.ASIA),
    IND_IN(TldCategory.ASIA),
    NET_IN(TldCategory.ASIA),
    ORG_IN(TldCategory.ASIA),
    IT(TldCategory.EUROPE),
    JP(TldCategory.ASIA),
    MS(TldCategory.AMERICAS),
    // Failed checkAvailable call: MX(TldCategory.AMERICAS),
    COM_MX(TldCategory.AMERICAS),
    NL(TldCategory.EUROPE),
    NU(TldCategory.ASIA),
    CO_NZ(TldCategory.ASIA),
    NET_NZ(TldCategory.ASIA),
    ORG_NZ(TldCategory.ASIA),
    TC(TldCategory.AMERICAS),
    TK(TldCategory.ASIA),
    TV(TldCategory.ASIA),
    TW(TldCategory.ASIA),
    COM_TW(TldCategory.ASIA),
    IDV_TW(TldCategory.ASIA),
    ORG_TW(TldCategory.ASIA),
    CO_UK(TldCategory.EUROPE),
    ME_UK(TldCategory.EUROPE),
    ORG_UK(TldCategory.EUROPE),
    US(TldCategory.AMERICAS),
    VG(TldCategory.AMERICAS),
    WS(TldCategory.ASIA);

    private final TldCategory category;
    private final String domain;

    private Tld(TldCategory category) {
        this.category = category;
        this.domain = name().replace('_', '.');
    }

    public TldCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return domain;
    }
}
