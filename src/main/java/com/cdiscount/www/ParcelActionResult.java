/*
 * XML Type:  ParcelActionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelActionResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ParcelActionResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ParcelActionResult extends org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParcelActionResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("parcelactionresult8849type");
    
    /**
     * Gets the "ActionType" element
     */
    java.util.List getActionType();
    
    /**
     * Gets (as xml) the "ActionType" element
     */
    com.cdiscount.www.ParcelActionTypes xgetActionType();
    
    /**
     * True if has "ActionType" element
     */
    boolean isSetActionType();
    
    /**
     * Sets the "ActionType" element
     */
    void setActionType(java.util.List actionType);
    
    /**
     * Sets (as xml) the "ActionType" element
     */
    void xsetActionType(com.cdiscount.www.ParcelActionTypes actionType);
    
    /**
     * Unsets the "ActionType" element
     */
    void unsetActionType();
    
    /**
     * Gets the "IsActionCreated" element
     */
    boolean getIsActionCreated();
    
    /**
     * Gets (as xml) the "IsActionCreated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsActionCreated();
    
    /**
     * True if has "IsActionCreated" element
     */
    boolean isSetIsActionCreated();
    
    /**
     * Sets the "IsActionCreated" element
     */
    void setIsActionCreated(boolean isActionCreated);
    
    /**
     * Sets (as xml) the "IsActionCreated" element
     */
    void xsetIsActionCreated(org.apache.xmlbeans.XmlBoolean isActionCreated);
    
    /**
     * Unsets the "IsActionCreated" element
     */
    void unsetIsActionCreated();
    
    /**
     * Gets the "ParcelNumber" element
     */
    java.lang.String getParcelNumber();
    
    /**
     * Gets (as xml) the "ParcelNumber" element
     */
    org.apache.xmlbeans.XmlString xgetParcelNumber();
    
    /**
     * Tests for nil "ParcelNumber" element
     */
    boolean isNilParcelNumber();
    
    /**
     * True if has "ParcelNumber" element
     */
    boolean isSetParcelNumber();
    
    /**
     * Sets the "ParcelNumber" element
     */
    void setParcelNumber(java.lang.String parcelNumber);
    
    /**
     * Sets (as xml) the "ParcelNumber" element
     */
    void xsetParcelNumber(org.apache.xmlbeans.XmlString parcelNumber);
    
    /**
     * Nils the "ParcelNumber" element
     */
    void setNilParcelNumber();
    
    /**
     * Unsets the "ParcelNumber" element
     */
    void unsetParcelNumber();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ParcelActionResult newInstance() {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ParcelActionResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ParcelActionResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ParcelActionResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ParcelActionResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ParcelActionResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ParcelActionResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
