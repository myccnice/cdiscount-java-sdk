/*
 * An XML document type.
 * Localname: Parcel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Parcel(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Parcel");
    
    
    /**
     * Gets the "Parcel" element
     */
    public com.cdiscount.www.Parcel getParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().find_element_user(PARCEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Parcel" element
     */
    public boolean isNilParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().find_element_user(PARCEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Parcel" element
     */
    public void setParcel(com.cdiscount.www.Parcel parcel)
    {
        generatedSetterHelperImpl(parcel, PARCEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Parcel" element
     */
    public com.cdiscount.www.Parcel addNewParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().add_element_user(PARCEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "Parcel" element
     */
    public void setNilParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Parcel target = null;
            target = (com.cdiscount.www.Parcel)get_store().find_element_user(PARCEL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Parcel)get_store().add_element_user(PARCEL$0);
            }
            target.setNil();
        }
    }
}
