/*
 * An XML document type.
 * Localname: GetDiscussionMailListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetDiscussionMailListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetDiscussionMailListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetDiscussionMailListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetDiscussionMailListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDiscussionMailListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDISCUSSIONMAILLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetDiscussionMailListResponse");
    
    
    /**
     * Gets the "GetDiscussionMailListResponse" element
     */
    public com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse getGetDiscussionMailListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse target = null;
            target = (com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse)get_store().find_element_user(GETDISCUSSIONMAILLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetDiscussionMailListResponse" element
     */
    public void setGetDiscussionMailListResponse(com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse getDiscussionMailListResponse)
    {
        generatedSetterHelperImpl(getDiscussionMailListResponse, GETDISCUSSIONMAILLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetDiscussionMailListResponse" element
     */
    public com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse addNewGetDiscussionMailListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse target = null;
            target = (com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse)get_store().add_element_user(GETDISCUSSIONMAILLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetDiscussionMailListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetDiscussionMailListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetDiscussionMailListResponseDocument.GetDiscussionMailListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetDiscussionMailListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETDISCUSSIONMAILLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetDiscussionMailListResult");
        
        
        /**
         * Gets the "GetDiscussionMailListResult" element
         */
        public com.cdiscount.www.DiscussionMailListMessage getGetDiscussionMailListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.DiscussionMailListMessage target = null;
                target = (com.cdiscount.www.DiscussionMailListMessage)get_store().find_element_user(GETDISCUSSIONMAILLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetDiscussionMailListResult" element
         */
        public boolean isNilGetDiscussionMailListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.DiscussionMailListMessage target = null;
                target = (com.cdiscount.www.DiscussionMailListMessage)get_store().find_element_user(GETDISCUSSIONMAILLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetDiscussionMailListResult" element
         */
        public boolean isSetGetDiscussionMailListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETDISCUSSIONMAILLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetDiscussionMailListResult" element
         */
        public void setGetDiscussionMailListResult(com.cdiscount.www.DiscussionMailListMessage getDiscussionMailListResult)
        {
            generatedSetterHelperImpl(getDiscussionMailListResult, GETDISCUSSIONMAILLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetDiscussionMailListResult" element
         */
        public com.cdiscount.www.DiscussionMailListMessage addNewGetDiscussionMailListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.DiscussionMailListMessage target = null;
                target = (com.cdiscount.www.DiscussionMailListMessage)get_store().add_element_user(GETDISCUSSIONMAILLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetDiscussionMailListResult" element
         */
        public void setNilGetDiscussionMailListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.DiscussionMailListMessage target = null;
                target = (com.cdiscount.www.DiscussionMailListMessage)get_store().find_element_user(GETDISCUSSIONMAILLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.DiscussionMailListMessage)get_store().add_element_user(GETDISCUSSIONMAILLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetDiscussionMailListResult" element
         */
        public void unsetGetDiscussionMailListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETDISCUSSIONMAILLISTRESULT$0, 0);
            }
        }
    }
}
