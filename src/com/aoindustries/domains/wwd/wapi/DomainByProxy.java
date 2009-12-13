/**
 * DomainByProxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class DomainByProxy  extends com.aoindustries.domains.wwd.wapi.Order  implements java.io.Serializable {
    private com.aoindustries.domains.wwd.wapi.OrderItem order;

    private java.lang.String sld;

    private java.lang.String tld;

    private java.lang.String resourceid;

    public DomainByProxy() {
    }

    public DomainByProxy(
           com.aoindustries.domains.wwd.wapi.OrderItem order,
           java.lang.String sld,
           java.lang.String tld,
           java.lang.String resourceid) {
        this.order = order;
        this.sld = sld;
        this.tld = tld;
        this.resourceid = resourceid;
    }


    /**
     * Gets the order value for this DomainByProxy.
     * 
     * @return order
     */
    public com.aoindustries.domains.wwd.wapi.OrderItem getOrder() {
        return order;
    }


    /**
     * Sets the order value for this DomainByProxy.
     * 
     * @param order
     */
    public void setOrder(com.aoindustries.domains.wwd.wapi.OrderItem order) {
        this.order = order;
    }


    /**
     * Gets the sld value for this DomainByProxy.
     * 
     * @return sld
     */
    public java.lang.String getSld() {
        return sld;
    }


    /**
     * Sets the sld value for this DomainByProxy.
     * 
     * @param sld
     */
    public void setSld(java.lang.String sld) {
        this.sld = sld;
    }


    /**
     * Gets the tld value for this DomainByProxy.
     * 
     * @return tld
     */
    public java.lang.String getTld() {
        return tld;
    }


    /**
     * Sets the tld value for this DomainByProxy.
     * 
     * @param tld
     */
    public void setTld(java.lang.String tld) {
        this.tld = tld;
    }


    /**
     * Gets the resourceid value for this DomainByProxy.
     * 
     * @return resourceid
     */
    public java.lang.String getResourceid() {
        return resourceid;
    }


    /**
     * Sets the resourceid value for this DomainByProxy.
     * 
     * @param resourceid
     */
    public void setResourceid(java.lang.String resourceid) {
        this.resourceid = resourceid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainByProxy)) return false;
        DomainByProxy other = (DomainByProxy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.sld==null && other.getSld()==null) || 
             (this.sld!=null &&
              this.sld.equals(other.getSld()))) &&
            ((this.tld==null && other.getTld()==null) || 
             (this.tld!=null &&
              this.tld.equals(other.getTld()))) &&
            ((this.resourceid==null && other.getResourceid()==null) || 
             (this.resourceid!=null &&
              this.resourceid.equals(other.getResourceid())));
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
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getSld() != null) {
            _hashCode += getSld().hashCode();
        }
        if (getTld() != null) {
            _hashCode += getTld().hashCode();
        }
        if (getResourceid() != null) {
            _hashCode += getResourceid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainByProxy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainByProxy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sld");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sld"));
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
        elemField.setFieldName("resourceid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "resourceid"));
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
