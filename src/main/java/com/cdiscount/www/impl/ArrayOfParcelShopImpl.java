/*
 * XML Type:  ArrayOfParcelShop
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelShop
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfParcelShop(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfParcelShopImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelShop
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelShopImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELSHOP$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelShop");
    
    
    /**
     * Gets array of all "ParcelShop" elements
     */
    public com.cdiscount.www.ParcelShop[] getParcelShopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARCELSHOP$0, targetList);
            com.cdiscount.www.ParcelShop[] result = new com.cdiscount.www.ParcelShop[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ParcelShop" element
     */
    public com.cdiscount.www.ParcelShop getParcelShopArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().find_element_user(PARCELSHOP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ParcelShop" element
     */
    public boolean isNilParcelShopArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().find_element_user(PARCELSHOP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ParcelShop" element
     */
    public int sizeOfParcelShopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELSHOP$0);
        }
    }
    
    /**
     * Sets array of all "ParcelShop" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParcelShopArray(com.cdiscount.www.ParcelShop[] parcelShopArray)
    {
        check_orphaned();
        arraySetterHelper(parcelShopArray, PARCELSHOP$0);
    }
    
    /**
     * Sets ith "ParcelShop" element
     */
    public void setParcelShopArray(int i, com.cdiscount.www.ParcelShop parcelShop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().find_element_user(PARCELSHOP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parcelShop);
        }
    }
    
    /**
     * Nils the ith "ParcelShop" element
     */
    public void setNilParcelShopArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().find_element_user(PARCELSHOP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ParcelShop" element
     */
    public com.cdiscount.www.ParcelShop insertNewParcelShop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().insert_element_user(PARCELSHOP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ParcelShop" element
     */
    public com.cdiscount.www.ParcelShop addNewParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().add_element_user(PARCELSHOP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ParcelShop" element
     */
    public void removeParcelShop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELSHOP$0, i);
        }
    }
}
