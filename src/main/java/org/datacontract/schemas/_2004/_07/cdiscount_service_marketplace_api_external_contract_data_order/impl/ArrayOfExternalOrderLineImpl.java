/*
 * XML Type:  ArrayOfExternalOrderLine
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * An XML ArrayOfExternalOrderLine(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order).
 *
 * This is a complex type.
 */
public class ArrayOfExternalOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfExternalOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALORDERLINE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ExternalOrderLine");
    
    
    /**
     * Gets array of all "ExternalOrderLine" elements
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine[] getExternalOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTERNALORDERLINE$0, targetList);
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine[] result = new org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExternalOrderLine" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine getExternalOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine)get_store().find_element_user(EXTERNALORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ExternalOrderLine" element
     */
    public boolean isNilExternalOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine)get_store().find_element_user(EXTERNALORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ExternalOrderLine" element
     */
    public int sizeOfExternalOrderLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALORDERLINE$0);
        }
    }
    
    /**
     * Sets array of all "ExternalOrderLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExternalOrderLineArray(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine[] externalOrderLineArray)
    {
        check_orphaned();
        arraySetterHelper(externalOrderLineArray, EXTERNALORDERLINE$0);
    }
    
    /**
     * Sets ith "ExternalOrderLine" element
     */
    public void setExternalOrderLineArray(int i, org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine externalOrderLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine)get_store().find_element_user(EXTERNALORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(externalOrderLine);
        }
    }
    
    /**
     * Nils the ith "ExternalOrderLine" element
     */
    public void setNilExternalOrderLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine)get_store().find_element_user(EXTERNALORDERLINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExternalOrderLine" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine insertNewExternalOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine)get_store().insert_element_user(EXTERNALORDERLINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExternalOrderLine" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine addNewExternalOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine)get_store().add_element_user(EXTERNALORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExternalOrderLine" element
     */
    public void removeExternalOrderLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALORDERLINE$0, i);
        }
    }
}
