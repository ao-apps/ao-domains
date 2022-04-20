/**
 * GainingOwner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class GainingOwner  implements java.io.Serializable {
  private com.aoindustries.domains.wwd.wapi.ShopperNoDBP shopperNoDBP;

  private com.aoindustries.domains.wwd.wapi.ContactInfo registrant;

  private com.aoindustries.domains.wwd.wapi.ContactInfo admin;

  private com.aoindustries.domains.wwd.wapi.ContactInfo billing;

  private com.aoindustries.domains.wwd.wapi.ContactInfo tech;

  public GainingOwner() {
  }

  public GainingOwner(
       com.aoindustries.domains.wwd.wapi.ShopperNoDBP shopperNoDBP,
       com.aoindustries.domains.wwd.wapi.ContactInfo registrant,
       com.aoindustries.domains.wwd.wapi.ContactInfo admin,
       com.aoindustries.domains.wwd.wapi.ContactInfo billing,
       com.aoindustries.domains.wwd.wapi.ContactInfo tech) {
       this.shopperNoDBP = shopperNoDBP;
       this.registrant = registrant;
       this.admin = admin;
       this.billing = billing;
       this.tech = tech;
  }


  /**
   * Gets the shopperNoDBP value for this GainingOwner.
   *
   * @return shopperNoDBP
   */
  public com.aoindustries.domains.wwd.wapi.ShopperNoDBP getShopperNoDBP() {
    return shopperNoDBP;
  }


  /**
   * Sets the shopperNoDBP value for this GainingOwner.
   *
   * @param shopperNoDBP
   */
  public void setShopperNoDBP(com.aoindustries.domains.wwd.wapi.ShopperNoDBP shopperNoDBP) {
    this.shopperNoDBP = shopperNoDBP;
  }


  /**
   * Gets the registrant value for this GainingOwner.
   *
   * @return registrant
   */
  public com.aoindustries.domains.wwd.wapi.ContactInfo getRegistrant() {
    return registrant;
  }


  /**
   * Sets the registrant value for this GainingOwner.
   *
   * @param registrant
   */
  public void setRegistrant(com.aoindustries.domains.wwd.wapi.ContactInfo registrant) {
    this.registrant = registrant;
  }


  /**
   * Gets the admin value for this GainingOwner.
   *
   * @return admin
   */
  public com.aoindustries.domains.wwd.wapi.ContactInfo getAdmin() {
    return admin;
  }


  /**
   * Sets the admin value for this GainingOwner.
   *
   * @param admin
   */
  public void setAdmin(com.aoindustries.domains.wwd.wapi.ContactInfo admin) {
    this.admin = admin;
  }


  /**
   * Gets the billing value for this GainingOwner.
   *
   * @return billing
   */
  public com.aoindustries.domains.wwd.wapi.ContactInfo getBilling() {
    return billing;
  }


  /**
   * Sets the billing value for this GainingOwner.
   *
   * @param billing
   */
  public void setBilling(com.aoindustries.domains.wwd.wapi.ContactInfo billing) {
    this.billing = billing;
  }


  /**
   * Gets the tech value for this GainingOwner.
   *
   * @return tech
   */
  public com.aoindustries.domains.wwd.wapi.ContactInfo getTech() {
    return tech;
  }


  /**
   * Sets the tech value for this GainingOwner.
   *
   * @param tech
   */
  public void setTech(com.aoindustries.domains.wwd.wapi.ContactInfo tech) {
    this.tech = tech;
  }

  private java.lang.Object __equalsCalc = null;
  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof GainingOwner)) {
      return false;
    }
    GainingOwner other = (GainingOwner) obj;
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
      ((this.shopperNoDBP == null && other.getShopperNoDBP() == null) ||
       (this.shopperNoDBP != null &&
        this.shopperNoDBP.equals(other.getShopperNoDBP()))) &&
      ((this.registrant == null && other.getRegistrant() == null) ||
       (this.registrant != null &&
        this.registrant.equals(other.getRegistrant()))) &&
      ((this.admin == null && other.getAdmin() == null) ||
       (this.admin != null &&
        this.admin.equals(other.getAdmin()))) &&
      ((this.billing == null && other.getBilling() == null) ||
       (this.billing != null &&
        this.billing.equals(other.getBilling()))) &&
      ((this.tech == null && other.getTech() == null) ||
       (this.tech != null &&
        this.tech.equals(other.getTech())));
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
    if (getShopperNoDBP() != null) {
      _hashCode += getShopperNoDBP().hashCode();
    }
    if (getRegistrant() != null) {
      _hashCode += getRegistrant().hashCode();
    }
    if (getAdmin() != null) {
      _hashCode += getAdmin().hashCode();
    }
    if (getBilling() != null) {
      _hashCode += getBilling().hashCode();
    }
    if (getTech() != null) {
      _hashCode += getTech().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
    new org.apache.axis.description.TypeDesc(GainingOwner.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "GainingOwner"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("shopperNoDBP");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "shopperNoDBP"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ShopperNoDBP"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("registrant");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "registrant"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("admin");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "admin"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("billing");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "billing"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("tech");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "tech"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"));
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
