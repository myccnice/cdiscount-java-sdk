/*
 * XML Type:  Corporation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Corporation
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Corporation(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class CorporationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Corporation
{
    private static final long serialVersionUID = 1L;
    
    public CorporationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BusinessUnitId");
    private static final javax.xml.namespace.QName CORPORATIONCODE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CorporationCode");
    private static final javax.xml.namespace.QName CORPORATIONID$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CorporationId");
    private static final javax.xml.namespace.QName CORPORATIONNAME$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CorporationName");
    private static final javax.xml.namespace.QName ISMARKETPLACEACTIVE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsMarketPlaceActive");
    
    
    /**
     * Gets the "BusinessUnitId" element
     */
    public short getBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessUnitId" element
     */
    public org.apache.xmlbeans.XmlShort xgetBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(BUSINESSUNITID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BusinessUnitId" element
     */
    public boolean isSetBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSUNITID$0) != 0;
        }
    }
    
    /**
     * Sets the "BusinessUnitId" element
     */
    public void setBusinessUnitId(short businessUnitId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSUNITID$0);
            }
            target.setShortValue(businessUnitId);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessUnitId" element
     */
    public void xsetBusinessUnitId(org.apache.xmlbeans.XmlShort businessUnitId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(BUSINESSUNITID$0);
            }
            target.set(businessUnitId);
        }
    }
    
    /**
     * Unsets the "BusinessUnitId" element
     */
    public void unsetBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSUNITID$0, 0);
        }
    }
    
    /**
     * Gets the "CorporationCode" element
     */
    public java.lang.String getCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorporationCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CorporationCode" element
     */
    public boolean isNilCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CorporationCode" element
     */
    public void setCorporationCode(java.lang.String corporationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPORATIONCODE$2);
            }
            target.setStringValue(corporationCode);
        }
    }
    
    /**
     * Sets (as xml) the "CorporationCode" element
     */
    public void xsetCorporationCode(org.apache.xmlbeans.XmlString corporationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATIONCODE$2);
            }
            target.set(corporationCode);
        }
    }
    
    /**
     * Nils the "CorporationCode" element
     */
    public void setNilCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATIONCODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CorporationId" element
     */
    public short getCorporationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorporationId" element
     */
    public org.apache.xmlbeans.XmlShort xgetCorporationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CORPORATIONID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CorporationId" element
     */
    public void setCorporationId(short corporationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPORATIONID$4);
            }
            target.setShortValue(corporationId);
        }
    }
    
    /**
     * Sets (as xml) the "CorporationId" element
     */
    public void xsetCorporationId(org.apache.xmlbeans.XmlShort corporationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CORPORATIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CORPORATIONID$4);
            }
            target.set(corporationId);
        }
    }
    
    /**
     * Gets the "CorporationName" element
     */
    public java.lang.String getCorporationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorporationName" element
     */
    public org.apache.xmlbeans.XmlString xgetCorporationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CorporationName" element
     */
    public boolean isNilCorporationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONNAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CorporationName" element
     */
    public boolean isSetCorporationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORPORATIONNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "CorporationName" element
     */
    public void setCorporationName(java.lang.String corporationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPORATIONNAME$6);
            }
            target.setStringValue(corporationName);
        }
    }
    
    /**
     * Sets (as xml) the "CorporationName" element
     */
    public void xsetCorporationName(org.apache.xmlbeans.XmlString corporationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATIONNAME$6);
            }
            target.set(corporationName);
        }
    }
    
    /**
     * Nils the "CorporationName" element
     */
    public void setNilCorporationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATIONNAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CorporationName" element
     */
    public void unsetCorporationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORPORATIONNAME$6, 0);
        }
    }
    
    /**
     * Gets the "IsMarketPlaceActive" element
     */
    public boolean getIsMarketPlaceActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMARKETPLACEACTIVE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsMarketPlaceActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMarketPlaceActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMARKETPLACEACTIVE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsMarketPlaceActive" element
     */
    public boolean isNilIsMarketPlaceActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMARKETPLACEACTIVE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsMarketPlaceActive" element
     */
    public boolean isSetIsMarketPlaceActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMARKETPLACEACTIVE$8) != 0;
        }
    }
    
    /**
     * Sets the "IsMarketPlaceActive" element
     */
    public void setIsMarketPlaceActive(boolean isMarketPlaceActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMARKETPLACEACTIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMARKETPLACEACTIVE$8);
            }
            target.setBooleanValue(isMarketPlaceActive);
        }
    }
    
    /**
     * Sets (as xml) the "IsMarketPlaceActive" element
     */
    public void xsetIsMarketPlaceActive(org.apache.xmlbeans.XmlBoolean isMarketPlaceActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMARKETPLACEACTIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMARKETPLACEACTIVE$8);
            }
            target.set(isMarketPlaceActive);
        }
    }
    
    /**
     * Nils the "IsMarketPlaceActive" element
     */
    public void setNilIsMarketPlaceActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMARKETPLACEACTIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMARKETPLACEACTIVE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsMarketPlaceActive" element
     */
    public void unsetIsMarketPlaceActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMARKETPLACEACTIVE$8, 0);
        }
    }
}
