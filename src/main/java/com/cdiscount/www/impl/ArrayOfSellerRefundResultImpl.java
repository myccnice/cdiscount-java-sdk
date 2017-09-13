/*
 * XML Type:  ArrayOfSellerRefundResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSellerRefundResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfSellerRefundResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfSellerRefundResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSellerRefundResult
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSellerRefundResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundResult");
    
    
    /**
     * Gets array of all "SellerRefundResult" elements
     */
    public com.cdiscount.www.SellerRefundResult[] getSellerRefundResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELLERREFUNDRESULT$0, targetList);
            com.cdiscount.www.SellerRefundResult[] result = new com.cdiscount.www.SellerRefundResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SellerRefundResult" element
     */
    public com.cdiscount.www.SellerRefundResult getSellerRefundResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SellerRefundResult" element
     */
    public boolean isNilSellerRefundResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SellerRefundResult" element
     */
    public int sizeOfSellerRefundResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERREFUNDRESULT$0);
        }
    }
    
    /**
     * Sets array of all "SellerRefundResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSellerRefundResultArray(com.cdiscount.www.SellerRefundResult[] sellerRefundResultArray)
    {
        check_orphaned();
        arraySetterHelper(sellerRefundResultArray, SELLERREFUNDRESULT$0);
    }
    
    /**
     * Sets ith "SellerRefundResult" element
     */
    public void setSellerRefundResultArray(int i, com.cdiscount.www.SellerRefundResult sellerRefundResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sellerRefundResult);
        }
    }
    
    /**
     * Nils the ith "SellerRefundResult" element
     */
    public void setNilSellerRefundResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SellerRefundResult" element
     */
    public com.cdiscount.www.SellerRefundResult insertNewSellerRefundResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().insert_element_user(SELLERREFUNDRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SellerRefundResult" element
     */
    public com.cdiscount.www.SellerRefundResult addNewSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().add_element_user(SELLERREFUNDRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SellerRefundResult" element
     */
    public void removeSellerRefundResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERREFUNDRESULT$0, i);
        }
    }
}
