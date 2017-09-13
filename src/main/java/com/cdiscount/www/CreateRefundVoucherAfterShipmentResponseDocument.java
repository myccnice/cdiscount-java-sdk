/*
 * An XML document type.
 * Localname: CreateRefundVoucherAfterShipmentResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one CreateRefundVoucherAfterShipmentResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface CreateRefundVoucherAfterShipmentResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateRefundVoucherAfterShipmentResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("createrefundvoucheraftershipmentresponse6b18doctype");
    
    /**
     * Gets the "CreateRefundVoucherAfterShipmentResponse" element
     */
    com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse getCreateRefundVoucherAfterShipmentResponse();
    
    /**
     * Sets the "CreateRefundVoucherAfterShipmentResponse" element
     */
    void setCreateRefundVoucherAfterShipmentResponse(com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse createRefundVoucherAfterShipmentResponse);
    
    /**
     * Appends and returns a new empty "CreateRefundVoucherAfterShipmentResponse" element
     */
    com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse addNewCreateRefundVoucherAfterShipmentResponse();
    
    /**
     * An XML CreateRefundVoucherAfterShipmentResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface CreateRefundVoucherAfterShipmentResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateRefundVoucherAfterShipmentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("createrefundvoucheraftershipmentresponse4cf1elemtype");
        
        /**
         * Gets the "CreateRefundVoucherAfterShipmentResult" element
         */
        com.cdiscount.www.SellerRefundResultMessage getCreateRefundVoucherAfterShipmentResult();
        
        /**
         * Tests for nil "CreateRefundVoucherAfterShipmentResult" element
         */
        boolean isNilCreateRefundVoucherAfterShipmentResult();
        
        /**
         * True if has "CreateRefundVoucherAfterShipmentResult" element
         */
        boolean isSetCreateRefundVoucherAfterShipmentResult();
        
        /**
         * Sets the "CreateRefundVoucherAfterShipmentResult" element
         */
        void setCreateRefundVoucherAfterShipmentResult(com.cdiscount.www.SellerRefundResultMessage createRefundVoucherAfterShipmentResult);
        
        /**
         * Appends and returns a new empty "CreateRefundVoucherAfterShipmentResult" element
         */
        com.cdiscount.www.SellerRefundResultMessage addNewCreateRefundVoucherAfterShipmentResult();
        
        /**
         * Nils the "CreateRefundVoucherAfterShipmentResult" element
         */
        void setNilCreateRefundVoucherAfterShipmentResult();
        
        /**
         * Unsets the "CreateRefundVoucherAfterShipmentResult" element
         */
        void unsetCreateRefundVoucherAfterShipmentResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse newInstance() {
              return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument newInstance() {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
