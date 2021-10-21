/**
 * Nexus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class Nexus  implements java.io.Serializable {
	private java.lang.String category;

	private java.lang.String use;

	private java.lang.String country;

	public Nexus() {
	}

	public Nexus(
		   java.lang.String category,
		   java.lang.String use,
		   java.lang.String country) {
		   this.category = category;
		   this.use = use;
		   this.country = country;
	}


	/**
	 * Gets the category value for this Nexus.
	 *
	 * @return category
	 */
	public java.lang.String getCategory() {
		return category;
	}


	/**
	 * Sets the category value for this Nexus.
	 *
	 * @param category
	 */
	public void setCategory(java.lang.String category) {
		this.category = category;
	}


	/**
	 * Gets the use value for this Nexus.
	 *
	 * @return use
	 */
	public java.lang.String getUse() {
		return use;
	}


	/**
	 * Sets the use value for this Nexus.
	 *
	 * @param use
	 */
	public void setUse(java.lang.String use) {
		this.use = use;
	}


	/**
	 * Gets the country value for this Nexus.
	 *
	 * @return country
	 */
	public java.lang.String getCountry() {
		return country;
	}


	/**
	 * Sets the country value for this Nexus.
	 *
	 * @param country
	 */
	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	private java.lang.Object __equalsCalc = null;
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Nexus)) return false;
		Nexus other = (Nexus) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true &&
			((this.category==null && other.getCategory()==null) ||
			 (this.category!=null &&
			  this.category.equals(other.getCategory()))) &&
			((this.use==null && other.getUse()==null) ||
			 (this.use!=null &&
			  this.use.equals(other.getUse()))) &&
			((this.country==null && other.getCountry()==null) ||
			 (this.country!=null &&
			  this.country.equals(other.getCountry())));
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
		if (getCategory() != null) {
			_hashCode += getCategory().hashCode();
		}
		if (getUse() != null) {
			_hashCode += getUse().hashCode();
		}
		if (getCountry() != null) {
			_hashCode += getCountry().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
		new org.apache.axis.description.TypeDesc(Nexus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "Nexus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("category");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "category"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("use");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "use"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("country");
		elemField.setXmlName(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "country"));
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
