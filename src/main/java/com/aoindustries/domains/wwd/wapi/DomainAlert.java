/**
 * DomainAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class DomainAlert  implements java.io.Serializable {
  private java.lang.String user;

  private java.lang.String domain;

  private java.lang.String email;

  private java.lang.String tld;

  private int privateReg;

  private int backorder;

  public DomainAlert() {
  }

  public DomainAlert(
       java.lang.String user,
       java.lang.String domain,
       java.lang.String email,
       java.lang.String tld,
       int privateReg,
       int backorder) {
       this.user = user;
       this.domain = domain;
       this.email = email;
       this.tld = tld;
       this.privateReg = privateReg;
       this.backorder = backorder;
  }


  /**
   * Gets the user value for this DomainAlert.
   *
   * @return user
   */
  public java.lang.String getUser() {
    return user;
  }


  /**
   * Sets the user value for this DomainAlert.
   *
   * @param user
   */
  public void setUser(java.lang.String user) {
    this.user = user;
  }


  /**
   * Gets the domain value for this DomainAlert.
   *
   * @return domain
   */
  public java.lang.String getDomain() {
    return domain;
  }


  /**
   * Sets the domain value for this DomainAlert.
   *
   * @param domain
   */
  public void setDomain(java.lang.String domain) {
    this.domain = domain;
  }


  /**
   * Gets the email value for this DomainAlert.
   *
   * @return email
   */
  public java.lang.String getEmail() {
    return email;
  }


  /**
   * Sets the email value for this DomainAlert.
   *
   * @param email
   */
  public void setEmail(java.lang.String email) {
    this.email = email;
  }


  /**
   * Gets the tld value for this DomainAlert.
   *
   * @return tld
   */
  public java.lang.String getTld() {
    return tld;
  }


  /**
   * Sets the tld value for this DomainAlert.
   *
   * @param tld
   */
  public void setTld(java.lang.String tld) {
    this.tld = tld;
  }


  /**
   * Gets the privateReg value for this DomainAlert.
   *
   * @return privateReg
   */
  public int getPrivateReg() {
    return privateReg;
  }


  /**
   * Sets the privateReg value for this DomainAlert.
   *
   * @param privateReg
   */
  public void setPrivateReg(int privateReg) {
    this.privateReg = privateReg;
  }


  /**
   * Gets the backorder value for this DomainAlert.
   *
   * @return backorder
   */
  public int getBackorder() {
    return backorder;
  }


  /**
   * Sets the backorder value for this DomainAlert.
   *
   * @param backorder
   */
  public void setBackorder(int backorder) {
    this.backorder = backorder;
  }

  private java.lang.Object __equalsCalc = null;
  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DomainAlert)) {
      return false;
    }
    DomainAlert other = (DomainAlert) obj;
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if (__equalsCalc != null) {
      return (__equalsCalc == obj);
    }
    __equalsCalc = obj;
    boolean _equals;
    _equals = true &&
      ((this.user == null && other.getUser() == null) ||
       (this.user != null &&
        this.user.equals(other.getUser()))) &&
      ((this.domain == null && other.getDomain() == null) ||
       (this.domain != null &&
        this.domain.equals(other.getDomain()))) &&
      ((this.email == null && other.getEmail() == null) ||
       (this.email != null &&
        this.email.equals(other.getEmail()))) &&
      ((this.tld == null && other.getTld() == null) ||
       (this.tld != null &&
        this.tld.equals(other.getTld()))) &&
      this.privateReg == other.getPrivateReg() &&
      this.backorder == other.getBackorder();
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
    if (getDomain() != null) {
      _hashCode += getDomain().hashCode();
    }
    if (getEmail() != null) {
      _hashCode += getEmail().hashCode();
    }
    if (getTld() != null) {
      _hashCode += getTld().hashCode();
    }
    _hashCode += getPrivateReg();
    _hashCode += getBackorder();
    __hashCodeCalc = false;
    return _hashCode;
  }

  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
    new org.apache.axis.description.TypeDesc(DomainAlert.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainAlert"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("user");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "user"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("domain");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "domain"));
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
    elemField.setFieldName("tld");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "tld"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("privateReg");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "privateReg"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("backorder");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "backorder"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
