package com.aoindustries.domains;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.util.i18n.Money;
import java.io.IOException;
import java.util.Currency;
import java.util.Map;
import java.util.Set;

/**
 * @author  AO Industries, Inc.
 */
public interface DomainRegistrar {

    /**
     * Gets the unique identifier for this provider.  The persistence layer may enforce unique
     * IDs per each provider.  Also, each action on a domain must be performed by the same
     * provider.  The identifier is compared to test this equality.
     */
    String getProviderId();

    /**
     * Gets the set of top level domains supported by this provider.
     */
    Set<Tld> getRegisterTlds() throws IOException;

    /**
     * Gets the set of top level domains supported by this provider.
     */
    Set<Tld> getTransferTlds() throws IOException;

    /**
     * Checks the availability of the provided domains.
     */
    Map<Domain,Boolean> checkAvailability(Set<Domain> domains) throws IOException;

    /**
     * Gets the cost per year to register a domain in the given top level domain.
     */
    Money getRegisterCost(Currency currency, Tld tld, int numYears) throws IOException;
}
