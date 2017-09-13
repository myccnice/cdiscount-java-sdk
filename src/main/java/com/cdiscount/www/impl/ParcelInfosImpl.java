/*
 * XML Type:  ParcelInfos
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelInfos
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ParcelInfos(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ParcelInfosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelInfos
{
    private static final long serialVersionUID = 1L;
    
    public ParcelInfosImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEPARCEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ManageParcel");
    private static final javax.xml.namespace.QName PARCELNUMBER$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelNumber");
    private static final javax.xml.namespace.QName SKU$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Sku");
    
    
    /**
     * Gets the "ManageParcel" element
     */
    public java.util.List getManageParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEPARCEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManageParcel" element
     */
    public com.cdiscount.www.ParcelActionTypes xgetManageParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(MANAGEPARCEL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ManageParcel" element
     */
    public boolean isSetManageParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGEPARCEL$0) != 0;
        }
    }
    
    /**
     * Sets the "ManageParcel" element
     */
    public void setManageParcel(java.util.List manageParcel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEPARCEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEPARCEL$0);
            }
            target.setListValue(manageParcel);
        }
    }
    
    /**
     * Sets (as xml) the "ManageParcel" element
     */
    public void xsetManageParcel(com.cdiscount.www.ParcelActionTypes manageParcel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(MANAGEPARCEL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelActionTypes)get_store().add_element_user(MANAGEPARCEL$0);
            }
            target.set(manageParcel);
        }
    }
    
    /**
     * Unsets the "ManageParcel" element
     */
    public void unsetManageParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGEPARCEL$0, 0);
        }
    }
    
    /**
     * Gets the "ParcelNumber" element
     */
    public java.lang.String getParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParcelNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelNumber" element
     */
    public boolean isNilParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelNumber" element
     */
    public boolean isSetParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELNUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "ParcelNumber" element
     */
    public void setParcelNumber(java.lang.String parcelNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARCELNUMBER$2);
            }
            target.setStringValue(parcelNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ParcelNumber" element
     */
    public void xsetParcelNumber(org.apache.xmlbeans.XmlString parcelNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARCELNUMBER$2);
            }
            target.set(parcelNumber);
        }
    }
    
    /**
     * Nils the "ParcelNumber" element
     */
    public void setNilParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARCELNUMBER$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelNumber" element
     */
    public void unsetParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELNUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "Sku" element
     */
    public java.lang.String getSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sku" element
     */
    public org.apache.xmlbeans.XmlString xgetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Sku" element
     */
    public boolean isNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Sku" element
     */
    public boolean isSetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKU$4) != 0;
        }
    }
    
    /**
     * Sets the "Sku" element
     */
    public void setSku(java.lang.String sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKU$4);
            }
            target.setStringValue(sku);
        }
    }
    
    /**
     * Sets (as xml) the "Sku" element
     */
    public void xsetSku(org.apache.xmlbeans.XmlString sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$4);
            }
            target.set(sku);
        }
    }
    
    /**
     * Nils the "Sku" element
     */
    public void setNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Sku" element
     */
    public void unsetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKU$4, 0);
        }
    }
}
