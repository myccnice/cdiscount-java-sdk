/*
 * An XML document type.
 * Localname: CloseDiscussionResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionResultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CloseDiscussionResultMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CloseDiscussionResultMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionResultMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionResultMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONRESULTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionResultMessage");
    
    
    /**
     * Gets the "CloseDiscussionResultMessage" element
     */
    public com.cdiscount.www.CloseDiscussionResultMessage getCloseDiscussionResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResultMessage target = null;
            target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().find_element_user(CLOSEDISCUSSIONRESULTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CloseDiscussionResultMessage" element
     */
    public boolean isNilCloseDiscussionResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResultMessage target = null;
            target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().find_element_user(CLOSEDISCUSSIONRESULTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CloseDiscussionResultMessage" element
     */
    public void setCloseDiscussionResultMessage(com.cdiscount.www.CloseDiscussionResultMessage closeDiscussionResultMessage)
    {
        generatedSetterHelperImpl(closeDiscussionResultMessage, CLOSEDISCUSSIONRESULTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CloseDiscussionResultMessage" element
     */
    public com.cdiscount.www.CloseDiscussionResultMessage addNewCloseDiscussionResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResultMessage target = null;
            target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().add_element_user(CLOSEDISCUSSIONRESULTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "CloseDiscussionResultMessage" element
     */
    public void setNilCloseDiscussionResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResultMessage target = null;
            target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().find_element_user(CLOSEDISCUSSIONRESULTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().add_element_user(CLOSEDISCUSSIONRESULTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
