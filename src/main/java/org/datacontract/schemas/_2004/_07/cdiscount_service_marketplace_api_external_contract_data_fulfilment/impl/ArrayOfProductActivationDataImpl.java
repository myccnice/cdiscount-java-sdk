/*
 * XML Type:  ArrayOfProductActivationData
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.impl;
/**
 * An XML ArrayOfProductActivationData(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment).
 *
 * This is a complex type.
 */
public class ArrayOfProductActivationDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ArrayOfProductActivationData
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductActivationDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTACTIVATIONDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment", "ProductActivationData");
    
    
    /**
     * Gets array of all "ProductActivationData" elements
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData[] getProductActivationDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTACTIVATIONDATA$0, targetList);
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData[] result = new org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductActivationData" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData getProductActivationDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().find_element_user(PRODUCTACTIVATIONDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProductActivationData" element
     */
    public boolean isNilProductActivationDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().find_element_user(PRODUCTACTIVATIONDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProductActivationData" element
     */
    public int sizeOfProductActivationDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTACTIVATIONDATA$0);
        }
    }
    
    /**
     * Sets array of all "ProductActivationData" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductActivationDataArray(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData[] productActivationDataArray)
    {
        check_orphaned();
        arraySetterHelper(productActivationDataArray, PRODUCTACTIVATIONDATA$0);
    }
    
    /**
     * Sets ith "ProductActivationData" element
     */
    public void setProductActivationDataArray(int i, org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData productActivationData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().find_element_user(PRODUCTACTIVATIONDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productActivationData);
        }
    }
    
    /**
     * Nils the ith "ProductActivationData" element
     */
    public void setNilProductActivationDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().find_element_user(PRODUCTACTIVATIONDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductActivationData" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData insertNewProductActivationData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.ProductActivationData)get_store().insert_element_user(PRODUCTACTIVATIONDATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductActivationData" element
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
     * Removes the ith "ProductActivationData" element
     */
    public void removeProductActivationData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTACTIVATIONDATA$0, i);
        }
    }
}
