/**
 * WAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public interface WAPI extends javax.xml.rpc.Service {
  public java.lang.String getWAPISoapAddress();

  public com.aoindustries.domains.wwd.wapi.WAPISoap_PortType getWAPISoap() throws javax.xml.rpc.ServiceException;

  public com.aoindustries.domains.wwd.wapi.WAPISoap_PortType getWAPISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
