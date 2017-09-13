/*
 * XML Type:  Parcel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Parcel
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Parcel(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ParcelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Parcel
{
    private static final long serialVersionUID = 1L;
    
    public ParcelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERNUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CustomerNum");
    private static final javax.xml.namespace.QName EXTERNALCARRIERNAME$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ExternalCarrierName");
    private static final javax.xml.namespace.QName EXTERNALCARRIERTRACKINGURL$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ExternalCarrierTrackingUrl");
    private static final javax.xml.namespace.QName ISCUSTOMERRETURN$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsCustomerReturn");
    private static final javax.xml.namespace.QName PARCELITEMLIST$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelItemList");
    private static final javax.xml.namespace.QName PARCELSTATUS$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelStatus");
    private static final javax.xml.namespace.QName REALCARRIERCODE$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RealCarrierCode");
    
    
    /**
     * Gets the "CustomerNum" element
     */
    public java.lang.String getCustomerNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERNUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerNum" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerNum" element
     */
    public boolean isNilCustomerNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CustomerNum" element
     */
    public boolean isSetCustomerNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERNUM$0) != 0;
        }
    }
    
    /**
     * Sets the "CustomerNum" element
     */
    public void setCustomerNum(java.lang.String customerNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERNUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERNUM$0);
            }
            target.setStringValue(customerNum);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerNum" element
     */
    public void xsetCustomerNum(org.apache.xmlbeans.XmlString customerNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERNUM$0);
            }
            target.set(customerNum);
        }
    }
    
    /**
     * Nils the "CustomerNum" element
     */
    public void setNilCustomerNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERNUM$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomerNum" element
     */
    public void unsetCustomerNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERNUM$0, 0);
        }
    }
    
    /**
     * Gets the "ExternalCarrierName" element
     */
    public java.lang.String getExternalCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCARRIERNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalCarrierName" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ExternalCarrierName" element
     */
    public boolean isNilExternalCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ExternalCarrierName" element
     */
    public boolean isSetExternalCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALCARRIERNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "ExternalCarrierName" element
     */
    public void setExternalCarrierName(java.lang.String externalCarrierName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCARRIERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALCARRIERNAME$2);
            }
            target.setStringValue(externalCarrierName);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalCarrierName" element
     */
    public void xsetExternalCarrierName(org.apache.xmlbeans.XmlString externalCarrierName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALCARRIERNAME$2);
            }
            target.set(externalCarrierName);
        }
    }
    
    /**
     * Nils the "ExternalCarrierName" element
     */
    public void setNilExternalCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALCARRIERNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ExternalCarrierName" element
     */
    public void unsetExternalCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALCARRIERNAME$2, 0);
        }
    }
    
    /**
     * Gets the "ExternalCarrierTrackingUrl" element
     */
    public java.lang.String getExternalCarrierTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCARRIERTRACKINGURL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalCarrierTrackingUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalCarrierTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERTRACKINGURL$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ExternalCarrierTrackingUrl" element
     */
    public boolean isNilExternalCarrierTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERTRACKINGURL$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ExternalCarrierTrackingUrl" element
     */
    public boolean isSetExternalCarrierTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALCARRIERTRACKINGURL$4) != 0;
        }
    }
    
    /**
     * Sets the "ExternalCarrierTrackingUrl" element
     */
    public void setExternalCarrierTrackingUrl(java.lang.String externalCarrierTrackingUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCARRIERTRACKINGURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALCARRIERTRACKINGURL$4);
            }
            target.setStringValue(externalCarrierTrackingUrl);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalCarrierTrackingUrl" element
     */
    public void xsetExternalCarrierTrackingUrl(org.apache.xmlbeans.XmlString externalCarrierTrackingUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERTRACKINGURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALCARRIERTRACKINGURL$4);
            }
            target.set(externalCarrierTrackingUrl);
        }
    }
    
    /**
     * Nils the "ExternalCarrierTrackingUrl" element
     */
    public void setNilExternalCarrierTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCARRIERTRACKINGURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALCARRIERTRACKINGURL$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ExternalCarrierTrackingUrl" element
     */
    public void unsetExternalCarrierTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALCARRIERTRACKINGURL$4, 0);
        }
    }
    
    /**
     * Gets the "IsCustomerReturn" element
     */
    public boolean getIsCustomerReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMERRETURN$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCustomerReturn" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomerReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMERRETURN$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsCustomerReturn" element
     */
    public boolean isSetIsCustomerReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMERRETURN$6) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomerReturn" element
     */
    public void setIsCustomerReturn(boolean isCustomerReturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMERRETURN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCUSTOMERRETURN$6);
            }
            target.setBooleanValue(isCustomerReturn);
        }
    }
    
    /**
     * Sets (as xml) the "IsCustomerReturn" element
     */
    public void xsetIsCustomerReturn(org.apache.xmlbeans.XmlBoolean isCustomerReturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMERRETURN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMERRETURN$6);
            }
            target.set(isCustomerReturn);
        }
    }
    
    /**
     * Unsets the "IsCustomerReturn" element
     */
    public void unsetIsCustomerReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMERRETURN$6, 0);
        }
    }
    
    /**
     * Gets the "ParcelItemList" element
     */
    public com.cdiscount.www.ArrayOfParcelItem getParcelItemList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().find_element_user(PARCELITEMLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelItemList" element
     */
    public boolean isNilParcelItemList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().find_element_user(PARCELITEMLIST$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelItemList" element
     */
    public boolean isSetParcelItemList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELITEMLIST$8) != 0;
        }
    }
    
    /**
     * Sets the "ParcelItemList" element
     */
    public void setParcelItemList(com.cdiscount.www.ArrayOfParcelItem parcelItemList)
    {
        generatedSetterHelperImpl(parcelItemList, PARCELITEMLIST$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelItemList" element
     */
    public com.cdiscount.www.ArrayOfParcelItem addNewParcelItemList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().add_element_user(PARCELITEMLIST$8);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelItemList" element
     */
    public void setNilParcelItemList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().find_element_user(PARCELITEMLIST$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelItem)get_store().add_element_user(PARCELITEMLIST$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelItemList" element
     */
    public void unsetParcelItemList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELITEMLIST$8, 0);
        }
    }
    
    /**
     * Gets the "ParcelStatus" element
     */
    public com.cdiscount.www.ParcelStatus.Enum getParcelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELSTATUS$10, 0);
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
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$10, 0);
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
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelStatus" element
     */
    public boolean isSetParcelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELSTATUS$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELSTATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARCELSTATUS$10);
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
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$10, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelStatus)get_store().add_element_user(PARCELSTATUS$10);
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
            target = (com.cdiscount.www.ParcelStatus)get_store().find_element_user(PARCELSTATUS$10, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelStatus)get_store().add_element_user(PARCELSTATUS$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelStatus" element
     */
    public void unsetParcelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELSTATUS$10, 0);
        }
    }
    
    /**
     * Gets the "RealCarrierCode" element
     */
    public java.lang.String getRealCarrierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALCARRIERCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RealCarrierCode" element
     */
    public org.apache.xmlbeans.XmlString xgetRealCarrierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALCARRIERCODE$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RealCarrierCode" element
     */
    public boolean isNilRealCarrierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALCARRIERCODE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RealCarrierCode" element
     */
    public boolean isSetRealCarrierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALCARRIERCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "RealCarrierCode" element
     */
    public void setRealCarrierCode(java.lang.String realCarrierCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALCARRIERCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALCARRIERCODE$12);
            }
            target.setStringValue(realCarrierCode);
        }
    }
    
    /**
     * Sets (as xml) the "RealCarrierCode" element
     */
    public void xsetRealCarrierCode(org.apache.xmlbeans.XmlString realCarrierCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALCARRIERCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REALCARRIERCODE$12);
            }
            target.set(realCarrierCode);
        }
    }
    
    /**
     * Nils the "RealCarrierCode" element
     */
    public void setNilRealCarrierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REALCARRIERCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REALCARRIERCODE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RealCarrierCode" element
     */
    public void unsetRealCarrierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALCARRIERCODE$12, 0);
        }
    }
}
