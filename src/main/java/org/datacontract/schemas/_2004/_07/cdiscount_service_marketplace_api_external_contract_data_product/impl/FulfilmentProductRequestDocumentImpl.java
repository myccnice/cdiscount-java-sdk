/*
 * An XML document type.
 * Localname: FulfilmentProductRequest
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * A document containing one FulfilmentProductRequest(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product) element.
 *
 * This is a complex type.
 */
public class FulfilmentProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "FulfilmentProductRequest");
    
    
    /**
     * Gets the "FulfilmentProductRequest" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest getFulfilmentProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().find_element_user(FULFILMENTPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentProductRequest" element
     */
    public boolean isNilFulfilmentProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().find_element_user(FULFILMENTPRODUCTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentProductRequest" element
     */
    public void setFulfilmentProductRequest(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest fulfilmentProductRequest)
    {
        generatedSetterHelperImpl(fulfilmentProductRequest, FULFILMENTPRODUCTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentProductRequest" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest addNewFulfilmentProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().add_element_user(FULFILMENTPRODUCTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentProductRequest" element
     */
    public void setNilFulfilmentProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().find_element_user(FULFILMENTPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest)get_store().add_element_user(FULFILMENTPRODUCTREQUEST$0);
            }
            target.setNil();
        }
    }
}
