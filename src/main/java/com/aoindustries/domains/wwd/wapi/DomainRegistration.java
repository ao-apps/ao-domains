/**
 * DomainRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class DomainRegistration  extends com.aoindustries.domains.wwd.wapi.Order  implements java.io.Serializable {
    private com.aoindustries.domains.wwd.wapi.OrderItem order;

    private java.lang.String sld;

    private java.lang.String tld;

    private int period;

    private com.aoindustries.domains.wwd.wapi.ContactInfo registrant;

    private com.aoindustries.domains.wwd.wapi.Nexus nexus;

    private com.aoindustries.domains.wwd.wapi.NS[] nsArray;

    private com.aoindustries.domains.wwd.wapi.ContactInfo admin;

    private com.aoindustries.domains.wwd.wapi.ContactInfo billing;

    private com.aoindustries.domains.wwd.wapi.ContactInfo tech;

    private int autorenewflag;

    public DomainRegistration() {
    }

    public DomainRegistration(
           com.aoindustries.domains.wwd.wapi.OrderItem order,
           java.lang.String sld,
           java.lang.String tld,
           int period,
           com.aoindustries.domains.wwd.wapi.ContactInfo registrant,
           com.aoindustries.domains.wwd.wapi.Nexus nexus,
           com.aoindustries.domains.wwd.wapi.NS[] nsArray,
           com.aoindustries.domains.wwd.wapi.ContactInfo admin,
           com.aoindustries.domains.wwd.wapi.ContactInfo billing,
           com.aoindustries.domains.wwd.wapi.ContactInfo tech,
           int autorenewflag) {
        this.order = order;
        this.sld = sld;
        this.tld = tld;
        this.period = period;
        this.registrant = registrant;
        this.nexus = nexus;
        this.nsArray = nsArray;
        this.admin = admin;
        this.billing = billing;
        this.tech = tech;
        this.autorenewflag = autorenewflag;
    }


    /**
     * Gets the order value for this DomainRegistration.
     * 
     * @return order
     */
    public com.aoindustries.domains.wwd.wapi.OrderItem getOrder() {
        return order;
    }


    /**
     * Sets the order value for this DomainRegistration.
     * 
     * @param order
     */
    public void setOrder(com.aoindustries.domains.wwd.wapi.OrderItem order) {
        this.order = order;
    }


    /**
     * Gets the sld value for this DomainRegistration.
     * 
     * @return sld
     */
    public java.lang.String getSld() {
        return sld;
    }


    /**
     * Sets the sld value for this DomainRegistration.
     * 
     * @param sld
     */
    public void setSld(java.lang.String sld) {
        this.sld = sld;
    }


    /**
     * Gets the tld value for this DomainRegistration.
     * 
     * @return tld
     */
    public java.lang.String getTld() {
        return tld;
    }


    /**
     * Sets the tld value for this DomainRegistration.
     * 
     * @param tld
     */
    public void setTld(java.lang.String tld) {
        this.tld = tld;
    }


    /**
     * Gets the period value for this DomainRegistration.
     * 
     * @return period
     */
    public int getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this DomainRegistration.
     * 
     * @param period
     */
    public void setPeriod(int period) {
        this.period = period;
    }


    /**
     * Gets the registrant value for this DomainRegistration.
     * 
     * @return registrant
     */
    public com.aoindustries.domains.wwd.wapi.ContactInfo getRegistrant() {
        return registrant;
    }


    /**
     * Sets the registrant value for this DomainRegistration.
     * 
     * @param registrant
     */
    public void setRegistrant(com.aoindustries.domains.wwd.wapi.ContactInfo registrant) {
        this.registrant = registrant;
    }


    /**
     * Gets the nexus value for this DomainRegistration.
     * 
     * @return nexus
     */
    public com.aoindustries.domains.wwd.wapi.Nexus getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this DomainRegistration.
     * 
     * @param nexus
     */
    public void setNexus(com.aoindustries.domains.wwd.wapi.Nexus nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the nsArray value for this DomainRegistration.
     * 
     * @return nsArray
     */
    public com.aoindustries.domains.wwd.wapi.NS[] getNsArray() {
        return nsArray;
    }


    /**
     * Sets the nsArray value for this DomainRegistration.
     * 
     * @param nsArray
     */
    public void setNsArray(com.aoindustries.domains.wwd.wapi.NS[] nsArray) {
        this.nsArray = nsArray;
    }


    /**
     * Gets the admin value for this DomainRegistration.
     * 
     * @return admin
     */
    public com.aoindustries.domains.wwd.wapi.ContactInfo getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this DomainRegistration.
     * 
     * @param admin
     */
    public void setAdmin(com.aoindustries.domains.wwd.wapi.ContactInfo admin) {
        this.admin = admin;
    }


    /**
     * Gets the billing value for this DomainRegistration.
     * 
     * @return billing
     */
    public com.aoindustries.domains.wwd.wapi.ContactInfo getBilling() {
        return billing;
    }


    /**
     * Sets the billing value for this DomainRegistration.
     * 
     * @param billing
     */
    public void setBilling(com.aoindustries.domains.wwd.wapi.ContactInfo billing) {
        this.billing = billing;
    }


    /**
     * Gets the tech value for this DomainRegistration.
     * 
     * @return tech
     */
    public com.aoindustries.domains.wwd.wapi.ContactInfo getTech() {
        return tech;
    }


    /**
     * Sets the tech value for this DomainRegistration.
     * 
     * @param tech
     */
    public void setTech(com.aoindustries.domains.wwd.wapi.ContactInfo tech) {
        this.tech = tech;
    }


    /**
     * Gets the autorenewflag value for this DomainRegistration.
     * 
     * @return autorenewflag
     */
    public int getAutorenewflag() {
        return autorenewflag;
    }


    /**
     * Sets the autorenewflag value for this DomainRegistration.
     * 
     * @param autorenewflag
     */
    public void setAutorenewflag(int autorenewflag) {
        this.autorenewflag = autorenewflag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainRegistration)) return false;
        DomainRegistration other = (DomainRegistration) obj;
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
            this.period == other.getPeriod() &&
            ((this.registrant==null && other.getRegistrant()==null) || 
             (this.registrant!=null &&
              this.registrant.equals(other.getRegistrant()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.nsArray==null && other.getNsArray()==null) || 
             (this.nsArray!=null &&
              java.util.Arrays.equals(this.nsArray, other.getNsArray()))) &&
            ((this.admin==null && other.getAdmin()==null) || 
             (this.admin!=null &&
              this.admin.equals(other.getAdmin()))) &&
            ((this.billing==null && other.getBilling()==null) || 
             (this.billing!=null &&
              this.billing.equals(other.getBilling()))) &&
            ((this.tech==null && other.getTech()==null) || 
             (this.tech!=null &&
              this.tech.equals(other.getTech()))) &&
            this.autorenewflag == other.getAutorenewflag();
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
        _hashCode += getPeriod();
        if (getRegistrant() != null) {
            _hashCode += getRegistrant().hashCode();
        }
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getNsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNsArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNsArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        _hashCode += getAutorenewflag();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainRegistration"));
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
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Nexus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "nsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "NS"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorenewflag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "autorenewflag"));
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
