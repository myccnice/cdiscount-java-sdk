/*
 * XML Type:  ArrayOfValidateOrderLineResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrderLineResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfValidateOrderLineResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderLineResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrderLineResult
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderLineResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERLINERESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderLineResult");
    
    
    /**
     * Gets array of all "ValidateOrderLineResult" elements
     */
    public com.cdiscount.www.ValidateOrderLineResult[] getValidateOrderLineResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALIDATEORDERLINERESULT$0, targetList);
            com.cdiscount.www.ValidateOrderLineResult[] result = new com.cdiscount.www.ValidateOrderLineResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValidateOrderLineResult" element
     */
    public com.cdiscount.www.ValidateOrderLineResult getValidateOrderLineResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ValidateOrderLineResult" element
     */
    public boolean isNilValidateOrderLineResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ValidateOrderLineResult" element
     */
    public int sizeOfValidateOrderLineResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEORDERLINERESULT$0);
        }
    }
    
    /**
     * Sets array of all "ValidateOrderLineResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValidateOrderLineResultArray(com.cdiscount.www.ValidateOrderLineResult[] validateOrderLineResultArray)
    {
        check_orphaned();
        arraySetterHelper(validateOrderLineResultArray, VALIDATEORDERLINERESULT$0);
    }
    
    /**
     * Sets ith "ValidateOrderLineResult" element
     */
    public void setValidateOrderLineResultArray(int i, com.cdiscount.www.ValidateOrderLineResult validateOrderLineResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(validateOrderLineResult);
        }
    }
    
    /**
     * Nils the ith "ValidateOrderLineResult" element
     */
    public void setNilValidateOrderLineResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValidateOrderLineResult" element
     */
    public com.cdiscount.www.ValidateOrderLineResult insertNewValidateOrderLineResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().insert_element_user(VALIDATEORDERLINERESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValidateOrderLineResult" element
     */
    public com.cdiscount.www.ValidateOrderLineResult addNewValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().add_element_user(VALIDATEORDERLINERESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValidateOrderLineResult" element
     */
    public void removeValidateOrderLineResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEORDERLINERESULT$0, i);
        }
    }
}
