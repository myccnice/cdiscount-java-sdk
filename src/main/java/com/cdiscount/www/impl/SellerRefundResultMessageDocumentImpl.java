/*
 * An XML document type.
 * Localname: SellerRefundResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundResultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerRefundResultMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerRefundResultMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundResultMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundResultMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDRESULTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundResultMessage");
    
    
    /**
     * Gets the "SellerRefundResultMessage" element
     */
    public com.cdiscount.www.SellerRefundResultMessage getSellerRefundResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResultMessage target = null;
            target = (com.cdiscount.www.SellerRefundResultMessage)get_store().find_element_user(SELLERREFUNDRESULTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundResultMessage" element
     */
    public boolean isNilSellerRefundResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResultMessage target = null;
            target = (com.cdiscount.www.SellerRefundResultMessage)get_store().find_element_user(SELLERREFUNDRESULTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundResultMessage" element
     */
    public void setSellerRefundResultMessage(com.cdiscount.www.SellerRefundResultMessage sellerRefundResultMessage)
    {
        generatedSetterHelperImpl(sellerRefundResultMessage, SELLERREFUNDRESULTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundResultMessage" element
     */
    public com.cdiscount.www.SellerRefundResultMessage addNewSellerRefundResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResultMessage target = null;
            target = (com.cdiscount.www.SellerRefundResultMessage)get_store().add_element_user(SELLERREFUNDRESULTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundResultMessage" element
     */
    public void setNilSellerRefundResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResultMessage target = null;
            target = (com.cdiscount.www.SellerRefundResultMessage)get_store().find_element_user(SELLERREFUNDRESULTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundResultMessage)get_store().add_element_user(SELLERREFUNDRESULTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
