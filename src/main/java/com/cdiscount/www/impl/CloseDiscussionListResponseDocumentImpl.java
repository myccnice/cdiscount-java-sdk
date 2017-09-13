/*
 * An XML document type.
 * Localname: CloseDiscussionListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CloseDiscussionListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CloseDiscussionListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionListResponse");
    
    
    /**
     * Gets the "CloseDiscussionListResponse" element
     */
    public com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse getCloseDiscussionListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse target = null;
            target = (com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse)get_store().find_element_user(CLOSEDISCUSSIONLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseDiscussionListResponse" element
     */
    public void setCloseDiscussionListResponse(com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse closeDiscussionListResponse)
    {
        generatedSetterHelperImpl(closeDiscussionListResponse, CLOSEDISCUSSIONLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CloseDiscussionListResponse" element
     */
    public com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse addNewCloseDiscussionListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse target = null;
            target = (com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse)get_store().add_element_user(CLOSEDISCUSSIONLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CloseDiscussionListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class CloseDiscussionListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionListResponseDocument.CloseDiscussionListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CloseDiscussionListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLOSEDISCUSSIONLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionListResult");
        
        
        /**
         * Gets the "CloseDiscussionListResult" element
         */
        public com.cdiscount.www.CloseDiscussionResultMessage getCloseDiscussionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionResultMessage target = null;
                target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().find_element_user(CLOSEDISCUSSIONLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "CloseDiscussionListResult" element
         */
        public boolean isNilCloseDiscussionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionResultMessage target = null;
                target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().find_element_user(CLOSEDISCUSSIONLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "CloseDiscussionListResult" element
         */
        public boolean isSetCloseDiscussionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLOSEDISCUSSIONLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CloseDiscussionListResult" element
         */
        public void setCloseDiscussionListResult(com.cdiscount.www.CloseDiscussionResultMessage closeDiscussionListResult)
        {
            generatedSetterHelperImpl(closeDiscussionListResult, CLOSEDISCUSSIONLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CloseDiscussionListResult" element
         */
        public com.cdiscount.www.CloseDiscussionResultMessage addNewCloseDiscussionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionResultMessage target = null;
                target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().add_element_user(CLOSEDISCUSSIONLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "CloseDiscussionListResult" element
         */
        public void setNilCloseDiscussionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionResultMessage target = null;
                target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().find_element_user(CLOSEDISCUSSIONLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.CloseDiscussionResultMessage)get_store().add_element_user(CLOSEDISCUSSIONLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "CloseDiscussionListResult" element
         */
        public void unsetCloseDiscussionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLOSEDISCUSSIONLISTRESULT$0, 0);
            }
        }
    }
}
