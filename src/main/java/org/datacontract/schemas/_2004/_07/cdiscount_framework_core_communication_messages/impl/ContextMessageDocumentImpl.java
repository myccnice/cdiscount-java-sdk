/*
 * An XML document type.
 * Localname: ContextMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one ContextMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class ContextMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "ContextMessage");
    
    
    /**
     * Gets the "ContextMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage getContextMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().find_element_user(CONTEXTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContextMessage" element
     */
    public boolean isNilContextMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().find_element_user(CONTEXTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContextMessage" element
     */
    public void setContextMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage contextMessage)
    {
        generatedSetterHelperImpl(contextMessage, CONTEXTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ContextMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage addNewContextMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().add_element_user(CONTEXTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContextMessage" element
     */
    public void setNilContextMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().find_element_user(CONTEXTMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().add_element_user(CONTEXTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
