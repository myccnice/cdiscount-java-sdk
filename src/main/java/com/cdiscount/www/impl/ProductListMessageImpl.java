/*
 * XML Type:  ProductListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ProductListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ProductListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.ProductListMessage
{
    private static final long serialVersionUID = 1L;
    
    public ProductListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductList");
    
    
    /**
     * Gets the "ProductList" element
     */
    public com.cdiscount.www.ArrayOfProduct getProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().find_element_user(PRODUCTLIST$0, 0);
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
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().find_element_user(PRODUCTLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductList" element
     */
    public boolean isSetProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductList" element
     */
    public void setProductList(com.cdiscount.www.ArrayOfProduct productList)
    {
        generatedSetterHelperImpl(productList, PRODUCTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductList" element
     */
    public com.cdiscount.www.ArrayOfProduct addNewProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().add_element_user(PRODUCTLIST$0);
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
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().find_element_user(PRODUCTLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProduct)get_store().add_element_user(PRODUCTLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductList" element
     */
    public void unsetProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTLIST$0, 0);
        }
    }
}
