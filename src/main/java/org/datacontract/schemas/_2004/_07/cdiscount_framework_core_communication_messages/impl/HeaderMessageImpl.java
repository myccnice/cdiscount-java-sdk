/*
 * XML Type:  HeaderMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML HeaderMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class HeaderMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage
{
    private static final long serialVersionUID = 1L;
    
    public HeaderMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXT$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Context");
    private static final javax.xml.namespace.QName LOCALIZATION$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Localization");
    private static final javax.xml.namespace.QName SECURITY$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Security");
    private static final javax.xml.namespace.QName VERSION$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Version");
    
    
    /**
     * Gets the "Context" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Context" element
     */
    public boolean isNilContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Context" element
     */
    public void setContext(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage context)
    {
        generatedSetterHelperImpl(context, CONTEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Context" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().add_element_user(CONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "Context" element
     */
    public void setNilContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage)get_store().add_element_user(CONTEXT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Localization" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage getLocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().find_element_user(LOCALIZATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Localization" element
     */
    public boolean isNilLocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().find_element_user(LOCALIZATION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Localization" element
     */
    public void setLocalization(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage localization)
    {
        generatedSetterHelperImpl(localization, LOCALIZATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Localization" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage addNewLocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().add_element_user(LOCALIZATION$2);
            return target;
        }
    }
    
    /**
     * Nils the "Localization" element
     */
    public void setNilLocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().find_element_user(LOCALIZATION$2, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().add_element_user(LOCALIZATION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Security" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().find_element_user(SECURITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Security" element
     */
    public boolean isNilSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().find_element_user(SECURITY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Security" element
     */
    public boolean isSetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITY$4) != 0;
        }
    }
    
    /**
     * Sets the "Security" element
     */
    public void setSecurity(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext security)
    {
        generatedSetterHelperImpl(security, SECURITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Security" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().add_element_user(SECURITY$4);
            return target;
        }
    }
    
    /**
     * Nils the "Security" element
     */
    public void setNilSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().find_element_user(SECURITY$4, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext)get_store().add_element_user(SECURITY$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Security" element
     */
    public void unsetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITY$4, 0);
        }
    }
    
    /**
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Version" element
     */
    public boolean isNilVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$6);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$6);
            }
            target.set(version);
        }
    }
    
    /**
     * Nils the "Version" element
     */
    public void setNilVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$6);
            }
            target.setNil();
        }
    }
}
