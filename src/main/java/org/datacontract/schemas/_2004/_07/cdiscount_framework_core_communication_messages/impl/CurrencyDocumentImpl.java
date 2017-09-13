/*
 * An XML document type.
 * Localname: Currency
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.CurrencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one Currency(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class CurrencyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.CurrencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Currency");
    
    
    /**
     * Gets the "Currency" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency.Enum getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Currency" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().find_element_user(CURRENCY$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Currency" element
     */
    public boolean isNilCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Currency" element
     */
    public void setCurrency(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency.Enum currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$0);
            }
            target.setEnumValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "Currency" element
     */
    public void xsetCurrency(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().add_element_user(CURRENCY$0);
            }
            target.set(currency);
        }
    }
    
    /**
     * Nils the "Currency" element
     */
    public void setNilCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().add_element_user(CURRENCY$0);
            }
            target.setNil();
        }
    }
}
