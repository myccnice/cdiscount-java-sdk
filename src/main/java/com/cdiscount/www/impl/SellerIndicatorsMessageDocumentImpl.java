/*
 * An XML document type.
 * Localname: SellerIndicatorsMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerIndicatorsMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerIndicatorsMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerIndicatorsMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerIndicatorsMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerIndicatorsMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERINDICATORSMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerIndicatorsMessage");
    
    
    /**
     * Gets the "SellerIndicatorsMessage" element
     */
    public com.cdiscount.www.SellerIndicatorsMessage getSellerIndicatorsMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicatorsMessage target = null;
            target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().find_element_user(SELLERINDICATORSMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerIndicatorsMessage" element
     */
    public boolean isNilSellerIndicatorsMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicatorsMessage target = null;
            target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().find_element_user(SELLERINDICATORSMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerIndicatorsMessage" element
     */
    public void setSellerIndicatorsMessage(com.cdiscount.www.SellerIndicatorsMessage sellerIndicatorsMessage)
    {
        generatedSetterHelperImpl(sellerIndicatorsMessage, SELLERINDICATORSMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerIndicatorsMessage" element
     */
    public com.cdiscount.www.SellerIndicatorsMessage addNewSellerIndicatorsMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicatorsMessage target = null;
            target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().add_element_user(SELLERINDICATORSMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerIndicatorsMessage" element
     */
    public void setNilSellerIndicatorsMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicatorsMessage target = null;
            target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().find_element_user(SELLERINDICATORSMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().add_element_user(SELLERINDICATORSMESSAGE$0);
            }
            target.setNil();
        }
    }
}
