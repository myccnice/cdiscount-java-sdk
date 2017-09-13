/*
 * XML Type:  ArrayOfProduct
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProduct
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfProduct(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProduct
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Product");
    
    
    /**
     * Gets array of all "Product" elements
     */
    public com.cdiscount.www.Product[] getProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCT$0, targetList);
            com.cdiscount.www.Product[] result = new com.cdiscount.www.Product[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Product" element
     */
    public com.cdiscount.www.Product getProductArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Product" element
     */
    public boolean isNilProductArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Product" element
     */
    public int sizeOfProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCT$0);
        }
    }
    
    /**
     * Sets array of all "Product" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductArray(com.cdiscount.www.Product[] productArray)
    {
        check_orphaned();
        arraySetterHelper(productArray, PRODUCT$0);
    }
    
    /**
     * Sets ith "Product" element
     */
    public void setProductArray(int i, com.cdiscount.www.Product product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(product);
        }
    }
    
    /**
     * Nils the ith "Product" element
     */
    public void setNilProductArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().find_element_user(PRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Product" element
     */
    public com.cdiscount.www.Product insertNewProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().insert_element_user(PRODUCT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Product" element
     */
    public com.cdiscount.www.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().add_element_user(PRODUCT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Product" element
     */
    public void removeProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCT$0, i);
        }
    }
}
