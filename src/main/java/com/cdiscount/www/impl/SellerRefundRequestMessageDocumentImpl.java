/*
 * An XML document type.
 * Localname: SellerRefundRequestMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundRequestMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerRefundRequestMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerRefundRequestMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundRequestMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundRequestMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDREQUESTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundRequestMessage");
    
    
    /**
     * Gets the "SellerRefundRequestMessage" element
     */
    public com.cdiscount.www.SellerRefundRequestMessage getSellerRefundRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMessage target = null;
            target = (com.cdiscount.www.SellerRefundRequestMessage)get_store().find_element_user(SELLERREFUNDREQUESTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundRequestMessage" element
     */
    public boolean isNilSellerRefundRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMessage target = null;
            target = (com.cdiscount.www.SellerRefundRequestMessage)get_store().find_element_user(SELLERREFUNDREQUESTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundRequestMessage" element
     */
    public void setSellerRefundRequestMessage(com.cdiscount.www.SellerRefundRequestMessage sellerRefundRequestMessage)
    {
        generatedSetterHelperImpl(sellerRefundRequestMessage, SELLERREFUNDREQUESTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundRequestMessage" element
     */
    public com.cdiscount.www.SellerRefundRequestMessage addNewSellerRefundRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMessage target = null;
            target = (com.cdiscount.www.SellerRefundRequestMessage)get_store().add_element_user(SELLERREFUNDREQUESTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundRequestMessage" element
     */
    public void setNilSellerRefundRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequestMessage target = null;
            target = (com.cdiscount.www.SellerRefundRequestMessage)get_store().find_element_user(SELLERREFUNDREQUESTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundRequestMessage)get_store().add_element_user(SELLERREFUNDREQUESTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
