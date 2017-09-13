/*
 * An XML document type.
 * Localname: DiscussionStateFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionStateFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscussionStateFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscussionStateFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionStateFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionStateFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONSTATEFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionStateFilter");
    
    
    /**
     * Gets the "DiscussionStateFilter" element
     */
    public com.cdiscount.www.DiscussionStateFilter.Enum getDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.DiscussionStateFilter.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiscussionStateFilter" element
     */
    public com.cdiscount.www.DiscussionStateFilter xgetDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionStateFilter" element
     */
    public boolean isNilDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionStateFilter" element
     */
    public void setDiscussionStateFilter(com.cdiscount.www.DiscussionStateFilter.Enum discussionStateFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCUSSIONSTATEFILTER$0);
            }
            target.setEnumValue(discussionStateFilter);
        }
    }
    
    /**
     * Sets (as xml) the "DiscussionStateFilter" element
     */
    public void xsetDiscussionStateFilter(com.cdiscount.www.DiscussionStateFilter discussionStateFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionStateFilter)get_store().add_element_user(DISCUSSIONSTATEFILTER$0);
            }
            target.set(discussionStateFilter);
        }
    }
    
    /**
     * Nils the "DiscussionStateFilter" element
     */
    public void setNilDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionStateFilter target = null;
            target = (com.cdiscount.www.DiscussionStateFilter)get_store().find_element_user(DISCUSSIONSTATEFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionStateFilter)get_store().add_element_user(DISCUSSIONSTATEFILTER$0);
            }
            target.setNil();
        }
    }
}
