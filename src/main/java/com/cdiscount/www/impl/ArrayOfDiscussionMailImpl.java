/*
 * XML Type:  ArrayOfDiscussionMail
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDiscussionMail
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfDiscussionMail(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfDiscussionMailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDiscussionMail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDiscussionMailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONMAIL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionMail");
    
    
    /**
     * Gets array of all "DiscussionMail" elements
     */
    public com.cdiscount.www.DiscussionMail[] getDiscussionMailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISCUSSIONMAIL$0, targetList);
            com.cdiscount.www.DiscussionMail[] result = new com.cdiscount.www.DiscussionMail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DiscussionMail" element
     */
    public com.cdiscount.www.DiscussionMail getDiscussionMailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().find_element_user(DISCUSSIONMAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "DiscussionMail" element
     */
    public boolean isNilDiscussionMailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().find_element_user(DISCUSSIONMAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "DiscussionMail" element
     */
    public int sizeOfDiscussionMailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCUSSIONMAIL$0);
        }
    }
    
    /**
     * Sets array of all "DiscussionMail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDiscussionMailArray(com.cdiscount.www.DiscussionMail[] discussionMailArray)
    {
        check_orphaned();
        arraySetterHelper(discussionMailArray, DISCUSSIONMAIL$0);
    }
    
    /**
     * Sets ith "DiscussionMail" element
     */
    public void setDiscussionMailArray(int i, com.cdiscount.www.DiscussionMail discussionMail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().find_element_user(DISCUSSIONMAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(discussionMail);
        }
    }
    
    /**
     * Nils the ith "DiscussionMail" element
     */
    public void setNilDiscussionMailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().find_element_user(DISCUSSIONMAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DiscussionMail" element
     */
    public com.cdiscount.www.DiscussionMail insertNewDiscussionMail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().insert_element_user(DISCUSSIONMAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DiscussionMail" element
     */
    public com.cdiscount.www.DiscussionMail addNewDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().add_element_user(DISCUSSIONMAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DiscussionMail" element
     */
    public void removeDiscussionMail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCUSSIONMAIL$0, i);
        }
    }
}
