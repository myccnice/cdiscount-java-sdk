/*
 * An XML document type.
 * Localname: ProductTypeEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductTypeEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductTypeEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductTypeEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductTypeEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductTypeEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTTYPEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductTypeEnum");
    
    
    /**
     * Gets the "ProductTypeEnum" element
     */
    public com.cdiscount.www.ProductTypeEnum.Enum getProductTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductTypeEnum" element
     */
    public com.cdiscount.www.ProductTypeEnum xgetProductTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductTypeEnum" element
     */
    public boolean isNilProductTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductTypeEnum" element
     */
    public void setProductTypeEnum(com.cdiscount.www.ProductTypeEnum.Enum productTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPEENUM$0);
            }
            target.setEnumValue(productTypeEnum);
        }
    }
    
    /**
     * Sets (as xml) the "ProductTypeEnum" element
     */
    public void xsetProductTypeEnum(com.cdiscount.www.ProductTypeEnum productTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductTypeEnum)get_store().add_element_user(PRODUCTTYPEENUM$0);
            }
            target.set(productTypeEnum);
        }
    }
    
    /**
     * Nils the "ProductTypeEnum" element
     */
    public void setNilProductTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductTypeEnum)get_store().add_element_user(PRODUCTTYPEENUM$0);
            }
            target.setNil();
        }
    }
}
