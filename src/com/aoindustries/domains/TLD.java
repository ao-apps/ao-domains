package com.aoindustries.domains;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */

/**
 * @author  AO Industries, Inc.
 */
public enum TLD {
    COM("com"),
    NET("net"),
    ORG("org"),
    BIZ("biz"),
    INFO("info"),
    JOBS("jobs"),
    MOBI("mobi"),
    //
    AG("ag"),
    COM_AG("com.ag"),
    NET_AG("net.ag"),
    ORG_AG("org.ag"),
    AM("am"),
    ASIA("asia"),
    AT("at"),
    BE("be"),
    BZ("bz"),
    COM_BZ("com.bz"),
    NET_BZ("net.bz"),
    CA("ca"),
    CC("cc"),
    CN("cn"),
    COM_CN("com.cn"),
    NET_CN("net.cn"),
    ORG_CN("org.cn"),
    DE("de"),
    ES("es"),
    COM_ES("com.es"),
    NOM_ES("nom.es"),
    ORG_ES("org.es"),
    EU("eu"),
    FM("fm"),
    GS("gs"),
    IN("in"),
    CO_IN("co.in"),
    FIRM_IN("firm.in"),
    GEN_IN("gen.in"),
    IND_IN("ind.in"),
    NET_IN("net.in"),
    ORG_IN("org.in"),
    IT("it"),
    JP("jp"),
    ME("me"),
    MS("ms"),
    MX("mx"),
    COM_MX("com.mx"),
    NL("nl"),
    NU("nu"),
    CO_NZ("co.nz"),
    NET_NZ("net.nz"),
    ORG_NZ("org.nz"),
    TC("tc"),
    TK("tk"),
    TV("tv"),
    TW("tw"),
    COM_TW("com.tw"),
    IDV_TW("idv.tw"),
    ORG_TW("org.tw"),
    CO_UK("co.uk"),
    ME_UK("me.uk"),
    ORG_UK("org.uk"),
    US("us"),
    VG("vg"),
    WS("ws");

    private final String domain;

    private TLD(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return domain;
    }
}
