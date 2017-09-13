/*
 * An XML document type.
 * Localname: ProductModel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductModelDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductModel(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductModelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductModelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductModelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTMODEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductModel");
    
    
    /**
     * Gets the "ProductModel" element
     */
    public com.cdiscount.www.ProductModel getProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().find_element_user(PRODUCTMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductModel" element
     */
    public boolean isNilProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().find_element_user(PRODUCTMODEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductModel" element
     */
    public void setProductModel(com.cdiscount.www.ProductModel productModel)
    {
        generatedSetterHelperImpl(productModel, PRODUCTMODEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductModel" element
     */
    public com.cdiscount.www.ProductModel addNewProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().add_element_user(PRODUCTMODEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductModel" element
     */
    public void setNilProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().find_element_user(PRODUCTMODEL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductModel)get_store().add_element_user(PRODUCTMODEL$0);
            }
            target.setNil();
        }
    }
}
