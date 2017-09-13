/*
 * An XML document type.
 * Localname: VoucherSourceActor
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.VoucherSourceActorDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one VoucherSourceActor(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class VoucherSourceActorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.VoucherSourceActorDocument
{
    private static final long serialVersionUID = 1L;
    
    public VoucherSourceActorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOUCHERSOURCEACTOR$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VoucherSourceActor");
    
    
    /**
     * Gets the "VoucherSourceActor" element
     */
    public com.cdiscount.www.VoucherSourceActor.Enum getVoucherSourceActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHERSOURCEACTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.VoucherSourceActor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "VoucherSourceActor" element
     */
    public com.cdiscount.www.VoucherSourceActor xgetVoucherSourceActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(VOUCHERSOURCEACTOR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "VoucherSourceActor" element
     */
    public boolean isNilVoucherSourceActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(VOUCHERSOURCEACTOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "VoucherSourceActor" element
     */
    public void setVoucherSourceActor(com.cdiscount.www.VoucherSourceActor.Enum voucherSourceActor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHERSOURCEACTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOUCHERSOURCEACTOR$0);
            }
            target.setEnumValue(voucherSourceActor);
        }
    }
    
    /**
     * Sets (as xml) the "VoucherSourceActor" element
     */
    public void xsetVoucherSourceActor(com.cdiscount.www.VoucherSourceActor voucherSourceActor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(VOUCHERSOURCEACTOR$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.VoucherSourceActor)get_store().add_element_user(VOUCHERSOURCEACTOR$0);
            }
            target.set(voucherSourceActor);
        }
    }
    
    /**
     * Nils the "VoucherSourceActor" element
     */
    public void setNilVoucherSourceActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VoucherSourceActor target = null;
            target = (com.cdiscount.www.VoucherSourceActor)get_store().find_element_user(VOUCHERSOURCEACTOR$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.VoucherSourceActor)get_store().add_element_user(VOUCHERSOURCEACTOR$0);
            }
            target.setNil();
        }
    }
}
