/*
 * An XML document type.
 * Localname: CreateExternalOrderResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateExternalOrderResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CreateExternalOrderResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CreateExternalOrderResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateExternalOrderResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateExternalOrderResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEEXTERNALORDERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateExternalOrderResponse");
    
    
    /**
     * Gets the "CreateExternalOrderResponse" element
     */
    public com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse getCreateExternalOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse target = null;
            target = (com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse)get_store().find_element_user(CREATEEXTERNALORDERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateExternalOrderResponse" element
     */
    public void setCreateExternalOrderResponse(com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse createExternalOrderResponse)
    {
        generatedSetterHelperImpl(createExternalOrderResponse, CREATEEXTERNALORDERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateExternalOrderResponse" element
     */
    public com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse addNewCreateExternalOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse target = null;
            target = (com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse)get_store().add_element_user(CREATEEXTERNALORDERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateExternalOrderResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class CreateExternalOrderResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateExternalOrderResponseDocument.CreateExternalOrderResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateExternalOrderResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEEXTERNALORDERRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateExternalOrderResult");
        
        
        /**
         * Gets the "CreateExternalOrderResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage getCreateExternalOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().find_element_user(CREATEEXTERNALORDERRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "CreateExternalOrderResult" element
         */
        public boolean isNilCreateExternalOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().find_element_user(CREATEEXTERNALORDERRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "CreateExternalOrderResult" element
         */
        public boolean isSetCreateExternalOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEEXTERNALORDERRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CreateExternalOrderResult" element
         */
        public void setCreateExternalOrderResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage createExternalOrderResult)
        {
            generatedSetterHelperImpl(createExternalOrderResult, CREATEEXTERNALORDERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CreateExternalOrderResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage addNewCreateExternalOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().add_element_user(CREATEEXTERNALORDERRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "CreateExternalOrderResult" element
         */
        public void setNilCreateExternalOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().find_element_user(CREATEEXTERNALORDERRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().add_element_user(CREATEEXTERNALORDERRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "CreateExternalOrderResult" element
         */
        public void unsetCreateExternalOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEEXTERNALORDERRESULT$0, 0);
            }
        }
    }
}
