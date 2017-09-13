/*
 * An XML document type.
 * Localname: SecurityDescriptor
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one SecurityDescriptor(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class SecurityDescriptorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityDescriptorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYDESCRIPTOR$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SecurityDescriptor");
    
    
    /**
     * Gets the "SecurityDescriptor" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor getSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SecurityDescriptor" element
     */
    public boolean isNilSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SecurityDescriptor" element
     */
    public void setSecurityDescriptor(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor securityDescriptor)
    {
        generatedSetterHelperImpl(securityDescriptor, SECURITYDESCRIPTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SecurityDescriptor" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor addNewSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().add_element_user(SECURITYDESCRIPTOR$0);
            return target;
        }
    }
    
    /**
     * Nils the "SecurityDescriptor" element
     */
    public void setNilSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTOR$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().add_element_user(SECURITYDESCRIPTOR$0);
            }
            target.setNil();
        }
    }
}
