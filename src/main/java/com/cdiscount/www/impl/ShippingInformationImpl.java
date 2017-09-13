/*
 * XML Type:  ShippingInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ShippingInformation
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ShippingInformation(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ShippingInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ShippingInformation
{
    private static final long serialVersionUID = 1L;
    
    public ShippingInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDITIONALSHIPPINGCHARGES$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "AdditionalShippingCharges");
    private static final javax.xml.namespace.QName DELIVERYMODE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DeliveryMode");
    private static final javax.xml.namespace.QName MAXLEADTIME$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MaxLeadTime");
    private static final javax.xml.namespace.QName MINLEADTIME$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MinLeadTime");
    private static final javax.xml.namespace.QName SHIPPINGCHARGES$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingCharges");
    
    
    /**
     * Gets the "AdditionalShippingCharges" element
     */
    public java.math.BigDecimal getAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALSHIPPINGCHARGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdditionalShippingCharges" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ADDITIONALSHIPPINGCHARGES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AdditionalShippingCharges" element
     */
    public boolean isSetAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALSHIPPINGCHARGES$0) != 0;
        }
    }
    
    /**
     * Sets the "AdditionalShippingCharges" element
     */
    public void setAdditionalShippingCharges(java.math.BigDecimal additionalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALSHIPPINGCHARGES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALSHIPPINGCHARGES$0);
            }
            target.setBigDecimalValue(additionalShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "AdditionalShippingCharges" element
     */
    public void xsetAdditionalShippingCharges(org.apache.xmlbeans.XmlDecimal additionalShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ADDITIONALSHIPPINGCHARGES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ADDITIONALSHIPPINGCHARGES$0);
            }
            target.set(additionalShippingCharges);
        }
    }
    
    /**
     * Unsets the "AdditionalShippingCharges" element
     */
    public void unsetAdditionalShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALSHIPPINGCHARGES$0, 0);
        }
    }
    
    /**
     * Gets the "DeliveryMode" element
     */
    public com.cdiscount.www.DeliveryModeInformation getDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DeliveryMode" element
     */
    public boolean isNilDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DeliveryMode" element
     */
    public boolean isSetDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYMODE$2) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryMode" element
     */
    public void setDeliveryMode(com.cdiscount.www.DeliveryModeInformation deliveryMode)
    {
        generatedSetterHelperImpl(deliveryMode, DELIVERYMODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeliveryMode" element
     */
    public com.cdiscount.www.DeliveryModeInformation addNewDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().add_element_user(DELIVERYMODE$2);
            return target;
        }
    }
    
    /**
     * Nils the "DeliveryMode" element
     */
    public void setNilDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODE$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DeliveryModeInformation)get_store().add_element_user(DELIVERYMODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DeliveryMode" element
     */
    public void unsetDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYMODE$2, 0);
        }
    }
    
    /**
     * Gets the "MaxLeadTime" element
     */
    public int getMaxLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLEADTIME$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxLeadTime" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLEADTIME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxLeadTime" element
     */
    public boolean isSetMaxLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLEADTIME$4) != 0;
        }
    }
    
    /**
     * Sets the "MaxLeadTime" element
     */
    public void setMaxLeadTime(int maxLeadTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLEADTIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLEADTIME$4);
            }
            target.setIntValue(maxLeadTime);
        }
    }
    
    /**
     * Sets (as xml) the "MaxLeadTime" element
     */
    public void xsetMaxLeadTime(org.apache.xmlbeans.XmlInt maxLeadTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLEADTIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXLEADTIME$4);
            }
            target.set(maxLeadTime);
        }
    }
    
    /**
     * Unsets the "MaxLeadTime" element
     */
    public void unsetMaxLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLEADTIME$4, 0);
        }
    }
    
    /**
     * Gets the "MinLeadTime" element
     */
    public int getMinLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLEADTIME$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinLeadTime" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINLEADTIME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinLeadTime" element
     */
    public boolean isSetMinLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINLEADTIME$6) != 0;
        }
    }
    
    /**
     * Sets the "MinLeadTime" element
     */
    public void setMinLeadTime(int minLeadTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLEADTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINLEADTIME$6);
            }
            target.setIntValue(minLeadTime);
        }
    }
    
    /**
     * Sets (as xml) the "MinLeadTime" element
     */
    public void xsetMinLeadTime(org.apache.xmlbeans.XmlInt minLeadTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINLEADTIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINLEADTIME$6);
            }
            target.set(minLeadTime);
        }
    }
    
    /**
     * Unsets the "MinLeadTime" element
     */
    public void unsetMinLeadTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINLEADTIME$6, 0);
        }
    }
    
    /**
     * Gets the "ShippingCharges" element
     */
    public java.math.BigDecimal getShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCHARGES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingCharges" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHIPPINGCHARGES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ShippingCharges" element
     */
    public boolean isSetShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGCHARGES$8) != 0;
        }
    }
    
    /**
     * Sets the "ShippingCharges" element
     */
    public void setShippingCharges(java.math.BigDecimal shippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCHARGES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGCHARGES$8);
            }
            target.setBigDecimalValue(shippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingCharges" element
     */
    public void xsetShippingCharges(org.apache.xmlbeans.XmlDecimal shippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHIPPINGCHARGES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SHIPPINGCHARGES$8);
            }
            target.set(shippingCharges);
        }
    }
    
    /**
     * Unsets the "ShippingCharges" element
     */
    public void unsetShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGCHARGES$8, 0);
        }
    }
}
