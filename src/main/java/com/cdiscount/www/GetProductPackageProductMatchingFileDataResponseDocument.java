/*
 * An XML document type.
 * Localname: GetProductPackageProductMatchingFileDataResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetProductPackageProductMatchingFileDataResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetProductPackageProductMatchingFileDataResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProductPackageProductMatchingFileDataResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getproductpackageproductmatchingfiledataresponse190fdoctype");
    
    /**
     * Gets the "GetProductPackageProductMatchingFileDataResponse" element
     */
    com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse getGetProductPackageProductMatchingFileDataResponse();
    
    /**
     * Sets the "GetProductPackageProductMatchingFileDataResponse" element
     */
    void setGetProductPackageProductMatchingFileDataResponse(com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse getProductPackageProductMatchingFileDataResponse);
    
    /**
     * Appends and returns a new empty "GetProductPackageProductMatchingFileDataResponse" element
     */
    com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse addNewGetProductPackageProductMatchingFileDataResponse();
    
    /**
     * An XML GetProductPackageProductMatchingFileDataResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetProductPackageProductMatchingFileDataResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProductPackageProductMatchingFileDataResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getproductpackageproductmatchingfiledataresponse2791elemtype");
        
        /**
         * Gets the "GetProductPackageProductMatchingFileDataResult" element
         */
        com.cdiscount.www.ProductMatchingFileMessage getGetProductPackageProductMatchingFileDataResult();
        
        /**
         * Tests for nil "GetProductPackageProductMatchingFileDataResult" element
         */
        boolean isNilGetProductPackageProductMatchingFileDataResult();
        
        /**
         * True if has "GetProductPackageProductMatchingFileDataResult" element
         */
        boolean isSetGetProductPackageProductMatchingFileDataResult();
        
        /**
         * Sets the "GetProductPackageProductMatchingFileDataResult" element
         */
        void setGetProductPackageProductMatchingFileDataResult(com.cdiscount.www.ProductMatchingFileMessage getProductPackageProductMatchingFileDataResult);
        
        /**
         * Appends and returns a new empty "GetProductPackageProductMatchingFileDataResult" element
         */
        com.cdiscount.www.ProductMatchingFileMessage addNewGetProductPackageProductMatchingFileDataResult();
        
        /**
         * Nils the "GetProductPackageProductMatchingFileDataResult" element
         */
        void setNilGetProductPackageProductMatchingFileDataResult();
        
        /**
         * Unsets the "GetProductPackageProductMatchingFileDataResult" element
         */
        void unsetGetProductPackageProductMatchingFileDataResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse newInstance() {
              return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument newInstance() {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
