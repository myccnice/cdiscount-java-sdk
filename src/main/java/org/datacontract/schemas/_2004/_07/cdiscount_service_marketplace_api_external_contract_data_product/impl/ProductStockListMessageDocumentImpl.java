/*
 * An XML document type.
 * Localname: ProductStockListMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * A document containing one ProductStockListMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product) element.
 *
 * This is a complex type.
 */
public class ProductStockListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductStockListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSTOCKLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "ProductStockListMessage");
    
    
    /**
     * Gets the "ProductStockListMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage getProductStockListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().find_element_user(PRODUCTSTOCKLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductStockListMessage" element
     */
    public boolean isNilProductStockListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().find_element_user(PRODUCTSTOCKLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductStockListMessage" element
     */
    public void setProductStockListMessage(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage productStockListMessage)
    {
        generatedSetterHelperImpl(productStockListMessage, PRODUCTSTOCKLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductStockListMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage addNewProductStockListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().add_element_user(PRODUCTSTOCKLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductStockListMessage" element
     */
    public void setNilProductStockListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().find_element_user(PRODUCTSTOCKLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage)get_store().add_element_user(PRODUCTSTOCKLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
