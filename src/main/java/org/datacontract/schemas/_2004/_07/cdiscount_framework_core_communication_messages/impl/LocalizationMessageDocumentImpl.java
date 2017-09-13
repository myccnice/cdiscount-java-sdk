/*
 * An XML document type.
 * Localname: LocalizationMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one LocalizationMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class LocalizationMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocalizationMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALIZATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "LocalizationMessage");
    
    
    /**
     * Gets the "LocalizationMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage getLocalizationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().find_element_user(LOCALIZATIONMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocalizationMessage" element
     */
    public boolean isNilLocalizationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().find_element_user(LOCALIZATIONMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocalizationMessage" element
     */
    public void setLocalizationMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage localizationMessage)
    {
        generatedSetterHelperImpl(localizationMessage, LOCALIZATIONMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocalizationMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage addNewLocalizationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().add_element_user(LOCALIZATIONMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocalizationMessage" element
     */
    public void setNilLocalizationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().find_element_user(LOCALIZATIONMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage)get_store().add_element_user(LOCALIZATIONMESSAGE$0);
            }
            target.setNil();
        }
    }
}
