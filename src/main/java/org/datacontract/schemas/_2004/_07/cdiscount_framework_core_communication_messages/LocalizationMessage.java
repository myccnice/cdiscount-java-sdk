/*
 * XML Type:  LocalizationMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages;


/**
 * An XML LocalizationMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public interface LocalizationMessage extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocalizationMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("localizationmessage4814type");
    
    /**
     * Gets the "Country" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country.Enum getCountry();
    
    /**
     * Gets (as xml) the "Country" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country xgetCountry();
    
    /**
     * True if has "Country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "Country" element
     */
    void setCountry(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country.Enum country);
    
    /**
     * Sets (as xml) the "Country" element
     */
    void xsetCountry(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country country);
    
    /**
     * Unsets the "Country" element
     */
    void unsetCountry();
    
    /**
     * Gets the "CultureName" element
     */
    java.lang.String getCultureName();
    
    /**
     * Gets (as xml) the "CultureName" element
     */
    org.apache.xmlbeans.XmlString xgetCultureName();
    
    /**
     * Tests for nil "CultureName" element
     */
    boolean isNilCultureName();
    
    /**
     * True if has "CultureName" element
     */
    boolean isSetCultureName();
    
    /**
     * Sets the "CultureName" element
     */
    void setCultureName(java.lang.String cultureName);
    
    /**
     * Sets (as xml) the "CultureName" element
     */
    void xsetCultureName(org.apache.xmlbeans.XmlString cultureName);
    
    /**
     * Nils the "CultureName" element
     */
    void setNilCultureName();
    
    /**
     * Unsets the "CultureName" element
     */
    void unsetCultureName();
    
    /**
     * Gets the "Currency" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency.Enum getCurrency();
    
    /**
     * Gets (as xml) the "Currency" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency xgetCurrency();
    
    /**
     * True if has "Currency" element
     */
    boolean isSetCurrency();
    
    /**
     * Sets the "Currency" element
     */
    void setCurrency(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency.Enum currency);
    
    /**
     * Sets (as xml) the "Currency" element
     */
    void xsetCurrency(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency currency);
    
    /**
     * Unsets the "Currency" element
     */
    void unsetCurrency();
    
    /**
     * Gets the "DecimalPosition" element
     */
    int getDecimalPosition();
    
    /**
     * Gets (as xml) the "DecimalPosition" element
     */
    org.apache.xmlbeans.XmlInt xgetDecimalPosition();
    
    /**
     * Tests for nil "DecimalPosition" element
     */
    boolean isNilDecimalPosition();
    
    /**
     * True if has "DecimalPosition" element
     */
    boolean isSetDecimalPosition();
    
    /**
     * Sets the "DecimalPosition" element
     */
    void setDecimalPosition(int decimalPosition);
    
    /**
     * Sets (as xml) the "DecimalPosition" element
     */
    void xsetDecimalPosition(org.apache.xmlbeans.XmlInt decimalPosition);
    
    /**
     * Nils the "DecimalPosition" element
     */
    void setNilDecimalPosition();
    
    /**
     * Unsets the "DecimalPosition" element
     */
    void unsetDecimalPosition();
    
    /**
     * Gets the "Language" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language.Enum getLanguage();
    
    /**
     * Gets (as xml) the "Language" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language xgetLanguage();
    
    /**
     * True if has "Language" element
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "Language" element
     */
    void setLanguage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language.Enum language);
    
    /**
     * Sets (as xml) the "Language" element
     */
    void xsetLanguage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language language);
    
    /**
     * Unsets the "Language" element
     */
    void unsetLanguage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
