/*
 * XML Type:  ArrayOfSellerRefundRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSellerRefundRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfSellerRefundRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfSellerRefundRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSellerRefundRequest
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSellerRefundRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundRequest");
    
    
    /**
     * Gets array of all "SellerRefundRequest" elements
     */
    public com.cdiscount.www.SellerRefundRequest[] getSellerRefundRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELLERREFUNDREQUEST$0, targetList);
            com.cdiscount.www.SellerRefundRequest[] result = new com.cdiscount.www.SellerRefundRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SellerRefundRequest" element
     */
    public com.cdiscount.www.SellerRefundRequest getSellerRefundRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SellerRefundRequest" element
     */
    public boolean isNilSellerRefundRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SellerRefundRequest" element
     */
    public int sizeOfSellerRefundRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERREFUNDREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "SellerRefundRequest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSellerRefundRequestArray(com.cdiscount.www.SellerRefundRequest[] sellerRefundRequestArray)
    {
        check_orphaned();
        arraySetterHelper(sellerRefundRequestArray, SELLERREFUNDREQUEST$0);
    }
    
    /**
     * Sets ith "SellerRefundRequest" element
     */
    public void setSellerRefundRequestArray(int i, com.cdiscount.www.SellerRefundRequest sellerRefundRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sellerRefundRequest);
        }
    }
    
    /**
     * Nils the ith "SellerRefundRequest" element
     */
    public void setNilSellerRefundRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SellerRefundRequest" element
     */
    public com.cdiscount.www.SellerRefundRequest insertNewSellerRefundRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().insert_element_user(SELLERREFUNDREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SellerRefundRequest" element
     */
    public com.cdiscount.www.SellerRefundRequest addNewSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().add_element_user(SELLERREFUNDREQUEST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SellerRefundRequest" element
     */
    public void removeSellerRefundRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERREFUNDREQUEST$0, i);
        }
    }
}
