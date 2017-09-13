/*
 * An XML document type.
 * Localname: RelaysFileDepositMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelaysFileDepositMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RelaysFileDepositMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RelaysFileDepositMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RelaysFileDepositMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelaysFileDepositMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYSFILEDEPOSITMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysFileDepositMessage");
    
    
    /**
     * Gets the "RelaysFileDepositMessage" element
     */
    public com.cdiscount.www.RelaysFileDepositMessage getRelaysFileDepositMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileDepositMessage target = null;
            target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().find_element_user(RELAYSFILEDEPOSITMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelaysFileDepositMessage" element
     */
    public boolean isNilRelaysFileDepositMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileDepositMessage target = null;
            target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().find_element_user(RELAYSFILEDEPOSITMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelaysFileDepositMessage" element
     */
    public void setRelaysFileDepositMessage(com.cdiscount.www.RelaysFileDepositMessage relaysFileDepositMessage)
    {
        generatedSetterHelperImpl(relaysFileDepositMessage, RELAYSFILEDEPOSITMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelaysFileDepositMessage" element
     */
    public com.cdiscount.www.RelaysFileDepositMessage addNewRelaysFileDepositMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileDepositMessage target = null;
            target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().add_element_user(RELAYSFILEDEPOSITMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelaysFileDepositMessage" element
     */
    public void setNilRelaysFileDepositMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileDepositMessage target = null;
            target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().find_element_user(RELAYSFILEDEPOSITMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().add_element_user(RELAYSFILEDEPOSITMESSAGE$0);
            }
            target.setNil();
        }
    }
}
