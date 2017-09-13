/*
 * An XML document type.
 * Localname: GetDiscussionMailListRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetDiscussionMailListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetDiscussionMailListRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetDiscussionMailListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetDiscussionMailListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDiscussionMailListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDISCUSSIONMAILLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetDiscussionMailListRequest");
    
    
    /**
     * Gets the "GetDiscussionMailListRequest" element
     */
    public com.cdiscount.www.GetDiscussionMailListRequest getGetDiscussionMailListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetDiscussionMailListRequest target = null;
            target = (com.cdiscount.www.GetDiscussionMailListRequest)get_store().find_element_user(GETDISCUSSIONMAILLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GetDiscussionMailListRequest" element
     */
    public boolean isNilGetDiscussionMailListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetDiscussionMailListRequest target = null;
            target = (com.cdiscount.www.GetDiscussionMailListRequest)get_store().find_element_user(GETDISCUSSIONMAILLISTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "GetDiscussionMailListRequest" element
     */
    public void setGetDiscussionMailListRequest(com.cdiscount.www.GetDiscussionMailListRequest getDiscussionMailListRequest)
    {
        generatedSetterHelperImpl(getDiscussionMailListRequest, GETDISCUSSIONMAILLISTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetDiscussionMailListRequest" element
     */
    public com.cdiscount.www.GetDiscussionMailListRequest addNewGetDiscussionMailListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetDiscussionMailListRequest target = null;
            target = (com.cdiscount.www.GetDiscussionMailListRequest)get_store().add_element_user(GETDISCUSSIONMAILLISTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "GetDiscussionMailListRequest" element
     */
    public void setNilGetDiscussionMailListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetDiscussionMailListRequest target = null;
            target = (com.cdiscount.www.GetDiscussionMailListRequest)get_store().find_element_user(GETDISCUSSIONMAILLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.GetDiscussionMailListRequest)get_store().add_element_user(GETDISCUSSIONMAILLISTREQUEST$0);
            }
            target.setNil();
        }
    }
}
