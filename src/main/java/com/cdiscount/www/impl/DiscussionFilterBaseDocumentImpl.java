/*
 * An XML document type.
 * Localname: DiscussionFilterBase
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionFilterBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscussionFilterBase(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscussionFilterBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionFilterBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionFilterBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONFILTERBASE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionFilterBase");
    
    
    /**
     * Gets the "DiscussionFilterBase" element
     */
    public com.cdiscount.www.DiscussionFilterBase getDiscussionFilterBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionFilterBase target = null;
            target = (com.cdiscount.www.DiscussionFilterBase)get_store().find_element_user(DISCUSSIONFILTERBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionFilterBase" element
     */
    public boolean isNilDiscussionFilterBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionFilterBase target = null;
            target = (com.cdiscount.www.DiscussionFilterBase)get_store().find_element_user(DISCUSSIONFILTERBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionFilterBase" element
     */
    public void setDiscussionFilterBase(com.cdiscount.www.DiscussionFilterBase discussionFilterBase)
    {
        generatedSetterHelperImpl(discussionFilterBase, DISCUSSIONFILTERBASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionFilterBase" element
     */
    public com.cdiscount.www.DiscussionFilterBase addNewDiscussionFilterBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionFilterBase target = null;
            target = (com.cdiscount.www.DiscussionFilterBase)get_store().add_element_user(DISCUSSIONFILTERBASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscussionFilterBase" element
     */
    public void setNilDiscussionFilterBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionFilterBase target = null;
            target = (com.cdiscount.www.DiscussionFilterBase)get_store().find_element_user(DISCUSSIONFILTERBASE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionFilterBase)get_store().add_element_user(DISCUSSIONFILTERBASE$0);
            }
            target.setNil();
        }
    }
}
