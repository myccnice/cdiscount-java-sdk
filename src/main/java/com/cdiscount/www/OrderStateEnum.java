/*
 * XML Type:  OrderStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderStateEnum
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OrderStateEnum(@http://www.cdiscount.com).
 *
 * This is an atomic type that is a restriction of com.cdiscount.www.OrderStateEnum.
 */
public interface OrderStateEnum extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderStateEnum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("orderstateenum93e1type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CANCELLED_BY_CUSTOMER = Enum.forString("CancelledByCustomer");
    static final Enum WAITING_FOR_SELLER_ACCEPTATION = Enum.forString("WaitingForSellerAcceptation");
    static final Enum ACCEPTED_BY_SELLER = Enum.forString("AcceptedBySeller");
    static final Enum PAYMENT_IN_PROGRESS = Enum.forString("PaymentInProgress");
    static final Enum WAITING_FOR_SHIPMENT_ACCEPTATION = Enum.forString("WaitingForShipmentAcceptation");
    static final Enum SHIPPED = Enum.forString("Shipped");
    static final Enum REFUSED_BY_SELLER = Enum.forString("RefusedBySeller");
    static final Enum AUTOMATIC_CANCELLATION = Enum.forString("AutomaticCancellation");
    static final Enum PAYMENT_REFUSED = Enum.forString("PaymentRefused");
    static final Enum SHIPMENT_REFUSED_BY_SELLER = Enum.forString("ShipmentRefusedBySeller");
    static final Enum NONE = Enum.forString("None");
    static final Enum VALIDATED_FIANET = Enum.forString("ValidatedFianet");
    static final Enum REFUSED_NO_SHIPMENT = Enum.forString("RefusedNoShipment");
    static final Enum AVAILABLE_ON_STORE = Enum.forString("AvailableOnStore");
    static final Enum NON_PICKED_UP_BY_CUSTOMER = Enum.forString("NonPickedUpByCustomer");
    static final Enum PICKED_UP = Enum.forString("PickedUp");
    static final Enum SERVICE_CANCELED = Enum.forString("ServiceCanceled");
    static final Enum PENDING_SHIPMENT_FOR_ASSOCIATED_PRODUCT = Enum.forString("PendingShipmentForAssociatedProduct");
    static final Enum BLOCKED_WAITING_FOR_TREATMENT = Enum.forString("BlockedWaitingForTreatment");
    static final Enum BLOCKED_WAITING_FOR_PROOF = Enum.forString("BlockedWaitingForProof");
    static final Enum BLOCKED_REPEATED_LITIGATION_SUSPICION = Enum.forString("BlockedRepeatedLitigationSuspicion");
    static final Enum BLOCKED_FRAUD_SUSPICION = Enum.forString("BlockedFraudSuspicion");
    static final Enum BLOCKED_CONFIRMED = Enum.forString("BlockedConfirmed");
    static final Enum FINISHED_GENERIX_UPDATE = Enum.forString("FinishedGenerixUpdate");
    static final Enum BLOCKED_REPEATED_LITIGATION_SUSPICION_CONFIRMATION = Enum.forString("BlockedRepeatedLitigationSuspicionConfirmation");
    static final Enum BLOCKED_FRAUD_SUSPICION_CONFIRMATION = Enum.forString("BlockedFraudSuspicionConfirmation");
    static final Enum CEGID_DOWN = Enum.forString("CegidDown");
    static final Enum BLOCKED_AUTOMATIC_CDS = Enum.forString("BlockedAutomaticCds");
    static final Enum BEING_CANCELLED = Enum.forString("BeingCancelled");
    static final Enum BEING_MODIFIED = Enum.forString("BeingModified");
    static final Enum REQUEST_GOING_TO_GNX = Enum.forString("RequestGoingToGnx");
    static final Enum PARTIAL_IN_GNX = Enum.forString("PartialInGnx");
    static final Enum BEING_VALIDATED_FIANET = Enum.forString("BeingValidatedFianet");
    static final Enum BLOCKED_MARKETPLACE_SERVICE = Enum.forString("BlockedMarketplaceService");
    
    static final int INT_CANCELLED_BY_CUSTOMER = Enum.INT_CANCELLED_BY_CUSTOMER;
    static final int INT_WAITING_FOR_SELLER_ACCEPTATION = Enum.INT_WAITING_FOR_SELLER_ACCEPTATION;
    static final int INT_ACCEPTED_BY_SELLER = Enum.INT_ACCEPTED_BY_SELLER;
    static final int INT_PAYMENT_IN_PROGRESS = Enum.INT_PAYMENT_IN_PROGRESS;
    static final int INT_WAITING_FOR_SHIPMENT_ACCEPTATION = Enum.INT_WAITING_FOR_SHIPMENT_ACCEPTATION;
    static final int INT_SHIPPED = Enum.INT_SHIPPED;
    static final int INT_REFUSED_BY_SELLER = Enum.INT_REFUSED_BY_SELLER;
    static final int INT_AUTOMATIC_CANCELLATION = Enum.INT_AUTOMATIC_CANCELLATION;
    static final int INT_PAYMENT_REFUSED = Enum.INT_PAYMENT_REFUSED;
    static final int INT_SHIPMENT_REFUSED_BY_SELLER = Enum.INT_SHIPMENT_REFUSED_BY_SELLER;
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_VALIDATED_FIANET = Enum.INT_VALIDATED_FIANET;
    static final int INT_REFUSED_NO_SHIPMENT = Enum.INT_REFUSED_NO_SHIPMENT;
    static final int INT_AVAILABLE_ON_STORE = Enum.INT_AVAILABLE_ON_STORE;
    static final int INT_NON_PICKED_UP_BY_CUSTOMER = Enum.INT_NON_PICKED_UP_BY_CUSTOMER;
    static final int INT_PICKED_UP = Enum.INT_PICKED_UP;
    static final int INT_SERVICE_CANCELED = Enum.INT_SERVICE_CANCELED;
    static final int INT_PENDING_SHIPMENT_FOR_ASSOCIATED_PRODUCT = Enum.INT_PENDING_SHIPMENT_FOR_ASSOCIATED_PRODUCT;
    static final int INT_BLOCKED_WAITING_FOR_TREATMENT = Enum.INT_BLOCKED_WAITING_FOR_TREATMENT;
    static final int INT_BLOCKED_WAITING_FOR_PROOF = Enum.INT_BLOCKED_WAITING_FOR_PROOF;
    static final int INT_BLOCKED_REPEATED_LITIGATION_SUSPICION = Enum.INT_BLOCKED_REPEATED_LITIGATION_SUSPICION;
    static final int INT_BLOCKED_FRAUD_SUSPICION = Enum.INT_BLOCKED_FRAUD_SUSPICION;
    static final int INT_BLOCKED_CONFIRMED = Enum.INT_BLOCKED_CONFIRMED;
    static final int INT_FINISHED_GENERIX_UPDATE = Enum.INT_FINISHED_GENERIX_UPDATE;
    static final int INT_BLOCKED_REPEATED_LITIGATION_SUSPICION_CONFIRMATION = Enum.INT_BLOCKED_REPEATED_LITIGATION_SUSPICION_CONFIRMATION;
    static final int INT_BLOCKED_FRAUD_SUSPICION_CONFIRMATION = Enum.INT_BLOCKED_FRAUD_SUSPICION_CONFIRMATION;
    static final int INT_CEGID_DOWN = Enum.INT_CEGID_DOWN;
    static final int INT_BLOCKED_AUTOMATIC_CDS = Enum.INT_BLOCKED_AUTOMATIC_CDS;
    static final int INT_BEING_CANCELLED = Enum.INT_BEING_CANCELLED;
    static final int INT_BEING_MODIFIED = Enum.INT_BEING_MODIFIED;
    static final int INT_REQUEST_GOING_TO_GNX = Enum.INT_REQUEST_GOING_TO_GNX;
    static final int INT_PARTIAL_IN_GNX = Enum.INT_PARTIAL_IN_GNX;
    static final int INT_BEING_VALIDATED_FIANET = Enum.INT_BEING_VALIDATED_FIANET;
    static final int INT_BLOCKED_MARKETPLACE_SERVICE = Enum.INT_BLOCKED_MARKETPLACE_SERVICE;
    
    /**
     * Enumeration value class for com.cdiscount.www.OrderStateEnum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CANCELLED_BY_CUSTOMER
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
        
        static final int INT_CANCELLED_BY_CUSTOMER = 1;
        static final int INT_WAITING_FOR_SELLER_ACCEPTATION = 2;
        static final int INT_ACCEPTED_BY_SELLER = 3;
        static final int INT_PAYMENT_IN_PROGRESS = 4;
        static final int INT_WAITING_FOR_SHIPMENT_ACCEPTATION = 5;
        static final int INT_SHIPPED = 6;
        static final int INT_REFUSED_BY_SELLER = 7;
        static final int INT_AUTOMATIC_CANCELLATION = 8;
        static final int INT_PAYMENT_REFUSED = 9;
        static final int INT_SHIPMENT_REFUSED_BY_SELLER = 10;
        static final int INT_NONE = 11;
        static final int INT_VALIDATED_FIANET = 12;
        static final int INT_REFUSED_NO_SHIPMENT = 13;
        static final int INT_AVAILABLE_ON_STORE = 14;
        static final int INT_NON_PICKED_UP_BY_CUSTOMER = 15;
        static final int INT_PICKED_UP = 16;
        static final int INT_SERVICE_CANCELED = 17;
        static final int INT_PENDING_SHIPMENT_FOR_ASSOCIATED_PRODUCT = 18;
        static final int INT_BLOCKED_WAITING_FOR_TREATMENT = 19;
        static final int INT_BLOCKED_WAITING_FOR_PROOF = 20;
        static final int INT_BLOCKED_REPEATED_LITIGATION_SUSPICION = 21;
        static final int INT_BLOCKED_FRAUD_SUSPICION = 22;
        static final int INT_BLOCKED_CONFIRMED = 23;
        static final int INT_FINISHED_GENERIX_UPDATE = 24;
        static final int INT_BLOCKED_REPEATED_LITIGATION_SUSPICION_CONFIRMATION = 25;
        static final int INT_BLOCKED_FRAUD_SUSPICION_CONFIRMATION = 26;
        static final int INT_CEGID_DOWN = 27;
        static final int INT_BLOCKED_AUTOMATIC_CDS = 28;
        static final int INT_BEING_CANCELLED = 29;
        static final int INT_BEING_MODIFIED = 30;
        static final int INT_REQUEST_GOING_TO_GNX = 31;
        static final int INT_PARTIAL_IN_GNX = 32;
        static final int INT_BEING_VALIDATED_FIANET = 33;
        static final int INT_BLOCKED_MARKETPLACE_SERVICE = 34;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("CancelledByCustomer", INT_CANCELLED_BY_CUSTOMER),
                new Enum("WaitingForSellerAcceptation", INT_WAITING_FOR_SELLER_ACCEPTATION),
                new Enum("AcceptedBySeller", INT_ACCEPTED_BY_SELLER),
                new Enum("PaymentInProgress", INT_PAYMENT_IN_PROGRESS),
                new Enum("WaitingForShipmentAcceptation", INT_WAITING_FOR_SHIPMENT_ACCEPTATION),
                new Enum("Shipped", INT_SHIPPED),
                new Enum("RefusedBySeller", INT_REFUSED_BY_SELLER),
                new Enum("AutomaticCancellation", INT_AUTOMATIC_CANCELLATION),
                new Enum("PaymentRefused", INT_PAYMENT_REFUSED),
                new Enum("ShipmentRefusedBySeller", INT_SHIPMENT_REFUSED_BY_SELLER),
                new Enum("None", INT_NONE),
                new Enum("ValidatedFianet", INT_VALIDATED_FIANET),
                new Enum("RefusedNoShipment", INT_REFUSED_NO_SHIPMENT),
                new Enum("AvailableOnStore", INT_AVAILABLE_ON_STORE),
                new Enum("NonPickedUpByCustomer", INT_NON_PICKED_UP_BY_CUSTOMER),
                new Enum("PickedUp", INT_PICKED_UP),
                new Enum("ServiceCanceled", INT_SERVICE_CANCELED),
                new Enum("PendingShipmentForAssociatedProduct", INT_PENDING_SHIPMENT_FOR_ASSOCIATED_PRODUCT),
                new Enum("BlockedWaitingForTreatment", INT_BLOCKED_WAITING_FOR_TREATMENT),
                new Enum("BlockedWaitingForProof", INT_BLOCKED_WAITING_FOR_PROOF),
                new Enum("BlockedRepeatedLitigationSuspicion", INT_BLOCKED_REPEATED_LITIGATION_SUSPICION),
                new Enum("BlockedFraudSuspicion", INT_BLOCKED_FRAUD_SUSPICION),
                new Enum("BlockedConfirmed", INT_BLOCKED_CONFIRMED),
                new Enum("FinishedGenerixUpdate", INT_FINISHED_GENERIX_UPDATE),
                new Enum("BlockedRepeatedLitigationSuspicionConfirmation", INT_BLOCKED_REPEATED_LITIGATION_SUSPICION_CONFIRMATION),
                new Enum("BlockedFraudSuspicionConfirmation", INT_BLOCKED_FRAUD_SUSPICION_CONFIRMATION),
                new Enum("CegidDown", INT_CEGID_DOWN),
                new Enum("BlockedAutomaticCds", INT_BLOCKED_AUTOMATIC_CDS),
                new Enum("BeingCancelled", INT_BEING_CANCELLED),
                new Enum("BeingModified", INT_BEING_MODIFIED),
                new Enum("RequestGoingToGnx", INT_REQUEST_GOING_TO_GNX),
                new Enum("PartialInGnx", INT_PARTIAL_IN_GNX),
                new Enum("BeingValidatedFianet", INT_BEING_VALIDATED_FIANET),
                new Enum("BlockedMarketplaceService", INT_BLOCKED_MARKETPLACE_SERVICE),
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
        public static com.cdiscount.www.OrderStateEnum newValue(java.lang.Object obj) {
          return (com.cdiscount.www.OrderStateEnum) type.newValue( obj ); }
        
        public static com.cdiscount.www.OrderStateEnum newInstance() {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OrderStateEnum parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OrderStateEnum parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OrderStateEnum parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OrderStateEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OrderStateEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OrderStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
