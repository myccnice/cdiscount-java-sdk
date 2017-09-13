/*
 * An XML document type.
 * Localname: GetProductStockListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductStockListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductStockListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductStockListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductStockListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductStockListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTSTOCKLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductStockListResponse");
    
    
    /**
     * Gets the "GetProductStockListResponse" element
     */
    public com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse getGetProductStockListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse target = null;
            target = (com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse)get_store().find_element_user(GETPRODUCTSTOCKLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductStockListResponse" element
     */
    public void setGetProductStockListResponse(com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse getProductStockListResponse)
    {
        generatedSetterHelperImpl(getProductStockListResponse, GETPRODUCTSTOCKLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductStockListResponse" element
     */
    public com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse addNewGetProductStockListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse target = null;
            target = (com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse)get_store().add_element_user(GETPRODUCTSTOCKLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductStockListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductStockListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductStockListResponseDocument.GetProductStockListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductStockListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPRODUCTSTOCKLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductStockListResult");
        
        
        /**
         * Gets the "GetProductStockListResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage getGetProductStockListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().find_element_user(GETPRODUCTSTOCKLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetProductStockListResult" element
         */
        public boolean isNilGetProductStockListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().find_element_user(GETPRODUCTSTOCKLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetProductStockListResult" element
         */
        public boolean isSetGetProductStockListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPRODUCTSTOCKLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetProductStockListResult" element
         */
        public void setGetProductStockListResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage getProductStockListResult)
        {
            generatedSetterHelperImpl(getProductStockListResult, GETPRODUCTSTOCKLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetProductStockListResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage addNewGetProductStockListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().add_element_user(GETPRODUCTSTOCKLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetProductStockListResult" element
         */
        public void setNilGetProductStockListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().find_element_user(GETPRODUCTSTOCKLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().add_element_user(GETPRODUCTSTOCKLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetProductStockListResult" element
         */
        public void unsetGetProductStockListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPRODUCTSTOCKLISTRESULT$0, 0);
            }
        }
    }
}
