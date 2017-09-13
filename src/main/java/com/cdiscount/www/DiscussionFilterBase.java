/*
 * XML Type:  DiscussionFilterBase
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionFilterBase
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML DiscussionFilterBase(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface DiscussionFilterBase extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscussionFilterBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("discussionfilterbaseb414type");
    
    /**
     * Gets the "BeginCreationDate" element
     */
    java.util.Calendar getBeginCreationDate();
    
    /**
     * Gets (as xml) the "BeginCreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeginCreationDate();
    
    /**
     * Tests for nil "BeginCreationDate" element
     */
    boolean isNilBeginCreationDate();
    
    /**
     * True if has "BeginCreationDate" element
     */
    boolean isSetBeginCreationDate();
    
    /**
     * Sets the "BeginCreationDate" element
     */
    void setBeginCreationDate(java.util.Calendar beginCreationDate);
    
    /**
     * Sets (as xml) the "BeginCreationDate" element
     */
    void xsetBeginCreationDate(org.apache.xmlbeans.XmlDateTime beginCreationDate);
    
    /**
     * Nils the "BeginCreationDate" element
     */
    void setNilBeginCreationDate();
    
    /**
     * Unsets the "BeginCreationDate" element
     */
    void unsetBeginCreationDate();
    
    /**
     * Gets the "BeginModificationDate" element
     */
    java.util.Calendar getBeginModificationDate();
    
    /**
     * Gets (as xml) the "BeginModificationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeginModificationDate();
    
    /**
     * Tests for nil "BeginModificationDate" element
     */
    boolean isNilBeginModificationDate();
    
    /**
     * True if has "BeginModificationDate" element
     */
    boolean isSetBeginModificationDate();
    
    /**
     * Sets the "BeginModificationDate" element
     */
    void setBeginModificationDate(java.util.Calendar beginModificationDate);
    
    /**
     * Sets (as xml) the "BeginModificationDate" element
     */
    void xsetBeginModificationDate(org.apache.xmlbeans.XmlDateTime beginModificationDate);
    
    /**
     * Nils the "BeginModificationDate" element
     */
    void setNilBeginModificationDate();
    
    /**
     * Unsets the "BeginModificationDate" element
     */
    void unsetBeginModificationDate();
    
    /**
     * Gets the "EndCreationDate" element
     */
    java.util.Calendar getEndCreationDate();
    
    /**
     * Gets (as xml) the "EndCreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndCreationDate();
    
    /**
     * Tests for nil "EndCreationDate" element
     */
    boolean isNilEndCreationDate();
    
    /**
     * True if has "EndCreationDate" element
     */
    boolean isSetEndCreationDate();
    
    /**
     * Sets the "EndCreationDate" element
     */
    void setEndCreationDate(java.util.Calendar endCreationDate);
    
    /**
     * Sets (as xml) the "EndCreationDate" element
     */
    void xsetEndCreationDate(org.apache.xmlbeans.XmlDateTime endCreationDate);
    
    /**
     * Nils the "EndCreationDate" element
     */
    void setNilEndCreationDate();
    
    /**
     * Unsets the "EndCreationDate" element
     */
    void unsetEndCreationDate();
    
    /**
     * Gets the "EndModificationDate" element
     */
    java.util.Calendar getEndModificationDate();
    
    /**
     * Gets (as xml) the "EndModificationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndModificationDate();
    
    /**
     * Tests for nil "EndModificationDate" element
     */
    boolean isNilEndModificationDate();
    
    /**
     * True if has "EndModificationDate" element
     */
    boolean isSetEndModificationDate();
    
    /**
     * Sets the "EndModificationDate" element
     */
    void setEndModificationDate(java.util.Calendar endModificationDate);
    
    /**
     * Sets (as xml) the "EndModificationDate" element
     */
    void xsetEndModificationDate(org.apache.xmlbeans.XmlDateTime endModificationDate);
    
    /**
     * Nils the "EndModificationDate" element
     */
    void setNilEndModificationDate();
    
    /**
     * Unsets the "EndModificationDate" element
     */
    void unsetEndModificationDate();
    
    /**
     * Gets the "StatusList" element
     */
    com.cdiscount.www.ArrayOfDiscussionStateFilter getStatusList();
    
    /**
     * Tests for nil "StatusList" element
     */
    boolean isNilStatusList();
    
    /**
     * True if has "StatusList" element
     */
    boolean isSetStatusList();
    
    /**
     * Sets the "StatusList" element
     */
    void setStatusList(com.cdiscount.www.ArrayOfDiscussionStateFilter statusList);
    
    /**
     * Appends and returns a new empty "StatusList" element
     */
    com.cdiscount.www.ArrayOfDiscussionStateFilter addNewStatusList();
    
    /**
     * Nils the "StatusList" element
     */
    void setNilStatusList();
    
    /**
     * Unsets the "StatusList" element
     */
    void unsetStatusList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.DiscussionFilterBase newInstance() {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.DiscussionFilterBase parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.DiscussionFilterBase parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.DiscussionFilterBase parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscussionFilterBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscussionFilterBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscussionFilterBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
