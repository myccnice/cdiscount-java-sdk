/*
 * An XML document type.
 * Localname: GetFulfilmentOrderListToSupplyResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetFulfilmentOrderListToSupplyResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetFulfilmentOrderListToSupplyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFulfilmentOrderListToSupplyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULFILMENTORDERLISTTOSUPPLYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentOrderListToSupplyResponse");
    
    
    /**
     * Gets the "GetFulfilmentOrderListToSupplyResponse" element
     */
    public com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse getGetFulfilmentOrderListToSupplyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse)get_store().find_element_user(GETFULFILMENTORDERLISTTOSUPPLYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFulfilmentOrderListToSupplyResponse" element
     */
    public void setGetFulfilmentOrderListToSupplyResponse(com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse getFulfilmentOrderListToSupplyResponse)
    {
        generatedSetterHelperImpl(getFulfilmentOrderListToSupplyResponse, GETFULFILMENTORDERLISTTOSUPPLYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetFulfilmentOrderListToSupplyResponse" element
     */
    public com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse addNewGetFulfilmentOrderListToSupplyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse)get_store().add_element_user(GETFULFILMENTORDERLISTTOSUPPLYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetFulfilmentOrderListToSupplyResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetFulfilmentOrderListToSupplyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument.GetFulfilmentOrderListToSupplyResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetFulfilmentOrderListToSupplyResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETFULFILMENTORDERLISTTOSUPPLYRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentOrderListToSupplyResult");
        
        
        /**
         * Gets the "GetFulfilmentOrderListToSupplyResult" element
         */
        public com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage getGetFulfilmentOrderListToSupplyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
                target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().find_element_user(GETFULFILMENTORDERLISTTOSUPPLYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetFulfilmentOrderListToSupplyResult" element
         */
        public boolean isNilGetFulfilmentOrderListToSupplyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
                target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().find_element_user(GETFULFILMENTORDERLISTTOSUPPLYRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetFulfilmentOrderListToSupplyResult" element
         */
        public boolean isSetGetFulfilmentOrderListToSupplyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETFULFILMENTORDERLISTTOSUPPLYRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetFulfilmentOrderListToSupplyResult" element
         */
        public void setGetFulfilmentOrderListToSupplyResult(com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage getFulfilmentOrderListToSupplyResult)
        {
            generatedSetterHelperImpl(getFulfilmentOrderListToSupplyResult, GETFULFILMENTORDERLISTTOSUPPLYRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetFulfilmentOrderListToSupplyResult" element
         */
        public com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage addNewGetFulfilmentOrderListToSupplyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
                target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().add_element_user(GETFULFILMENTORDERLISTTOSUPPLYRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetFulfilmentOrderListToSupplyResult" element
         */
        public void setNilGetFulfilmentOrderListToSupplyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
                target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().find_element_user(GETFULFILMENTORDERLISTTOSUPPLYRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().add_element_user(GETFULFILMENTORDERLISTTOSUPPLYRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetFulfilmentOrderListToSupplyResult" element
         */
        public void unsetGetFulfilmentOrderListToSupplyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETFULFILMENTORDERLISTTOSUPPLYRESULT$0, 0);
            }
        }
    }
}
