/*
 * XML Type:  ArrayOfProductStock
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * An XML ArrayOfProductStock(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product).
 *
 * This is a complex type.
 */
public class ArrayOfProductStockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductStockImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSTOCK$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "ProductStock");
    
    
    /**
     * Gets array of all "ProductStock" elements
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock[] getProductStockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTSTOCK$0, targetList);
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock[] result = new org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductStock" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock getProductStockArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().find_element_user(PRODUCTSTOCK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProductStock" element
     */
    public boolean isNilProductStockArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().find_element_user(PRODUCTSTOCK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProductStock" element
     */
    public int sizeOfProductStockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSTOCK$0);
        }
    }
    
    /**
     * Sets array of all "ProductStock" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductStockArray(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock[] productStockArray)
    {
        check_orphaned();
        arraySetterHelper(productStockArray, PRODUCTSTOCK$0);
    }
    
    /**
     * Sets ith "ProductStock" element
     */
    public void setProductStockArray(int i, org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock productStock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().find_element_user(PRODUCTSTOCK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productStock);
        }
    }
    
    /**
     * Nils the ith "ProductStock" element
     */
    public void setNilProductStockArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().find_element_user(PRODUCTSTOCK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductStock" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock insertNewProductStock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().insert_element_user(PRODUCTSTOCK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductStock" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock addNewProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().add_element_user(PRODUCTSTOCK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductStock" element
     */
    public void removeProductStock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSTOCK$0, i);
        }
    }
}
