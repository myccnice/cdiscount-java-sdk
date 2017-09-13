/*
 * XML Type:  DiscountComponent
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscountComponent
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML DiscountComponent(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface DiscountComponent extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscountComponent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("discountcomponentc99btype");
    
    /**
     * Gets the "DiscountValue" element
     */
    java.math.BigDecimal getDiscountValue();
    
    /**
     * Gets (as xml) the "DiscountValue" element
     */
    org.apache.xmlbeans.XmlDecimal xgetDiscountValue();
    
    /**
     * True if has "DiscountValue" element
     */
    boolean isSetDiscountValue();
    
    /**
     * Sets the "DiscountValue" element
     */
    void setDiscountValue(java.math.BigDecimal discountValue);
    
    /**
     * Sets (as xml) the "DiscountValue" element
     */
    void xsetDiscountValue(org.apache.xmlbeans.XmlDecimal discountValue);
    
    /**
     * Unsets the "DiscountValue" element
     */
    void unsetDiscountValue();
    
    /**
     * Gets the "EndDate" element
     */
    java.util.Calendar getEndDate();
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndDate();
    
    /**
     * True if has "EndDate" element
     */
    boolean isSetEndDate();
    
    /**
     * Sets the "EndDate" element
     */
    void setEndDate(java.util.Calendar endDate);
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate);
    
    /**
     * Unsets the "EndDate" element
     */
    void unsetEndDate();
    
    /**
     * Gets the "Price" element
     */
    java.math.BigDecimal getPrice();
    
    /**
     * Gets (as xml) the "Price" element
     */
    org.apache.xmlbeans.XmlDecimal xgetPrice();
    
    /**
     * True if has "Price" element
     */
    boolean isSetPrice();
    
    /**
     * Sets the "Price" element
     */
    void setPrice(java.math.BigDecimal price);
    
    /**
     * Sets (as xml) the "Price" element
     */
    void xsetPrice(org.apache.xmlbeans.XmlDecimal price);
    
    /**
     * Unsets the "Price" element
     */
    void unsetPrice();
    
    /**
     * Gets the "StartDate" element
     */
    java.util.Calendar getStartDate();
    
    /**
     * Gets (as xml) the "StartDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartDate();
    
    /**
     * True if has "StartDate" element
     */
    boolean isSetStartDate();
    
    /**
     * Sets the "StartDate" element
     */
    void setStartDate(java.util.Calendar startDate);
    
    /**
     * Sets (as xml) the "StartDate" element
     */
    void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate);
    
    /**
     * Unsets the "StartDate" element
     */
    void unsetStartDate();
    
    /**
     * Gets the "Type" element
     */
    com.cdiscount.www.DiscountType.Enum getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    com.cdiscount.www.DiscountType xgetType();
    
    /**
     * True if has "Type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(com.cdiscount.www.DiscountType.Enum type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(com.cdiscount.www.DiscountType type);
    
    /**
     * Unsets the "Type" element
     */
    void unsetType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.DiscountComponent newInstance() {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.DiscountComponent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.DiscountComponent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.DiscountComponent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.DiscountComponent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.DiscountComponent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.DiscountComponent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.DiscountComponent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.DiscountComponent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscountComponent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscountComponent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscountComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
