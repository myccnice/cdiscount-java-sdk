/*
 * XML Type:  ArrayOfSupplyOrderReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSupplyOrderReport
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfSupplyOrderReport(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfSupplyOrderReportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSupplyOrderReport
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSupplyOrderReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREPORT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderReport");
    
    
    /**
     * Gets array of all "SupplyOrderReport" elements
     */
    public com.cdiscount.www.SupplyOrderReport[] getSupplyOrderReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPLYORDERREPORT$0, targetList);
            com.cdiscount.www.SupplyOrderReport[] result = new com.cdiscount.www.SupplyOrderReport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SupplyOrderReport" element
     */
    public com.cdiscount.www.SupplyOrderReport getSupplyOrderReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().find_element_user(SUPPLYORDERREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SupplyOrderReport" element
     */
    public boolean isNilSupplyOrderReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().find_element_user(SUPPLYORDERREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SupplyOrderReport" element
     */
    public int sizeOfSupplyOrderReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYORDERREPORT$0);
        }
    }
    
    /**
     * Sets array of all "SupplyOrderReport" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupplyOrderReportArray(com.cdiscount.www.SupplyOrderReport[] supplyOrderReportArray)
    {
        check_orphaned();
        arraySetterHelper(supplyOrderReportArray, SUPPLYORDERREPORT$0);
    }
    
    /**
     * Sets ith "SupplyOrderReport" element
     */
    public void setSupplyOrderReportArray(int i, com.cdiscount.www.SupplyOrderReport supplyOrderReport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().find_element_user(SUPPLYORDERREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supplyOrderReport);
        }
    }
    
    /**
     * Nils the ith "SupplyOrderReport" element
     */
    public void setNilSupplyOrderReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().find_element_user(SUPPLYORDERREPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupplyOrderReport" element
     */
    public com.cdiscount.www.SupplyOrderReport insertNewSupplyOrderReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().insert_element_user(SUPPLYORDERREPORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupplyOrderReport" element
     */
    public com.cdiscount.www.SupplyOrderReport addNewSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().add_element_user(SUPPLYORDERREPORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SupplyOrderReport" element
     */
    public void removeSupplyOrderReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYORDERREPORT$0, i);
        }
    }
}
