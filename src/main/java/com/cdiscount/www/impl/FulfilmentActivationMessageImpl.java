/*
 * XML Type:  FulfilmentActivationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentActivationMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentActivationMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.FulfilmentActivationMessage
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPOSITID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DepositId");
    
    
    /**
     * Gets the "DepositId" element
     */
    public int getDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepositId" element
     */
    public org.apache.xmlbeans.XmlInt xgetDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepositId" element
     */
    public boolean isSetDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPOSITID$0) != 0;
        }
    }
    
    /**
     * Sets the "DepositId" element
     */
    public void setDepositId(int depositId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPOSITID$0);
            }
            target.setIntValue(depositId);
        }
    }
    
    /**
     * Sets (as xml) the "DepositId" element
     */
    public void xsetDepositId(org.apache.xmlbeans.XmlInt depositId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPOSITID$0);
            }
            target.set(depositId);
        }
    }
    
    /**
     * Unsets the "DepositId" element
     */
    public void unsetDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPOSITID$0, 0);
        }
    }
}
