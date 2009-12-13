/**
 * OrderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class OrderItem  extends com.aoindustries.domains.wwd.wapi.Order  implements java.io.Serializable {
    private int productid;

    private org.apache.axis.types.UnsignedInt quantity;

    private java.lang.String riid;

    private double duration;

    public OrderItem() {
    }

    public OrderItem(
           int productid,
           org.apache.axis.types.UnsignedInt quantity,
           java.lang.String riid,
           double duration) {
        this.productid = productid;
        this.quantity = quantity;
        this.riid = riid;
        this.duration = duration;
    }


    /**
     * Gets the productid value for this OrderItem.
     * 
     * @return productid
     */
    public int getProductid() {
        return productid;
    }


    /**
     * Sets the productid value for this OrderItem.
     * 
     * @param productid
     */
    public void setProductid(int productid) {
        this.productid = productid;
    }


    /**
     * Gets the quantity value for this OrderItem.
     * 
     * @return quantity
     */
    public org.apache.axis.types.UnsignedInt getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OrderItem.
     * 
     * @param quantity
     */
    public void setQuantity(org.apache.axis.types.UnsignedInt quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the riid value for this OrderItem.
     * 
     * @return riid
     */
    public java.lang.String getRiid() {
        return riid;
    }


    /**
     * Sets the riid value for this OrderItem.
     * 
     * @param riid
     */
    public void setRiid(java.lang.String riid) {
        this.riid = riid;
    }


    /**
     * Gets the duration value for this OrderItem.
     * 
     * @return duration
     */
    public double getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this OrderItem.
     * 
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderItem)) return false;
        OrderItem other = (OrderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.productid == other.getProductid() &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.riid==null && other.getRiid()==null) || 
             (this.riid!=null &&
              this.riid.equals(other.getRiid()))) &&
            this.duration == other.getDuration();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getProductid();
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRiid() != null) {
            _hashCode += getRiid().hashCode();
        }
        _hashCode += new Double(getDuration()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "productid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "riid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
