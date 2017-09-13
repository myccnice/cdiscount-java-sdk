/*
 * An XML document type.
 * Localname: CloseDiscussionRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CloseDiscussionRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CloseDiscussionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionRequest");
    
    
    /**
     * Gets the "CloseDiscussionRequest" element
     */
    public com.cdiscount.www.CloseDiscussionRequest getCloseDiscussionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionRequest target = null;
            target = (com.cdiscount.www.CloseDiscussionRequest)get_store().find_element_user(CLOSEDISCUSSIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CloseDiscussionRequest" element
     */
    public boolean isNilCloseDiscussionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionRequest target = null;
            target = (com.cdiscount.www.CloseDiscussionRequest)get_store().find_element_user(CLOSEDISCUSSIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CloseDiscussionRequest" element
     */
    public void setCloseDiscussionRequest(com.cdiscount.www.CloseDiscussionRequest closeDiscussionRequest)
    {
        generatedSetterHelperImpl(closeDiscussionRequest, CLOSEDISCUSSIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CloseDiscussionRequest" element
     */
    public com.cdiscount.www.CloseDiscussionRequest addNewCloseDiscussionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionRequest target = null;
            target = (com.cdiscount.www.CloseDiscussionRequest)get_store().add_element_user(CLOSEDISCUSSIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "CloseDiscussionRequest" element
     */
    public void setNilCloseDiscussionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionRequest target = null;
            target = (com.cdiscount.www.CloseDiscussionRequest)get_store().find_element_user(CLOSEDISCUSSIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CloseDiscussionRequest)get_store().add_element_user(CLOSEDISCUSSIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
