/**
 * WAPISoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.domains.wwd.wapi;

public interface WAPISoap_PortType extends java.rmi.Remote {

  /**
   * Provide support for calling WWD services using legacy WAPI
   * request XMLs.
   */
  public java.lang.String processRequest(java.lang.String sRequestXML) throws java.rmi.RemoteException;

  /**
   * Returns activity timeout and version information from the server.
   */
  public java.lang.String describe(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential) throws java.rmi.RemoteException;

  /**
   * Checks the availability of domains, hosts and name servers.
   */
  public java.lang.String checkAvailability(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String[] sDomainArray, java.lang.String[] sHostArray, java.lang.String[] sNSArray) throws java.rmi.RemoteException;

  /**
   * Gets information about items that have been previously ordered.
   */
  public java.lang.String info(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sResourceID, java.lang.String sType, java.lang.String sDomain, java.lang.String sOrderID) throws java.rmi.RemoteException;

  /**
   * Used to get the list of alternative domain names based on a
   * given name.
   */
  public java.lang.String nameGen(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sSLD, java.lang.String sTLD, java.lang.String sTLDs, org.apache.axis.types.UnsignedShort nRows, boolean bHypens, boolean bNumbers, org.apache.axis.types.UnsignedShort nMaxLen, boolean bIntelliSearch, org.apache.axis.types.UnsignedShort nPage, java.lang.String sTime) throws java.rmi.RemoteException;

  /**
   * Used to get the list of alternative domain names based on a
   * given name (Domains Bot Service).
   */
  public java.lang.String nameGenDB(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sKey, int nMaxResults, boolean bExcludeTaken, java.lang.String sTLDs, boolean bAddPrefix, boolean bAddSuffix, boolean bAddDashes, boolean bAddRelated, boolean bAdvancedSplit, boolean bBaseOnTop) throws java.rmi.RemoteException;

  /**
   * Used to get the list of alternative domain names based on a
   * given name (Domains Bot Service).
   */
  public java.lang.String nameGenDBWithTimeLimit(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sKey, int nMaxResults, boolean bExcludeTaken, java.lang.String sTLDs, boolean bAddPrefix, boolean bAddSuffix, boolean bAddDashes, boolean bAddRelated, boolean bAdvancedSplit, boolean bBaseOnTop, int nMaxWaitSeconds) throws java.rmi.RemoteException;

  /**
   * Used to retrieve status notifications about pending orders.
   */
  public java.lang.String poll(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sOp) throws java.rmi.RemoteException;

  /**
   * Used to place an order on items that do not require customization
   * (non-domain).
   */
  public java.lang.String orderCredits(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.OrderItem[] items, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for registering new domain names.
   */
  public java.lang.String orderDomains(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainRegistration[] items, com.aoindustries.domains.wwd.wapi.DomainByProxy[] dbpItems, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for renewing registration for existing public domain names.
   */
  public java.lang.String orderDomainRenewals(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainRenewal[] items, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for renewing registration for existing private domain
   * names.
   */
  public java.lang.String orderPrivateDomainRenewals(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainRenewal[] items, com.aoindustries.domains.wwd.wapi.ResourceRenewal[] dbpItems, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for transfering ownership of a domain from one user to
   * another.
   */
  public java.lang.String orderDomainTransfers(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainTransfer[] items, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for adding privacy to a domain registration.
   */
  public java.lang.String orderDomainPrivacy(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainByProxy[] items, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for renewing non-domain items.
   */
  public java.lang.String orderResourceRenewals(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.ResourceRenewal[] items, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for back ordering an existing (public or private) domain
   * name.
   */
  public java.lang.String orderDomainBackOrders(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Shopper shopper, com.aoindustries.domains.wwd.wapi.DomainBackOrder[] items, java.lang.String sROID) throws java.rmi.RemoteException;

  /**
   * Used for cancelling existing resources.
   */
  public java.lang.String cancel(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sType, java.lang.String[] sIDArray) throws java.rmi.RemoteException;

  /**
   * Used for changing the ownership of a resource from one end
   * user to another (both must be end-users of the currently logged in
   * reseller).
   */
  public java.lang.String updateDomainOwnership(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sResourceID, java.lang.String sLosingOwner, com.aoindustries.domains.wwd.wapi.GainingOwner gaining) throws java.rmi.RemoteException;

  /**
   * Used for resetting the user's password in the WWD system.
   */
  public java.lang.String resetPassword(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, java.lang.String sPwd, java.lang.String sEmail, java.lang.String sPwdHint) throws java.rmi.RemoteException;

  /**
   * Used for allowing the reseller to modify the user information
   * for either their top-level account or any of its sub-accounts.
   */
  public java.lang.String setShopperInfo(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, java.lang.String sEmail, java.lang.String sFirstName, java.lang.String sLastName, java.lang.String sPhone, java.lang.String sFax, java.lang.String sCompany, java.lang.String sAddress, java.lang.String sCity, java.lang.String sState, java.lang.String sZip, java.lang.String sCountry, java.lang.String sShopperPin) throws java.rmi.RemoteException;

  /**
   * Used for creating a new reseller sub-account.
   */
  public java.lang.String createNewShopper(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sPwd, java.lang.String sEmail, java.lang.String sFirstName, java.lang.String sLastName, java.lang.String sPhone, java.lang.String sPwdHint, java.lang.String sFax, java.lang.String sCompany, java.lang.String sAddress, java.lang.String sCity, java.lang.String sState, java.lang.String sZip, java.lang.String sCountry, java.lang.String sShopperPin) throws java.rmi.RemoteException;

  /**
   * Used for checking whether the account information for the specified
   * user is valid or not.
   */
  public java.lang.String checkUser(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sType, java.lang.String sUser, java.lang.String sPwd) throws java.rmi.RemoteException;

  /**
   * Used for setting domain alert credit or backorder a domain.
   */
  public java.lang.String setupDomainAlert(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DomainAlert domainAlert, com.aoindustries.domains.wwd.wapi.ContactInfo registrant) throws java.rmi.RemoteException;

  /**
   * Used for updating an existing domain alert record.
   */
  public java.lang.String updateDomainAlert(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DomainAlert domainAlert, java.lang.String sDomainMonitorID, com.aoindustries.domains.wwd.wapi.ContactInfo registrant) throws java.rmi.RemoteException;

  /**
   * Used for removing an existing domain alert record.
   */
  public java.lang.String removeDomainAlert(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sDomainMonitorID, java.lang.String sUser) throws java.rmi.RemoteException;

  /**
   * Used for querying the number of domain alert, private backorder,
   * and backorder credits.
   */
  public java.lang.String getDomainAlertCredits(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser) throws java.rmi.RemoteException;

  /**
   * Used for querying a list of monitored domains.
   */
  public java.lang.String getMonitoredDomainList(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, int nPage, int nRowsPerPage) throws java.rmi.RemoteException;

  /**
   * This method is used to get the list of expiring domain names
   * for users that have an Investors Edge subscription.
   */
  public java.lang.String getExpiringNameList(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, int nLength, java.lang.String sDashes, java.lang.String sNumbers, java.lang.String sWildCardSearch, java.lang.String sSearchCriteria, java.lang.String sTLDs, int nPage, int nRowsPerPage) throws java.rmi.RemoteException;

  /**
   * This method is used for forwarding a domain to a specified
   * URL.
   */
  public java.lang.String domainForwarding(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, java.lang.String sUser, int nDomainID, java.lang.String sForwardingURL, java.lang.String sMngTRID) throws java.rmi.RemoteException;

  /**
   * This method is used for modifying associated name servers for
   * the given domains.
   */
  public java.lang.String updateNameServer(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, com.aoindustries.domains.wwd.wapi.NS[] nsArray) throws java.rmi.RemoteException;

  /**
   * This method is used for modifying associated contact information
   * for the given domains.
   */
  public java.lang.String updateDomainContact(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, com.aoindustries.domains.wwd.wapi.ContactInfo registrant, com.aoindustries.domains.wwd.wapi.ContactInfo admin, com.aoindustries.domains.wwd.wapi.ContactInfo billing, com.aoindustries.domains.wwd.wapi.ContactInfo tech) throws java.rmi.RemoteException;

  /**
   * This method is used for setting or clearing the lock on a list
   * of domains.
   */
  public java.lang.String setDomainLocking(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sLock) throws java.rmi.RemoteException;

  /**
   * This method is used for managing the transfer of domains.
   */
  public java.lang.String manageTransfer(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sAction) throws java.rmi.RemoteException;

  /**
   * This method is used for performing multiple domain forwarding.
   */
  public java.lang.String updateDomainForwarding(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sAction, java.lang.String sForwardingURL) throws java.rmi.RemoteException;

  /**
   * This method is used for performing multiple domain masking.
   */
  public java.lang.String updateDomainMasking(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.Domain[] domainArray, java.lang.String sAction, java.lang.String sForwardingURL, java.lang.String sMaskingMetatagTitle, java.lang.String sMaskingMetatagDesc, java.lang.String sMaskingMetatagKeyword) throws java.rmi.RemoteException;

  /**
   * This method is used for modifying DNS settings for a given
   * domain.
   */
  public java.lang.String modifyDNS(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DNSRequest[] dnsRequestArray, java.lang.String sDomain) throws java.rmi.RemoteException;

  /**
   * This method is used for validating a domain's period and contacts.
   */
  public java.lang.String validateRegistration(java.lang.String sCLTRID, com.aoindustries.domains.wwd.wapi.Credential credential, com.aoindustries.domains.wwd.wapi.DomainContacts domainContacts, com.aoindustries.domains.wwd.wapi.DomainData[] domainDataArray) throws java.rmi.RemoteException;
}
