/*
 * XML Type:  DomainRights
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML DomainRights(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class DomainRightsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights
{
    private static final long serialVersionUID = 1L;
    
    public DomainRightsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Name");
    private static final javax.xml.namespace.QName SECURITYDESCRIPTORLIST$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SecurityDescriptorList");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "Name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "SecurityDescriptorList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor getSecurityDescriptorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTORLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SecurityDescriptorList" element
     */
    public boolean isNilSecurityDescriptorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTORLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SecurityDescriptorList" element
     */
    public void setSecurityDescriptorList(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor securityDescriptorList)
    {
        generatedSetterHelperImpl(securityDescriptorList, SECURITYDESCRIPTORLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SecurityDescriptorList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor addNewSecurityDescriptorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().add_element_user(SECURITYDESCRIPTORLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "SecurityDescriptorList" element
     */
    public void setNilSecurityDescriptorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTORLIST$2, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().add_element_user(SECURITYDESCRIPTORLIST$2);
            }
            target.setNil();
        }
    }
}
