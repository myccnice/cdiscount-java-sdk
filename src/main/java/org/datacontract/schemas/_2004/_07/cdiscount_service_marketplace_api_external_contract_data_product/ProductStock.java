/*
 * XML Type:  ProductStock
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product;


/**
 * An XML ProductStock(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product).
 *
 * This is a complex type.
 */
public interface ProductStock extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductStock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("productstock0758type");
    
    /**
     * Gets the "BlockedStock" element
     */
    int getBlockedStock();
    
    /**
     * Gets (as xml) the "BlockedStock" element
     */
    org.apache.xmlbeans.XmlInt xgetBlockedStock();
    
    /**
     * Sets the "BlockedStock" element
     */
    void setBlockedStock(int blockedStock);
    
    /**
     * Sets (as xml) the "BlockedStock" element
     */
    void xsetBlockedStock(org.apache.xmlbeans.XmlInt blockedStock);
    
    /**
     * Gets the "Ean" element
     */
    java.lang.String getEan();
    
    /**
     * Gets (as xml) the "Ean" element
     */
    org.apache.xmlbeans.XmlString xgetEan();
    
    /**
     * Tests for nil "Ean" element
     */
    boolean isNilEan();
    
    /**
     * Sets the "Ean" element
     */
    void setEan(java.lang.String ean);
    
    /**
     * Sets (as xml) the "Ean" element
     */
    void xsetEan(org.apache.xmlbeans.XmlString ean);
    
    /**
     * Nils the "Ean" element
     */
    void setNilEan();
    
    /**
     * Gets the "FodStock" element
     */
    int getFodStock();
    
    /**
     * Gets (as xml) the "FodStock" element
     */
    org.apache.xmlbeans.XmlInt xgetFodStock();
    
    /**
     * Tests for nil "FodStock" element
     */
    boolean isNilFodStock();
    
    /**
     * Sets the "FodStock" element
     */
    void setFodStock(int fodStock);
    
    /**
     * Sets (as xml) the "FodStock" element
     */
    void xsetFodStock(org.apache.xmlbeans.XmlInt fodStock);
    
    /**
     * Nils the "FodStock" element
     */
    void setNilFodStock();
    
    /**
     * Gets the "FrontStock" element
     */
    int getFrontStock();
    
    /**
     * Gets (as xml) the "FrontStock" element
     */
    org.apache.xmlbeans.XmlInt xgetFrontStock();
    
    /**
     * Sets the "FrontStock" element
     */
    void setFrontStock(int frontStock);
    
    /**
     * Sets (as xml) the "FrontStock" element
     */
    void xsetFrontStock(org.apache.xmlbeans.XmlInt frontStock);
    
    /**
     * Gets the "IsReferenced" element
     */
    boolean getIsReferenced();
    
    /**
     * Gets (as xml) the "IsReferenced" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsReferenced();
    
    /**
     * Sets the "IsReferenced" element
     */
    void setIsReferenced(boolean isReferenced);
    
    /**
     * Sets (as xml) the "IsReferenced" element
     */
    void xsetIsReferenced(org.apache.xmlbeans.XmlBoolean isReferenced);
    
    /**
     * Gets the "Libelle" element
     */
    java.lang.String getLibelle();
    
    /**
     * Gets (as xml) the "Libelle" element
     */
    org.apache.xmlbeans.XmlString xgetLibelle();
    
    /**
     * Tests for nil "Libelle" element
     */
    boolean isNilLibelle();
    
    /**
     * Sets the "Libelle" element
     */
    void setLibelle(java.lang.String libelle);
    
    /**
     * Sets (as xml) the "Libelle" element
     */
    void xsetLibelle(org.apache.xmlbeans.XmlString libelle);
    
    /**
     * Nils the "Libelle" element
     */
    void setNilLibelle();
    
    /**
     * Gets the "SellerReference" element
     */
    java.lang.String getSellerReference();
    
    /**
     * Gets (as xml) the "SellerReference" element
     */
    org.apache.xmlbeans.XmlString xgetSellerReference();
    
    /**
     * Tests for nil "SellerReference" element
     */
    boolean isNilSellerReference();
    
    /**
     * Sets the "SellerReference" element
     */
    void setSellerReference(java.lang.String sellerReference);
    
    /**
     * Sets (as xml) the "SellerReference" element
     */
    void xsetSellerReference(org.apache.xmlbeans.XmlString sellerReference);
    
    /**
     * Nils the "SellerReference" element
     */
    void setNilSellerReference();
    
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
     * Gets the "StockInWarehouse" element
     */
    int getStockInWarehouse();
    
    /**
     * Gets (as xml) the "StockInWarehouse" element
     */
    org.apache.xmlbeans.XmlInt xgetStockInWarehouse();
    
    /**
     * Sets the "StockInWarehouse" element
     */
    void setStockInWarehouse(int stockInWarehouse);
    
    /**
     * Sets (as xml) the "StockInWarehouse" element
     */
    void xsetStockInWarehouse(org.apache.xmlbeans.XmlInt stockInWarehouse);
    
    /**
     * Gets the "Warehouse" element
     */
    java.lang.String getWarehouse();
    
    /**
     * Gets (as xml) the "Warehouse" element
     */
    org.apache.xmlbeans.XmlString xgetWarehouse();
    
    /**
     * Tests for nil "Warehouse" element
     */
    boolean isNilWarehouse();
    
    /**
     * Sets the "Warehouse" element
     */
    void setWarehouse(java.lang.String warehouse);
    
    /**
     * Sets (as xml) the "Warehouse" element
     */
    void xsetWarehouse(org.apache.xmlbeans.XmlString warehouse);
    
    /**
     * Nils the "Warehouse" element
     */
    void setNilWarehouse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
