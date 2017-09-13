/*
 * XML Type:  ProductActivationData
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment;


/**
 * An XML ProductActivationData(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment).
 *
 * This is a complex type.
 */
public interface ProductActivationData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductActivationData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("productactivationdatade17type");
    
    /**
     * Gets the "Action" element
     */
    com.cdiscount.www.FulfilmentProductActionType.Enum getAction();
    
    /**
     * Gets (as xml) the "Action" element
     */
    com.cdiscount.www.FulfilmentProductActionType xgetAction();
    
    /**
     * Sets the "Action" element
     */
    void setAction(com.cdiscount.www.FulfilmentProductActionType.Enum action);
    
    /**
     * Sets (as xml) the "Action" element
     */
    void xsetAction(com.cdiscount.www.FulfilmentProductActionType action);
    
    /**
     * Gets the "Height" element
     */
    double getHeight();
    
    /**
     * Gets (as xml) the "Height" element
     */
    org.apache.xmlbeans.XmlDouble xgetHeight();
    
    /**
     * Sets the "Height" element
     */
    void setHeight(double height);
    
    /**
     * Sets (as xml) the "Height" element
     */
    void xsetHeight(org.apache.xmlbeans.XmlDouble height);
    
    /**
     * Gets the "Length" element
     */
    double getLength();
    
    /**
     * Gets (as xml) the "Length" element
     */
    org.apache.xmlbeans.XmlDouble xgetLength();
    
    /**
     * Sets the "Length" element
     */
    void setLength(double length);
    
    /**
     * Sets (as xml) the "Length" element
     */
    void xsetLength(org.apache.xmlbeans.XmlDouble length);
    
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
     * Gets the "Weight" element
     */
    double getWeight();
    
    /**
     * Gets (as xml) the "Weight" element
     */
    org.apache.xmlbeans.XmlDouble xgetWeight();
    
    /**
     * Sets the "Weight" element
     */
    void setWeight(double weight);
    
    /**
     * Sets (as xml) the "Weight" element
     */
    void xsetWeight(org.apache.xmlbeans.XmlDouble weight);
    
    /**
     * Gets the "Width" element
     */
    double getWidth();
    
    /**
     * Gets (as xml) the "Width" element
     */
    org.apache.xmlbeans.XmlDouble xgetWidth();
    
    /**
     * Sets the "Width" element
     */
    void setWidth(double width);
    
    /**
     * Sets (as xml) the "Width" element
     */
    void xsetWidth(org.apache.xmlbeans.XmlDouble width);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
