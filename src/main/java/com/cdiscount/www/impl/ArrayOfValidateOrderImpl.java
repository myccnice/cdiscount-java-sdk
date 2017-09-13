/*
 * XML Type:  ArrayOfValidateOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrder
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfValidateOrder(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrder
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrder");
    
    
    /**
     * Gets array of all "ValidateOrder" elements
     */
    public com.cdiscount.www.ValidateOrder[] getValidateOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALIDATEORDER$0, targetList);
            com.cdiscount.www.ValidateOrder[] result = new com.cdiscount.www.ValidateOrder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValidateOrder" element
     */
    public com.cdiscount.www.ValidateOrder getValidateOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().find_element_user(VALIDATEORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ValidateOrder" element
     */
    public boolean isNilValidateOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().find_element_user(VALIDATEORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ValidateOrder" element
     */
    public int sizeOfValidateOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEORDER$0);
        }
    }
    
    /**
     * Sets array of all "ValidateOrder" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValidateOrderArray(com.cdiscount.www.ValidateOrder[] validateOrderArray)
    {
        check_orphaned();
        arraySetterHelper(validateOrderArray, VALIDATEORDER$0);
    }
    
    /**
     * Sets ith "ValidateOrder" element
     */
    public void setValidateOrderArray(int i, com.cdiscount.www.ValidateOrder validateOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().find_element_user(VALIDATEORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(validateOrder);
        }
    }
    
    /**
     * Nils the ith "ValidateOrder" element
     */
    public void setNilValidateOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().find_element_user(VALIDATEORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValidateOrder" element
     */
    public com.cdiscount.www.ValidateOrder insertNewValidateOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().insert_element_user(VALIDATEORDER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValidateOrder" element
     */
    public com.cdiscount.www.ValidateOrder addNewValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().add_element_user(VALIDATEORDER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValidateOrder" element
     */
    public void removeValidateOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEORDER$0, i);
        }
    }
}
