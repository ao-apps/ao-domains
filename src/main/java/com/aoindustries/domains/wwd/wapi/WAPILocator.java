/**
 * WAPILocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public class WAPILocator extends org.apache.axis.client.Service implements com.aoindustries.domains.wwd.wapi.WAPI {

    public WAPILocator() {
    }


    public WAPILocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WAPILocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WAPISoap
    private java.lang.String WAPISoap_address = "https://api.ote.wildwestdomains.com/wswwdapi/wapi.asmx";

    public java.lang.String getWAPISoapAddress() {
        return WAPISoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WAPISoapWSDDServiceName = "WAPISoap";

    public java.lang.String getWAPISoapWSDDServiceName() {
        return WAPISoapWSDDServiceName;
    }

    public void setWAPISoapWSDDServiceName(java.lang.String name) {
        WAPISoapWSDDServiceName = name;
    }

    public com.aoindustries.domains.wwd.wapi.WAPISoap_PortType getWAPISoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WAPISoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWAPISoap(endpoint);
    }

    public com.aoindustries.domains.wwd.wapi.WAPISoap_PortType getWAPISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.aoindustries.domains.wwd.wapi.WAPISoap_BindingStub _stub = new com.aoindustries.domains.wwd.wapi.WAPISoap_BindingStub(portAddress, this);
            _stub.setPortName(getWAPISoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWAPISoapEndpointAddress(java.lang.String address) {
        WAPISoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.aoindustries.domains.wwd.wapi.WAPISoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.aoindustries.domains.wwd.wapi.WAPISoap_BindingStub _stub = new com.aoindustries.domains.wwd.wapi.WAPISoap_BindingStub(new java.net.URL(WAPISoap_address), this);
                _stub.setPortName(getWAPISoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WAPISoap".equals(inputPortName)) {
            return getWAPISoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "WAPI");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wildwestdomains.com/webservices/", "WAPISoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WAPISoap".equals(portName)) {
            setWAPISoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
