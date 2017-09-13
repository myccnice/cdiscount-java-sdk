/*
 * XML Type:  ArrayOfFulfilmentProductDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentProductDescription
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfFulfilmentProductDescription(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentProductDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentProductDescription
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentProductDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTPRODUCTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentProductDescription");
    
    
    /**
     * Gets array of all "FulfilmentProductDescription" elements
     */
    public com.cdiscount.www.FulfilmentProductDescription[] getFulfilmentProductDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FULFILMENTPRODUCTDESCRIPTION$0, targetList);
            com.cdiscount.www.FulfilmentProductDescription[] result = new com.cdiscount.www.FulfilmentProductDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FulfilmentProductDescription" element
     */
    public com.cdiscount.www.FulfilmentProductDescription getFulfilmentProductDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().find_element_user(FULFILMENTPRODUCTDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "FulfilmentProductDescription" element
     */
    public boolean isNilFulfilmentProductDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().find_element_user(FULFILMENTPRODUCTDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "FulfilmentProductDescription" element
     */
    public int sizeOfFulfilmentProductDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILMENTPRODUCTDESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "FulfilmentProductDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFulfilmentProductDescriptionArray(com.cdiscount.www.FulfilmentProductDescription[] fulfilmentProductDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(fulfilmentProductDescriptionArray, FULFILMENTPRODUCTDESCRIPTION$0);
    }
    
    /**
     * Sets ith "FulfilmentProductDescription" element
     */
    public void setFulfilmentProductDescriptionArray(int i, com.cdiscount.www.FulfilmentProductDescription fulfilmentProductDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().find_element_user(FULFILMENTPRODUCTDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fulfilmentProductDescription);
        }
    }
    
    /**
     * Nils the ith "FulfilmentProductDescription" element
     */
    public void setNilFulfilmentProductDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().find_element_user(FULFILMENTPRODUCTDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FulfilmentProductDescription" element
     */
    public com.cdiscount.www.FulfilmentProductDescription insertNewFulfilmentProductDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().insert_element_user(FULFILMENTPRODUCTDESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FulfilmentProductDescription" element
     */
    public com.cdiscount.www.FulfilmentProductDescription addNewFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().add_element_user(FULFILMENTPRODUCTDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FulfilmentProductDescription" element
     */
    public void removeFulfilmentProductDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILMENTPRODUCTDESCRIPTION$0, i);
        }
    }
}
