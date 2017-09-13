/*
 * An XML document type.
 * Localname: GetFulfilmentSupplyOrderReportListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetFulfilmentSupplyOrderReportListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetFulfilmentSupplyOrderReportListResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFulfilmentSupplyOrderReportListResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getfulfilmentsupplyorderreportlistresponse7523doctype");
    
    /**
     * Gets the "GetFulfilmentSupplyOrderReportListResponse" element
     */
    com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse getGetFulfilmentSupplyOrderReportListResponse();
    
    /**
     * Sets the "GetFulfilmentSupplyOrderReportListResponse" element
     */
    void setGetFulfilmentSupplyOrderReportListResponse(com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse getFulfilmentSupplyOrderReportListResponse);
    
    /**
     * Appends and returns a new empty "GetFulfilmentSupplyOrderReportListResponse" element
     */
    com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse addNewGetFulfilmentSupplyOrderReportListResponse();
    
    /**
     * An XML GetFulfilmentSupplyOrderReportListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetFulfilmentSupplyOrderReportListResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFulfilmentSupplyOrderReportListResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getfulfilmentsupplyorderreportlistresponse94d1elemtype");
        
        /**
         * Gets the "GetFulfilmentSupplyOrderReportListResult" element
         */
        com.cdiscount.www.SupplyOrderReportListMessage getGetFulfilmentSupplyOrderReportListResult();
        
        /**
         * Tests for nil "GetFulfilmentSupplyOrderReportListResult" element
         */
        boolean isNilGetFulfilmentSupplyOrderReportListResult();
        
        /**
         * True if has "GetFulfilmentSupplyOrderReportListResult" element
         */
        boolean isSetGetFulfilmentSupplyOrderReportListResult();
        
        /**
         * Sets the "GetFulfilmentSupplyOrderReportListResult" element
         */
        void setGetFulfilmentSupplyOrderReportListResult(com.cdiscount.www.SupplyOrderReportListMessage getFulfilmentSupplyOrderReportListResult);
        
        /**
         * Appends and returns a new empty "GetFulfilmentSupplyOrderReportListResult" element
         */
        com.cdiscount.www.SupplyOrderReportListMessage addNewGetFulfilmentSupplyOrderReportListResult();
        
        /**
         * Nils the "GetFulfilmentSupplyOrderReportListResult" element
         */
        void setNilGetFulfilmentSupplyOrderReportListResult();
        
        /**
         * Unsets the "GetFulfilmentSupplyOrderReportListResult" element
         */
        void unsetGetFulfilmentSupplyOrderReportListResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse newInstance() {
              return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument newInstance() {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
