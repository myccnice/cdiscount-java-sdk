/*
 * An XML document type.
 * Localname: ServiceMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one ServiceMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class ServiceMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "ServiceMessage");
    
    
    /**
     * Gets the "ServiceMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage getServiceMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage)get_store().find_element_user(SERVICEMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ServiceMessage" element
     */
    public boolean isNilServiceMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage)get_store().find_element_user(SERVICEMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ServiceMessage" element
     */
    public void setServiceMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage serviceMessage)
    {
        generatedSetterHelperImpl(serviceMessage, SERVICEMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage addNewServiceMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage)get_store().add_element_user(SERVICEMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ServiceMessage" element
     */
    public void setNilServiceMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage)get_store().find_element_user(SERVICEMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage)get_store().add_element_user(SERVICEMESSAGE$0);
            }
            target.setNil();
        }
    }
}
