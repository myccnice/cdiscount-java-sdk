/*
 * An XML document type.
 * Localname: SellerRefundOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerRefundOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerRefundOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundOrderLine");
    
    
    /**
     * Gets the "SellerRefundOrderLine" element
     */
    public com.cdiscount.www.SellerRefundOrderLine getSellerRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().find_element_user(SELLERREFUNDORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundOrderLine" element
     */
    public boolean isNilSellerRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().find_element_user(SELLERREFUNDORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundOrderLine" element
     */
    public void setSellerRefundOrderLine(com.cdiscount.www.SellerRefundOrderLine sellerRefundOrderLine)
    {
        generatedSetterHelperImpl(sellerRefundOrderLine, SELLERREFUNDORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundOrderLine" element
     */
    public com.cdiscount.www.SellerRefundOrderLine addNewSellerRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().add_element_user(SELLERREFUNDORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundOrderLine" element
     */
    public void setNilSellerRefundOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundOrderLine target = null;
            target = (com.cdiscount.www.SellerRefundOrderLine)get_store().find_element_user(SELLERREFUNDORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundOrderLine)get_store().add_element_user(SELLERREFUNDORDERLINE$0);
            }
            target.setNil();
        }
    }
}
