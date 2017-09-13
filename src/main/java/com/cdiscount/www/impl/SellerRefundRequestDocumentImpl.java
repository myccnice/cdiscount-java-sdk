/*
 * An XML document type.
 * Localname: SellerRefundRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerRefundRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerRefundRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundRequest");
    
    
    /**
     * Gets the "SellerRefundRequest" element
     */
    public com.cdiscount.www.SellerRefundRequest getSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundRequest" element
     */
    public boolean isNilSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundRequest" element
     */
    public void setSellerRefundRequest(com.cdiscount.www.SellerRefundRequest sellerRefundRequest)
    {
        generatedSetterHelperImpl(sellerRefundRequest, SELLERREFUNDREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundRequest" element
     */
    public com.cdiscount.www.SellerRefundRequest addNewSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().add_element_user(SELLERREFUNDREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundRequest" element
     */
    public void setNilSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundRequest target = null;
            target = (com.cdiscount.www.SellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundRequest)get_store().add_element_user(SELLERREFUNDREQUEST$0);
            }
            target.setNil();
        }
    }
}
