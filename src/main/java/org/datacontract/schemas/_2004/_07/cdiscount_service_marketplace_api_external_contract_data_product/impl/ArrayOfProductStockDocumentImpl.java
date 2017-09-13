/*
 * An XML document type.
 * Localname: ArrayOfProductStock
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStockDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * A document containing one ArrayOfProductStock(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductStockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStockDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductStockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCTSTOCK$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "ArrayOfProductStock");
    
    
    /**
     * Gets the "ArrayOfProductStock" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock getArrayOfProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().find_element_user(ARRAYOFPRODUCTSTOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProductStock" element
     */
    public boolean isNilArrayOfProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().find_element_user(ARRAYOFPRODUCTSTOCK$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProductStock" element
     */
    public void setArrayOfProductStock(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock arrayOfProductStock)
    {
        generatedSetterHelperImpl(arrayOfProductStock, ARRAYOFPRODUCTSTOCK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProductStock" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock addNewArrayOfProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().add_element_user(ARRAYOFPRODUCTSTOCK$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProductStock" element
     */
    public void setNilArrayOfProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().find_element_user(ARRAYOFPRODUCTSTOCK$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().add_element_user(ARRAYOFPRODUCTSTOCK$0);
            }
            target.setNil();
        }
    }
}
