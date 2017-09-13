/*
 * XML Type:  ValidateOrderResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ValidateOrderResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ValidateOrderResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidateOrderResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("validateorderresult9422type");
    
    /**
     * Gets the "Errors" element
     */
    com.cdiscount.www.ArrayOfError getErrors();
    
    /**
     * Tests for nil "Errors" element
     */
    boolean isNilErrors();
    
    /**
     * True if has "Errors" element
     */
    boolean isSetErrors();
    
    /**
     * Sets the "Errors" element
     */
    void setErrors(com.cdiscount.www.ArrayOfError errors);
    
    /**
     * Appends and returns a new empty "Errors" element
     */
    com.cdiscount.www.ArrayOfError addNewErrors();
    
    /**
     * Nils the "Errors" element
     */
    void setNilErrors();
    
    /**
     * Unsets the "Errors" element
     */
    void unsetErrors();
    
    /**
     * Gets the "OrderNumber" element
     */
    java.lang.String getOrderNumber();
    
    /**
     * Gets (as xml) the "OrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOrderNumber();
    
    /**
     * Tests for nil "OrderNumber" element
     */
    boolean isNilOrderNumber();
    
    /**
     * True if has "OrderNumber" element
     */
    boolean isSetOrderNumber();
    
    /**
     * Sets the "OrderNumber" element
     */
    void setOrderNumber(java.lang.String orderNumber);
    
    /**
     * Sets (as xml) the "OrderNumber" element
     */
    void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber);
    
    /**
     * Nils the "OrderNumber" element
     */
    void setNilOrderNumber();
    
    /**
     * Unsets the "OrderNumber" element
     */
    void unsetOrderNumber();
    
    /**
     * Gets the "ValidateOrderLineResults" element
     */
    com.cdiscount.www.ArrayOfValidateOrderLineResult getValidateOrderLineResults();
    
    /**
     * Tests for nil "ValidateOrderLineResults" element
     */
    boolean isNilValidateOrderLineResults();
    
    /**
     * True if has "ValidateOrderLineResults" element
     */
    boolean isSetValidateOrderLineResults();
    
    /**
     * Sets the "ValidateOrderLineResults" element
     */
    void setValidateOrderLineResults(com.cdiscount.www.ArrayOfValidateOrderLineResult validateOrderLineResults);
    
    /**
     * Appends and returns a new empty "ValidateOrderLineResults" element
     */
    com.cdiscount.www.ArrayOfValidateOrderLineResult addNewValidateOrderLineResults();
    
    /**
     * Nils the "ValidateOrderLineResults" element
     */
    void setNilValidateOrderLineResults();
    
    /**
     * Unsets the "ValidateOrderLineResults" element
     */
    void unsetValidateOrderLineResults();
    
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
     * Gets the "Warnings" element
     */
    com.cdiscount.www.ArrayOfError getWarnings();
    
    /**
     * Tests for nil "Warnings" element
     */
    boolean isNilWarnings();
    
    /**
     * True if has "Warnings" element
     */
    boolean isSetWarnings();
    
    /**
     * Sets the "Warnings" element
     */
    void setWarnings(com.cdiscount.www.ArrayOfError warnings);
    
    /**
     * Appends and returns a new empty "Warnings" element
     */
    com.cdiscount.www.ArrayOfError addNewWarnings();
    
    /**
     * Nils the "Warnings" element
     */
    void setNilWarnings();
    
    /**
     * Unsets the "Warnings" element
     */
    void unsetWarnings();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ValidateOrderResult newInstance() {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ValidateOrderResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ValidateOrderResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ValidateOrderResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ValidateOrderResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ValidateOrderResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ValidateOrderResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
