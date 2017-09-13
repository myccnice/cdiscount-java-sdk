/*
 * An XML document type.
 * Localname: OfferStateActionType
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.impl;
/**
 * A document containing one OfferStateActionType(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment) element.
 *
 * This is a complex type.
 */
public class OfferStateActionTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferStateActionTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERSTATEACTIONTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment", "OfferStateActionType");
    
    
    /**
     * Gets the "OfferStateActionType" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType.Enum getOfferStateActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSTATEACTIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferStateActionType" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType xgetOfferStateActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().find_element_user(OFFERSTATEACTIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferStateActionType" element
     */
    public boolean isNilOfferStateActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().find_element_user(OFFERSTATEACTIONTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferStateActionType" element
     */
    public void setOfferStateActionType(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType.Enum offerStateActionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSTATEACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERSTATEACTIONTYPE$0);
            }
            target.setEnumValue(offerStateActionType);
        }
    }
    
    /**
     * Sets (as xml) the "OfferStateActionType" element
     */
    public void xsetOfferStateActionType(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType offerStateActionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().find_element_user(OFFERSTATEACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().add_element_user(OFFERSTATEACTIONTYPE$0);
            }
            target.set(offerStateActionType);
        }
    }
    
    /**
     * Nils the "OfferStateActionType" element
     */
    public void setNilOfferStateActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().find_element_user(OFFERSTATEACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().add_element_user(OFFERSTATEACTIONTYPE$0);
            }
            target.setNil();
        }
    }
}
