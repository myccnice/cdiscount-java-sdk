/*
 * An XML document type.
 * Localname: SecurityContext
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContextDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one SecurityContext(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class SecurityContextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContextDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityContextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYCONTEXT$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SecurityContext");
    
    
    /**
     * Gets the "SecurityContext" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext getSecurityContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().find_element_user(SECURITYCONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SecurityContext" element
     */
    public boolean isNilSecurityContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().find_element_user(SECURITYCONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SecurityContext" element
     */
    public void setSecurityContext(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext securityContext)
    {
        generatedSetterHelperImpl(securityContext, SECURITYCONTEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SecurityContext" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext addNewSecurityContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().add_element_user(SECURITYCONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "SecurityContext" element
     */
    public void setNilSecurityContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().find_element_user(SECURITYCONTEXT$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().add_element_user(SECURITYCONTEXT$0);
            }
            target.setNil();
        }
    }
}
