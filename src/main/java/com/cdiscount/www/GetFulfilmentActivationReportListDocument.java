/*
 * An XML document type.
 * Localname: GetFulfilmentActivationReportList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentActivationReportListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetFulfilmentActivationReportList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetFulfilmentActivationReportListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFulfilmentActivationReportListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getfulfilmentactivationreportliste95fdoctype");
    
    /**
     * Gets the "GetFulfilmentActivationReportList" element
     */
    com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList getGetFulfilmentActivationReportList();
    
    /**
     * Sets the "GetFulfilmentActivationReportList" element
     */
    void setGetFulfilmentActivationReportList(com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList getFulfilmentActivationReportList);
    
    /**
     * Appends and returns a new empty "GetFulfilmentActivationReportList" element
     */
    com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList addNewGetFulfilmentActivationReportList();
    
    /**
     * An XML GetFulfilmentActivationReportList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetFulfilmentActivationReportList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFulfilmentActivationReportList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getfulfilmentactivationreportlistf90belemtype");
        
        /**
         * Gets the "headerMessage" element
         */
        org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage getHeaderMessage();
        
        /**
         * Tests for nil "headerMessage" element
         */
        boolean isNilHeaderMessage();
        
        /**
         * True if has "headerMessage" element
         */
        boolean isSetHeaderMessage();
        
        /**
         * Sets the "headerMessage" element
         */
        void setHeaderMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage headerMessage);
        
        /**
         * Appends and returns a new empty "headerMessage" element
         */
        org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage addNewHeaderMessage();
        
        /**
         * Nils the "headerMessage" element
         */
        void setNilHeaderMessage();
        
        /**
         * Unsets the "headerMessage" element
         */
        void unsetHeaderMessage();
        
        /**
         * Gets the "request" element
         */
        com.cdiscount.www.FulfilmentActivationReportRequest getRequest();
        
        /**
         * Tests for nil "request" element
         */
        boolean isNilRequest();
        
        /**
         * True if has "request" element
         */
        boolean isSetRequest();
        
        /**
         * Sets the "request" element
         */
        void setRequest(com.cdiscount.www.FulfilmentActivationReportRequest request);
        
        /**
         * Appends and returns a new empty "request" element
         */
        com.cdiscount.www.FulfilmentActivationReportRequest addNewRequest();
        
        /**
         * Nils the "request" element
         */
        void setNilRequest();
        
        /**
         * Unsets the "request" element
         */
        void unsetRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList newInstance() {
              return (com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument newInstance() {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetFulfilmentActivationReportListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetFulfilmentActivationReportListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
