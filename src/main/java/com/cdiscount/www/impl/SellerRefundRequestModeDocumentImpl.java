/*
 * An XML document type.
 * Localname: SellerRefundRequestMode
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundRequestModeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerRefundRequestMode(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerRefundRequestModeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundRequestModeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundRequestModeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDREQUESTMODE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundRequestMode");
    
    
    /**
     * Gets the "SellerRefundRequestMode" element
     */
    public com.cdiscount.www.SellerRefundRequestMode.Enum getSellerRefundRequestMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERREFUNDREQUESTMODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SellerRefundRequestMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerRefundRequestMode" element
     */
    public com.cdiscount.www.SellerRefundRequestMode xgetSellerRefundRequestMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMode target = null;
            target = (com.cdiscount.www.SellerRefundRequestMode)get_store().find_element_user(SELLERREFUNDREQUESTMODE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundRequestMode" element
     */
    public boolean isNilSellerRefundRequestMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMode target = null;
            target = (com.cdiscount.www.SellerRefundRequestMode)get_store().find_element_user(SELLERREFUNDREQUESTMODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundRequestMode" element
     */
    public void setSellerRefundRequestMode(com.cdiscount.www.SellerRefundRequestMode.Enum sellerRefundRequestMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERREFUNDREQUESTMODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERREFUNDREQUESTMODE$0);
            }
            target.setEnumValue(sellerRefundRequestMode);
        }
    }
    
    /**
     * Sets (as xml) the "SellerRefundRequestMode" element
     */
    public void xsetSellerRefundRequestMode(com.cdiscount.www.SellerRefundRequestMode sellerRefundRequestMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMode target = null;
            target = (com.cdiscount.www.SellerRefundRequestMode)get_store().find_element_user(SELLERREFUNDREQUESTMODE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundRequestMode)get_store().add_element_user(SELLERREFUNDREQUESTMODE$0);
            }
            target.set(sellerRefundRequestMode);
        }
    }
    
    /**
     * Nils the "SellerRefundRequestMode" element
     */
    public void setNilSellerRefundRequestMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMode target = null;
            target = (com.cdiscount.www.SellerRefundRequestMode)get_store().find_element_user(SELLERREFUNDREQUESTMODE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundRequestMode)get_store().add_element_user(SELLERREFUNDREQUESTMODE$0);
            }
            target.setNil();
        }
    }
}
