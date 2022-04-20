/**
 * DNSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class DNSRequest  implements java.io.Serializable {
  private java.lang.String recType;

  private java.lang.String action;

  private java.lang.String key;

  private int ttl;

  private java.lang.String recValue;

  public DNSRequest() {
  }

  public DNSRequest(
       java.lang.String recType,
       java.lang.String action,
       java.lang.String key,
       int ttl,
       java.lang.String recValue) {
       this.recType = recType;
       this.action = action;
       this.key = key;
       this.ttl = ttl;
       this.recValue = recValue;
  }


  /**
   * Gets the recType value for this DNSRequest.
   *
   * @return recType
   */
  public java.lang.String getRecType() {
    return recType;
  }


  /**
   * Sets the recType value for this DNSRequest.
   *
   * @param recType
   */
  public void setRecType(java.lang.String recType) {
    this.recType = recType;
  }


  /**
   * Gets the action value for this DNSRequest.
   *
   * @return action
   */
  public java.lang.String getAction() {
    return action;
  }


  /**
   * Sets the action value for this DNSRequest.
   *
   * @param action
   */
  public void setAction(java.lang.String action) {
    this.action = action;
  }


  /**
   * Gets the key value for this DNSRequest.
   *
   * @return key
   */
  public java.lang.String getKey() {
    return key;
  }


  /**
   * Sets the key value for this DNSRequest.
   *
   * @param key
   */
  public void setKey(java.lang.String key) {
    this.key = key;
  }


  /**
   * Gets the ttl value for this DNSRequest.
   *
   * @return ttl
   */
  public int getTtl() {
    return ttl;
  }


  /**
   * Sets the ttl value for this DNSRequest.
   *
   * @param ttl
   */
  public void setTtl(int ttl) {
    this.ttl = ttl;
  }


  /**
   * Gets the recValue value for this DNSRequest.
   *
   * @return recValue
   */
  public java.lang.String getRecValue() {
    return recValue;
  }


  /**
   * Sets the recValue value for this DNSRequest.
   *
   * @param recValue
   */
  public void setRecValue(java.lang.String recValue) {
    this.recValue = recValue;
  }

  private java.lang.Object __equalsCalc = null;
  public synchronized boolean equals(java.lang.Object obj) {
    if (!(obj instanceof DNSRequest)) {
      return false;
    }
    DNSRequest other = (DNSRequest) obj;
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
      ((this.recType == null && other.getRecType() == null) ||
       (this.recType != null &&
        this.recType.equals(other.getRecType()))) &&
      ((this.action == null && other.getAction() == null) ||
       (this.action != null &&
        this.action.equals(other.getAction()))) &&
      ((this.key == null && other.getKey() == null) ||
       (this.key != null &&
        this.key.equals(other.getKey()))) &&
      this.ttl == other.getTtl() &&
      ((this.recValue == null && other.getRecValue() == null) ||
       (this.recValue != null &&
        this.recValue.equals(other.getRecValue())));
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
    if (getRecType() != null) {
      _hashCode += getRecType().hashCode();
    }
    if (getAction() != null) {
      _hashCode += getAction().hashCode();
    }
    if (getKey() != null) {
      _hashCode += getKey().hashCode();
    }
    _hashCode += getTtl();
    if (getRecValue() != null) {
      _hashCode += getRecValue().hashCode();
    }
    __hashCodeCalc = false;
    return _hashCode;
  }

  // Type metadata
  private static org.apache.axis.description.TypeDesc typeDesc =
    new org.apache.axis.description.TypeDesc(DNSRequest.class, true);

  static {
    typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DNSRequest"));
    org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("recType");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "recType"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("action");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "action"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("key");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "key"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("ttl");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ttl"));
    elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new org.apache.axis.description.ElementDesc();
    elemField.setFieldName("recValue");
    elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "recValue"));
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
