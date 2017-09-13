/*
 * XML Type:  ArrayOfSupplyOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSupplyOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfSupplyOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfSupplyOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSupplyOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSupplyOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderLine");
    
    
    /**
     * Gets array of all "SupplyOrderLine" elements
     */
    public com.cdiscount.www.SupplyOrderLine[] getSupplyOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPLYORDERLINE$0, targetList);
            com.cdiscount.www.SupplyOrderLine[] result = new com.cdiscount.www.SupplyOrderLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SupplyOrderLine" element
     */
    public com.cdiscount.www.SupplyOrderLine getSupplyOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SupplyOrderLine" element
     */
    public boolean isNilSupplyOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SupplyOrderLine" element
     */
    public int sizeOfSupplyOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYORDERLINE$0);
        }
    }
    
    /**
     * Sets array of all "SupplyOrderLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupplyOrderLineArray(com.cdiscount.www.SupplyOrderLine[] supplyOrderLineArray)
    {
        check_orphaned();
        arraySetterHelper(supplyOrderLineArray, SUPPLYORDERLINE$0);
    }
    
    /**
     * Sets ith "SupplyOrderLine" element
     */
    public void setSupplyOrderLineArray(int i, com.cdiscount.www.SupplyOrderLine supplyOrderLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supplyOrderLine);
        }
    }
    
    /**
     * Nils the ith "SupplyOrderLine" element
     */
    public void setNilSupplyOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupplyOrderLine" element
     */
    public com.cdiscount.www.SupplyOrderLine insertNewSupplyOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().insert_element_user(SUPPLYORDERLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupplyOrderLine" element
     */
    public com.cdiscount.www.SupplyOrderLine addNewSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().add_element_user(SUPPLYORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SupplyOrderLine" element
     */
    public void removeSupplyOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYORDERLINE$0, i);
        }
    }
}
