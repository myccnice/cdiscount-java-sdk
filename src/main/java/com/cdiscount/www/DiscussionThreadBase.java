/*
 * XML Type:  DiscussionThreadBase
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionThreadBase
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML DiscussionThreadBase(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface DiscussionThreadBase extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscussionThreadBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("discussionthreadbase92c2type");
    
    /**
     * Gets the "CloseDate" element
     */
    java.util.Calendar getCloseDate();
    
    /**
     * Gets (as xml) the "CloseDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCloseDate();
    
    /**
     * Tests for nil "CloseDate" element
     */
    boolean isNilCloseDate();
    
    /**
     * True if has "CloseDate" element
     */
    boolean isSetCloseDate();
    
    /**
     * Sets the "CloseDate" element
     */
    void setCloseDate(java.util.Calendar closeDate);
    
    /**
     * Sets (as xml) the "CloseDate" element
     */
    void xsetCloseDate(org.apache.xmlbeans.XmlDateTime closeDate);
    
    /**
     * Nils the "CloseDate" element
     */
    void setNilCloseDate();
    
    /**
     * Unsets the "CloseDate" element
     */
    void unsetCloseDate();
    
    /**
     * Gets the "CreationDate" element
     */
    java.util.Calendar getCreationDate();
    
    /**
     * Gets (as xml) the "CreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreationDate();
    
    /**
     * True if has "CreationDate" element
     */
    boolean isSetCreationDate();
    
    /**
     * Sets the "CreationDate" element
     */
    void setCreationDate(java.util.Calendar creationDate);
    
    /**
     * Sets (as xml) the "CreationDate" element
     */
    void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate);
    
    /**
     * Unsets the "CreationDate" element
     */
    void unsetCreationDate();
    
    /**
     * Gets the "Id" element
     */
    long getId();
    
    /**
     * Gets (as xml) the "Id" element
     */
    org.apache.xmlbeans.XmlLong xgetId();
    
    /**
     * True if has "Id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "Id" element
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "Id" element
     */
    void xsetId(org.apache.xmlbeans.XmlLong id);
    
    /**
     * Unsets the "Id" element
     */
    void unsetId();
    
    /**
     * Gets the "LastUpdatedDate" element
     */
    java.util.Calendar getLastUpdatedDate();
    
    /**
     * Gets (as xml) the "LastUpdatedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLastUpdatedDate();
    
    /**
     * Tests for nil "LastUpdatedDate" element
     */
    boolean isNilLastUpdatedDate();
    
    /**
     * True if has "LastUpdatedDate" element
     */
    boolean isSetLastUpdatedDate();
    
    /**
     * Sets the "LastUpdatedDate" element
     */
    void setLastUpdatedDate(java.util.Calendar lastUpdatedDate);
    
    /**
     * Sets (as xml) the "LastUpdatedDate" element
     */
    void xsetLastUpdatedDate(org.apache.xmlbeans.XmlDateTime lastUpdatedDate);
    
    /**
     * Nils the "LastUpdatedDate" element
     */
    void setNilLastUpdatedDate();
    
    /**
     * Unsets the "LastUpdatedDate" element
     */
    void unsetLastUpdatedDate();
    
    /**
     * Gets the "Messages" element
     */
    com.cdiscount.www.ArrayOfMessage getMessages();
    
    /**
     * Tests for nil "Messages" element
     */
    boolean isNilMessages();
    
    /**
     * True if has "Messages" element
     */
    boolean isSetMessages();
    
    /**
     * Sets the "Messages" element
     */
    void setMessages(com.cdiscount.www.ArrayOfMessage messages);
    
    /**
     * Appends and returns a new empty "Messages" element
     */
    com.cdiscount.www.ArrayOfMessage addNewMessages();
    
    /**
     * Nils the "Messages" element
     */
    void setNilMessages();
    
    /**
     * Unsets the "Messages" element
     */
    void unsetMessages();
    
    /**
     * Gets the "Status" element
     */
    com.cdiscount.www.DiscussionState.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    com.cdiscount.www.DiscussionState xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(com.cdiscount.www.DiscussionState.Enum status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(com.cdiscount.www.DiscussionState status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "Subject" element
     */
    java.lang.String getSubject();
    
    /**
     * Gets (as xml) the "Subject" element
     */
    org.apache.xmlbeans.XmlString xgetSubject();
    
    /**
     * Tests for nil "Subject" element
     */
    boolean isNilSubject();
    
    /**
     * True if has "Subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "Subject" element
     */
    void setSubject(java.lang.String subject);
    
    /**
     * Sets (as xml) the "Subject" element
     */
    void xsetSubject(org.apache.xmlbeans.XmlString subject);
    
    /**
     * Nils the "Subject" element
     */
    void setNilSubject();
    
    /**
     * Unsets the "Subject" element
     */
    void unsetSubject();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.DiscussionThreadBase newInstance() {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.DiscussionThreadBase parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.DiscussionThreadBase parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.DiscussionThreadBase parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscussionThreadBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscussionThreadBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscussionThreadBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
