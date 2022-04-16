/*
 * Copyright 2009-2011, 2021, 2022 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */

package com.aoindustries.domains;

import java.util.List;
import java.util.Map;

/**
 * @author  AO Industries, Inc.
 */
public interface Validateable {

	/**
	 * Validates the properties of this object.  Returns an empty map when there are no problems.
	 */
	Map<String, List<String>> validate();
}
