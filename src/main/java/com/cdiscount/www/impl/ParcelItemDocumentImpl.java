/*
 * An XML document type.
 * Localname: ParcelItem
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ParcelItem(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELITEM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelItem");
    
    
    /**
     * Gets the "ParcelItem" element
     */
    public com.cdiscount.www.ParcelItem getParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().find_element_user(PARCELITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelItem" element
     */
    public boolean isNilParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().find_element_user(PARCELITEM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParcelItem" element
     */
    public void setParcelItem(com.cdiscount.www.ParcelItem parcelItem)
    {
        generatedSetterHelperImpl(parcelItem, PARCELITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelItem" element
     */
    public com.cdiscount.www.ParcelItem addNewParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().add_element_user(PARCELITEM$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelItem" element
     */
    public void setNilParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelItem target = null;
            target = (com.cdiscount.www.ParcelItem)get_store().find_element_user(PARCELITEM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelItem)get_store().add_element_user(PARCELITEM$0);
            }
            target.setNil();
        }
    }
}
