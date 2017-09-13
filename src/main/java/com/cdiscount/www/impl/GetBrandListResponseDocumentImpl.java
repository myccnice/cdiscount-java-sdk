/*
 * An XML document type.
 * Localname: GetBrandListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetBrandListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetBrandListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetBrandListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetBrandListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetBrandListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBRANDLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetBrandListResponse");
    
    
    /**
     * Gets the "GetBrandListResponse" element
     */
    public com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse getGetBrandListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse target = null;
            target = (com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse)get_store().find_element_user(GETBRANDLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBrandListResponse" element
     */
    public void setGetBrandListResponse(com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse getBrandListResponse)
    {
        generatedSetterHelperImpl(getBrandListResponse, GETBRANDLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetBrandListResponse" element
     */
    public com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse addNewGetBrandListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse target = null;
            target = (com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse)get_store().add_element_user(GETBRANDLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetBrandListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetBrandListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetBrandListResponseDocument.GetBrandListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetBrandListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETBRANDLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetBrandListResult");
        
        
        /**
         * Gets the "GetBrandListResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage getGetBrandListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().find_element_user(GETBRANDLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetBrandListResult" element
         */
        public boolean isNilGetBrandListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().find_element_user(GETBRANDLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetBrandListResult" element
         */
        public boolean isSetGetBrandListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETBRANDLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetBrandListResult" element
         */
        public void setGetBrandListResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage getBrandListResult)
        {
            generatedSetterHelperImpl(getBrandListResult, GETBRANDLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetBrandListResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage addNewGetBrandListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().add_element_user(GETBRANDLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetBrandListResult" element
         */
        public void setNilGetBrandListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().find_element_user(GETBRANDLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().add_element_user(GETBRANDLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetBrandListResult" element
         */
        public void unsetGetBrandListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETBRANDLISTRESULT$0, 0);
            }
        }
    }
}
