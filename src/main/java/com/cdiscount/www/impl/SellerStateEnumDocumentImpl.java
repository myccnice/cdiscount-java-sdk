/*
 * An XML document type.
 * Localname: SellerStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerStateEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerStateEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerStateEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerStateEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerStateEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerStateEnum");
    
    
    /**
     * Gets the "SellerStateEnum" element
     */
    public com.cdiscount.www.SellerStateEnum.Enum getSellerStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSTATEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SellerStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerStateEnum" element
     */
    public com.cdiscount.www.SellerStateEnum xgetSellerStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerStateEnum target = null;
            target = (com.cdiscount.www.SellerStateEnum)get_store().find_element_user(SELLERSTATEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerStateEnum" element
     */
    public boolean isNilSellerStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerStateEnum target = null;
            target = (com.cdiscount.www.SellerStateEnum)get_store().find_element_user(SELLERSTATEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerStateEnum" element
     */
    public void setSellerStateEnum(com.cdiscount.www.SellerStateEnum.Enum sellerStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERSTATEENUM$0);
            }
            target.setEnumValue(sellerStateEnum);
        }
    }
    
    /**
     * Sets (as xml) the "SellerStateEnum" element
     */
    public void xsetSellerStateEnum(com.cdiscount.www.SellerStateEnum sellerStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerStateEnum target = null;
            target = (com.cdiscount.www.SellerStateEnum)get_store().find_element_user(SELLERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerStateEnum)get_store().add_element_user(SELLERSTATEENUM$0);
            }
            target.set(sellerStateEnum);
        }
    }
    
    /**
     * Nils the "SellerStateEnum" element
     */
    public void setNilSellerStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerStateEnum target = null;
            target = (com.cdiscount.www.SellerStateEnum)get_store().find_element_user(SELLERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerStateEnum)get_store().add_element_user(SELLERSTATEENUM$0);
            }
            target.setNil();
        }
    }
}
