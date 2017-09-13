/*
 * An XML document type.
 * Localname: SellerSubStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerSubStateEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerSubStateEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerSubStateEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerSubStateEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerSubStateEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERSUBSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerSubStateEnum");
    
    
    /**
     * Gets the "SellerSubStateEnum" element
     */
    public com.cdiscount.www.SellerSubStateEnum.Enum getSellerSubStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSUBSTATEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SellerSubStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerSubStateEnum" element
     */
    public com.cdiscount.www.SellerSubStateEnum xgetSellerSubStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerSubStateEnum target = null;
            target = (com.cdiscount.www.SellerSubStateEnum)get_store().find_element_user(SELLERSUBSTATEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerSubStateEnum" element
     */
    public boolean isNilSellerSubStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerSubStateEnum target = null;
            target = (com.cdiscount.www.SellerSubStateEnum)get_store().find_element_user(SELLERSUBSTATEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerSubStateEnum" element
     */
    public void setSellerSubStateEnum(com.cdiscount.www.SellerSubStateEnum.Enum sellerSubStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSUBSTATEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERSUBSTATEENUM$0);
            }
            target.setEnumValue(sellerSubStateEnum);
        }
    }
    
    /**
     * Sets (as xml) the "SellerSubStateEnum" element
     */
    public void xsetSellerSubStateEnum(com.cdiscount.www.SellerSubStateEnum sellerSubStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerSubStateEnum target = null;
            target = (com.cdiscount.www.SellerSubStateEnum)get_store().find_element_user(SELLERSUBSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerSubStateEnum)get_store().add_element_user(SELLERSUBSTATEENUM$0);
            }
            target.set(sellerSubStateEnum);
        }
    }
    
    /**
     * Nils the "SellerSubStateEnum" element
     */
    public void setNilSellerSubStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerSubStateEnum target = null;
            target = (com.cdiscount.www.SellerSubStateEnum)get_store().find_element_user(SELLERSUBSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerSubStateEnum)get_store().add_element_user(SELLERSUBSTATEENUM$0);
            }
            target.setNil();
        }
    }
}
