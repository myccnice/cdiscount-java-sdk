/*
 * An XML document type.
 * Localname: GenerateDiscussionMailGuidResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GenerateDiscussionMailGuidResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GenerateDiscussionMailGuidResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenerateDiscussionMailGuidResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("generatediscussionmailguidresponse2637doctype");
    
    /**
     * Gets the "GenerateDiscussionMailGuidResponse" element
     */
    com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse getGenerateDiscussionMailGuidResponse();
    
    /**
     * Sets the "GenerateDiscussionMailGuidResponse" element
     */
    void setGenerateDiscussionMailGuidResponse(com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse generateDiscussionMailGuidResponse);
    
    /**
     * Appends and returns a new empty "GenerateDiscussionMailGuidResponse" element
     */
    com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse addNewGenerateDiscussionMailGuidResponse();
    
    /**
     * An XML GenerateDiscussionMailGuidResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GenerateDiscussionMailGuidResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenerateDiscussionMailGuidResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("generatediscussionmailguidresponse8e51elemtype");
        
        /**
         * Gets the "GenerateDiscussionMailGuidResult" element
         */
        org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage getGenerateDiscussionMailGuidResult();
        
        /**
         * Tests for nil "GenerateDiscussionMailGuidResult" element
         */
        boolean isNilGenerateDiscussionMailGuidResult();
        
        /**
         * True if has "GenerateDiscussionMailGuidResult" element
         */
        boolean isSetGenerateDiscussionMailGuidResult();
        
        /**
         * Sets the "GenerateDiscussionMailGuidResult" element
         */
        void setGenerateDiscussionMailGuidResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage generateDiscussionMailGuidResult);
        
        /**
         * Appends and returns a new empty "GenerateDiscussionMailGuidResult" element
         */
        org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage addNewGenerateDiscussionMailGuidResult();
        
        /**
         * Nils the "GenerateDiscussionMailGuidResult" element
         */
        void setNilGenerateDiscussionMailGuidResult();
        
        /**
         * Unsets the "GenerateDiscussionMailGuidResult" element
         */
        void unsetGenerateDiscussionMailGuidResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse newInstance() {
              return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument newInstance() {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
