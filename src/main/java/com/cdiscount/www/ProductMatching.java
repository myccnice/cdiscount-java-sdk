/*
 * XML Type:  ProductMatching
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductMatching
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ProductMatching(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ProductMatching extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductMatching.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("productmatching448btype");
    
    /**
     * Gets the "Color" element
     */
    java.lang.String getColor();
    
    /**
     * Gets (as xml) the "Color" element
     */
    org.apache.xmlbeans.XmlString xgetColor();
    
    /**
     * Tests for nil "Color" element
     */
    boolean isNilColor();
    
    /**
     * True if has "Color" element
     */
    boolean isSetColor();
    
    /**
     * Sets the "Color" element
     */
    void setColor(java.lang.String color);
    
    /**
     * Sets (as xml) the "Color" element
     */
    void xsetColor(org.apache.xmlbeans.XmlString color);
    
    /**
     * Nils the "Color" element
     */
    void setNilColor();
    
    /**
     * Unsets the "Color" element
     */
    void unsetColor();
    
    /**
     * Gets the "Comment" element
     */
    java.lang.String getComment();
    
    /**
     * Gets (as xml) the "Comment" element
     */
    org.apache.xmlbeans.XmlString xgetComment();
    
    /**
     * Tests for nil "Comment" element
     */
    boolean isNilComment();
    
    /**
     * True if has "Comment" element
     */
    boolean isSetComment();
    
    /**
     * Sets the "Comment" element
     */
    void setComment(java.lang.String comment);
    
    /**
     * Sets (as xml) the "Comment" element
     */
    void xsetComment(org.apache.xmlbeans.XmlString comment);
    
    /**
     * Nils the "Comment" element
     */
    void setNilComment();
    
    /**
     * Unsets the "Comment" element
     */
    void unsetComment();
    
    /**
     * Gets the "Ean" element
     */
    java.lang.String getEan();
    
    /**
     * Gets (as xml) the "Ean" element
     */
    org.apache.xmlbeans.XmlString xgetEan();
    
    /**
     * Tests for nil "Ean" element
     */
    boolean isNilEan();
    
    /**
     * Sets the "Ean" element
     */
    void setEan(java.lang.String ean);
    
    /**
     * Sets (as xml) the "Ean" element
     */
    void xsetEan(org.apache.xmlbeans.XmlString ean);
    
    /**
     * Nils the "Ean" element
     */
    void setNilEan();
    
    /**
     * Gets the "MatchingStatus" element
     */
    com.cdiscount.www.ProductMatchingStatusEnum.Enum getMatchingStatus();
    
    /**
     * Gets (as xml) the "MatchingStatus" element
     */
    com.cdiscount.www.ProductMatchingStatusEnum xgetMatchingStatus();
    
    /**
     * Sets the "MatchingStatus" element
     */
    void setMatchingStatus(com.cdiscount.www.ProductMatchingStatusEnum.Enum matchingStatus);
    
    /**
     * Sets (as xml) the "MatchingStatus" element
     */
    void xsetMatchingStatus(com.cdiscount.www.ProductMatchingStatusEnum matchingStatus);
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Tests for nil "Name" element
     */
    boolean isNilName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Nils the "Name" element
     */
    void setNilName();
    
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
     * Gets the "Size" element
     */
    java.lang.String getSize();
    
    /**
     * Gets (as xml) the "Size" element
     */
    org.apache.xmlbeans.XmlString xgetSize();
    
    /**
     * Tests for nil "Size" element
     */
    boolean isNilSize();
    
    /**
     * True if has "Size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "Size" element
     */
    void setSize(java.lang.String size);
    
    /**
     * Sets (as xml) the "Size" element
     */
    void xsetSize(org.apache.xmlbeans.XmlString size);
    
    /**
     * Nils the "Size" element
     */
    void setNilSize();
    
    /**
     * Unsets the "Size" element
     */
    void unsetSize();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ProductMatching newInstance() {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ProductMatching newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ProductMatching parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ProductMatching parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ProductMatching parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ProductMatching parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ProductMatching parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ProductMatching parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ProductMatching parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ProductMatching parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ProductMatching parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ProductMatching) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
