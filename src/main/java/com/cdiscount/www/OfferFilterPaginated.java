/*
 * XML Type:  OfferFilterPaginated
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferFilterPaginated
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OfferFilterPaginated(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface OfferFilterPaginated extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferFilterPaginated.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("offerfilterpaginated018ctype");
    
    /**
     * Gets the "OfferFilterCriterion" element
     */
    com.cdiscount.www.OfferFilterCriterion.Enum getOfferFilterCriterion();
    
    /**
     * Gets (as xml) the "OfferFilterCriterion" element
     */
    com.cdiscount.www.OfferFilterCriterion xgetOfferFilterCriterion();
    
    /**
     * Tests for nil "OfferFilterCriterion" element
     */
    boolean isNilOfferFilterCriterion();
    
    /**
     * True if has "OfferFilterCriterion" element
     */
    boolean isSetOfferFilterCriterion();
    
    /**
     * Sets the "OfferFilterCriterion" element
     */
    void setOfferFilterCriterion(com.cdiscount.www.OfferFilterCriterion.Enum offerFilterCriterion);
    
    /**
     * Sets (as xml) the "OfferFilterCriterion" element
     */
    void xsetOfferFilterCriterion(com.cdiscount.www.OfferFilterCriterion offerFilterCriterion);
    
    /**
     * Nils the "OfferFilterCriterion" element
     */
    void setNilOfferFilterCriterion();
    
    /**
     * Unsets the "OfferFilterCriterion" element
     */
    void unsetOfferFilterCriterion();
    
    /**
     * Gets the "OfferPoolId" element
     */
    int getOfferPoolId();
    
    /**
     * Gets (as xml) the "OfferPoolId" element
     */
    org.apache.xmlbeans.XmlInt xgetOfferPoolId();
    
    /**
     * Tests for nil "OfferPoolId" element
     */
    boolean isNilOfferPoolId();
    
    /**
     * True if has "OfferPoolId" element
     */
    boolean isSetOfferPoolId();
    
    /**
     * Sets the "OfferPoolId" element
     */
    void setOfferPoolId(int offerPoolId);
    
    /**
     * Sets (as xml) the "OfferPoolId" element
     */
    void xsetOfferPoolId(org.apache.xmlbeans.XmlInt offerPoolId);
    
    /**
     * Nils the "OfferPoolId" element
     */
    void setNilOfferPoolId();
    
    /**
     * Unsets the "OfferPoolId" element
     */
    void unsetOfferPoolId();
    
    /**
     * Gets the "OfferSortOrder" element
     */
    com.cdiscount.www.OfferSortOrder.Enum getOfferSortOrder();
    
    /**
     * Gets (as xml) the "OfferSortOrder" element
     */
    com.cdiscount.www.OfferSortOrder xgetOfferSortOrder();
    
    /**
     * Tests for nil "OfferSortOrder" element
     */
    boolean isNilOfferSortOrder();
    
    /**
     * True if has "OfferSortOrder" element
     */
    boolean isSetOfferSortOrder();
    
    /**
     * Sets the "OfferSortOrder" element
     */
    void setOfferSortOrder(com.cdiscount.www.OfferSortOrder.Enum offerSortOrder);
    
    /**
     * Sets (as xml) the "OfferSortOrder" element
     */
    void xsetOfferSortOrder(com.cdiscount.www.OfferSortOrder offerSortOrder);
    
    /**
     * Nils the "OfferSortOrder" element
     */
    void setNilOfferSortOrder();
    
    /**
     * Unsets the "OfferSortOrder" element
     */
    void unsetOfferSortOrder();
    
    /**
     * Gets the "PageNumber" element
     */
    int getPageNumber();
    
    /**
     * Gets (as xml) the "PageNumber" element
     */
    org.apache.xmlbeans.XmlInt xgetPageNumber();
    
    /**
     * Sets the "PageNumber" element
     */
    void setPageNumber(int pageNumber);
    
    /**
     * Sets (as xml) the "PageNumber" element
     */
    void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber);
    
    /**
     * Gets the "SellerProductIdList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getSellerProductIdList();
    
    /**
     * Tests for nil "SellerProductIdList" element
     */
    boolean isNilSellerProductIdList();
    
    /**
     * True if has "SellerProductIdList" element
     */
    boolean isSetSellerProductIdList();
    
    /**
     * Sets the "SellerProductIdList" element
     */
    void setSellerProductIdList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring sellerProductIdList);
    
    /**
     * Appends and returns a new empty "SellerProductIdList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewSellerProductIdList();
    
    /**
     * Nils the "SellerProductIdList" element
     */
    void setNilSellerProductIdList();
    
    /**
     * Unsets the "SellerProductIdList" element
     */
    void unsetSellerProductIdList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.OfferFilterPaginated newInstance() {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OfferFilterPaginated parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OfferFilterPaginated parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OfferFilterPaginated parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferFilterPaginated parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferFilterPaginated parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferFilterPaginated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
