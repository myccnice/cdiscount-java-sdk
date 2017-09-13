/*
 * An XML document type.
 * Localname: Brand
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.BrandDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Brand(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class BrandDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.BrandDocument
{
    private static final long serialVersionUID = 1L;
    
    public BrandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRAND$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Brand");
    
    
    /**
     * Gets the "Brand" element
     */
    public com.cdiscount.www.Brand getBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().find_element_user(BRAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Brand" element
     */
    public boolean isNilBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().find_element_user(BRAND$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Brand" element
     */
    public void setBrand(com.cdiscount.www.Brand brand)
    {
        generatedSetterHelperImpl(brand, BRAND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Brand" element
     */
    public com.cdiscount.www.Brand addNewBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().add_element_user(BRAND$0);
            return target;
        }
    }
    
    /**
     * Nils the "Brand" element
     */
    public void setNilBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Brand target = null;
            target = (com.cdiscount.www.Brand)get_store().find_element_user(BRAND$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Brand)get_store().add_element_user(BRAND$0);
            }
            target.setNil();
        }
    }
}
