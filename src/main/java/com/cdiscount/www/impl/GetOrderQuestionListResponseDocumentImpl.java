/*
 * An XML document type.
 * Localname: GetOrderQuestionListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOrderQuestionListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOrderQuestionListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOrderQuestionListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderQuestionListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOrderQuestionListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETORDERQUESTIONLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderQuestionListResponse");
    
    
    /**
     * Gets the "GetOrderQuestionListResponse" element
     */
    public com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse getGetOrderQuestionListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse target = null;
            target = (com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse)get_store().find_element_user(GETORDERQUESTIONLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOrderQuestionListResponse" element
     */
    public void setGetOrderQuestionListResponse(com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse getOrderQuestionListResponse)
    {
        generatedSetterHelperImpl(getOrderQuestionListResponse, GETORDERQUESTIONLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOrderQuestionListResponse" element
     */
    public com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse addNewGetOrderQuestionListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse target = null;
            target = (com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse)get_store().add_element_user(GETORDERQUESTIONLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOrderQuestionListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOrderQuestionListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderQuestionListResponseDocument.GetOrderQuestionListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOrderQuestionListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETORDERQUESTIONLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderQuestionListResult");
        
        
        /**
         * Gets the "GetOrderQuestionListResult" element
         */
        public com.cdiscount.www.OrderQuestionListMessage getGetOrderQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionListMessage target = null;
                target = (com.cdiscount.www.OrderQuestionListMessage)get_store().find_element_user(GETORDERQUESTIONLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetOrderQuestionListResult" element
         */
        public boolean isNilGetOrderQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionListMessage target = null;
                target = (com.cdiscount.www.OrderQuestionListMessage)get_store().find_element_user(GETORDERQUESTIONLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetOrderQuestionListResult" element
         */
        public boolean isSetGetOrderQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETORDERQUESTIONLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetOrderQuestionListResult" element
         */
        public void setGetOrderQuestionListResult(com.cdiscount.www.OrderQuestionListMessage getOrderQuestionListResult)
        {
            generatedSetterHelperImpl(getOrderQuestionListResult, GETORDERQUESTIONLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetOrderQuestionListResult" element
         */
        public com.cdiscount.www.OrderQuestionListMessage addNewGetOrderQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionListMessage target = null;
                target = (com.cdiscount.www.OrderQuestionListMessage)get_store().add_element_user(GETORDERQUESTIONLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetOrderQuestionListResult" element
         */
        public void setNilGetOrderQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionListMessage target = null;
                target = (com.cdiscount.www.OrderQuestionListMessage)get_store().find_element_user(GETORDERQUESTIONLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OrderQuestionListMessage)get_store().add_element_user(GETORDERQUESTIONLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetOrderQuestionListResult" element
         */
        public void unsetGetOrderQuestionListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETORDERQUESTIONLISTRESULT$0, 0);
            }
        }
    }
}
