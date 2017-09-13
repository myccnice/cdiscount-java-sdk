/*
 * XML Type:  FulfilmentSupplyOrderRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentSupplyOrderRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentSupplyOrderRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentSupplyOrderRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentSupplyOrderRequest
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentSupplyOrderRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductList");
    
    
    /**
     * Gets the "ProductList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentProductDescription getProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().find_element_user(PRODUCTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductList" element
     */
    public boolean isNilProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().find_element_user(PRODUCTLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductList" element
     */
    public void setProductList(com.cdiscount.www.ArrayOfFulfilmentProductDescription productList)
    {
        generatedSetterHelperImpl(productList, PRODUCTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentProductDescription addNewProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().add_element_user(PRODUCTLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductList" element
     */
    public void setNilProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().find_element_user(PRODUCTLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().add_element_user(PRODUCTLIST$0);
            }
            target.setNil();
        }
    }
}
