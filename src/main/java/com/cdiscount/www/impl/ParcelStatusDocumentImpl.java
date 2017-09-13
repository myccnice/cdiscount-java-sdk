/*
 * An XML document type.
 * Localname: ParcelStatus
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ParcelStatus(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelStatus");
    
    
    /**
     * Gets the "ParcelStatus" element
     */
    public com.cdiscount.www.ParcelStatus.Enum getParcelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ParcelStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParcelStatus" element
     */
    public com.cdiscount.www.ParcelStatus xgetParcelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelStatus target = null;
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelStatus" element
     */
    public boolean isNilParcelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelStatus target = null;
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParcelStatus" element
     */
    public void setParcelStatus(com.cdiscount.www.ParcelStatus.Enum parcelStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARCELSTATUS$0);
            }
            target.setEnumValue(parcelStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ParcelStatus" element
     */
    public void xsetParcelStatus(com.cdiscount.www.ParcelStatus parcelStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelStatus target = null;
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelStatus)get_store().add_element_user(PARCELSTATUS$0);
            }
            target.set(parcelStatus);
        }
    }
    
    /**
     * Nils the "ParcelStatus" element
     */
    public void setNilParcelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelStatus target = null;
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelStatus)get_store().add_element_user(PARCELSTATUS$0);
            }
            target.setNil();
        }
    }
}
