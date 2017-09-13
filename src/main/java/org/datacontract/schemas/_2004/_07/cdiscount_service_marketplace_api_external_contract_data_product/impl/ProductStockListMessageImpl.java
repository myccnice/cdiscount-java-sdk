/*
 * XML Type:  ProductStockListMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * An XML ProductStockListMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product).
 *
 * This is a complex type.
 */
public class ProductStockListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStockListMessage
{
    private static final long serialVersionUID = 1L;
    
    public ProductStockListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSTOCKLIST$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "ProductStockList");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "Status");
    private static final javax.xml.namespace.QName TOTALPRODUCTCOUNT$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "TotalProductCount");
    
    
    /**
     * Gets the "ProductStockList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock getProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().find_element_user(PRODUCTSTOCKLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductStockList" element
     */
    public boolean isNilProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().find_element_user(PRODUCTSTOCKLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductStockList" element
     */
    public boolean isSetProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSTOCKLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductStockList" element
     */
    public void setProductStockList(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock productStockList)
    {
        generatedSetterHelperImpl(productStockList, PRODUCTSTOCKLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductStockList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock addNewProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().add_element_user(PRODUCTSTOCKLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductStockList" element
     */
    public void setNilProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().find_element_user(PRODUCTSTOCKLIST$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ArrayOfProductStock)get_store().add_element_user(PRODUCTSTOCKLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductStockList" element
     */
    public void unsetProductStockList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSTOCKLIST$0, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.cdiscount.www.FulfilmentProductListStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.FulfilmentProductListStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.cdiscount.www.FulfilmentProductListStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductListStatus target = null;
            target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().find_element_user(STATUS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.cdiscount.www.FulfilmentProductListStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.cdiscount.www.FulfilmentProductListStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductListStatus target = null;
            target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().add_element_user(STATUS$2);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$2, 0);
        }
    }
    
    /**
     * Gets the "TotalProductCount" element
     */
    public int getTotalProductCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALPRODUCTCOUNT$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalProductCount" element
     */
    public org.apache.xmlbeans.XmlInt xgetTotalProductCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALPRODUCTCOUNT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalProductCount" element
     */
    public boolean isSetTotalProductCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALPRODUCTCOUNT$4) != 0;
        }
    }
    
    /**
     * Sets the "TotalProductCount" element
     */
    public void setTotalProductCount(int totalProductCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALPRODUCTCOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALPRODUCTCOUNT$4);
            }
            target.setIntValue(totalProductCount);
        }
    }
    
    /**
     * Sets (as xml) the "TotalProductCount" element
     */
    public void xsetTotalProductCount(org.apache.xmlbeans.XmlInt totalProductCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALPRODUCTCOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALPRODUCTCOUNT$4);
            }
            target.set(totalProductCount);
        }
    }
    
    /**
     * Unsets the "TotalProductCount" element
     */
    public void unsetTotalProductCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALPRODUCTCOUNT$4, 0);
        }
    }
}
