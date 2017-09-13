/*
 * XML Type:  ArrayOfRefundInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfRefundInformation
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfRefundInformation(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfRefundInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfRefundInformation
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRefundInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFUNDINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundInformation");
    
    
    /**
     * Gets array of all "RefundInformation" elements
     */
    public com.cdiscount.www.RefundInformation[] getRefundInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFUNDINFORMATION$0, targetList);
            com.cdiscount.www.RefundInformation[] result = new com.cdiscount.www.RefundInformation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RefundInformation" element
     */
    public com.cdiscount.www.RefundInformation getRefundInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RefundInformation" element
     */
    public boolean isNilRefundInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RefundInformation" element
     */
    public int sizeOfRefundInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFUNDINFORMATION$0);
        }
    }
    
    /**
     * Sets array of all "RefundInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRefundInformationArray(com.cdiscount.www.RefundInformation[] refundInformationArray)
    {
        check_orphaned();
        arraySetterHelper(refundInformationArray, REFUNDINFORMATION$0);
    }
    
    /**
     * Sets ith "RefundInformation" element
     */
    public void setRefundInformationArray(int i, com.cdiscount.www.RefundInformation refundInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(refundInformation);
        }
    }
    
    /**
     * Nils the ith "RefundInformation" element
     */
    public void setNilRefundInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefundInformation" element
     */
    public com.cdiscount.www.RefundInformation insertNewRefundInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().insert_element_user(REFUNDINFORMATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RefundInformation" element
     */
    public com.cdiscount.www.RefundInformation addNewRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().add_element_user(REFUNDINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RefundInformation" element
     */
    public void removeRefundInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFUNDINFORMATION$0, i);
        }
    }
}
