/*
 * An XML document type.
 * Localname: CloseDiscussionStatus
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CloseDiscussionStatus(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CloseDiscussionStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionStatus");
    
    
    /**
     * Gets the "CloseDiscussionStatus" element
     */
    public com.cdiscount.www.CloseDiscussionStatus.Enum getCloseDiscussionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDISCUSSIONSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.CloseDiscussionStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CloseDiscussionStatus" element
     */
    public com.cdiscount.www.CloseDiscussionStatus xgetCloseDiscussionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionStatus target = null;
            target = (com.cdiscount.www.CloseDiscussionStatus)get_store().find_element_user(CLOSEDISCUSSIONSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CloseDiscussionStatus" element
     */
    public boolean isNilCloseDiscussionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionStatus target = null;
            target = (com.cdiscount.www.CloseDiscussionStatus)get_store().find_element_user(CLOSEDISCUSSIONSTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CloseDiscussionStatus" element
     */
    public void setCloseDiscussionStatus(com.cdiscount.www.CloseDiscussionStatus.Enum closeDiscussionStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDISCUSSIONSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSEDISCUSSIONSTATUS$0);
            }
            target.setEnumValue(closeDiscussionStatus);
        }
    }
    
    /**
     * Sets (as xml) the "CloseDiscussionStatus" element
     */
    public void xsetCloseDiscussionStatus(com.cdiscount.www.CloseDiscussionStatus closeDiscussionStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionStatus target = null;
            target = (com.cdiscount.www.CloseDiscussionStatus)get_store().find_element_user(CLOSEDISCUSSIONSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CloseDiscussionStatus)get_store().add_element_user(CLOSEDISCUSSIONSTATUS$0);
            }
            target.set(closeDiscussionStatus);
        }
    }
    
    /**
     * Nils the "CloseDiscussionStatus" element
     */
    public void setNilCloseDiscussionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionStatus target = null;
            target = (com.cdiscount.www.CloseDiscussionStatus)get_store().find_element_user(CLOSEDISCUSSIONSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CloseDiscussionStatus)get_store().add_element_user(CLOSEDISCUSSIONSTATUS$0);
            }
            target.setNil();
        }
    }
}
