/*
 * XML Type:  Corporation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Corporation
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML Corporation(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface Corporation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Corporation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("corporation428ftype");
    
    /**
     * Gets the "BusinessUnitId" element
     */
    short getBusinessUnitId();
    
    /**
     * Gets (as xml) the "BusinessUnitId" element
     */
    org.apache.xmlbeans.XmlShort xgetBusinessUnitId();
    
    /**
     * True if has "BusinessUnitId" element
     */
    boolean isSetBusinessUnitId();
    
    /**
     * Sets the "BusinessUnitId" element
     */
    void setBusinessUnitId(short businessUnitId);
    
    /**
     * Sets (as xml) the "BusinessUnitId" element
     */
    void xsetBusinessUnitId(org.apache.xmlbeans.XmlShort businessUnitId);
    
    /**
     * Unsets the "BusinessUnitId" element
     */
    void unsetBusinessUnitId();
    
    /**
     * Gets the "CorporationCode" element
     */
    java.lang.String getCorporationCode();
    
    /**
     * Gets (as xml) the "CorporationCode" element
     */
    org.apache.xmlbeans.XmlString xgetCorporationCode();
    
    /**
     * Tests for nil "CorporationCode" element
     */
    boolean isNilCorporationCode();
    
    /**
     * Sets the "CorporationCode" element
     */
    void setCorporationCode(java.lang.String corporationCode);
    
    /**
     * Sets (as xml) the "CorporationCode" element
     */
    void xsetCorporationCode(org.apache.xmlbeans.XmlString corporationCode);
    
    /**
     * Nils the "CorporationCode" element
     */
    void setNilCorporationCode();
    
    /**
     * Gets the "CorporationId" element
     */
    short getCorporationId();
    
    /**
     * Gets (as xml) the "CorporationId" element
     */
    org.apache.xmlbeans.XmlShort xgetCorporationId();
    
    /**
     * Sets the "CorporationId" element
     */
    void setCorporationId(short corporationId);
    
    /**
     * Sets (as xml) the "CorporationId" element
     */
    void xsetCorporationId(org.apache.xmlbeans.XmlShort corporationId);
    
    /**
     * Gets the "CorporationName" element
     */
    java.lang.String getCorporationName();
    
    /**
     * Gets (as xml) the "CorporationName" element
     */
    org.apache.xmlbeans.XmlString xgetCorporationName();
    
    /**
     * Tests for nil "CorporationName" element
     */
    boolean isNilCorporationName();
    
    /**
     * True if has "CorporationName" element
     */
    boolean isSetCorporationName();
    
    /**
     * Sets the "CorporationName" element
     */
    void setCorporationName(java.lang.String corporationName);
    
    /**
     * Sets (as xml) the "CorporationName" element
     */
    void xsetCorporationName(org.apache.xmlbeans.XmlString corporationName);
    
    /**
     * Nils the "CorporationName" element
     */
    void setNilCorporationName();
    
    /**
     * Unsets the "CorporationName" element
     */
    void unsetCorporationName();
    
    /**
     * Gets the "IsMarketPlaceActive" element
     */
    boolean getIsMarketPlaceActive();
    
    /**
     * Gets (as xml) the "IsMarketPlaceActive" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsMarketPlaceActive();
    
    /**
     * Tests for nil "IsMarketPlaceActive" element
     */
    boolean isNilIsMarketPlaceActive();
    
    /**
     * True if has "IsMarketPlaceActive" element
     */
    boolean isSetIsMarketPlaceActive();
    
    /**
     * Sets the "IsMarketPlaceActive" element
     */
    void setIsMarketPlaceActive(boolean isMarketPlaceActive);
    
    /**
     * Sets (as xml) the "IsMarketPlaceActive" element
     */
    void xsetIsMarketPlaceActive(org.apache.xmlbeans.XmlBoolean isMarketPlaceActive);
    
    /**
     * Nils the "IsMarketPlaceActive" element
     */
    void setNilIsMarketPlaceActive();
    
    /**
     * Unsets the "IsMarketPlaceActive" element
     */
    void unsetIsMarketPlaceActive();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.Corporation newInstance() {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.Corporation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.Corporation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.Corporation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.Corporation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.Corporation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.Corporation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.Corporation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.Corporation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.Corporation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.Corporation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.Corporation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.Corporation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.Corporation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.Corporation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.Corporation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Corporation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Corporation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
