/*
 * XML Type:  Product
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Product
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML Product(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface Product extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Product.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("product0408type");
    
    /**
     * Gets the "BrandName" element
     */
    java.lang.String getBrandName();
    
    /**
     * Gets (as xml) the "BrandName" element
     */
    org.apache.xmlbeans.XmlString xgetBrandName();
    
    /**
     * Tests for nil "BrandName" element
     */
    boolean isNilBrandName();
    
    /**
     * True if has "BrandName" element
     */
    boolean isSetBrandName();
    
    /**
     * Sets the "BrandName" element
     */
    void setBrandName(java.lang.String brandName);
    
    /**
     * Sets (as xml) the "BrandName" element
     */
    void xsetBrandName(org.apache.xmlbeans.XmlString brandName);
    
    /**
     * Nils the "BrandName" element
     */
    void setNilBrandName();
    
    /**
     * Unsets the "BrandName" element
     */
    void unsetBrandName();
    
    /**
     * Gets the "EANList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getEANList();
    
    /**
     * Tests for nil "EANList" element
     */
    boolean isNilEANList();
    
    /**
     * True if has "EANList" element
     */
    boolean isSetEANList();
    
    /**
     * Sets the "EANList" element
     */
    void setEANList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring eanList);
    
    /**
     * Appends and returns a new empty "EANList" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewEANList();
    
    /**
     * Nils the "EANList" element
     */
    void setNilEANList();
    
    /**
     * Unsets the "EANList" element
     */
    void unsetEANList();
    
    /**
     * Gets the "ISBN" element
     */
    java.lang.String getISBN();
    
    /**
     * Gets (as xml) the "ISBN" element
     */
    org.apache.xmlbeans.XmlString xgetISBN();
    
    /**
     * Tests for nil "ISBN" element
     */
    boolean isNilISBN();
    
    /**
     * True if has "ISBN" element
     */
    boolean isSetISBN();
    
    /**
     * Sets the "ISBN" element
     */
    void setISBN(java.lang.String isbn);
    
    /**
     * Sets (as xml) the "ISBN" element
     */
    void xsetISBN(org.apache.xmlbeans.XmlString isbn);
    
    /**
     * Nils the "ISBN" element
     */
    void setNilISBN();
    
    /**
     * Unsets the "ISBN" element
     */
    void unsetISBN();
    
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
     * Gets the "ProductType" element
     */
    com.cdiscount.www.ProductTypeEnum.Enum getProductType();
    
    /**
     * Gets (as xml) the "ProductType" element
     */
    com.cdiscount.www.ProductTypeEnum xgetProductType();
    
    /**
     * True if has "ProductType" element
     */
    boolean isSetProductType();
    
    /**
     * Sets the "ProductType" element
     */
    void setProductType(com.cdiscount.www.ProductTypeEnum.Enum productType);
    
    /**
     * Sets (as xml) the "ProductType" element
     */
    void xsetProductType(com.cdiscount.www.ProductTypeEnum productType);
    
    /**
     * Unsets the "ProductType" element
     */
    void unsetProductType();
    
    /**
     * Gets the "SKU" element
     */
    java.lang.String getSKU();
    
    /**
     * Gets (as xml) the "SKU" element
     */
    org.apache.xmlbeans.XmlString xgetSKU();
    
    /**
     * Tests for nil "SKU" element
     */
    boolean isNilSKU();
    
    /**
     * True if has "SKU" element
     */
    boolean isSetSKU();
    
    /**
     * Sets the "SKU" element
     */
    void setSKU(java.lang.String sku);
    
    /**
     * Sets (as xml) the "SKU" element
     */
    void xsetSKU(org.apache.xmlbeans.XmlString sku);
    
    /**
     * Nils the "SKU" element
     */
    void setNilSKU();
    
    /**
     * Unsets the "SKU" element
     */
    void unsetSKU();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.Product newInstance() {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.Product newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.Product parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.Product parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.Product parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.Product parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.Product parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.Product parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.Product parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.Product parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.Product parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.Product parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.Product parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.Product parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.Product parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.Product parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Product parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Product parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
