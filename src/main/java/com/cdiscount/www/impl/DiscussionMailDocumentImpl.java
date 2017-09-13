/*
 * An XML document type.
 * Localname: DiscussionMail
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionMailDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscussionMail(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscussionMailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionMailDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONMAIL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionMail");
    
    
    /**
     * Gets the "DiscussionMail" element
     */
    public com.cdiscount.www.DiscussionMail getDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().find_element_user(DISCUSSIONMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionMail" element
     */
    public boolean isNilDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().find_element_user(DISCUSSIONMAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionMail" element
     */
    public void setDiscussionMail(com.cdiscount.www.DiscussionMail discussionMail)
    {
        generatedSetterHelperImpl(discussionMail, DISCUSSIONMAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionMail" element
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
     * Nils the "DiscussionMail" element
     */
    public void setNilDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMail target = null;
            target = (com.cdiscount.www.DiscussionMail)get_store().find_element_user(DISCUSSIONMAIL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionMail)get_store().add_element_user(DISCUSSIONMAIL$0);
            }
            target.setNil();
        }
    }
}
