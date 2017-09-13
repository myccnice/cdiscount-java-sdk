/*
 * XML Type:  ArrayOfDeliveryModeInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDeliveryModeInformation
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfDeliveryModeInformation(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfDeliveryModeInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDeliveryModeInformation
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDeliveryModeInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYMODEINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DeliveryModeInformation");
    
    
    /**
     * Gets array of all "DeliveryModeInformation" elements
     */
    public com.cdiscount.www.DeliveryModeInformation[] getDeliveryModeInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYMODEINFORMATION$0, targetList);
            com.cdiscount.www.DeliveryModeInformation[] result = new com.cdiscount.www.DeliveryModeInformation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DeliveryModeInformation" element
     */
    public com.cdiscount.www.DeliveryModeInformation getDeliveryModeInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODEINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "DeliveryModeInformation" element
     */
    public boolean isNilDeliveryModeInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODEINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "DeliveryModeInformation" element
     */
    public int sizeOfDeliveryModeInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYMODEINFORMATION$0);
        }
    }
    
    /**
     * Sets array of all "DeliveryModeInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeliveryModeInformationArray(com.cdiscount.www.DeliveryModeInformation[] deliveryModeInformationArray)
    {
        check_orphaned();
        arraySetterHelper(deliveryModeInformationArray, DELIVERYMODEINFORMATION$0);
    }
    
    /**
     * Sets ith "DeliveryModeInformation" element
     */
    public void setDeliveryModeInformationArray(int i, com.cdiscount.www.DeliveryModeInformation deliveryModeInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODEINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryModeInformation);
        }
    }
    
    /**
     * Nils the ith "DeliveryModeInformation" element
     */
    public void setNilDeliveryModeInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODEINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DeliveryModeInformation" element
     */
    public com.cdiscount.www.DeliveryModeInformation insertNewDeliveryModeInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().insert_element_user(DELIVERYMODEINFORMATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DeliveryModeInformation" element
     */
    public com.cdiscount.www.DeliveryModeInformation addNewDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().add_element_user(DELIVERYMODEINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DeliveryModeInformation" element
     */
    public void removeDeliveryModeInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYMODEINFORMATION$0, i);
        }
    }
}
