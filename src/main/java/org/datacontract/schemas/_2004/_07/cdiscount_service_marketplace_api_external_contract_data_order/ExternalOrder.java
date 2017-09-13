/*
 * XML Type:  ExternalOrder
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order;


/**
 * An XML ExternalOrder(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order).
 *
 * This is a complex type.
 */
public interface ExternalOrder extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("externalorderb2cdtype");
    
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
     * Gets the "Corporation" element
     */
    java.lang.String getCorporation();
    
    /**
     * Gets (as xml) the "Corporation" element
     */
    org.apache.xmlbeans.XmlString xgetCorporation();
    
    /**
     * Tests for nil "Corporation" element
     */
    boolean isNilCorporation();
    
    /**
     * Sets the "Corporation" element
     */
    void setCorporation(java.lang.String corporation);
    
    /**
     * Sets (as xml) the "Corporation" element
     */
    void xsetCorporation(org.apache.xmlbeans.XmlString corporation);
    
    /**
     * Nils the "Corporation" element
     */
    void setNilCorporation();
    
    /**
     * Gets the "Customer" element
     */
    org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer getCustomer();
    
    /**
     * Tests for nil "Customer" element
     */
    boolean isNilCustomer();
    
    /**
     * Sets the "Customer" element
     */
    void setCustomer(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer customer);
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer addNewCustomer();
    
    /**
     * Nils the "Customer" element
     */
    void setNilCustomer();
    
    /**
     * Gets the "CustomerOrderNumber" element
     */
    java.lang.String getCustomerOrderNumber();
    
    /**
     * Gets (as xml) the "CustomerOrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetCustomerOrderNumber();
    
    /**
     * Tests for nil "CustomerOrderNumber" element
     */
    boolean isNilCustomerOrderNumber();
    
    /**
     * Sets the "CustomerOrderNumber" element
     */
    void setCustomerOrderNumber(java.lang.String customerOrderNumber);
    
    /**
     * Sets (as xml) the "CustomerOrderNumber" element
     */
    void xsetCustomerOrderNumber(org.apache.xmlbeans.XmlString customerOrderNumber);
    
    /**
     * Nils the "CustomerOrderNumber" element
     */
    void setNilCustomerOrderNumber();
    
    /**
     * Gets the "OrderDate" element
     */
    java.util.Calendar getOrderDate();
    
    /**
     * Gets (as xml) the "OrderDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetOrderDate();
    
    /**
     * Tests for nil "OrderDate" element
     */
    boolean isNilOrderDate();
    
    /**
     * True if has "OrderDate" element
     */
    boolean isSetOrderDate();
    
    /**
     * Sets the "OrderDate" element
     */
    void setOrderDate(java.util.Calendar orderDate);
    
    /**
     * Sets (as xml) the "OrderDate" element
     */
    void xsetOrderDate(org.apache.xmlbeans.XmlDateTime orderDate);
    
    /**
     * Nils the "OrderDate" element
     */
    void setNilOrderDate();
    
    /**
     * Unsets the "OrderDate" element
     */
    void unsetOrderDate();
    
    /**
     * Gets the "OrderLineList" element
     */
    org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine getOrderLineList();
    
    /**
     * Tests for nil "OrderLineList" element
     */
    boolean isNilOrderLineList();
    
    /**
     * Sets the "OrderLineList" element
     */
    void setOrderLineList(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine orderLineList);
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine addNewOrderLineList();
    
    /**
     * Nils the "OrderLineList" element
     */
    void setNilOrderLineList();
    
    /**
     * Gets the "ShippingMode" element
     */
    java.lang.String getShippingMode();
    
    /**
     * Gets (as xml) the "ShippingMode" element
     */
    org.apache.xmlbeans.XmlString xgetShippingMode();
    
    /**
     * Tests for nil "ShippingMode" element
     */
    boolean isNilShippingMode();
    
    /**
     * Sets the "ShippingMode" element
     */
    void setShippingMode(java.lang.String shippingMode);
    
    /**
     * Sets (as xml) the "ShippingMode" element
     */
    void xsetShippingMode(org.apache.xmlbeans.XmlString shippingMode);
    
    /**
     * Nils the "ShippingMode" element
     */
    void setNilShippingMode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
