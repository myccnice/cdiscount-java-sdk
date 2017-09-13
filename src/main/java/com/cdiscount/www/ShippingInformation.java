/*
 * XML Type:  ShippingInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ShippingInformation
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ShippingInformation(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ShippingInformation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShippingInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("shippinginformationb7b9type");
    
    /**
     * Gets the "AdditionalShippingCharges" element
     */
    java.math.BigDecimal getAdditionalShippingCharges();
    
    /**
     * Gets (as xml) the "AdditionalShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetAdditionalShippingCharges();
    
    /**
     * True if has "AdditionalShippingCharges" element
     */
    boolean isSetAdditionalShippingCharges();
    
    /**
     * Sets the "AdditionalShippingCharges" element
     */
    void setAdditionalShippingCharges(java.math.BigDecimal additionalShippingCharges);
    
    /**
     * Sets (as xml) the "AdditionalShippingCharges" element
     */
    void xsetAdditionalShippingCharges(org.apache.xmlbeans.XmlDecimal additionalShippingCharges);
    
    /**
     * Unsets the "AdditionalShippingCharges" element
     */
    void unsetAdditionalShippingCharges();
    
    /**
     * Gets the "DeliveryMode" element
     */
    com.cdiscount.www.DeliveryModeInformation getDeliveryMode();
    
    /**
     * Tests for nil "DeliveryMode" element
     */
    boolean isNilDeliveryMode();
    
    /**
     * True if has "DeliveryMode" element
     */
    boolean isSetDeliveryMode();
    
    /**
     * Sets the "DeliveryMode" element
     */
    void setDeliveryMode(com.cdiscount.www.DeliveryModeInformation deliveryMode);
    
    /**
     * Appends and returns a new empty "DeliveryMode" element
     */
    com.cdiscount.www.DeliveryModeInformation addNewDeliveryMode();
    
    /**
     * Nils the "DeliveryMode" element
     */
    void setNilDeliveryMode();
    
    /**
     * Unsets the "DeliveryMode" element
     */
    void unsetDeliveryMode();
    
    /**
     * Gets the "MaxLeadTime" element
     */
    int getMaxLeadTime();
    
    /**
     * Gets (as xml) the "MaxLeadTime" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxLeadTime();
    
    /**
     * True if has "MaxLeadTime" element
     */
    boolean isSetMaxLeadTime();
    
    /**
     * Sets the "MaxLeadTime" element
     */
    void setMaxLeadTime(int maxLeadTime);
    
    /**
     * Sets (as xml) the "MaxLeadTime" element
     */
    void xsetMaxLeadTime(org.apache.xmlbeans.XmlInt maxLeadTime);
    
    /**
     * Unsets the "MaxLeadTime" element
     */
    void unsetMaxLeadTime();
    
    /**
     * Gets the "MinLeadTime" element
     */
    int getMinLeadTime();
    
    /**
     * Gets (as xml) the "MinLeadTime" element
     */
    org.apache.xmlbeans.XmlInt xgetMinLeadTime();
    
    /**
     * True if has "MinLeadTime" element
     */
    boolean isSetMinLeadTime();
    
    /**
     * Sets the "MinLeadTime" element
     */
    void setMinLeadTime(int minLeadTime);
    
    /**
     * Sets (as xml) the "MinLeadTime" element
     */
    void xsetMinLeadTime(org.apache.xmlbeans.XmlInt minLeadTime);
    
    /**
     * Unsets the "MinLeadTime" element
     */
    void unsetMinLeadTime();
    
    /**
     * Gets the "ShippingCharges" element
     */
    java.math.BigDecimal getShippingCharges();
    
    /**
     * Gets (as xml) the "ShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetShippingCharges();
    
    /**
     * True if has "ShippingCharges" element
     */
    boolean isSetShippingCharges();
    
    /**
     * Sets the "ShippingCharges" element
     */
    void setShippingCharges(java.math.BigDecimal shippingCharges);
    
    /**
     * Sets (as xml) the "ShippingCharges" element
     */
    void xsetShippingCharges(org.apache.xmlbeans.XmlDecimal shippingCharges);
    
    /**
     * Unsets the "ShippingCharges" element
     */
    void unsetShippingCharges();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ShippingInformation newInstance() {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ShippingInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ShippingInformation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ShippingInformation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ShippingInformation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ShippingInformation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ShippingInformation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ShippingInformation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ShippingInformation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ShippingInformation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ShippingInformation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ShippingInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
