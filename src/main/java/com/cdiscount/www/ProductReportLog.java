/*
 * XML Type:  ProductReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductReportLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ProductReportLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ProductReportLog extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductReportLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("productreportlog9d04type");
    
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
     * Gets the "ProductIntegrationStatus" element
     */
    java.lang.String getProductIntegrationStatus();
    
    /**
     * Gets (as xml) the "ProductIntegrationStatus" element
     */
    org.apache.xmlbeans.XmlString xgetProductIntegrationStatus();
    
    /**
     * Tests for nil "ProductIntegrationStatus" element
     */
    boolean isNilProductIntegrationStatus();
    
    /**
     * True if has "ProductIntegrationStatus" element
     */
    boolean isSetProductIntegrationStatus();
    
    /**
     * Sets the "ProductIntegrationStatus" element
     */
    void setProductIntegrationStatus(java.lang.String productIntegrationStatus);
    
    /**
     * Sets (as xml) the "ProductIntegrationStatus" element
     */
    void xsetProductIntegrationStatus(org.apache.xmlbeans.XmlString productIntegrationStatus);
    
    /**
     * Nils the "ProductIntegrationStatus" element
     */
    void setNilProductIntegrationStatus();
    
    /**
     * Unsets the "ProductIntegrationStatus" element
     */
    void unsetProductIntegrationStatus();
    
    /**
     * Gets the "PropertyList" element
     */
    com.cdiscount.www.ArrayOfProductReportPropertyLog getPropertyList();
    
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
    void setPropertyList(com.cdiscount.www.ArrayOfProductReportPropertyLog propertyList);
    
    /**
     * Appends and returns a new empty "PropertyList" element
     */
    com.cdiscount.www.ArrayOfProductReportPropertyLog addNewPropertyList();
    
    /**
     * Nils the "PropertyList" element
     */
    void setNilPropertyList();
    
    /**
     * Unsets the "PropertyList" element
     */
    void unsetPropertyList();
    
    /**
     * Gets the "SKU" element
     */
    java.lang.String getSKU();
    
    /**
     * Gets (as xml) the "SKU" element
     */
    org.apache.xmlbeans.XmlString xgetSKU();
    
    /**
     * Tests for nil "SKU" element
     */
    boolean isNilSKU();
    
    /**
     * True if has "SKU" element
     */
    boolean isSetSKU();
    
    /**
     * Sets the "SKU" element
     */
    void setSKU(java.lang.String sku);
    
    /**
     * Sets (as xml) the "SKU" element
     */
    void xsetSKU(org.apache.xmlbeans.XmlString sku);
    
    /**
     * Nils the "SKU" element
     */
    void setNilSKU();
    
    /**
     * Unsets the "SKU" element
     */
    void unsetSKU();
    
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
        public static com.cdiscount.www.ProductReportLog newInstance() {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ProductReportLog newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ProductReportLog parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ProductReportLog parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ProductReportLog parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ProductReportLog parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ProductReportLog parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ProductReportLog parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ProductReportLog parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ProductReportLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ProductReportLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ProductReportLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
