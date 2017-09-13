/*
 * An XML document type.
 * Localname: SellerRefundResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerRefundResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerRefundResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERREFUNDRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundResult");
    
    
    /**
     * Gets the "SellerRefundResult" element
     */
    public com.cdiscount.www.SellerRefundResult getSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundResult" element
     */
    public boolean isNilSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundResult" element
     */
    public void setSellerRefundResult(com.cdiscount.www.SellerRefundResult sellerRefundResult)
    {
        generatedSetterHelperImpl(sellerRefundResult, SELLERREFUNDRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundResult" element
     */
    public com.cdiscount.www.SellerRefundResult addNewSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().add_element_user(SELLERREFUNDRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundResult" element
     */
    public void setNilSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerRefundResult target = null;
            target = (com.cdiscount.www.SellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerRefundResult)get_store().add_element_user(SELLERREFUNDRESULT$0);
            }
            target.setNil();
        }
    }
}
