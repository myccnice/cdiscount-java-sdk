/*
 * XML Type:  FulfilmentActivationReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReport
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML FulfilmentActivationReport(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface FulfilmentActivationReport extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FulfilmentActivationReport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("fulfilmentactivationreport3611type");
    
    /**
     * Gets the "DepositId" element
     */
    int getDepositId();
    
    /**
     * Gets (as xml) the "DepositId" element
     */
    org.apache.xmlbeans.XmlInt xgetDepositId();
    
    /**
     * Tests for nil "DepositId" element
     */
    boolean isNilDepositId();
    
    /**
     * True if has "DepositId" element
     */
    boolean isSetDepositId();
    
    /**
     * Sets the "DepositId" element
     */
    void setDepositId(int depositId);
    
    /**
     * Sets (as xml) the "DepositId" element
     */
    void xsetDepositId(org.apache.xmlbeans.XmlInt depositId);
    
    /**
     * Nils the "DepositId" element
     */
    void setNilDepositId();
    
    /**
     * Unsets the "DepositId" element
     */
    void unsetDepositId();
    
    /**
     * Gets the "DetailsList" element
     */
    com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails getDetailsList();
    
    /**
     * Tests for nil "DetailsList" element
     */
    boolean isNilDetailsList();
    
    /**
     * True if has "DetailsList" element
     */
    boolean isSetDetailsList();
    
    /**
     * Sets the "DetailsList" element
     */
    void setDetailsList(com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails detailsList);
    
    /**
     * Appends and returns a new empty "DetailsList" element
     */
    com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails addNewDetailsList();
    
    /**
     * Nils the "DetailsList" element
     */
    void setNilDetailsList();
    
    /**
     * Unsets the "DetailsList" element
     */
    void unsetDetailsList();
    
    /**
     * Gets the "NumberOfActivatedProducts" element
     */
    int getNumberOfActivatedProducts();
    
    /**
     * Gets (as xml) the "NumberOfActivatedProducts" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfActivatedProducts();
    
    /**
     * True if has "NumberOfActivatedProducts" element
     */
    boolean isSetNumberOfActivatedProducts();
    
    /**
     * Sets the "NumberOfActivatedProducts" element
     */
    void setNumberOfActivatedProducts(int numberOfActivatedProducts);
    
    /**
     * Sets (as xml) the "NumberOfActivatedProducts" element
     */
    void xsetNumberOfActivatedProducts(org.apache.xmlbeans.XmlInt numberOfActivatedProducts);
    
    /**
     * Unsets the "NumberOfActivatedProducts" element
     */
    void unsetNumberOfActivatedProducts();
    
    /**
     * Gets the "NumberOfDeactivatedProducts" element
     */
    int getNumberOfDeactivatedProducts();
    
    /**
     * Gets (as xml) the "NumberOfDeactivatedProducts" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfDeactivatedProducts();
    
    /**
     * True if has "NumberOfDeactivatedProducts" element
     */
    boolean isSetNumberOfDeactivatedProducts();
    
    /**
     * Sets the "NumberOfDeactivatedProducts" element
     */
    void setNumberOfDeactivatedProducts(int numberOfDeactivatedProducts);
    
    /**
     * Sets (as xml) the "NumberOfDeactivatedProducts" element
     */
    void xsetNumberOfDeactivatedProducts(org.apache.xmlbeans.XmlInt numberOfDeactivatedProducts);
    
    /**
     * Unsets the "NumberOfDeactivatedProducts" element
     */
    void unsetNumberOfDeactivatedProducts();
    
    /**
     * Gets the "NumberOfProcessedProducts" element
     */
    int getNumberOfProcessedProducts();
    
    /**
     * Gets (as xml) the "NumberOfProcessedProducts" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfProcessedProducts();
    
    /**
     * True if has "NumberOfProcessedProducts" element
     */
    boolean isSetNumberOfProcessedProducts();
    
    /**
     * Sets the "NumberOfProcessedProducts" element
     */
    void setNumberOfProcessedProducts(int numberOfProcessedProducts);
    
    /**
     * Sets (as xml) the "NumberOfProcessedProducts" element
     */
    void xsetNumberOfProcessedProducts(org.apache.xmlbeans.XmlInt numberOfProcessedProducts);
    
    /**
     * Unsets the "NumberOfProcessedProducts" element
     */
    void unsetNumberOfProcessedProducts();
    
    /**
     * Gets the "NumberOfProducts" element
     */
    int getNumberOfProducts();
    
    /**
     * Gets (as xml) the "NumberOfProducts" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfProducts();
    
    /**
     * True if has "NumberOfProducts" element
     */
    boolean isSetNumberOfProducts();
    
    /**
     * Sets the "NumberOfProducts" element
     */
    void setNumberOfProducts(int numberOfProducts);
    
    /**
     * Sets (as xml) the "NumberOfProducts" element
     */
    void xsetNumberOfProducts(org.apache.xmlbeans.XmlInt numberOfProducts);
    
    /**
     * Unsets the "NumberOfProducts" element
     */
    void unsetNumberOfProducts();
    
    /**
     * Gets the "NumberOfProductsInError" element
     */
    int getNumberOfProductsInError();
    
    /**
     * Gets (as xml) the "NumberOfProductsInError" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfProductsInError();
    
    /**
     * True if has "NumberOfProductsInError" element
     */
    boolean isSetNumberOfProductsInError();
    
    /**
     * Sets the "NumberOfProductsInError" element
     */
    void setNumberOfProductsInError(int numberOfProductsInError);
    
    /**
     * Sets (as xml) the "NumberOfProductsInError" element
     */
    void xsetNumberOfProductsInError(org.apache.xmlbeans.XmlInt numberOfProductsInError);
    
    /**
     * Unsets the "NumberOfProductsInError" element
     */
    void unsetNumberOfProductsInError();
    
    /**
     * Gets the "NumberOfRemainingProductsToProcess" element
     */
    int getNumberOfRemainingProductsToProcess();
    
    /**
     * Gets (as xml) the "NumberOfRemainingProductsToProcess" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfRemainingProductsToProcess();
    
    /**
     * True if has "NumberOfRemainingProductsToProcess" element
     */
    boolean isSetNumberOfRemainingProductsToProcess();
    
    /**
     * Sets the "NumberOfRemainingProductsToProcess" element
     */
    void setNumberOfRemainingProductsToProcess(int numberOfRemainingProductsToProcess);
    
    /**
     * Sets (as xml) the "NumberOfRemainingProductsToProcess" element
     */
    void xsetNumberOfRemainingProductsToProcess(org.apache.xmlbeans.XmlInt numberOfRemainingProductsToProcess);
    
    /**
     * Unsets the "NumberOfRemainingProductsToProcess" element
     */
    void unsetNumberOfRemainingProductsToProcess();
    
    /**
     * Gets the "ReportDate" element
     */
    java.util.Calendar getReportDate();
    
    /**
     * Gets (as xml) the "ReportDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetReportDate();
    
    /**
     * True if has "ReportDate" element
     */
    boolean isSetReportDate();
    
    /**
     * Sets the "ReportDate" element
     */
    void setReportDate(java.util.Calendar reportDate);
    
    /**
     * Sets (as xml) the "ReportDate" element
     */
    void xsetReportDate(org.apache.xmlbeans.XmlDateTime reportDate);
    
    /**
     * Unsets the "ReportDate" element
     */
    void unsetReportDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.FulfilmentActivationReport newInstance() {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.FulfilmentActivationReport parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.FulfilmentActivationReport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.FulfilmentActivationReport parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.FulfilmentActivationReport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
