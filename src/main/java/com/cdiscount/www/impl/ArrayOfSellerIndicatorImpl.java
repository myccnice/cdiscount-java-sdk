/*
 * XML Type:  ArrayOfSellerIndicator
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSellerIndicator
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfSellerIndicator(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfSellerIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSellerIndicator
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSellerIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERINDICATOR$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerIndicator");
    
    
    /**
     * Gets array of all "SellerIndicator" elements
     */
    public com.cdiscount.www.SellerIndicator[] getSellerIndicatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELLERINDICATOR$0, targetList);
            com.cdiscount.www.SellerIndicator[] result = new com.cdiscount.www.SellerIndicator[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SellerIndicator" element
     */
    public com.cdiscount.www.SellerIndicator getSellerIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().find_element_user(SELLERINDICATOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SellerIndicator" element
     */
    public boolean isNilSellerIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().find_element_user(SELLERINDICATOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SellerIndicator" element
     */
    public int sizeOfSellerIndicatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERINDICATOR$0);
        }
    }
    
    /**
     * Sets array of all "SellerIndicator" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSellerIndicatorArray(com.cdiscount.www.SellerIndicator[] sellerIndicatorArray)
    {
        check_orphaned();
        arraySetterHelper(sellerIndicatorArray, SELLERINDICATOR$0);
    }
    
    /**
     * Sets ith "SellerIndicator" element
     */
    public void setSellerIndicatorArray(int i, com.cdiscount.www.SellerIndicator sellerIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().find_element_user(SELLERINDICATOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sellerIndicator);
        }
    }
    
    /**
     * Nils the ith "SellerIndicator" element
     */
    public void setNilSellerIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().find_element_user(SELLERINDICATOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SellerIndicator" element
     */
    public com.cdiscount.www.SellerIndicator insertNewSellerIndicator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().insert_element_user(SELLERINDICATOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SellerIndicator" element
     */
    public com.cdiscount.www.SellerIndicator addNewSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().add_element_user(SELLERINDICATOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SellerIndicator" element
     */
    public void removeSellerIndicator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERINDICATOR$0, i);
        }
    }
}
