/*
 * XML Type:  FulfilmentProductRequest
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * An XML FulfilmentProductRequest(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product).
 *
 * This is a complex type.
 */
public class FulfilmentProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.FulfilmentProductRequest
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BARCODELIST$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "BarCodeList");
    private static final javax.xml.namespace.QName FULFILMENTREFERENCEMENT$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "FulfilmentReferencement");
    
    
    /**
     * Gets the "BarCodeList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getBarCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(BARCODELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BarCodeList" element
     */
    public boolean isNilBarCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(BARCODELIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BarCodeList" element
     */
    public boolean isSetBarCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BARCODELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "BarCodeList" element
     */
    public void setBarCodeList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring barCodeList)
    {
        generatedSetterHelperImpl(barCodeList, BARCODELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BarCodeList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewBarCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(BARCODELIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "BarCodeList" element
     */
    public void setNilBarCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(BARCODELIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(BARCODELIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BarCodeList" element
     */
    public void unsetBarCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BARCODELIST$0, 0);
        }
    }
    
    /**
     * Gets the "FulfilmentReferencement" element
     */
    public com.cdiscount.www.FbcReferencementFilter.Enum getFulfilmentReferencement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILMENTREFERENCEMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.FbcReferencementFilter.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FulfilmentReferencement" element
     */
    public com.cdiscount.www.FbcReferencementFilter xgetFulfilmentReferencement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FbcReferencementFilter target = null;
            target = (com.cdiscount.www.FbcReferencementFilter)get_store().find_element_user(FULFILMENTREFERENCEMENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FulfilmentReferencement" element
     */
    public boolean isSetFulfilmentReferencement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILMENTREFERENCEMENT$2) != 0;
        }
    }
    
    /**
     * Sets the "FulfilmentReferencement" element
     */
    public void setFulfilmentReferencement(com.cdiscount.www.FbcReferencementFilter.Enum fulfilmentReferencement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILMENTREFERENCEMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULFILMENTREFERENCEMENT$2);
            }
            target.setEnumValue(fulfilmentReferencement);
        }
    }
    
    /**
     * Sets (as xml) the "FulfilmentReferencement" element
     */
    public void xsetFulfilmentReferencement(com.cdiscount.www.FbcReferencementFilter fulfilmentReferencement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FbcReferencementFilter target = null;
            target = (com.cdiscount.www.FbcReferencementFilter)get_store().find_element_user(FULFILMENTREFERENCEMENT$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FbcReferencementFilter)get_store().add_element_user(FULFILMENTREFERENCEMENT$2);
            }
            target.set(fulfilmentReferencement);
        }
    }
    
    /**
     * Unsets the "FulfilmentReferencement" element
     */
    public void unsetFulfilmentReferencement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILMENTREFERENCEMENT$2, 0);
        }
    }
}
