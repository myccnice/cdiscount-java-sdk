/*
 * An XML document type.
 * Localname: DiscussionThreadBase
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionThreadBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscussionThreadBase(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscussionThreadBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionThreadBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionThreadBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONTHREADBASE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionThreadBase");
    
    
    /**
     * Gets the "DiscussionThreadBase" element
     */
    public com.cdiscount.www.DiscussionThreadBase getDiscussionThreadBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionThreadBase target = null;
            target = (com.cdiscount.www.DiscussionThreadBase)get_store().find_element_user(DISCUSSIONTHREADBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionThreadBase" element
     */
    public boolean isNilDiscussionThreadBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionThreadBase target = null;
            target = (com.cdiscount.www.DiscussionThreadBase)get_store().find_element_user(DISCUSSIONTHREADBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionThreadBase" element
     */
    public void setDiscussionThreadBase(com.cdiscount.www.DiscussionThreadBase discussionThreadBase)
    {
        generatedSetterHelperImpl(discussionThreadBase, DISCUSSIONTHREADBASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionThreadBase" element
     */
    public com.cdiscount.www.DiscussionThreadBase addNewDiscussionThreadBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionThreadBase target = null;
            target = (com.cdiscount.www.DiscussionThreadBase)get_store().add_element_user(DISCUSSIONTHREADBASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscussionThreadBase" element
     */
    public void setNilDiscussionThreadBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionThreadBase target = null;
            target = (com.cdiscount.www.DiscussionThreadBase)get_store().find_element_user(DISCUSSIONTHREADBASE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionThreadBase)get_store().add_element_user(DISCUSSIONTHREADBASE$0);
            }
            target.setNil();
        }
    }
}
