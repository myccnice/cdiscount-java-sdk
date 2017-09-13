/*
 * XML Type:  ContextMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages;


/**
 * An XML ContextMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public interface ContextMessage extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContextMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("contextmessagee030type");
    
    /**
     * Gets the "CatalogID" element
     */
    int getCatalogID();
    
    /**
     * Gets (as xml) the "CatalogID" element
     */
    org.apache.xmlbeans.XmlInt xgetCatalogID();
    
    /**
     * Tests for nil "CatalogID" element
     */
    boolean isNilCatalogID();
    
    /**
     * True if has "CatalogID" element
     */
    boolean isSetCatalogID();
    
    /**
     * Sets the "CatalogID" element
     */
    void setCatalogID(int catalogID);
    
    /**
     * Sets (as xml) the "CatalogID" element
     */
    void xsetCatalogID(org.apache.xmlbeans.XmlInt catalogID);
    
    /**
     * Nils the "CatalogID" element
     */
    void setNilCatalogID();
    
    /**
     * Unsets the "CatalogID" element
     */
    void unsetCatalogID();
    
    /**
     * Gets the "ConfigurationPolicy" element
     */
    java.lang.String getConfigurationPolicy();
    
    /**
     * Gets (as xml) the "ConfigurationPolicy" element
     */
    org.apache.xmlbeans.XmlString xgetConfigurationPolicy();
    
    /**
     * Tests for nil "ConfigurationPolicy" element
     */
    boolean isNilConfigurationPolicy();
    
    /**
     * True if has "ConfigurationPolicy" element
     */
    boolean isSetConfigurationPolicy();
    
    /**
     * Sets the "ConfigurationPolicy" element
     */
    void setConfigurationPolicy(java.lang.String configurationPolicy);
    
    /**
     * Sets (as xml) the "ConfigurationPolicy" element
     */
    void xsetConfigurationPolicy(org.apache.xmlbeans.XmlString configurationPolicy);
    
    /**
     * Nils the "ConfigurationPolicy" element
     */
    void setNilConfigurationPolicy();
    
    /**
     * Unsets the "ConfigurationPolicy" element
     */
    void unsetConfigurationPolicy();
    
    /**
     * Gets the "CustomerID" element
     */
    java.lang.String getCustomerID();
    
    /**
     * Gets (as xml) the "CustomerID" element
     */
    org.apache.xmlbeans.XmlString xgetCustomerID();
    
    /**
     * Tests for nil "CustomerID" element
     */
    boolean isNilCustomerID();
    
    /**
     * True if has "CustomerID" element
     */
    boolean isSetCustomerID();
    
    /**
     * Sets the "CustomerID" element
     */
    void setCustomerID(java.lang.String customerID);
    
    /**
     * Sets (as xml) the "CustomerID" element
     */
    void xsetCustomerID(org.apache.xmlbeans.XmlString customerID);
    
    /**
     * Nils the "CustomerID" element
     */
    void setNilCustomerID();
    
    /**
     * Unsets the "CustomerID" element
     */
    void unsetCustomerID();
    
    /**
     * Gets the "CustomerId" element
     */
    int getCustomerId();
    
    /**
     * Gets (as xml) the "CustomerId" element
     */
    org.apache.xmlbeans.XmlInt xgetCustomerId();
    
    /**
     * True if has "CustomerId" element
     */
    boolean isSetCustomerId();
    
    /**
     * Sets the "CustomerId" element
     */
    void setCustomerId(int customerId);
    
    /**
     * Sets (as xml) the "CustomerId" element
     */
    void xsetCustomerId(org.apache.xmlbeans.XmlInt customerId);
    
    /**
     * Unsets the "CustomerId" element
     */
    void unsetCustomerId();
    
    /**
     * Gets the "CustomerNumber" element
     */
    java.lang.String getCustomerNumber();
    
    /**
     * Gets (as xml) the "CustomerNumber" element
     */
    org.apache.xmlbeans.XmlString xgetCustomerNumber();
    
    /**
     * Tests for nil "CustomerNumber" element
     */
    boolean isNilCustomerNumber();
    
    /**
     * True if has "CustomerNumber" element
     */
    boolean isSetCustomerNumber();
    
    /**
     * Sets the "CustomerNumber" element
     */
    void setCustomerNumber(java.lang.String customerNumber);
    
    /**
     * Sets (as xml) the "CustomerNumber" element
     */
    void xsetCustomerNumber(org.apache.xmlbeans.XmlString customerNumber);
    
    /**
     * Nils the "CustomerNumber" element
     */
    void setNilCustomerNumber();
    
    /**
     * Unsets the "CustomerNumber" element
     */
    void unsetCustomerNumber();
    
    /**
     * Gets the "CustomerPoolID" element
     */
    int getCustomerPoolID();
    
    /**
     * Gets (as xml) the "CustomerPoolID" element
     */
    org.apache.xmlbeans.XmlInt xgetCustomerPoolID();
    
    /**
     * Tests for nil "CustomerPoolID" element
     */
    boolean isNilCustomerPoolID();
    
    /**
     * True if has "CustomerPoolID" element
     */
    boolean isSetCustomerPoolID();
    
    /**
     * Sets the "CustomerPoolID" element
     */
    void setCustomerPoolID(int customerPoolID);
    
    /**
     * Sets (as xml) the "CustomerPoolID" element
     */
    void xsetCustomerPoolID(org.apache.xmlbeans.XmlInt customerPoolID);
    
    /**
     * Nils the "CustomerPoolID" element
     */
    void setNilCustomerPoolID();
    
    /**
     * Unsets the "CustomerPoolID" element
     */
    void unsetCustomerPoolID();
    
    /**
     * Gets the "GeoCoordinate" element
     */
    org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate getGeoCoordinate();
    
    /**
     * Tests for nil "GeoCoordinate" element
     */
    boolean isNilGeoCoordinate();
    
    /**
     * True if has "GeoCoordinate" element
     */
    boolean isSetGeoCoordinate();
    
    /**
     * Sets the "GeoCoordinate" element
     */
    void setGeoCoordinate(org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate geoCoordinate);
    
    /**
     * Appends and returns a new empty "GeoCoordinate" element
     */
    org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate addNewGeoCoordinate();
    
    /**
     * Nils the "GeoCoordinate" element
     */
    void setNilGeoCoordinate();
    
    /**
     * Unsets the "GeoCoordinate" element
     */
    void unsetGeoCoordinate();
    
    /**
     * Gets the "SecuredContext" element
     */
    boolean getSecuredContext();
    
    /**
     * Gets (as xml) the "SecuredContext" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSecuredContext();
    
    /**
     * True if has "SecuredContext" element
     */
    boolean isSetSecuredContext();
    
    /**
     * Sets the "SecuredContext" element
     */
    void setSecuredContext(boolean securedContext);
    
    /**
     * Sets (as xml) the "SecuredContext" element
     */
    void xsetSecuredContext(org.apache.xmlbeans.XmlBoolean securedContext);
    
    /**
     * Unsets the "SecuredContext" element
     */
    void unsetSecuredContext();
    
    /**
     * Gets the "SiteID" element
     */
    int getSiteID();
    
    /**
     * Gets (as xml) the "SiteID" element
     */
    org.apache.xmlbeans.XmlInt xgetSiteID();
    
    /**
     * Sets the "SiteID" element
     */
    void setSiteID(int siteID);
    
    /**
     * Sets (as xml) the "SiteID" element
     */
    void xsetSiteID(org.apache.xmlbeans.XmlInt siteID);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
