/*
 * XML Type:  OrderFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OrderFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface OrderFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("orderfilterdbf1type");
    
    /**
     * Gets the "BeginCreationDate" element
     */
    java.util.Calendar getBeginCreationDate();
    
    /**
     * Gets (as xml) the "BeginCreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeginCreationDate();
    
    /**
     * Tests for nil "BeginCreationDate" element
     */
    boolean isNilBeginCreationDate();
    
    /**
     * True if has "BeginCreationDate" element
     */
    boolean isSetBeginCreationDate();
    
    /**
     * Sets the "BeginCreationDate" element
     */
    void setBeginCreationDate(java.util.Calendar beginCreationDate);
    
    /**
     * Sets (as xml) the "BeginCreationDate" element
     */
    void xsetBeginCreationDate(org.apache.xmlbeans.XmlDateTime beginCreationDate);
    
    /**
     * Nils the "BeginCreationDate" element
     */
    void setNilBeginCreationDate();
    
    /**
     * Unsets the "BeginCreationDate" element
     */
    void unsetBeginCreationDate();
    
    /**
     * Gets the "BeginModificationDate" element
     */
    java.util.Calendar getBeginModificationDate();
    
    /**
     * Gets (as xml) the "BeginModificationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeginModificationDate();
    
    /**
     * Tests for nil "BeginModificationDate" element
     */
    boolean isNilBeginModificationDate();
    
    /**
     * True if has "BeginModificationDate" element
     */
    boolean isSetBeginModificationDate();
    
    /**
     * Sets the "BeginModificationDate" element
     */
    void setBeginModificationDate(java.util.Calendar beginModificationDate);
    
    /**
     * Sets (as xml) the "BeginModificationDate" element
     */
    void xsetBeginModificationDate(org.apache.xmlbeans.XmlDateTime beginModificationDate);
    
    /**
     * Nils the "BeginModificationDate" element
     */
    void setNilBeginModificationDate();
    
    /**
     * Unsets the "BeginModificationDate" element
     */
    void unsetBeginModificationDate();
    
    /**
     * Gets the "CorporationCode" element
     */
    java.lang.String getCorporationCode();
    
    /**
     * Gets (as xml) the "CorporationCode" element
     */
    org.apache.xmlbeans.XmlString xgetCorporationCode();
    
    /**
     * Tests for nil "CorporationCode" element
     */
    boolean isNilCorporationCode();
    
    /**
     * True if has "CorporationCode" element
     */
    boolean isSetCorporationCode();
    
    /**
     * Sets the "CorporationCode" element
     */
    void setCorporationCode(java.lang.String corporationCode);
    
    /**
     * Sets (as xml) the "CorporationCode" element
     */
    void xsetCorporationCode(org.apache.xmlbeans.XmlString corporationCode);
    
    /**
     * Nils the "CorporationCode" element
     */
    void setNilCorporationCode();
    
    /**
     * Unsets the "CorporationCode" element
     */
    void unsetCorporationCode();
    
    /**
     * Gets the "EndCreationDate" element
     */
    java.util.Calendar getEndCreationDate();
    
    /**
     * Gets (as xml) the "EndCreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndCreationDate();
    
    /**
     * Tests for nil "EndCreationDate" element
     */
    boolean isNilEndCreationDate();
    
    /**
     * True if has "EndCreationDate" element
     */
    boolean isSetEndCreationDate();
    
    /**
     * Sets the "EndCreationDate" element
     */
    void setEndCreationDate(java.util.Calendar endCreationDate);
    
    /**
     * Sets (as xml) the "EndCreationDate" element
     */
    void xsetEndCreationDate(org.apache.xmlbeans.XmlDateTime endCreationDate);
    
    /**
     * Nils the "EndCreationDate" element
     */
    void setNilEndCreationDate();
    
    /**
     * Unsets the "EndCreationDate" element
     */
    void unsetEndCreationDate();
    
    /**
     * Gets the "EndModificationDate" element
     */
    java.util.Calendar getEndModificationDate();
    
    /**
     * Gets (as xml) the "EndModificationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndModificationDate();
    
    /**
     * Tests for nil "EndModificationDate" element
     */
    boolean isNilEndModificationDate();
    
    /**
     * True if has "EndModificationDate" element
     */
    boolean isSetEndModificationDate();
    
    /**
     * Sets the "EndModificationDate" element
     */
    void setEndModificationDate(java.util.Calendar endModificationDate);
    
    /**
     * Sets (as xml) the "EndModificationDate" element
     */
    void xsetEndModificationDate(org.apache.xmlbeans.XmlDateTime endModificationDate);
    
    /**
     * Nils the "EndModificationDate" element
     */
    void setNilEndModificationDate();
    
    /**
     * Unsets the "EndModificationDate" element
     */
    void unsetEndModificationDate();
    
    /**
     * Gets the "FetchOrderLines" element
     */
    boolean getFetchOrderLines();
    
    /**
     * Gets (as xml) the "FetchOrderLines" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFetchOrderLines();
    
    /**
     * True if has "FetchOrderLines" element
     */
    boolean isSetFetchOrderLines();
    
    /**
     * Sets the "FetchOrderLines" element
     */
    void setFetchOrderLines(boolean fetchOrderLines);
    
    /**
     * Sets (as xml) the "FetchOrderLines" element
     */
    void xsetFetchOrderLines(org.apache.xmlbeans.XmlBoolean fetchOrderLines);
    
    /**
     * Unsets the "FetchOrderLines" element
     */
    void unsetFetchOrderLines();
    
    /**
     * Gets the "FetchParcels" element
     */
    boolean getFetchParcels();
    
    /**
     * Gets (as xml) the "FetchParcels" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFetchParcels();
    
    /**
     * True if has "FetchParcels" element
     */
    boolean isSetFetchParcels();
    
    /**
     * Sets the "FetchParcels" element
     */
    void setFetchParcels(boolean fetchParcels);
    
    /**
     * Sets (as xml) the "FetchParcels" element
     */
    void xsetFetchParcels(org.apache.xmlbeans.XmlBoolean fetchParcels);
    
    /**
     * Unsets the "FetchParcels" element
     */
    void unsetFetchParcels();
    
    /**
     * Gets the "IncludeExternalFbcSiteId" element
     */
    boolean getIncludeExternalFbcSiteId();
    
    /**
     * Gets (as xml) the "IncludeExternalFbcSiteId" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIncludeExternalFbcSiteId();
    
    /**
     * True if has "IncludeExternalFbcSiteId" element
     */
    boolean isSetIncludeExternalFbcSiteId();
    
    /**
     * Sets the "IncludeExternalFbcSiteId" element
     */
    void setIncludeExternalFbcSiteId(boolean includeExternalFbcSiteId);
    
    /**
     * Sets (as xml) the "IncludeExternalFbcSiteId" element
     */
    void xsetIncludeExternalFbcSiteId(org.apache.xmlbeans.XmlBoolean includeExternalFbcSiteId);
    
    /**
     * Unsets the "IncludeExternalFbcSiteId" element
     */
    void unsetIncludeExternalFbcSiteId();
    
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
     * Gets the "OrderType" element
     */
    com.cdiscount.www.OrderTypeEnum.Enum getOrderType();
    
    /**
     * Gets (as xml) the "OrderType" element
     */
    com.cdiscount.www.OrderTypeEnum xgetOrderType();
    
    /**
     * Tests for nil "OrderType" element
     */
    boolean isNilOrderType();
    
    /**
     * True if has "OrderType" element
     */
    boolean isSetOrderType();
    
    /**
     * Sets the "OrderType" element
     */
    void setOrderType(com.cdiscount.www.OrderTypeEnum.Enum orderType);
    
    /**
     * Sets (as xml) the "OrderType" element
     */
    void xsetOrderType(com.cdiscount.www.OrderTypeEnum orderType);
    
    /**
     * Nils the "OrderType" element
     */
    void setNilOrderType();
    
    /**
     * Unsets the "OrderType" element
     */
    void unsetOrderType();
    
    /**
     * Gets the "PartnerOrderRef" element
     */
    java.lang.String getPartnerOrderRef();
    
    /**
     * Gets (as xml) the "PartnerOrderRef" element
     */
    org.apache.xmlbeans.XmlString xgetPartnerOrderRef();
    
    /**
     * Tests for nil "PartnerOrderRef" element
     */
    boolean isNilPartnerOrderRef();
    
    /**
     * True if has "PartnerOrderRef" element
     */
    boolean isSetPartnerOrderRef();
    
    /**
     * Sets the "PartnerOrderRef" element
     */
    void setPartnerOrderRef(java.lang.String partnerOrderRef);
    
    /**
     * Sets (as xml) the "PartnerOrderRef" element
     */
    void xsetPartnerOrderRef(org.apache.xmlbeans.XmlString partnerOrderRef);
    
    /**
     * Nils the "PartnerOrderRef" element
     */
    void setNilPartnerOrderRef();
    
    /**
     * Unsets the "PartnerOrderRef" element
     */
    void unsetPartnerOrderRef();
    
    /**
     * Gets the "States" element
     */
    com.cdiscount.www.ArrayOfOrderStateEnum getStates();
    
    /**
     * Tests for nil "States" element
     */
    boolean isNilStates();
    
    /**
     * True if has "States" element
     */
    boolean isSetStates();
    
    /**
     * Sets the "States" element
     */
    void setStates(com.cdiscount.www.ArrayOfOrderStateEnum states);
    
    /**
     * Appends and returns a new empty "States" element
     */
    com.cdiscount.www.ArrayOfOrderStateEnum addNewStates();
    
    /**
     * Nils the "States" element
     */
    void setNilStates();
    
    /**
     * Unsets the "States" element
     */
    void unsetStates();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.OrderFilter newInstance() {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OrderFilter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OrderFilter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OrderFilter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OrderFilter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OrderFilter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OrderFilter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OrderFilter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OrderFilter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OrderFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OrderFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OrderFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
