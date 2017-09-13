/*
 * An XML document type.
 * Localname: Authorization
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.AuthorizationDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one Authorization(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class AuthorizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.AuthorizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthorizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORIZATION$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Authorization");
    
    
    /**
     * Gets the "Authorization" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization.Enum getAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Authorization" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization xgetAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization)get_store().find_element_user(AUTHORIZATION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Authorization" element
     */
    public boolean isNilAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization)get_store().find_element_user(AUTHORIZATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Authorization" element
     */
    public void setAuthorization(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization.Enum authorization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORIZATION$0);
            }
            target.setEnumValue(authorization);
        }
    }
    
    /**
     * Sets (as xml) the "Authorization" element
     */
    public void xsetAuthorization(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization authorization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization)get_store().find_element_user(AUTHORIZATION$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization)get_store().add_element_user(AUTHORIZATION$0);
            }
            target.set(authorization);
        }
    }
    
    /**
     * Nils the "Authorization" element
     */
    public void setNilAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization)get_store().find_element_user(AUTHORIZATION$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Authorization)get_store().add_element_user(AUTHORIZATION$0);
            }
            target.setNil();
        }
    }
}
