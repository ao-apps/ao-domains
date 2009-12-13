package com.aoindustries.domains;

/*
 * Copyright 2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import com.aoindustries.util.Country;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.validator.GenericValidator;

/**
 * @author  AO Industries, Inc.
 */
public class ContactInfo implements Validateable {

    public static final int
        FIRST_NAME_MAX_LENGTH = 30,
        LAST_NAME_MAX_LENGTH = 50,
        COMPANY_NAME_MAX_LENGTH = 100,
        EMAIL_MAX_LENGTH = 80,
        STREET_ADDRESS_1_MAX_LENGTH = 41,
        STREET_ADDRESS_2_MAX_LENGTH = 41,
        CITY_MAX_LENGTH = 30,
        STATE_MAX_LENGTH = 30,
        POSTAL_CODE_MAX_LENGTH = 10,
        PHONE_MAX_LENGTH = 17,
        FAX_MAX_LENGTH = 17
    ;

    public static final Pattern
        FIRST_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9.,()\\\\@&' ]+$"),
        LAST_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9-.,()\\\\@&' ]+$"),
        COMPANY_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9-.,()\\\\@&!'+ ]+$"),
        STREET_ADDRESS_1_PATTERN = Pattern.compile("^[a-zA-Z0-9 #&'()+,-./:;@[\\]]+$"),
        STREET_ADDRESS_2_PATTERN = Pattern.compile("^[a-zA-Z0-9 #&'()+,-./:;@[\\]]+$"),
        CITY_PATTERN = Pattern.compile("^[a-zA-Z0-9-.,' ]+$"),
        STATE_PATTERN = Pattern.compile("^[a-zA-Z0-9-.,' ]+$"),
        POSTAL_CODE_PATTERN_US = Pattern.compile("^(\\d\\d\\d\\d\\d|\\d\\d\\d\\d\\d-\\d\\d\\d\\d)$"),
        POSTAL_CODE_PATTERN_GB = Pattern.compile("^[a-zA-Z][a-zA-Z]?((\\d)|(\\d[a-zA-Z])|(\\d\\d)|([a-zA-Z])) *(\\d[a-zA-Z][a-zA-Z])$"),
        POSTAL_CODE_PATTERN_DE = Pattern.compile("^\\d\\d\\d\\d\\d$"),
        POSTAL_CODE_PATTERN_CA = Pattern.compile("^[a-zA-Z](\\d)[a-zA-Z] ?(\\d)[a-zA-Z](\\d)$"),
        POSTAL_CODE_PATTERN_AU = Pattern.compile("^\\d\\d\\d\\d$"),
        POSTAL_CODE_PATTERN_BR = Pattern.compile("^\\d\\d\\d\\d\\d-\\d\\d\\d$"),
        POSTAL_CODE_PATTERN_NL = Pattern.compile("^\\d\\d\\d\\d ?[a-zA-Z][a-zA-Z]$"),
        POSTAL_CODE_PATTERN = Pattern.compile("^[a-zA-Z0-9 #&'()+,-./:;@[\\]]+$"),
        PHONE_PATTERN = Pattern.compile("^+[0-9]{1,3}\\.[0-9]{1,12}$"),
        FAX_PATTERN = Pattern.compile("^+[0-9]{1,3}\\.[0-9]{1,12}$")
    ;

    private static String trimAndNullIfEmpty(String value) {
        if(value!=null && (value=value.trim()).length()==0) value = null;
        return value;
    }

    private String firstName;
    private String lastName;
    private String companyName;
    private String email;
    private String phone;
    private String fax;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String postalCode;
    private Country country;

