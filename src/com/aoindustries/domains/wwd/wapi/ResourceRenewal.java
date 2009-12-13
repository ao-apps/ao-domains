/**
 * ResourceRenewal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class ResourceRenewal  extends com.aoindustries.domains.wwd.wapi.Order  implements java.io.Serializable {
    private com.aoindustries.domains.wwd.wapi.OrderItem order;

    private java.lang.String resourceid;

    public ResourceRenewal() {
    }

    public ResourceRenewal(
           com.aoindustries.domains.wwd.wapi.OrderItem order,
           java.lang.String resourceid) {
        this.order = order;
        this.resourceid = resourceid;
    }


    /**
     * Gets the order value for this ResourceRenewal.
     * 
     * @return order
     */
    public com.aoindustries.domains.wwd.wapi.OrderItem getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ResourceRenewal.
     * 
     * @param order
     */
    public void setOrder(com.aoindustries.domains.wwd.wapi.OrderItem order) {
        this.order = order;
    }


    /**
     * Gets the resourceid value for this ResourceRenewal.
     * 
     * @return resourceid
     */
    public java.lang.String getResourceid() {
        return resourceid;
    }


    /**
     * Sets the resourceid value for this ResourceRenewal.
     * 
     * @param resourceid
     */
    public void setResourceid(java.lang.String resourceid) {
        this.resourceid = resourceid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceRenewal)) return false;
        ResourceRenewal other = (ResourceRenewal) obj;
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
        if (getResourceid() != null) {
            _hashCode += getResourceid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceRenewal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ResourceRenewal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem"));
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
