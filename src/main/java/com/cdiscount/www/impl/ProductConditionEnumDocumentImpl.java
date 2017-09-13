/*
 * An XML document type.
 * Localname: ProductConditionEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductConditionEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductConditionEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductConditionEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductConditionEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductConditionEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCONDITIONENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductConditionEnum");
    
    
    /**
     * Gets the "ProductConditionEnum" element
     */
    public com.cdiscount.www.ProductConditionEnum.Enum getProductConditionEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITIONENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductConditionEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductConditionEnum" element
     */
    public com.cdiscount.www.ProductConditionEnum xgetProductConditionEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITIONENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductConditionEnum" element
     */
    public boolean isNilProductConditionEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITIONENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductConditionEnum" element
     */
    public void setProductConditionEnum(com.cdiscount.www.ProductConditionEnum.Enum productConditionEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITIONENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCONDITIONENUM$0);
            }
            target.setEnumValue(productConditionEnum);
        }
    }
    
    /**
     * Sets (as xml) the "ProductConditionEnum" element
     */
    public void xsetProductConditionEnum(com.cdiscount.www.ProductConditionEnum productConditionEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITIONENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductConditionEnum)get_store().add_element_user(PRODUCTCONDITIONENUM$0);
            }
            target.set(productConditionEnum);
        }
    }
    
    /**
     * Nils the "ProductConditionEnum" element
     */
    public void setNilProductConditionEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITIONENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductConditionEnum)get_store().add_element_user(PRODUCTCONDITIONENUM$0);
            }
            target.setNil();
        }
    }
}
