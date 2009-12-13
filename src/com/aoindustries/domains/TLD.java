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
    INFO("info"),
    NET("net"),
    ME("me"),
    BIZ("biz"),
    IT("it"),
    ORG("org"),
    MOBI("mobi"),
    COM_ES("com.es"),
    MX("mx"),
    WS("ws"),
    NOM_ES("nom.es"),
    US("us"),
    ES("es"),
    ORG_ES("org.es"),
    NL("nl"),
    IN("in"),
    COM_MX("com.mx"),
    BZ("bz"),
    COM_BZ("com.bz"),
    NET_BZ("net.bz"),
    CO_IN("co.in"),
    FIRM_IN("firm.in"),
    GEN_IN("gen.in"),
    IND_IN("ind.in"),
    NET_IN("net.in"),
    ORG_IN("org.in"),
    TV("tv");

    private final String domain;

    private TLD(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return domain;
    }
}
