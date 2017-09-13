/*
 * An XML document type.
 * Localname: ProductMatching
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductMatchingDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductMatching(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductMatchingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductMatchingDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductMatchingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTMATCHING$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductMatching");
    
    
    /**
     * Gets the "ProductMatching" element
     */
    public com.cdiscount.www.ProductMatching getProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().find_element_user(PRODUCTMATCHING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductMatching" element
     */
    public boolean isNilProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().find_element_user(PRODUCTMATCHING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductMatching" element
     */
    public void setProductMatching(com.cdiscount.www.ProductMatching productMatching)
    {
        generatedSetterHelperImpl(productMatching, PRODUCTMATCHING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductMatching" element
     */
    public com.cdiscount.www.ProductMatching addNewProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().add_element_user(PRODUCTMATCHING$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductMatching" element
     */
    public void setNilProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatching target = null;
            target = (com.cdiscount.www.ProductMatching)get_store().find_element_user(PRODUCTMATCHING$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductMatching)get_store().add_element_user(PRODUCTMATCHING$0);
            }
            target.setNil();
        }
    }
}