    /**
     * Creates an empty ContactInfo.  The values should be set using the appropriate setter methods.
     */
    public ContactInfo(
        Locale userLocale,
        String firstName,
        String lastName,
        String companyName,
        String email,
        String phone,
        String fax,
        String streetAddress1,
        String streetAddress2,
        String city,
        String state,
        String postalCode,
        Country country
    ) {
        setFirstName(firstName);
        setLastName(lastName);
        setCompanyName(companyName);
        setEmail(email);
        setPhone(phone);
        setFax(fax);
        setStreetAddress1(streetAddress1);
        setStreetAddress2(streetAddress2);
        setCity(city);
        setState(state);
        setPostalCode(postalCode);
        setCountry(country);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = trimAndNullIfEmpty(firstName);
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = trimAndNullIfEmpty(lastName);
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = trimAndNullIfEmpty(companyName);
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = trimAndNullIfEmpty(email);
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = trimAndNullIfEmpty(phone);
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = trimAndNullIfEmpty(fax);
    }

    /**
     * @return the streetAddress1
     */
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * @param streetAddress1 the streetAddress1 to set
     */
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = trimAndNullIfEmpty(streetAddress1);
    }

    /**
     * @return the streetAddress2
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * @param streetAddress2 the streetAddress2 to set
     */
    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = trimAndNullIfEmpty(streetAddress2);
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = trimAndNullIfEmpty(city);
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = trimAndNullIfEmpty(state);
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = trimAndNullIfEmpty(postalCode);
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    private static void addError(Locale userLocale, Map<String,List<String>> errors, String fieldName, String key) {
        List<String> list = errors.get(fieldName);
        if(list==null) errors.put(fieldName, list = new ArrayList<String>());
        list.add(ApplicationResources.getMessage(userLocale, key));
    }

    private static void addError(Locale userLocale, Map<String,List<String>> errors, String fieldName, String key, Object... args) {
        List<String> list = errors.get(fieldName);
        if(list==null) errors.put(fieldName, list = new ArrayList<String>());
        list.add(ApplicationResources.getMessage(userLocale, key, args));
    }

    public Map<String,List<String>> validate(Locale userLocale) {
        Map<String,List<String>> errors = new HashMap<String,List<String>>();
        if(firstName!=null) {
            if(firstName.length()>FIRST_NAME_MAX_LENGTH) addError(userLocale, errors, "firstName", "ContactInfo.validate.firstName.tooLong", FIRST_NAME_MAX_LENGTH);
            if(!FIRST_NAME_PATTERN.matcher(firstName).matches()) addError(userLocale, errors, "firstName", "ContactInfo.validate.firstName.invalid");
        }
        if(lastName!=null) {
            if(lastName.length()>LAST_NAME_MAX_LENGTH) addError(userLocale, errors, "lastName", "ContactInfo.validate.lastName.tooLong", LAST_NAME_MAX_LENGTH);
            if(!LAST_NAME_PATTERN.matcher(lastName).matches()) addError(userLocale, errors, "lastName", "ContactInfo.validate.lastName.invalid");
        }
        if(companyName==null) {
            if(firstName==null) addError(userLocale, errors, "firstName", "ContactInfo.validate.firstName.requiredWhenNoCompanyName");
            if(lastName==null) addError(userLocale, errors, "lastName", "ContactInfo.validate.lastName.requiredWhenNoCompanyName");
        } else {
            if(companyName.length()>COMPANY_NAME_MAX_LENGTH) addError(userLocale, errors, "companyName", "ContactInfo.validate.companyName.tooLong", COMPANY_NAME_MAX_LENGTH);
            if(!COMPANY_NAME_PATTERN.matcher(companyName).matches()) addError(userLocale, errors, "companyName", "ContactInfo.validate.companyName.invalid");
        }
        if(email==null) addError(userLocale, errors, "email", "ContactInfo.validate.email.required");
        else {
            if(email.length()>EMAIL_MAX_LENGTH) addError(userLocale, errors, "email", "ContactInfo.validate.email.tooLong", EMAIL_MAX_LENGTH);
            if(!GenericValidator.isEmail(email)) addError(userLocale, errors, "email", "ContactInfo.validate.email.invalid");
        }
        if(streetAddress1==null) addError(userLocale, errors, "streetAddress1", "ContactInfo.validate.streetAddress1.required");
        else {
            if(streetAddress1.length()>STREET_ADDRESS_1_MAX_LENGTH) addError(userLocale, errors, "streetAddress1", "ContactInfo.validate.streetAddress1.tooLong", STREET_ADDRESS_1_MAX_LENGTH);
            if(!STREET_ADDRESS_1_PATTERN.matcher(streetAddress1).matches()) addError(userLocale, errors, "streetAddress1", "ContactInfo.validate.streetAddress1.invalid");
        }
        if(streetAddress2!=null) {
            if(streetAddress2.length()>STREET_ADDRESS_2_MAX_LENGTH) addError(userLocale, errors, "streetAddress2", "ContactInfo.validate.streetAddress2.tooLong", STREET_ADDRESS_2_MAX_LENGTH);
            if(!STREET_ADDRESS_2_PATTERN.matcher(streetAddress2).matches()) addError(userLocale, errors, "streetAddress2", "ContactInfo.validate.streetAddress2.invalid");
        }
        if(city==null) addError(userLocale, errors, "city", "ContactInfo.validate.city.required");
        else {
            if(city.length()>CITY_MAX_LENGTH) addError(userLocale, errors, "city", "ContactInfo.validate.city.tooLong", CITY_MAX_LENGTH);
            if(!CITY_PATTERN.matcher(city).matches()) addError(userLocale, errors, "city", "ContactInfo.validate.city.invalid");
        }
        if(state==null) {
            if(country==Country.US || country==Country.CA) addError(userLocale, errors, "state", "ContactInfo.validate.state.required");
        } else {
            if(state.length()>STATE_MAX_LENGTH) addError(userLocale, errors, "state", "ContactInfo.validate.state.tooLong", STATE_MAX_LENGTH);
            if(!STATE_PATTERN.matcher(state).matches()) addError(userLocale, errors, "state", "ContactInfo.validate.state.invalid");
            if(country!=null) {
                List<String> states = country.getStates();
                if(states!=null && !states.contains(state)) addError(userLocale, errors, "state", "ContactInfo.validate.state.notInList");
            }
        }
        if(postalCode==null) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.required");
        else {
            if(postalCode.length()>POSTAL_CODE_MAX_LENGTH) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.tooLong", POSTAL_CODE_MAX_LENGTH);
            if(country==Country.US) {
                if(!POSTAL_CODE_PATTERN_US.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            } else if(country==Country.GB) {
                if(!POSTAL_CODE_PATTERN_GB.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            } else if(country==Country.DE) {
                if(!POSTAL_CODE_PATTERN_DE.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            } else if(country==Country.CA) {
                if(!POSTAL_CODE_PATTERN_CA.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            } else if(country==Country.AU) {
                if(!POSTAL_CODE_PATTERN_AU.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            } else if(country==Country.BR) {
                if(!POSTAL_CODE_PATTERN_BR.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            } else if(country==Country.NL) {
                if(!POSTAL_CODE_PATTERN_NL.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            } else {
                if(!POSTAL_CODE_PATTERN.matcher(postalCode).matches()) addError(userLocale, errors, "postalCode", "ContactInfo.validate.postalCode.invalid");
            }
        }
        if(country==null) addError(userLocale, errors, "country", "ContactInfo.validate.country.required");
        if(phone==null) addError(userLocale, errors, "phone", "ContactInfo.validate.phone.required");
        else {
            if(phone.length()>PHONE_MAX_LENGTH) addError(userLocale, errors, "phone", "ContactInfo.validate.phone.tooLong", PHONE_MAX_LENGTH);
            if(!PHONE_PATTERN.matcher(phone).matches()) addError(userLocale, errors, "phone", "ContactInfo.validate.phone.invalid");
        }
        if(fax!=null) {
            if(fax.length()>FAX_MAX_LENGTH) addError(userLocale, errors, "fax", "ContactInfo.validate.fax.tooLong", FAX_MAX_LENGTH);
            if(!FAX_PATTERN.matcher(fax).matches()) addError(userLocale, errors, "fax", "ContactInfo.validate.fax.invalid");
        }
        return errors;
    }
}
