/*
 * XML Type:  ArrayOfFulfilmentOrderLineRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfFulfilmentOrderLineRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentOrderLineRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentOrderLineRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTORDERLINEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentOrderLineRequest");
    
    
    /**
     * Gets array of all "FulfilmentOrderLineRequest" elements
     */
    public com.cdiscount.www.FulfilmentOrderLineRequest[] getFulfilmentOrderLineRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FULFILMENTORDERLINEREQUEST$0, targetList);
            com.cdiscount.www.FulfilmentOrderLineRequest[] result = new com.cdiscount.www.FulfilmentOrderLineRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FulfilmentOrderLineRequest" element
     */
    public com.cdiscount.www.FulfilmentOrderLineRequest getFulfilmentOrderLineRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().find_element_user(FULFILMENTORDERLINEREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "FulfilmentOrderLineRequest" element
     */
    public boolean isNilFulfilmentOrderLineRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().find_element_user(FULFILMENTORDERLINEREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "FulfilmentOrderLineRequest" element
     */
    public int sizeOfFulfilmentOrderLineRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILMENTORDERLINEREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "FulfilmentOrderLineRequest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFulfilmentOrderLineRequestArray(com.cdiscount.www.FulfilmentOrderLineRequest[] fulfilmentOrderLineRequestArray)
    {
        check_orphaned();
        arraySetterHelper(fulfilmentOrderLineRequestArray, FULFILMENTORDERLINEREQUEST$0);
    }
    
    /**
     * Sets ith "FulfilmentOrderLineRequest" element
     */
    public void setFulfilmentOrderLineRequestArray(int i, com.cdiscount.www.FulfilmentOrderLineRequest fulfilmentOrderLineRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().find_element_user(FULFILMENTORDERLINEREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fulfilmentOrderLineRequest);
        }
    }
    
    /**
     * Nils the ith "FulfilmentOrderLineRequest" element
     */
    public void setNilFulfilmentOrderLineRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().find_element_user(FULFILMENTORDERLINEREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FulfilmentOrderLineRequest" element
     */
    public com.cdiscount.www.FulfilmentOrderLineRequest insertNewFulfilmentOrderLineRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().insert_element_user(FULFILMENTORDERLINEREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FulfilmentOrderLineRequest" element
     */
    public com.cdiscount.www.FulfilmentOrderLineRequest addNewFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().add_element_user(FULFILMENTORDERLINEREQUEST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FulfilmentOrderLineRequest" element
     */
    public void removeFulfilmentOrderLineRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILMENTORDERLINEREQUEST$0, i);
        }
    }
}
