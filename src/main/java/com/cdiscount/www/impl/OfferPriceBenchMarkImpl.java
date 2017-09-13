/*
 * XML Type:  OfferPriceBenchMark
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferPriceBenchMark
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferPriceBenchMark(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferPriceBenchMarkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferPriceBenchMark
{
    private static final long serialVersionUID = 1L;
    
    public OfferPriceBenchMarkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BESTOFFERPRICE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BestOfferPrice");
    private static final javax.xml.namespace.QName ISBESTOFFERPRICE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsBestOfferPrice");
    private static final javax.xml.namespace.QName PRODUCTCONDITION$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductCondition");
    private static final javax.xml.namespace.QName PRODUCTSTATE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductState");
    private static final javax.xml.namespace.QName SHIPPINGCHARGES$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingCharges");
    
    
    /**
     * Gets the "BestOfferPrice" element
     */
    public java.math.BigDecimal getBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESTOFFERPRICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "BestOfferPrice" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BESTOFFERPRICE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BestOfferPrice" element
     */
    public boolean isSetBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BESTOFFERPRICE$0) != 0;
        }
    }
    
    /**
     * Sets the "BestOfferPrice" element
     */
    public void setBestOfferPrice(java.math.BigDecimal bestOfferPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESTOFFERPRICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BESTOFFERPRICE$0);
            }
            target.setBigDecimalValue(bestOfferPrice);
        }
    }
    
    /**
     * Sets (as xml) the "BestOfferPrice" element
     */
    public void xsetBestOfferPrice(org.apache.xmlbeans.XmlDecimal bestOfferPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BESTOFFERPRICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(BESTOFFERPRICE$0);
            }
            target.set(bestOfferPrice);
        }
    }
    
    /**
     * Unsets the "BestOfferPrice" element
     */
    public void unsetBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BESTOFFERPRICE$0, 0);
        }
    }
    
    /**
     * Gets the "IsBestOfferPrice" element
     */
    public boolean getIsBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBESTOFFERPRICE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsBestOfferPrice" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBESTOFFERPRICE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsBestOfferPrice" element
     */
    public boolean isSetIsBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBESTOFFERPRICE$2) != 0;
        }
    }
    
    /**
     * Sets the "IsBestOfferPrice" element
     */
    public void setIsBestOfferPrice(boolean isBestOfferPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBESTOFFERPRICE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBESTOFFERPRICE$2);
            }
            target.setBooleanValue(isBestOfferPrice);
        }
    }
    
    /**
     * Sets (as xml) the "IsBestOfferPrice" element
     */
    public void xsetIsBestOfferPrice(org.apache.xmlbeans.XmlBoolean isBestOfferPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBESTOFFERPRICE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISBESTOFFERPRICE$2);
            }
            target.set(isBestOfferPrice);
        }
    }
    
    /**
     * Unsets the "IsBestOfferPrice" element
     */
    public void unsetIsBestOfferPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBESTOFFERPRICE$2, 0);
        }
    }
    
    /**
     * Gets the "ProductCondition" element
     */
    public com.cdiscount.www.ProductConditionEnum.Enum getProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductConditionEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCondition" element
     */
    public com.cdiscount.www.ProductConditionEnum xgetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductCondition" element
     */
    public boolean isSetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCONDITION$4) != 0;
        }
    }
    
    /**
     * Sets the "ProductCondition" element
     */
    public void setProductCondition(com.cdiscount.www.ProductConditionEnum.Enum productCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCONDITION$4);
            }
            target.setEnumValue(productCondition);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCondition" element
     */
    public void xsetProductCondition(com.cdiscount.www.ProductConditionEnum productCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductConditionEnum)get_store().add_element_user(PRODUCTCONDITION$4);
            }
            target.set(productCondition);
        }
    }
    
    /**
     * Unsets the "ProductCondition" element
     */
    public void unsetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCONDITION$4, 0);
        }
    }
    
    /**
     * Gets the "ProductState" element
     */
    public com.cdiscount.www.ProductStateEnum.Enum getProductState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductState" element
     */
    public com.cdiscount.www.ProductStateEnum xgetProductState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductStateEnum target = null;
            target = (com.cdiscount.www.ProductStateEnum)get_store().find_element_user(PRODUCTSTATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductState" element
     */
    public boolean isSetProductState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSTATE$6) != 0;
        }
    }
    
    /**
     * Sets the "ProductState" element
     */
    public void setProductState(com.cdiscount.www.ProductStateEnum.Enum productState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSTATE$6);
            }
            target.setEnumValue(productState);
        }
    }
    
    /**
     * Sets (as xml) the "ProductState" element
     */
    public void xsetProductState(com.cdiscount.www.ProductStateEnum productState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductStateEnum target = null;
            target = (com.cdiscount.www.ProductStateEnum)get_store().find_element_user(PRODUCTSTATE$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductStateEnum)get_store().add_element_user(PRODUCTSTATE$6);
            }
            target.set(productState);
        }
    }
    
    /**
     * Unsets the "ProductState" element
     */
    public void unsetProductState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSTATE$6, 0);
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
