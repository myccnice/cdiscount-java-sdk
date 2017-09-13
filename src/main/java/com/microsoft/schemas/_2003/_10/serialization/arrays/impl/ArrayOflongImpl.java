/*
 * XML Type:  ArrayOflong
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOflong(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOflongImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOflongImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONG$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long");
    
    
    /**
     * Gets array of all "long" elements
     */
    public long[] getLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONG$0, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "long" element
     */
    public long getLongArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "long" elements
     */
    public org.apache.xmlbeans.XmlLong[] xgetLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONG$0, targetList);
            org.apache.xmlbeans.XmlLong[] result = new org.apache.xmlbeans.XmlLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "long" element
     */
    public org.apache.xmlbeans.XmlLong xgetLongArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LONG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "long" element
     */
    public int sizeOfLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONG$0);
        }
    }
    
    /**
     * Sets array of all "long" element
     */
    public void setLongArray(long[] xlongArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xlongArray, LONG$0);
        }
    }
    
    /**
     * Sets ith "long" element
     */
    public void setLongArray(int i, long xlong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(xlong);
        }
    }
    
    /**
     * Sets (as xml) array of all "long" element
     */
    public void xsetLongArray(org.apache.xmlbeans.XmlLong[]xlongArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xlongArray, LONG$0);
        }
    }
    
    /**
     * Sets (as xml) ith "long" element
     */
    public void xsetLongArray(int i, org.apache.xmlbeans.XmlLong xlong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LONG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xlong);
        }
    }
    
    /**
     * Inserts the value as the ith "long" element
     */
    public void insertLong(int i, long xlong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LONG$0, i);
            target.setLongValue(xlong);
        }
    }
    
    /**
     * Appends the value as the last "long" element
     */
    public void addLong(long xlong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONG$0);
            target.setLongValue(xlong);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "long" element
     */
    public org.apache.xmlbeans.XmlLong insertNewLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(LONG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "long" element
     */
    public org.apache.xmlbeans.XmlLong addNewLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(LONG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "long" element
     */
    public void removeLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONG$0, i);
        }
    }
}
