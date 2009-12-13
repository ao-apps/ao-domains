/**
 * ContactInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class ContactInfo  implements java.io.Serializable {
    private java.lang.String fname;

    private java.lang.String lname;

    private java.lang.String org;

    private java.lang.String email;

    private java.lang.String sa1;

    private java.lang.String sa2;

    private java.lang.String city;

    private java.lang.String sp;

    private java.lang.String pc;

    private java.lang.String cc;

    private java.lang.String phone;

    private java.lang.String fax;

    public ContactInfo() {
    }

    public ContactInfo(
           java.lang.String fname,
           java.lang.String lname,
           java.lang.String org,
           java.lang.String email,
           java.lang.String sa1,
           java.lang.String sa2,
           java.lang.String city,
           java.lang.String sp,
           java.lang.String pc,
           java.lang.String cc,
           java.lang.String phone,
           java.lang.String fax) {
           this.fname = fname;
           this.lname = lname;
           this.org = org;
           this.email = email;
           this.sa1 = sa1;
           this.sa2 = sa2;
           this.city = city;
           this.sp = sp;
           this.pc = pc;
           this.cc = cc;
           this.phone = phone;
           this.fax = fax;
    }


    /**
     * Gets the fname value for this ContactInfo.
     * 
     * @return fname
     */
    public java.lang.String getFname() {
        return fname;
    }


    /**
     * Sets the fname value for this ContactInfo.
     * 
     * @param fname
     */
    public void setFname(java.lang.String fname) {
        this.fname = fname;
    }


    /**
     * Gets the lname value for this ContactInfo.
     * 
     * @return lname
     */
    public java.lang.String getLname() {
        return lname;
    }


    /**
     * Sets the lname value for this ContactInfo.
     * 
     * @param lname
     */
    public void setLname(java.lang.String lname) {
        this.lname = lname;
    }


    /**
     * Gets the org value for this ContactInfo.
     * 
     * @return org
     */
    public java.lang.String getOrg() {
        return org;
    }


    /**
     * Sets the org value for this ContactInfo.
     * 
     * @param org
     */
    public void setOrg(java.lang.String org) {
        this.org = org;
    }


    /**
     * Gets the email value for this ContactInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ContactInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the sa1 value for this ContactInfo.
     * 
     * @return sa1
     */
    public java.lang.String getSa1() {
        return sa1;
    }


    /**
     * Sets the sa1 value for this ContactInfo.
     * 
     * @param sa1
     */
    public void setSa1(java.lang.String sa1) {
        this.sa1 = sa1;
    }


    /**
     * Gets the sa2 value for this ContactInfo.
     * 
     * @return sa2
     */
    public java.lang.String getSa2() {
        return sa2;
    }


    /**
     * Sets the sa2 value for this ContactInfo.
     * 
     * @param sa2
     */
    public void setSa2(java.lang.String sa2) {
        this.sa2 = sa2;
    }


    /**
     * Gets the city value for this ContactInfo.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ContactInfo.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the sp value for this ContactInfo.
     * 
     * @return sp
     */
    public java.lang.String getSp() {
        return sp;
    }


    /**
     * Sets the sp value for this ContactInfo.
     * 
     * @param sp
     */
    public void setSp(java.lang.String sp) {
        this.sp = sp;
    }


    /**
     * Gets the pc value for this ContactInfo.
     * 
     * @return pc
     */
    public java.lang.String getPc() {
        return pc;
    }


    /**
     * Sets the pc value for this ContactInfo.
     * 
     * @param pc
     */
    public void setPc(java.lang.String pc) {
        this.pc = pc;
    }


    /**
     * Gets the cc value for this ContactInfo.
     * 
     * @return cc
     */
    public java.lang.String getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this ContactInfo.
     * 
     * @param cc
     */
    public void setCc(java.lang.String cc) {
        this.cc = cc;
    }


    /**
     * Gets the phone value for this ContactInfo.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this ContactInfo.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this ContactInfo.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this ContactInfo.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactInfo)) return false;
        ContactInfo other = (ContactInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fname==null && other.getFname()==null) || 
             (this.fname!=null &&
              this.fname.equals(other.getFname()))) &&
            ((this.lname==null && other.getLname()==null) || 
             (this.lname!=null &&
              this.lname.equals(other.getLname()))) &&
            ((this.org==null && other.getOrg()==null) || 
             (this.org!=null &&
              this.org.equals(other.getOrg()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.sa1==null && other.getSa1()==null) || 
             (this.sa1!=null &&
              this.sa1.equals(other.getSa1()))) &&
            ((this.sa2==null && other.getSa2()==null) || 
             (this.sa2!=null &&
              this.sa2.equals(other.getSa2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.sp==null && other.getSp()==null) || 
             (this.sp!=null &&
              this.sp.equals(other.getSp()))) &&
            ((this.pc==null && other.getPc()==null) || 
             (this.pc!=null &&
              this.pc.equals(other.getPc()))) &&
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax())));
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
        if (getFname() != null) {
            _hashCode += getFname().hashCode();
        }
        if (getLname() != null) {
            _hashCode += getLname().hashCode();
        }
        if (getOrg() != null) {
            _hashCode += getOrg().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getSa1() != null) {
            _hashCode += getSa1().hashCode();
        }
        if (getSa2() != null) {
            _hashCode += getSa2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getSp() != null) {
            _hashCode += getSp().hashCode();
        }
        if (getPc() != null) {
            _hashCode += getPc().hashCode();
        }
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "ContactInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "fname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "lname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "org"));
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
        elemField.setFieldName("sa1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sa1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sa2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sa2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "sp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "pc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "cc"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "fax"));
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
