/*
 * An XML document type.
 * Localname: OrderStatusMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * A document containing one OrderStatusMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order) element.
 *
 * This is a complex type.
 */
public class OrderStatusMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderStatusMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERSTATUSMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "OrderStatusMessage");
    
    
    /**
     * Gets the "OrderStatusMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage getOrderStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().find_element_user(ORDERSTATUSMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderStatusMessage" element
     */
    public boolean isNilOrderStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().find_element_user(ORDERSTATUSMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderStatusMessage" element
     */
    public void setOrderStatusMessage(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage orderStatusMessage)
    {
        generatedSetterHelperImpl(orderStatusMessage, ORDERSTATUSMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderStatusMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage addNewOrderStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().add_element_user(ORDERSTATUSMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderStatusMessage" element
     */
    public void setNilOrderStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().find_element_user(ORDERSTATUSMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusMessage)get_store().add_element_user(ORDERSTATUSMESSAGE$0);
            }
            target.setNil();
        }
    }
}
