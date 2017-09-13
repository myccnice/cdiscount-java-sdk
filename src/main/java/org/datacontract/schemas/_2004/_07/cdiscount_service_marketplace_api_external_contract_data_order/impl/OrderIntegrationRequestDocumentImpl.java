/*
 * An XML document type.
 * Localname: OrderIntegrationRequest
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * A document containing one OrderIntegrationRequest(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order) element.
 *
 * This is a complex type.
 */
public class OrderIntegrationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderIntegrationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERINTEGRATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "OrderIntegrationRequest");
    
    
    /**
     * Gets the "OrderIntegrationRequest" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest getOrderIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest)get_store().find_element_user(ORDERINTEGRATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderIntegrationRequest" element
     */
    public boolean isNilOrderIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest)get_store().find_element_user(ORDERINTEGRATIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderIntegrationRequest" element
     */
    public void setOrderIntegrationRequest(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest orderIntegrationRequest)
    {
        generatedSetterHelperImpl(orderIntegrationRequest, ORDERINTEGRATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderIntegrationRequest" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest addNewOrderIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest)get_store().add_element_user(ORDERINTEGRATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderIntegrationRequest" element
     */
    public void setNilOrderIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest)get_store().find_element_user(ORDERINTEGRATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderIntegrationRequest)get_store().add_element_user(ORDERINTEGRATIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
