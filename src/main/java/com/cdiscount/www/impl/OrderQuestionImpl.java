/*
 * XML Type:  OrderQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderQuestion
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderQuestion(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderQuestionImpl extends com.cdiscount.www.impl.DiscussionThreadBaseImpl implements com.cdiscount.www.OrderQuestion
{
    private static final long serialVersionUID = 1L;
    
    public OrderQuestionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNUMBER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumber");
    
    
    /**
     * Gets the "OrderNumber" element
     */
    public java.lang.String getOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
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
            return get_store().count_elements(ORDERNUMBER$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$0);
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
            get_store().remove_element(ORDERNUMBER$0, 0);
        }
    }
}
