/*
 * An XML document type.
 * Localname: DiscussionMailStatusEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionMailStatusEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscussionMailStatusEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscussionMailStatusEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionMailStatusEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailStatusEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONMAILSTATUSENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionMailStatusEnum");
    
    
    /**
     * Gets the "DiscussionMailStatusEnum" element
     */
    public com.cdiscount.www.DiscussionMailStatusEnum.Enum getDiscussionMailStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONMAILSTATUSENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.DiscussionMailStatusEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiscussionMailStatusEnum" element
     */
    public com.cdiscount.www.DiscussionMailStatusEnum xgetDiscussionMailStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailStatusEnum target = null;
            target = (com.cdiscount.www.DiscussionMailStatusEnum)get_store().find_element_user(DISCUSSIONMAILSTATUSENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionMailStatusEnum" element
     */
    public boolean isNilDiscussionMailStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailStatusEnum target = null;
            target = (com.cdiscount.www.DiscussionMailStatusEnum)get_store().find_element_user(DISCUSSIONMAILSTATUSENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionMailStatusEnum" element
     */
    public void setDiscussionMailStatusEnum(com.cdiscount.www.DiscussionMailStatusEnum.Enum discussionMailStatusEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONMAILSTATUSENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCUSSIONMAILSTATUSENUM$0);
            }
            target.setEnumValue(discussionMailStatusEnum);
        }
    }
    
    /**
     * Sets (as xml) the "DiscussionMailStatusEnum" element
     */
    public void xsetDiscussionMailStatusEnum(com.cdiscount.www.DiscussionMailStatusEnum discussionMailStatusEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailStatusEnum target = null;
            target = (com.cdiscount.www.DiscussionMailStatusEnum)get_store().find_element_user(DISCUSSIONMAILSTATUSENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionMailStatusEnum)get_store().add_element_user(DISCUSSIONMAILSTATUSENUM$0);
            }
            target.set(discussionMailStatusEnum);
        }
    }
    
    /**
     * Nils the "DiscussionMailStatusEnum" element
     */
    public void setNilDiscussionMailStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionMailStatusEnum target = null;
            target = (com.cdiscount.www.DiscussionMailStatusEnum)get_store().find_element_user(DISCUSSIONMAILSTATUSENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionMailStatusEnum)get_store().add_element_user(DISCUSSIONMAILSTATUSENUM$0);
            }
            target.setNil();
        }
    }
}
