/*
 * XML Type:  ArrayOfParcelActionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelActionResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfParcelActionResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfParcelActionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelActionResult
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelActionResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELACTIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelActionResult");
    
    
    /**
     * Gets array of all "ParcelActionResult" elements
     */
    public com.cdiscount.www.ParcelActionResult[] getParcelActionResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARCELACTIONRESULT$0, targetList);
            com.cdiscount.www.ParcelActionResult[] result = new com.cdiscount.www.ParcelActionResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ParcelActionResult" element
     */
    public com.cdiscount.www.ParcelActionResult getParcelActionResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().find_element_user(PARCELACTIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ParcelActionResult" element
     */
    public boolean isNilParcelActionResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().find_element_user(PARCELACTIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ParcelActionResult" element
     */
    public int sizeOfParcelActionResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELACTIONRESULT$0);
        }
    }
    
    /**
     * Sets array of all "ParcelActionResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParcelActionResultArray(com.cdiscount.www.ParcelActionResult[] parcelActionResultArray)
    {
        check_orphaned();
        arraySetterHelper(parcelActionResultArray, PARCELACTIONRESULT$0);
    }
    
    /**
     * Sets ith "ParcelActionResult" element
     */
    public void setParcelActionResultArray(int i, com.cdiscount.www.ParcelActionResult parcelActionResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().find_element_user(PARCELACTIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parcelActionResult);
        }
    }
    
    /**
     * Nils the ith "ParcelActionResult" element
     */
    public void setNilParcelActionResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().find_element_user(PARCELACTIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ParcelActionResult" element
     */
    public com.cdiscount.www.ParcelActionResult insertNewParcelActionResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().insert_element_user(PARCELACTIONRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ParcelActionResult" element
     */
    public com.cdiscount.www.ParcelActionResult addNewParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().add_element_user(PARCELACTIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ParcelActionResult" element
     */
    public void removeParcelActionResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELACTIONRESULT$0, i);
        }
    }
}
