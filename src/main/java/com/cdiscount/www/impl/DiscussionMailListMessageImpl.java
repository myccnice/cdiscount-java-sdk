/*
 * XML Type:  DiscussionMailListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionMailListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML DiscussionMailListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class DiscussionMailListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.DiscussionMailListMessage
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONMAILLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionMailList");
    
    
    /**
     * Gets the "DiscussionMailList" element
     */
    public com.cdiscount.www.ArrayOfDiscussionMail getDiscussionMailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().find_element_user(DISCUSSIONMAILLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionMailList" element
     */
    public boolean isNilDiscussionMailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().find_element_user(DISCUSSIONMAILLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DiscussionMailList" element
     */
    public boolean isSetDiscussionMailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCUSSIONMAILLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "DiscussionMailList" element
     */
    public void setDiscussionMailList(com.cdiscount.www.ArrayOfDiscussionMail discussionMailList)
    {
        generatedSetterHelperImpl(discussionMailList, DISCUSSIONMAILLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionMailList" element
     */
    public com.cdiscount.www.ArrayOfDiscussionMail addNewDiscussionMailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().add_element_user(DISCUSSIONMAILLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscussionMailList" element
     */
    public void setNilDiscussionMailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().find_element_user(DISCUSSIONMAILLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().add_element_user(DISCUSSIONMAILLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DiscussionMailList" element
     */
    public void unsetDiscussionMailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCUSSIONMAILLIST$0, 0);
        }
    }
}
