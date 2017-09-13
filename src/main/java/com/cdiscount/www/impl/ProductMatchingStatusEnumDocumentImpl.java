/*
 * An XML document type.
 * Localname: ProductMatchingStatusEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductMatchingStatusEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductMatchingStatusEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductMatchingStatusEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductMatchingStatusEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductMatchingStatusEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTMATCHINGSTATUSENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductMatchingStatusEnum");
    
    
    /**
     * Gets the "ProductMatchingStatusEnum" element
     */
    public com.cdiscount.www.ProductMatchingStatusEnum.Enum getProductMatchingStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTMATCHINGSTATUSENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductMatchingStatusEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductMatchingStatusEnum" element
     */
    public com.cdiscount.www.ProductMatchingStatusEnum xgetProductMatchingStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingStatusEnum target = null;
            target = (com.cdiscount.www.ProductMatchingStatusEnum)get_store().find_element_user(PRODUCTMATCHINGSTATUSENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductMatchingStatusEnum" element
     */
    public boolean isNilProductMatchingStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingStatusEnum target = null;
            target = (com.cdiscount.www.ProductMatchingStatusEnum)get_store().find_element_user(PRODUCTMATCHINGSTATUSENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductMatchingStatusEnum" element
     */
    public void setProductMatchingStatusEnum(com.cdiscount.www.ProductMatchingStatusEnum.Enum productMatchingStatusEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTMATCHINGSTATUSENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTMATCHINGSTATUSENUM$0);
            }
            target.setEnumValue(productMatchingStatusEnum);
        }
    }
    
    /**
     * Sets (as xml) the "ProductMatchingStatusEnum" element
     */
    public void xsetProductMatchingStatusEnum(com.cdiscount.www.ProductMatchingStatusEnum productMatchingStatusEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingStatusEnum target = null;
            target = (com.cdiscount.www.ProductMatchingStatusEnum)get_store().find_element_user(PRODUCTMATCHINGSTATUSENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductMatchingStatusEnum)get_store().add_element_user(PRODUCTMATCHINGSTATUSENUM$0);
            }
            target.set(productMatchingStatusEnum);
        }
    }
    
    /**
     * Nils the "ProductMatchingStatusEnum" element
     */
    public void setNilProductMatchingStatusEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingStatusEnum target = null;
            target = (com.cdiscount.www.ProductMatchingStatusEnum)get_store().find_element_user(PRODUCTMATCHINGSTATUSENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductMatchingStatusEnum)get_store().add_element_user(PRODUCTMATCHINGSTATUSENUM$0);
            }
            target.setNil();
        }
    }
}
