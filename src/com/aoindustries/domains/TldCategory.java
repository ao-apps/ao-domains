/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.domains;

/**
 * @author  AO Industries, Inc.
 */
public enum TldCategory {
    GENERAL,
    AMERICAS,
    EUROPE,
    ASIA;

    @Override
    public String toString() {
        return ApplicationResources.getMessage("TldCategory."+name()+".toString");
    }
}
