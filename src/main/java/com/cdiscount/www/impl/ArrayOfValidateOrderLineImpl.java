/*
 * XML Type:  ArrayOfValidateOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfValidateOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderLine");
    
    
    /**
     * Gets array of all "ValidateOrderLine" elements
     */
    public com.cdiscount.www.ValidateOrderLine[] getValidateOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALIDATEORDERLINE$0, targetList);
            com.cdiscount.www.ValidateOrderLine[] result = new com.cdiscount.www.ValidateOrderLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValidateOrderLine" element
     */
    public com.cdiscount.www.ValidateOrderLine getValidateOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().find_element_user(VALIDATEORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ValidateOrderLine" element
     */
    public boolean isNilValidateOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().find_element_user(VALIDATEORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ValidateOrderLine" element
     */
    public int sizeOfValidateOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEORDERLINE$0);
        }
    }
    
    /**
     * Sets array of all "ValidateOrderLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValidateOrderLineArray(com.cdiscount.www.ValidateOrderLine[] validateOrderLineArray)
    {
        check_orphaned();
        arraySetterHelper(validateOrderLineArray, VALIDATEORDERLINE$0);
    }
    
    /**
     * Sets ith "ValidateOrderLine" element
     */
    public void setValidateOrderLineArray(int i, com.cdiscount.www.ValidateOrderLine validateOrderLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().find_element_user(VALIDATEORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(validateOrderLine);
        }
    }
    
    /**
     * Nils the ith "ValidateOrderLine" element
     */
    public void setNilValidateOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().find_element_user(VALIDATEORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValidateOrderLine" element
     */
    public com.cdiscount.www.ValidateOrderLine insertNewValidateOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().insert_element_user(VALIDATEORDERLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValidateOrderLine" element
     */
    public com.cdiscount.www.ValidateOrderLine addNewValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().add_element_user(VALIDATEORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValidateOrderLine" element
     */
    public void removeValidateOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEORDERLINE$0, i);
        }
    }
}
