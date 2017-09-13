/*
 * XML Type:  ArrayOfOfferPool
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferPool
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOfferPool(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOfferPoolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferPool
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferPoolImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERPOOL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPool");
    
    
    /**
     * Gets array of all "OfferPool" elements
     */
    public com.cdiscount.www.OfferPool[] getOfferPoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFERPOOL$0, targetList);
            com.cdiscount.www.OfferPool[] result = new com.cdiscount.www.OfferPool[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OfferPool" element
     */
    public com.cdiscount.www.OfferPool getOfferPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().find_element_user(OFFERPOOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OfferPool" element
     */
    public boolean isNilOfferPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().find_element_user(OFFERPOOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OfferPool" element
     */
    public int sizeOfOfferPoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERPOOL$0);
        }
    }
    
    /**
     * Sets array of all "OfferPool" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOfferPoolArray(com.cdiscount.www.OfferPool[] offerPoolArray)
    {
        check_orphaned();
        arraySetterHelper(offerPoolArray, OFFERPOOL$0);
    }
    
    /**
     * Sets ith "OfferPool" element
     */
    public void setOfferPoolArray(int i, com.cdiscount.www.OfferPool offerPool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().find_element_user(OFFERPOOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offerPool);
        }
    }
    
    /**
     * Nils the ith "OfferPool" element
     */
    public void setNilOfferPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().find_element_user(OFFERPOOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OfferPool" element
     */
    public com.cdiscount.www.OfferPool insertNewOfferPool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().insert_element_user(OFFERPOOL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OfferPool" element
     */
    public com.cdiscount.www.OfferPool addNewOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().add_element_user(OFFERPOOL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OfferPool" element
     */
    public void removeOfferPool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERPOOL$0, i);
        }
    }
}
