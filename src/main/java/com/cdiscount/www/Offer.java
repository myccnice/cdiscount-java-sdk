/*
 * XML Type:  Offer
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Offer
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML Offer(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface Offer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Offer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("offerc97btype");
    
    /**
     * Gets the "BestShippingCharges" element
     */
    java.math.BigDecimal getBestShippingCharges();
    
    /**
     * Gets (as xml) the "BestShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetBestShippingCharges();
    
    /**
     * True if has "BestShippingCharges" element
     */
    boolean isSetBestShippingCharges();
    
    /**
     * Sets the "BestShippingCharges" element
     */
    void setBestShippingCharges(java.math.BigDecimal bestShippingCharges);
    
    /**
     * Sets (as xml) the "BestShippingCharges" element
     */
    void xsetBestShippingCharges(org.apache.xmlbeans.XmlDecimal bestShippingCharges);
    
    /**
     * Unsets the "BestShippingCharges" element
     */
    void unsetBestShippingCharges();
    
    /**
     * Gets the "Comments" element
     */
    java.lang.String getComments();
    
    /**
     * Gets (as xml) the "Comments" element
     */
    org.apache.xmlbeans.XmlString xgetComments();
    
    /**
     * Tests for nil "Comments" element
     */
    boolean isNilComments();
    
    /**
     * True if has "Comments" element
     */
    boolean isSetComments();
    
    /**
     * Sets the "Comments" element
     */
    void setComments(java.lang.String comments);
    
    /**
     * Sets (as xml) the "Comments" element
     */
    void xsetComments(org.apache.xmlbeans.XmlString comments);
    
    /**
     * Nils the "Comments" element
     */
    void setNilComments();
    
    /**
     * Unsets the "Comments" element
     */
    void unsetComments();
    
    /**
     * Gets the "CreationDate" element
     */
    java.util.Calendar getCreationDate();
    
    /**
     * Gets (as xml) the "CreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreationDate();
    
    /**
     * True if has "CreationDate" element
     */
    boolean isSetCreationDate();
    
    /**
     * Sets the "CreationDate" element
     */
    void setCreationDate(java.util.Calendar creationDate);
    
    /**
     * Sets (as xml) the "CreationDate" element
     */
    void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate);
    
    /**
     * Unsets the "CreationDate" element
     */
    void unsetCreationDate();
    
    /**
     * Gets the "DeaTax" element
     */
    java.math.BigDecimal getDeaTax();
    
    /**
     * Gets (as xml) the "DeaTax" element
     */
    org.apache.xmlbeans.XmlDecimal xgetDeaTax();
    
    /**
     * True if has "DeaTax" element
     */
    boolean isSetDeaTax();
    
    /**
     * Sets the "DeaTax" element
     */
    void setDeaTax(java.math.BigDecimal deaTax);
    
    /**
     * Sets (as xml) the "DeaTax" element
     */
    void xsetDeaTax(org.apache.xmlbeans.XmlDecimal deaTax);
    
    /**
     * Unsets the "DeaTax" element
     */
    void unsetDeaTax();
    
    /**
     * Gets the "DiscountList" element
     */
    com.cdiscount.www.ArrayOfDiscountComponent getDiscountList();
    
    /**
     * Tests for nil "DiscountList" element
     */
    boolean isNilDiscountList();
    
    /**
     * True if has "DiscountList" element
     */
    boolean isSetDiscountList();
    
    /**
     * Sets the "DiscountList" element
     */
    void setDiscountList(com.cdiscount.www.ArrayOfDiscountComponent discountList);
    
    /**
     * Appends and returns a new empty "DiscountList" element
     */
    com.cdiscount.www.ArrayOfDiscountComponent addNewDiscountList();
    
    /**
     * Nils the "DiscountList" element
     */
    void setNilDiscountList();
    
    /**
     * Unsets the "DiscountList" element
     */
    void unsetDiscountList();
    
    /**
     * Gets the "EcoTax" element
     */
    java.math.BigDecimal getEcoTax();
    
    /**
     * Gets (as xml) the "EcoTax" element
     */
    org.apache.xmlbeans.XmlDecimal xgetEcoTax();
    
    /**
     * True if has "EcoTax" element
     */
    boolean isSetEcoTax();
    
    /**
     * Sets the "EcoTax" element
     */
    void setEcoTax(java.math.BigDecimal ecoTax);
    
    /**
     * Sets (as xml) the "EcoTax" element
     */
    void xsetEcoTax(org.apache.xmlbeans.XmlDecimal ecoTax);
    
    /**
     * Unsets the "EcoTax" element
     */
    void unsetEcoTax();
    
    /**
     * Gets the "IntegrationPrice" element
     */
    java.math.BigDecimal getIntegrationPrice();
    
    /**
     * Gets (as xml) the "IntegrationPrice" element
     */
    org.apache.xmlbeans.XmlDecimal xgetIntegrationPrice();
    
    /**
     * True if has "IntegrationPrice" element
     */
    boolean isSetIntegrationPrice();
    
    /**
     * Sets the "IntegrationPrice" element
     */
    void setIntegrationPrice(java.math.BigDecimal integrationPrice);
    
    /**
     * Sets (as xml) the "IntegrationPrice" element
     */
    void xsetIntegrationPrice(org.apache.xmlbeans.XmlDecimal integrationPrice);
    
    /**
     * Unsets the "IntegrationPrice" element
     */
    void unsetIntegrationPrice();
    
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
     * Gets the "LastUpdateDate" element
     */
    java.util.Calendar getLastUpdateDate();
    
    /**
     * Gets (as xml) the "LastUpdateDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLastUpdateDate();
    
    /**
     * True if has "LastUpdateDate" element
     */
    boolean isSetLastUpdateDate();
    
    /**
     * Sets the "LastUpdateDate" element
     */
    void setLastUpdateDate(java.util.Calendar lastUpdateDate);
    
    /**
     * Sets (as xml) the "LastUpdateDate" element
     */
    void xsetLastUpdateDate(org.apache.xmlbeans.XmlDateTime lastUpdateDate);
    
    /**
     * Unsets the "LastUpdateDate" element
     */
    void unsetLastUpdateDate();
    
    /**
     * Gets the "MinimumPriceForPriceAlignment" element
     */
    java.math.BigDecimal getMinimumPriceForPriceAlignment();
    
    /**
     * Gets (as xml) the "MinimumPriceForPriceAlignment" element
     */
    org.apache.xmlbeans.XmlDecimal xgetMinimumPriceForPriceAlignment();
    
    /**
     * Tests for nil "MinimumPriceForPriceAlignment" element
     */
    boolean isNilMinimumPriceForPriceAlignment();
    
    /**
     * True if has "MinimumPriceForPriceAlignment" element
     */
    boolean isSetMinimumPriceForPriceAlignment();
    
    /**
     * Sets the "MinimumPriceForPriceAlignment" element
     */
    void setMinimumPriceForPriceAlignment(java.math.BigDecimal minimumPriceForPriceAlignment);
    
    /**
     * Sets (as xml) the "MinimumPriceForPriceAlignment" element
     */
    void xsetMinimumPriceForPriceAlignment(org.apache.xmlbeans.XmlDecimal minimumPriceForPriceAlignment);
    
    /**
     * Nils the "MinimumPriceForPriceAlignment" element
     */
    void setNilMinimumPriceForPriceAlignment();
    
    /**
     * Unsets the "MinimumPriceForPriceAlignment" element
     */
    void unsetMinimumPriceForPriceAlignment();
    
    /**
     * Gets the "OfferBenchMark" element
     */
    com.cdiscount.www.OfferPriceBenchMark getOfferBenchMark();
    
    /**
     * Tests for nil "OfferBenchMark" element
     */
    boolean isNilOfferBenchMark();
    
    /**
     * True if has "OfferBenchMark" element
     */
    boolean isSetOfferBenchMark();
    
    /**
     * Sets the "OfferBenchMark" element
     */
    void setOfferBenchMark(com.cdiscount.www.OfferPriceBenchMark offerBenchMark);
    
    /**
     * Appends and returns a new empty "OfferBenchMark" element
     */
    com.cdiscount.www.OfferPriceBenchMark addNewOfferBenchMark();
    
    /**
     * Nils the "OfferBenchMark" element
     */
    void setNilOfferBenchMark();
    
    /**
     * Unsets the "OfferBenchMark" element
     */
    void unsetOfferBenchMark();
    
    /**
     * Gets the "OfferPoolList" element
     */
    com.cdiscount.www.ArrayOfOfferPool getOfferPoolList();
    
    /**
     * Tests for nil "OfferPoolList" element
     */
    boolean isNilOfferPoolList();
    
    /**
     * True if has "OfferPoolList" element
     */
    boolean isSetOfferPoolList();
    
    /**
     * Sets the "OfferPoolList" element
     */
    void setOfferPoolList(com.cdiscount.www.ArrayOfOfferPool offerPoolList);
    
    /**
     * Appends and returns a new empty "OfferPoolList" element
     */
    com.cdiscount.www.ArrayOfOfferPool addNewOfferPoolList();
    
    /**
     * Nils the "OfferPoolList" element
     */
    void setNilOfferPoolList();
    
    /**
     * Unsets the "OfferPoolList" element
     */
    void unsetOfferPoolList();
    
    /**
     * Gets the "OfferState" element
     */
    com.cdiscount.www.OfferStateEnum.Enum getOfferState();
    
    /**
     * Gets (as xml) the "OfferState" element
     */
    com.cdiscount.www.OfferStateEnum xgetOfferState();
    
    /**
     * True if has "OfferState" element
     */
    boolean isSetOfferState();
    
    /**
     * Sets the "OfferState" element
     */
    void setOfferState(com.cdiscount.www.OfferStateEnum.Enum offerState);
    
    /**
     * Sets (as xml) the "OfferState" element
     */
    void xsetOfferState(com.cdiscount.www.OfferStateEnum offerState);
    
    /**
     * Unsets the "OfferState" element
     */
    void unsetOfferState();
    
    /**
     * Gets the "ParentProductId" element
     */
    java.lang.String getParentProductId();
    
    /**
     * Gets (as xml) the "ParentProductId" element
     */
    org.apache.xmlbeans.XmlString xgetParentProductId();
    
    /**
     * Tests for nil "ParentProductId" element
     */
    boolean isNilParentProductId();
    
    /**
     * True if has "ParentProductId" element
     */
    boolean isSetParentProductId();
    
    /**
     * Sets the "ParentProductId" element
     */
    void setParentProductId(java.lang.String parentProductId);
    
    /**
     * Sets (as xml) the "ParentProductId" element
     */
    void xsetParentProductId(org.apache.xmlbeans.XmlString parentProductId);
    
    /**
     * Nils the "ParentProductId" element
     */
    void setNilParentProductId();
    
    /**
     * Unsets the "ParentProductId" element
     */
    void unsetParentProductId();
    
    /**
     * Gets the "Price" element
     */
    java.math.BigDecimal getPrice();
    
    /**
     * Gets (as xml) the "Price" element
     */
    org.apache.xmlbeans.XmlDecimal xgetPrice();
    
    /**
     * True if has "Price" element
     */
    boolean isSetPrice();
    
    /**
     * Sets the "Price" element
     */
    void setPrice(java.math.BigDecimal price);
    
    /**
     * Sets (as xml) the "Price" element
     */
    void xsetPrice(org.apache.xmlbeans.XmlDecimal price);
    
    /**
     * Unsets the "Price" element
     */
    void unsetPrice();
    
    /**
     * Gets the "PriceMustBeAligned" element
     */
    com.cdiscount.www.PriceAlignmentAction.Enum getPriceMustBeAligned();
    
    /**
     * Gets (as xml) the "PriceMustBeAligned" element
     */
    com.cdiscount.www.PriceAlignmentAction xgetPriceMustBeAligned();
    
    /**
     * True if has "PriceMustBeAligned" element
     */
    boolean isSetPriceMustBeAligned();
    
    /**
     * Sets the "PriceMustBeAligned" element
     */
    void setPriceMustBeAligned(com.cdiscount.www.PriceAlignmentAction.Enum priceMustBeAligned);
    
    /**
     * Sets (as xml) the "PriceMustBeAligned" element
     */
    void xsetPriceMustBeAligned(com.cdiscount.www.PriceAlignmentAction priceMustBeAligned);
    
    /**
     * Unsets the "PriceMustBeAligned" element
     */
    void unsetPriceMustBeAligned();
    
    /**
     * Gets the "ProductCondition" element
     */
    com.cdiscount.www.ProductConditionEnum.Enum getProductCondition();
    
    /**
     * Gets (as xml) the "ProductCondition" element
     */
    com.cdiscount.www.ProductConditionEnum xgetProductCondition();
    
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
     * Gets the "ProductPackagingUnit" element
     */
    com.cdiscount.www.ProductPackagingUnit.Enum getProductPackagingUnit();
    
    /**
     * Gets (as xml) the "ProductPackagingUnit" element
     */
    com.cdiscount.www.ProductPackagingUnit xgetProductPackagingUnit();
    
    /**
     * True if has "ProductPackagingUnit" element
     */
    boolean isSetProductPackagingUnit();
    
    /**
     * Sets the "ProductPackagingUnit" element
     */
    void setProductPackagingUnit(com.cdiscount.www.ProductPackagingUnit.Enum productPackagingUnit);
    
    /**
     * Sets (as xml) the "ProductPackagingUnit" element
     */
    void xsetProductPackagingUnit(com.cdiscount.www.ProductPackagingUnit productPackagingUnit);
    
    /**
     * Unsets the "ProductPackagingUnit" element
     */
    void unsetProductPackagingUnit();
    
    /**
     * Gets the "ProductPackagingUnitPrice" element
     */
    java.math.BigDecimal getProductPackagingUnitPrice();
    
    /**
     * Gets (as xml) the "ProductPackagingUnitPrice" element
     */
    org.apache.xmlbeans.XmlDecimal xgetProductPackagingUnitPrice();
    
    /**
     * True if has "ProductPackagingUnitPrice" element
     */
    boolean isSetProductPackagingUnitPrice();
    
    /**
     * Sets the "ProductPackagingUnitPrice" element
     */
    void setProductPackagingUnitPrice(java.math.BigDecimal productPackagingUnitPrice);
    
    /**
     * Sets (as xml) the "ProductPackagingUnitPrice" element
     */
    void xsetProductPackagingUnitPrice(org.apache.xmlbeans.XmlDecimal productPackagingUnitPrice);
    
    /**
     * Unsets the "ProductPackagingUnitPrice" element
     */
    void unsetProductPackagingUnitPrice();
    
    /**
     * Gets the "ProductPackagingValue" element
     */
    java.math.BigDecimal getProductPackagingValue();
    
    /**
     * Gets (as xml) the "ProductPackagingValue" element
     */
    org.apache.xmlbeans.XmlDecimal xgetProductPackagingValue();
    
    /**
     * True if has "ProductPackagingValue" element
     */
    boolean isSetProductPackagingValue();
    
    /**
     * Sets the "ProductPackagingValue" element
     */
    void setProductPackagingValue(java.math.BigDecimal productPackagingValue);
    
    /**
     * Sets (as xml) the "ProductPackagingValue" element
     */
    void xsetProductPackagingValue(org.apache.xmlbeans.XmlDecimal productPackagingValue);
    
    /**
     * Unsets the "ProductPackagingValue" element
     */
    void unsetProductPackagingValue();
    
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
     * Gets the "ShippingInformationList" element
     */
    com.cdiscount.www.ArrayOfShippingInformation getShippingInformationList();
    
    /**
     * Tests for nil "ShippingInformationList" element
     */
    boolean isNilShippingInformationList();
    
    /**
     * True if has "ShippingInformationList" element
     */
    boolean isSetShippingInformationList();
    
    /**
     * Sets the "ShippingInformationList" element
     */
    void setShippingInformationList(com.cdiscount.www.ArrayOfShippingInformation shippingInformationList);
    
    /**
     * Appends and returns a new empty "ShippingInformationList" element
     */
    com.cdiscount.www.ArrayOfShippingInformation addNewShippingInformationList();
    
    /**
     * Nils the "ShippingInformationList" element
     */
    void setNilShippingInformationList();
    
    /**
     * Unsets the "ShippingInformationList" element
     */
    void unsetShippingInformationList();
    
    /**
     * Gets the "Stock" element
     */
    int getStock();
    
    /**
     * Gets (as xml) the "Stock" element
     */
    org.apache.xmlbeans.XmlInt xgetStock();
    
    /**
     * True if has "Stock" element
     */
    boolean isSetStock();
    
    /**
     * Sets the "Stock" element
     */
    void setStock(int stock);
    
    /**
     * Sets (as xml) the "Stock" element
     */
    void xsetStock(org.apache.xmlbeans.XmlInt stock);
    
    /**
     * Unsets the "Stock" element
     */
    void unsetStock();
    
    /**
     * Gets the "StrikedPrice" element
     */
    java.math.BigDecimal getStrikedPrice();
    
    /**
     * Gets (as xml) the "StrikedPrice" element
     */
    org.apache.xmlbeans.XmlDecimal xgetStrikedPrice();
    
    /**
     * Tests for nil "StrikedPrice" element
     */
    boolean isNilStrikedPrice();
    
    /**
     * True if has "StrikedPrice" element
     */
    boolean isSetStrikedPrice();
    
    /**
     * Sets the "StrikedPrice" element
     */
    void setStrikedPrice(java.math.BigDecimal strikedPrice);
    
    /**
     * Sets (as xml) the "StrikedPrice" element
     */
    void xsetStrikedPrice(org.apache.xmlbeans.XmlDecimal strikedPrice);
    
    /**
     * Nils the "StrikedPrice" element
     */
    void setNilStrikedPrice();
    
    /**
     * Unsets the "StrikedPrice" element
     */
    void unsetStrikedPrice();
    
    /**
     * Gets the "VatRate" element
     */
    java.math.BigDecimal getVatRate();
    
    /**
     * Gets (as xml) the "VatRate" element
     */
    org.apache.xmlbeans.XmlDecimal xgetVatRate();
    
    /**
     * True if has "VatRate" element
     */
    boolean isSetVatRate();
    
    /**
     * Sets the "VatRate" element
     */
    void setVatRate(java.math.BigDecimal vatRate);
    
    /**
     * Sets (as xml) the "VatRate" element
     */
    void xsetVatRate(org.apache.xmlbeans.XmlDecimal vatRate);
    
    /**
     * Unsets the "VatRate" element
     */
    void unsetVatRate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.Offer newInstance() {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.Offer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.Offer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.Offer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.Offer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.Offer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.Offer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.Offer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.Offer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.Offer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.Offer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.Offer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.Offer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.Offer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.Offer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.Offer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Offer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Offer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
