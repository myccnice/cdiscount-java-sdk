/*
 * An XML document type.
 * Localname: ProductFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductFilter");
    
    
    /**
     * Gets the "ProductFilter" element
     */
    public com.cdiscount.www.ProductFilter getProductFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductFilter target = null;
            target = (com.cdiscount.www.ProductFilter)get_store().find_element_user(PRODUCTFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductFilter" element
     */
    public boolean isNilProductFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductFilter target = null;
            target = (com.cdiscount.www.ProductFilter)get_store().find_element_user(PRODUCTFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductFilter" element
     */
    public void setProductFilter(com.cdiscount.www.ProductFilter productFilter)
    {
        generatedSetterHelperImpl(productFilter, PRODUCTFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductFilter" element
     */
    public com.cdiscount.www.ProductFilter addNewProductFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductFilter target = null;
            target = (com.cdiscount.www.ProductFilter)get_store().add_element_user(PRODUCTFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductFilter" element
     */
    public void setNilProductFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductFilter target = null;
            target = (com.cdiscount.www.ProductFilter)get_store().find_element_user(PRODUCTFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductFilter)get_store().add_element_user(PRODUCTFILTER$0);
            }
            target.setNil();
        }
    }
}
