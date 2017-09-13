/*
 * XML Type:  OrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface OrderLine extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("orderline35b5type");
    
    /**
     * Gets the "AcceptationState" element
     */
    com.cdiscount.www.AcceptationStateEnum.Enum getAcceptationState();
    
    /**
     * Gets (as xml) the "AcceptationState" element
     */
    com.cdiscount.www.AcceptationStateEnum xgetAcceptationState();
    
    /**
     * Tests for nil "AcceptationState" element
     */
    boolean isNilAcceptationState();
    
    /**
     * True if has "AcceptationState" element
     */
    boolean isSetAcceptationState();
    
    /**
     * Sets the "AcceptationState" element
     */
    void setAcceptationState(com.cdiscount.www.AcceptationStateEnum.Enum acceptationState);
    
    /**
     * Sets (as xml) the "AcceptationState" element
     */
    void xsetAcceptationState(com.cdiscount.www.AcceptationStateEnum acceptationState);
    
    /**
     * Nils the "AcceptationState" element
     */
    void setNilAcceptationState();
    
    /**
     * Unsets the "AcceptationState" element
     */
    void unsetAcceptationState();
    
    /**
     * Gets the "CategoryCode" element
     */
    java.lang.String getCategoryCode();
    
    /**
     * Gets (as xml) the "CategoryCode" element
     */
    org.apache.xmlbeans.XmlString xgetCategoryCode();
    
    /**
     * Tests for nil "CategoryCode" element
     */
    boolean isNilCategoryCode();
    
    /**
     * True if has "CategoryCode" element
     */
    boolean isSetCategoryCode();
    
    /**
     * Sets the "CategoryCode" element
     */
    void setCategoryCode(java.lang.String categoryCode);
    
    /**
     * Sets (as xml) the "CategoryCode" element
     */
    void xsetCategoryCode(org.apache.xmlbeans.XmlString categoryCode);
    
    /**
     * Nils the "CategoryCode" element
     */
    void setNilCategoryCode();
    
    /**
     * Unsets the "CategoryCode" element
     */
    void unsetCategoryCode();
    
    /**
     * Gets the "DeliveryDateMax" element
     */
    java.util.Calendar getDeliveryDateMax();
    
    /**
     * Gets (as xml) the "DeliveryDateMax" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDeliveryDateMax();
    
    /**
     * True if has "DeliveryDateMax" element
     */
    boolean isSetDeliveryDateMax();
    
    /**
     * Sets the "DeliveryDateMax" element
     */
    void setDeliveryDateMax(java.util.Calendar deliveryDateMax);
    
    /**
     * Sets (as xml) the "DeliveryDateMax" element
     */
    void xsetDeliveryDateMax(org.apache.xmlbeans.XmlDateTime deliveryDateMax);
    
    /**
     * Unsets the "DeliveryDateMax" element
     */
    void unsetDeliveryDateMax();
    
    /**
     * Gets the "DeliveryDateMin" element
     */
    java.util.Calendar getDeliveryDateMin();
    
    /**
     * Gets (as xml) the "DeliveryDateMin" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDeliveryDateMin();
    
    /**
     * True if has "DeliveryDateMin" element
     */
    boolean isSetDeliveryDateMin();
    
    /**
     * Sets the "DeliveryDateMin" element
     */
    void setDeliveryDateMin(java.util.Calendar deliveryDateMin);
    
    /**
     * Sets (as xml) the "DeliveryDateMin" element
     */
    void xsetDeliveryDateMin(org.apache.xmlbeans.XmlDateTime deliveryDateMin);
    
    /**
     * Unsets the "DeliveryDateMin" element
     */
    void unsetDeliveryDateMin();
    
    /**
     * Gets the "HasClaim" element
     */
    boolean getHasClaim();
    
    /**
     * Gets (as xml) the "HasClaim" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasClaim();
    
    /**
     * True if has "HasClaim" element
     */
    boolean isSetHasClaim();
    
    /**
     * Sets the "HasClaim" element
     */
    void setHasClaim(boolean hasClaim);
    
    /**
     * Sets (as xml) the "HasClaim" element
     */
    void xsetHasClaim(org.apache.xmlbeans.XmlBoolean hasClaim);
    
    /**
     * Unsets the "HasClaim" element
     */
    void unsetHasClaim();
    
    /**
     * Gets the "InitialPrice" element
     */
    java.math.BigDecimal getInitialPrice();
    
    /**
     * Gets (as xml) the "InitialPrice" element
     */
    org.apache.xmlbeans.XmlDecimal xgetInitialPrice();
    
    /**
     * Tests for nil "InitialPrice" element
     */
    boolean isNilInitialPrice();
    
    /**
     * True if has "InitialPrice" element
     */
    boolean isSetInitialPrice();
    
    /**
     * Sets the "InitialPrice" element
     */
    void setInitialPrice(java.math.BigDecimal initialPrice);
    
    /**
     * Sets (as xml) the "InitialPrice" element
     */
    void xsetInitialPrice(org.apache.xmlbeans.XmlDecimal initialPrice);
    
    /**
     * Nils the "InitialPrice" element
     */
    void setNilInitialPrice();
    
    /**
     * Unsets the "InitialPrice" element
     */
    void unsetInitialPrice();
    
    /**
     * Gets the "IsCDAV" element
     */
    boolean getIsCDAV();
    
    /**
     * Gets (as xml) the "IsCDAV" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCDAV();
    
    /**
     * True if has "IsCDAV" element
     */
    boolean isSetIsCDAV();
    
    /**
     * Sets the "IsCDAV" element
     */
    void setIsCDAV(boolean isCDAV);
    
    /**
     * Sets (as xml) the "IsCDAV" element
     */
    void xsetIsCDAV(org.apache.xmlbeans.XmlBoolean isCDAV);
    
    /**
     * Unsets the "IsCDAV" element
     */
    void unsetIsCDAV();
    
    /**
     * Gets the "IsNegotiated" element
     */
    boolean getIsNegotiated();
    
    /**
     * Gets (as xml) the "IsNegotiated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsNegotiated();
    
    /**
     * Tests for nil "IsNegotiated" element
     */
    boolean isNilIsNegotiated();
    
    /**
     * True if has "IsNegotiated" element
     */
    boolean isSetIsNegotiated();
    
    /**
     * Sets the "IsNegotiated" element
     */
    void setIsNegotiated(boolean isNegotiated);
    
    /**
     * Sets (as xml) the "IsNegotiated" element
     */
    void xsetIsNegotiated(org.apache.xmlbeans.XmlBoolean isNegotiated);
    
    /**
     * Nils the "IsNegotiated" element
     */
    void setNilIsNegotiated();
    
    /**
     * Unsets the "IsNegotiated" element
     */
    void unsetIsNegotiated();
    
    /**
     * Gets the "IsProductEanGenerated" element
     */
    boolean getIsProductEanGenerated();
    
    /**
     * Gets (as xml) the "IsProductEanGenerated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsProductEanGenerated();
    
    /**
     * True if has "IsProductEanGenerated" element
     */
    boolean isSetIsProductEanGenerated();
    
    /**
     * Sets the "IsProductEanGenerated" element
     */
    void setIsProductEanGenerated(boolean isProductEanGenerated);
    
    /**
     * Sets (as xml) the "IsProductEanGenerated" element
     */
    void xsetIsProductEanGenerated(org.apache.xmlbeans.XmlBoolean isProductEanGenerated);
    
    /**
     * Unsets the "IsProductEanGenerated" element
     */
    void unsetIsProductEanGenerated();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Tests for nil "Name" element
     */
    boolean isNilName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Nils the "Name" element
     */
    void setNilName();
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "OrderLineChildList" element
     */
    com.cdiscount.www.ArrayOfOrderLine getOrderLineChildList();
    
    /**
     * Tests for nil "OrderLineChildList" element
     */
    boolean isNilOrderLineChildList();
    
    /**
     * True if has "OrderLineChildList" element
     */
    boolean isSetOrderLineChildList();
    
    /**
     * Sets the "OrderLineChildList" element
     */
    void setOrderLineChildList(com.cdiscount.www.ArrayOfOrderLine orderLineChildList);
    
    /**
     * Appends and returns a new empty "OrderLineChildList" element
     */
    com.cdiscount.www.ArrayOfOrderLine addNewOrderLineChildList();
    
    /**
     * Nils the "OrderLineChildList" element
     */
    void setNilOrderLineChildList();
    
    /**
     * Unsets the "OrderLineChildList" element
     */
    void unsetOrderLineChildList();
    
    /**
     * Gets the "ProductCondition" element
     */
    com.cdiscount.www.ProductConditionEnum.Enum getProductCondition();
    
    /**
     * Gets (as xml) the "ProductCondition" element
     */
    com.cdiscount.www.ProductConditionEnum xgetProductCondition();
    
    /**
     * Tests for nil "ProductCondition" element
     */
    boolean isNilProductCondition();
    
    /**
     * True if has "ProductCondition" element
     */
    boolean isSetProductCondition();
    
    /**
     * Sets the "ProductCondition" element
     */
    void setProductCondition(com.cdiscount.www.ProductConditionEnum.Enum productCondition);
    
    /**
     * Sets (as xml) the "ProductCondition" element
     */
    void xsetProductCondition(com.cdiscount.www.ProductConditionEnum productCondition);
    
    /**
     * Nils the "ProductCondition" element
     */
    void setNilProductCondition();
    
    /**
     * Unsets the "ProductCondition" element
     */
    void unsetProductCondition();
    
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
     * Gets the "ProductId" element
     */
    java.lang.String getProductId();
    
    /**
     * Gets (as xml) the "ProductId" element
     */
    org.apache.xmlbeans.XmlString xgetProductId();
    
    /**
     * Tests for nil "ProductId" element
     */
    boolean isNilProductId();
    
    /**
     * True if has "ProductId" element
     */
    boolean isSetProductId();
    
    /**
     * Sets the "ProductId" element
     */
    void setProductId(java.lang.String productId);
    
    /**
     * Sets (as xml) the "ProductId" element
     */
    void xsetProductId(org.apache.xmlbeans.XmlString productId);
    
    /**
     * Nils the "ProductId" element
     */
    void setNilProductId();
    
    /**
     * Unsets the "ProductId" element
     */
    void unsetProductId();
    
    /**
     * Gets the "PurchasePrice" element
     */
    java.math.BigDecimal getPurchasePrice();
    
    /**
     * Gets (as xml) the "PurchasePrice" element
     */
    org.apache.xmlbeans.XmlDecimal xgetPurchasePrice();
    
    /**
     * True if has "PurchasePrice" element
     */
    boolean isSetPurchasePrice();
    
    /**
     * Sets the "PurchasePrice" element
     */
    void setPurchasePrice(java.math.BigDecimal purchasePrice);
    
    /**
     * Sets (as xml) the "PurchasePrice" element
     */
    void xsetPurchasePrice(org.apache.xmlbeans.XmlDecimal purchasePrice);
    
    /**
     * Unsets the "PurchasePrice" element
     */
    void unsetPurchasePrice();
    
    /**
     * Gets the "Quantity" element
     */
    int getQuantity();
    
    /**
     * Gets (as xml) the "Quantity" element
     */
    org.apache.xmlbeans.XmlInt xgetQuantity();
    
    /**
     * True if has "Quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "Quantity" element
     */
    void setQuantity(int quantity);
    
    /**
     * Sets (as xml) the "Quantity" element
     */
    void xsetQuantity(org.apache.xmlbeans.XmlInt quantity);
    
    /**
     * Unsets the "Quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "RefundShippingCharges" element
     */
    boolean getRefundShippingCharges();
    
    /**
     * Gets (as xml) the "RefundShippingCharges" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRefundShippingCharges();
    
    /**
     * Tests for nil "RefundShippingCharges" element
     */
    boolean isNilRefundShippingCharges();
    
    /**
     * True if has "RefundShippingCharges" element
     */
    boolean isSetRefundShippingCharges();
    
    /**
     * Sets the "RefundShippingCharges" element
     */
    void setRefundShippingCharges(boolean refundShippingCharges);
    
    /**
     * Sets (as xml) the "RefundShippingCharges" element
     */
    void xsetRefundShippingCharges(org.apache.xmlbeans.XmlBoolean refundShippingCharges);
    
    /**
     * Nils the "RefundShippingCharges" element
     */
    void setNilRefundShippingCharges();
    
    /**
     * Unsets the "RefundShippingCharges" element
     */
    void unsetRefundShippingCharges();
    
    /**
     * Gets the "RowId" element
     */
    int getRowId();
    
    /**
     * Gets (as xml) the "RowId" element
     */
    org.apache.xmlbeans.XmlInt xgetRowId();
    
    /**
     * True if has "RowId" element
     */
    boolean isSetRowId();
    
    /**
     * Sets the "RowId" element
     */
    void setRowId(int rowId);
    
    /**
     * Sets (as xml) the "RowId" element
     */
    void xsetRowId(org.apache.xmlbeans.XmlInt rowId);
    
    /**
     * Unsets the "RowId" element
     */
    void unsetRowId();
    
    /**
     * Gets the "SellerProductId" element
     */
    java.lang.String getSellerProductId();
    
    /**
     * Gets (as xml) the "SellerProductId" element
     */
    org.apache.xmlbeans.XmlString xgetSellerProductId();
    
    /**
     * Tests for nil "SellerProductId" element
     */
    boolean isNilSellerProductId();
    
    /**
     * True if has "SellerProductId" element
     */
    boolean isSetSellerProductId();
    
    /**
     * Sets the "SellerProductId" element
     */
    void setSellerProductId(java.lang.String sellerProductId);
    
    /**
     * Sets (as xml) the "SellerProductId" element
     */
    void xsetSellerProductId(org.apache.xmlbeans.XmlString sellerProductId);
    
    /**
     * Nils the "SellerProductId" element
     */
    void setNilSellerProductId();
    
    /**
     * Unsets the "SellerProductId" element
     */
    void unsetSellerProductId();
    
    /**
     * Gets the "ShippingDateMax" element
     */
    java.util.Calendar getShippingDateMax();
    
    /**
     * Gets (as xml) the "ShippingDateMax" element
     */
    org.apache.xmlbeans.XmlDateTime xgetShippingDateMax();
    
    /**
     * True if has "ShippingDateMax" element
     */
    boolean isSetShippingDateMax();
    
    /**
     * Sets the "ShippingDateMax" element
     */
    void setShippingDateMax(java.util.Calendar shippingDateMax);
    
    /**
     * Sets (as xml) the "ShippingDateMax" element
     */
    void xsetShippingDateMax(org.apache.xmlbeans.XmlDateTime shippingDateMax);
    
    /**
     * Unsets the "ShippingDateMax" element
     */
    void unsetShippingDateMax();
    
    /**
     * Gets the "ShippingDateMin" element
     */
    java.util.Calendar getShippingDateMin();
    
    /**
     * Gets (as xml) the "ShippingDateMin" element
     */
    org.apache.xmlbeans.XmlDateTime xgetShippingDateMin();
    
    /**
     * True if has "ShippingDateMin" element
     */
    boolean isSetShippingDateMin();
    
    /**
     * Sets the "ShippingDateMin" element
     */
    void setShippingDateMin(java.util.Calendar shippingDateMin);
    
    /**
     * Sets (as xml) the "ShippingDateMin" element
     */
    void xsetShippingDateMin(org.apache.xmlbeans.XmlDateTime shippingDateMin);
    
    /**
     * Unsets the "ShippingDateMin" element
     */
    void unsetShippingDateMin();
    
    /**
     * Gets the "Sku" element
     */
    java.lang.String getSku();
    
    /**
     * Gets (as xml) the "Sku" element
     */
    org.apache.xmlbeans.XmlString xgetSku();
    
    /**
     * Tests for nil "Sku" element
     */
    boolean isNilSku();
    
    /**
     * True if has "Sku" element
     */
    boolean isSetSku();
    
    /**
     * Sets the "Sku" element
     */
    void setSku(java.lang.String sku);
    
    /**
     * Sets (as xml) the "Sku" element
     */
    void xsetSku(org.apache.xmlbeans.XmlString sku);
    
    /**
     * Nils the "Sku" element
     */
    void setNilSku();
    
    /**
     * Unsets the "Sku" element
     */
    void unsetSku();
    
    /**
     * Gets the "SkuParent" element
     */
    java.lang.String getSkuParent();
    
    /**
     * Gets (as xml) the "SkuParent" element
     */
    org.apache.xmlbeans.XmlString xgetSkuParent();
    
    /**
     * Tests for nil "SkuParent" element
     */
    boolean isNilSkuParent();
    
    /**
     * True if has "SkuParent" element
     */
    boolean isSetSkuParent();
    
    /**
     * Sets the "SkuParent" element
     */
    void setSkuParent(java.lang.String skuParent);
    
    /**
     * Sets (as xml) the "SkuParent" element
     */
    void xsetSkuParent(org.apache.xmlbeans.XmlString skuParent);
    
    /**
     * Nils the "SkuParent" element
     */
    void setNilSkuParent();
    
    /**
     * Unsets the "SkuParent" element
     */
    void unsetSkuParent();
    
    /**
     * Gets the "UnitAdditionalShippingCharges" element
     */
    java.math.BigDecimal getUnitAdditionalShippingCharges();
    
    /**
     * Gets (as xml) the "UnitAdditionalShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetUnitAdditionalShippingCharges();
    
    /**
     * True if has "UnitAdditionalShippingCharges" element
     */
    boolean isSetUnitAdditionalShippingCharges();
    
    /**
     * Sets the "UnitAdditionalShippingCharges" element
     */
    void setUnitAdditionalShippingCharges(java.math.BigDecimal unitAdditionalShippingCharges);
    
    /**
     * Sets (as xml) the "UnitAdditionalShippingCharges" element
     */
    void xsetUnitAdditionalShippingCharges(org.apache.xmlbeans.XmlDecimal unitAdditionalShippingCharges);
    
    /**
     * Unsets the "UnitAdditionalShippingCharges" element
     */
    void unsetUnitAdditionalShippingCharges();
    
    /**
     * Gets the "UnitShippingCharges" element
     */
    java.math.BigDecimal getUnitShippingCharges();
    
    /**
     * Gets (as xml) the "UnitShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetUnitShippingCharges();
    
    /**
     * True if has "UnitShippingCharges" element
     */
    boolean isSetUnitShippingCharges();
    
    /**
     * Sets the "UnitShippingCharges" element
     */
    void setUnitShippingCharges(java.math.BigDecimal unitShippingCharges);
    
    /**
     * Sets (as xml) the "UnitShippingCharges" element
     */
    void xsetUnitShippingCharges(org.apache.xmlbeans.XmlDecimal unitShippingCharges);
    
    /**
     * Unsets the "UnitShippingCharges" element
     */
    void unsetUnitShippingCharges();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.OrderLine newInstance() {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OrderLine newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OrderLine parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OrderLine parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OrderLine parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OrderLine parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OrderLine parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OrderLine parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OrderLine parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OrderLine parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OrderLine parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OrderLine parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OrderLine parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OrderLine parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OrderLine parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OrderLine parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OrderLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OrderLine parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OrderLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
