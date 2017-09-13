/*
 * XML Type:  LocalizationMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML LocalizationMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class LocalizationMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage
{
    private static final long serialVersionUID = 1L;
    
    public LocalizationMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRY$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Country");
    private static final javax.xml.namespace.QName CULTURENAME$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "CultureName");
    private static final javax.xml.namespace.QName CURRENCY$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Currency");
    private static final javax.xml.namespace.QName DECIMALPOSITION$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "DecimalPosition");
    private static final javax.xml.namespace.QName LANGUAGE$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "Language");
    
    
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
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$0) != 0;
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
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$0, 0);
        }
    }
    
    /**
     * Gets the "CultureName" element
     */
    public java.lang.String getCultureName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CULTURENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CultureName" element
     */
    public org.apache.xmlbeans.XmlString xgetCultureName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CULTURENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CultureName" element
     */
    public boolean isNilCultureName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CULTURENAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CultureName" element
     */
    public boolean isSetCultureName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CULTURENAME$2) != 0;
        }
    }
    
    /**
     * Sets the "CultureName" element
     */
    public void setCultureName(java.lang.String cultureName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CULTURENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CULTURENAME$2);
            }
            target.setStringValue(cultureName);
        }
    }
    
    /**
     * Sets (as xml) the "CultureName" element
     */
    public void xsetCultureName(org.apache.xmlbeans.XmlString cultureName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CULTURENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CULTURENAME$2);
            }
            target.set(cultureName);
        }
    }
    
    /**
     * Nils the "CultureName" element
     */
    public void setNilCultureName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CULTURENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CULTURENAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CultureName" element
     */
    public void unsetCultureName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CULTURENAME$2, 0);
        }
    }
    
    /**
     * Gets the "Currency" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency.Enum getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$4, 0);
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
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().find_element_user(CURRENCY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$4);
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
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().find_element_user(CURRENCY$4, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency)get_store().add_element_user(CURRENCY$4);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "Currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$4, 0);
        }
    }
    
    /**
     * Gets the "DecimalPosition" element
     */
    public int getDecimalPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALPOSITION$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DecimalPosition" element
     */
    public org.apache.xmlbeans.XmlInt xgetDecimalPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DECIMALPOSITION$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DecimalPosition" element
     */
    public boolean isNilDecimalPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DECIMALPOSITION$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DecimalPosition" element
     */
    public boolean isSetDecimalPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMALPOSITION$6) != 0;
        }
    }
    
    /**
     * Sets the "DecimalPosition" element
     */
    public void setDecimalPosition(int decimalPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALPOSITION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMALPOSITION$6);
            }
            target.setIntValue(decimalPosition);
        }
    }
    
    /**
     * Sets (as xml) the "DecimalPosition" element
     */
    public void xsetDecimalPosition(org.apache.xmlbeans.XmlInt decimalPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DECIMALPOSITION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DECIMALPOSITION$6);
            }
            target.set(decimalPosition);
        }
    }
    
    /**
     * Nils the "DecimalPosition" element
     */
    public void setNilDecimalPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DECIMALPOSITION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DECIMALPOSITION$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DecimalPosition" element
     */
    public void unsetDecimalPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMALPOSITION$6, 0);
        }
    }
    
    /**
     * Gets the "Language" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language.Enum getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$8, 0);
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
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().find_element_user(LANGUAGE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$8);
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
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().find_element_user(LANGUAGE$8, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language)get_store().add_element_user(LANGUAGE$8);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "Language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$8, 0);
        }
    }
}
