/*
 * XML Type:  Brand
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Brand
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Brand(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class BrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Brand
{
    private static final long serialVersionUID = 1L;
    
    public BrandImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDNAME$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BrandName");
    
    
    /**
     * Gets the "BrandName" element
     */
    public java.lang.String getBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BrandName" element
     */
    public org.apache.xmlbeans.XmlString xgetBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BrandName" element
     */
    public boolean isNilBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BrandName" element
     */
    public boolean isSetBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "BrandName" element
     */
    public void setBrandName(java.lang.String brandName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDNAME$0);
            }
            target.setStringValue(brandName);
        }
    }
    
    /**
     * Sets (as xml) the "BrandName" element
     */
    public void xsetBrandName(org.apache.xmlbeans.XmlString brandName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDNAME$0);
            }
            target.set(brandName);
        }
    }
    
    /**
     * Nils the "BrandName" element
     */
    public void setNilBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BrandName" element
     */
    public void unsetBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDNAME$0, 0);
        }
    }
}
