package com.aoindustries.domains;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
//import java.io.IOException;

/**
 * @author  AO Industries, Inc.
 */
public interface DomainsProvider {

    /**
     * Gets the unique identifier for this provider.  The persistence layer may enforce unique
     * IDs per each provider.  Also, each action on a domain must be performed by the same
     * provider.  The identifier is compared to test this equality.
     */
    String getProviderId();
}
