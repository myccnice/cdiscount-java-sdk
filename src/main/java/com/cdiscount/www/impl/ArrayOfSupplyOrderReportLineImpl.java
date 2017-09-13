/*
 * XML Type:  ArrayOfSupplyOrderReportLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSupplyOrderReportLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfSupplyOrderReportLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfSupplyOrderReportLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSupplyOrderReportLine
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSupplyOrderReportLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREPORTLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderReportLine");
    
    
    /**
     * Gets array of all "SupplyOrderReportLine" elements
     */
    public com.cdiscount.www.SupplyOrderReportLine[] getSupplyOrderReportLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPLYORDERREPORTLINE$0, targetList);
            com.cdiscount.www.SupplyOrderReportLine[] result = new com.cdiscount.www.SupplyOrderReportLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SupplyOrderReportLine" element
     */
    public com.cdiscount.www.SupplyOrderReportLine getSupplyOrderReportLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().find_element_user(SUPPLYORDERREPORTLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SupplyOrderReportLine" element
     */
    public boolean isNilSupplyOrderReportLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().find_element_user(SUPPLYORDERREPORTLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SupplyOrderReportLine" element
     */
    public int sizeOfSupplyOrderReportLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYORDERREPORTLINE$0);
        }
    }
    
    /**
     * Sets array of all "SupplyOrderReportLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupplyOrderReportLineArray(com.cdiscount.www.SupplyOrderReportLine[] supplyOrderReportLineArray)
    {
        check_orphaned();
        arraySetterHelper(supplyOrderReportLineArray, SUPPLYORDERREPORTLINE$0);
    }
    
    /**
     * Sets ith "SupplyOrderReportLine" element
     */
    public void setSupplyOrderReportLineArray(int i, com.cdiscount.www.SupplyOrderReportLine supplyOrderReportLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().find_element_user(SUPPLYORDERREPORTLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supplyOrderReportLine);
        }
    }
    
    /**
     * Nils the ith "SupplyOrderReportLine" element
     */
    public void setNilSupplyOrderReportLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().find_element_user(SUPPLYORDERREPORTLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupplyOrderReportLine" element
     */
    public com.cdiscount.www.SupplyOrderReportLine insertNewSupplyOrderReportLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().insert_element_user(SUPPLYORDERREPORTLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupplyOrderReportLine" element
     */
    public com.cdiscount.www.SupplyOrderReportLine addNewSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().add_element_user(SUPPLYORDERREPORTLINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SupplyOrderReportLine" element
     */
    public void removeSupplyOrderReportLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYORDERREPORTLINE$0, i);
        }
    }
}
