/*
 * XML Type:  SupplyOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML SupplyOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface SupplyOrderLine extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupplyOrderLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("supplyorderline4444type");
    
    /**
     * Gets the "IsFod" element
     */
    boolean getIsFod();
    
    /**
     * Gets (as xml) the "IsFod" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFod();
    
    /**
     * True if has "IsFod" element
     */
    boolean isSetIsFod();
    
    /**
     * Sets the "IsFod" element
     */
    void setIsFod(boolean isFod);
    
    /**
     * Sets (as xml) the "IsFod" element
     */
    void xsetIsFod(org.apache.xmlbeans.XmlBoolean isFod);
    
    /**
     * Unsets the "IsFod" element
     */
    void unsetIsFod();
    
    /**
     * Gets the "OrderReferenceList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getOrderReferenceList();
    
    /**
     * Tests for nil "OrderReferenceList" element
     */
    boolean isNilOrderReferenceList();
    
    /**
     * True if has "OrderReferenceList" element
     */
    boolean isSetOrderReferenceList();
    
    /**
     * Sets the "OrderReferenceList" element
     */
    void setOrderReferenceList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring orderReferenceList);
    
    /**
     * Appends and returns a new empty "OrderReferenceList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewOrderReferenceList();
    
    /**
     * Nils the "OrderReferenceList" element
     */
    void setNilOrderReferenceList();
    
    /**
     * Unsets the "OrderReferenceList" element
     */
    void unsetOrderReferenceList();
    
    /**
     * Gets the "OrderedQuantity" element
     */
    int getOrderedQuantity();
    
    /**
     * Gets (as xml) the "OrderedQuantity" element
     */
    org.apache.xmlbeans.XmlInt xgetOrderedQuantity();
    
    /**
     * True if has "OrderedQuantity" element
     */
    boolean isSetOrderedQuantity();
    
    /**
     * Sets the "OrderedQuantity" element
     */
    void setOrderedQuantity(int orderedQuantity);
    
    /**
     * Sets (as xml) the "OrderedQuantity" element
     */
    void xsetOrderedQuantity(org.apache.xmlbeans.XmlInt orderedQuantity);
    
    /**
     * Unsets the "OrderedQuantity" element
     */
    void unsetOrderedQuantity();
    
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
     * True if has "ProductEan" element
     */
    boolean isSetProductEan();
    
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
     * Unsets the "ProductEan" element
     */
    void unsetProductEan();
    
    /**
     * Gets the "ReceivedQuantity" element
     */
    int getReceivedQuantity();
    
    /**
     * Gets (as xml) the "ReceivedQuantity" element
     */
    org.apache.xmlbeans.XmlInt xgetReceivedQuantity();
    
    /**
     * Tests for nil "ReceivedQuantity" element
     */
    boolean isNilReceivedQuantity();
    
    /**
     * True if has "ReceivedQuantity" element
     */
    boolean isSetReceivedQuantity();
    
    /**
     * Sets the "ReceivedQuantity" element
     */
    void setReceivedQuantity(int receivedQuantity);
    
    /**
     * Sets (as xml) the "ReceivedQuantity" element
     */
    void xsetReceivedQuantity(org.apache.xmlbeans.XmlInt receivedQuantity);
    
    /**
     * Nils the "ReceivedQuantity" element
     */
    void setNilReceivedQuantity();
    
    /**
     * Unsets the "ReceivedQuantity" element
     */
    void unsetReceivedQuantity();
    
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
     * Gets the "Status" element
     */
    com.cdiscount.www.SupplyOrderStatusType.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    com.cdiscount.www.SupplyOrderStatusType xgetStatus();
    
    /**
     * Tests for nil "Status" element
     */
    boolean isNilStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(com.cdiscount.www.SupplyOrderStatusType.Enum status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(com.cdiscount.www.SupplyOrderStatusType status);
    
    /**
     * Nils the "Status" element
     */
    void setNilStatus();
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
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
     * True if has "SupplyOrderNumber" element
     */
    boolean isSetSupplyOrderNumber();
    
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
     * Unsets the "SupplyOrderNumber" element
     */
    void unsetSupplyOrderNumber();
    
    /**
     * Gets the "UndeliveredQuantity" element
     */
    int getUndeliveredQuantity();
    
    /**
     * Gets (as xml) the "UndeliveredQuantity" element
     */
    org.apache.xmlbeans.XmlInt xgetUndeliveredQuantity();
    
    /**
     * True if has "UndeliveredQuantity" element
     */
    boolean isSetUndeliveredQuantity();
    
    /**
     * Sets the "UndeliveredQuantity" element
     */
    void setUndeliveredQuantity(int undeliveredQuantity);
    
    /**
     * Sets (as xml) the "UndeliveredQuantity" element
     */
    void xsetUndeliveredQuantity(org.apache.xmlbeans.XmlInt undeliveredQuantity);
    
    /**
     * Unsets the "UndeliveredQuantity" element
     */
    void unsetUndeliveredQuantity();
    
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
     * True if has "Warehouse" element
     */
    boolean isSetWarehouse();
    
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
     * Unsets the "Warehouse" element
     */
    void unsetWarehouse();
    
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
        public static com.cdiscount.www.SupplyOrderLine newInstance() {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SupplyOrderLine parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SupplyOrderLine parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SupplyOrderLine parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SupplyOrderLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SupplyOrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
