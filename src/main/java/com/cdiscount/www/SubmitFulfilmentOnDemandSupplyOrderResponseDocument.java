/*
 * An XML document type.
 * Localname: SubmitFulfilmentOnDemandSupplyOrderResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one SubmitFulfilmentOnDemandSupplyOrderResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface SubmitFulfilmentOnDemandSupplyOrderResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitFulfilmentOnDemandSupplyOrderResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("submitfulfilmentondemandsupplyorderresponse3af3doctype");
    
    /**
     * Gets the "SubmitFulfilmentOnDemandSupplyOrderResponse" element
     */
    com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse getSubmitFulfilmentOnDemandSupplyOrderResponse();
    
    /**
     * Sets the "SubmitFulfilmentOnDemandSupplyOrderResponse" element
     */
    void setSubmitFulfilmentOnDemandSupplyOrderResponse(com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse submitFulfilmentOnDemandSupplyOrderResponse);
    
    /**
     * Appends and returns a new empty "SubmitFulfilmentOnDemandSupplyOrderResponse" element
     */
    com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse addNewSubmitFulfilmentOnDemandSupplyOrderResponse();
    
    /**
     * An XML SubmitFulfilmentOnDemandSupplyOrderResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface SubmitFulfilmentOnDemandSupplyOrderResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitFulfilmentOnDemandSupplyOrderResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("submitfulfilmentondemandsupplyorderresponseb773elemtype");
        
        /**
         * Gets the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        com.cdiscount.www.SupplyOrderReportMessage getSubmitFulfilmentOnDemandSupplyOrderResult();
        
        /**
         * Tests for nil "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        boolean isNilSubmitFulfilmentOnDemandSupplyOrderResult();
        
        /**
         * True if has "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        boolean isSetSubmitFulfilmentOnDemandSupplyOrderResult();
        
        /**
         * Sets the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        void setSubmitFulfilmentOnDemandSupplyOrderResult(com.cdiscount.www.SupplyOrderReportMessage submitFulfilmentOnDemandSupplyOrderResult);
        
        /**
         * Appends and returns a new empty "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        com.cdiscount.www.SupplyOrderReportMessage addNewSubmitFulfilmentOnDemandSupplyOrderResult();
        
        /**
         * Nils the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        void setNilSubmitFulfilmentOnDemandSupplyOrderResult();
        
        /**
         * Unsets the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        void unsetSubmitFulfilmentOnDemandSupplyOrderResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse newInstance() {
              return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument newInstance() {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
