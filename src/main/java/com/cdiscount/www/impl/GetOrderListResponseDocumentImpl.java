/*
 * An XML document type.
 * Localname: GetOrderListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOrderListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOrderListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOrderListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOrderListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETORDERLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderListResponse");
    
    
    /**
     * Gets the "GetOrderListResponse" element
     */
    public com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse getGetOrderListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse target = null;
            target = (com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse)get_store().find_element_user(GETORDERLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOrderListResponse" element
     */
    public void setGetOrderListResponse(com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse getOrderListResponse)
    {
        generatedSetterHelperImpl(getOrderListResponse, GETORDERLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOrderListResponse" element
     */
    public com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse addNewGetOrderListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse target = null;
            target = (com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse)get_store().add_element_user(GETORDERLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOrderListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOrderListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderListResponseDocument.GetOrderListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOrderListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETORDERLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderListResult");
        
        
        /**
         * Gets the "GetOrderListResult" element
         */
        public com.cdiscount.www.OrderListMessage getGetOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderListMessage target = null;
                target = (com.cdiscount.www.OrderListMessage)get_store().find_element_user(GETORDERLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetOrderListResult" element
         */
        public boolean isNilGetOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderListMessage target = null;
                target = (com.cdiscount.www.OrderListMessage)get_store().find_element_user(GETORDERLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetOrderListResult" element
         */
        public boolean isSetGetOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETORDERLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetOrderListResult" element
         */
        public void setGetOrderListResult(com.cdiscount.www.OrderListMessage getOrderListResult)
        {
            generatedSetterHelperImpl(getOrderListResult, GETORDERLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetOrderListResult" element
         */
        public com.cdiscount.www.OrderListMessage addNewGetOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderListMessage target = null;
                target = (com.cdiscount.www.OrderListMessage)get_store().add_element_user(GETORDERLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetOrderListResult" element
         */
        public void setNilGetOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderListMessage target = null;
                target = (com.cdiscount.www.OrderListMessage)get_store().find_element_user(GETORDERLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OrderListMessage)get_store().add_element_user(GETORDERLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetOrderListResult" element
         */
        public void unsetGetOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETORDERLISTRESULT$0, 0);
            }
        }
    }
}
