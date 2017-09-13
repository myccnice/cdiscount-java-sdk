/*
 * An XML document type.
 * Localname: FulfilmentDeliveryDocumentMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.impl;
/**
 * A document containing one FulfilmentDeliveryDocumentMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment) element.
 *
 * This is a complex type.
 */
public class FulfilmentDeliveryDocumentMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentDeliveryDocumentMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTDELIVERYDOCUMENTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment", "FulfilmentDeliveryDocumentMessage");
    
    
    /**
     * Gets the "FulfilmentDeliveryDocumentMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage getFulfilmentDeliveryDocumentMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().find_element_user(FULFILMENTDELIVERYDOCUMENTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentDeliveryDocumentMessage" element
     */
    public boolean isNilFulfilmentDeliveryDocumentMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().find_element_user(FULFILMENTDELIVERYDOCUMENTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentDeliveryDocumentMessage" element
     */
    public void setFulfilmentDeliveryDocumentMessage(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage fulfilmentDeliveryDocumentMessage)
    {
        generatedSetterHelperImpl(fulfilmentDeliveryDocumentMessage, FULFILMENTDELIVERYDOCUMENTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentDeliveryDocumentMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage addNewFulfilmentDeliveryDocumentMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().add_element_user(FULFILMENTDELIVERYDOCUMENTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentDeliveryDocumentMessage" element
     */
    public void setNilFulfilmentDeliveryDocumentMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().find_element_user(FULFILMENTDELIVERYDOCUMENTMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage)get_store().add_element_user(FULFILMENTDELIVERYDOCUMENTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
