/*
 * XML Type:  OrderClaimFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderClaimFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderClaimFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderClaimFilterImpl extends com.cdiscount.www.impl.OrderQuestionFilterImpl implements com.cdiscount.www.OrderClaimFilter
{
    private static final long serialVersionUID = 1L;
    
    public OrderClaimFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OnlyWithMessageFromCdsCustomerService");
    
    
    /**
     * Gets the "OnlyWithMessageFromCdsCustomerService" element
     */
    public boolean getOnlyWithMessageFromCdsCustomerService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OnlyWithMessageFromCdsCustomerService" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOnlyWithMessageFromCdsCustomerService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OnlyWithMessageFromCdsCustomerService" element
     */
    public boolean isNilOnlyWithMessageFromCdsCustomerService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OnlyWithMessageFromCdsCustomerService" element
     */
    public boolean isSetOnlyWithMessageFromCdsCustomerService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0) != 0;
        }
    }
    
    /**
     * Sets the "OnlyWithMessageFromCdsCustomerService" element
     */
    public void setOnlyWithMessageFromCdsCustomerService(boolean onlyWithMessageFromCdsCustomerService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0);
            }
            target.setBooleanValue(onlyWithMessageFromCdsCustomerService);
        }
    }
    
    /**
     * Sets (as xml) the "OnlyWithMessageFromCdsCustomerService" element
     */
    public void xsetOnlyWithMessageFromCdsCustomerService(org.apache.xmlbeans.XmlBoolean onlyWithMessageFromCdsCustomerService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0);
            }
            target.set(onlyWithMessageFromCdsCustomerService);
        }
    }
    
    /**
     * Nils the "OnlyWithMessageFromCdsCustomerService" element
     */
    public void setNilOnlyWithMessageFromCdsCustomerService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OnlyWithMessageFromCdsCustomerService" element
     */
    public void unsetOnlyWithMessageFromCdsCustomerService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONLYWITHMESSAGEFROMCDSCUSTOMERSERVICE$0, 0);
        }
    }
}
