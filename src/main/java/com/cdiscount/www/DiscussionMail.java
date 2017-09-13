/*
 * XML Type:  DiscussionMail
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionMail
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML DiscussionMail(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface DiscussionMail extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscussionMail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("discussionmail33c6type");
    
    /**
     * Gets the "DiscussionId" element
     */
    long getDiscussionId();
    
    /**
     * Gets (as xml) the "DiscussionId" element
     */
    org.apache.xmlbeans.XmlLong xgetDiscussionId();
    
    /**
     * True if has "DiscussionId" element
     */
    boolean isSetDiscussionId();
    
    /**
     * Sets the "DiscussionId" element
     */
    void setDiscussionId(long discussionId);
    
    /**
     * Sets (as xml) the "DiscussionId" element
     */
    void xsetDiscussionId(org.apache.xmlbeans.XmlLong discussionId);
    
    /**
     * Unsets the "DiscussionId" element
     */
    void unsetDiscussionId();
    
    /**
     * Gets the "MailAddress" element
     */
    java.lang.String getMailAddress();
    
    /**
     * Gets (as xml) the "MailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetMailAddress();
    
    /**
     * Tests for nil "MailAddress" element
     */
    boolean isNilMailAddress();
    
    /**
     * True if has "MailAddress" element
     */
    boolean isSetMailAddress();
    
    /**
     * Sets the "MailAddress" element
     */
    void setMailAddress(java.lang.String mailAddress);
    
    /**
     * Sets (as xml) the "MailAddress" element
     */
    void xsetMailAddress(org.apache.xmlbeans.XmlString mailAddress);
    
    /**
     * Nils the "MailAddress" element
     */
    void setNilMailAddress();
    
    /**
     * Unsets the "MailAddress" element
     */
    void unsetMailAddress();
    
    /**
     * Gets the "OperationStatus" element
     */
    com.cdiscount.www.DiscussionMailStatusEnum.Enum getOperationStatus();
    
    /**
     * Gets (as xml) the "OperationStatus" element
     */
    com.cdiscount.www.DiscussionMailStatusEnum xgetOperationStatus();
    
    /**
     * True if has "OperationStatus" element
     */
    boolean isSetOperationStatus();
    
    /**
     * Sets the "OperationStatus" element
     */
    void setOperationStatus(com.cdiscount.www.DiscussionMailStatusEnum.Enum operationStatus);
    
    /**
     * Sets (as xml) the "OperationStatus" element
     */
    void xsetOperationStatus(com.cdiscount.www.DiscussionMailStatusEnum operationStatus);
    
    /**
     * Unsets the "OperationStatus" element
     */
    void unsetOperationStatus();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.DiscussionMail newInstance() {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.DiscussionMail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.DiscussionMail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.DiscussionMail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.DiscussionMail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.DiscussionMail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.DiscussionMail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.DiscussionMail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.DiscussionMail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscussionMail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.DiscussionMail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.DiscussionMail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
