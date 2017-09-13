/*
 * XML Type:  ParcelShopListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelShopListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ParcelShopListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ParcelShopListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.ParcelShopListMessage
{
    private static final long serialVersionUID = 1L;
    
    public ParcelShopListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELSHOPLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelShopList");
    
    
    /**
     * Gets the "ParcelShopList" element
     */
    public com.cdiscount.www.ArrayOfParcelShop getParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().find_element_user(PARCELSHOPLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelShopList" element
     */
    public boolean isNilParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().find_element_user(PARCELSHOPLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelShopList" element
     */
    public boolean isSetParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELSHOPLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ParcelShopList" element
     */
    public void setParcelShopList(com.cdiscount.www.ArrayOfParcelShop parcelShopList)
    {
        generatedSetterHelperImpl(parcelShopList, PARCELSHOPLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelShopList" element
     */
    public com.cdiscount.www.ArrayOfParcelShop addNewParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().add_element_user(PARCELSHOPLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelShopList" element
     */
    public void setNilParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().find_element_user(PARCELSHOPLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelShop)get_store().add_element_user(PARCELSHOPLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelShopList" element
     */
    public void unsetParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELSHOPLIST$0, 0);
        }
    }
}
