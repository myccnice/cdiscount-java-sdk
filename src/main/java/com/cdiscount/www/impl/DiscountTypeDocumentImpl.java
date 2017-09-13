/*
 * An XML document type.
 * Localname: DiscountType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscountTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscountType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscountTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscountTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscountTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscountType");
    
    
    /**
     * Gets the "DiscountType" element
     */
    public com.cdiscount.www.DiscountType.Enum getDiscountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.DiscountType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiscountType" element
     */
    public com.cdiscount.www.DiscountType xgetDiscountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountType target = null;
            target = (com.cdiscount.www.DiscountType)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscountType" element
     */
    public boolean isNilDiscountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountType target = null;
            target = (com.cdiscount.www.DiscountType)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscountType" element
     */
    public void setDiscountType(com.cdiscount.www.DiscountType.Enum discountType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCOUNTTYPE$0);
            }
            target.setEnumValue(discountType);
        }
    }
    
    /**
     * Sets (as xml) the "DiscountType" element
     */
    public void xsetDiscountType(com.cdiscount.www.DiscountType discountType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountType target = null;
            target = (com.cdiscount.www.DiscountType)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscountType)get_store().add_element_user(DISCOUNTTYPE$0);
            }
            target.set(discountType);
        }
    }
    
    /**
     * Nils the "DiscountType" element
     */
    public void setNilDiscountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountType target = null;
            target = (com.cdiscount.www.DiscountType)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscountType)get_store().add_element_user(DISCOUNTTYPE$0);
            }
            target.setNil();
        }
    }
}
