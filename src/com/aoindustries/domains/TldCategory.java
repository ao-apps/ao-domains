package com.aoindustries.domains;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.util.i18n.LocalizedToString;
import java.util.Locale;

/**
 * @author  AO Industries, Inc.
 */
public enum TldCategory implements LocalizedToString {
    GENERAL,
    AMERICAS,
    EUROPE,
    ASIA;

    /**
     * Gets the display value in the default locale.
     */
    @Override
    public String toString() {
        return toString(Locale.getDefault());
    }

    /**
     * Gets the display value in the provided locale.
     */
    public String toString(Locale userLocale) {
        return ApplicationResources.getMessage(userLocale, "TldCategory."+name()+".toString");
    }
}
