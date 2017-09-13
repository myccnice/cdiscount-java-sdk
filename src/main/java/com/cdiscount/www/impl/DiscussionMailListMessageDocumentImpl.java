/*
 * An XML document type.
 * Localname: DiscussionMailListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionMailListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscussionMailListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscussionMailListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionMailListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONMAILLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionMailListMessage");
    
    
    /**
     * Gets the "DiscussionMailListMessage" element
     */
    public com.cdiscount.www.DiscussionMailListMessage getDiscussionMailListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailListMessage target = null;
            target = (com.cdiscount.www.DiscussionMailListMessage)get_store().find_element_user(DISCUSSIONMAILLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionMailListMessage" element
     */
    public boolean isNilDiscussionMailListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailListMessage target = null;
            target = (com.cdiscount.www.DiscussionMailListMessage)get_store().find_element_user(DISCUSSIONMAILLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionMailListMessage" element
     */
    public void setDiscussionMailListMessage(com.cdiscount.www.DiscussionMailListMessage discussionMailListMessage)
    {
        generatedSetterHelperImpl(discussionMailListMessage, DISCUSSIONMAILLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionMailListMessage" element
     */
    public com.cdiscount.www.DiscussionMailListMessage addNewDiscussionMailListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailListMessage target = null;
            target = (com.cdiscount.www.DiscussionMailListMessage)get_store().add_element_user(DISCUSSIONMAILLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscussionMailListMessage" element
     */
    public void setNilDiscussionMailListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailListMessage target = null;
            target = (com.cdiscount.www.DiscussionMailListMessage)get_store().find_element_user(DISCUSSIONMAILLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionMailListMessage)get_store().add_element_user(DISCUSSIONMAILLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
