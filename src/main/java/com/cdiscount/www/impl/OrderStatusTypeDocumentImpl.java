/*
 * An XML document type.
 * Localname: OrderStatusType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderStatusTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderStatusType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderStatusTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderStatusTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderStatusTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERSTATUSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderStatusType");
    
    
    /**
     * Gets the "OrderStatusType" element
     */
    public com.cdiscount.www.OrderStatusType.Enum getOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OrderStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderStatusType" element
     */
    public com.cdiscount.www.OrderStatusType xgetOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStatusType target = null;
            target = (com.cdiscount.www.OrderStatusType)get_store().find_element_user(ORDERSTATUSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderStatusType" element
     */
    public boolean isNilOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStatusType target = null;
            target = (com.cdiscount.www.OrderStatusType)get_store().find_element_user(ORDERSTATUSTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderStatusType" element
     */
    public void setOrderStatusType(com.cdiscount.www.OrderStatusType.Enum orderStatusType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERSTATUSTYPE$0);
            }
            target.setEnumValue(orderStatusType);
        }
    }
    
    /**
     * Sets (as xml) the "OrderStatusType" element
     */
    public void xsetOrderStatusType(com.cdiscount.www.OrderStatusType orderStatusType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStatusType target = null;
            target = (com.cdiscount.www.OrderStatusType)get_store().find_element_user(ORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStatusType)get_store().add_element_user(ORDERSTATUSTYPE$0);
            }
            target.set(orderStatusType);
        }
    }
    
    /**
     * Nils the "OrderStatusType" element
     */
    public void setNilOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStatusType target = null;
            target = (com.cdiscount.www.OrderStatusType)get_store().find_element_user(ORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStatusType)get_store().add_element_user(ORDERSTATUSTYPE$0);
            }
            target.setNil();
        }
    }
}
