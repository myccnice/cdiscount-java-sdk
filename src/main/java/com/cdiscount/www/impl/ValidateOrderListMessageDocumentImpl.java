/*
 * An XML document type.
 * Localname: ValidateOrderListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidateOrderListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidateOrderListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderListMessage");
    
    
    /**
     * Gets the "ValidateOrderListMessage" element
     */
    public com.cdiscount.www.ValidateOrderListMessage getValidateOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListMessage target = null;
            target = (com.cdiscount.www.ValidateOrderListMessage)get_store().find_element_user(VALIDATEORDERLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidateOrderListMessage" element
     */
    public boolean isNilValidateOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListMessage target = null;
            target = (com.cdiscount.www.ValidateOrderListMessage)get_store().find_element_user(VALIDATEORDERLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidateOrderListMessage" element
     */
    public void setValidateOrderListMessage(com.cdiscount.www.ValidateOrderListMessage validateOrderListMessage)
    {
        generatedSetterHelperImpl(validateOrderListMessage, VALIDATEORDERLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderListMessage" element
     */
    public com.cdiscount.www.ValidateOrderListMessage addNewValidateOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListMessage target = null;
            target = (com.cdiscount.www.ValidateOrderListMessage)get_store().add_element_user(VALIDATEORDERLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidateOrderListMessage" element
     */
    public void setNilValidateOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListMessage target = null;
            target = (com.cdiscount.www.ValidateOrderListMessage)get_store().find_element_user(VALIDATEORDERLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidateOrderListMessage)get_store().add_element_user(VALIDATEORDERLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
