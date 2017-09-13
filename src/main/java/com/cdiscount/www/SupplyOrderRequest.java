/*
 * XML Type:  SupplyOrderRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML SupplyOrderRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface SupplyOrderRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupplyOrderRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("supplyorderrequest5175type");
    
    /**
     * Gets the "BeginModificationDate" element
     */
    java.util.Calendar getBeginModificationDate();
    
    /**
     * Gets (as xml) the "BeginModificationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeginModificationDate();
    
    /**
     * Tests for nil "BeginModificationDate" element
     */
    boolean isNilBeginModificationDate();
    
    /**
     * True if has "BeginModificationDate" element
     */
    boolean isSetBeginModificationDate();
    
    /**
     * Sets the "BeginModificationDate" element
     */
    void setBeginModificationDate(java.util.Calendar beginModificationDate);
    
    /**
     * Sets (as xml) the "BeginModificationDate" element
     */
    void xsetBeginModificationDate(org.apache.xmlbeans.XmlDateTime beginModificationDate);
    
    /**
     * Nils the "BeginModificationDate" element
     */
    void setNilBeginModificationDate();
    
    /**
     * Unsets the "BeginModificationDate" element
     */
    void unsetBeginModificationDate();
    
    /**
     * Gets the "EndModificationDate" element
     */
    java.util.Calendar getEndModificationDate();
    
    /**
     * Gets (as xml) the "EndModificationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndModificationDate();
    
    /**
     * Tests for nil "EndModificationDate" element
     */
    boolean isNilEndModificationDate();
    
    /**
     * True if has "EndModificationDate" element
     */
    boolean isSetEndModificationDate();
    
    /**
     * Sets the "EndModificationDate" element
     */
    void setEndModificationDate(java.util.Calendar endModificationDate);
    
    /**
     * Sets (as xml) the "EndModificationDate" element
     */
    void xsetEndModificationDate(org.apache.xmlbeans.XmlDateTime endModificationDate);
    
    /**
     * Nils the "EndModificationDate" element
     */
    void setNilEndModificationDate();
    
    /**
     * Unsets the "EndModificationDate" element
     */
    void unsetEndModificationDate();
    
    /**
     * Gets the "PageNumber" element
     */
    int getPageNumber();
    
    /**
     * Gets (as xml) the "PageNumber" element
     */
    org.apache.xmlbeans.XmlInt xgetPageNumber();
    
    /**
     * Tests for nil "PageNumber" element
     */
    boolean isNilPageNumber();
    
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
     * Nils the "PageNumber" element
     */
    void setNilPageNumber();
    
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
     * Tests for nil "PageSize" element
     */
    boolean isNilPageSize();
    
    /**
     * True if has "PageSize" element
     */
    boolean isSetPageSize();
    
    /**
     * Sets the "PageSize" element
     */
    void setPageSize(int pageSize);
    
    /**
     * Sets (as xml) the "PageSize" element
     */
    void xsetPageSize(org.apache.xmlbeans.XmlInt pageSize);
    
    /**
     * Nils the "PageSize" element
     */
    void setNilPageSize();
    
    /**
     * Unsets the "PageSize" element
     */
    void unsetPageSize();
    
    /**
     * Gets the "SupplyOrderNumberList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getSupplyOrderNumberList();
    
    /**
     * Tests for nil "SupplyOrderNumberList" element
     */
    boolean isNilSupplyOrderNumberList();
    
    /**
     * True if has "SupplyOrderNumberList" element
     */
    boolean isSetSupplyOrderNumberList();
    
    /**
     * Sets the "SupplyOrderNumberList" element
     */
    void setSupplyOrderNumberList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring supplyOrderNumberList);
    
    /**
     * Appends and returns a new empty "SupplyOrderNumberList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewSupplyOrderNumberList();
    
    /**
     * Nils the "SupplyOrderNumberList" element
     */
    void setNilSupplyOrderNumberList();
    
    /**
     * Unsets the "SupplyOrderNumberList" element
     */
    void unsetSupplyOrderNumberList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.SupplyOrderRequest newInstance() {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SupplyOrderRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SupplyOrderRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
