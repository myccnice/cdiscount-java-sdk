/*
 * XML Type:  OrderClaim
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderClaim
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderClaim(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderClaimImpl extends com.cdiscount.www.impl.OrderQuestionImpl implements com.cdiscount.www.OrderClaim
{
    private static final long serialVersionUID = 1L;
    
    public OrderClaimImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLAIMTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ClaimType");
    
    
    /**
     * Gets the "ClaimType" element
     */
    public com.cdiscount.www.ClaimType.Enum getClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ClaimType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClaimType" element
     */
    public com.cdiscount.www.ClaimType xgetClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ClaimType target = null;
            target = (com.cdiscount.www.ClaimType)get_store().find_element_user(CLAIMTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClaimType" element
     */
    public boolean isSetClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLAIMTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "ClaimType" element
     */
    public void setClaimType(com.cdiscount.www.ClaimType.Enum claimType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLAIMTYPE$0);
            }
            target.setEnumValue(claimType);
        }
    }
    
    /**
     * Sets (as xml) the "ClaimType" element
     */
    public void xsetClaimType(com.cdiscount.www.ClaimType claimType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ClaimType target = null;
            target = (com.cdiscount.www.ClaimType)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ClaimType)get_store().add_element_user(CLAIMTYPE$0);
            }
            target.set(claimType);
        }
    }
    
    /**
     * Unsets the "ClaimType" element
     */
    public void unsetClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLAIMTYPE$0, 0);
        }
    }
}
