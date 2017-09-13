/*
 * XML Type:  ArrayOfProductMatching
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductMatching
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfProductMatching(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfProductMatchingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductMatching
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductMatchingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTMATCHING$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductMatching");
    
    
    /**
     * Gets array of all "ProductMatching" elements
     */
    public com.cdiscount.www.ProductMatching[] getProductMatchingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTMATCHING$0, targetList);
            com.cdiscount.www.ProductMatching[] result = new com.cdiscount.www.ProductMatching[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductMatching" element
     */
    public com.cdiscount.www.ProductMatching getProductMatchingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().find_element_user(PRODUCTMATCHING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProductMatching" element
     */
    public boolean isNilProductMatchingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().find_element_user(PRODUCTMATCHING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProductMatching" element
     */
    public int sizeOfProductMatchingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTMATCHING$0);
        }
    }
    
    /**
     * Sets array of all "ProductMatching" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductMatchingArray(com.cdiscount.www.ProductMatching[] productMatchingArray)
    {
        check_orphaned();
        arraySetterHelper(productMatchingArray, PRODUCTMATCHING$0);
    }
    
    /**
     * Sets ith "ProductMatching" element
     */
    public void setProductMatchingArray(int i, com.cdiscount.www.ProductMatching productMatching)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().find_element_user(PRODUCTMATCHING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productMatching);
        }
    }
    
    /**
     * Nils the ith "ProductMatching" element
     */
    public void setNilProductMatchingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().find_element_user(PRODUCTMATCHING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductMatching" element
     */
    public com.cdiscount.www.ProductMatching insertNewProductMatching(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().insert_element_user(PRODUCTMATCHING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductMatching" element
     */
    public com.cdiscount.www.ProductMatching addNewProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().add_element_user(PRODUCTMATCHING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductMatching" element
     */
    public void removeProductMatching(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTMATCHING$0, i);
        }
    }
}
