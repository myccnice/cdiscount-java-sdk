/*
 * An XML document type.
 * Localname: BrandListMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * A document containing one BrandListMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product) element.
 *
 * This is a complex type.
 */
public class BrandListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public BrandListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "BrandListMessage");
    
    
    /**
     * Gets the "BrandListMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage getBrandListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().find_element_user(BRANDLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BrandListMessage" element
     */
    public boolean isNilBrandListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().find_element_user(BRANDLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BrandListMessage" element
     */
    public void setBrandListMessage(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage brandListMessage)
    {
        generatedSetterHelperImpl(brandListMessage, BRANDLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BrandListMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage addNewBrandListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().add_element_user(BRANDLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "BrandListMessage" element
     */
    public void setNilBrandListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().find_element_user(BRANDLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage)get_store().add_element_user(BRANDLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
