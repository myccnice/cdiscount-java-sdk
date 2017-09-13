/*
 * An XML document type.
 * Localname: CreateRefundVoucherMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateRefundVoucherMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CreateRefundVoucherMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CreateRefundVoucherMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateRefundVoucherMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateRefundVoucherMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEREFUNDVOUCHERMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateRefundVoucherMessage");
    
    
    /**
     * Gets the "CreateRefundVoucherMessage" element
     */
    public com.cdiscount.www.CreateRefundVoucherMessage getCreateRefundVoucherMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherMessage target = null;
            target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().find_element_user(CREATEREFUNDVOUCHERMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CreateRefundVoucherMessage" element
     */
    public boolean isNilCreateRefundVoucherMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherMessage target = null;
            target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().find_element_user(CREATEREFUNDVOUCHERMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CreateRefundVoucherMessage" element
     */
    public void setCreateRefundVoucherMessage(com.cdiscount.www.CreateRefundVoucherMessage createRefundVoucherMessage)
    {
        generatedSetterHelperImpl(createRefundVoucherMessage, CREATEREFUNDVOUCHERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateRefundVoucherMessage" element
     */
    public com.cdiscount.www.CreateRefundVoucherMessage addNewCreateRefundVoucherMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherMessage target = null;
            target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().add_element_user(CREATEREFUNDVOUCHERMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "CreateRefundVoucherMessage" element
     */
    public void setNilCreateRefundVoucherMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherMessage target = null;
            target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().find_element_user(CREATEREFUNDVOUCHERMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().add_element_user(CREATEREFUNDVOUCHERMESSAGE$0);
            }
            target.setNil();
        }
    }
}
