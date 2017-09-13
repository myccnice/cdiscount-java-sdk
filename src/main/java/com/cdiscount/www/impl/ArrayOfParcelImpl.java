/*
 * XML Type:  ArrayOfParcel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcel
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfParcel(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfParcelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcel
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Parcel");
    
    
    /**
     * Gets array of all "Parcel" elements
     */
    public com.cdiscount.www.Parcel[] getParcelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARCEL$0, targetList);
            com.cdiscount.www.Parcel[] result = new com.cdiscount.www.Parcel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Parcel" element
     */
    public com.cdiscount.www.Parcel getParcelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().find_element_user(PARCEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Parcel" element
     */
    public boolean isNilParcelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().find_element_user(PARCEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Parcel" element
     */
    public int sizeOfParcelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCEL$0);
        }
    }
    
    /**
     * Sets array of all "Parcel" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParcelArray(com.cdiscount.www.Parcel[] parcelArray)
    {
        check_orphaned();
        arraySetterHelper(parcelArray, PARCEL$0);
    }
    
    /**
     * Sets ith "Parcel" element
     */
    public void setParcelArray(int i, com.cdiscount.www.Parcel parcel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().find_element_user(PARCEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parcel);
        }
    }
    
    /**
     * Nils the ith "Parcel" element
     */
    public void setNilParcelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().find_element_user(PARCEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parcel" element
     */
    public com.cdiscount.www.Parcel insertNewParcel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().insert_element_user(PARCEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Parcel" element
     */
    public com.cdiscount.www.Parcel addNewParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().add_element_user(PARCEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Parcel" element
     */
    public void removeParcel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCEL$0, i);
        }
    }
}
