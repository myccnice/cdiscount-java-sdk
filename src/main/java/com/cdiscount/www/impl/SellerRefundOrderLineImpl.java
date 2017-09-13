/*
 * XML Type:  SellerRefundOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SellerRefundOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerRefundOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EAN$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Ean");
    private static final javax.xml.namespace.QName REFUNDSHIPPINGCHARGES$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundShippingCharges");
    private static final javax.xml.namespace.QName SELLERPRODUCTID$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductId");
    
    
    /**
     * Gets the "Ean" element
     */
    public java.lang.String getEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ean" element
     */
    public org.apache.xmlbeans.XmlString xgetEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Ean" element
     */
    public boolean isNilEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Ean" element
     */
    public boolean isSetEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EAN$0) != 0;
        }
    }
    
    /**
     * Sets the "Ean" element
     */
    public void setEan(java.lang.String ean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EAN$0);
            }
            target.setStringValue(ean);
        }
    }
    
    /**
     * Sets (as xml) the "Ean" element
     */
    public void xsetEan(org.apache.xmlbeans.XmlString ean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EAN$0);
            }
            target.set(ean);
        }
    }
    
    /**
     * Nils the "Ean" element
     */
    public void setNilEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EAN$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Ean" element
     */
    public void unsetEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EAN$0, 0);
        }
    }
    
    /**
     * Gets the "RefundShippingCharges" element
     */
    public boolean getRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNDSHIPPINGCHARGES$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefundShippingCharges" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RefundShippingCharges" element
     */
    public boolean isNilRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RefundShippingCharges" element
     */
    public boolean isSetRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFUNDSHIPPINGCHARGES$2) != 0;
        }
    }
    
    /**
     * Sets the "RefundShippingCharges" element
     */
    public void setRefundShippingCharges(boolean refundShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNDSHIPPINGCHARGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFUNDSHIPPINGCHARGES$2);
            }
            target.setBooleanValue(refundShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "RefundShippingCharges" element
     */
    public void xsetRefundShippingCharges(org.apache.xmlbeans.XmlBoolean refundShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REFUNDSHIPPINGCHARGES$2);
            }
            target.set(refundShippingCharges);
        }
    }
    
    /**
     * Nils the "RefundShippingCharges" element
     */
    public void setNilRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUNDSHIPPINGCHARGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REFUNDSHIPPINGCHARGES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RefundShippingCharges" element
     */
    public void unsetRefundShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFUNDSHIPPINGCHARGES$2, 0);
        }
    }
    
    /**
     * Gets the "SellerProductId" element
     */
    public java.lang.String getSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerProductId" element
     */
    public boolean isNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerProductId" element
     */
    public void setSellerProductId(java.lang.String sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTID$4);
            }
            target.setStringValue(sellerProductId);
        }
    }
    
    /**
     * Sets (as xml) the "SellerProductId" element
     */
    public void xsetSellerProductId(org.apache.xmlbeans.XmlString sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$4);
            }
            target.set(sellerProductId);
        }
    }
    
    /**
     * Nils the "SellerProductId" element
     */
    public void setNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$4);
            }
            target.setNil();
        }
    }
}
