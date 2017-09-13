/*
 * XML Type:  ValidateOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrder
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ValidateOrder(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ValidateOrder extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidateOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("validateorderb27ftype");
    
    /**
     * Gets the "CarrierName" element
     */
    java.lang.String getCarrierName();
    
    /**
     * Gets (as xml) the "CarrierName" element
     */
    org.apache.xmlbeans.XmlString xgetCarrierName();
    
    /**
     * Tests for nil "CarrierName" element
     */
    boolean isNilCarrierName();
    
    /**
     * True if has "CarrierName" element
     */
    boolean isSetCarrierName();
    
    /**
     * Sets the "CarrierName" element
     */
    void setCarrierName(java.lang.String carrierName);
    
    /**
     * Sets (as xml) the "CarrierName" element
     */
    void xsetCarrierName(org.apache.xmlbeans.XmlString carrierName);
    
    /**
     * Nils the "CarrierName" element
     */
    void setNilCarrierName();
    
    /**
     * Unsets the "CarrierName" element
     */
    void unsetCarrierName();
    
    /**
     * Gets the "OrderLineList" element
     */
    com.cdiscount.www.ArrayOfValidateOrderLine getOrderLineList();
    
    /**
     * Tests for nil "OrderLineList" element
     */
    boolean isNilOrderLineList();
    
    /**
     * True if has "OrderLineList" element
     */
    boolean isSetOrderLineList();
    
    /**
     * Sets the "OrderLineList" element
     */
    void setOrderLineList(com.cdiscount.www.ArrayOfValidateOrderLine orderLineList);
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    com.cdiscount.www.ArrayOfValidateOrderLine addNewOrderLineList();
    
    /**
     * Nils the "OrderLineList" element
     */
    void setNilOrderLineList();
    
    /**
     * Unsets the "OrderLineList" element
     */
    void unsetOrderLineList();
    
    /**
     * Gets the "OrderNumber" element
     */
    java.lang.String getOrderNumber();
    
    /**
     * Gets (as xml) the "OrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOrderNumber();
    
    /**
     * Tests for nil "OrderNumber" element
     */
    boolean isNilOrderNumber();
    
    /**
     * True if has "OrderNumber" element
     */
    boolean isSetOrderNumber();
    
    /**
     * Sets the "OrderNumber" element
     */
    void setOrderNumber(java.lang.String orderNumber);
    
    /**
     * Sets (as xml) the "OrderNumber" element
     */
    void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber);
    
    /**
     * Nils the "OrderNumber" element
     */
    void setNilOrderNumber();
    
    /**
     * Unsets the "OrderNumber" element
     */
    void unsetOrderNumber();
    
    /**
     * Gets the "OrderState" element
     */
    com.cdiscount.www.OrderStateEnum.Enum getOrderState();
    
    /**
     * Gets (as xml) the "OrderState" element
     */
    com.cdiscount.www.OrderStateEnum xgetOrderState();
    
    /**
     * True if has "OrderState" element
     */
    boolean isSetOrderState();
    
    /**
     * Sets the "OrderState" element
     */
    void setOrderState(com.cdiscount.www.OrderStateEnum.Enum orderState);
    
    /**
     * Sets (as xml) the "OrderState" element
     */
    void xsetOrderState(com.cdiscount.www.OrderStateEnum orderState);
    
    /**
     * Unsets the "OrderState" element
     */
    void unsetOrderState();
    
    /**
     * Gets the "TrackingNumber" element
     */
    java.lang.String getTrackingNumber();
    
    /**
     * Gets (as xml) the "TrackingNumber" element
     */
    org.apache.xmlbeans.XmlString xgetTrackingNumber();
    
    /**
     * Tests for nil "TrackingNumber" element
     */
    boolean isNilTrackingNumber();
    
    /**
     * True if has "TrackingNumber" element
     */
    boolean isSetTrackingNumber();
    
    /**
     * Sets the "TrackingNumber" element
     */
    void setTrackingNumber(java.lang.String trackingNumber);
    
    /**
     * Sets (as xml) the "TrackingNumber" element
     */
    void xsetTrackingNumber(org.apache.xmlbeans.XmlString trackingNumber);
    
    /**
     * Nils the "TrackingNumber" element
     */
    void setNilTrackingNumber();
    
    /**
     * Unsets the "TrackingNumber" element
     */
    void unsetTrackingNumber();
    
    /**
     * Gets the "TrackingUrl" element
     */
    java.lang.String getTrackingUrl();
    
    /**
     * Gets (as xml) the "TrackingUrl" element
     */
    org.apache.xmlbeans.XmlString xgetTrackingUrl();
    
    /**
     * Tests for nil "TrackingUrl" element
     */
    boolean isNilTrackingUrl();
    
    /**
     * True if has "TrackingUrl" element
     */
    boolean isSetTrackingUrl();
    
    /**
     * Sets the "TrackingUrl" element
     */
    void setTrackingUrl(java.lang.String trackingUrl);
    
    /**
     * Sets (as xml) the "TrackingUrl" element
     */
    void xsetTrackingUrl(org.apache.xmlbeans.XmlString trackingUrl);
    
    /**
     * Nils the "TrackingUrl" element
     */
    void setNilTrackingUrl();
    
    /**
     * Unsets the "TrackingUrl" element
     */
    void unsetTrackingUrl();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ValidateOrder newInstance() {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ValidateOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ValidateOrder parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ValidateOrder parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ValidateOrder parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ValidateOrder parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ValidateOrder parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ValidateOrder parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ValidateOrder parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ValidateOrder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ValidateOrder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ValidateOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
