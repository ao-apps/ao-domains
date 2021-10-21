/**
 * DomainBackOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class DomainBackOrder  extends com.aoindustries.domains.wwd.wapi.Order  implements java.io.Serializable {
	private com.aoindustries.domains.wwd.wapi.OrderItem order;

	private boolean privateBackOrder;

	private java.lang.String sld;

	private java.lang.String tld;

	private com.aoindustries.domains.wwd.wapi.ContactInfo registrant;

	private com.aoindustries.domains.wwd.wapi.Nexus nexus;

	private com.aoindustries.domains.wwd.wapi.ContactInfo admin;

	private com.aoindustries.domains.wwd.wapi.ContactInfo billing;

	private com.aoindustries.domains.wwd.wapi.ContactInfo tech;

	public DomainBackOrder() {
	}

	public DomainBackOrder(
		   com.aoindustries.domains.wwd.wapi.OrderItem order,
		   boolean privateBackOrder,
		   java.lang.String sld,
		   java.lang.String tld,
		   com.aoindustries.domains.wwd.wapi.ContactInfo registrant,
		   com.aoindustries.domains.wwd.wapi.Nexus nexus,
		   com.aoindustries.domains.wwd.wapi.ContactInfo admin,
		   com.aoindustries.domains.wwd.wapi.ContactInfo billing,
		   com.aoindustries.domains.wwd.wapi.ContactInfo tech) {
		this.order = order;
		this.privateBackOrder = privateBackOrder;
		this.sld = sld;
		this.tld = tld;
		this.registrant = registrant;
		this.nexus = nexus;
		this.admin = admin;
		this.billing = billing;
		this.tech = tech;
	}


	/**
	 * Gets the order value for this DomainBackOrder.
	 *
	 * @return order
	 */
	public com.aoindustries.domains.wwd.wapi.OrderItem getOrder() {
		return order;
	}


	/**
	 * Sets the order value for this DomainBackOrder.
	 *
	 * @param order
	 */
	public void setOrder(com.aoindustries.domains.wwd.wapi.OrderItem order) {
		this.order = order;
	}


	/**
	 * Gets the privateBackOrder value for this DomainBackOrder.
	 *
	 * @return privateBackOrder
	 */
	public boolean isPrivateBackOrder() {
		return privateBackOrder;
	}


	/**
	 * Sets the privateBackOrder value for this DomainBackOrder.
	 *
	 * @param privateBackOrder
	 */
	public void setPrivateBackOrder(boolean privateBackOrder) {
		this.privateBackOrder = privateBackOrder;
	}


	/**
	 * Gets the sld value for this DomainBackOrder.
	 *
	 * @return sld
	 */
	public java.lang.String getSld() {
		return sld;
	}


	/**
	 * Sets the sld value for this DomainBackOrder.
	 *
	 * @param sld
	 */
	public void setSld(java.lang.String sld) {
		this.sld = sld;
	}


	/**
	 * Gets the tld value for this DomainBackOrder.
	 *
	 * @return tld
	 */
	public java.lang.String getTld() {
		return tld;
	}


	/**
	 * Sets the tld value for this DomainBackOrder.
	 *
	 * @param tld
	 */
	public void setTld(java.lang.String tld) {
		this.tld = tld;
	}


	/**
	 * Gets the registrant value for this DomainBackOrder.
	 *
	 * @return registrant
	 */
	public com.aoindustries.domains.wwd.wapi.ContactInfo getRegistrant() {
		return registrant;
	}


	/**
	 * Sets the registrant value for this DomainBackOrder.
	 *
	 * @param registrant
	 */
	public void setRegistrant(com.aoindustries.domains.wwd.wapi.ContactInfo registrant) {
		this.registrant = registrant;
	}


	/**
	 * Gets the nexus value for this DomainBackOrder.
	 *
	 * @return nexus
	 */
	public com.aoindustries.domains.wwd.wapi.Nexus getNexus() {
		return nexus;
	}


	/**
	 * Sets the nexus value for this DomainBackOrder.
	 *
	 * @param nexus
	 */
	public void setNexus(com.aoindustries.domains.wwd.wapi.Nexus nexus) {
		this.nexus = nexus;
	}


	/**
	 * Gets the admin value for this DomainBackOrder.
	 *
	 * @return admin
	 */
	public com.aoindustries.domains.wwd.wapi.ContactInfo getAdmin() {
		return admin;
	}


	/**
	 * Sets the admin value for this DomainBackOrder.
	 *
	 * @param admin
	 */
	public void setAdmin(com.aoindustries.domains.wwd.wapi.ContactInfo admin) {
		this.admin = admin;
	}


	/**
	 * Gets the billing value for this DomainBackOrder.
	 *
	 * @return billing
	 */
	public com.aoindustries.domains.wwd.wapi.ContactInfo getBilling() {
		return billing;
	}


	/**
	 * Sets the billing value for this DomainBackOrder.
	 *
	 * @param billing
	 */
	public void setBilling(com.aoindustries.domains.wwd.wapi.ContactInfo billing) {
		this.billing = billing;
	}


	/**
	 * Gets the tech value for this DomainBackOrder.
	 *
	 * @return tech
	 */
	public com.aoindustries.domains.wwd.wapi.ContactInfo getTech() {
		return tech;
	}


	/**
	 * Sets the tech value for this DomainBackOrder.
	 *
	 * @param tech
	 */
	public void setTech(com.aoindustries.domains.wwd.wapi.ContactInfo tech) {
		this.tech = tech;
	}

	private java.lang.Object __equalsCalc = null;
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DomainBackOrder)) return false;
		DomainBackOrder other = (DomainBackOrder) obj;
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
			this.privateBackOrder == other.isPrivateBackOrder() &&
			((this.sld==null && other.getSld()==null) ||
			 (this.sld!=null &&
			  this.sld.equals(other.getSld()))) &&
			((this.tld==null && other.getTld()==null) ||
			 (this.tld!=null &&
			  this.tld.equals(other.getTld()))) &&
			((this.registrant==null && other.getRegistrant()==null) ||
			 (this.registrant!=null &&
			  this.registrant.equals(other.getRegistrant()))) &&
			((this.nexus==null && other.getNexus()==null) ||
			 (this.nexus!=null &&
			  this.nexus.equals(other.getNexus()))) &&
			((this.admin==null && other.getAdmin()==null) ||
			 (this.admin!=null &&
			  this.admin.equals(other.getAdmin()))) &&
			((this.billing==null && other.getBilling()==null) ||
			 (this.billing!=null &&
			  this.billing.equals(other.getBilling()))) &&
			((this.tech==null && other.getTech()==null) ||
			 (this.tech!=null &&
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
		int _hashCode = super.hashCode();
		if (getOrder() != null) {
			_hashCode += getOrder().hashCode();
		}
		_hashCode += (isPrivateBackOrder() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getSld() != null) {
			_hashCode += getSld().hashCode();
		}
		if (getTld() != null) {
			_hashCode += getTld().hashCode();
		}
		if (getRegistrant() != null) {
			_hashCode += getRegistrant().hashCode();
		}
		if (getNexus() != null) {
			_hashCode += getNexus().hashCode();
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
		new org.apache.axis.description.TypeDesc(DomainBackOrder.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "DomainBackOrder"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("order");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "order"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "OrderItem"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privateBackOrder");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "privateBackOrder"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
