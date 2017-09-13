/*
 * An XML document type.
 * Localname: ProductStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductStateEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductStateEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductStateEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductStateEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductStateEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductStateEnum");
    
    
    /**
     * Gets the "ProductStateEnum" element
     */
    public com.cdiscount.www.ProductStateEnum.Enum getProductStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductStateEnum" element
     */
    public com.cdiscount.www.ProductStateEnum xgetProductStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductStateEnum target = null;
            target = (com.cdiscount.www.ProductStateEnum)get_store().find_element_user(PRODUCTSTATEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductStateEnum" element
     */
    public boolean isNilProductStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductStateEnum target = null;
            target = (com.cdiscount.www.ProductStateEnum)get_store().find_element_user(PRODUCTSTATEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductStateEnum" element
     */
    public void setProductStateEnum(com.cdiscount.www.ProductStateEnum.Enum productStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSTATEENUM$0);
            }
            target.setEnumValue(productStateEnum);
        }
    }
    
    /**
     * Sets (as xml) the "ProductStateEnum" element
     */
    public void xsetProductStateEnum(com.cdiscount.www.ProductStateEnum productStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductStateEnum target = null;
            target = (com.cdiscount.www.ProductStateEnum)get_store().find_element_user(PRODUCTSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductStateEnum)get_store().add_element_user(PRODUCTSTATEENUM$0);
            }
            target.set(productStateEnum);
        }
    }
    
    /**
     * Nils the "ProductStateEnum" element
     */
    public void setNilProductStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductStateEnum target = null;
            target = (com.cdiscount.www.ProductStateEnum)get_store().find_element_user(PRODUCTSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductStateEnum)get_store().add_element_user(PRODUCTSTATEENUM$0);
            }
            target.setNil();
        }
    }
}
