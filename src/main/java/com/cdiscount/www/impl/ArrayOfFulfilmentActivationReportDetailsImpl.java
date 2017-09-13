/*
 * XML Type:  ArrayOfFulfilmentActivationReportDetails
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfFulfilmentActivationReportDetails(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentActivationReportDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentActivationReportDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREPORTDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationReportDetails");
    
    
    /**
     * Gets array of all "FulfilmentActivationReportDetails" elements
     */
    public com.cdiscount.www.FulfilmentActivationReportDetails[] getFulfilmentActivationReportDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FULFILMENTACTIVATIONREPORTDETAILS$0, targetList);
            com.cdiscount.www.FulfilmentActivationReportDetails[] result = new com.cdiscount.www.FulfilmentActivationReportDetails[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FulfilmentActivationReportDetails" element
     */
    public com.cdiscount.www.FulfilmentActivationReportDetails getFulfilmentActivationReportDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().find_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "FulfilmentActivationReportDetails" element
     */
    public boolean isNilFulfilmentActivationReportDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().find_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "FulfilmentActivationReportDetails" element
     */
    public int sizeOfFulfilmentActivationReportDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILMENTACTIVATIONREPORTDETAILS$0);
        }
    }
    
    /**
     * Sets array of all "FulfilmentActivationReportDetails" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFulfilmentActivationReportDetailsArray(com.cdiscount.www.FulfilmentActivationReportDetails[] fulfilmentActivationReportDetailsArray)
    {
        check_orphaned();
        arraySetterHelper(fulfilmentActivationReportDetailsArray, FULFILMENTACTIVATIONREPORTDETAILS$0);
    }
    
    /**
     * Sets ith "FulfilmentActivationReportDetails" element
     */
    public void setFulfilmentActivationReportDetailsArray(int i, com.cdiscount.www.FulfilmentActivationReportDetails fulfilmentActivationReportDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().find_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fulfilmentActivationReportDetails);
        }
    }
    
    /**
     * Nils the ith "FulfilmentActivationReportDetails" element
     */
    public void setNilFulfilmentActivationReportDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().find_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FulfilmentActivationReportDetails" element
     */
    public com.cdiscount.www.FulfilmentActivationReportDetails insertNewFulfilmentActivationReportDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().insert_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FulfilmentActivationReportDetails" element
     */
    public com.cdiscount.www.FulfilmentActivationReportDetails addNewFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().add_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FulfilmentActivationReportDetails" element
     */
    public void removeFulfilmentActivationReportDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILMENTACTIVATIONREPORTDETAILS$0, i);
        }
    }
}
