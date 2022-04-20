/**
 * Domain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class Domain  implements java.io.Serializable {
  private java.lang.String resourceid;

  private java.lang.String mngTRID;

  private java.lang.String transferKey;

  private java.lang.String newAuthInfo;

  public Domain() {
  }

  public Domain(
       java.lang.String resourceid,
       java.lang.String mngTRID,
       java.lang.String transferKey,
       java.lang.String newAuthInfo) {
       this.resourceid = resourceid;
       this.mngTRID = mngTRID;
       this.transferKey = transferKey;
       this.newAuthInfo = newAuthInfo;
  }


  /**
   * Gets the resourceid value for this Domain.
   *
   * @return resourceid
   */
  public java.lang.String getResourceid() {
    return resourceid;
  }


  /**
   * Sets the resourceid value for this Domain.
   *
   * @param resourceid
   */
  public void setResourceid(java.lang.String resourceid) {
    this.resourceid = resourceid;
  }


  /**
   * Gets the mngTRID value for this Domain.
   *
   * @return mngTRID
   */
  public java.lang.String getMngTRID() {
    return mngTRID;
  }


  /**
   * Sets the mngTRID value for this Domain.
   *
   * @param mngTRID
   */
  public void setMngTRID(java.lang.String mngTRID) {
    this.mngTRID = mngTRID;
  }


  /**
   * Gets the transferKey value for this Domain.
   *
   * @return transferKey
   */
  public java.lang.String getTransferKey() {
    return transferKey;
  }


  /**
   * Sets the transferKey value for this Domain.
   *
   * @param transferKey
   */
  public void setTransferKey(java.lang.String transferKey) {
    this.transferKey = transferKey;
  }


  /**
   * Gets the newAuthInfo value for this Domain.
   *
   * @return newAuthInfo
   */
  public java.lang.String getNewAuthInfo() {
    return newAuthInfo;
  }


  /**
   * Sets the newAuthInfo value for this Domain.
   *
   * @param newAuthInfo
   */
  public void setNewAuthInfo(java.lang.String newAuthInfo) {
    this.newAuthInfo = newAuthInfo;
  }

  private java.lang.Object __equalsCalc = null;
  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof Domain)) {
      return false;
    }
    Domain other = (Domain) obj;
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
      ((this.resourceid == null && other.getResourceid() == null) ||
       (this.resourceid != null &&
        this.resourceid.equals(other.getResourceid()))) &&
      ((this.mngTRID == null && other.getMngTRID() == null) ||
       (this.mngTRID != null &&
        this.mngTRID.equals(other.getMngTRID()))) &&
      ((this.transferKey == null && other.getTransferKey() == null) ||
       (this.transferKey != null &&
        this.transferKey.equals(other.getTransferKey()))) &&
      ((this.newAuthInfo == null && other.getNewAuthInfo() == null) ||
       (this.newAuthInfo != null &&
        this.newAuthInfo.equals(other.getNewAuthInfo())));
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
    if (getResourceid() != null) {
      _hashCode += getResourceid().hashCode();
    }
    if (getMngTRID() != null) {
      _hashCode += getMngTRID().hashCode();
    }
    if (getTransferKey() != null) {
      _hashCode += getTransferKey().hashCode();
    }
    if (getNewAuthInfo() != null) {
      _hashCode += getNewAuthInfo().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
    new org.apache.axis.description.TypeDesc(Domain.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Domain"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("resourceid");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "resourceid"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("mngTRID");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "mngTRID"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("transferKey");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "transferKey"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("newAuthInfo");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "newAuthInfo"));
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
