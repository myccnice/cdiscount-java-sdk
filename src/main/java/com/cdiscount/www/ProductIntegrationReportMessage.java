/*
 * XML Type:  ProductIntegrationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductIntegrationReportMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ProductIntegrationReportMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ProductIntegrationReportMessage extends com.cdiscount.www.ServiceBaseAPIMessage
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductIntegrationReportMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("productintegrationreportmessage2809type");
    
    /**
     * Gets the "NumberOfErrors" element
     */
    int getNumberOfErrors();
    
    /**
     * Gets (as xml) the "NumberOfErrors" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfErrors();
    
    /**
     * True if has "NumberOfErrors" element
     */
    boolean isSetNumberOfErrors();
    
    /**
     * Sets the "NumberOfErrors" element
     */
    void setNumberOfErrors(int numberOfErrors);
    
    /**
     * Sets (as xml) the "NumberOfErrors" element
     */
    void xsetNumberOfErrors(org.apache.xmlbeans.XmlInt numberOfErrors);
    
    /**
     * Unsets the "NumberOfErrors" element
     */
    void unsetNumberOfErrors();
    
    /**
     * Gets the "PackageId" element
     */
    long getPackageId();
    
    /**
     * Gets (as xml) the "PackageId" element
     */
    org.apache.xmlbeans.XmlLong xgetPackageId();
    
    /**
     * True if has "PackageId" element
     */
    boolean isSetPackageId();
    
    /**
     * Sets the "PackageId" element
     */
    void setPackageId(long packageId);
    
    /**
     * Sets (as xml) the "PackageId" element
     */
    void xsetPackageId(org.apache.xmlbeans.XmlLong packageId);
    
    /**
     * Unsets the "PackageId" element
     */
    void unsetPackageId();
    
    /**
     * Gets the "PackageIntegrationStatus" element
     */
    java.lang.String getPackageIntegrationStatus();
    
    /**
     * Gets (as xml) the "PackageIntegrationStatus" element
     */
    org.apache.xmlbeans.XmlString xgetPackageIntegrationStatus();
    
    /**
     * Tests for nil "PackageIntegrationStatus" element
     */
    boolean isNilPackageIntegrationStatus();
    
    /**
     * True if has "PackageIntegrationStatus" element
     */
    boolean isSetPackageIntegrationStatus();
    
    /**
     * Sets the "PackageIntegrationStatus" element
     */
    void setPackageIntegrationStatus(java.lang.String packageIntegrationStatus);
    
    /**
     * Sets (as xml) the "PackageIntegrationStatus" element
     */
    void xsetPackageIntegrationStatus(org.apache.xmlbeans.XmlString packageIntegrationStatus);
    
    /**
     * Nils the "PackageIntegrationStatus" element
     */
    void setNilPackageIntegrationStatus();
    
    /**
     * Unsets the "PackageIntegrationStatus" element
     */
    void unsetPackageIntegrationStatus();
    
    /**
     * Gets the "ProductLogList" element
     */
    com.cdiscount.www.ArrayOfProductReportLog getProductLogList();
    
    /**
     * Tests for nil "ProductLogList" element
     */
    boolean isNilProductLogList();
    
    /**
     * True if has "ProductLogList" element
     */
    boolean isSetProductLogList();
    
    /**
     * Sets the "ProductLogList" element
     */
    void setProductLogList(com.cdiscount.www.ArrayOfProductReportLog productLogList);
    
    /**
     * Appends and returns a new empty "ProductLogList" element
     */
    com.cdiscount.www.ArrayOfProductReportLog addNewProductLogList();
    
    /**
     * Nils the "ProductLogList" element
     */
    void setNilProductLogList();
    
    /**
     * Unsets the "ProductLogList" element
     */
    void unsetProductLogList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ProductIntegrationReportMessage newInstance() {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ProductIntegrationReportMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ProductIntegrationReportMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
