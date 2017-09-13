/*
 * An XML document type.
 * Localname: Product
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Product(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Product");
    
    
    /**
     * Gets the "Product" element
     */
    public com.cdiscount.www.Product getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Product" element
     */
    public boolean isNilProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Product" element
     */
    public void setProduct(com.cdiscount.www.Product product)
    {
        generatedSetterHelperImpl(product, PRODUCT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Product" element
     */
    public com.cdiscount.www.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().add_element_user(PRODUCT$0);
            return target;
        }
    }
    
    /**
     * Nils the "Product" element
     */
    public void setNilProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Product target = null;
            target = (com.cdiscount.www.Product)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Product)get_store().add_element_user(PRODUCT$0);
            }
            target.setNil();
        }
    }
}
