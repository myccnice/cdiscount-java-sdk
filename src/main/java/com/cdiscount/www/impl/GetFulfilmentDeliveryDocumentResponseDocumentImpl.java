/*
 * An XML document type.
 * Localname: GetFulfilmentDeliveryDocumentResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetFulfilmentDeliveryDocumentResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetFulfilmentDeliveryDocumentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFulfilmentDeliveryDocumentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULFILMENTDELIVERYDOCUMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentDeliveryDocumentResponse");
    
    
    /**
     * Gets the "GetFulfilmentDeliveryDocumentResponse" element
     */
    public com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse getGetFulfilmentDeliveryDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse)get_store().find_element_user(GETFULFILMENTDELIVERYDOCUMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFulfilmentDeliveryDocumentResponse" element
     */
    public void setGetFulfilmentDeliveryDocumentResponse(com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse getFulfilmentDeliveryDocumentResponse)
    {
        generatedSetterHelperImpl(getFulfilmentDeliveryDocumentResponse, GETFULFILMENTDELIVERYDOCUMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetFulfilmentDeliveryDocumentResponse" element
     */
    public com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse addNewGetFulfilmentDeliveryDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse)get_store().add_element_user(GETFULFILMENTDELIVERYDOCUMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetFulfilmentDeliveryDocumentResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetFulfilmentDeliveryDocumentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument.GetFulfilmentDeliveryDocumentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetFulfilmentDeliveryDocumentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETFULFILMENTDELIVERYDOCUMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentDeliveryDocumentResult");
        
        
        /**
         * Gets the "GetFulfilmentDeliveryDocumentResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage getGetFulfilmentDeliveryDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().find_element_user(GETFULFILMENTDELIVERYDOCUMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetFulfilmentDeliveryDocumentResult" element
         */
        public boolean isNilGetFulfilmentDeliveryDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().find_element_user(GETFULFILMENTDELIVERYDOCUMENTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetFulfilmentDeliveryDocumentResult" element
         */
        public boolean isSetGetFulfilmentDeliveryDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETFULFILMENTDELIVERYDOCUMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetFulfilmentDeliveryDocumentResult" element
         */
        public void setGetFulfilmentDeliveryDocumentResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage getFulfilmentDeliveryDocumentResult)
        {
            generatedSetterHelperImpl(getFulfilmentDeliveryDocumentResult, GETFULFILMENTDELIVERYDOCUMENTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetFulfilmentDeliveryDocumentResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage addNewGetFulfilmentDeliveryDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().add_element_user(GETFULFILMENTDELIVERYDOCUMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetFulfilmentDeliveryDocumentResult" element
         */
        public void setNilGetFulfilmentDeliveryDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().find_element_user(GETFULFILMENTDELIVERYDOCUMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().add_element_user(GETFULFILMENTDELIVERYDOCUMENTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetFulfilmentDeliveryDocumentResult" element
         */
        public void unsetGetFulfilmentDeliveryDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETFULFILMENTDELIVERYDOCUMENTRESULT$0, 0);
            }
        }
    }
}
