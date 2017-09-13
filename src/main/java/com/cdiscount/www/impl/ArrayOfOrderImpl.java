/*
 * XML Type:  ArrayOfOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrder
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOrder(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrder
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Order");
    
    
    /**
     * Gets array of all "Order" elements
     */
    public com.cdiscount.www.Order[] getOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDER$0, targetList);
            com.cdiscount.www.Order[] result = new com.cdiscount.www.Order[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Order" element
     */
    public com.cdiscount.www.Order getOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().find_element_user(ORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Order" element
     */
    public boolean isNilOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().find_element_user(ORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Order" element
     */
    public int sizeOfOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDER$0);
        }
    }
    
    /**
     * Sets array of all "Order" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderArray(com.cdiscount.www.Order[] orderArray)
    {
        check_orphaned();
        arraySetterHelper(orderArray, ORDER$0);
    }
    
    /**
     * Sets ith "Order" element
     */
    public void setOrderArray(int i, com.cdiscount.www.Order order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().find_element_user(ORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(order);
        }
    }
    
    /**
     * Nils the ith "Order" element
     */
    public void setNilOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().find_element_user(ORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Order" element
     */
    public com.cdiscount.www.Order insertNewOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().insert_element_user(ORDER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Order" element
     */
    public com.cdiscount.www.Order addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().add_element_user(ORDER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Order" element
     */
    public void removeOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDER$0, i);
        }
    }
}
