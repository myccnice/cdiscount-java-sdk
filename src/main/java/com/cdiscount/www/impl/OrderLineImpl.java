/*
 * XML Type:  OrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderLine
{
    private static final long serialVersionUID = 1L;
    
    public OrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCEPTATIONSTATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "AcceptationState");
    private static final javax.xml.namespace.QName CATEGORYCODE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CategoryCode");
    private static final javax.xml.namespace.QName DELIVERYDATEMAX$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DeliveryDateMax");
    private static final javax.xml.namespace.QName DELIVERYDATEMIN$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DeliveryDateMin");
    private static final javax.xml.namespace.QName HASCLAIM$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "HasClaim");
    private static final javax.xml.namespace.QName INITIALPRICE$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "InitialPrice");
    private static final javax.xml.namespace.QName ISCDAV$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsCDAV");
    private static final javax.xml.namespace.QName ISNEGOTIATED$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsNegotiated");
    private static final javax.xml.namespace.QName ISPRODUCTEANGENERATED$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsProductEanGenerated");
    private static final javax.xml.namespace.QName NAME$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Name");
    private static final javax.xml.namespace.QName ORDERLINECHILDLIST$20 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderLineChildList");
    private static final javax.xml.namespace.QName PRODUCTCONDITION$22 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductCondition");
    private static final javax.xml.namespace.QName PRODUCTEAN$24 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName PRODUCTID$26 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductId");
    private static final javax.xml.namespace.QName PURCHASEPRICE$28 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PurchasePrice");
    private static final javax.xml.namespace.QName QUANTITY$30 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Quantity");
    private static final javax.xml.namespace.QName REFUNDSHIPPINGCHARGES$32 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundShippingCharges");
    private static final javax.xml.namespace.QName ROWID$34 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RowId");
    private static final javax.xml.namespace.QName SELLERPRODUCTID$36 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductId");
    private static final javax.xml.namespace.QName SHIPPINGDATEMAX$38 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingDateMax");
    private static final javax.xml.namespace.QName SHIPPINGDATEMIN$40 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingDateMin");
    private static final javax.xml.namespace.QName SKU$42 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Sku");
    private static final javax.xml.namespace.QName SKUPARENT$44 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SkuParent");
    private static final javax.xml.namespace.QName UNITADDITIONALSHIPPINGCHARGES$46 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "UnitAdditionalShippingCharges");
    private static final javax.xml.namespace.QName UNITSHIPPINGCHARGES$48 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "UnitShippingCharges");
    
    
    /**
     * Gets the "AcceptationState" element
     */
    public com.cdiscount.www.AcceptationStateEnum.Enum getAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.AcceptationStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AcceptationState" element
     */
    public com.cdiscount.www.AcceptationStateEnum xgetAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AcceptationState" element
     */
    public boolean isNilAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AcceptationState" element
     */
    public boolean isSetAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCEPTATIONSTATE$0) != 0;
        }
    }
    
    /**
     * Sets the "AcceptationState" element
     */
    public void setAcceptationState(com.cdiscount.www.AcceptationStateEnum.Enum acceptationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCEPTATIONSTATE$0);
            }
            target.setEnumValue(acceptationState);
        }
    }
    
    /**
     * Sets (as xml) the "AcceptationState" element
     */
    public void xsetAcceptationState(com.cdiscount.www.AcceptationStateEnum acceptationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AcceptationStateEnum)get_store().add_element_user(ACCEPTATIONSTATE$0);
            }
            target.set(acceptationState);
        }
    }
    
    /**
     * Nils the "AcceptationState" element
     */
    public void setNilAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AcceptationStateEnum)get_store().add_element_user(ACCEPTATIONSTATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AcceptationState" element
     */
    public void unsetAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCEPTATIONSTATE$0, 0);
        }
    }
    
    /**
     * Gets the "CategoryCode" element
     */
    public java.lang.String getCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CategoryCode" element
     */
    public boolean isNilCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CategoryCode" element
     */
    public boolean isSetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "CategoryCode" element
     */
    public void setCategoryCode(java.lang.String categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYCODE$2);
            }
            target.setStringValue(categoryCode);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryCode" element
     */
    public void xsetCategoryCode(org.apache.xmlbeans.XmlString categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYCODE$2);
            }
            target.set(categoryCode);
        }
    }
    
    /**
     * Nils the "CategoryCode" element
     */
    public void setNilCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYCODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CategoryCode" element
     */
    public void unsetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYCODE$2, 0);
        }
    }
    
    /**
     * Gets the "DeliveryDateMax" element
     */
    public java.util.Calendar getDeliveryDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATEMAX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryDateMax" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDeliveryDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELIVERYDATEMAX$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryDateMax" element
     */
    public boolean isSetDeliveryDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYDATEMAX$4) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryDateMax" element
     */
    public void setDeliveryDateMax(java.util.Calendar deliveryDateMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATEMAX$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYDATEMAX$4);
            }
            target.setCalendarValue(deliveryDateMax);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryDateMax" element
     */
    public void xsetDeliveryDateMax(org.apache.xmlbeans.XmlDateTime deliveryDateMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELIVERYDATEMAX$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DELIVERYDATEMAX$4);
            }
            target.set(deliveryDateMax);
        }
    }
    
    /**
     * Unsets the "DeliveryDateMax" element
     */
    public void unsetDeliveryDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYDATEMAX$4, 0);
        }
    }
    
    /**
     * Gets the "DeliveryDateMin" element
     */
    public java.util.Calendar getDeliveryDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATEMIN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryDateMin" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDeliveryDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELIVERYDATEMIN$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryDateMin" element
     */
    public boolean isSetDeliveryDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYDATEMIN$6) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryDateMin" element
     */
    public void setDeliveryDateMin(java.util.Calendar deliveryDateMin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATEMIN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYDATEMIN$6);
            }
            target.setCalendarValue(deliveryDateMin);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryDateMin" element
     */
    public void xsetDeliveryDateMin(org.apache.xmlbeans.XmlDateTime deliveryDateMin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELIVERYDATEMIN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DELIVERYDATEMIN$6);
            }
            target.set(deliveryDateMin);
        }
    }
    
    /**
     * Unsets the "DeliveryDateMin" element
     */
    public void unsetDeliveryDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYDATEMIN$6, 0);
        }
    }
    
    /**
     * Gets the "HasClaim" element
     */
    public boolean getHasClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCLAIM$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasClaim" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCLAIM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "HasClaim" element
     */
    public boolean isSetHasClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASCLAIM$8) != 0;
        }
    }
    
    /**
     * Sets the "HasClaim" element
     */
    public void setHasClaim(boolean hasClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCLAIM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASCLAIM$8);
            }
            target.setBooleanValue(hasClaim);
        }
    }
    
    /**
     * Sets (as xml) the "HasClaim" element
     */
    public void xsetHasClaim(org.apache.xmlbeans.XmlBoolean hasClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCLAIM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASCLAIM$8);
            }
            target.set(hasClaim);
        }
    }
    
    /**
     * Unsets the "HasClaim" element
     */
    public void unsetHasClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASCLAIM$8, 0);
        }
    }
    
    /**
     * Gets the "InitialPrice" element
     */
    public java.math.BigDecimal getInitialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALPRICE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "InitialPrice" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetInitialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALPRICE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "InitialPrice" element
     */
    public boolean isNilInitialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALPRICE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "InitialPrice" element
     */
    public boolean isSetInitialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITIALPRICE$10) != 0;
        }
    }
    
    /**
     * Sets the "InitialPrice" element
     */
    public void setInitialPrice(java.math.BigDecimal initialPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALPRICE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALPRICE$10);
            }
            target.setBigDecimalValue(initialPrice);
        }
    }
    
    /**
     * Sets (as xml) the "InitialPrice" element
     */
    public void xsetInitialPrice(org.apache.xmlbeans.XmlDecimal initialPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALPRICE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(INITIALPRICE$10);
            }
            target.set(initialPrice);
        }
    }
    
    /**
     * Nils the "InitialPrice" element
     */
    public void setNilInitialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALPRICE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(INITIALPRICE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "InitialPrice" element
     */
    public void unsetInitialPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITIALPRICE$10, 0);
        }
    }
    
    /**
     * Gets the "IsCDAV" element
     */
    public boolean getIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCDAV$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCDAV" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCDAV$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsCDAV" element
     */
    public boolean isSetIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCDAV$12) != 0;
        }
    }
    
    /**
     * Sets the "IsCDAV" element
     */
    public void setIsCDAV(boolean isCDAV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCDAV$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCDAV$12);
            }
            target.setBooleanValue(isCDAV);
        }
    }
    
    /**
     * Sets (as xml) the "IsCDAV" element
     */
    public void xsetIsCDAV(org.apache.xmlbeans.XmlBoolean isCDAV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCDAV$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCDAV$12);
            }
            target.set(isCDAV);
        }
    }
    
    /**
     * Unsets the "IsCDAV" element
     */
    public void unsetIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCDAV$12, 0);
        }
    }
    
    /**
     * Gets the "IsNegotiated" element
     */
    public boolean getIsNegotiated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNEGOTIATED$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsNegotiated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNegotiated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNEGOTIATED$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsNegotiated" element
     */
    public boolean isNilIsNegotiated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNEGOTIATED$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsNegotiated" element
     */
    public boolean isSetIsNegotiated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISNEGOTIATED$14) != 0;
        }
    }
    
    /**
     * Sets the "IsNegotiated" element
     */
    public void setIsNegotiated(boolean isNegotiated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNEGOTIATED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISNEGOTIATED$14);
            }
            target.setBooleanValue(isNegotiated);
        }
    }
    
    /**
     * Sets (as xml) the "IsNegotiated" element
     */
    public void xsetIsNegotiated(org.apache.xmlbeans.XmlBoolean isNegotiated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNEGOTIATED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISNEGOTIATED$14);
            }
            target.set(isNegotiated);
        }
    }
    
    /**
     * Nils the "IsNegotiated" element
     */
    public void setNilIsNegotiated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISNEGOTIATED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISNEGOTIATED$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsNegotiated" element
     */
    public void unsetIsNegotiated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISNEGOTIATED$14, 0);
        }
    }
    
    /**
     * Gets the "IsProductEanGenerated" element
     */
    public boolean getIsProductEanGenerated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRODUCTEANGENERATED$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsProductEanGenerated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsProductEanGenerated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRODUCTEANGENERATED$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsProductEanGenerated" element
     */
    public boolean isSetIsProductEanGenerated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRODUCTEANGENERATED$16) != 0;
        }
    }
    
    /**
     * Sets the "IsProductEanGenerated" element
     */
    public void setIsProductEanGenerated(boolean isProductEanGenerated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRODUCTEANGENERATED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRODUCTEANGENERATED$16);
            }
            target.setBooleanValue(isProductEanGenerated);
        }
    }
    
    /**
     * Sets (as xml) the "IsProductEanGenerated" element
     */
    public void xsetIsProductEanGenerated(org.apache.xmlbeans.XmlBoolean isProductEanGenerated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRODUCTEANGENERATED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRODUCTEANGENERATED$16);
            }
            target.set(isProductEanGenerated);
        }
    }
    
    /**
     * Unsets the "IsProductEanGenerated" element
     */
    public void unsetIsProductEanGenerated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRODUCTEANGENERATED$16, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$18) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$18);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$18);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "Name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$18, 0);
        }
    }
    
    /**
     * Gets the "OrderLineChildList" element
     */
    public com.cdiscount.www.ArrayOfOrderLine getOrderLineChildList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ORDERLINECHILDLIST$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderLineChildList" element
     */
    public boolean isNilOrderLineChildList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ORDERLINECHILDLIST$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderLineChildList" element
     */
    public boolean isSetOrderLineChildList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERLINECHILDLIST$20) != 0;
        }
    }
    
    /**
     * Sets the "OrderLineChildList" element
     */
    public void setOrderLineChildList(com.cdiscount.www.ArrayOfOrderLine orderLineChildList)
    {
        generatedSetterHelperImpl(orderLineChildList, ORDERLINECHILDLIST$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderLineChildList" element
     */
    public com.cdiscount.www.ArrayOfOrderLine addNewOrderLineChildList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().add_element_user(ORDERLINECHILDLIST$20);
            return target;
        }
    }
    
    /**
     * Nils the "OrderLineChildList" element
     */
    public void setNilOrderLineChildList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ORDERLINECHILDLIST$20, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderLine)get_store().add_element_user(ORDERLINECHILDLIST$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderLineChildList" element
     */
    public void unsetOrderLineChildList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERLINECHILDLIST$20, 0);
        }
    }
    
    /**
     * Gets the "ProductCondition" element
     */
    public com.cdiscount.www.ProductConditionEnum.Enum getProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$22, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductConditionEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCondition" element
     */
    public com.cdiscount.www.ProductConditionEnum xgetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductCondition" element
     */
    public boolean isNilProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductCondition" element
     */
    public boolean isSetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCONDITION$22) != 0;
        }
    }
    
    /**
     * Sets the "ProductCondition" element
     */
    public void setProductCondition(com.cdiscount.www.ProductConditionEnum.Enum productCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCONDITION$22);
            }
            target.setEnumValue(productCondition);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCondition" element
     */
    public void xsetProductCondition(com.cdiscount.www.ProductConditionEnum productCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$22, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductConditionEnum)get_store().add_element_user(PRODUCTCONDITION$22);
            }
            target.set(productCondition);
        }
    }
    
    /**
     * Nils the "ProductCondition" element
     */
    public void setNilProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$22, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductConditionEnum)get_store().add_element_user(PRODUCTCONDITION$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductCondition" element
     */
    public void unsetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCONDITION$22, 0);
        }
    }
    
    /**
     * Gets the "ProductEan" element
     */
    public java.lang.String getProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductEan" element
     */
    public org.apache.xmlbeans.XmlString xgetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductEan" element
     */
    public boolean isNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductEan" element
     */
    public boolean isSetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTEAN$24) != 0;
        }
    }
    
    /**
     * Sets the "ProductEan" element
     */
    public void setProductEan(java.lang.String productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTEAN$24);
            }
            target.setStringValue(productEan);
        }
    }
    
    /**
     * Sets (as xml) the "ProductEan" element
     */
    public void xsetProductEan(org.apache.xmlbeans.XmlString productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$24);
            }
            target.set(productEan);
        }
    }
    
    /**
     * Nils the "ProductEan" element
     */
    public void setNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductEan" element
     */
    public void unsetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTEAN$24, 0);
        }
    }
    
    /**
     * Gets the "ProductId" element
     */
    public java.lang.String getProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductId" element
     */
    public boolean isNilProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductId" element
     */
    public boolean isSetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$26) != 0;
        }
    }
    
    /**
     * Sets the "ProductId" element
     */
    public void setProductId(java.lang.String productId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$26);
            }
            target.setStringValue(productId);
        }
    }
    
    /**
     * Sets (as xml) the "ProductId" element
     */
    public void xsetProductId(org.apache.xmlbeans.XmlString productId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTID$26);
            }
            target.set(productId);
        }
    }
    
    /**
     * Nils the "ProductId" element
     */
    public void setNilProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTID$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductId" element
     */
    public void unsetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$26, 0);
        }
    }
    
    /**
     * Gets the "PurchasePrice" element
     */
    public java.math.BigDecimal getPurchasePrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEPRICE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PurchasePrice" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPurchasePrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURCHASEPRICE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "PurchasePrice" element
     */
    public boolean isSetPurchasePrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURCHASEPRICE$28) != 0;
        }
    }
    
    /**
     * Sets the "PurchasePrice" element
     */
    public void setPurchasePrice(java.math.BigDecimal purchasePrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEPRICE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURCHASEPRICE$28);
            }
            target.setBigDecimalValue(purchasePrice);
        }
    }
    
    /**
     * Sets (as xml) the "PurchasePrice" element
     */
    public void xsetPurchasePrice(org.apache.xmlbeans.XmlDecimal purchasePrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURCHASEPRICE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PURCHASEPRICE$28);
            }
            target.set(purchasePrice);
        }
    }
    
    /**
     * Unsets the "PurchasePrice" element
     */
    public void unsetPurchasePrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURCHASEPRICE$28, 0);
        }
    }
    
    /**
     * Gets the "Quantity" element
     */
    public int getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$30, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quantity" element
     */
    public org.apache.xmlbeans.XmlInt xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "Quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$30) != 0;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(int quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$30);
            }
            target.setIntValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "Quantity" element
     */
    public void xsetQuantity(org.apache.xmlbeans.XmlInt quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANTITY$30);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Unsets the "Quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$30, 0);
        }
    }
    
    /**
     * Gets the "RefundShippingCharges" element
     */
    public boolean getRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNDSHIPPINGCHARGES$32, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefundShippingCharges" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$32, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RefundShippingCharges" element
     */
    public boolean isNilRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RefundShippingCharges" element
     */
    public boolean isSetRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFUNDSHIPPINGCHARGES$32) != 0;
        }
    }
    
    /**
     * Sets the "RefundShippingCharges" element
     */
    public void setRefundShippingCharges(boolean refundShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNDSHIPPINGCHARGES$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFUNDSHIPPINGCHARGES$32);
            }
            target.setBooleanValue(refundShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "RefundShippingCharges" element
     */
    public void xsetRefundShippingCharges(org.apache.xmlbeans.XmlBoolean refundShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REFUNDSHIPPINGCHARGES$32);
            }
            target.set(refundShippingCharges);
        }
    }
    
    /**
     * Nils the "RefundShippingCharges" element
     */
    public void setNilRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REFUNDSHIPPINGCHARGES$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RefundShippingCharges" element
     */
    public void unsetRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFUNDSHIPPINGCHARGES$32, 0);
        }
    }
    
    /**
     * Gets the "RowId" element
     */
    public int getRowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWID$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RowId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROWID$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "RowId" element
     */
    public boolean isSetRowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWID$34) != 0;
        }
    }
    
    /**
     * Sets the "RowId" element
     */
    public void setRowId(int rowId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWID$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWID$34);
            }
            target.setIntValue(rowId);
        }
    }
    
    /**
     * Sets (as xml) the "RowId" element
     */
    public void xsetRowId(org.apache.xmlbeans.XmlInt rowId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROWID$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ROWID$34);
            }
            target.set(rowId);
        }
    }
    
    /**
     * Unsets the "RowId" element
     */
    public void unsetRowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWID$34, 0);
        }
    }
    
    /**
     * Gets the "SellerProductId" element
     */
    public java.lang.String getSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$36, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerProductId" element
     */
    public boolean isNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerProductId" element
     */
    public boolean isSetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERPRODUCTID$36) != 0;
        }
    }
    
    /**
     * Sets the "SellerProductId" element
     */
    public void setSellerProductId(java.lang.String sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTID$36);
            }
            target.setStringValue(sellerProductId);
        }
    }
    
    /**
     * Sets (as xml) the "SellerProductId" element
     */
    public void xsetSellerProductId(org.apache.xmlbeans.XmlString sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$36);
            }
            target.set(sellerProductId);
        }
    }
    
    /**
     * Nils the "SellerProductId" element
     */
    public void setNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerProductId" element
     */
    public void unsetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERPRODUCTID$36, 0);
        }
    }
    
    /**
     * Gets the "ShippingDateMax" element
     */
    public java.util.Calendar getShippingDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMAX$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingDateMax" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetShippingDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMAX$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "ShippingDateMax" element
     */
    public boolean isSetShippingDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGDATEMAX$38) != 0;
        }
    }
    
    /**
     * Sets the "ShippingDateMax" element
     */
    public void setShippingDateMax(java.util.Calendar shippingDateMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMAX$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGDATEMAX$38);
            }
            target.setCalendarValue(shippingDateMax);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingDateMax" element
     */
    public void xsetShippingDateMax(org.apache.xmlbeans.XmlDateTime shippingDateMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMAX$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SHIPPINGDATEMAX$38);
            }
            target.set(shippingDateMax);
        }
    }
    
    /**
     * Unsets the "ShippingDateMax" element
     */
    public void unsetShippingDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGDATEMAX$38, 0);
        }
    }
    
    /**
     * Gets the "ShippingDateMin" element
     */
    public java.util.Calendar getShippingDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMIN$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingDateMin" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetShippingDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMIN$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "ShippingDateMin" element
     */
    public boolean isSetShippingDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGDATEMIN$40) != 0;
        }
    }
    
    /**
     * Sets the "ShippingDateMin" element
     */
    public void setShippingDateMin(java.util.Calendar shippingDateMin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMIN$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGDATEMIN$40);
            }
            target.setCalendarValue(shippingDateMin);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingDateMin" element
     */
    public void xsetShippingDateMin(org.apache.xmlbeans.XmlDateTime shippingDateMin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMIN$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SHIPPINGDATEMIN$40);
            }
            target.set(shippingDateMin);
        }
    }
    
    /**
     * Unsets the "ShippingDateMin" element
     */
    public void unsetShippingDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGDATEMIN$40, 0);
        }
    }
    
    /**
     * Gets the "Sku" element
     */
    public java.lang.String getSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sku" element
     */
    public org.apache.xmlbeans.XmlString xgetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$42, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Sku" element
     */
    public boolean isNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$42, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Sku" element
     */
    public boolean isSetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKU$42) != 0;
        }
    }
    
    /**
     * Sets the "Sku" element
     */
    public void setSku(java.lang.String sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKU$42);
            }
            target.setStringValue(sku);
        }
    }
    
    /**
     * Sets (as xml) the "Sku" element
     */
    public void xsetSku(org.apache.xmlbeans.XmlString sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$42);
            }
            target.set(sku);
        }
    }
    
    /**
     * Nils the "Sku" element
     */
    public void setNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$42);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Sku" element
     */
    public void unsetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKU$42, 0);
        }
    }
    
    /**
     * Gets the "SkuParent" element
     */
    public java.lang.String getSkuParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKUPARENT$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SkuParent" element
     */
    public org.apache.xmlbeans.XmlString xgetSkuParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKUPARENT$44, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SkuParent" element
     */
    public boolean isNilSkuParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKUPARENT$44, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SkuParent" element
     */
    public boolean isSetSkuParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKUPARENT$44) != 0;
        }
    }
    
    /**
     * Sets the "SkuParent" element
     */
    public void setSkuParent(java.lang.String skuParent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKUPARENT$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKUPARENT$44);
            }
            target.setStringValue(skuParent);
        }
    }
    
    /**
     * Sets (as xml) the "SkuParent" element
     */
    public void xsetSkuParent(org.apache.xmlbeans.XmlString skuParent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKUPARENT$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKUPARENT$44);
            }
            target.set(skuParent);
        }
    }
    
    /**
     * Nils the "SkuParent" element
     */
    public void setNilSkuParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKUPARENT$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKUPARENT$44);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SkuParent" element
     */
    public void unsetSkuParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKUPARENT$44, 0);
        }
    }
    
    /**
     * Gets the "UnitAdditionalShippingCharges" element
     */
    public java.math.BigDecimal getUnitAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITADDITIONALSHIPPINGCHARGES$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitAdditionalShippingCharges" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetUnitAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITADDITIONALSHIPPINGCHARGES$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnitAdditionalShippingCharges" element
     */
    public boolean isSetUnitAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITADDITIONALSHIPPINGCHARGES$46) != 0;
        }
    }
    
    /**
     * Sets the "UnitAdditionalShippingCharges" element
     */
    public void setUnitAdditionalShippingCharges(java.math.BigDecimal unitAdditionalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITADDITIONALSHIPPINGCHARGES$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITADDITIONALSHIPPINGCHARGES$46);
            }
            target.setBigDecimalValue(unitAdditionalShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "UnitAdditionalShippingCharges" element
     */
    public void xsetUnitAdditionalShippingCharges(org.apache.xmlbeans.XmlDecimal unitAdditionalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITADDITIONALSHIPPINGCHARGES$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UNITADDITIONALSHIPPINGCHARGES$46);
            }
            target.set(unitAdditionalShippingCharges);
        }
    }
    
    /**
     * Unsets the "UnitAdditionalShippingCharges" element
     */
    public void unsetUnitAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITADDITIONALSHIPPINGCHARGES$46, 0);
        }
    }
    
    /**
     * Gets the "UnitShippingCharges" element
     */
    public java.math.BigDecimal getUnitShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITSHIPPINGCHARGES$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitShippingCharges" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetUnitShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITSHIPPINGCHARGES$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnitShippingCharges" element
     */
    public boolean isSetUnitShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITSHIPPINGCHARGES$48) != 0;
        }
    }
    
    /**
     * Sets the "UnitShippingCharges" element
     */
    public void setUnitShippingCharges(java.math.BigDecimal unitShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITSHIPPINGCHARGES$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITSHIPPINGCHARGES$48);
            }
            target.setBigDecimalValue(unitShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "UnitShippingCharges" element
     */
    public void xsetUnitShippingCharges(org.apache.xmlbeans.XmlDecimal unitShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITSHIPPINGCHARGES$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UNITSHIPPINGCHARGES$48);
            }
            target.set(unitShippingCharges);
        }
    }
    
    /**
     * Unsets the "UnitShippingCharges" element
     */
    public void unsetUnitShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITSHIPPINGCHARGES$48, 0);
        }
    }
}
