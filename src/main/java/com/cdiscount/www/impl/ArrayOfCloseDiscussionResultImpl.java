/*
 * XML Type:  ArrayOfCloseDiscussionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfCloseDiscussionResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfCloseDiscussionResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfCloseDiscussionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfCloseDiscussionResult
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCloseDiscussionResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionResult");
    
    
    /**
     * Gets array of all "CloseDiscussionResult" elements
     */
    public com.cdiscount.www.CloseDiscussionResult[] getCloseDiscussionResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLOSEDISCUSSIONRESULT$0, targetList);
            com.cdiscount.www.CloseDiscussionResult[] result = new com.cdiscount.www.CloseDiscussionResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CloseDiscussionResult" element
     */
    public com.cdiscount.www.CloseDiscussionResult getCloseDiscussionResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CloseDiscussionResult" element
     */
    public boolean isNilCloseDiscussionResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CloseDiscussionResult" element
     */
    public int sizeOfCloseDiscussionResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSEDISCUSSIONRESULT$0);
        }
    }
    
    /**
     * Sets array of all "CloseDiscussionResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCloseDiscussionResultArray(com.cdiscount.www.CloseDiscussionResult[] closeDiscussionResultArray)
    {
        check_orphaned();
        arraySetterHelper(closeDiscussionResultArray, CLOSEDISCUSSIONRESULT$0);
    }
    
    /**
     * Sets ith "CloseDiscussionResult" element
     */
    public void setCloseDiscussionResultArray(int i, com.cdiscount.www.CloseDiscussionResult closeDiscussionResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(closeDiscussionResult);
        }
    }
    
    /**
     * Nils the ith "CloseDiscussionResult" element
     */
    public void setNilCloseDiscussionResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CloseDiscussionResult" element
     */
    public com.cdiscount.www.CloseDiscussionResult insertNewCloseDiscussionResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().insert_element_user(CLOSEDISCUSSIONRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CloseDiscussionResult" element
     */
    public com.cdiscount.www.CloseDiscussionResult addNewCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().add_element_user(CLOSEDISCUSSIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CloseDiscussionResult" element
     */
    public void removeCloseDiscussionResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSEDISCUSSIONRESULT$0, i);
        }
    }
}
