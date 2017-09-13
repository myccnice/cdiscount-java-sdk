/*
 * An XML document type.
 * Localname: RefundInformationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RefundInformationMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RefundInformationMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RefundInformationMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RefundInformationMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public RefundInformationMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFUNDINFORMATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundInformationMessage");
    
    
    /**
     * Gets the "RefundInformationMessage" element
     */
    public com.cdiscount.www.RefundInformationMessage getRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().find_element_user(REFUNDINFORMATIONMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RefundInformationMessage" element
     */
    public boolean isNilRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().find_element_user(REFUNDINFORMATIONMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RefundInformationMessage" element
     */
    public void setRefundInformationMessage(com.cdiscount.www.RefundInformationMessage refundInformationMessage)
    {
        generatedSetterHelperImpl(refundInformationMessage, REFUNDINFORMATIONMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RefundInformationMessage" element
     */
    public com.cdiscount.www.RefundInformationMessage addNewRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().add_element_user(REFUNDINFORMATIONMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RefundInformationMessage" element
     */
    public void setNilRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().find_element_user(REFUNDINFORMATIONMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RefundInformationMessage)get_store().add_element_user(REFUNDINFORMATIONMESSAGE$0);
            }
            target.setNil();
        }
    }
}
