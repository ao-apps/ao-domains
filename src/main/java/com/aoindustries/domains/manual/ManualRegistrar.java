/*
 * Copyright 2009-2011, 2021, 2022 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */

package com.aoindustries.domains.manual;

import com.aoapps.lang.i18n.Money;
import com.aoindustries.domains.Domain;
import com.aoindustries.domains.DomainRegistrar;
import com.aoindustries.domains.Tld;
import com.aoindustries.domains.wwd.WildWestDomains;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Currency;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * Provider for domains that must be registered manually.
 *
 * @author  AO Industries, Inc.
 */
public class ManualRegistrar implements DomainRegistrar {

  private final WildWestDomains wwd;

  public ManualRegistrar(String providerId, String portAddress, String account, String password) {
    this.wwd = new WildWestDomains(providerId, portAddress, account, password);
  }

  @Override
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
      // TLD.COM_ES,
      // TLD.NOM_ES,
      // TLD.ORG_ES,
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
      // Tld.MX,
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

  @Override
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
      // TLD.COM_ES,
      // TLD.MX,
      Tld.WS,
      // TLD.NOM_ES,
      Tld.US,
      Tld.ES,
      // TLD.ORG_ES,
      // TLD.NL,
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

  @Override
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

  @Override
  public Map<Domain, Boolean> checkAvailability(Set<Domain> domains) throws IOException {
    return wwd.checkAvailability(domains);
  }

  private static final Currency USD = Currency.getInstance("USD");

  @Override
  public Money getRegisterCost(Currency currency, Tld tld, int numYears) throws IOException {
    // Then manual values
    int minYears = tld.getMinRegistrationYears();
    if (numYears<minYears) {
      throw new IllegalArgumentException("numYears<minYears: "+numYears+"<"+minYears);
    }
    int maxYears = tld.getMaxRegistrationYears();
    if (numYears>maxYears) {
      throw new IllegalArgumentException("numYears>maxYears: "+numYears+">"+maxYears);
    }
    if (currency == USD) {
      // Prices last set on 2009-12-14
      switch (tld) {
        case NET:
        case ORG:
        case US:
        case CO_UK:
        case ME_UK:
        case ORG_UK:
          return new Money(USD, new BigDecimal("9.99"));
        case COM:
        case INFO:
          return new Money(USD, new BigDecimal("10.69"));
        case CA:
          return new Money(USD, new BigDecimal("12.99"));
        case MOBI:
        case BIZ:
        case WS:
        case ES:
        case EU:
        case IN:
        case CO_IN:
        case FIRM_IN:
        case GEN_IN:
        case IND_IN:
        case NET_IN:
        case ORG_IN:
        case NL:
        case IT:
          return new Money(USD, new BigDecimal("14.99"));
        case BE:
          return new Money(USD, new BigDecimal("17.49"));
        case DE:
          return new Money(USD, new BigDecimal("17.99"));
        case ME:
        case ASIA:
        case COM_MX:
        case CC:
        case TK:
          return new Money(USD, new BigDecimal("19.99"));
        case BZ:
          return new Money(USD, new BigDecimal("24.99"));
        case CN:
        case COM_CN:
        case NET_CN:
        case ORG_CN:
        case NU:
          return new Money(USD, new BigDecimal("29.99"));
        case GS:
        case TC:
          return new Money(USD, new BigDecimal("34.99"));
        case MS:
        case TV:
        case TW:
        case COM_TW:
        case ORG_TW:
        case IDV_TW:
        case VG:
          return new Money(USD, new BigDecimal("39.99"));
        // case MX:
        case COM_BZ:
        case NET_BZ:
          return new Money(USD, new BigDecimal("49.99"));
        case CO_NZ:
        case NET_NZ:
        case ORG_NZ:
          return new Money(USD, new BigDecimal("59.49"));
        case AT:
          return new Money(USD, new BigDecimal("59.99"));
        case COM_AG:
        case NET_AG:
        case ORG_AG:
        case FM:
          return new Money(USD, new BigDecimal("69.99"));
        case AM:
          return new Money(USD, new BigDecimal("74.99"));
        case AG:
          return new Money(USD, new BigDecimal("94.99"));
        case JP:
          return new Money(USD, new BigDecimal("99.99"));
        case JOBS:
          return new Money(USD, new BigDecimal("119.99"));
        default:
          throw new IOException("Registration cost not known: currency="+currency+", tld="+tld);
      }
    } else {
      throw new IllegalArgumentException("Unsupported currency: "+currency);
    }
  }
}
