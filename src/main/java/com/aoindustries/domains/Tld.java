package com.aoindustries.domains;

/*
 * Copyright 2009-2011, 2022 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */

/**
 * @author  AO Industries, Inc.
 */
public enum Tld {
  // General
  COM(TldCategory.GENERAL, 1, 10),
  NET(TldCategory.GENERAL, 1, 10),
  ORG(TldCategory.GENERAL, 1, 10),
  INFO(TldCategory.GENERAL, 1, 10),
  BIZ(TldCategory.GENERAL, 1, 10),
  JOBS(TldCategory.GENERAL, 1, 10),
  ME(TldCategory.GENERAL, 1, 10),
  MOBI(TldCategory.GENERAL, 1, 10),
  // All Others
  AG(TldCategory.AMERICAS, 1, 10),
  COM_AG(TldCategory.AMERICAS, 1, 10),
  NET_AG(TldCategory.AMERICAS, 1, 10),
  ORG_AG(TldCategory.AMERICAS, 1, 10),
  AM(TldCategory.EUROPE, 1, 1),
  ASIA(TldCategory.ASIA, 1, 10),
  AT(TldCategory.EUROPE, 1, 1),
  BE(TldCategory.EUROPE, 1, 1),
  BZ(TldCategory.AMERICAS, 1, 10),
  COM_BZ(TldCategory.AMERICAS, 1, 10),
  NET_BZ(TldCategory.AMERICAS, 1, 10),
  CA(TldCategory.AMERICAS, 1, 10),
  CC(TldCategory.ASIA, 1, 10),
  CN(TldCategory.ASIA, 1, 5),
  COM_CN(TldCategory.ASIA, 1, 5),
  NET_CN(TldCategory.ASIA, 1, 5),
  ORG_CN(TldCategory.ASIA, 1, 5),
  DE(TldCategory.EUROPE, 1, 1),
  ES(TldCategory.EUROPE, 1, 5),
  // Failed checkAvailable call: COM_ES,
  // Failed checkAvailable call: NOM_ES,
  // Failed checkAvailable call: ORG_ES,
  EU(TldCategory.EUROPE, 1, 1),
  FM(TldCategory.ASIA, 1, 1),
  GS(TldCategory.AMERICAS, 1, 1),
  IN(TldCategory.ASIA, 1, 10),
  CO_IN(TldCategory.ASIA, 1, 10),
  FIRM_IN(TldCategory.ASIA, 1, 10),
  GEN_IN(TldCategory.ASIA, 1, 10),
  IND_IN(TldCategory.ASIA, 1, 10),
  NET_IN(TldCategory.ASIA, 1, 10),
  ORG_IN(TldCategory.ASIA, 1, 10),
  IT(TldCategory.EUROPE, 1, 1),
  JP(TldCategory.ASIA, 1, 1),
  MS(TldCategory.AMERICAS, 1, 1),
  // Failed checkAvailable call: MX(TldCategory.AMERICAS, 1, 5),
  COM_MX(TldCategory.AMERICAS, 1, 5),
  NL(TldCategory.EUROPE, 1, 1),
  NU(TldCategory.ASIA, 1, 1),
  CO_NZ(TldCategory.ASIA, 1, 1),
  NET_NZ(TldCategory.ASIA, 1, 1),
  ORG_NZ(TldCategory.ASIA, 1, 1),
  TC(TldCategory.AMERICAS, 1, 1),
  TK(TldCategory.ASIA, 2, 2),
  TV(TldCategory.ASIA, 1, 10),
  TW(TldCategory.ASIA, 1, 10),
  COM_TW(TldCategory.ASIA, 1, 10),
  IDV_TW(TldCategory.ASIA, 1, 10),
  ORG_TW(TldCategory.ASIA, 1, 10),
  CO_UK(TldCategory.EUROPE, 2, 2),
  ME_UK(TldCategory.EUROPE, 2, 2),
  ORG_UK(TldCategory.EUROPE, 2, 2),
  US(TldCategory.AMERICAS, 1, 10),
  VG(TldCategory.AMERICAS, 1, 1),
  WS(TldCategory.ASIA, 1, 10);

  private final TldCategory category;
  private final String domain;
  private final int minRegistrationYears;
  private final int maxRegistrationYears;

  private Tld(TldCategory category, int minRegistrationYears, int maxRegistrationYears) {
    assert minRegistrationYears <= maxRegistrationYears;
    this.category = category;
    this.domain = name().replace('_', '.');
    this.minRegistrationYears = minRegistrationYears;
    this.maxRegistrationYears = maxRegistrationYears;
  }

  public TldCategory getCategory() {
    return category;
  }

  public int getMinRegistrationYears() {
    return minRegistrationYears;
  }

  public int getMaxRegistrationYears() {
    return maxRegistrationYears;
  }

  @Override
  public String toString() {
    return domain;
  }
}
