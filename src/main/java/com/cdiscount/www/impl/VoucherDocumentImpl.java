/*
 * An XML document type.
 * Localname: Voucher
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.VoucherDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Voucher(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class VoucherDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.VoucherDocument
{
    private static final long serialVersionUID = 1L;
    
    public VoucherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOUCHER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Voucher");
    
    
    /**
     * Gets the "Voucher" element
     */
    public com.cdiscount.www.Voucher getVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().find_element_user(VOUCHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Voucher" element
     */
    public boolean isNilVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().find_element_user(VOUCHER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Voucher" element
     */
    public void setVoucher(com.cdiscount.www.Voucher voucher)
    {
        generatedSetterHelperImpl(voucher, VOUCHER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Voucher" element
     */
    public com.cdiscount.www.Voucher addNewVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().add_element_user(VOUCHER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Voucher" element
     */
    public void setNilVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().find_element_user(VOUCHER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Voucher)get_store().add_element_user(VOUCHER$0);
            }
            target.setNil();
        }
    }
}
