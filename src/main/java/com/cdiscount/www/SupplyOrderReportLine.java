/*
 * XML Type:  SupplyOrderReportLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML SupplyOrderReportLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface SupplyOrderReportLine extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupplyOrderReportLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("supplyorderreportline93f0type");
    
    /**
     * Gets the "ErrorDetails" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring getErrorDetails();
    
    /**
     * Tests for nil "ErrorDetails" element
     */
    boolean isNilErrorDetails();
    
    /**
     * True if has "ErrorDetails" element
     */
    boolean isSetErrorDetails();
    
    /**
     * Sets the "ErrorDetails" element
     */
    void setErrorDetails(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring errorDetails);
    
    /**
     * Appends and returns a new empty "ErrorDetails" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring addNewErrorDetails();
    
    /**
     * Nils the "ErrorDetails" element
     */
    void setNilErrorDetails();
    
    /**
     * Unsets the "ErrorDetails" element
     */
    void unsetErrorDetails();
    
    /**
     * Gets the "OrderedQuantity" element
     */
    int getOrderedQuantity();
    
    /**
     * Gets (as xml) the "OrderedQuantity" element
     */
    org.apache.xmlbeans.XmlInt xgetOrderedQuantity();
    
    /**
     * Sets the "OrderedQuantity" element
     */
    void setOrderedQuantity(int orderedQuantity);
    
    /**
     * Sets (as xml) the "OrderedQuantity" element
     */
    void xsetOrderedQuantity(org.apache.xmlbeans.XmlInt orderedQuantity);
    
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
     * Gets the "SellerId" element
     */
    long getSellerId();
    
    /**
     * Gets (as xml) the "SellerId" element
     */
    org.apache.xmlbeans.XmlLong xgetSellerId();
    
    /**
     * True if has "SellerId" element
     */
    boolean isSetSellerId();
    
    /**
     * Sets the "SellerId" element
     */
    void setSellerId(long sellerId);
    
    /**
     * Sets (as xml) the "SellerId" element
     */
    void xsetSellerId(org.apache.xmlbeans.XmlLong sellerId);
    
    /**
     * Unsets the "SellerId" element
     */
    void unsetSellerId();
    
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
     * Gets the "SellerSupplyOrderNumber" element
     */
    java.lang.String getSellerSupplyOrderNumber();
    
    /**
     * Gets (as xml) the "SellerSupplyOrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetSellerSupplyOrderNumber();
    
    /**
     * Tests for nil "SellerSupplyOrderNumber" element
     */
    boolean isNilSellerSupplyOrderNumber();
    
    /**
     * True if has "SellerSupplyOrderNumber" element
     */
    boolean isSetSellerSupplyOrderNumber();
    
    /**
     * Sets the "SellerSupplyOrderNumber" element
     */
    void setSellerSupplyOrderNumber(java.lang.String sellerSupplyOrderNumber);
    
    /**
     * Sets (as xml) the "SellerSupplyOrderNumber" element
     */
    void xsetSellerSupplyOrderNumber(org.apache.xmlbeans.XmlString sellerSupplyOrderNumber);
    
    /**
     * Nils the "SellerSupplyOrderNumber" element
     */
    void setNilSellerSupplyOrderNumber();
    
    /**
     * Unsets the "SellerSupplyOrderNumber" element
     */
    void unsetSellerSupplyOrderNumber();
    
    /**
     * Gets the "SupplyOrderNumber" element
     */
    java.lang.String getSupplyOrderNumber();
    
    /**
     * Gets (as xml) the "SupplyOrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetSupplyOrderNumber();
    
    /**
     * Tests for nil "SupplyOrderNumber" element
     */
    boolean isNilSupplyOrderNumber();
    
    /**
     * Sets the "SupplyOrderNumber" element
     */
    void setSupplyOrderNumber(java.lang.String supplyOrderNumber);
    
    /**
     * Sets (as xml) the "SupplyOrderNumber" element
     */
    void xsetSupplyOrderNumber(org.apache.xmlbeans.XmlString supplyOrderNumber);
    
    /**
     * Nils the "SupplyOrderNumber" element
     */
    void setNilSupplyOrderNumber();
    
    /**
     * Gets the "Warehouse" element
     */
    com.cdiscount.www.WarehouseType.Enum getWarehouse();
    
    /**
     * Gets (as xml) the "Warehouse" element
     */
    com.cdiscount.www.WarehouseType xgetWarehouse();
    
    /**
     * Tests for nil "Warehouse" element
     */
    boolean isNilWarehouse();
    
    /**
     * Sets the "Warehouse" element
     */
    void setWarehouse(com.cdiscount.www.WarehouseType.Enum warehouse);
    
    /**
     * Sets (as xml) the "Warehouse" element
     */
    void xsetWarehouse(com.cdiscount.www.WarehouseType warehouse);
    
    /**
     * Nils the "Warehouse" element
     */
    void setNilWarehouse();
    
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
        public static com.cdiscount.www.SupplyOrderReportLine newInstance() {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderReportLine parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderReportLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderReportLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderReportLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
