/*
 * An XML document type.
 * Localname: GetExternalOrderStatusResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetExternalOrderStatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetExternalOrderStatusResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetExternalOrderStatusResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetExternalOrderStatusResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getexternalorderstatusresponsef095doctype");
    
    /**
     * Gets the "GetExternalOrderStatusResponse" element
     */
    com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse getGetExternalOrderStatusResponse();
    
    /**
     * Sets the "GetExternalOrderStatusResponse" element
     */
    void setGetExternalOrderStatusResponse(com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse getExternalOrderStatusResponse);
    
    /**
     * Appends and returns a new empty "GetExternalOrderStatusResponse" element
     */
    com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse addNewGetExternalOrderStatusResponse();
    
    /**
     * An XML GetExternalOrderStatusResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetExternalOrderStatusResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetExternalOrderStatusResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getexternalorderstatusresponse9691elemtype");
        
        /**
         * Gets the "GetExternalOrderStatusResult" element
         */
        org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage getGetExternalOrderStatusResult();
        
        /**
         * Tests for nil "GetExternalOrderStatusResult" element
         */
        boolean isNilGetExternalOrderStatusResult();
        
        /**
         * True if has "GetExternalOrderStatusResult" element
         */
        boolean isSetGetExternalOrderStatusResult();
        
        /**
         * Sets the "GetExternalOrderStatusResult" element
         */
        void setGetExternalOrderStatusResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage getExternalOrderStatusResult);
        
        /**
         * Appends and returns a new empty "GetExternalOrderStatusResult" element
         */
        org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage addNewGetExternalOrderStatusResult();
        
        /**
         * Nils the "GetExternalOrderStatusResult" element
         */
        void setNilGetExternalOrderStatusResult();
        
        /**
         * Unsets the "GetExternalOrderStatusResult" element
         */
        void unsetGetExternalOrderStatusResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse newInstance() {
              return (com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument newInstance() {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetExternalOrderStatusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetExternalOrderStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
