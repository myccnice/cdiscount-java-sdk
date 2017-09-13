/*
 * An XML document type.
 * Localname: SubmitFulfilmentSupplyOrderResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one SubmitFulfilmentSupplyOrderResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface SubmitFulfilmentSupplyOrderResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitFulfilmentSupplyOrderResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("submitfulfilmentsupplyorderresponsef7c9doctype");
    
    /**
     * Gets the "SubmitFulfilmentSupplyOrderResponse" element
     */
    com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse getSubmitFulfilmentSupplyOrderResponse();
    
    /**
     * Sets the "SubmitFulfilmentSupplyOrderResponse" element
     */
    void setSubmitFulfilmentSupplyOrderResponse(com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse submitFulfilmentSupplyOrderResponse);
    
    /**
     * Appends and returns a new empty "SubmitFulfilmentSupplyOrderResponse" element
     */
    com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse addNewSubmitFulfilmentSupplyOrderResponse();
    
    /**
     * An XML SubmitFulfilmentSupplyOrderResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface SubmitFulfilmentSupplyOrderResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitFulfilmentSupplyOrderResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("submitfulfilmentsupplyorderresponse2f9felemtype");
        
        /**
         * Gets the "SubmitFulfilmentSupplyOrderResult" element
         */
        com.cdiscount.www.SupplyOrderReportMessage getSubmitFulfilmentSupplyOrderResult();
        
        /**
         * Tests for nil "SubmitFulfilmentSupplyOrderResult" element
         */
        boolean isNilSubmitFulfilmentSupplyOrderResult();
        
        /**
         * True if has "SubmitFulfilmentSupplyOrderResult" element
         */
        boolean isSetSubmitFulfilmentSupplyOrderResult();
        
        /**
         * Sets the "SubmitFulfilmentSupplyOrderResult" element
         */
        void setSubmitFulfilmentSupplyOrderResult(com.cdiscount.www.SupplyOrderReportMessage submitFulfilmentSupplyOrderResult);
        
        /**
         * Appends and returns a new empty "SubmitFulfilmentSupplyOrderResult" element
         */
        com.cdiscount.www.SupplyOrderReportMessage addNewSubmitFulfilmentSupplyOrderResult();
        
        /**
         * Nils the "SubmitFulfilmentSupplyOrderResult" element
         */
        void setNilSubmitFulfilmentSupplyOrderResult();
        
        /**
         * Unsets the "SubmitFulfilmentSupplyOrderResult" element
         */
        void unsetSubmitFulfilmentSupplyOrderResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse newInstance() {
              return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument newInstance() {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
