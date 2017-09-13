/*
 * XML Type:  ArrayOfDiscountComponent
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDiscountComponent
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfDiscountComponent(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfDiscountComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDiscountComponent
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDiscountComponentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscountComponent");
    
    
    /**
     * Gets array of all "DiscountComponent" elements
     */
    public com.cdiscount.www.DiscountComponent[] getDiscountComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISCOUNTCOMPONENT$0, targetList);
            com.cdiscount.www.DiscountComponent[] result = new com.cdiscount.www.DiscountComponent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DiscountComponent" element
     */
    public com.cdiscount.www.DiscountComponent getDiscountComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().find_element_user(DISCOUNTCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "DiscountComponent" element
     */
    public boolean isNilDiscountComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().find_element_user(DISCOUNTCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "DiscountComponent" element
     */
    public int sizeOfDiscountComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTCOMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "DiscountComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDiscountComponentArray(com.cdiscount.www.DiscountComponent[] discountComponentArray)
    {
        check_orphaned();
        arraySetterHelper(discountComponentArray, DISCOUNTCOMPONENT$0);
    }
    
    /**
     * Sets ith "DiscountComponent" element
     */
    public void setDiscountComponentArray(int i, com.cdiscount.www.DiscountComponent discountComponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().find_element_user(DISCOUNTCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(discountComponent);
        }
    }
    
    /**
     * Nils the ith "DiscountComponent" element
     */
    public void setNilDiscountComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().find_element_user(DISCOUNTCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DiscountComponent" element
     */
    public com.cdiscount.www.DiscountComponent insertNewDiscountComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().insert_element_user(DISCOUNTCOMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DiscountComponent" element
     */
    public com.cdiscount.www.DiscountComponent addNewDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().add_element_user(DISCOUNTCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DiscountComponent" element
     */
    public void removeDiscountComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTCOMPONENT$0, i);
        }
    }
}
