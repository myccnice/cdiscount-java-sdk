/*
 * XML Type:  BrandListMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * An XML BrandListMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product).
 *
 * This is a complex type.
 */
public class BrandListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.BrandListMessage
{
    private static final long serialVersionUID = 1L;
    
    public BrandListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDLIST$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "BrandList");
    
    
    /**
     * Gets the "BrandList" element
     */
    public com.cdiscount.www.ArrayOfBrand getBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().find_element_user(BRANDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BrandList" element
     */
    public boolean isNilBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().find_element_user(BRANDLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BrandList" element
     */
    public boolean isSetBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "BrandList" element
     */
    public void setBrandList(com.cdiscount.www.ArrayOfBrand brandList)
    {
        generatedSetterHelperImpl(brandList, BRANDLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BrandList" element
     */
    public com.cdiscount.www.ArrayOfBrand addNewBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().add_element_user(BRANDLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "BrandList" element
     */
    public void setNilBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().find_element_user(BRANDLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfBrand)get_store().add_element_user(BRANDLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BrandList" element
     */
    public void unsetBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDLIST$0, 0);
        }
    }
}
