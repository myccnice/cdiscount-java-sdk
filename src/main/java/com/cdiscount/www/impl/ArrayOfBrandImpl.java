/*
 * XML Type:  ArrayOfBrand
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfBrand
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfBrand(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfBrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfBrand
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBrandImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRAND$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Brand");
    
    
    /**
     * Gets array of all "Brand" elements
     */
    public com.cdiscount.www.Brand[] getBrandArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BRAND$0, targetList);
            com.cdiscount.www.Brand[] result = new com.cdiscount.www.Brand[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Brand" element
     */
    public com.cdiscount.www.Brand getBrandArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().find_element_user(BRAND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Brand" element
     */
    public boolean isNilBrandArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().find_element_user(BRAND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Brand" element
     */
    public int sizeOfBrandArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRAND$0);
        }
    }
    
    /**
     * Sets array of all "Brand" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBrandArray(com.cdiscount.www.Brand[] brandArray)
    {
        check_orphaned();
        arraySetterHelper(brandArray, BRAND$0);
    }
    
    /**
     * Sets ith "Brand" element
     */
    public void setBrandArray(int i, com.cdiscount.www.Brand brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().find_element_user(BRAND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(brand);
        }
    }
    
    /**
     * Nils the ith "Brand" element
     */
    public void setNilBrandArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().find_element_user(BRAND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Brand" element
     */
    public com.cdiscount.www.Brand insertNewBrand(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().insert_element_user(BRAND$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Brand" element
     */
    public com.cdiscount.www.Brand addNewBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().add_element_user(BRAND$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Brand" element
     */
    public void removeBrand(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRAND$0, i);
        }
    }
}
