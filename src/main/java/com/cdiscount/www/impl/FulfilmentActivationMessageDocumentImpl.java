/*
 * An XML document type.
 * Localname: FulfilmentActivationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentActivationMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentActivationMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationMessage");
    
    
    /**
     * Gets the "FulfilmentActivationMessage" element
     */
    public com.cdiscount.www.FulfilmentActivationMessage getFulfilmentActivationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().find_element_user(FULFILMENTACTIVATIONMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentActivationMessage" element
     */
    public boolean isNilFulfilmentActivationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().find_element_user(FULFILMENTACTIVATIONMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentActivationMessage" element
     */
    public void setFulfilmentActivationMessage(com.cdiscount.www.FulfilmentActivationMessage fulfilmentActivationMessage)
    {
        generatedSetterHelperImpl(fulfilmentActivationMessage, FULFILMENTACTIVATIONMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentActivationMessage" element
     */
    public com.cdiscount.www.FulfilmentActivationMessage addNewFulfilmentActivationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().add_element_user(FULFILMENTACTIVATIONMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentActivationMessage" element
     */
    public void setNilFulfilmentActivationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().find_element_user(FULFILMENTACTIVATIONMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().add_element_user(FULFILMENTACTIVATIONMESSAGE$0);
            }
            target.setNil();
        }
    }
}
