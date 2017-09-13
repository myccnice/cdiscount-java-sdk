/*
 * XML Type:  Order
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Order
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML Order(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface Order extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Order.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("order70c9type");
    
    /**
     * Gets the "ArchiveParcelList" element
     */
    boolean getArchiveParcelList();
    
    /**
     * Gets (as xml) the "ArchiveParcelList" element
     */
    org.apache.xmlbeans.XmlBoolean xgetArchiveParcelList();
    
    /**
     * True if has "ArchiveParcelList" element
     */
    boolean isSetArchiveParcelList();
    
    /**
     * Sets the "ArchiveParcelList" element
     */
    void setArchiveParcelList(boolean archiveParcelList);
    
    /**
     * Sets (as xml) the "ArchiveParcelList" element
     */
    void xsetArchiveParcelList(org.apache.xmlbeans.XmlBoolean archiveParcelList);
    
    /**
     * Unsets the "ArchiveParcelList" element
     */
    void unsetArchiveParcelList();
    
    /**
     * Gets the "BillingAddress" element
     */
    com.cdiscount.www.Address getBillingAddress();
    
    /**
     * Tests for nil "BillingAddress" element
     */
    boolean isNilBillingAddress();
    
    /**
     * True if has "BillingAddress" element
     */
    boolean isSetBillingAddress();
    
    /**
     * Sets the "BillingAddress" element
     */
    void setBillingAddress(com.cdiscount.www.Address billingAddress);
    
    /**
     * Appends and returns a new empty "BillingAddress" element
     */
    com.cdiscount.www.Address addNewBillingAddress();
    
    /**
     * Nils the "BillingAddress" element
     */
    void setNilBillingAddress();
    
    /**
     * Unsets the "BillingAddress" element
     */
    void unsetBillingAddress();
    
    /**
     * Gets the "Corporation" element
     */
    com.cdiscount.www.Corporation getCorporation();
    
    /**
     * Tests for nil "Corporation" element
     */
    boolean isNilCorporation();
    
    /**
     * True if has "Corporation" element
     */
    boolean isSetCorporation();
    
    /**
     * Sets the "Corporation" element
     */
    void setCorporation(com.cdiscount.www.Corporation corporation);
    
    /**
     * Appends and returns a new empty "Corporation" element
     */
    com.cdiscount.www.Corporation addNewCorporation();
    
    /**
     * Nils the "Corporation" element
     */
    void setNilCorporation();
    
    /**
     * Unsets the "Corporation" element
     */
    void unsetCorporation();
    
    /**
     * Gets the "CreationDate" element
     */
    java.util.Calendar getCreationDate();
    
    /**
     * Gets (as xml) the "CreationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreationDate();
    
    /**
     * True if has "CreationDate" element
     */
    boolean isSetCreationDate();
    
    /**
     * Sets the "CreationDate" element
     */
    void setCreationDate(java.util.Calendar creationDate);
    
    /**
     * Sets (as xml) the "CreationDate" element
     */
    void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate);
    
    /**
     * Unsets the "CreationDate" element
     */
    void unsetCreationDate();
    
    /**
     * Gets the "Customer" element
     */
    com.cdiscount.www.Customer getCustomer();
    
    /**
     * Tests for nil "Customer" element
     */
    boolean isNilCustomer();
    
    /**
     * True if has "Customer" element
     */
    boolean isSetCustomer();
    
    /**
     * Sets the "Customer" element
     */
    void setCustomer(com.cdiscount.www.Customer customer);
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    com.cdiscount.www.Customer addNewCustomer();
    
    /**
     * Nils the "Customer" element
     */
    void setNilCustomer();
    
    /**
     * Unsets the "Customer" element
     */
    void unsetCustomer();
    
    /**
     * Gets the "HasClaims" element
     */
    boolean getHasClaims();
    
    /**
     * Gets (as xml) the "HasClaims" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasClaims();
    
    /**
     * True if has "HasClaims" element
     */
    boolean isSetHasClaims();
    
    /**
     * Sets the "HasClaims" element
     */
    void setHasClaims(boolean hasClaims);
    
    /**
     * Sets (as xml) the "HasClaims" element
     */
    void xsetHasClaims(org.apache.xmlbeans.XmlBoolean hasClaims);
    
    /**
     * Unsets the "HasClaims" element
     */
    void unsetHasClaims();
    
    /**
     * Gets the "InitialTotalAmount" element
     */
    java.math.BigDecimal getInitialTotalAmount();
    
    /**
     * Gets (as xml) the "InitialTotalAmount" element
     */
    org.apache.xmlbeans.XmlDecimal xgetInitialTotalAmount();
    
    /**
     * True if has "InitialTotalAmount" element
     */
    boolean isSetInitialTotalAmount();
    
    /**
     * Sets the "InitialTotalAmount" element
     */
    void setInitialTotalAmount(java.math.BigDecimal initialTotalAmount);
    
    /**
     * Sets (as xml) the "InitialTotalAmount" element
     */
    void xsetInitialTotalAmount(org.apache.xmlbeans.XmlDecimal initialTotalAmount);
    
    /**
     * Unsets the "InitialTotalAmount" element
     */
    void unsetInitialTotalAmount();
    
    /**
     * Gets the "InitialTotalShippingChargesAmount" element
     */
    java.math.BigDecimal getInitialTotalShippingChargesAmount();
    
    /**
     * Gets (as xml) the "InitialTotalShippingChargesAmount" element
     */
    org.apache.xmlbeans.XmlDecimal xgetInitialTotalShippingChargesAmount();
    
    /**
     * True if has "InitialTotalShippingChargesAmount" element
     */
    boolean isSetInitialTotalShippingChargesAmount();
    
    /**
     * Sets the "InitialTotalShippingChargesAmount" element
     */
    void setInitialTotalShippingChargesAmount(java.math.BigDecimal initialTotalShippingChargesAmount);
    
    /**
     * Sets (as xml) the "InitialTotalShippingChargesAmount" element
     */
    void xsetInitialTotalShippingChargesAmount(org.apache.xmlbeans.XmlDecimal initialTotalShippingChargesAmount);
    
    /**
     * Unsets the "InitialTotalShippingChargesAmount" element
     */
    void unsetInitialTotalShippingChargesAmount();
    
    /**
     * Gets the "IsCLogistiqueOrder" element
     */
    boolean getIsCLogistiqueOrder();
    
    /**
     * Gets (as xml) the "IsCLogistiqueOrder" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCLogistiqueOrder();
    
    /**
     * Sets the "IsCLogistiqueOrder" element
     */
    void setIsCLogistiqueOrder(boolean isCLogistiqueOrder);
    
    /**
     * Sets (as xml) the "IsCLogistiqueOrder" element
     */
    void xsetIsCLogistiqueOrder(org.apache.xmlbeans.XmlBoolean isCLogistiqueOrder);
    
    /**
     * Gets the "LastUpdatedDate" element
     */
    java.util.Calendar getLastUpdatedDate();
    
    /**
     * Gets (as xml) the "LastUpdatedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLastUpdatedDate();
    
    /**
     * Tests for nil "LastUpdatedDate" element
     */
    boolean isNilLastUpdatedDate();
    
    /**
     * True if has "LastUpdatedDate" element
     */
    boolean isSetLastUpdatedDate();
    
    /**
     * Sets the "LastUpdatedDate" element
     */
    void setLastUpdatedDate(java.util.Calendar lastUpdatedDate);
    
    /**
     * Sets (as xml) the "LastUpdatedDate" element
     */
    void xsetLastUpdatedDate(org.apache.xmlbeans.XmlDateTime lastUpdatedDate);
    
    /**
     * Nils the "LastUpdatedDate" element
     */
    void setNilLastUpdatedDate();
    
    /**
     * Unsets the "LastUpdatedDate" element
     */
    void unsetLastUpdatedDate();
    
    /**
     * Gets the "ModGesLog" element
     */
    java.lang.String getModGesLog();
    
    /**
     * Gets (as xml) the "ModGesLog" element
     */
    org.apache.xmlbeans.XmlString xgetModGesLog();
    
    /**
     * Tests for nil "ModGesLog" element
     */
    boolean isNilModGesLog();
    
    /**
     * True if has "ModGesLog" element
     */
    boolean isSetModGesLog();
    
    /**
     * Sets the "ModGesLog" element
     */
    void setModGesLog(java.lang.String modGesLog);
    
    /**
     * Sets (as xml) the "ModGesLog" element
     */
    void xsetModGesLog(org.apache.xmlbeans.XmlString modGesLog);
    
    /**
     * Nils the "ModGesLog" element
     */
    void setNilModGesLog();
    
    /**
     * Unsets the "ModGesLog" element
     */
    void unsetModGesLog();
    
    /**
     * Gets the "ModifiedDate" element
     */
    java.util.Calendar getModifiedDate();
    
    /**
     * Gets (as xml) the "ModifiedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetModifiedDate();
    
    /**
     * Tests for nil "ModifiedDate" element
     */
    boolean isNilModifiedDate();
    
    /**
     * True if has "ModifiedDate" element
     */
    boolean isSetModifiedDate();
    
    /**
     * Sets the "ModifiedDate" element
     */
    void setModifiedDate(java.util.Calendar modifiedDate);
    
    /**
     * Sets (as xml) the "ModifiedDate" element
     */
    void xsetModifiedDate(org.apache.xmlbeans.XmlDateTime modifiedDate);
    
    /**
     * Nils the "ModifiedDate" element
     */
    void setNilModifiedDate();
    
    /**
     * Unsets the "ModifiedDate" element
     */
    void unsetModifiedDate();
    
    /**
     * Gets the "Offer" element
     */
    com.cdiscount.www.OfferOrder getOffer();
    
    /**
     * Tests for nil "Offer" element
     */
    boolean isNilOffer();
    
    /**
     * True if has "Offer" element
     */
    boolean isSetOffer();
    
    /**
     * Sets the "Offer" element
     */
    void setOffer(com.cdiscount.www.OfferOrder offer);
    
    /**
     * Appends and returns a new empty "Offer" element
     */
    com.cdiscount.www.OfferOrder addNewOffer();
    
    /**
     * Nils the "Offer" element
     */
    void setNilOffer();
    
    /**
     * Unsets the "Offer" element
     */
    void unsetOffer();
    
    /**
     * Gets the "OrderLineList" element
     */
    com.cdiscount.www.ArrayOfOrderLine getOrderLineList();
    
    /**
     * Tests for nil "OrderLineList" element
     */
    boolean isNilOrderLineList();
    
    /**
     * True if has "OrderLineList" element
     */
    boolean isSetOrderLineList();
    
    /**
     * Sets the "OrderLineList" element
     */
    void setOrderLineList(com.cdiscount.www.ArrayOfOrderLine orderLineList);
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    com.cdiscount.www.ArrayOfOrderLine addNewOrderLineList();
    
    /**
     * Nils the "OrderLineList" element
     */
    void setNilOrderLineList();
    
    /**
     * Unsets the "OrderLineList" element
     */
    void unsetOrderLineList();
    
    /**
     * Gets the "OrderNumber" element
     */
    java.lang.String getOrderNumber();
    
    /**
     * Gets (as xml) the "OrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOrderNumber();
    
    /**
     * Tests for nil "OrderNumber" element
     */
    boolean isNilOrderNumber();
    
    /**
     * True if has "OrderNumber" element
     */
    boolean isSetOrderNumber();
    
    /**
     * Sets the "OrderNumber" element
     */
    void setOrderNumber(java.lang.String orderNumber);
    
    /**
     * Sets (as xml) the "OrderNumber" element
     */
    void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber);
    
    /**
     * Nils the "OrderNumber" element
     */
    void setNilOrderNumber();
    
    /**
     * Unsets the "OrderNumber" element
     */
    void unsetOrderNumber();
    
    /**
     * Gets the "OrderState" element
     */
    com.cdiscount.www.OrderStateEnum.Enum getOrderState();
    
    /**
     * Gets (as xml) the "OrderState" element
     */
    com.cdiscount.www.OrderStateEnum xgetOrderState();
    
    /**
     * Tests for nil "OrderState" element
     */
    boolean isNilOrderState();
    
    /**
     * True if has "OrderState" element
     */
    boolean isSetOrderState();
    
    /**
     * Sets the "OrderState" element
     */
    void setOrderState(com.cdiscount.www.OrderStateEnum.Enum orderState);
    
    /**
     * Sets (as xml) the "OrderState" element
     */
    void xsetOrderState(com.cdiscount.www.OrderStateEnum orderState);
    
    /**
     * Nils the "OrderState" element
     */
    void setNilOrderState();
    
    /**
     * Unsets the "OrderState" element
     */
    void unsetOrderState();
    
    /**
     * Gets the "ParcelList" element
     */
    com.cdiscount.www.ArrayOfParcel getParcelList();
    
    /**
     * Tests for nil "ParcelList" element
     */
    boolean isNilParcelList();
    
    /**
     * True if has "ParcelList" element
     */
    boolean isSetParcelList();
    
    /**
     * Sets the "ParcelList" element
     */
    void setParcelList(com.cdiscount.www.ArrayOfParcel parcelList);
    
    /**
     * Appends and returns a new empty "ParcelList" element
     */
    com.cdiscount.www.ArrayOfParcel addNewParcelList();
    
    /**
     * Nils the "ParcelList" element
     */
    void setNilParcelList();
    
    /**
     * Unsets the "ParcelList" element
     */
    void unsetParcelList();
    
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
     * Gets the "ShippedTotalAmount" element
     */
    java.math.BigDecimal getShippedTotalAmount();
    
    /**
     * Gets (as xml) the "ShippedTotalAmount" element
     */
    org.apache.xmlbeans.XmlDecimal xgetShippedTotalAmount();
    
    /**
     * True if has "ShippedTotalAmount" element
     */
    boolean isSetShippedTotalAmount();
    
    /**
     * Sets the "ShippedTotalAmount" element
     */
    void setShippedTotalAmount(java.math.BigDecimal shippedTotalAmount);
    
    /**
     * Sets (as xml) the "ShippedTotalAmount" element
     */
    void xsetShippedTotalAmount(org.apache.xmlbeans.XmlDecimal shippedTotalAmount);
    
    /**
     * Unsets the "ShippedTotalAmount" element
     */
    void unsetShippedTotalAmount();
    
    /**
     * Gets the "ShippedTotalShippingCharges" element
     */
    java.math.BigDecimal getShippedTotalShippingCharges();
    
    /**
     * Gets (as xml) the "ShippedTotalShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetShippedTotalShippingCharges();
    
    /**
     * True if has "ShippedTotalShippingCharges" element
     */
    boolean isSetShippedTotalShippingCharges();
    
    /**
     * Sets the "ShippedTotalShippingCharges" element
     */
    void setShippedTotalShippingCharges(java.math.BigDecimal shippedTotalShippingCharges);
    
    /**
     * Sets (as xml) the "ShippedTotalShippingCharges" element
     */
    void xsetShippedTotalShippingCharges(org.apache.xmlbeans.XmlDecimal shippedTotalShippingCharges);
    
    /**
     * Unsets the "ShippedTotalShippingCharges" element
     */
    void unsetShippedTotalShippingCharges();
    
    /**
     * Gets the "ShippingAddress" element
     */
    com.cdiscount.www.Address getShippingAddress();
    
    /**
     * Tests for nil "ShippingAddress" element
     */
    boolean isNilShippingAddress();
    
    /**
     * True if has "ShippingAddress" element
     */
    boolean isSetShippingAddress();
    
    /**
     * Sets the "ShippingAddress" element
     */
    void setShippingAddress(com.cdiscount.www.Address shippingAddress);
    
    /**
     * Appends and returns a new empty "ShippingAddress" element
     */
    com.cdiscount.www.Address addNewShippingAddress();
    
    /**
     * Nils the "ShippingAddress" element
     */
    void setNilShippingAddress();
    
    /**
     * Unsets the "ShippingAddress" element
     */
    void unsetShippingAddress();
    
    /**
     * Gets the "ShippingCode" element
     */
    java.lang.String getShippingCode();
    
    /**
     * Gets (as xml) the "ShippingCode" element
     */
    org.apache.xmlbeans.XmlString xgetShippingCode();
    
    /**
     * Tests for nil "ShippingCode" element
     */
    boolean isNilShippingCode();
    
    /**
     * True if has "ShippingCode" element
     */
    boolean isSetShippingCode();
    
    /**
     * Sets the "ShippingCode" element
     */
    void setShippingCode(java.lang.String shippingCode);
    
    /**
     * Sets (as xml) the "ShippingCode" element
     */
    void xsetShippingCode(org.apache.xmlbeans.XmlString shippingCode);
    
    /**
     * Nils the "ShippingCode" element
     */
    void setNilShippingCode();
    
    /**
     * Unsets the "ShippingCode" element
     */
    void unsetShippingCode();
    
    /**
     * Gets the "ShippingDateMax" element
     */
    java.util.Calendar getShippingDateMax();
    
    /**
     * Gets (as xml) the "ShippingDateMax" element
     */
    org.apache.xmlbeans.XmlDateTime xgetShippingDateMax();
    
    /**
     * Tests for nil "ShippingDateMax" element
     */
    boolean isNilShippingDateMax();
    
    /**
     * True if has "ShippingDateMax" element
     */
    boolean isSetShippingDateMax();
    
    /**
     * Sets the "ShippingDateMax" element
     */
    void setShippingDateMax(java.util.Calendar shippingDateMax);
    
    /**
     * Sets (as xml) the "ShippingDateMax" element
     */
    void xsetShippingDateMax(org.apache.xmlbeans.XmlDateTime shippingDateMax);
    
    /**
     * Nils the "ShippingDateMax" element
     */
    void setNilShippingDateMax();
    
    /**
     * Unsets the "ShippingDateMax" element
     */
    void unsetShippingDateMax();
    
    /**
     * Gets the "ShippingDateMin" element
     */
    java.util.Calendar getShippingDateMin();
    
    /**
     * Gets (as xml) the "ShippingDateMin" element
     */
    org.apache.xmlbeans.XmlDateTime xgetShippingDateMin();
    
    /**
     * Tests for nil "ShippingDateMin" element
     */
    boolean isNilShippingDateMin();
    
    /**
     * True if has "ShippingDateMin" element
     */
    boolean isSetShippingDateMin();
    
    /**
     * Sets the "ShippingDateMin" element
     */
    void setShippingDateMin(java.util.Calendar shippingDateMin);
    
    /**
     * Sets (as xml) the "ShippingDateMin" element
     */
    void xsetShippingDateMin(org.apache.xmlbeans.XmlDateTime shippingDateMin);
    
    /**
     * Nils the "ShippingDateMin" element
     */
    void setNilShippingDateMin();
    
    /**
     * Unsets the "ShippingDateMin" element
     */
    void unsetShippingDateMin();
    
    /**
     * Gets the "SiteCommissionPromisedAmount" element
     */
    java.math.BigDecimal getSiteCommissionPromisedAmount();
    
    /**
     * Gets (as xml) the "SiteCommissionPromisedAmount" element
     */
    org.apache.xmlbeans.XmlDecimal xgetSiteCommissionPromisedAmount();
    
    /**
     * True if has "SiteCommissionPromisedAmount" element
     */
    boolean isSetSiteCommissionPromisedAmount();
    
    /**
     * Sets the "SiteCommissionPromisedAmount" element
     */
    void setSiteCommissionPromisedAmount(java.math.BigDecimal siteCommissionPromisedAmount);
    
    /**
     * Sets (as xml) the "SiteCommissionPromisedAmount" element
     */
    void xsetSiteCommissionPromisedAmount(org.apache.xmlbeans.XmlDecimal siteCommissionPromisedAmount);
    
    /**
     * Unsets the "SiteCommissionPromisedAmount" element
     */
    void unsetSiteCommissionPromisedAmount();
    
    /**
     * Gets the "SiteCommissionShippedAmount" element
     */
    java.math.BigDecimal getSiteCommissionShippedAmount();
    
    /**
     * Gets (as xml) the "SiteCommissionShippedAmount" element
     */
    org.apache.xmlbeans.XmlDecimal xgetSiteCommissionShippedAmount();
    
    /**
     * True if has "SiteCommissionShippedAmount" element
     */
    boolean isSetSiteCommissionShippedAmount();
    
    /**
     * Sets the "SiteCommissionShippedAmount" element
     */
    void setSiteCommissionShippedAmount(java.math.BigDecimal siteCommissionShippedAmount);
    
    /**
     * Sets (as xml) the "SiteCommissionShippedAmount" element
     */
    void xsetSiteCommissionShippedAmount(org.apache.xmlbeans.XmlDecimal siteCommissionShippedAmount);
    
    /**
     * Unsets the "SiteCommissionShippedAmount" element
     */
    void unsetSiteCommissionShippedAmount();
    
    /**
     * Gets the "SiteCommissionValidatedAmount" element
     */
    java.math.BigDecimal getSiteCommissionValidatedAmount();
    
    /**
     * Gets (as xml) the "SiteCommissionValidatedAmount" element
     */
    org.apache.xmlbeans.XmlDecimal xgetSiteCommissionValidatedAmount();
    
    /**
     * True if has "SiteCommissionValidatedAmount" element
     */
    boolean isSetSiteCommissionValidatedAmount();
    
    /**
     * Sets the "SiteCommissionValidatedAmount" element
     */
    void setSiteCommissionValidatedAmount(java.math.BigDecimal siteCommissionValidatedAmount);
    
    /**
     * Sets (as xml) the "SiteCommissionValidatedAmount" element
     */
    void xsetSiteCommissionValidatedAmount(org.apache.xmlbeans.XmlDecimal siteCommissionValidatedAmount);
    
    /**
     * Unsets the "SiteCommissionValidatedAmount" element
     */
    void unsetSiteCommissionValidatedAmount();
    
    /**
     * Gets the "Status" element
     */
    com.cdiscount.www.OrderStatusType.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    com.cdiscount.www.OrderStatusType xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(com.cdiscount.www.OrderStatusType.Enum status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(com.cdiscount.www.OrderStatusType status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "ValidatedTotalAmount" element
     */
    java.math.BigDecimal getValidatedTotalAmount();
    
    /**
     * Gets (as xml) the "ValidatedTotalAmount" element
     */
    org.apache.xmlbeans.XmlDecimal xgetValidatedTotalAmount();
    
    /**
     * True if has "ValidatedTotalAmount" element
     */
    boolean isSetValidatedTotalAmount();
    
    /**
     * Sets the "ValidatedTotalAmount" element
     */
    void setValidatedTotalAmount(java.math.BigDecimal validatedTotalAmount);
    
    /**
     * Sets (as xml) the "ValidatedTotalAmount" element
     */
    void xsetValidatedTotalAmount(org.apache.xmlbeans.XmlDecimal validatedTotalAmount);
    
    /**
     * Unsets the "ValidatedTotalAmount" element
     */
    void unsetValidatedTotalAmount();
    
    /**
     * Gets the "ValidatedTotalShippingCharges" element
     */
    java.math.BigDecimal getValidatedTotalShippingCharges();
    
    /**
     * Gets (as xml) the "ValidatedTotalShippingCharges" element
     */
    org.apache.xmlbeans.XmlDecimal xgetValidatedTotalShippingCharges();
    
    /**
     * True if has "ValidatedTotalShippingCharges" element
     */
    boolean isSetValidatedTotalShippingCharges();
    
    /**
     * Sets the "ValidatedTotalShippingCharges" element
     */
    void setValidatedTotalShippingCharges(java.math.BigDecimal validatedTotalShippingCharges);
    
    /**
     * Sets (as xml) the "ValidatedTotalShippingCharges" element
     */
    void xsetValidatedTotalShippingCharges(org.apache.xmlbeans.XmlDecimal validatedTotalShippingCharges);
    
    /**
     * Unsets the "ValidatedTotalShippingCharges" element
     */
    void unsetValidatedTotalShippingCharges();
    
    /**
     * Gets the "ValidationStatus" element
     */
    com.cdiscount.www.ValidationStatusType.Enum getValidationStatus();
    
    /**
     * Gets (as xml) the "ValidationStatus" element
     */
    com.cdiscount.www.ValidationStatusType xgetValidationStatus();
    
    /**
     * True if has "ValidationStatus" element
     */
    boolean isSetValidationStatus();
    
    /**
     * Sets the "ValidationStatus" element
     */
    void setValidationStatus(com.cdiscount.www.ValidationStatusType.Enum validationStatus);
    
    /**
     * Sets (as xml) the "ValidationStatus" element
     */
    void xsetValidationStatus(com.cdiscount.www.ValidationStatusType validationStatus);
    
    /**
     * Unsets the "ValidationStatus" element
     */
    void unsetValidationStatus();
    
    /**
     * Gets the "VisaCegid" element
     */
    int getVisaCegid();
    
    /**
     * Gets (as xml) the "VisaCegid" element
     */
    org.apache.xmlbeans.XmlInt xgetVisaCegid();
    
    /**
     * Tests for nil "VisaCegid" element
     */
    boolean isNilVisaCegid();
    
    /**
     * True if has "VisaCegid" element
     */
    boolean isSetVisaCegid();
    
    /**
     * Sets the "VisaCegid" element
     */
    void setVisaCegid(int visaCegid);
    
    /**
     * Sets (as xml) the "VisaCegid" element
     */
    void xsetVisaCegid(org.apache.xmlbeans.XmlInt visaCegid);
    
    /**
     * Nils the "VisaCegid" element
     */
    void setNilVisaCegid();
    
    /**
     * Unsets the "VisaCegid" element
     */
    void unsetVisaCegid();
    
    /**
     * Gets the "VoucherList" element
     */
    com.cdiscount.www.ArrayOfVoucher getVoucherList();
    
    /**
     * Tests for nil "VoucherList" element
     */
    boolean isNilVoucherList();
    
    /**
     * True if has "VoucherList" element
     */
    boolean isSetVoucherList();
    
    /**
     * Sets the "VoucherList" element
     */
    void setVoucherList(com.cdiscount.www.ArrayOfVoucher voucherList);
    
    /**
     * Appends and returns a new empty "VoucherList" element
     */
    com.cdiscount.www.ArrayOfVoucher addNewVoucherList();
    
    /**
     * Nils the "VoucherList" element
     */
    void setNilVoucherList();
    
    /**
     * Unsets the "VoucherList" element
     */
    void unsetVoucherList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.Order newInstance() {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.Order newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.Order parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.Order parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.Order parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.Order parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.Order parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.Order parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.Order parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.Order parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.Order parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.Order parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.Order parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.Order parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.Order parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.Order parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Order parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.Order parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
