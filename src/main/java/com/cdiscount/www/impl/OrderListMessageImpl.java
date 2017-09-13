/*
 * XML Type:  OrderListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.OrderListMessage
{
    private static final long serialVersionUID = 1L;
    
    public OrderListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderList");
    
    
    /**
     * Gets the "OrderList" element
     */
    public com.cdiscount.www.ArrayOfOrder getOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().find_element_user(ORDERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderList" element
     */
    public boolean isNilOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().find_element_user(ORDERLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderList" element
     */
    public boolean isSetOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "OrderList" element
     */
    public void setOrderList(com.cdiscount.www.ArrayOfOrder orderList)
    {
        generatedSetterHelperImpl(orderList, ORDERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderList" element
     */
    public com.cdiscount.www.ArrayOfOrder addNewOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().add_element_user(ORDERLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderList" element
     */
    public void setNilOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().find_element_user(ORDERLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrder)get_store().add_element_user(ORDERLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderList" element
     */
    public void unsetOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERLIST$0, 0);
        }
    }
}
