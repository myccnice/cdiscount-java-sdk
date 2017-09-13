/*
 * XML Type:  ArrayOfValidateOrderResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrderResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfValidateOrderResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrderResult
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderResult");
    
    
    /**
     * Gets array of all "ValidateOrderResult" elements
     */
    public com.cdiscount.www.ValidateOrderResult[] getValidateOrderResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALIDATEORDERRESULT$0, targetList);
            com.cdiscount.www.ValidateOrderResult[] result = new com.cdiscount.www.ValidateOrderResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValidateOrderResult" element
     */
    public com.cdiscount.www.ValidateOrderResult getValidateOrderResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ValidateOrderResult" element
     */
    public boolean isNilValidateOrderResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ValidateOrderResult" element
     */
    public int sizeOfValidateOrderResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEORDERRESULT$0);
        }
    }
    
    /**
     * Sets array of all "ValidateOrderResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValidateOrderResultArray(com.cdiscount.www.ValidateOrderResult[] validateOrderResultArray)
    {
        check_orphaned();
        arraySetterHelper(validateOrderResultArray, VALIDATEORDERRESULT$0);
    }
    
    /**
     * Sets ith "ValidateOrderResult" element
     */
    public void setValidateOrderResultArray(int i, com.cdiscount.www.ValidateOrderResult validateOrderResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(validateOrderResult);
        }
    }
    
    /**
     * Nils the ith "ValidateOrderResult" element
     */
    public void setNilValidateOrderResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValidateOrderResult" element
     */
    public com.cdiscount.www.ValidateOrderResult insertNewValidateOrderResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().insert_element_user(VALIDATEORDERRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValidateOrderResult" element
     */
    public com.cdiscount.www.ValidateOrderResult addNewValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().add_element_user(VALIDATEORDERRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValidateOrderResult" element
     */
    public void removeValidateOrderResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEORDERRESULT$0, i);
        }
    }
}
