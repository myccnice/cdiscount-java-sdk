/*
 * XML Type:  ArrayOfShippingInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfShippingInformation
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfShippingInformation(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfShippingInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfShippingInformation
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfShippingInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPPINGINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingInformation");
    
    
    /**
     * Gets array of all "ShippingInformation" elements
     */
    public com.cdiscount.www.ShippingInformation[] getShippingInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHIPPINGINFORMATION$0, targetList);
            com.cdiscount.www.ShippingInformation[] result = new com.cdiscount.www.ShippingInformation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ShippingInformation" element
     */
    public com.cdiscount.www.ShippingInformation getShippingInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().find_element_user(SHIPPINGINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ShippingInformation" element
     */
    public boolean isNilShippingInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().find_element_user(SHIPPINGINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ShippingInformation" element
     */
    public int sizeOfShippingInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGINFORMATION$0);
        }
    }
    
    /**
     * Sets array of all "ShippingInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setShippingInformationArray(com.cdiscount.www.ShippingInformation[] shippingInformationArray)
    {
        check_orphaned();
        arraySetterHelper(shippingInformationArray, SHIPPINGINFORMATION$0);
    }
    
    /**
     * Sets ith "ShippingInformation" element
     */
    public void setShippingInformationArray(int i, com.cdiscount.www.ShippingInformation shippingInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().find_element_user(SHIPPINGINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shippingInformation);
        }
    }
    
    /**
     * Nils the ith "ShippingInformation" element
     */
    public void setNilShippingInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().find_element_user(SHIPPINGINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ShippingInformation" element
     */
    public com.cdiscount.www.ShippingInformation insertNewShippingInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().insert_element_user(SHIPPINGINFORMATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ShippingInformation" element
     */
    public com.cdiscount.www.ShippingInformation addNewShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().add_element_user(SHIPPINGINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ShippingInformation" element
     */
    public void removeShippingInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGINFORMATION$0, i);
        }
    }
}
