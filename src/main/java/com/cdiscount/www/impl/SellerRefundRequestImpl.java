/*
 * XML Type:  SellerRefundRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SellerRefundRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerRefundRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundRequest
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Mode");
    private static final javax.xml.namespace.QName MOTIVE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Motive");
    private static final javax.xml.namespace.QName REFUNDORDERLINE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundOrderLine");
    
    
    /**
     * Gets the "Mode" element
     */
    public com.cdiscount.www.SellerRefundRequestMode.Enum getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SellerRefundRequestMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Mode" element
     */
    public com.cdiscount.www.SellerRefundRequestMode xgetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMode target = null;
            target = (com.cdiscount.www.SellerRefundRequestMode)get_store().find_element_user(MODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Mode" element
     */
    public boolean isSetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODE$0) != 0;
        }
    }
    
    /**
     * Sets the "Mode" element
     */
    public void setMode(com.cdiscount.www.SellerRefundRequestMode.Enum mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODE$0);
            }
            target.setEnumValue(mode);
        }
    }
    
    /**
     * Sets (as xml) the "Mode" element
     */
    public void xsetMode(com.cdiscount.www.SellerRefundRequestMode mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMode target = null;
            target = (com.cdiscount.www.SellerRefundRequestMode)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundRequestMode)get_store().add_element_user(MODE$0);
            }
            target.set(mode);
        }
    }
    
    /**
     * Unsets the "Mode" element
     */
    public void unsetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODE$0, 0);
        }
    }
    
    /**
     * Gets the "Motive" element
     */
    public com.cdiscount.www.RefundMotive.Enum getMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTIVE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.RefundMotive.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Motive" element
     */
    public com.cdiscount.www.RefundMotive xgetMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundMotive target = null;
            target = (com.cdiscount.www.RefundMotive)get_store().find_element_user(MOTIVE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Motive" element
     */
    public boolean isSetMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOTIVE$2) != 0;
        }
    }
    
    /**
     * Sets the "Motive" element
     */
    public void setMotive(com.cdiscount.www.RefundMotive.Enum motive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTIVE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOTIVE$2);
            }
            target.setEnumValue(motive);
        }
    }
    
    /**
     * Sets (as xml) the "Motive" element
     */
    public void xsetMotive(com.cdiscount.www.RefundMotive motive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundMotive target = null;
            target = (com.cdiscount.www.RefundMotive)get_store().find_element_user(MOTIVE$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RefundMotive)get_store().add_element_user(MOTIVE$2);
            }
            target.set(motive);
        }
    }
    
    /**
     * Unsets the "Motive" element
     */
    public void unsetMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOTIVE$2, 0);
        }
    }
    
    /**
     * Gets the "RefundOrderLine" element
     */
    public com.cdiscount.www.SellerRefundOrderLine getRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().find_element_user(REFUNDORDERLINE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RefundOrderLine" element
     */
    public boolean isNilRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().find_element_user(REFUNDORDERLINE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RefundOrderLine" element
     */
    public void setRefundOrderLine(com.cdiscount.www.SellerRefundOrderLine refundOrderLine)
    {
        generatedSetterHelperImpl(refundOrderLine, REFUNDORDERLINE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RefundOrderLine" element
     */
    public com.cdiscount.www.SellerRefundOrderLine addNewRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().add_element_user(REFUNDORDERLINE$4);
            return target;
        }
    }
    
    /**
     * Nils the "RefundOrderLine" element
     */
    public void setNilRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().find_element_user(REFUNDORDERLINE$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundOrderLine)get_store().add_element_user(REFUNDORDERLINE$4);
            }
            target.setNil();
        }
    }
}
