/*
 * An XML document type.
 * Localname: ProductPackagingUnit
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductPackagingUnitDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductPackagingUnit(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductPackagingUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductPackagingUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductPackagingUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTPACKAGINGUNIT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductPackagingUnit");
    
    
    /**
     * Gets the "ProductPackagingUnit" element
     */
    public com.cdiscount.www.ProductPackagingUnit.Enum getProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductPackagingUnit.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductPackagingUnit" element
     */
    public com.cdiscount.www.ProductPackagingUnit xgetProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackagingUnit target = null;
            target = (com.cdiscount.www.ProductPackagingUnit)get_store().find_element_user(PRODUCTPACKAGINGUNIT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductPackagingUnit" element
     */
    public boolean isNilProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackagingUnit target = null;
            target = (com.cdiscount.www.ProductPackagingUnit)get_store().find_element_user(PRODUCTPACKAGINGUNIT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductPackagingUnit" element
     */
    public void setProductPackagingUnit(com.cdiscount.www.ProductPackagingUnit.Enum productPackagingUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTPACKAGINGUNIT$0);
            }
            target.setEnumValue(productPackagingUnit);
        }
    }
    
    /**
     * Sets (as xml) the "ProductPackagingUnit" element
     */
    public void xsetProductPackagingUnit(com.cdiscount.www.ProductPackagingUnit productPackagingUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackagingUnit target = null;
            target = (com.cdiscount.www.ProductPackagingUnit)get_store().find_element_user(PRODUCTPACKAGINGUNIT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductPackagingUnit)get_store().add_element_user(PRODUCTPACKAGINGUNIT$0);
            }
            target.set(productPackagingUnit);
        }
    }
    
    /**
     * Nils the "ProductPackagingUnit" element
     */
    public void setNilProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackagingUnit target = null;
            target = (com.cdiscount.www.ProductPackagingUnit)get_store().find_element_user(PRODUCTPACKAGINGUNIT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductPackagingUnit)get_store().add_element_user(PRODUCTPACKAGINGUNIT$0);
            }
            target.setNil();
        }
    }
}
