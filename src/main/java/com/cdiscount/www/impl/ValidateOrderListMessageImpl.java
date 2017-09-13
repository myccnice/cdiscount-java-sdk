/*
 * XML Type:  ValidateOrderListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ValidateOrderListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ValidateOrderListMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderListMessage
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderList");
    
    
    /**
     * Gets the "OrderList" element
     */
    public com.cdiscount.www.ArrayOfValidateOrder getOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().find_element_user(ORDERLIST$0, 0);
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
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().find_element_user(ORDERLIST$0, 0);
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
    public void setOrderList(com.cdiscount.www.ArrayOfValidateOrder orderList)
    {
        generatedSetterHelperImpl(orderList, ORDERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderList" element
     */
    public com.cdiscount.www.ArrayOfValidateOrder addNewOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().add_element_user(ORDERLIST$0);
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
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().find_element_user(ORDERLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().add_element_user(ORDERLIST$0);
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
