/*
 * An XML document type.
 * Localname: OrderIntegrationMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.impl;
/**
 * A document containing one OrderIntegrationMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data) element.
 *
 * This is a complex type.
 */
public class OrderIntegrationMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderIntegrationMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERINTEGRATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data", "OrderIntegrationMessage");
    
    
    /**
     * Gets the "OrderIntegrationMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage getOrderIntegrationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().find_element_user(ORDERINTEGRATIONMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderIntegrationMessage" element
     */
    public boolean isNilOrderIntegrationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().find_element_user(ORDERINTEGRATIONMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderIntegrationMessage" element
     */
    public void setOrderIntegrationMessage(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage orderIntegrationMessage)
    {
        generatedSetterHelperImpl(orderIntegrationMessage, ORDERINTEGRATIONMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderIntegrationMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage addNewOrderIntegrationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().add_element_user(ORDERINTEGRATIONMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderIntegrationMessage" element
     */
    public void setNilOrderIntegrationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().find_element_user(ORDERINTEGRATIONMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data.OrderIntegrationMessage)get_store().add_element_user(ORDERINTEGRATIONMESSAGE$0);
            }
            target.setNil();
        }
    }
}
