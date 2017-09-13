/*
 * XML Type:  ArrayOfCarrier
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfCarrier
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfCarrier(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfCarrierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfCarrier
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCarrierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARRIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Carrier");
    
    
    /**
     * Gets array of all "Carrier" elements
     */
    public com.cdiscount.www.Carrier[] getCarrierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARRIER$0, targetList);
            com.cdiscount.www.Carrier[] result = new com.cdiscount.www.Carrier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Carrier" element
     */
    public com.cdiscount.www.Carrier getCarrierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().find_element_user(CARRIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Carrier" element
     */
    public boolean isNilCarrierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().find_element_user(CARRIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Carrier" element
     */
    public int sizeOfCarrierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARRIER$0);
        }
    }
    
    /**
     * Sets array of all "Carrier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCarrierArray(com.cdiscount.www.Carrier[] carrierArray)
    {
        check_orphaned();
        arraySetterHelper(carrierArray, CARRIER$0);
    }
    
    /**
     * Sets ith "Carrier" element
     */
    public void setCarrierArray(int i, com.cdiscount.www.Carrier carrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().find_element_user(CARRIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(carrier);
        }
    }
    
    /**
     * Nils the ith "Carrier" element
     */
    public void setNilCarrierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().find_element_user(CARRIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Carrier" element
     */
    public com.cdiscount.www.Carrier insertNewCarrier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().insert_element_user(CARRIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Carrier" element
     */
    public com.cdiscount.www.Carrier addNewCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().add_element_user(CARRIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Carrier" element
     */
    public void removeCarrier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARRIER$0, i);
        }
    }
}
