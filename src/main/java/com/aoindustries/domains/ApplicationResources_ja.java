/*
 * Copyright 2009-2011, 2020, 2022 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */

package com.aoindustries.domains;

import com.aoapps.hodgepodge.i18n.EditableResourceBundle;
import java.util.Locale;

/**
 * Development-only editable resource bundle.
 *
 * @author  AO Industries, Inc.
 */
public final class ApplicationResources_ja extends EditableResourceBundle {

  /**
   * Loads the editable resource bundle.
   */
  public ApplicationResources_ja() {
    super(
      Locale.JAPANESE,
      ApplicationResources.bundleSet,
      ApplicationResources.getSourceFile("ApplicationResources_ja.properties")
    );
  }
}
