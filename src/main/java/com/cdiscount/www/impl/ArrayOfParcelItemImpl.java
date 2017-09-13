/*
 * XML Type:  ArrayOfParcelItem
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelItem
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfParcelItem(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfParcelItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelItem
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELITEM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelItem");
    
    
    /**
     * Gets array of all "ParcelItem" elements
     */
    public com.cdiscount.www.ParcelItem[] getParcelItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARCELITEM$0, targetList);
            com.cdiscount.www.ParcelItem[] result = new com.cdiscount.www.ParcelItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ParcelItem" element
     */
    public com.cdiscount.www.ParcelItem getParcelItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().find_element_user(PARCELITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ParcelItem" element
     */
    public boolean isNilParcelItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().find_element_user(PARCELITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ParcelItem" element
     */
    public int sizeOfParcelItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELITEM$0);
        }
    }
    
    /**
     * Sets array of all "ParcelItem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParcelItemArray(com.cdiscount.www.ParcelItem[] parcelItemArray)
    {
        check_orphaned();
        arraySetterHelper(parcelItemArray, PARCELITEM$0);
    }
    
    /**
     * Sets ith "ParcelItem" element
     */
    public void setParcelItemArray(int i, com.cdiscount.www.ParcelItem parcelItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().find_element_user(PARCELITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parcelItem);
        }
    }
    
    /**
     * Nils the ith "ParcelItem" element
     */
    public void setNilParcelItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().find_element_user(PARCELITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ParcelItem" element
     */
    public com.cdiscount.www.ParcelItem insertNewParcelItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().insert_element_user(PARCELITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ParcelItem" element
     */
    public com.cdiscount.www.ParcelItem addNewParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().add_element_user(PARCELITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ParcelItem" element
     */
    public void removeParcelItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELITEM$0, i);
        }
    }
}
