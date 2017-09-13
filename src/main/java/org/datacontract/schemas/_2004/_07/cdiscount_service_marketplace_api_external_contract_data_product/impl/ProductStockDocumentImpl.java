/*
 * An XML document type.
 * Localname: ProductStock
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * A document containing one ProductStock(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product) element.
 *
 * This is a complex type.
 */
public class ProductStockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductStockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSTOCK$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "ProductStock");
    
    
    /**
     * Gets the "ProductStock" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock getProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().find_element_user(PRODUCTSTOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductStock" element
     */
    public boolean isNilProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().find_element_user(PRODUCTSTOCK$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductStock" element
     */
    public void setProductStock(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock productStock)
    {
        generatedSetterHelperImpl(productStock, PRODUCTSTOCK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductStock" element
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
     * Nils the "ProductStock" element
     */
    public void setNilProductStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().find_element_user(PRODUCTSTOCK$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock)get_store().add_element_user(PRODUCTSTOCK$0);
            }
            target.setNil();
        }
    }
}
