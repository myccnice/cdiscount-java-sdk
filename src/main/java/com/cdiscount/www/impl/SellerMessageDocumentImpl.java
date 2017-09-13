/*
 * An XML document type.
 * Localname: SellerMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerMessage");
    
    
    /**
     * Gets the "SellerMessage" element
     */
    public com.cdiscount.www.SellerMessage getSellerMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerMessage target = null;
            target = (com.cdiscount.www.SellerMessage)get_store().find_element_user(SELLERMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerMessage" element
     */
    public boolean isNilSellerMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerMessage target = null;
            target = (com.cdiscount.www.SellerMessage)get_store().find_element_user(SELLERMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerMessage" element
     */
    public void setSellerMessage(com.cdiscount.www.SellerMessage sellerMessage)
    {
        generatedSetterHelperImpl(sellerMessage, SELLERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerMessage" element
     */
    public com.cdiscount.www.SellerMessage addNewSellerMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerMessage target = null;
            target = (com.cdiscount.www.SellerMessage)get_store().add_element_user(SELLERMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerMessage" element
     */
    public void setNilSellerMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerMessage target = null;
            target = (com.cdiscount.www.SellerMessage)get_store().find_element_user(SELLERMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerMessage)get_store().add_element_user(SELLERMESSAGE$0);
            }
            target.setNil();
        }
    }
}
