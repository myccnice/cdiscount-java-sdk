/*
 * An XML document type.
 * Localname: OrderStatusRequest
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * A document containing one OrderStatusRequest(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order) element.
 *
 * This is a complex type.
 */
public class OrderStatusRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderStatusRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERSTATUSREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "OrderStatusRequest");
    
    
    /**
     * Gets the "OrderStatusRequest" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest getOrderStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().find_element_user(ORDERSTATUSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderStatusRequest" element
     */
    public boolean isNilOrderStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().find_element_user(ORDERSTATUSREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderStatusRequest" element
     */
    public void setOrderStatusRequest(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest orderStatusRequest)
    {
        generatedSetterHelperImpl(orderStatusRequest, ORDERSTATUSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderStatusRequest" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest addNewOrderStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().add_element_user(ORDERSTATUSREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderStatusRequest" element
     */
    public void setNilOrderStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().find_element_user(ORDERSTATUSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().add_element_user(ORDERSTATUSREQUEST$0);
            }
            target.setNil();
        }
    }
}
