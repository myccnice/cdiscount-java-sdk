/*
 * An XML document type.
 * Localname: Message
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Message(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class MessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.MessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Message");
    
    
    /**
     * Gets the "Message" element
     */
    public com.cdiscount.www.Message getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Message" element
     */
    public boolean isNilMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(com.cdiscount.www.Message message)
    {
        generatedSetterHelperImpl(message, MESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Message" element
     */
    public com.cdiscount.www.Message addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().add_element_user(MESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "Message" element
     */
    public void setNilMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Message)get_store().add_element_user(MESSAGE$0);
            }
            target.setNil();
        }
    }
}
