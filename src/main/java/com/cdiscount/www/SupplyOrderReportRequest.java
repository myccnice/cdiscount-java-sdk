/*
 * XML Type:  SupplyOrderReportRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML SupplyOrderReportRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface SupplyOrderReportRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupplyOrderReportRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("supplyorderreportrequestd249type");
    
    /**
     * Gets the "BeginCreationDate" element
     */
    java.util.Calendar getBeginCreationDate();
    
    /**
     * Gets (as xml) the "BeginCreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeginCreationDate();
    
    /**
     * Tests for nil "BeginCreationDate" element
     */
    boolean isNilBeginCreationDate();
    
    /**
     * True if has "BeginCreationDate" element
     */
    boolean isSetBeginCreationDate();
    
    /**
     * Sets the "BeginCreationDate" element
     */
    void setBeginCreationDate(java.util.Calendar beginCreationDate);
    
    /**
     * Sets (as xml) the "BeginCreationDate" element
     */
    void xsetBeginCreationDate(org.apache.xmlbeans.XmlDateTime beginCreationDate);
    
    /**
     * Nils the "BeginCreationDate" element
     */
    void setNilBeginCreationDate();
    
    /**
     * Unsets the "BeginCreationDate" element
     */
    void unsetBeginCreationDate();
    
    /**
     * Gets the "DepositIdList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint getDepositIdList();
    
    /**
     * Tests for nil "DepositIdList" element
     */
    boolean isNilDepositIdList();
    
    /**
     * True if has "DepositIdList" element
     */
    boolean isSetDepositIdList();
    
    /**
     * Sets the "DepositIdList" element
     */
    void setDepositIdList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint depositIdList);
    
    /**
     * Appends and returns a new empty "DepositIdList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint addNewDepositIdList();
    
    /**
     * Nils the "DepositIdList" element
     */
    void setNilDepositIdList();
    
    /**
     * Unsets the "DepositIdList" element
     */
    void unsetDepositIdList();
    
    /**
     * Gets the "EndCreationDate" element
     */
    java.util.Calendar getEndCreationDate();
    
    /**
     * Gets (as xml) the "EndCreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndCreationDate();
    
    /**
     * Tests for nil "EndCreationDate" element
     */
    boolean isNilEndCreationDate();
    
    /**
     * True if has "EndCreationDate" element
     */
    boolean isSetEndCreationDate();
    
    /**
     * Sets the "EndCreationDate" element
     */
    void setEndCreationDate(java.util.Calendar endCreationDate);
    
    /**
     * Sets (as xml) the "EndCreationDate" element
     */
    void xsetEndCreationDate(org.apache.xmlbeans.XmlDateTime endCreationDate);
    
    /**
     * Nils the "EndCreationDate" element
     */
    void setNilEndCreationDate();
    
    /**
     * Unsets the "EndCreationDate" element
     */
    void unsetEndCreationDate();
    
    /**
     * Gets the "PageNumber" element
     */
    int getPageNumber();
    
    /**
     * Gets (as xml) the "PageNumber" element
     */
    org.apache.xmlbeans.XmlInt xgetPageNumber();
    
    /**
     * True if has "PageNumber" element
     */
    boolean isSetPageNumber();
    
    /**
     * Sets the "PageNumber" element
     */
    void setPageNumber(int pageNumber);
    
    /**
     * Sets (as xml) the "PageNumber" element
     */
    void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber);
    
    /**
     * Unsets the "PageNumber" element
     */
    void unsetPageNumber();
    
    /**
     * Gets the "PageSize" element
     */
    int getPageSize();
    
    /**
     * Gets (as xml) the "PageSize" element
     */
    org.apache.xmlbeans.XmlInt xgetPageSize();
    
    /**
     * Sets the "PageSize" element
     */
    void setPageSize(int pageSize);
    
    /**
     * Sets (as xml) the "PageSize" element
     */
    void xsetPageSize(org.apache.xmlbeans.XmlInt pageSize);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.SupplyOrderReportRequest newInstance() {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderReportRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderReportRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
