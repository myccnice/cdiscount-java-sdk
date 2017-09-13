/*
 * XML Type:  ArrayOfVariationDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfVariationDescription
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfVariationDescription(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfVariationDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfVariationDescription
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfVariationDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIATIONDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VariationDescription");
    
    
    /**
     * Gets array of all "VariationDescription" elements
     */
    public com.cdiscount.www.VariationDescription[] getVariationDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARIATIONDESCRIPTION$0, targetList);
            com.cdiscount.www.VariationDescription[] result = new com.cdiscount.www.VariationDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "VariationDescription" element
     */
    public com.cdiscount.www.VariationDescription getVariationDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().find_element_user(VARIATIONDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "VariationDescription" element
     */
    public boolean isNilVariationDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().find_element_user(VARIATIONDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "VariationDescription" element
     */
    public int sizeOfVariationDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIATIONDESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "VariationDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVariationDescriptionArray(com.cdiscount.www.VariationDescription[] variationDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(variationDescriptionArray, VARIATIONDESCRIPTION$0);
    }
    
    /**
     * Sets ith "VariationDescription" element
     */
    public void setVariationDescriptionArray(int i, com.cdiscount.www.VariationDescription variationDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().find_element_user(VARIATIONDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(variationDescription);
        }
    }
    
    /**
     * Nils the ith "VariationDescription" element
     */
    public void setNilVariationDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().find_element_user(VARIATIONDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariationDescription" element
     */
    public com.cdiscount.www.VariationDescription insertNewVariationDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().insert_element_user(VARIATIONDESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "VariationDescription" element
     */
    public com.cdiscount.www.VariationDescription addNewVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().add_element_user(VARIATIONDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "VariationDescription" element
     */
    public void removeVariationDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIATIONDESCRIPTION$0, i);
        }
    }
}
