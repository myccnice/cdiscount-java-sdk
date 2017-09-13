/*
 * XML Type:  ArrayOfFulfilmentActivationReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentActivationReport
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfFulfilmentActivationReport(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentActivationReportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentActivationReport
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentActivationReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREPORT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationReport");
    
    
    /**
     * Gets array of all "FulfilmentActivationReport" elements
     */
    public com.cdiscount.www.FulfilmentActivationReport[] getFulfilmentActivationReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FULFILMENTACTIVATIONREPORT$0, targetList);
            com.cdiscount.www.FulfilmentActivationReport[] result = new com.cdiscount.www.FulfilmentActivationReport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FulfilmentActivationReport" element
     */
    public com.cdiscount.www.FulfilmentActivationReport getFulfilmentActivationReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "FulfilmentActivationReport" element
     */
    public boolean isNilFulfilmentActivationReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "FulfilmentActivationReport" element
     */
    public int sizeOfFulfilmentActivationReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILMENTACTIVATIONREPORT$0);
        }
    }
    
    /**
     * Sets array of all "FulfilmentActivationReport" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFulfilmentActivationReportArray(com.cdiscount.www.FulfilmentActivationReport[] fulfilmentActivationReportArray)
    {
        check_orphaned();
        arraySetterHelper(fulfilmentActivationReportArray, FULFILMENTACTIVATIONREPORT$0);
    }
    
    /**
     * Sets ith "FulfilmentActivationReport" element
     */
    public void setFulfilmentActivationReportArray(int i, com.cdiscount.www.FulfilmentActivationReport fulfilmentActivationReport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fulfilmentActivationReport);
        }
    }
    
    /**
     * Nils the ith "FulfilmentActivationReport" element
     */
    public void setNilFulfilmentActivationReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FulfilmentActivationReport" element
     */
    public com.cdiscount.www.FulfilmentActivationReport insertNewFulfilmentActivationReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().insert_element_user(FULFILMENTACTIVATIONREPORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FulfilmentActivationReport" element
     */
    public com.cdiscount.www.FulfilmentActivationReport addNewFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().add_element_user(FULFILMENTACTIVATIONREPORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FulfilmentActivationReport" element
     */
    public void removeFulfilmentActivationReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILMENTACTIVATIONREPORT$0, i);
        }
    }
}
