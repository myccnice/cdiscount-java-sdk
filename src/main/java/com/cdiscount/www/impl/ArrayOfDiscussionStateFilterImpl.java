/*
 * XML Type:  ArrayOfDiscussionStateFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDiscussionStateFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfDiscussionStateFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfDiscussionStateFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDiscussionStateFilter
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDiscussionStateFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONSTATEFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionStateFilter");
    
    
    /**
     * Gets array of all "DiscussionStateFilter" elements
     */
    public com.cdiscount.www.DiscussionStateFilter.Enum[] getDiscussionStateFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISCUSSIONSTATEFILTER$0, targetList);
            com.cdiscount.www.DiscussionStateFilter.Enum[] result = new com.cdiscount.www.DiscussionStateFilter.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.cdiscount.www.DiscussionStateFilter.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DiscussionStateFilter" element
     */
    public com.cdiscount.www.DiscussionStateFilter.Enum getDiscussionStateFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.cdiscount.www.DiscussionStateFilter.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DiscussionStateFilter" elements
     */
    public com.cdiscount.www.DiscussionStateFilter[] xgetDiscussionStateFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISCUSSIONSTATEFILTER$0, targetList);
            com.cdiscount.www.DiscussionStateFilter[] result = new com.cdiscount.www.DiscussionStateFilter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DiscussionStateFilter" element
     */
    public com.cdiscount.www.DiscussionStateFilter xgetDiscussionStateFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DiscussionStateFilter" element
     */
    public int sizeOfDiscussionStateFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCUSSIONSTATEFILTER$0);
        }
    }
    
    /**
     * Sets array of all "DiscussionStateFilter" element
     */
    public void setDiscussionStateFilterArray(com.cdiscount.www.DiscussionStateFilter.Enum[] discussionStateFilterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(discussionStateFilterArray, DISCUSSIONSTATEFILTER$0);
        }
    }
    
    /**
     * Sets ith "DiscussionStateFilter" element
     */
    public void setDiscussionStateFilterArray(int i, com.cdiscount.www.DiscussionStateFilter.Enum discussionStateFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(discussionStateFilter);
        }
    }
    
    /**
     * Sets (as xml) array of all "DiscussionStateFilter" element
     */
    public void xsetDiscussionStateFilterArray(com.cdiscount.www.DiscussionStateFilter[]discussionStateFilterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(discussionStateFilterArray, DISCUSSIONSTATEFILTER$0);
        }
    }
    
    /**
     * Sets (as xml) ith "DiscussionStateFilter" element
     */
    public void xsetDiscussionStateFilterArray(int i, com.cdiscount.www.DiscussionStateFilter discussionStateFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(discussionStateFilter);
        }
    }
    
    /**
     * Inserts the value as the ith "DiscussionStateFilter" element
     */
    public void insertDiscussionStateFilter(int i, com.cdiscount.www.DiscussionStateFilter.Enum discussionStateFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DISCUSSIONSTATEFILTER$0, i);
            target.setEnumValue(discussionStateFilter);
        }
    }
    
    /**
     * Appends the value as the last "DiscussionStateFilter" element
     */
    public void addDiscussionStateFilter(com.cdiscount.www.DiscussionStateFilter.Enum discussionStateFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCUSSIONSTATEFILTER$0);
            target.setEnumValue(discussionStateFilter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DiscussionStateFilter" element
     */
    public com.cdiscount.www.DiscussionStateFilter insertNewDiscussionStateFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().insert_element_user(DISCUSSIONSTATEFILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DiscussionStateFilter" element
     */
    public com.cdiscount.www.DiscussionStateFilter addNewDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().add_element_user(DISCUSSIONSTATEFILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DiscussionStateFilter" element
     */
    public void removeDiscussionStateFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCUSSIONSTATEFILTER$0, i);
        }
    }
}
