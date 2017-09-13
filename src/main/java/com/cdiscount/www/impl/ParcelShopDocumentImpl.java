/*
 * An XML document type.
 * Localname: ParcelShop
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelShopDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ParcelShop(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelShopDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelShopDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelShopDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELSHOP$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelShop");
    
    
    /**
     * Gets the "ParcelShop" element
     */
    public com.cdiscount.www.ParcelShop getParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().find_element_user(PARCELSHOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelShop" element
     */
    public boolean isNilParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().find_element_user(PARCELSHOP$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParcelShop" element
     */
    public void setParcelShop(com.cdiscount.www.ParcelShop parcelShop)
    {
        generatedSetterHelperImpl(parcelShop, PARCELSHOP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelShop" element
     */
    public com.cdiscount.www.ParcelShop addNewParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().add_element_user(PARCELSHOP$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelShop" element
     */
    public void setNilParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShop target = null;
            target = (com.cdiscount.www.ParcelShop)get_store().find_element_user(PARCELSHOP$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelShop)get_store().add_element_user(PARCELSHOP$0);
            }
            target.setNil();
        }
    }
}
