/*
 * XML Type:  ArrayOfOfferReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferReportPropertyLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ArrayOfOfferReportPropertyLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ArrayOfOfferReportPropertyLog extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfOfferReportPropertyLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("arrayofofferreportpropertyloge9a8type");
    
    /**
     * Gets array of all "OfferReportPropertyLog" elements
     */
    com.cdiscount.www.OfferReportPropertyLog[] getOfferReportPropertyLogArray();
    
    /**
     * Gets ith "OfferReportPropertyLog" element
     */
    com.cdiscount.www.OfferReportPropertyLog getOfferReportPropertyLogArray(int i);
    
    /**
     * Tests for nil ith "OfferReportPropertyLog" element
     */
    boolean isNilOfferReportPropertyLogArray(int i);
    
    /**
     * Returns number of "OfferReportPropertyLog" element
     */
    int sizeOfOfferReportPropertyLogArray();
    
    /**
     * Sets array of all "OfferReportPropertyLog" element
     */
    void setOfferReportPropertyLogArray(com.cdiscount.www.OfferReportPropertyLog[] offerReportPropertyLogArray);
    
    /**
     * Sets ith "OfferReportPropertyLog" element
     */
    void setOfferReportPropertyLogArray(int i, com.cdiscount.www.OfferReportPropertyLog offerReportPropertyLog);
    
    /**
     * Nils the ith "OfferReportPropertyLog" element
     */
    void setNilOfferReportPropertyLogArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OfferReportPropertyLog" element
     */
    com.cdiscount.www.OfferReportPropertyLog insertNewOfferReportPropertyLog(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OfferReportPropertyLog" element
     */
    com.cdiscount.www.OfferReportPropertyLog addNewOfferReportPropertyLog();
    
    /**
     * Removes the ith "OfferReportPropertyLog" element
     */
    void removeOfferReportPropertyLog(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog newInstance() {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ArrayOfOfferReportPropertyLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ArrayOfOfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
