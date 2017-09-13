/*
 * An XML document type.
 * Localname: ParcelShopListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelShopListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ParcelShopListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelShopListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelShopListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelShopListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELSHOPLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelShopListMessage");
    
    
    /**
     * Gets the "ParcelShopListMessage" element
     */
    public com.cdiscount.www.ParcelShopListMessage getParcelShopListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShopListMessage target = null;
            target = (com.cdiscount.www.ParcelShopListMessage)get_store().find_element_user(PARCELSHOPLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelShopListMessage" element
     */
    public boolean isNilParcelShopListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShopListMessage target = null;
            target = (com.cdiscount.www.ParcelShopListMessage)get_store().find_element_user(PARCELSHOPLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParcelShopListMessage" element
     */
    public void setParcelShopListMessage(com.cdiscount.www.ParcelShopListMessage parcelShopListMessage)
    {
        generatedSetterHelperImpl(parcelShopListMessage, PARCELSHOPLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelShopListMessage" element
     */
    public com.cdiscount.www.ParcelShopListMessage addNewParcelShopListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShopListMessage target = null;
            target = (com.cdiscount.www.ParcelShopListMessage)get_store().add_element_user(PARCELSHOPLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelShopListMessage" element
     */
    public void setNilParcelShopListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelShopListMessage target = null;
            target = (com.cdiscount.www.ParcelShopListMessage)get_store().find_element_user(PARCELSHOPLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelShopListMessage)get_store().add_element_user(PARCELSHOPLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
