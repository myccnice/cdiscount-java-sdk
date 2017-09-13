/*
 * XML Type:  DiscussionMailGuidCreationResultMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail;


/**
 * An XML DiscussionMailGuidCreationResultMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail).
 *
 * This is a complex type.
 */
public interface DiscussionMailGuidCreationResultMessage extends com.cdiscount.www.ServiceBaseAPIMessage
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscussionMailGuidCreationResultMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("discussionmailguidcreationresultmessagef598type");
    
    /**
     * Gets the "MailGuid" element
     */
    java.lang.String getMailGuid();
    
    /**
     * Gets (as xml) the "MailGuid" element
     */
    org.apache.xmlbeans.XmlString xgetMailGuid();
    
    /**
     * Tests for nil "MailGuid" element
     */
    boolean isNilMailGuid();
    
    /**
     * True if has "MailGuid" element
     */
    boolean isSetMailGuid();
    
    /**
     * Sets the "MailGuid" element
     */
    void setMailGuid(java.lang.String mailGuid);
    
    /**
     * Sets (as xml) the "MailGuid" element
     */
    void xsetMailGuid(org.apache.xmlbeans.XmlString mailGuid);
    
    /**
     * Nils the "MailGuid" element
     */
    void setNilMailGuid();
    
    /**
     * Unsets the "MailGuid" element
     */
    void unsetMailGuid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
