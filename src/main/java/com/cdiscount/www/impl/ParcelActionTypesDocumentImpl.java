/*
 * An XML document type.
 * Localname: ParcelActionTypes
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelActionTypesDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ParcelActionTypes(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelActionTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelActionTypesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelActionTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELACTIONTYPES$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelActionTypes");
    
    
    /**
     * Gets the "ParcelActionTypes" element
     */
    public java.util.List getParcelActionTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELACTIONTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParcelActionTypes" element
     */
    public com.cdiscount.www.ParcelActionTypes xgetParcelActionTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(PARCELACTIONTYPES$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelActionTypes" element
     */
    public boolean isNilParcelActionTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(PARCELACTIONTYPES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParcelActionTypes" element
     */
    public void setParcelActionTypes(java.util.List parcelActionTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELACTIONTYPES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARCELACTIONTYPES$0);
            }
            target.setListValue(parcelActionTypes);
        }
    }
    
    /**
     * Sets (as xml) the "ParcelActionTypes" element
     */
    public void xsetParcelActionTypes(com.cdiscount.www.ParcelActionTypes parcelActionTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(PARCELACTIONTYPES$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelActionTypes)get_store().add_element_user(PARCELACTIONTYPES$0);
            }
            target.set(parcelActionTypes);
        }
    }
    
    /**
     * Nils the "ParcelActionTypes" element
     */
    public void setNilParcelActionTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(PARCELACTIONTYPES$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelActionTypes)get_store().add_element_user(PARCELACTIONTYPES$0);
            }
            target.setNil();
        }
    }
}
