/*
 * XML Type:  ArrayOfOffer
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOffer
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOffer(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOffer
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Offer");
    
    
    /**
     * Gets array of all "Offer" elements
     */
    public com.cdiscount.www.Offer[] getOfferArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFER$0, targetList);
            com.cdiscount.www.Offer[] result = new com.cdiscount.www.Offer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Offer" element
     */
    public com.cdiscount.www.Offer getOfferArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().find_element_user(OFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Offer" element
     */
    public boolean isNilOfferArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().find_element_user(OFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Offer" element
     */
    public int sizeOfOfferArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFER$0);
        }
    }
    
    /**
     * Sets array of all "Offer" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOfferArray(com.cdiscount.www.Offer[] offerArray)
    {
        check_orphaned();
        arraySetterHelper(offerArray, OFFER$0);
    }
    
    /**
     * Sets ith "Offer" element
     */
    public void setOfferArray(int i, com.cdiscount.www.Offer offer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().find_element_user(OFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offer);
        }
    }
    
    /**
     * Nils the ith "Offer" element
     */
    public void setNilOfferArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().find_element_user(OFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Offer" element
     */
    public com.cdiscount.www.Offer insertNewOffer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().insert_element_user(OFFER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Offer" element
     */
    public com.cdiscount.www.Offer addNewOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().add_element_user(OFFER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Offer" element
     */
    public void removeOffer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFER$0, i);
        }
    }
}
