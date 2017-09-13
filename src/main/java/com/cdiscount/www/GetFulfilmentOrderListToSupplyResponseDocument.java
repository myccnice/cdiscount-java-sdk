/*
 * An XML document type.
 * Localname: GetFulfilmentOrderListToSupplyResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetFulfilmentOrderListToSupplyResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetFulfilmentOrderListToSupplyResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFulfilmentOrderListToSupplyResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getfulfilmentorderlisttosupplyresponse29bedoctype");
    
    /**
     * Gets the "GetFulfilmentOrderListToSupplyResponse" element
     */
    com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse getGetFulfilmentOrderListToSupplyResponse();
    
    /**
     * Sets the "GetFulfilmentOrderListToSupplyResponse" element
     */
    void setGetFulfilmentOrderListToSupplyResponse(com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse getFulfilmentOrderListToSupplyResponse);
    
    /**
     * Appends and returns a new empty "GetFulfilmentOrderListToSupplyResponse" element
     */
    com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse addNewGetFulfilmentOrderListToSupplyResponse();
    
    /**
     * An XML GetFulfilmentOrderListToSupplyResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetFulfilmentOrderListToSupplyResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFulfilmentOrderListToSupplyResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getfulfilmentorderlisttosupplyresponseedb1elemtype");
        
        /**
         * Gets the "GetFulfilmentOrderListToSupplyResult" element
         */
        com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage getGetFulfilmentOrderListToSupplyResult();
        
        /**
         * Tests for nil "GetFulfilmentOrderListToSupplyResult" element
         */
        boolean isNilGetFulfilmentOrderListToSupplyResult();
        
        /**
         * True if has "GetFulfilmentOrderListToSupplyResult" element
         */
        boolean isSetGetFulfilmentOrderListToSupplyResult();
        
        /**
         * Sets the "GetFulfilmentOrderListToSupplyResult" element
         */
        void setGetFulfilmentOrderListToSupplyResult(com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage getFulfilmentOrderListToSupplyResult);
        
        /**
         * Appends and returns a new empty "GetFulfilmentOrderListToSupplyResult" element
         */
        com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage addNewGetFulfilmentOrderListToSupplyResult();
        
        /**
         * Nils the "GetFulfilmentOrderListToSupplyResult" element
         */
        void setNilGetFulfilmentOrderListToSupplyResult();
        
        /**
         * Unsets the "GetFulfilmentOrderListToSupplyResult" element
         */
        void unsetGetFulfilmentOrderListToSupplyResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse newInstance() {
              return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument newInstance() {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
