/*
 * XML Type:  ArrayOfOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderLine");
    
    
    /**
     * Gets array of all "OrderLine" elements
     */
    public com.cdiscount.www.OrderLine[] getOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERLINE$0, targetList);
            com.cdiscount.www.OrderLine[] result = new com.cdiscount.www.OrderLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrderLine" element
     */
    public com.cdiscount.www.OrderLine getOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().find_element_user(ORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrderLine" element
     */
    public boolean isNilOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().find_element_user(ORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrderLine" element
     */
    public int sizeOfOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERLINE$0);
        }
    }
    
    /**
     * Sets array of all "OrderLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderLineArray(com.cdiscount.www.OrderLine[] orderLineArray)
    {
        check_orphaned();
        arraySetterHelper(orderLineArray, ORDERLINE$0);
    }
    
    /**
     * Sets ith "OrderLine" element
     */
    public void setOrderLineArray(int i, com.cdiscount.www.OrderLine orderLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().find_element_user(ORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderLine);
        }
    }
    
    /**
     * Nils the ith "OrderLine" element
     */
    public void setNilOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().find_element_user(ORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderLine" element
     */
    public com.cdiscount.www.OrderLine insertNewOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().insert_element_user(ORDERLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderLine" element
     */
    public com.cdiscount.www.OrderLine addNewOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().add_element_user(ORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrderLine" element
     */
    public void removeOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERLINE$0, i);
        }
    }
}
