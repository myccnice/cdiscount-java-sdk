/*
 * XML Type:  ArrayOfError
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfError
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfError(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfError
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfErrorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Error");
    
    
    /**
     * Gets array of all "Error" elements
     */
    public com.cdiscount.www.Error[] getErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERROR$0, targetList);
            com.cdiscount.www.Error[] result = new com.cdiscount.www.Error[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Error" element
     */
    public com.cdiscount.www.Error getErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Error" element
     */
    public boolean isNilErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Error" element
     */
    public int sizeOfErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$0);
        }
    }
    
    /**
     * Sets array of all "Error" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setErrorArray(com.cdiscount.www.Error[] errorArray)
    {
        check_orphaned();
        arraySetterHelper(errorArray, ERROR$0);
    }
    
    /**
     * Sets ith "Error" element
     */
    public void setErrorArray(int i, com.cdiscount.www.Error error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(error);
        }
    }
    
    /**
     * Nils the ith "Error" element
     */
    public void setNilErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Error" element
     */
    public com.cdiscount.www.Error insertNewError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().insert_element_user(ERROR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Error" element
     */
    public com.cdiscount.www.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Error" element
     */
    public void removeError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$0, i);
        }
    }
}
