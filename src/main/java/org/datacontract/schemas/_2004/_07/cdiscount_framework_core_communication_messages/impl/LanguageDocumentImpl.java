/*
 * An XML document type.
 * Localname: Language
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LanguageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one Language(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class LanguageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LanguageDocument
{
    private static final long serialVersionUID = 1L;
    
    public LanguageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Language");
    
    
    /**
     * Gets the "Language" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language.Enum getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Language" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().find_element_user(LANGUAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Language" element
     */
    public boolean isNilLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Language" element
     */
    public void setLanguage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language.Enum language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$0);
            }
            target.setEnumValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "Language" element
     */
    public void xsetLanguage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().add_element_user(LANGUAGE$0);
            }
            target.set(language);
        }
    }
    
    /**
     * Nils the "Language" element
     */
    public void setNilLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().add_element_user(LANGUAGE$0);
            }
            target.setNil();
        }
    }
}
