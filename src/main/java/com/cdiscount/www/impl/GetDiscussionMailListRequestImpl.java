/*
 * XML Type:  GetDiscussionMailListRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetDiscussionMailListRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML GetDiscussionMailListRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class GetDiscussionMailListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetDiscussionMailListRequest
{
    private static final long serialVersionUID = 1L;
    
    public GetDiscussionMailListRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONIDS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionIds");
    
    
    /**
     * Gets the "DiscussionIds" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong getDiscussionIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().find_element_user(DISCUSSIONIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionIds" element
     */
    public boolean isNilDiscussionIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().find_element_user(DISCUSSIONIDS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DiscussionIds" element
     */
    public boolean isSetDiscussionIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCUSSIONIDS$0) != 0;
        }
    }
    
    /**
     * Sets the "DiscussionIds" element
     */
    public void setDiscussionIds(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong discussionIds)
    {
        generatedSetterHelperImpl(discussionIds, DISCUSSIONIDS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionIds" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong addNewDiscussionIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().add_element_user(DISCUSSIONIDS$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscussionIds" element
     */
    public void setNilDiscussionIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().find_element_user(DISCUSSIONIDS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().add_element_user(DISCUSSIONIDS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DiscussionIds" element
     */
    public void unsetDiscussionIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCUSSIONIDS$0, 0);
        }
    }
}
