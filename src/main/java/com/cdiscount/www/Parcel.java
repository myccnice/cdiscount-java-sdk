/*
 * XML Type:  Parcel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Parcel
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML Parcel(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface Parcel extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parcel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("parcel57fctype");
    
    /**
     * Gets the "CustomerNum" element
     */
    java.lang.String getCustomerNum();
    
    /**
     * Gets (as xml) the "CustomerNum" element
     */
    org.apache.xmlbeans.XmlString xgetCustomerNum();
    
    /**
     * Tests for nil "CustomerNum" element
     */
    boolean isNilCustomerNum();
    
    /**
     * True if has "CustomerNum" element
     */
    boolean isSetCustomerNum();
    
    /**
     * Sets the "CustomerNum" element
     */
    void setCustomerNum(java.lang.String customerNum);
    
    /**
     * Sets (as xml) the "CustomerNum" element
     */
    void xsetCustomerNum(org.apache.xmlbeans.XmlString customerNum);
    
    /**
     * Nils the "CustomerNum" element
     */
    void setNilCustomerNum();
    
    /**
     * Unsets the "CustomerNum" element
     */
    void unsetCustomerNum();
    
    /**
     * Gets the "ExternalCarrierName" element
     */
    java.lang.String getExternalCarrierName();
    
    /**
     * Gets (as xml) the "ExternalCarrierName" element
     */
    org.apache.xmlbeans.XmlString xgetExternalCarrierName();
    
    /**
     * Tests for nil "ExternalCarrierName" element
     */
    boolean isNilExternalCarrierName();
    
    /**
     * True if has "ExternalCarrierName" element
     */
    boolean isSetExternalCarrierName();
    
    /**
     * Sets the "ExternalCarrierName" element
     */
    void setExternalCarrierName(java.lang.String externalCarrierName);
    
    /**
     * Sets (as xml) the "ExternalCarrierName" element
     */
    void xsetExternalCarrierName(org.apache.xmlbeans.XmlString externalCarrierName);
    
    /**
     * Nils the "ExternalCarrierName" element
     */
    void setNilExternalCarrierName();
    
    /**
     * Unsets the "ExternalCarrierName" element
     */
    void unsetExternalCarrierName();
    
    /**
     * Gets the "ExternalCarrierTrackingUrl" element
     */
    java.lang.String getExternalCarrierTrackingUrl();
    
    /**
     * Gets (as xml) the "ExternalCarrierTrackingUrl" element
     */
    org.apache.xmlbeans.XmlString xgetExternalCarrierTrackingUrl();
    
    /**
     * Tests for nil "ExternalCarrierTrackingUrl" element
     */
    boolean isNilExternalCarrierTrackingUrl();
    
    /**
     * True if has "ExternalCarrierTrackingUrl" element
     */
    boolean isSetExternalCarrierTrackingUrl();
    
    /**
     * Sets the "ExternalCarrierTrackingUrl" element
     */
    void setExternalCarrierTrackingUrl(java.lang.String externalCarrierTrackingUrl);
    
    /**
     * Sets (as xml) the "ExternalCarrierTrackingUrl" element
     */
    void xsetExternalCarrierTrackingUrl(org.apache.xmlbeans.XmlString externalCarrierTrackingUrl);
    
    /**
     * Nils the "ExternalCarrierTrackingUrl" element
     */
    void setNilExternalCarrierTrackingUrl();
    
    /**
     * Unsets the "ExternalCarrierTrackingUrl" element
     */
    void unsetExternalCarrierTrackingUrl();
    
    /**
     * Gets the "IsCustomerReturn" element
     */
    boolean getIsCustomerReturn();
    
    /**
     * Gets (as xml) the "IsCustomerReturn" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomerReturn();
    
    /**
     * True if has "IsCustomerReturn" element
     */
    boolean isSetIsCustomerReturn();
    
    /**
     * Sets the "IsCustomerReturn" element
     */
    void setIsCustomerReturn(boolean isCustomerReturn);
    
    /**
     * Sets (as xml) the "IsCustomerReturn" element
     */
    void xsetIsCustomerReturn(org.apache.xmlbeans.XmlBoolean isCustomerReturn);
    
    /**
     * Unsets the "IsCustomerReturn" element
     */
    void unsetIsCustomerReturn();
    
    /**
     * Gets the "ParcelItemList" element
     */
    com.cdiscount.www.ArrayOfParcelItem getParcelItemList();
    
    /**
     * Tests for nil "ParcelItemList" element
     */
    boolean isNilParcelItemList();
    
    /**
     * True if has "ParcelItemList" element
     */
    boolean isSetParcelItemList();
    
    /**
     * Sets the "ParcelItemList" element
     */
    void setParcelItemList(com.cdiscount.www.ArrayOfParcelItem parcelItemList);
    
    /**
     * Appends and returns a new empty "ParcelItemList" element
     */
    com.cdiscount.www.ArrayOfParcelItem addNewParcelItemList();
    
    /**
     * Nils the "ParcelItemList" element
     */
    void setNilParcelItemList();
    
    /**
     * Unsets the "ParcelItemList" element
     */
    void unsetParcelItemList();
    
    /**
     * Gets the "ParcelStatus" element
     */
    com.cdiscount.www.ParcelStatus.Enum getParcelStatus();
    
    /**
     * Gets (as xml) the "ParcelStatus" element
     */
    com.cdiscount.www.ParcelStatus xgetParcelStatus();
    
    /**
     * Tests for nil "ParcelStatus" element
     */
    boolean isNilParcelStatus();
    
    /**
     * True if has "ParcelStatus" element
     */
    boolean isSetParcelStatus();
    
    /**
     * Sets the "ParcelStatus" element
     */
    void setParcelStatus(com.cdiscount.www.ParcelStatus.Enum parcelStatus);
    
    /**
     * Sets (as xml) the "ParcelStatus" element
     */
    void xsetParcelStatus(com.cdiscount.www.ParcelStatus parcelStatus);
    
    /**
     * Nils the "ParcelStatus" element
     */
    void setNilParcelStatus();
    
    /**
     * Unsets the "ParcelStatus" element
     */
    void unsetParcelStatus();
    
    /**
     * Gets the "RealCarrierCode" element
     */
    java.lang.String getRealCarrierCode();
    
    /**
     * Gets (as xml) the "RealCarrierCode" element
     */
    org.apache.xmlbeans.XmlString xgetRealCarrierCode();
    
    /**
     * Tests for nil "RealCarrierCode" element
     */
    boolean isNilRealCarrierCode();
    
    /**
     * True if has "RealCarrierCode" element
     */
    boolean isSetRealCarrierCode();
    
    /**
     * Sets the "RealCarrierCode" element
     */
    void setRealCarrierCode(java.lang.String realCarrierCode);
    
    /**
     * Sets (as xml) the "RealCarrierCode" element
     */
    void xsetRealCarrierCode(org.apache.xmlbeans.XmlString realCarrierCode);
    
    /**
     * Nils the "RealCarrierCode" element
     */
    void setNilRealCarrierCode();
    
    /**
     * Unsets the "RealCarrierCode" element
     */
    void unsetRealCarrierCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.Parcel newInstance() {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.Parcel newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.Parcel parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.Parcel parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.Parcel parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.Parcel parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.Parcel parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.Parcel parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.Parcel parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.Parcel parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.Parcel parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.Parcel parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.Parcel parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.Parcel parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.Parcel parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.Parcel parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Parcel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Parcel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Parcel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
