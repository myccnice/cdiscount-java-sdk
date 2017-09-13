/*
 * XML Type:  ServiceBaseAPIMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ServiceBaseAPIMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ServiceBaseAPIMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ServiceBaseAPIMessage extends org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceBaseAPIMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("servicebaseapimessage1164type");
    
    /**
     * Gets the "ErrorList" element
     */
    com.cdiscount.www.ArrayOfError getErrorList();
    
    /**
     * Tests for nil "ErrorList" element
     */
    boolean isNilErrorList();
    
    /**
     * True if has "ErrorList" element
     */
    boolean isSetErrorList();
    
    /**
     * Sets the "ErrorList" element
     */
    void setErrorList(com.cdiscount.www.ArrayOfError errorList);
    
    /**
     * Appends and returns a new empty "ErrorList" element
     */
    com.cdiscount.www.ArrayOfError addNewErrorList();
    
    /**
     * Nils the "ErrorList" element
     */
    void setNilErrorList();
    
    /**
     * Unsets the "ErrorList" element
     */
    void unsetErrorList();
    
    /**
     * Gets the "SellerLogin" element
     */
    java.lang.String getSellerLogin();
    
    /**
     * Gets (as xml) the "SellerLogin" element
     */
    org.apache.xmlbeans.XmlString xgetSellerLogin();
    
    /**
     * Tests for nil "SellerLogin" element
     */
    boolean isNilSellerLogin();
    
    /**
     * True if has "SellerLogin" element
     */
    boolean isSetSellerLogin();
    
    /**
     * Sets the "SellerLogin" element
     */
    void setSellerLogin(java.lang.String sellerLogin);
    
    /**
     * Sets (as xml) the "SellerLogin" element
     */
    void xsetSellerLogin(org.apache.xmlbeans.XmlString sellerLogin);
    
    /**
     * Nils the "SellerLogin" element
     */
    void setNilSellerLogin();
    
    /**
     * Unsets the "SellerLogin" element
     */
    void unsetSellerLogin();
    
    /**
     * Gets the "TokenId" element
     */
    java.lang.String getTokenId();
    
    /**
     * Gets (as xml) the "TokenId" element
     */
    org.apache.xmlbeans.XmlString xgetTokenId();
    
    /**
     * Tests for nil "TokenId" element
     */
    boolean isNilTokenId();
    
    /**
     * True if has "TokenId" element
     */
    boolean isSetTokenId();
    
    /**
     * Sets the "TokenId" element
     */
    void setTokenId(java.lang.String tokenId);
    
    /**
     * Sets (as xml) the "TokenId" element
     */
    void xsetTokenId(org.apache.xmlbeans.XmlString tokenId);
    
    /**
     * Nils the "TokenId" element
     */
    void setNilTokenId();
    
    /**
     * Unsets the "TokenId" element
     */
    void unsetTokenId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ServiceBaseAPIMessage newInstance() {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ServiceBaseAPIMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ServiceBaseAPIMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
