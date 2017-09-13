/*
 * An XML document type.
 * Localname: GetOrderClaimListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOrderClaimListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOrderClaimListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOrderClaimListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderClaimListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOrderClaimListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETORDERCLAIMLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderClaimListResponse");
    
    
    /**
     * Gets the "GetOrderClaimListResponse" element
     */
    public com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse getGetOrderClaimListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse target = null;
            target = (com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse)get_store().find_element_user(GETORDERCLAIMLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOrderClaimListResponse" element
     */
    public void setGetOrderClaimListResponse(com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse getOrderClaimListResponse)
    {
        generatedSetterHelperImpl(getOrderClaimListResponse, GETORDERCLAIMLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOrderClaimListResponse" element
     */
    public com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse addNewGetOrderClaimListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse target = null;
            target = (com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse)get_store().add_element_user(GETORDERCLAIMLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOrderClaimListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOrderClaimListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderClaimListResponseDocument.GetOrderClaimListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOrderClaimListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETORDERCLAIMLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderClaimListResult");
        
        
        /**
         * Gets the "GetOrderClaimListResult" element
         */
        public com.cdiscount.www.OrderClaimListMessage getGetOrderClaimListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimListMessage target = null;
                target = (com.cdiscount.www.OrderClaimListMessage)get_store().find_element_user(GETORDERCLAIMLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetOrderClaimListResult" element
         */
        public boolean isNilGetOrderClaimListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimListMessage target = null;
                target = (com.cdiscount.www.OrderClaimListMessage)get_store().find_element_user(GETORDERCLAIMLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetOrderClaimListResult" element
         */
        public boolean isSetGetOrderClaimListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETORDERCLAIMLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetOrderClaimListResult" element
         */
        public void setGetOrderClaimListResult(com.cdiscount.www.OrderClaimListMessage getOrderClaimListResult)
        {
            generatedSetterHelperImpl(getOrderClaimListResult, GETORDERCLAIMLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetOrderClaimListResult" element
         */
        public com.cdiscount.www.OrderClaimListMessage addNewGetOrderClaimListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimListMessage target = null;
                target = (com.cdiscount.www.OrderClaimListMessage)get_store().add_element_user(GETORDERCLAIMLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetOrderClaimListResult" element
         */
        public void setNilGetOrderClaimListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimListMessage target = null;
                target = (com.cdiscount.www.OrderClaimListMessage)get_store().find_element_user(GETORDERCLAIMLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OrderClaimListMessage)get_store().add_element_user(GETORDERCLAIMLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetOrderClaimListResult" element
         */
        public void unsetGetOrderClaimListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETORDERCLAIMLISTRESULT$0, 0);
            }
        }
    }
}
