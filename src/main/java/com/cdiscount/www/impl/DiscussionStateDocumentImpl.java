/*
 * An XML document type.
 * Localname: DiscussionState
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionStateDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscussionState(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscussionStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionStateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONSTATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionState");
    
    
    /**
     * Gets the "DiscussionState" element
     */
    public com.cdiscount.www.DiscussionState.Enum getDiscussionState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONSTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.DiscussionState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiscussionState" element
     */
    public com.cdiscount.www.DiscussionState xgetDiscussionState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionState target = null;
            target = (com.cdiscount.www.DiscussionState)get_store().find_element_user(DISCUSSIONSTATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionState" element
     */
    public boolean isNilDiscussionState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionState target = null;
            target = (com.cdiscount.www.DiscussionState)get_store().find_element_user(DISCUSSIONSTATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionState" element
     */
    public void setDiscussionState(com.cdiscount.www.DiscussionState.Enum discussionState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONSTATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCUSSIONSTATE$0);
            }
            target.setEnumValue(discussionState);
        }
    }
    
    /**
     * Sets (as xml) the "DiscussionState" element
     */
    public void xsetDiscussionState(com.cdiscount.www.DiscussionState discussionState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionState target = null;
            target = (com.cdiscount.www.DiscussionState)get_store().find_element_user(DISCUSSIONSTATE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionState)get_store().add_element_user(DISCUSSIONSTATE$0);
            }
            target.set(discussionState);
        }
    }
    
    /**
     * Nils the "DiscussionState" element
     */
    public void setNilDiscussionState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionState target = null;
            target = (com.cdiscount.www.DiscussionState)get_store().find_element_user(DISCUSSIONSTATE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionState)get_store().add_element_user(DISCUSSIONSTATE$0);
            }
            target.setNil();
        }
    }
}
