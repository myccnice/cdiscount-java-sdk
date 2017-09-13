/*
 * XML Type:  RefundInformationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RefundInformationMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML RefundInformationMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class RefundInformationMessageImpl extends org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl.ServiceMessageImpl implements com.cdiscount.www.RefundInformationMessage
{
    private static final long serialVersionUID = 1L;
    
    public RefundInformationMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Amount");
    private static final javax.xml.namespace.QName MOTIVEID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MotiveId");
    
    
    /**
     * Gets the "Amount" element
     */
    public java.math.BigDecimal getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Amount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(AMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Amount" element
     */
    public void setAmount(java.math.BigDecimal amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$0);
            }
            target.setBigDecimalValue(amount);
        }
    }
    
    /**
     * Sets (as xml) the "Amount" element
     */
    public void xsetAmount(org.apache.xmlbeans.XmlDecimal amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(AMOUNT$0);
            }
            target.set(amount);
        }
    }
    
    /**
     * Gets the "MotiveId" element
     */
    public int getMotiveId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTIVEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MotiveId" element
     */
    public org.apache.xmlbeans.XmlInt xgetMotiveId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MOTIVEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MotiveId" element
     */
    public void setMotiveId(int motiveId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTIVEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOTIVEID$2);
            }
            target.setIntValue(motiveId);
        }
    }
    
    /**
     * Sets (as xml) the "MotiveId" element
     */
    public void xsetMotiveId(org.apache.xmlbeans.XmlInt motiveId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MOTIVEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MOTIVEID$2);
            }
            target.set(motiveId);
        }
    }
}
