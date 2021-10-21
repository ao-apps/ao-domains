/*
 * Copyright 2009-2011, 2021 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.domains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * A domain is a combination of a second level domain and a top level domain.
 *
 * @author  AO Industries, Inc.
 */
public class Domain implements Comparable<Domain>, Validateable {

	public static final int SLD_MIN_LENGTH = 1;
	public static final int SLD_MAX_LENGTH = 63;
	public static final Pattern SLD_PATTERN = Pattern.compile("^[a-z0-9]+(-[a-z0-9]+)*$");

	private final String sld;
	private final Tld tld;

	public Domain(String sld, Tld tld) {
		if(sld==null) throw new IllegalArgumentException("sld==null");
		if(tld==null) throw new IllegalArgumentException("tld==null");
		this.sld = sld.trim().toUpperCase(Locale.ENGLISH);
		this.tld = tld;
	}

	public String getSld() {
		return sld;
	}

	public Tld getTld() {
		return tld;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!(obj instanceof Domain)) return false;
		Domain other = (Domain)obj;
		return sld.equals(other.sld) && tld==other.tld;
	}

	@Override
	public int hashCode() {
		return sld.hashCode()*31 + tld.hashCode();
	}

	@Override
	public String toString() {
		return sld+"."+tld;
	}

	public int compareTo(Domain other) {
		int diff = tld.compareTo(other.tld);
		if(diff!=0) return diff;
		return sld.compareTo(other.sld);
	}

	private static void addError(Map<String, List<String>> errors, String fieldName, String key) {
		List<String> list = errors.get(fieldName);
		if(list==null) errors.put(fieldName, list = new ArrayList<String>());
		list.add(ApplicationResources.accessor.getMessage(key));
	}

	private static void addError(Map<String, List<String>> errors, String fieldName, String key, Object... args) {
		List<String> list = errors.get(fieldName);
		if(list==null) errors.put(fieldName, list = new ArrayList<String>());
		list.add(ApplicationResources.accessor.getMessage(key, args));
	}

	public Map<String, List<String>> validate() {
		Map<String, List<String>> errors = new HashMap<String, List<String>>();
		if(sld.length()<SLD_MIN_LENGTH) addError(errors, "sld", "Domain.validate.sld.tooShort", SLD_MIN_LENGTH);
		if(sld.length()>SLD_MAX_LENGTH) addError(errors, "sld", "Domain.validate.sld.tooLong", SLD_MAX_LENGTH);
		if(!SLD_PATTERN.matcher(sld).matches()) addError(errors, "sld", "Domain.validate.sld.invalid");
		return errors;
	}
}
