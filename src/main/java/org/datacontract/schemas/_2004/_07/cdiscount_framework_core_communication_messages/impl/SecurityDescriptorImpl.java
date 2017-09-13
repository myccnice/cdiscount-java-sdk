/*
 * XML Type:  SecurityDescriptor
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML SecurityDescriptor(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class SecurityDescriptorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor
{
    private static final long serialVersionUID = 1L;
    
    public SecurityDescriptorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORIZATION$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Authorization");
    private static final javax.xml.namespace.QName FUNCTIONIDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "FunctionIdentifier");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Version");
    
    
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
     * Gets the "FunctionIdentifier" element
     */
    public java.lang.String getFunctionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONIDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FunctionIdentifier" element
     */
    public org.apache.xmlbeans.XmlString xgetFunctionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTIONIDENTIFIER$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FunctionIdentifier" element
     */
    public boolean isNilFunctionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTIONIDENTIFIER$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FunctionIdentifier" element
     */
    public void setFunctionIdentifier(java.lang.String functionIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FUNCTIONIDENTIFIER$2);
            }
            target.setStringValue(functionIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "FunctionIdentifier" element
     */
    public void xsetFunctionIdentifier(org.apache.xmlbeans.XmlString functionIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTIONIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FUNCTIONIDENTIFIER$2);
            }
            target.set(functionIdentifier);
        }
    }
    
    /**
     * Nils the "FunctionIdentifier" element
     */
    public void setNilFunctionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTIONIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FUNCTIONIDENTIFIER$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Version" element
     */
    public int getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlInt xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(int version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
            }
            target.setIntValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlInt version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VERSION$4);
            }
            target.set(version);
        }
    }
}
