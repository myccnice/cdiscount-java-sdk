/*
 * An XML document type.
 * Localname: ArrayOfExternalOrderLine
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * A document containing one ArrayOfExternalOrderLine(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order) element.
 *
 * This is a complex type.
 */
public class ArrayOfExternalOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfExternalOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFEXTERNALORDERLINE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ArrayOfExternalOrderLine");
    
    
    /**
     * Gets the "ArrayOfExternalOrderLine" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine getArrayOfExternalOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().find_element_user(ARRAYOFEXTERNALORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfExternalOrderLine" element
     */
    public boolean isNilArrayOfExternalOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().find_element_user(ARRAYOFEXTERNALORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfExternalOrderLine" element
     */
    public void setArrayOfExternalOrderLine(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine arrayOfExternalOrderLine)
    {
        generatedSetterHelperImpl(arrayOfExternalOrderLine, ARRAYOFEXTERNALORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfExternalOrderLine" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine addNewArrayOfExternalOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().add_element_user(ARRAYOFEXTERNALORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfExternalOrderLine" element
     */
    public void setNilArrayOfExternalOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().find_element_user(ARRAYOFEXTERNALORDERLINE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().add_element_user(ARRAYOFEXTERNALORDERLINE$0);
            }
            target.setNil();
        }
    }
}
