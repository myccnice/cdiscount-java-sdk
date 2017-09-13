/*
 * XML Type:  ValidateOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ValidateOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ValidateOrderLine extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidateOrderLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("validateorderlineac6btype");
    
    /**
     * Gets the "AcceptationState" element
     */
    com.cdiscount.www.AcceptationStateEnum.Enum getAcceptationState();
    
    /**
     * Gets (as xml) the "AcceptationState" element
     */
    com.cdiscount.www.AcceptationStateEnum xgetAcceptationState();
    
    /**
     * True if has "AcceptationState" element
     */
    boolean isSetAcceptationState();
    
    /**
     * Sets the "AcceptationState" element
     */
    void setAcceptationState(com.cdiscount.www.AcceptationStateEnum.Enum acceptationState);
    
    /**
     * Sets (as xml) the "AcceptationState" element
     */
    void xsetAcceptationState(com.cdiscount.www.AcceptationStateEnum acceptationState);
    
    /**
     * Unsets the "AcceptationState" element
     */
    void unsetAcceptationState();
    
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
     * Gets the "TypeOfReturn" element
     */
    com.cdiscount.www.AskingForReturnType.Enum getTypeOfReturn();
    
    /**
     * Gets (as xml) the "TypeOfReturn" element
     */
    com.cdiscount.www.AskingForReturnType xgetTypeOfReturn();
    
    /**
     * Tests for nil "TypeOfReturn" element
     */
    boolean isNilTypeOfReturn();
    
    /**
     * True if has "TypeOfReturn" element
     */
    boolean isSetTypeOfReturn();
    
    /**
     * Sets the "TypeOfReturn" element
     */
    void setTypeOfReturn(com.cdiscount.www.AskingForReturnType.Enum typeOfReturn);
    
    /**
     * Sets (as xml) the "TypeOfReturn" element
     */
    void xsetTypeOfReturn(com.cdiscount.www.AskingForReturnType typeOfReturn);
    
    /**
     * Nils the "TypeOfReturn" element
     */
    void setNilTypeOfReturn();
    
    /**
     * Unsets the "TypeOfReturn" element
     */
    void unsetTypeOfReturn();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ValidateOrderLine newInstance() {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ValidateOrderLine parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ValidateOrderLine parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderLine parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ValidateOrderLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ValidateOrderLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ValidateOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
