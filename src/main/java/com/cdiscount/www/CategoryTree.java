/*
 * XML Type:  CategoryTree
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CategoryTree
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML CategoryTree(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface CategoryTree extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CategoryTree.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("categorytree4469type");
    
    /**
     * Gets the "AllowOfferIntegration" element
     */
    boolean getAllowOfferIntegration();
    
    /**
     * Gets (as xml) the "AllowOfferIntegration" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowOfferIntegration();
    
    /**
     * True if has "AllowOfferIntegration" element
     */
    boolean isSetAllowOfferIntegration();
    
    /**
     * Sets the "AllowOfferIntegration" element
     */
    void setAllowOfferIntegration(boolean allowOfferIntegration);
    
    /**
     * Sets (as xml) the "AllowOfferIntegration" element
     */
    void xsetAllowOfferIntegration(org.apache.xmlbeans.XmlBoolean allowOfferIntegration);
    
    /**
     * Unsets the "AllowOfferIntegration" element
     */
    void unsetAllowOfferIntegration();
    
    /**
     * Gets the "AllowProductIntegration" element
     */
    boolean getAllowProductIntegration();
    
    /**
     * Gets (as xml) the "AllowProductIntegration" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowProductIntegration();
    
    /**
     * True if has "AllowProductIntegration" element
     */
    boolean isSetAllowProductIntegration();
    
    /**
     * Sets the "AllowProductIntegration" element
     */
    void setAllowProductIntegration(boolean allowProductIntegration);
    
    /**
     * Sets (as xml) the "AllowProductIntegration" element
     */
    void xsetAllowProductIntegration(org.apache.xmlbeans.XmlBoolean allowProductIntegration);
    
    /**
     * Unsets the "AllowProductIntegration" element
     */
    void unsetAllowProductIntegration();
    
    /**
     * Gets the "ChildrenCategoryList" element
     */
    com.cdiscount.www.ArrayOfCategoryTree getChildrenCategoryList();
    
    /**
     * Tests for nil "ChildrenCategoryList" element
     */
    boolean isNilChildrenCategoryList();
    
    /**
     * True if has "ChildrenCategoryList" element
     */
    boolean isSetChildrenCategoryList();
    
    /**
     * Sets the "ChildrenCategoryList" element
     */
    void setChildrenCategoryList(com.cdiscount.www.ArrayOfCategoryTree childrenCategoryList);
    
    /**
     * Appends and returns a new empty "ChildrenCategoryList" element
     */
    com.cdiscount.www.ArrayOfCategoryTree addNewChildrenCategoryList();
    
    /**
     * Nils the "ChildrenCategoryList" element
     */
    void setNilChildrenCategoryList();
    
    /**
     * Unsets the "ChildrenCategoryList" element
     */
    void unsetChildrenCategoryList();
    
    /**
     * Gets the "Code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "Code" element
     */
    org.apache.xmlbeans.XmlString xgetCode();
    
    /**
     * Tests for nil "Code" element
     */
    boolean isNilCode();
    
    /**
     * True if has "Code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "Code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "Code" element
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);
    
    /**
     * Nils the "Code" element
     */
    void setNilCode();
    
    /**
     * Unsets the "Code" element
     */
    void unsetCode();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.CategoryTree newInstance() {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.CategoryTree newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.CategoryTree parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.CategoryTree parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.CategoryTree parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.CategoryTree parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.CategoryTree parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.CategoryTree parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.CategoryTree parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.CategoryTree parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.CategoryTree parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.CategoryTree) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
