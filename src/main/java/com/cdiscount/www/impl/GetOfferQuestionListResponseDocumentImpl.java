/*
 * An XML document type.
 * Localname: GetOfferQuestionListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOfferQuestionListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOfferQuestionListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOfferQuestionListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferQuestionListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOfferQuestionListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERQUESTIONLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferQuestionListResponse");
    
    
    /**
     * Gets the "GetOfferQuestionListResponse" element
     */
    public com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse getGetOfferQuestionListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse target = null;
            target = (com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse)get_store().find_element_user(GETOFFERQUESTIONLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferQuestionListResponse" element
     */
    public void setGetOfferQuestionListResponse(com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse getOfferQuestionListResponse)
    {
        generatedSetterHelperImpl(getOfferQuestionListResponse, GETOFFERQUESTIONLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOfferQuestionListResponse" element
     */
    public com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse addNewGetOfferQuestionListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse target = null;
            target = (com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse)get_store().add_element_user(GETOFFERQUESTIONLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOfferQuestionListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOfferQuestionListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferQuestionListResponseDocument.GetOfferQuestionListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOfferQuestionListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETOFFERQUESTIONLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferQuestionListResult");
        
        
        /**
         * Gets the "GetOfferQuestionListResult" element
         */
        public com.cdiscount.www.OfferQuestionListMessage getGetOfferQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionListMessage target = null;
                target = (com.cdiscount.www.OfferQuestionListMessage)get_store().find_element_user(GETOFFERQUESTIONLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetOfferQuestionListResult" element
         */
        public boolean isNilGetOfferQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionListMessage target = null;
                target = (com.cdiscount.www.OfferQuestionListMessage)get_store().find_element_user(GETOFFERQUESTIONLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetOfferQuestionListResult" element
         */
        public boolean isSetGetOfferQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETOFFERQUESTIONLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetOfferQuestionListResult" element
         */
        public void setGetOfferQuestionListResult(com.cdiscount.www.OfferQuestionListMessage getOfferQuestionListResult)
        {
            generatedSetterHelperImpl(getOfferQuestionListResult, GETOFFERQUESTIONLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetOfferQuestionListResult" element
         */
        public com.cdiscount.www.OfferQuestionListMessage addNewGetOfferQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionListMessage target = null;
                target = (com.cdiscount.www.OfferQuestionListMessage)get_store().add_element_user(GETOFFERQUESTIONLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetOfferQuestionListResult" element
         */
        public void setNilGetOfferQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionListMessage target = null;
                target = (com.cdiscount.www.OfferQuestionListMessage)get_store().find_element_user(GETOFFERQUESTIONLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferQuestionListMessage)get_store().add_element_user(GETOFFERQUESTIONLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetOfferQuestionListResult" element
         */
        public void unsetGetOfferQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETOFFERQUESTIONLISTRESULT$0, 0);
            }
        }
    }
}
