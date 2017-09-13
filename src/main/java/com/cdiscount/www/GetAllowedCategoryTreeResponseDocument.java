/*
 * An XML document type.
 * Localname: GetAllowedCategoryTreeResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetAllowedCategoryTreeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetAllowedCategoryTreeResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetAllowedCategoryTreeResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAllowedCategoryTreeResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getallowedcategorytreeresponse6306doctype");
    
    /**
     * Gets the "GetAllowedCategoryTreeResponse" element
     */
    com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse getGetAllowedCategoryTreeResponse();
    
    /**
     * Sets the "GetAllowedCategoryTreeResponse" element
     */
    void setGetAllowedCategoryTreeResponse(com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse getAllowedCategoryTreeResponse);
    
    /**
     * Appends and returns a new empty "GetAllowedCategoryTreeResponse" element
     */
    com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse addNewGetAllowedCategoryTreeResponse();
    
    /**
     * An XML GetAllowedCategoryTreeResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetAllowedCategoryTreeResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAllowedCategoryTreeResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getallowedcategorytreeresponse68b1elemtype");
        
        /**
         * Gets the "GetAllowedCategoryTreeResult" element
         */
        com.cdiscount.www.CategoryTreeMessage getGetAllowedCategoryTreeResult();
        
        /**
         * Tests for nil "GetAllowedCategoryTreeResult" element
         */
        boolean isNilGetAllowedCategoryTreeResult();
        
        /**
         * True if has "GetAllowedCategoryTreeResult" element
         */
        boolean isSetGetAllowedCategoryTreeResult();
        
        /**
         * Sets the "GetAllowedCategoryTreeResult" element
         */
        void setGetAllowedCategoryTreeResult(com.cdiscount.www.CategoryTreeMessage getAllowedCategoryTreeResult);
        
        /**
         * Appends and returns a new empty "GetAllowedCategoryTreeResult" element
         */
        com.cdiscount.www.CategoryTreeMessage addNewGetAllowedCategoryTreeResult();
        
        /**
         * Nils the "GetAllowedCategoryTreeResult" element
         */
        void setNilGetAllowedCategoryTreeResult();
        
        /**
         * Unsets the "GetAllowedCategoryTreeResult" element
         */
        void unsetGetAllowedCategoryTreeResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse newInstance() {
              return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument newInstance() {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetAllowedCategoryTreeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
