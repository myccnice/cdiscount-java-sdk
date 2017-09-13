/*
 * XML Type:  ArrayOfProductByIdentifier
 * Namespace: http://www.cdiscount.com/ProductByIdentifier
 * Java type: com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.productbyidentifier;


/**
 * An XML ArrayOfProductByIdentifier(@http://www.cdiscount.com/ProductByIdentifier).
 *
 * This is a complex type.
 */
public interface ArrayOfProductByIdentifier extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfProductByIdentifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("arrayofproductbyidentifier1fc6type");
    
    /**
     * Gets array of all "ProductByIdentifier" elements
     */
    com.cdiscount.www.productbyidentifier.ProductByIdentifier[] getProductByIdentifierArray();
    
    /**
     * Gets ith "ProductByIdentifier" element
     */
    com.cdiscount.www.productbyidentifier.ProductByIdentifier getProductByIdentifierArray(int i);
    
    /**
     * Tests for nil ith "ProductByIdentifier" element
     */
    boolean isNilProductByIdentifierArray(int i);
    
    /**
     * Returns number of "ProductByIdentifier" element
     */
    int sizeOfProductByIdentifierArray();
    
    /**
     * Sets array of all "ProductByIdentifier" element
     */
    void setProductByIdentifierArray(com.cdiscount.www.productbyidentifier.ProductByIdentifier[] productByIdentifierArray);
    
    /**
     * Sets ith "ProductByIdentifier" element
     */
    void setProductByIdentifierArray(int i, com.cdiscount.www.productbyidentifier.ProductByIdentifier productByIdentifier);
    
    /**
     * Nils the ith "ProductByIdentifier" element
     */
    void setNilProductByIdentifierArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductByIdentifier" element
     */
    com.cdiscount.www.productbyidentifier.ProductByIdentifier insertNewProductByIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductByIdentifier" element
     */
    com.cdiscount.www.productbyidentifier.ProductByIdentifier addNewProductByIdentifier();
    
    /**
     * Removes the ith "ProductByIdentifier" element
     */
    void removeProductByIdentifier(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier newInstance() {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
