/*
 * An XML document type.
 * Localname: Country
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.CountryDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one Country(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class CountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.CountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRY$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Country");
    
    
    /**
     * Gets the "Country" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country.Enum getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country)get_store().find_element_user(COUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Country" element
     */
    public boolean isNilCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country.Enum country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$0);
            }
            target.setEnumValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country)get_store().add_element_user(COUNTRY$0);
            }
            target.set(country);
        }
    }
    
    /**
     * Nils the "Country" element
     */
    public void setNilCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country)get_store().add_element_user(COUNTRY$0);
            }
            target.setNil();
        }
    }
}
