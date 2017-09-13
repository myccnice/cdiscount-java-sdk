/*
 * XML Type:  Voucher
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Voucher
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Voucher(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class VoucherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Voucher
{
    private static final long serialVersionUID = 1L;
    
    public VoucherImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateDate");
    private static final javax.xml.namespace.QName REFUNDINFORMATION$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundInformation");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Source");
    
    
    /**
     * Gets the "CreateDate" element
     */
    public java.util.Calendar getCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreateDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CreateDate" element
     */
    public boolean isNilCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CreateDate" element
     */
    public boolean isSetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "CreateDate" element
     */
    public void setCreateDate(java.util.Calendar createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDATE$0);
            }
            target.setCalendarValue(createDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreateDate" element
     */
    public void xsetCreateDate(org.apache.xmlbeans.XmlDateTime createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDATE$0);
            }
            target.set(createDate);
        }
    }
    
    /**
     * Nils the "CreateDate" element
     */
    public void setNilCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CreateDate" element
     */
    public void unsetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDATE$0, 0);
        }
    }
    
    /**
     * Gets the "RefundInformation" element
     */
    public com.cdiscount.www.RefundInformation getRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RefundInformation" element
     */
    public boolean isNilRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RefundInformation" element
     */
    public void setRefundInformation(com.cdiscount.www.RefundInformation refundInformation)
    {
        generatedSetterHelperImpl(refundInformation, REFUNDINFORMATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RefundInformation" element
     */
    public com.cdiscount.www.RefundInformation addNewRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().add_element_user(REFUNDINFORMATION$2);
            return target;
        }
    }
    
    /**
     * Nils the "RefundInformation" element
     */
    public void setNilRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RefundInformation)get_store().add_element_user(REFUNDINFORMATION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Source" element
     */
    public com.cdiscount.www.VoucherSourceActor.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.VoucherSourceActor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Source" element
     */
    public com.cdiscount.www.VoucherSourceActor xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(SOURCE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Source" element
     */
    public boolean isNilSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(SOURCE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$4) != 0;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(com.cdiscount.www.VoucherSourceActor.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$4);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "Source" element
     */
    public void xsetSource(com.cdiscount.www.VoucherSourceActor source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.VoucherSourceActor)get_store().add_element_user(SOURCE$4);
            }
            target.set(source);
        }
    }
    
    /**
     * Nils the "Source" element
     */
    public void setNilSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.VoucherSourceActor)get_store().add_element_user(SOURCE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$4, 0);
        }
    }
}
