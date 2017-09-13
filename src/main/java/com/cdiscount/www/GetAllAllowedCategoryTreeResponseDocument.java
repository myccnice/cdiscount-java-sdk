/*
 * An XML document type.
 * Localname: GetAllAllowedCategoryTreeResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetAllAllowedCategoryTreeResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetAllAllowedCategoryTreeResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAllAllowedCategoryTreeResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getallallowedcategorytreeresponse7daddoctype");
    
    /**
     * Gets the "GetAllAllowedCategoryTreeResponse" element
     */
    com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse getGetAllAllowedCategoryTreeResponse();
    
    /**
     * Sets the "GetAllAllowedCategoryTreeResponse" element
     */
    void setGetAllAllowedCategoryTreeResponse(com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse getAllAllowedCategoryTreeResponse);
    
    /**
     * Appends and returns a new empty "GetAllAllowedCategoryTreeResponse" element
     */
    com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse addNewGetAllAllowedCategoryTreeResponse();
    
    /**
     * An XML GetAllAllowedCategoryTreeResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetAllAllowedCategoryTreeResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAllAllowedCategoryTreeResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getallallowedcategorytreeresponse92a7elemtype");
        
        /**
         * Gets the "GetAllAllowedCategoryTreeResult" element
         */
        com.cdiscount.www.CategoryTreeMessage getGetAllAllowedCategoryTreeResult();
        
        /**
         * Tests for nil "GetAllAllowedCategoryTreeResult" element
         */
        boolean isNilGetAllAllowedCategoryTreeResult();
        
        /**
         * True if has "GetAllAllowedCategoryTreeResult" element
         */
        boolean isSetGetAllAllowedCategoryTreeResult();
        
        /**
         * Sets the "GetAllAllowedCategoryTreeResult" element
         */
        void setGetAllAllowedCategoryTreeResult(com.cdiscount.www.CategoryTreeMessage getAllAllowedCategoryTreeResult);
        
        /**
         * Appends and returns a new empty "GetAllAllowedCategoryTreeResult" element
         */
        com.cdiscount.www.CategoryTreeMessage addNewGetAllAllowedCategoryTreeResult();
        
        /**
         * Nils the "GetAllAllowedCategoryTreeResult" element
         */
        void setNilGetAllAllowedCategoryTreeResult();
        
        /**
         * Unsets the "GetAllAllowedCategoryTreeResult" element
         */
        void unsetGetAllAllowedCategoryTreeResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse newInstance() {
              return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument newInstance() {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
