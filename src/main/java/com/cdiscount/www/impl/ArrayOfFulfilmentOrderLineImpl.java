/*
 * XML Type:  ArrayOfFulfilmentOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfFulfilmentOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentOrderLine");
    
    
    /**
     * Gets array of all "FulfilmentOrderLine" elements
     */
    public com.cdiscount.www.FulfilmentOrderLine[] getFulfilmentOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FULFILMENTORDERLINE$0, targetList);
            com.cdiscount.www.FulfilmentOrderLine[] result = new com.cdiscount.www.FulfilmentOrderLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FulfilmentOrderLine" element
     */
    public com.cdiscount.www.FulfilmentOrderLine getFulfilmentOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().find_element_user(FULFILMENTORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "FulfilmentOrderLine" element
     */
    public boolean isNilFulfilmentOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().find_element_user(FULFILMENTORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "FulfilmentOrderLine" element
     */
    public int sizeOfFulfilmentOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILMENTORDERLINE$0);
        }
    }
    
    /**
     * Sets array of all "FulfilmentOrderLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFulfilmentOrderLineArray(com.cdiscount.www.FulfilmentOrderLine[] fulfilmentOrderLineArray)
    {
        check_orphaned();
        arraySetterHelper(fulfilmentOrderLineArray, FULFILMENTORDERLINE$0);
    }
    
    /**
     * Sets ith "FulfilmentOrderLine" element
     */
    public void setFulfilmentOrderLineArray(int i, com.cdiscount.www.FulfilmentOrderLine fulfilmentOrderLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().find_element_user(FULFILMENTORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fulfilmentOrderLine);
        }
    }
    
    /**
     * Nils the ith "FulfilmentOrderLine" element
     */
    public void setNilFulfilmentOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().find_element_user(FULFILMENTORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FulfilmentOrderLine" element
     */
    public com.cdiscount.www.FulfilmentOrderLine insertNewFulfilmentOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().insert_element_user(FULFILMENTORDERLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FulfilmentOrderLine" element
     */
    public com.cdiscount.www.FulfilmentOrderLine addNewFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().add_element_user(FULFILMENTORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FulfilmentOrderLine" element
     */
    public void removeFulfilmentOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILMENTORDERLINE$0, i);
        }
    }
}
