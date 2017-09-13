/*
 * An XML document type.
 * Localname: ArrayOfProductActivationData
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.impl;
/**
 * A document containing one ArrayOfProductActivationData(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductActivationDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductActivationDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCTACTIVATIONDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment", "ArrayOfProductActivationData");
    
    
    /**
     * Gets the "ArrayOfProductActivationData" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData getArrayOfProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData)get_store().find_element_user(ARRAYOFPRODUCTACTIVATIONDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProductActivationData" element
     */
    public boolean isNilArrayOfProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData)get_store().find_element_user(ARRAYOFPRODUCTACTIVATIONDATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProductActivationData" element
     */
    public void setArrayOfProductActivationData(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData arrayOfProductActivationData)
    {
        generatedSetterHelperImpl(arrayOfProductActivationData, ARRAYOFPRODUCTACTIVATIONDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProductActivationData" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData addNewArrayOfProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData)get_store().add_element_user(ARRAYOFPRODUCTACTIVATIONDATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProductActivationData" element
     */
    public void setNilArrayOfProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData)get_store().find_element_user(ARRAYOFPRODUCTACTIVATIONDATA$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData)get_store().add_element_user(ARRAYOFPRODUCTACTIVATIONDATA$0);
            }
            target.setNil();
        }
    }
}
