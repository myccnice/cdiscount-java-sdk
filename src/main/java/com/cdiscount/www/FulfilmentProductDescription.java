/*
 * XML Type:  FulfilmentProductDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentProductDescription
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML FulfilmentProductDescription(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface FulfilmentProductDescription extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FulfilmentProductDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("fulfilmentproductdescription828etype");
    
    /**
     * Gets the "ExternalSupplyOrderId" element
     */
    java.lang.String getExternalSupplyOrderId();
    
    /**
     * Gets (as xml) the "ExternalSupplyOrderId" element
     */
    org.apache.xmlbeans.XmlString xgetExternalSupplyOrderId();
    
    /**
     * Tests for nil "ExternalSupplyOrderId" element
     */
    boolean isNilExternalSupplyOrderId();
    
    /**
     * True if has "ExternalSupplyOrderId" element
     */
    boolean isSetExternalSupplyOrderId();
    
    /**
     * Sets the "ExternalSupplyOrderId" element
     */
    void setExternalSupplyOrderId(java.lang.String externalSupplyOrderId);
    
    /**
     * Sets (as xml) the "ExternalSupplyOrderId" element
     */
    void xsetExternalSupplyOrderId(org.apache.xmlbeans.XmlString externalSupplyOrderId);
    
    /**
     * Nils the "ExternalSupplyOrderId" element
     */
    void setNilExternalSupplyOrderId();
    
    /**
     * Unsets the "ExternalSupplyOrderId" element
     */
    void unsetExternalSupplyOrderId();
    
    /**
     * Gets the "ProductEan" element
     */
    java.lang.String getProductEan();
    
    /**
     * Gets (as xml) the "ProductEan" element
     */
    org.apache.xmlbeans.XmlString xgetProductEan();
    
    /**
     * Tests for nil "ProductEan" element
     */
    boolean isNilProductEan();
    
    /**
     * Sets the "ProductEan" element
     */
    void setProductEan(java.lang.String productEan);
    
    /**
     * Sets (as xml) the "ProductEan" element
     */
    void xsetProductEan(org.apache.xmlbeans.XmlString productEan);
    
    /**
     * Nils the "ProductEan" element
     */
    void setNilProductEan();
    
    /**
     * Gets the "Quantity" element
     */
    int getQuantity();
    
    /**
     * Gets (as xml) the "Quantity" element
     */
    org.apache.xmlbeans.XmlInt xgetQuantity();
    
    /**
     * Sets the "Quantity" element
     */
    void setQuantity(int quantity);
    
    /**
     * Sets (as xml) the "Quantity" element
     */
    void xsetQuantity(org.apache.xmlbeans.XmlInt quantity);
    
    /**
     * Gets the "SellerProductReference" element
     */
    java.lang.String getSellerProductReference();
    
    /**
     * Gets (as xml) the "SellerProductReference" element
     */
    org.apache.xmlbeans.XmlString xgetSellerProductReference();
    
    /**
     * Tests for nil "SellerProductReference" element
     */
    boolean isNilSellerProductReference();
    
    /**
     * True if has "SellerProductReference" element
     */
    boolean isSetSellerProductReference();
    
    /**
     * Sets the "SellerProductReference" element
     */
    void setSellerProductReference(java.lang.String sellerProductReference);
    
    /**
     * Sets (as xml) the "SellerProductReference" element
     */
    void xsetSellerProductReference(org.apache.xmlbeans.XmlString sellerProductReference);
    
    /**
     * Nils the "SellerProductReference" element
     */
    void setNilSellerProductReference();
    
    /**
     * Unsets the "SellerProductReference" element
     */
    void unsetSellerProductReference();
    
    /**
     * Gets the "Warehouse" element
     */
    com.cdiscount.www.WarehouseType.Enum getWarehouse();
    
    /**
     * Gets (as xml) the "Warehouse" element
     */
    com.cdiscount.www.WarehouseType xgetWarehouse();
    
    /**
     * Sets the "Warehouse" element
     */
    void setWarehouse(com.cdiscount.www.WarehouseType.Enum warehouse);
    
    /**
     * Sets (as xml) the "Warehouse" element
     */
    void xsetWarehouse(com.cdiscount.www.WarehouseType warehouse);
    
    /**
     * Gets the "WarehouseReceptionMinDate" element
     */
    java.util.Calendar getWarehouseReceptionMinDate();
    
    /**
     * Gets (as xml) the "WarehouseReceptionMinDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetWarehouseReceptionMinDate();
    
    /**
     * Tests for nil "WarehouseReceptionMinDate" element
     */
    boolean isNilWarehouseReceptionMinDate();
    
    /**
     * True if has "WarehouseReceptionMinDate" element
     */
    boolean isSetWarehouseReceptionMinDate();
    
    /**
     * Sets the "WarehouseReceptionMinDate" element
     */
    void setWarehouseReceptionMinDate(java.util.Calendar warehouseReceptionMinDate);
    
    /**
     * Sets (as xml) the "WarehouseReceptionMinDate" element
     */
    void xsetWarehouseReceptionMinDate(org.apache.xmlbeans.XmlDateTime warehouseReceptionMinDate);
    
    /**
     * Nils the "WarehouseReceptionMinDate" element
     */
    void setNilWarehouseReceptionMinDate();
    
    /**
     * Unsets the "WarehouseReceptionMinDate" element
     */
    void unsetWarehouseReceptionMinDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.FulfilmentProductDescription newInstance() {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.FulfilmentProductDescription parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.FulfilmentProductDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.FulfilmentProductDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.FulfilmentProductDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
