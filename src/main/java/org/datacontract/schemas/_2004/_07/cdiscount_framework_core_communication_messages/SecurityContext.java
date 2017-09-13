/*
 * XML Type:  SecurityContext
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages;


/**
 * An XML SecurityContext(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public interface SecurityContext extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityContext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("securitycontextfbb5type");
    
    /**
     * Gets the "DomainRightsList" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights getDomainRightsList();
    
    /**
     * Tests for nil "DomainRightsList" element
     */
    boolean isNilDomainRightsList();
    
    /**
     * Sets the "DomainRightsList" element
     */
    void setDomainRightsList(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights domainRightsList);
    
    /**
     * Appends and returns a new empty "DomainRightsList" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights addNewDomainRightsList();
    
    /**
     * Nils the "DomainRightsList" element
     */
    void setNilDomainRightsList();
    
    /**
     * Gets the "IssuerID" element
     */
    java.lang.String getIssuerID();
    
    /**
     * Gets (as xml) the "IssuerID" element
     */
    org.apache.xmlbeans.XmlString xgetIssuerID();
    
    /**
     * Tests for nil "IssuerID" element
     */
    boolean isNilIssuerID();
    
    /**
     * Sets the "IssuerID" element
     */
    void setIssuerID(java.lang.String issuerID);
    
    /**
     * Sets (as xml) the "IssuerID" element
     */
    void xsetIssuerID(org.apache.xmlbeans.XmlString issuerID);
    
    /**
     * Nils the "IssuerID" element
     */
    void setNilIssuerID();
    
    /**
     * Gets the "SessionID" element
     */
    java.lang.String getSessionID();
    
    /**
     * Gets (as xml) the "SessionID" element
     */
    org.apache.xmlbeans.XmlString xgetSessionID();
    
    /**
     * Tests for nil "SessionID" element
     */
    boolean isNilSessionID();
    
    /**
     * Sets the "SessionID" element
     */
    void setSessionID(java.lang.String sessionID);
    
    /**
     * Sets (as xml) the "SessionID" element
     */
    void xsetSessionID(org.apache.xmlbeans.XmlString sessionID);
    
    /**
     * Nils the "SessionID" element
     */
    void setNilSessionID();
    
    /**
     * Gets the "SubjectLocality" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality getSubjectLocality();
    
    /**
     * Tests for nil "SubjectLocality" element
     */
    boolean isNilSubjectLocality();
    
    /**
     * True if has "SubjectLocality" element
     */
    boolean isSetSubjectLocality();
    
    /**
     * Sets the "SubjectLocality" element
     */
    void setSubjectLocality(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality subjectLocality);
    
    /**
     * Appends and returns a new empty "SubjectLocality" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality addNewSubjectLocality();
    
    /**
     * Nils the "SubjectLocality" element
     */
    void setNilSubjectLocality();
    
    /**
     * Unsets the "SubjectLocality" element
     */
    void unsetSubjectLocality();
    
    /**
     * Gets the "TokenId" element
     */
    java.lang.String getTokenId();
    
    /**
     * Gets (as xml) the "TokenId" element
     */
    org.apache.xmlbeans.XmlString xgetTokenId();
    
    /**
     * Tests for nil "TokenId" element
     */
    boolean isNilTokenId();
    
    /**
     * Sets the "TokenId" element
     */
    void setTokenId(java.lang.String tokenId);
    
    /**
     * Sets (as xml) the "TokenId" element
     */
    void xsetTokenId(org.apache.xmlbeans.XmlString tokenId);
    
    /**
     * Nils the "TokenId" element
     */
    void setNilTokenId();
    
    /**
     * Gets the "UserName" element
     */
    java.lang.String getUserName();
    
    /**
     * Gets (as xml) the "UserName" element
     */
    org.apache.xmlbeans.XmlString xgetUserName();
    
    /**
     * Tests for nil "UserName" element
     */
    boolean isNilUserName();
    
    /**
     * Sets the "UserName" element
     */
    void setUserName(java.lang.String userName);
    
    /**
     * Sets (as xml) the "UserName" element
     */
    void xsetUserName(org.apache.xmlbeans.XmlString userName);
    
    /**
     * Nils the "UserName" element
     */
    void setNilUserName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
