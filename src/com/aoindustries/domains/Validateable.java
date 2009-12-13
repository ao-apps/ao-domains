package com.aoindustries.domains;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author  AO Industries, Inc.
 */
public interface Validateable {

    /**
     * Validates the properties of this object.  Returns an empty map when there are no problems.
     */
    Map<String,List<String>> validate(Locale userLocale);
}
