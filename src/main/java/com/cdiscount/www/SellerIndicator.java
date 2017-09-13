/*
 * XML Type:  SellerIndicator
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerIndicator
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML SellerIndicator(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface SellerIndicator extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SellerIndicator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("sellerindicator29c7type");
    
    /**
     * Gets the "ComputationDate" element
     */
    java.util.Calendar getComputationDate();
    
    /**
     * Gets (as xml) the "ComputationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetComputationDate();
    
    /**
     * Tests for nil "ComputationDate" element
     */
    boolean isNilComputationDate();
    
    /**
     * True if has "ComputationDate" element
     */
    boolean isSetComputationDate();
    
    /**
     * Sets the "ComputationDate" element
     */
    void setComputationDate(java.util.Calendar computationDate);
    
    /**
     * Sets (as xml) the "ComputationDate" element
     */
    void xsetComputationDate(org.apache.xmlbeans.XmlDateTime computationDate);
    
    /**
     * Nils the "ComputationDate" element
     */
    void setNilComputationDate();
    
    /**
     * Unsets the "ComputationDate" element
     */
    void unsetComputationDate();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Tests for nil "Description" element
     */
    boolean isNilDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Nils the "Description" element
     */
    void setNilDescription();
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "Threshold" element
     */
    java.math.BigDecimal getThreshold();
    
    /**
     * Gets (as xml) the "Threshold" element
     */
    org.apache.xmlbeans.XmlDecimal xgetThreshold();
    
    /**
     * Tests for nil "Threshold" element
     */
    boolean isNilThreshold();
    
    /**
     * True if has "Threshold" element
     */
    boolean isSetThreshold();
    
    /**
     * Sets the "Threshold" element
     */
    void setThreshold(java.math.BigDecimal threshold);
    
    /**
     * Sets (as xml) the "Threshold" element
     */
    void xsetThreshold(org.apache.xmlbeans.XmlDecimal threshold);
    
    /**
     * Nils the "Threshold" element
     */
    void setNilThreshold();
    
    /**
     * Unsets the "Threshold" element
     */
    void unsetThreshold();
    
    /**
     * Gets the "ThresholdType" element
     */
    com.cdiscount.www.TresholdType.Enum getThresholdType();
    
    /**
     * Gets (as xml) the "ThresholdType" element
     */
    com.cdiscount.www.TresholdType xgetThresholdType();
    
    /**
     * True if has "ThresholdType" element
     */
    boolean isSetThresholdType();
    
    /**
     * Sets the "ThresholdType" element
     */
    void setThresholdType(com.cdiscount.www.TresholdType.Enum thresholdType);
    
    /**
     * Sets (as xml) the "ThresholdType" element
     */
    void xsetThresholdType(com.cdiscount.www.TresholdType thresholdType);
    
    /**
     * Unsets the "ThresholdType" element
     */
    void unsetThresholdType();
    
    /**
     * Gets the "ValueD30" element
     */
    java.math.BigDecimal getValueD30();
    
    /**
     * Gets (as xml) the "ValueD30" element
     */
    org.apache.xmlbeans.XmlDecimal xgetValueD30();
    
    /**
     * Tests for nil "ValueD30" element
     */
    boolean isNilValueD30();
    
    /**
     * True if has "ValueD30" element
     */
    boolean isSetValueD30();
    
    /**
     * Sets the "ValueD30" element
     */
    void setValueD30(java.math.BigDecimal valueD30);
    
    /**
     * Sets (as xml) the "ValueD30" element
     */
    void xsetValueD30(org.apache.xmlbeans.XmlDecimal valueD30);
    
    /**
     * Nils the "ValueD30" element
     */
    void setNilValueD30();
    
    /**
     * Unsets the "ValueD30" element
     */
    void unsetValueD30();
    
    /**
     * Gets the "ValueD60" element
     */
    java.math.BigDecimal getValueD60();
    
    /**
     * Gets (as xml) the "ValueD60" element
     */
    org.apache.xmlbeans.XmlDecimal xgetValueD60();
    
    /**
     * Tests for nil "ValueD60" element
     */
    boolean isNilValueD60();
    
    /**
     * True if has "ValueD60" element
     */
    boolean isSetValueD60();
    
    /**
     * Sets the "ValueD60" element
     */
    void setValueD60(java.math.BigDecimal valueD60);
    
    /**
     * Sets (as xml) the "ValueD60" element
     */
    void xsetValueD60(org.apache.xmlbeans.XmlDecimal valueD60);
    
    /**
     * Nils the "ValueD60" element
     */
    void setNilValueD60();
    
    /**
     * Unsets the "ValueD60" element
     */
    void unsetValueD60();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.SellerIndicator newInstance() {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SellerIndicator newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SellerIndicator parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SellerIndicator parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SellerIndicator parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SellerIndicator parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SellerIndicator parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SellerIndicator parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SellerIndicator parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SellerIndicator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SellerIndicator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SellerIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
