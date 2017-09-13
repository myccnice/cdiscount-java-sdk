/*
 * An XML document type.
 * Localname: GetExternalOrderStatusResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetExternalOrderStatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetExternalOrderStatusResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetExternalOrderStatusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetExternalOrderStatusResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalOrderStatusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEXTERNALORDERSTATUSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetExternalOrderStatusResponse");
    
    
    /**
     * Gets the "GetExternalOrderStatusResponse" element
     */
    public com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse getGetExternalOrderStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse target = null;
            target = (com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse)get_store().find_element_user(GETEXTERNALORDERSTATUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetExternalOrderStatusResponse" element
     */
    public void setGetExternalOrderStatusResponse(com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse getExternalOrderStatusResponse)
    {
        generatedSetterHelperImpl(getExternalOrderStatusResponse, GETEXTERNALORDERSTATUSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetExternalOrderStatusResponse" element
     */
    public com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse addNewGetExternalOrderStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse target = null;
            target = (com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse)get_store().add_element_user(GETEXTERNALORDERSTATUSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetExternalOrderStatusResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetExternalOrderStatusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetExternalOrderStatusResponseDocument.GetExternalOrderStatusResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetExternalOrderStatusResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETEXTERNALORDERSTATUSRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetExternalOrderStatusResult");
        
        
        /**
         * Gets the "GetExternalOrderStatusResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage getGetExternalOrderStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().find_element_user(GETEXTERNALORDERSTATUSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetExternalOrderStatusResult" element
         */
        public boolean isNilGetExternalOrderStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().find_element_user(GETEXTERNALORDERSTATUSRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetExternalOrderStatusResult" element
         */
        public boolean isSetGetExternalOrderStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETEXTERNALORDERSTATUSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetExternalOrderStatusResult" element
         */
        public void setGetExternalOrderStatusResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage getExternalOrderStatusResult)
        {
            generatedSetterHelperImpl(getExternalOrderStatusResult, GETEXTERNALORDERSTATUSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetExternalOrderStatusResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage addNewGetExternalOrderStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().add_element_user(GETEXTERNALORDERSTATUSRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetExternalOrderStatusResult" element
         */
        public void setNilGetExternalOrderStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().find_element_user(GETEXTERNALORDERSTATUSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().add_element_user(GETEXTERNALORDERSTATUSRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetExternalOrderStatusResult" element
         */
        public void unsetGetExternalOrderStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETEXTERNALORDERSTATUSRESULT$0, 0);
            }
        }
    }
}
