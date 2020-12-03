/*
 * Copyright 2009-2011, 2020 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.domains;

import com.aoindustries.util.i18n.ApplicationResourcesAccessor;
import com.aoindustries.util.i18n.EditableResourceBundle;
import com.aoindustries.util.i18n.EditableResourceBundleSet;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/**
 * @author  AO Industries, Inc.
 */
public final class ApplicationResources extends EditableResourceBundle {

    static final EditableResourceBundleSet bundleSet = new EditableResourceBundleSet(
        ApplicationResources.class.getName(),
        Arrays.asList(
            Locale.ROOT,
            Locale.JAPANESE
        )
    );

	static File getSourceFile(String filename) {
		return new File(System.getProperty("user.home") + "/maven2/ao/ao-domains/src/main/resources/com/aoindustries/domains", filename);
	}

    public ApplicationResources() {
		super(Locale.ROOT, bundleSet, getSourceFile("ApplicationResources.properties"));
    }

    static final ApplicationResourcesAccessor accessor = ApplicationResourcesAccessor.getInstance(bundleSet.getBaseName());
}
