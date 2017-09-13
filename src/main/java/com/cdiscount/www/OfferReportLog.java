/*
 * XML Type:  OfferReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferReportLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OfferReportLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface OfferReportLog extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferReportLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("offerreportlog48f1type");
    
    /**
     * Gets the "LogDate" element
     */
    java.util.Calendar getLogDate();
    
    /**
     * Gets (as xml) the "LogDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLogDate();
    
    /**
     * True if has "LogDate" element
     */
    boolean isSetLogDate();
    
    /**
     * Sets the "LogDate" element
     */
    void setLogDate(java.util.Calendar logDate);
    
    /**
     * Sets (as xml) the "LogDate" element
     */
    void xsetLogDate(org.apache.xmlbeans.XmlDateTime logDate);
    
    /**
     * Unsets the "LogDate" element
     */
    void unsetLogDate();
    
    /**
     * Gets the "OfferIntegrationStatus" element
     */
    java.lang.String getOfferIntegrationStatus();
    
    /**
     * Gets (as xml) the "OfferIntegrationStatus" element
     */
    org.apache.xmlbeans.XmlString xgetOfferIntegrationStatus();
    
    /**
     * Tests for nil "OfferIntegrationStatus" element
     */
    boolean isNilOfferIntegrationStatus();
    
    /**
     * True if has "OfferIntegrationStatus" element
     */
    boolean isSetOfferIntegrationStatus();
    
    /**
     * Sets the "OfferIntegrationStatus" element
     */
    void setOfferIntegrationStatus(java.lang.String offerIntegrationStatus);
    
    /**
     * Sets (as xml) the "OfferIntegrationStatus" element
     */
    void xsetOfferIntegrationStatus(org.apache.xmlbeans.XmlString offerIntegrationStatus);
    
    /**
     * Nils the "OfferIntegrationStatus" element
     */
    void setNilOfferIntegrationStatus();
    
    /**
     * Unsets the "OfferIntegrationStatus" element
     */
    void unsetOfferIntegrationStatus();
    
    /**
     * Gets the "ProductEan" element
     */
    java.lang.String getProductEan();
    
    /**
     * Gets (as xml) the "ProductEan" element
     */
    org.apache.xmlbeans.XmlString xgetProductEan();
    
    /**
     * Tests for nil "ProductEan" element
     */
    boolean isNilProductEan();
    
    /**
     * True if has "ProductEan" element
     */
    boolean isSetProductEan();
    
    /**
     * Sets the "ProductEan" element
     */
    void setProductEan(java.lang.String productEan);
    
    /**
     * Sets (as xml) the "ProductEan" element
     */
    void xsetProductEan(org.apache.xmlbeans.XmlString productEan);
    
    /**
     * Nils the "ProductEan" element
     */
    void setNilProductEan();
    
    /**
     * Unsets the "ProductEan" element
     */
    void unsetProductEan();
    
    /**
     * Gets the "PropertyList" element
     */
    com.cdiscount.www.ArrayOfOfferReportPropertyLog getPropertyList();
    
    /**
     * Tests for nil "PropertyList" element
     */
    boolean isNilPropertyList();
    
    /**
     * True if has "PropertyList" element
     */
    boolean isSetPropertyList();
    
    /**
     * Sets the "PropertyList" element
     */
    void setPropertyList(com.cdiscount.www.ArrayOfOfferReportPropertyLog propertyList);
    
    /**
     * Appends and returns a new empty "PropertyList" element
     */
    com.cdiscount.www.ArrayOfOfferReportPropertyLog addNewPropertyList();
    
    /**
     * Nils the "PropertyList" element
     */
    void setNilPropertyList();
    
    /**
     * Unsets the "PropertyList" element
     */
    void unsetPropertyList();
    
    /**
     * Gets the "SellerProductId" element
     */
    java.lang.String getSellerProductId();
    
    /**
     * Gets (as xml) the "SellerProductId" element
     */
    org.apache.xmlbeans.XmlString xgetSellerProductId();
    
    /**
     * Tests for nil "SellerProductId" element
     */
    boolean isNilSellerProductId();
    
    /**
     * True if has "SellerProductId" element
     */
    boolean isSetSellerProductId();
    
    /**
     * Sets the "SellerProductId" element
     */
    void setSellerProductId(java.lang.String sellerProductId);
    
    /**
     * Sets (as xml) the "SellerProductId" element
     */
    void xsetSellerProductId(org.apache.xmlbeans.XmlString sellerProductId);
    
    /**
     * Nils the "SellerProductId" element
     */
    void setNilSellerProductId();
    
    /**
     * Unsets the "SellerProductId" element
     */
    void unsetSellerProductId();
    
    /**
     * Gets the "Sku" element
     */
    java.lang.String getSku();
    
    /**
     * Gets (as xml) the "Sku" element
     */
    org.apache.xmlbeans.XmlString xgetSku();
    
    /**
     * Tests for nil "Sku" element
     */
    boolean isNilSku();
    
    /**
     * True if has "Sku" element
     */
    boolean isSetSku();
    
    /**
     * Sets the "Sku" element
     */
    void setSku(java.lang.String sku);
    
    /**
     * Sets (as xml) the "Sku" element
     */
    void xsetSku(org.apache.xmlbeans.XmlString sku);
    
    /**
     * Nils the "Sku" element
     */
    void setNilSku();
    
    /**
     * Unsets the "Sku" element
     */
    void unsetSku();
    
    /**
     * Gets the "Validated" element
     */
    boolean getValidated();
    
    /**
     * Gets (as xml) the "Validated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetValidated();
    
    /**
     * True if has "Validated" element
     */
    boolean isSetValidated();
    
    /**
     * Sets the "Validated" element
     */
    void setValidated(boolean validated);
    
    /**
     * Sets (as xml) the "Validated" element
     */
    void xsetValidated(org.apache.xmlbeans.XmlBoolean validated);
    
    /**
     * Unsets the "Validated" element
     */
    void unsetValidated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.OfferReportLog newInstance() {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OfferReportLog newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OfferReportLog parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OfferReportLog parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OfferReportLog parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OfferReportLog parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OfferReportLog parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OfferReportLog parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OfferReportLog parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferReportLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferReportLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
