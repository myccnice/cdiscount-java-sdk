/*
 * An XML document type.
 * Localname: ProductActivationData
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.impl;
/**
 * A document containing one ProductActivationData(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment) element.
 *
 * This is a complex type.
 */
public class ProductActivationDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductActivationDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTACTIVATIONDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment", "ProductActivationData");
    
    
    /**
     * Gets the "ProductActivationData" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData getProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().find_element_user(PRODUCTACTIVATIONDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductActivationData" element
     */
    public boolean isNilProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().find_element_user(PRODUCTACTIVATIONDATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductActivationData" element
     */
    public void setProductActivationData(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData productActivationData)
    {
        generatedSetterHelperImpl(productActivationData, PRODUCTACTIVATIONDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductActivationData" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData addNewProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().add_element_user(PRODUCTACTIVATIONDATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductActivationData" element
     */
    public void setNilProductActivationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().find_element_user(PRODUCTACTIVATIONDATA$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().add_element_user(PRODUCTACTIVATIONDATA$0);
            }
            target.setNil();
        }
    }
}
