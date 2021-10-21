/**
 * ShopperNoDBP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class ShopperNoDBP  implements java.io.Serializable {
	private java.lang.String user;

	private java.lang.String pwd;

	private java.lang.String pwdhint;

	private java.lang.String email;

	private java.lang.String firstname;

	private java.lang.String lastname;

	private java.lang.String phone;

	private java.lang.String pin;

	public ShopperNoDBP() {
	}

	public ShopperNoDBP(
		   java.lang.String user,
		   java.lang.String pwd,
		   java.lang.String pwdhint,
		   java.lang.String email,
		   java.lang.String firstname,
		   java.lang.String lastname,
		   java.lang.String phone,
		   java.lang.String pin) {
		   this.user = user;
		   this.pwd = pwd;
		   this.pwdhint = pwdhint;
		   this.email = email;
		   this.firstname = firstname;
		   this.lastname = lastname;
		   this.phone = phone;
		   this.pin = pin;
	}


	/**
	 * Gets the user value for this ShopperNoDBP.
	 *
	 * @return user
	 */
	public java.lang.String getUser() {
		return user;
	}


	/**
	 * Sets the user value for this ShopperNoDBP.
	 *
	 * @param user
	 */
	public void setUser(java.lang.String user) {
		this.user = user;
	}


	/**
	 * Gets the pwd value for this ShopperNoDBP.
	 *
	 * @return pwd
	 */
	public java.lang.String getPwd() {
		return pwd;
	}


	/**
	 * Sets the pwd value for this ShopperNoDBP.
	 *
	 * @param pwd
	 */
	public void setPwd(java.lang.String pwd) {
		this.pwd = pwd;
	}


	/**
	 * Gets the pwdhint value for this ShopperNoDBP.
	 *
	 * @return pwdhint
	 */
	public java.lang.String getPwdhint() {
		return pwdhint;
	}


	/**
	 * Sets the pwdhint value for this ShopperNoDBP.
	 *
	 * @param pwdhint
	 */
	public void setPwdhint(java.lang.String pwdhint) {
		this.pwdhint = pwdhint;
	}


	/**
	 * Gets the email value for this ShopperNoDBP.
	 *
	 * @return email
	 */
	public java.lang.String getEmail() {
		return email;
	}


	/**
	 * Sets the email value for this ShopperNoDBP.
	 *
	 * @param email
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}


	/**
	 * Gets the firstname value for this ShopperNoDBP.
	 *
	 * @return firstname
	 */
	public java.lang.String getFirstname() {
		return firstname;
	}


	/**
	 * Sets the firstname value for this ShopperNoDBP.
	 *
	 * @param firstname
	 */
	public void setFirstname(java.lang.String firstname) {
		this.firstname = firstname;
	}


	/**
	 * Gets the lastname value for this ShopperNoDBP.
	 *
	 * @return lastname
	 */
	public java.lang.String getLastname() {
		return lastname;
	}


	/**
	 * Sets the lastname value for this ShopperNoDBP.
	 *
	 * @param lastname
	 */
	public void setLastname(java.lang.String lastname) {
		this.lastname = lastname;
	}


	/**
	 * Gets the phone value for this ShopperNoDBP.
	 *
	 * @return phone
	 */
	public java.lang.String getPhone() {
		return phone;
	}


	/**
	 * Sets the phone value for this ShopperNoDBP.
	 *
	 * @param phone
	 */
	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}


	/**
	 * Gets the pin value for this ShopperNoDBP.
	 *
	 * @return pin
	 */
	public java.lang.String getPin() {
		return pin;
	}


	/**
	 * Sets the pin value for this ShopperNoDBP.
	 *
	 * @param pin
	 */
	public void setPin(java.lang.String pin) {
		this.pin = pin;
	}

	private java.lang.Object __equalsCalc = null;
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ShopperNoDBP)) return false;
		ShopperNoDBP other = (ShopperNoDBP) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true &&
			((this.user==null && other.getUser()==null) ||
			 (this.user!=null &&
			  this.user.equals(other.getUser()))) &&
			((this.pwd==null && other.getPwd()==null) ||
			 (this.pwd!=null &&
			  this.pwd.equals(other.getPwd()))) &&
			((this.pwdhint==null && other.getPwdhint()==null) ||
			 (this.pwdhint!=null &&
			  this.pwdhint.equals(other.getPwdhint()))) &&
			((this.email==null && other.getEmail()==null) ||
			 (this.email!=null &&
			  this.email.equals(other.getEmail()))) &&
			((this.firstname==null && other.getFirstname()==null) ||
			 (this.firstname!=null &&
			  this.firstname.equals(other.getFirstname()))) &&
			((this.lastname==null && other.getLastname()==null) ||
			 (this.lastname!=null &&
			  this.lastname.equals(other.getLastname()))) &&
			((this.phone==null && other.getPhone()==null) ||
			 (this.phone!=null &&
			  this.phone.equals(other.getPhone()))) &&
			((this.pin==null && other.getPin()==null) ||
			 (this.pin!=null &&
			  this.pin.equals(other.getPin())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getUser() != null) {
			_hashCode += getUser().hashCode();
		}
		if (getPwd() != null) {
			_hashCode += getPwd().hashCode();
		}
		if (getPwdhint() != null) {
			_hashCode += getPwdhint().hashCode();
		}
		if (getEmail() != null) {
			_hashCode += getEmail().hashCode();
		}
		if (getFirstname() != null) {
			_hashCode += getFirstname().hashCode();
		}
		if (getLastname() != null) {
			_hashCode += getLastname().hashCode();
		}
		if (getPhone() != null) {
			_hashCode += getPhone().hashCode();
		}
		if (getPin() != null) {
			_hashCode += getPin().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
		new org.apache.axis.description.TypeDesc(ShopperNoDBP.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ShopperNoDBP"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("user");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "user"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pwd");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "pwd"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pwdhint");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "pwdhint"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("email");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "email"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firstname");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "firstname"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastname");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "lastname"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("phone");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "phone"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pin");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "pin"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
		   java.lang.String mechType,
		   java.lang.Class _javaType,
		   javax.xml.namespace.QName _xmlType) {
		return
		  new  org.apache.axis.encoding.ser.BeanSerializer(
			_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
		   java.lang.String mechType,
		   java.lang.Class _javaType,
		   javax.xml.namespace.QName _xmlType) {
		return
		  new  org.apache.axis.encoding.ser.BeanDeserializer(
			_javaType, _xmlType, typeDesc);
	}

}
