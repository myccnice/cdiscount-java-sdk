/*
 * XML Type:  OfferPriceBenchMark
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferPriceBenchMark
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OfferPriceBenchMark(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface OfferPriceBenchMark extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferPriceBenchMark.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("offerpricebenchmarkaf47type");
    
    /**
     * Gets the "BestOfferPrice" element
     */
    java.math.BigDecimal getBestOfferPrice();
    
    /**
     * Gets (as xml) the "BestOfferPrice" element
     */
    org.apache.xmlbeans.XmlDecimal xgetBestOfferPrice();
    
    /**
     * True if has "BestOfferPrice" element
     */
    boolean isSetBestOfferPrice();
    
    /**
     * Sets the "BestOfferPrice" element
     */
    void setBestOfferPrice(java.math.BigDecimal bestOfferPrice);
    
    /**
     * Sets (as xml) the "BestOfferPrice" element
     */
    void xsetBestOfferPrice(org.apache.xmlbeans.XmlDecimal bestOfferPrice);
    
    /**
     * Unsets the "BestOfferPrice" element
     */
    void unsetBestOfferPrice();
    
    /**
     * Gets the "IsBestOfferPrice" element
     */
    boolean getIsBestOfferPrice();
    
    /**
     * Gets (as xml) the "IsBestOfferPrice" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsBestOfferPrice();
    
    /**
     * True if has "IsBestOfferPrice" element
     */
    boolean isSetIsBestOfferPrice();
    
    /**
     * Sets the "IsBestOfferPrice" element
     */
    void setIsBestOfferPrice(boolean isBestOfferPrice);
    
    /**
     * Sets (as xml) the "IsBestOfferPrice" element
     */
    void xsetIsBestOfferPrice(org.apache.xmlbeans.XmlBoolean isBestOfferPrice);
    
    /**
     * Unsets the "IsBestOfferPrice" element
     */
    void unsetIsBestOfferPrice();
    
    /**
     * Gets the "ProductCondition" element
     */
    com.cdiscount.www.ProductConditionEnum.Enum getProductCondition();
    
    /**
     * Gets (as xml) the "ProductCondition" element
     */
    com.cdiscount.www.ProductConditionEnum xgetProductCondition();
    
    /**
     * True if has "ProductCondition" element
     */
    boolean isSetProductCondition();
    
    /**
     * Sets the "ProductCondition" element
     */
    void setProductCondition(com.cdiscount.www.ProductConditionEnum.Enum productCondition);
    
    /**
     * Sets (as xml) the "ProductCondition" element
     */
    void xsetProductCondition(com.cdiscount.www.ProductConditionEnum productCondition);
    
    /**
     * Unsets the "ProductCondition" element
     */
    void unsetProductCondition();
    
    /**
     * Gets the "ProductState" element
     */
    com.cdiscount.www.ProductStateEnum.Enum getProductState();
    
    /**
     * Gets (as xml) the "ProductState" element
     */
    com.cdiscount.www.ProductStateEnum xgetProductState();
    
    /**
     * True if has "ProductState" element
     */
    boolean isSetProductState();
    
    /**
     * Sets the "ProductState" element
     */
    void setProductState(com.cdiscount.www.ProductStateEnum.Enum productState);
    
    /**
     * Sets (as xml) the "ProductState" element
     */
    void xsetProductState(com.cdiscount.www.ProductStateEnum productState);
    
    /**
     * Unsets the "ProductState" element
     */
    void unsetProductState();
    
    /**
     * Gets the "ShippingCharges" element
     */
    java.math.BigDecimal getShippingCharges();
    
    /**
     * Gets (as xml) the "ShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetShippingCharges();
    
    /**
     * True if has "ShippingCharges" element
     */
    boolean isSetShippingCharges();
    
    /**
     * Sets the "ShippingCharges" element
     */
    void setShippingCharges(java.math.BigDecimal shippingCharges);
    
    /**
     * Sets (as xml) the "ShippingCharges" element
     */
    void xsetShippingCharges(org.apache.xmlbeans.XmlDecimal shippingCharges);
    
    /**
     * Unsets the "ShippingCharges" element
     */
    void unsetShippingCharges();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.OfferPriceBenchMark newInstance() {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OfferPriceBenchMark parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferPriceBenchMark parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferPriceBenchMark parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferPriceBenchMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
