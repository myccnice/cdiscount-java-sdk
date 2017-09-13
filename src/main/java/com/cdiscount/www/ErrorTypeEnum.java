/*
 * XML Type:  ErrorTypeEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ErrorTypeEnum
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ErrorTypeEnum(@http://www.cdiscount.com).
 *
 * This is an atomic type that is a restriction of com.cdiscount.www.ErrorTypeEnum.
 */
public interface ErrorTypeEnum extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorTypeEnum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("errortypeenum7b34type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum UNEXPECTED_EXCEPTION = Enum.forString("UnexpectedException");
    static final Enum MISSING_FIELD = Enum.forString("MissingField");
    static final Enum PACKAGE_NOT_FOUND = Enum.forString("PackageNotFound");
    static final Enum PACKAGE_MATCHING_FILE_ERROR = Enum.forString("PackageMatchingFileError");
    static final Enum ORDER_NOT_FOUND = Enum.forString("OrderNotFound");
    static final Enum ORDER_STATE_INCOHERENT = Enum.forString("OrderStateIncoherent");
    static final Enum ORDER_LINE_CANCELLED_ACCEPTED_CONFLICT = Enum.forString("OrderLineCancelledAcceptedConflict");
    static final Enum SELLER_NOT_FOUND = Enum.forString("SellerNotFound");
    static final Enum INVALID_FILE_FORMAT = Enum.forString("InvalidFileFormat");
    static final Enum FILE_ALREADY_SUBMITTED = Enum.forString("FileAlreadySubmitted");
    static final Enum INVALID_REQUEST = Enum.forString("InvalidRequest");
    static final Enum FILE_DOWNLOAD_EXCEPTION = Enum.forString("FileDownloadException");
    static final Enum SELLER_NOT_AUTHORIZED = Enum.forString("SellerNotAuthorized");
    static final Enum ORDER_LINE_NOT_FOUND = Enum.forString("OrderLineNotFound");
    static final Enum ORDER_LINE_INCOHERENT_STATE = Enum.forString("OrderLineIncoherentState");
    static final Enum FUNCTION_NOT_ACTIVE = Enum.forString("FunctionNotActive");
    static final Enum ORDER_PRICE_OR_QUANTITY_ERROR = Enum.forString("OrderPriceOrQuantityError");
    static final Enum ORDER_TRACKING_INFORMATION_ERROR = Enum.forString("OrderTrackingInformationError");
    static final Enum TOO_MANY_PRODUCTS_IN_PACKAGE_ERROR = Enum.forString("TooManyProductsInPackageError");
    static final Enum QUOTA = Enum.forString("Quota");
    static final Enum REFUND_ERROR = Enum.forString("RefundError");
    static final Enum DISCUSSION_CREATION_ERROR = Enum.forString("DiscussionCreationError");
    static final Enum CONFIGURATION_ERROR = Enum.forString("ConfigurationError");
    static final Enum ORDER_PARTIALLY_CANCELED = Enum.forString("OrderPartiallyCanceled");
    static final Enum ORDER_LINE_UPDATE_NOT_AUTHORIZED = Enum.forString("OrderLineUpdateNotAuthorized");
    static final Enum ORDER_UPDATE_NOT_AUTHORIZED = Enum.forString("OrderUpdateNotAuthorized");
    static final Enum ASKING_FOR_RETURN_AND_REMOVAL_NOT_AUTHORIZED = Enum.forString("AskingForReturnAndRemovalNotAuthorized");
    static final Enum ORDER_LINE_ERROR = Enum.forString("OrderLineError");
    static final Enum UNAUTHORIZED_VALUE_EXCEPTION = Enum.forString("UnauthorizedValueException");
    static final Enum NOT_AUTHORIZED_EXCEPTION = Enum.forString("NotAuthorizedException");
    static final Enum FULFILLMENT_API_EXCEPTION = Enum.forString("FulfillmentApiException");
    static final Enum OFFER_NOT_FOUND_EXCEPTION = Enum.forString("OfferNotFoundException");
    static final Enum OPERATION_MANAGER_SERVICE_EXCEPTION = Enum.forString("OperationManagerServiceException");
    static final Enum INACTIVE_SELLER_ERROR = Enum.forString("InactiveSellerError");
    static final Enum NO_DATA_ERROR = Enum.forString("NoDataError");
    
    static final int INT_UNEXPECTED_EXCEPTION = Enum.INT_UNEXPECTED_EXCEPTION;
    static final int INT_MISSING_FIELD = Enum.INT_MISSING_FIELD;
    static final int INT_PACKAGE_NOT_FOUND = Enum.INT_PACKAGE_NOT_FOUND;
    static final int INT_PACKAGE_MATCHING_FILE_ERROR = Enum.INT_PACKAGE_MATCHING_FILE_ERROR;
    static final int INT_ORDER_NOT_FOUND = Enum.INT_ORDER_NOT_FOUND;
    static final int INT_ORDER_STATE_INCOHERENT = Enum.INT_ORDER_STATE_INCOHERENT;
    static final int INT_ORDER_LINE_CANCELLED_ACCEPTED_CONFLICT = Enum.INT_ORDER_LINE_CANCELLED_ACCEPTED_CONFLICT;
    static final int INT_SELLER_NOT_FOUND = Enum.INT_SELLER_NOT_FOUND;
    static final int INT_INVALID_FILE_FORMAT = Enum.INT_INVALID_FILE_FORMAT;
    static final int INT_FILE_ALREADY_SUBMITTED = Enum.INT_FILE_ALREADY_SUBMITTED;
    static final int INT_INVALID_REQUEST = Enum.INT_INVALID_REQUEST;
    static final int INT_FILE_DOWNLOAD_EXCEPTION = Enum.INT_FILE_DOWNLOAD_EXCEPTION;
    static final int INT_SELLER_NOT_AUTHORIZED = Enum.INT_SELLER_NOT_AUTHORIZED;
    static final int INT_ORDER_LINE_NOT_FOUND = Enum.INT_ORDER_LINE_NOT_FOUND;
    static final int INT_ORDER_LINE_INCOHERENT_STATE = Enum.INT_ORDER_LINE_INCOHERENT_STATE;
    static final int INT_FUNCTION_NOT_ACTIVE = Enum.INT_FUNCTION_NOT_ACTIVE;
    static final int INT_ORDER_PRICE_OR_QUANTITY_ERROR = Enum.INT_ORDER_PRICE_OR_QUANTITY_ERROR;
    static final int INT_ORDER_TRACKING_INFORMATION_ERROR = Enum.INT_ORDER_TRACKING_INFORMATION_ERROR;
    static final int INT_TOO_MANY_PRODUCTS_IN_PACKAGE_ERROR = Enum.INT_TOO_MANY_PRODUCTS_IN_PACKAGE_ERROR;
    static final int INT_QUOTA = Enum.INT_QUOTA;
    static final int INT_REFUND_ERROR = Enum.INT_REFUND_ERROR;
    static final int INT_DISCUSSION_CREATION_ERROR = Enum.INT_DISCUSSION_CREATION_ERROR;
    static final int INT_CONFIGURATION_ERROR = Enum.INT_CONFIGURATION_ERROR;
    static final int INT_ORDER_PARTIALLY_CANCELED = Enum.INT_ORDER_PARTIALLY_CANCELED;
    static final int INT_ORDER_LINE_UPDATE_NOT_AUTHORIZED = Enum.INT_ORDER_LINE_UPDATE_NOT_AUTHORIZED;
    static final int INT_ORDER_UPDATE_NOT_AUTHORIZED = Enum.INT_ORDER_UPDATE_NOT_AUTHORIZED;
    static final int INT_ASKING_FOR_RETURN_AND_REMOVAL_NOT_AUTHORIZED = Enum.INT_ASKING_FOR_RETURN_AND_REMOVAL_NOT_AUTHORIZED;
    static final int INT_ORDER_LINE_ERROR = Enum.INT_ORDER_LINE_ERROR;
    static final int INT_UNAUTHORIZED_VALUE_EXCEPTION = Enum.INT_UNAUTHORIZED_VALUE_EXCEPTION;
    static final int INT_NOT_AUTHORIZED_EXCEPTION = Enum.INT_NOT_AUTHORIZED_EXCEPTION;
    static final int INT_FULFILLMENT_API_EXCEPTION = Enum.INT_FULFILLMENT_API_EXCEPTION;
    static final int INT_OFFER_NOT_FOUND_EXCEPTION = Enum.INT_OFFER_NOT_FOUND_EXCEPTION;
    static final int INT_OPERATION_MANAGER_SERVICE_EXCEPTION = Enum.INT_OPERATION_MANAGER_SERVICE_EXCEPTION;
    static final int INT_INACTIVE_SELLER_ERROR = Enum.INT_INACTIVE_SELLER_ERROR;
    static final int INT_NO_DATA_ERROR = Enum.INT_NO_DATA_ERROR;
    
    /**
     * Enumeration value class for com.cdiscount.www.ErrorTypeEnum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_UNEXPECTED_EXCEPTION
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_UNEXPECTED_EXCEPTION = 1;
        static final int INT_MISSING_FIELD = 2;
        static final int INT_PACKAGE_NOT_FOUND = 3;
        static final int INT_PACKAGE_MATCHING_FILE_ERROR = 4;
        static final int INT_ORDER_NOT_FOUND = 5;
        static final int INT_ORDER_STATE_INCOHERENT = 6;
        static final int INT_ORDER_LINE_CANCELLED_ACCEPTED_CONFLICT = 7;
        static final int INT_SELLER_NOT_FOUND = 8;
        static final int INT_INVALID_FILE_FORMAT = 9;
        static final int INT_FILE_ALREADY_SUBMITTED = 10;
        static final int INT_INVALID_REQUEST = 11;
        static final int INT_FILE_DOWNLOAD_EXCEPTION = 12;
        static final int INT_SELLER_NOT_AUTHORIZED = 13;
        static final int INT_ORDER_LINE_NOT_FOUND = 14;
        static final int INT_ORDER_LINE_INCOHERENT_STATE = 15;
        static final int INT_FUNCTION_NOT_ACTIVE = 16;
        static final int INT_ORDER_PRICE_OR_QUANTITY_ERROR = 17;
        static final int INT_ORDER_TRACKING_INFORMATION_ERROR = 18;
        static final int INT_TOO_MANY_PRODUCTS_IN_PACKAGE_ERROR = 19;
        static final int INT_QUOTA = 20;
        static final int INT_REFUND_ERROR = 21;
        static final int INT_DISCUSSION_CREATION_ERROR = 22;
        static final int INT_CONFIGURATION_ERROR = 23;
        static final int INT_ORDER_PARTIALLY_CANCELED = 24;
        static final int INT_ORDER_LINE_UPDATE_NOT_AUTHORIZED = 25;
        static final int INT_ORDER_UPDATE_NOT_AUTHORIZED = 26;
        static final int INT_ASKING_FOR_RETURN_AND_REMOVAL_NOT_AUTHORIZED = 27;
        static final int INT_ORDER_LINE_ERROR = 28;
        static final int INT_UNAUTHORIZED_VALUE_EXCEPTION = 29;
        static final int INT_NOT_AUTHORIZED_EXCEPTION = 30;
        static final int INT_FULFILLMENT_API_EXCEPTION = 31;
        static final int INT_OFFER_NOT_FOUND_EXCEPTION = 32;
        static final int INT_OPERATION_MANAGER_SERVICE_EXCEPTION = 33;
        static final int INT_INACTIVE_SELLER_ERROR = 34;
        static final int INT_NO_DATA_ERROR = 35;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("UnexpectedException", INT_UNEXPECTED_EXCEPTION),
                new Enum("MissingField", INT_MISSING_FIELD),
                new Enum("PackageNotFound", INT_PACKAGE_NOT_FOUND),
                new Enum("PackageMatchingFileError", INT_PACKAGE_MATCHING_FILE_ERROR),
                new Enum("OrderNotFound", INT_ORDER_NOT_FOUND),
                new Enum("OrderStateIncoherent", INT_ORDER_STATE_INCOHERENT),
                new Enum("OrderLineCancelledAcceptedConflict", INT_ORDER_LINE_CANCELLED_ACCEPTED_CONFLICT),
                new Enum("SellerNotFound", INT_SELLER_NOT_FOUND),
                new Enum("InvalidFileFormat", INT_INVALID_FILE_FORMAT),
                new Enum("FileAlreadySubmitted", INT_FILE_ALREADY_SUBMITTED),
                new Enum("InvalidRequest", INT_INVALID_REQUEST),
                new Enum("FileDownloadException", INT_FILE_DOWNLOAD_EXCEPTION),
                new Enum("SellerNotAuthorized", INT_SELLER_NOT_AUTHORIZED),
                new Enum("OrderLineNotFound", INT_ORDER_LINE_NOT_FOUND),
                new Enum("OrderLineIncoherentState", INT_ORDER_LINE_INCOHERENT_STATE),
                new Enum("FunctionNotActive", INT_FUNCTION_NOT_ACTIVE),
                new Enum("OrderPriceOrQuantityError", INT_ORDER_PRICE_OR_QUANTITY_ERROR),
                new Enum("OrderTrackingInformationError", INT_ORDER_TRACKING_INFORMATION_ERROR),
                new Enum("TooManyProductsInPackageError", INT_TOO_MANY_PRODUCTS_IN_PACKAGE_ERROR),
                new Enum("Quota", INT_QUOTA),
                new Enum("RefundError", INT_REFUND_ERROR),
                new Enum("DiscussionCreationError", INT_DISCUSSION_CREATION_ERROR),
                new Enum("ConfigurationError", INT_CONFIGURATION_ERROR),
                new Enum("OrderPartiallyCanceled", INT_ORDER_PARTIALLY_CANCELED),
                new Enum("OrderLineUpdateNotAuthorized", INT_ORDER_LINE_UPDATE_NOT_AUTHORIZED),
                new Enum("OrderUpdateNotAuthorized", INT_ORDER_UPDATE_NOT_AUTHORIZED),
                new Enum("AskingForReturnAndRemovalNotAuthorized", INT_ASKING_FOR_RETURN_AND_REMOVAL_NOT_AUTHORIZED),
                new Enum("OrderLineError", INT_ORDER_LINE_ERROR),
                new Enum("UnauthorizedValueException", INT_UNAUTHORIZED_VALUE_EXCEPTION),
                new Enum("NotAuthorizedException", INT_NOT_AUTHORIZED_EXCEPTION),
                new Enum("FulfillmentApiException", INT_FULFILLMENT_API_EXCEPTION),
                new Enum("OfferNotFoundException", INT_OFFER_NOT_FOUND_EXCEPTION),
                new Enum("OperationManagerServiceException", INT_OPERATION_MANAGER_SERVICE_EXCEPTION),
                new Enum("InactiveSellerError", INT_INACTIVE_SELLER_ERROR),
                new Enum("NoDataError", INT_NO_DATA_ERROR),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ErrorTypeEnum newValue(java.lang.Object obj) {
          return (com.cdiscount.www.ErrorTypeEnum) type.newValue( obj ); }
        
        public static com.cdiscount.www.ErrorTypeEnum newInstance() {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ErrorTypeEnum parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ErrorTypeEnum parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ErrorTypeEnum parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ErrorTypeEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ErrorTypeEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ErrorTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
