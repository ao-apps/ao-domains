/*
 * Copyright 2009-2011, 2022 by AO Industries, Inc.,
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
    return ApplicationResources.accessor.getMessage("TldCategory."+name()+".toString");
  }
}
