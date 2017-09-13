/*
 * XML Type:  Order
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Order
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Order(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Order
{
    private static final long serialVersionUID = 1L;
    
    public OrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVEPARCELLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArchiveParcelList");
    private static final javax.xml.namespace.QName BILLINGADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BillingAddress");
    private static final javax.xml.namespace.QName CORPORATION$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Corporation");
    private static final javax.xml.namespace.QName CREATIONDATE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreationDate");
    private static final javax.xml.namespace.QName CUSTOMER$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Customer");
    private static final javax.xml.namespace.QName HASCLAIMS$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "HasClaims");
    private static final javax.xml.namespace.QName INITIALTOTALAMOUNT$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "InitialTotalAmount");
    private static final javax.xml.namespace.QName INITIALTOTALSHIPPINGCHARGESAMOUNT$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "InitialTotalShippingChargesAmount");
    private static final javax.xml.namespace.QName ISCLOGISTIQUEORDER$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsCLogistiqueOrder");
    private static final javax.xml.namespace.QName LASTUPDATEDDATE$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LastUpdatedDate");
    private static final javax.xml.namespace.QName MODGESLOG$20 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ModGesLog");
    private static final javax.xml.namespace.QName MODIFIEDDATE$22 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ModifiedDate");
    private static final javax.xml.namespace.QName OFFER$24 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Offer");
    private static final javax.xml.namespace.QName ORDERLINELIST$26 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderLineList");
    private static final javax.xml.namespace.QName ORDERNUMBER$28 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumber");
    private static final javax.xml.namespace.QName ORDERSTATE$30 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderState");
    private static final javax.xml.namespace.QName PARCELLIST$32 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelList");
    private static final javax.xml.namespace.QName PARTNERORDERREF$34 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PartnerOrderRef");
    private static final javax.xml.namespace.QName SHIPPEDTOTALAMOUNT$36 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippedTotalAmount");
    private static final javax.xml.namespace.QName SHIPPEDTOTALSHIPPINGCHARGES$38 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippedTotalShippingCharges");
    private static final javax.xml.namespace.QName SHIPPINGADDRESS$40 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingAddress");
    private static final javax.xml.namespace.QName SHIPPINGCODE$42 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingCode");
    private static final javax.xml.namespace.QName SHIPPINGDATEMAX$44 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingDateMax");
    private static final javax.xml.namespace.QName SHIPPINGDATEMIN$46 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingDateMin");
    private static final javax.xml.namespace.QName SITECOMMISSIONPROMISEDAMOUNT$48 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SiteCommissionPromisedAmount");
    private static final javax.xml.namespace.QName SITECOMMISSIONSHIPPEDAMOUNT$50 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SiteCommissionShippedAmount");
    private static final javax.xml.namespace.QName SITECOMMISSIONVALIDATEDAMOUNT$52 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SiteCommissionValidatedAmount");
    private static final javax.xml.namespace.QName STATUS$54 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Status");
    private static final javax.xml.namespace.QName VALIDATEDTOTALAMOUNT$56 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidatedTotalAmount");
    private static final javax.xml.namespace.QName VALIDATEDTOTALSHIPPINGCHARGES$58 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidatedTotalShippingCharges");
    private static final javax.xml.namespace.QName VALIDATIONSTATUS$60 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidationStatus");
    private static final javax.xml.namespace.QName VISACEGID$62 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VisaCegid");
    private static final javax.xml.namespace.QName VOUCHERLIST$64 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VoucherList");
    
    
    /**
     * Gets the "ArchiveParcelList" element
     */
    public boolean getArchiveParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHIVEPARCELLIST$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ArchiveParcelList" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetArchiveParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ARCHIVEPARCELLIST$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ArchiveParcelList" element
     */
    public boolean isSetArchiveParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCHIVEPARCELLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ArchiveParcelList" element
     */
    public void setArchiveParcelList(boolean archiveParcelList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHIVEPARCELLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCHIVEPARCELLIST$0);
            }
            target.setBooleanValue(archiveParcelList);
        }
    }
    
    /**
     * Sets (as xml) the "ArchiveParcelList" element
     */
    public void xsetArchiveParcelList(org.apache.xmlbeans.XmlBoolean archiveParcelList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ARCHIVEPARCELLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ARCHIVEPARCELLIST$0);
            }
            target.set(archiveParcelList);
        }
    }
    
    /**
     * Unsets the "ArchiveParcelList" element
     */
    public void unsetArchiveParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCHIVEPARCELLIST$0, 0);
        }
    }
    
    /**
     * Gets the "BillingAddress" element
     */
    public com.cdiscount.www.Address getBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(BILLINGADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BillingAddress" element
     */
    public boolean isNilBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(BILLINGADDRESS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BillingAddress" element
     */
    public boolean isSetBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLINGADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "BillingAddress" element
     */
    public void setBillingAddress(com.cdiscount.www.Address billingAddress)
    {
        generatedSetterHelperImpl(billingAddress, BILLINGADDRESS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BillingAddress" element
     */
    public com.cdiscount.www.Address addNewBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().add_element_user(BILLINGADDRESS$2);
            return target;
        }
    }
    
    /**
     * Nils the "BillingAddress" element
     */
    public void setNilBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(BILLINGADDRESS$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Address)get_store().add_element_user(BILLINGADDRESS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BillingAddress" element
     */
    public void unsetBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLINGADDRESS$2, 0);
        }
    }
    
    /**
     * Gets the "Corporation" element
     */
    public com.cdiscount.www.Corporation getCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().find_element_user(CORPORATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Corporation" element
     */
    public boolean isNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().find_element_user(CORPORATION$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Corporation" element
     */
    public boolean isSetCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORPORATION$4) != 0;
        }
    }
    
    /**
     * Sets the "Corporation" element
     */
    public void setCorporation(com.cdiscount.www.Corporation corporation)
    {
        generatedSetterHelperImpl(corporation, CORPORATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Corporation" element
     */
    public com.cdiscount.www.Corporation addNewCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().add_element_user(CORPORATION$4);
            return target;
        }
    }
    
    /**
     * Nils the "Corporation" element
     */
    public void setNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().find_element_user(CORPORATION$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Corporation)get_store().add_element_user(CORPORATION$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Corporation" element
     */
    public void unsetCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORPORATION$4, 0);
        }
    }
    
    /**
     * Gets the "CreationDate" element
     */
    public java.util.Calendar getCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreationDate" element
     */
    public boolean isSetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATIONDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "CreationDate" element
     */
    public void setCreationDate(java.util.Calendar creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONDATE$6);
            }
            target.setCalendarValue(creationDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreationDate" element
     */
    public void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATIONDATE$6);
            }
            target.set(creationDate);
        }
    }
    
    /**
     * Unsets the "CreationDate" element
     */
    public void unsetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATIONDATE$6, 0);
        }
    }
    
    /**
     * Gets the "Customer" element
     */
    public com.cdiscount.www.Customer getCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().find_element_user(CUSTOMER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Customer" element
     */
    public boolean isNilCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().find_element_user(CUSTOMER$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Customer" element
     */
    public boolean isSetCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMER$8) != 0;
        }
    }
    
    /**
     * Sets the "Customer" element
     */
    public void setCustomer(com.cdiscount.www.Customer customer)
    {
        generatedSetterHelperImpl(customer, CUSTOMER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    public com.cdiscount.www.Customer addNewCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().add_element_user(CUSTOMER$8);
            return target;
        }
    }
    
    /**
     * Nils the "Customer" element
     */
    public void setNilCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().find_element_user(CUSTOMER$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Customer)get_store().add_element_user(CUSTOMER$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Customer" element
     */
    public void unsetCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMER$8, 0);
        }
    }
    
    /**
     * Gets the "HasClaims" element
     */
    public boolean getHasClaims()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCLAIMS$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasClaims" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasClaims()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCLAIMS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "HasClaims" element
     */
    public boolean isSetHasClaims()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASCLAIMS$10) != 0;
        }
    }
    
    /**
     * Sets the "HasClaims" element
     */
    public void setHasClaims(boolean hasClaims)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCLAIMS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASCLAIMS$10);
            }
            target.setBooleanValue(hasClaims);
        }
    }
    
    /**
     * Sets (as xml) the "HasClaims" element
     */
    public void xsetHasClaims(org.apache.xmlbeans.XmlBoolean hasClaims)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCLAIMS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASCLAIMS$10);
            }
            target.set(hasClaims);
        }
    }
    
    /**
     * Unsets the "HasClaims" element
     */
    public void unsetHasClaims()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASCLAIMS$10, 0);
        }
    }
    
    /**
     * Gets the "InitialTotalAmount" element
     */
    public java.math.BigDecimal getInitialTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALTOTALAMOUNT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "InitialTotalAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetInitialTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALTOTALAMOUNT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "InitialTotalAmount" element
     */
    public boolean isSetInitialTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITIALTOTALAMOUNT$12) != 0;
        }
    }
    
    /**
     * Sets the "InitialTotalAmount" element
     */
    public void setInitialTotalAmount(java.math.BigDecimal initialTotalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALTOTALAMOUNT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALTOTALAMOUNT$12);
            }
            target.setBigDecimalValue(initialTotalAmount);
        }
    }
    
    /**
     * Sets (as xml) the "InitialTotalAmount" element
     */
    public void xsetInitialTotalAmount(org.apache.xmlbeans.XmlDecimal initialTotalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALTOTALAMOUNT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(INITIALTOTALAMOUNT$12);
            }
            target.set(initialTotalAmount);
        }
    }
    
    /**
     * Unsets the "InitialTotalAmount" element
     */
    public void unsetInitialTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITIALTOTALAMOUNT$12, 0);
        }
    }
    
    /**
     * Gets the "InitialTotalShippingChargesAmount" element
     */
    public java.math.BigDecimal getInitialTotalShippingChargesAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALTOTALSHIPPINGCHARGESAMOUNT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "InitialTotalShippingChargesAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetInitialTotalShippingChargesAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALTOTALSHIPPINGCHARGESAMOUNT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "InitialTotalShippingChargesAmount" element
     */
    public boolean isSetInitialTotalShippingChargesAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITIALTOTALSHIPPINGCHARGESAMOUNT$14) != 0;
        }
    }
    
    /**
     * Sets the "InitialTotalShippingChargesAmount" element
     */
    public void setInitialTotalShippingChargesAmount(java.math.BigDecimal initialTotalShippingChargesAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALTOTALSHIPPINGCHARGESAMOUNT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALTOTALSHIPPINGCHARGESAMOUNT$14);
            }
            target.setBigDecimalValue(initialTotalShippingChargesAmount);
        }
    }
    
    /**
     * Sets (as xml) the "InitialTotalShippingChargesAmount" element
     */
    public void xsetInitialTotalShippingChargesAmount(org.apache.xmlbeans.XmlDecimal initialTotalShippingChargesAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INITIALTOTALSHIPPINGCHARGESAMOUNT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(INITIALTOTALSHIPPINGCHARGESAMOUNT$14);
            }
            target.set(initialTotalShippingChargesAmount);
        }
    }
    
    /**
     * Unsets the "InitialTotalShippingChargesAmount" element
     */
    public void unsetInitialTotalShippingChargesAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITIALTOTALSHIPPINGCHARGESAMOUNT$14, 0);
        }
    }
    
    /**
     * Gets the "IsCLogistiqueOrder" element
     */
    public boolean getIsCLogistiqueOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLOGISTIQUEORDER$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCLogistiqueOrder" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCLogistiqueOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLOGISTIQUEORDER$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsCLogistiqueOrder" element
     */
    public void setIsCLogistiqueOrder(boolean isCLogistiqueOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLOGISTIQUEORDER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCLOGISTIQUEORDER$16);
            }
            target.setBooleanValue(isCLogistiqueOrder);
        }
    }
    
    /**
     * Sets (as xml) the "IsCLogistiqueOrder" element
     */
    public void xsetIsCLogistiqueOrder(org.apache.xmlbeans.XmlBoolean isCLogistiqueOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLOGISTIQUEORDER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCLOGISTIQUEORDER$16);
            }
            target.set(isCLogistiqueOrder);
        }
    }
    
    /**
     * Gets the "LastUpdatedDate" element
     */
    public java.util.Calendar getLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATEDDATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastUpdatedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LastUpdatedDate" element
     */
    public boolean isNilLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LastUpdatedDate" element
     */
    public boolean isSetLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTUPDATEDDATE$18) != 0;
        }
    }
    
    /**
     * Sets the "LastUpdatedDate" element
     */
    public void setLastUpdatedDate(java.util.Calendar lastUpdatedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATEDDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATEDDATE$18);
            }
            target.setCalendarValue(lastUpdatedDate);
        }
    }
    
    /**
     * Sets (as xml) the "LastUpdatedDate" element
     */
    public void xsetLastUpdatedDate(org.apache.xmlbeans.XmlDateTime lastUpdatedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTUPDATEDDATE$18);
            }
            target.set(lastUpdatedDate);
        }
    }
    
    /**
     * Nils the "LastUpdatedDate" element
     */
    public void setNilLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTUPDATEDDATE$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LastUpdatedDate" element
     */
    public void unsetLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTUPDATEDDATE$18, 0);
        }
    }
    
    /**
     * Gets the "ModGesLog" element
     */
    public java.lang.String getModGesLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODGESLOG$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ModGesLog" element
     */
    public org.apache.xmlbeans.XmlString xgetModGesLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODGESLOG$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ModGesLog" element
     */
    public boolean isNilModGesLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODGESLOG$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ModGesLog" element
     */
    public boolean isSetModGesLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODGESLOG$20) != 0;
        }
    }
    
    /**
     * Sets the "ModGesLog" element
     */
    public void setModGesLog(java.lang.String modGesLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODGESLOG$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODGESLOG$20);
            }
            target.setStringValue(modGesLog);
        }
    }
    
    /**
     * Sets (as xml) the "ModGesLog" element
     */
    public void xsetModGesLog(org.apache.xmlbeans.XmlString modGesLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODGESLOG$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODGESLOG$20);
            }
            target.set(modGesLog);
        }
    }
    
    /**
     * Nils the "ModGesLog" element
     */
    public void setNilModGesLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODGESLOG$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODGESLOG$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ModGesLog" element
     */
    public void unsetModGesLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODGESLOG$20, 0);
        }
    }
    
    /**
     * Gets the "ModifiedDate" element
     */
    public java.util.Calendar getModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDDATE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ModifiedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ModifiedDate" element
     */
    public boolean isNilModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ModifiedDate" element
     */
    public boolean isSetModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDDATE$22) != 0;
        }
    }
    
    /**
     * Sets the "ModifiedDate" element
     */
    public void setModifiedDate(java.util.Calendar modifiedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIEDDATE$22);
            }
            target.setCalendarValue(modifiedDate);
        }
    }
    
    /**
     * Sets (as xml) the "ModifiedDate" element
     */
    public void xsetModifiedDate(org.apache.xmlbeans.XmlDateTime modifiedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MODIFIEDDATE$22);
            }
            target.set(modifiedDate);
        }
    }
    
    /**
     * Nils the "ModifiedDate" element
     */
    public void setNilModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MODIFIEDDATE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ModifiedDate" element
     */
    public void unsetModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDDATE$22, 0);
        }
    }
    
    /**
     * Gets the "Offer" element
     */
    public com.cdiscount.www.OfferOrder getOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().find_element_user(OFFER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Offer" element
     */
    public boolean isNilOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().find_element_user(OFFER$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Offer" element
     */
    public boolean isSetOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFER$24) != 0;
        }
    }
    
    /**
     * Sets the "Offer" element
     */
    public void setOffer(com.cdiscount.www.OfferOrder offer)
    {
        generatedSetterHelperImpl(offer, OFFER$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Offer" element
     */
    public com.cdiscount.www.OfferOrder addNewOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().add_element_user(OFFER$24);
            return target;
        }
    }
    
    /**
     * Nils the "Offer" element
     */
    public void setNilOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().find_element_user(OFFER$24, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferOrder)get_store().add_element_user(OFFER$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Offer" element
     */
    public void unsetOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFER$24, 0);
        }
    }
    
    /**
     * Gets the "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfOrderLine getOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ORDERLINELIST$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderLineList" element
     */
    public boolean isNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ORDERLINELIST$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderLineList" element
     */
    public boolean isSetOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERLINELIST$26) != 0;
        }
    }
    
    /**
     * Sets the "OrderLineList" element
     */
    public void setOrderLineList(com.cdiscount.www.ArrayOfOrderLine orderLineList)
    {
        generatedSetterHelperImpl(orderLineList, ORDERLINELIST$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfOrderLine addNewOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().add_element_user(ORDERLINELIST$26);
            return target;
        }
    }
    
    /**
     * Nils the "OrderLineList" element
     */
    public void setNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ORDERLINELIST$26, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderLine)get_store().add_element_user(ORDERLINELIST$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderLineList" element
     */
    public void unsetOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERLINELIST$26, 0);
        }
    }
    
    /**
     * Gets the "OrderNumber" element
     */
    public java.lang.String getOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderNumber" element
     */
    public boolean isNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderNumber" element
     */
    public boolean isSetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERNUMBER$28) != 0;
        }
    }
    
    /**
     * Sets the "OrderNumber" element
     */
    public void setOrderNumber(java.lang.String orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$28);
            }
            target.setStringValue(orderNumber);
        }
    }
    
    /**
     * Sets (as xml) the "OrderNumber" element
     */
    public void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$28);
            }
            target.set(orderNumber);
        }
    }
    
    /**
     * Nils the "OrderNumber" element
     */
    public void setNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderNumber" element
     */
    public void unsetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERNUMBER$28, 0);
        }
    }
    
    /**
     * Gets the "OrderState" element
     */
    public com.cdiscount.www.OrderStateEnum.Enum getOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATE$30, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OrderStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderState" element
     */
    public com.cdiscount.www.OrderStateEnum xgetOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATE$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderState" element
     */
    public boolean isNilOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATE$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderState" element
     */
    public boolean isSetOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERSTATE$30) != 0;
        }
    }
    
    /**
     * Sets the "OrderState" element
     */
    public void setOrderState(com.cdiscount.www.OrderStateEnum.Enum orderState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERSTATE$30);
            }
            target.setEnumValue(orderState);
        }
    }
    
    /**
     * Sets (as xml) the "OrderState" element
     */
    public void xsetOrderState(com.cdiscount.www.OrderStateEnum orderState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATE$30, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStateEnum)get_store().add_element_user(ORDERSTATE$30);
            }
            target.set(orderState);
        }
    }
    
    /**
     * Nils the "OrderState" element
     */
    public void setNilOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATE$30, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStateEnum)get_store().add_element_user(ORDERSTATE$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderState" element
     */
    public void unsetOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERSTATE$30, 0);
        }
    }
    
    /**
     * Gets the "ParcelList" element
     */
    public com.cdiscount.www.ArrayOfParcel getParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().find_element_user(PARCELLIST$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelList" element
     */
    public boolean isNilParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().find_element_user(PARCELLIST$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelList" element
     */
    public boolean isSetParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELLIST$32) != 0;
        }
    }
    
    /**
     * Sets the "ParcelList" element
     */
    public void setParcelList(com.cdiscount.www.ArrayOfParcel parcelList)
    {
        generatedSetterHelperImpl(parcelList, PARCELLIST$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelList" element
     */
    public com.cdiscount.www.ArrayOfParcel addNewParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().add_element_user(PARCELLIST$32);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelList" element
     */
    public void setNilParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().find_element_user(PARCELLIST$32, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcel)get_store().add_element_user(PARCELLIST$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelList" element
     */
    public void unsetParcelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELLIST$32, 0);
        }
    }
    
    /**
     * Gets the "PartnerOrderRef" element
     */
    public java.lang.String getPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERORDERREF$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerOrderRef" element
     */
    public org.apache.xmlbeans.XmlString xgetPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PartnerOrderRef" element
     */
    public boolean isNilPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PartnerOrderRef" element
     */
    public boolean isSetPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERORDERREF$34) != 0;
        }
    }
    
    /**
     * Sets the "PartnerOrderRef" element
     */
    public void setPartnerOrderRef(java.lang.String partnerOrderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERORDERREF$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERORDERREF$34);
            }
            target.setStringValue(partnerOrderRef);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerOrderRef" element
     */
    public void xsetPartnerOrderRef(org.apache.xmlbeans.XmlString partnerOrderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERORDERREF$34);
            }
            target.set(partnerOrderRef);
        }
    }
    
    /**
     * Nils the "PartnerOrderRef" element
     */
    public void setNilPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERORDERREF$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PartnerOrderRef" element
     */
    public void unsetPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERORDERREF$34, 0);
        }
    }
    
    /**
     * Gets the "ShippedTotalAmount" element
     */
    public java.math.BigDecimal getShippedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPEDTOTALAMOUNT$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippedTotalAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetShippedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHIPPEDTOTALAMOUNT$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "ShippedTotalAmount" element
     */
    public boolean isSetShippedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPEDTOTALAMOUNT$36) != 0;
        }
    }
    
    /**
     * Sets the "ShippedTotalAmount" element
     */
    public void setShippedTotalAmount(java.math.BigDecimal shippedTotalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPEDTOTALAMOUNT$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPEDTOTALAMOUNT$36);
            }
            target.setBigDecimalValue(shippedTotalAmount);
        }
    }
    
    /**
     * Sets (as xml) the "ShippedTotalAmount" element
     */
    public void xsetShippedTotalAmount(org.apache.xmlbeans.XmlDecimal shippedTotalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHIPPEDTOTALAMOUNT$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SHIPPEDTOTALAMOUNT$36);
            }
            target.set(shippedTotalAmount);
        }
    }
    
    /**
     * Unsets the "ShippedTotalAmount" element
     */
    public void unsetShippedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPEDTOTALAMOUNT$36, 0);
        }
    }
    
    /**
     * Gets the "ShippedTotalShippingCharges" element
     */
    public java.math.BigDecimal getShippedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPEDTOTALSHIPPINGCHARGES$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippedTotalShippingCharges" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetShippedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHIPPEDTOTALSHIPPINGCHARGES$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "ShippedTotalShippingCharges" element
     */
    public boolean isSetShippedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPEDTOTALSHIPPINGCHARGES$38) != 0;
        }
    }
    
    /**
     * Sets the "ShippedTotalShippingCharges" element
     */
    public void setShippedTotalShippingCharges(java.math.BigDecimal shippedTotalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPEDTOTALSHIPPINGCHARGES$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPEDTOTALSHIPPINGCHARGES$38);
            }
            target.setBigDecimalValue(shippedTotalShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "ShippedTotalShippingCharges" element
     */
    public void xsetShippedTotalShippingCharges(org.apache.xmlbeans.XmlDecimal shippedTotalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHIPPEDTOTALSHIPPINGCHARGES$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SHIPPEDTOTALSHIPPINGCHARGES$38);
            }
            target.set(shippedTotalShippingCharges);
        }
    }
    
    /**
     * Unsets the "ShippedTotalShippingCharges" element
     */
    public void unsetShippedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPEDTOTALSHIPPINGCHARGES$38, 0);
        }
    }
    
    /**
     * Gets the "ShippingAddress" element
     */
    public com.cdiscount.www.Address getShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(SHIPPINGADDRESS$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingAddress" element
     */
    public boolean isNilShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(SHIPPINGADDRESS$40, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShippingAddress" element
     */
    public boolean isSetShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGADDRESS$40) != 0;
        }
    }
    
    /**
     * Sets the "ShippingAddress" element
     */
    public void setShippingAddress(com.cdiscount.www.Address shippingAddress)
    {
        generatedSetterHelperImpl(shippingAddress, SHIPPINGADDRESS$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShippingAddress" element
     */
    public com.cdiscount.www.Address addNewShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().add_element_user(SHIPPINGADDRESS$40);
            return target;
        }
    }
    
    /**
     * Nils the "ShippingAddress" element
     */
    public void setNilShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(SHIPPINGADDRESS$40, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Address)get_store().add_element_user(SHIPPINGADDRESS$40);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShippingAddress" element
     */
    public void unsetShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGADDRESS$40, 0);
        }
    }
    
    /**
     * Gets the "ShippingCode" element
     */
    public java.lang.String getShippingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCODE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingCode" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCODE$42, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingCode" element
     */
    public boolean isNilShippingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCODE$42, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShippingCode" element
     */
    public boolean isSetShippingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGCODE$42) != 0;
        }
    }
    
    /**
     * Sets the "ShippingCode" element
     */
    public void setShippingCode(java.lang.String shippingCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCODE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGCODE$42);
            }
            target.setStringValue(shippingCode);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingCode" element
     */
    public void xsetShippingCode(org.apache.xmlbeans.XmlString shippingCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCODE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGCODE$42);
            }
            target.set(shippingCode);
        }
    }
    
    /**
     * Nils the "ShippingCode" element
     */
    public void setNilShippingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCODE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGCODE$42);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShippingCode" element
     */
    public void unsetShippingCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGCODE$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMAX$44, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMAX$44, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingDateMax" element
     */
    public boolean isNilShippingDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMAX$44, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(SHIPPINGDATEMAX$44) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMAX$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGDATEMAX$44);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMAX$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SHIPPINGDATEMAX$44);
            }
            target.set(shippingDateMax);
        }
    }
    
    /**
     * Nils the "ShippingDateMax" element
     */
    public void setNilShippingDateMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMAX$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SHIPPINGDATEMAX$44);
            }
            target.setNil();
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
            get_store().remove_element(SHIPPINGDATEMAX$44, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMIN$46, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMIN$46, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingDateMin" element
     */
    public boolean isNilShippingDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMIN$46, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(SHIPPINGDATEMIN$46) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGDATEMIN$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGDATEMIN$46);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMIN$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SHIPPINGDATEMIN$46);
            }
            target.set(shippingDateMin);
        }
    }
    
    /**
     * Nils the "ShippingDateMin" element
     */
    public void setNilShippingDateMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SHIPPINGDATEMIN$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SHIPPINGDATEMIN$46);
            }
            target.setNil();
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
            get_store().remove_element(SHIPPINGDATEMIN$46, 0);
        }
    }
    
    /**
     * Gets the "SiteCommissionPromisedAmount" element
     */
    public java.math.BigDecimal getSiteCommissionPromisedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECOMMISSIONPROMISEDAMOUNT$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteCommissionPromisedAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetSiteCommissionPromisedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SITECOMMISSIONPROMISEDAMOUNT$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "SiteCommissionPromisedAmount" element
     */
    public boolean isSetSiteCommissionPromisedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITECOMMISSIONPROMISEDAMOUNT$48) != 0;
        }
    }
    
    /**
     * Sets the "SiteCommissionPromisedAmount" element
     */
    public void setSiteCommissionPromisedAmount(java.math.BigDecimal siteCommissionPromisedAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECOMMISSIONPROMISEDAMOUNT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITECOMMISSIONPROMISEDAMOUNT$48);
            }
            target.setBigDecimalValue(siteCommissionPromisedAmount);
        }
    }
    
    /**
     * Sets (as xml) the "SiteCommissionPromisedAmount" element
     */
    public void xsetSiteCommissionPromisedAmount(org.apache.xmlbeans.XmlDecimal siteCommissionPromisedAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SITECOMMISSIONPROMISEDAMOUNT$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SITECOMMISSIONPROMISEDAMOUNT$48);
            }
            target.set(siteCommissionPromisedAmount);
        }
    }
    
    /**
     * Unsets the "SiteCommissionPromisedAmount" element
     */
    public void unsetSiteCommissionPromisedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITECOMMISSIONPROMISEDAMOUNT$48, 0);
        }
    }
    
    /**
     * Gets the "SiteCommissionShippedAmount" element
     */
    public java.math.BigDecimal getSiteCommissionShippedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECOMMISSIONSHIPPEDAMOUNT$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteCommissionShippedAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetSiteCommissionShippedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SITECOMMISSIONSHIPPEDAMOUNT$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "SiteCommissionShippedAmount" element
     */
    public boolean isSetSiteCommissionShippedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITECOMMISSIONSHIPPEDAMOUNT$50) != 0;
        }
    }
    
    /**
     * Sets the "SiteCommissionShippedAmount" element
     */
    public void setSiteCommissionShippedAmount(java.math.BigDecimal siteCommissionShippedAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECOMMISSIONSHIPPEDAMOUNT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITECOMMISSIONSHIPPEDAMOUNT$50);
            }
            target.setBigDecimalValue(siteCommissionShippedAmount);
        }
    }
    
    /**
     * Sets (as xml) the "SiteCommissionShippedAmount" element
     */
    public void xsetSiteCommissionShippedAmount(org.apache.xmlbeans.XmlDecimal siteCommissionShippedAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SITECOMMISSIONSHIPPEDAMOUNT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SITECOMMISSIONSHIPPEDAMOUNT$50);
            }
            target.set(siteCommissionShippedAmount);
        }
    }
    
    /**
     * Unsets the "SiteCommissionShippedAmount" element
     */
    public void unsetSiteCommissionShippedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITECOMMISSIONSHIPPEDAMOUNT$50, 0);
        }
    }
    
    /**
     * Gets the "SiteCommissionValidatedAmount" element
     */
    public java.math.BigDecimal getSiteCommissionValidatedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECOMMISSIONVALIDATEDAMOUNT$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteCommissionValidatedAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetSiteCommissionValidatedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SITECOMMISSIONVALIDATEDAMOUNT$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "SiteCommissionValidatedAmount" element
     */
    public boolean isSetSiteCommissionValidatedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITECOMMISSIONVALIDATEDAMOUNT$52) != 0;
        }
    }
    
    /**
     * Sets the "SiteCommissionValidatedAmount" element
     */
    public void setSiteCommissionValidatedAmount(java.math.BigDecimal siteCommissionValidatedAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECOMMISSIONVALIDATEDAMOUNT$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITECOMMISSIONVALIDATEDAMOUNT$52);
            }
            target.setBigDecimalValue(siteCommissionValidatedAmount);
        }
    }
    
    /**
     * Sets (as xml) the "SiteCommissionValidatedAmount" element
     */
    public void xsetSiteCommissionValidatedAmount(org.apache.xmlbeans.XmlDecimal siteCommissionValidatedAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SITECOMMISSIONVALIDATEDAMOUNT$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SITECOMMISSIONVALIDATEDAMOUNT$52);
            }
            target.set(siteCommissionValidatedAmount);
        }
    }
    
    /**
     * Unsets the "SiteCommissionValidatedAmount" element
     */
    public void unsetSiteCommissionValidatedAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITECOMMISSIONVALIDATEDAMOUNT$52, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.cdiscount.www.OrderStatusType.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$54, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OrderStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.cdiscount.www.OrderStatusType xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStatusType target = null;
            target = (com.cdiscount.www.OrderStatusType)get_store().find_element_user(STATUS$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$54) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.cdiscount.www.OrderStatusType.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$54);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.cdiscount.www.OrderStatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStatusType target = null;
            target = (com.cdiscount.www.OrderStatusType)get_store().find_element_user(STATUS$54, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStatusType)get_store().add_element_user(STATUS$54);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$54, 0);
        }
    }
    
    /**
     * Gets the "ValidatedTotalAmount" element
     */
    public java.math.BigDecimal getValidatedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATEDTOTALAMOUNT$56, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidatedTotalAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetValidatedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALIDATEDTOTALAMOUNT$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValidatedTotalAmount" element
     */
    public boolean isSetValidatedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEDTOTALAMOUNT$56) != 0;
        }
    }
    
    /**
     * Sets the "ValidatedTotalAmount" element
     */
    public void setValidatedTotalAmount(java.math.BigDecimal validatedTotalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATEDTOTALAMOUNT$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATEDTOTALAMOUNT$56);
            }
            target.setBigDecimalValue(validatedTotalAmount);
        }
    }
    
    /**
     * Sets (as xml) the "ValidatedTotalAmount" element
     */
    public void xsetValidatedTotalAmount(org.apache.xmlbeans.XmlDecimal validatedTotalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALIDATEDTOTALAMOUNT$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALIDATEDTOTALAMOUNT$56);
            }
            target.set(validatedTotalAmount);
        }
    }
    
    /**
     * Unsets the "ValidatedTotalAmount" element
     */
    public void unsetValidatedTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEDTOTALAMOUNT$56, 0);
        }
    }
    
    /**
     * Gets the "ValidatedTotalShippingCharges" element
     */
    public java.math.BigDecimal getValidatedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATEDTOTALSHIPPINGCHARGES$58, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidatedTotalShippingCharges" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetValidatedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALIDATEDTOTALSHIPPINGCHARGES$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValidatedTotalShippingCharges" element
     */
    public boolean isSetValidatedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEDTOTALSHIPPINGCHARGES$58) != 0;
        }
    }
    
    /**
     * Sets the "ValidatedTotalShippingCharges" element
     */
    public void setValidatedTotalShippingCharges(java.math.BigDecimal validatedTotalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATEDTOTALSHIPPINGCHARGES$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATEDTOTALSHIPPINGCHARGES$58);
            }
            target.setBigDecimalValue(validatedTotalShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "ValidatedTotalShippingCharges" element
     */
    public void xsetValidatedTotalShippingCharges(org.apache.xmlbeans.XmlDecimal validatedTotalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALIDATEDTOTALSHIPPINGCHARGES$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALIDATEDTOTALSHIPPINGCHARGES$58);
            }
            target.set(validatedTotalShippingCharges);
        }
    }
    
    /**
     * Unsets the "ValidatedTotalShippingCharges" element
     */
    public void unsetValidatedTotalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEDTOTALSHIPPINGCHARGES$58, 0);
        }
    }
    
    /**
     * Gets the "ValidationStatus" element
     */
    public com.cdiscount.www.ValidationStatusType.Enum getValidationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSTATUS$60, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ValidationStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidationStatus" element
     */
    public com.cdiscount.www.ValidationStatusType xgetValidationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationStatusType target = null;
            target = (com.cdiscount.www.ValidationStatusType)get_store().find_element_user(VALIDATIONSTATUS$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValidationStatus" element
     */
    public boolean isSetValidationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONSTATUS$60) != 0;
        }
    }
    
    /**
     * Sets the "ValidationStatus" element
     */
    public void setValidationStatus(com.cdiscount.www.ValidationStatusType.Enum validationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSTATUS$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATIONSTATUS$60);
            }
            target.setEnumValue(validationStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ValidationStatus" element
     */
    public void xsetValidationStatus(com.cdiscount.www.ValidationStatusType validationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationStatusType target = null;
            target = (com.cdiscount.www.ValidationStatusType)get_store().find_element_user(VALIDATIONSTATUS$60, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidationStatusType)get_store().add_element_user(VALIDATIONSTATUS$60);
            }
            target.set(validationStatus);
        }
    }
    
    /**
     * Unsets the "ValidationStatus" element
     */
    public void unsetValidationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONSTATUS$60, 0);
        }
    }
    
    /**
     * Gets the "VisaCegid" element
     */
    public int getVisaCegid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISACEGID$62, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "VisaCegid" element
     */
    public org.apache.xmlbeans.XmlInt xgetVisaCegid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VISACEGID$62, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "VisaCegid" element
     */
    public boolean isNilVisaCegid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VISACEGID$62, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "VisaCegid" element
     */
    public boolean isSetVisaCegid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VISACEGID$62) != 0;
        }
    }
    
    /**
     * Sets the "VisaCegid" element
     */
    public void setVisaCegid(int visaCegid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISACEGID$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISACEGID$62);
            }
            target.setIntValue(visaCegid);
        }
    }
    
    /**
     * Sets (as xml) the "VisaCegid" element
     */
    public void xsetVisaCegid(org.apache.xmlbeans.XmlInt visaCegid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VISACEGID$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VISACEGID$62);
            }
            target.set(visaCegid);
        }
    }
    
    /**
     * Nils the "VisaCegid" element
     */
    public void setNilVisaCegid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VISACEGID$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VISACEGID$62);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "VisaCegid" element
     */
    public void unsetVisaCegid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VISACEGID$62, 0);
        }
    }
    
    /**
     * Gets the "VoucherList" element
     */
    public com.cdiscount.www.ArrayOfVoucher getVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().find_element_user(VOUCHERLIST$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "VoucherList" element
     */
    public boolean isNilVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().find_element_user(VOUCHERLIST$64, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "VoucherList" element
     */
    public boolean isSetVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOUCHERLIST$64) != 0;
        }
    }
    
    /**
     * Sets the "VoucherList" element
     */
    public void setVoucherList(com.cdiscount.www.ArrayOfVoucher voucherList)
    {
        generatedSetterHelperImpl(voucherList, VOUCHERLIST$64, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VoucherList" element
     */
    public com.cdiscount.www.ArrayOfVoucher addNewVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().add_element_user(VOUCHERLIST$64);
            return target;
        }
    }
    
    /**
     * Nils the "VoucherList" element
     */
    public void setNilVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().find_element_user(VOUCHERLIST$64, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfVoucher)get_store().add_element_user(VOUCHERLIST$64);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "VoucherList" element
     */
    public void unsetVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOUCHERLIST$64, 0);
        }
    }
}
