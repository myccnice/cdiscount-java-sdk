/*
 * XML Type:  ArrayOfParcelInfos
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelInfos
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfParcelInfos(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfParcelInfosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelInfos
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelInfosImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELINFOS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelInfos");
    
    
    /**
     * Gets array of all "ParcelInfos" elements
     */
    public com.cdiscount.www.ParcelInfos[] getParcelInfosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARCELINFOS$0, targetList);
            com.cdiscount.www.ParcelInfos[] result = new com.cdiscount.www.ParcelInfos[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ParcelInfos" element
     */
    public com.cdiscount.www.ParcelInfos getParcelInfosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().find_element_user(PARCELINFOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ParcelInfos" element
     */
    public boolean isNilParcelInfosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().find_element_user(PARCELINFOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ParcelInfos" element
     */
    public int sizeOfParcelInfosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELINFOS$0);
        }
    }
    
    /**
     * Sets array of all "ParcelInfos" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParcelInfosArray(com.cdiscount.www.ParcelInfos[] parcelInfosArray)
    {
        check_orphaned();
        arraySetterHelper(parcelInfosArray, PARCELINFOS$0);
    }
    
    /**
     * Sets ith "ParcelInfos" element
     */
    public void setParcelInfosArray(int i, com.cdiscount.www.ParcelInfos parcelInfos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().find_element_user(PARCELINFOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parcelInfos);
        }
    }
    
    /**
     * Nils the ith "ParcelInfos" element
     */
    public void setNilParcelInfosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().find_element_user(PARCELINFOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ParcelInfos" element
     */
    public com.cdiscount.www.ParcelInfos insertNewParcelInfos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().insert_element_user(PARCELINFOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ParcelInfos" element
     */
    public com.cdiscount.www.ParcelInfos addNewParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().add_element_user(PARCELINFOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ParcelInfos" element
     */
    public void removeParcelInfos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELINFOS$0, i);
        }
    }
}
