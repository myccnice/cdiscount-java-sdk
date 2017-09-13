/*
 * XML Type:  OfferReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferReportPropertyLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferReportPropertyLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferReportPropertyLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferReportPropertyLog
{
    private static final long serialVersionUID = 1L;
    
    public OfferReportPropertyLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LogMessage");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Name");
    private static final javax.xml.namespace.QName PROPERTYCODE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PropertyCode");
    private static final javax.xml.namespace.QName PROPERTYERROR$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PropertyError");
    
    
    /**
     * Gets the "LogMessage" element
     */
    public java.lang.String getLogMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetLogMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGMESSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LogMessage" element
     */
    public boolean isNilLogMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LogMessage" element
     */
    public boolean isSetLogMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGMESSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "LogMessage" element
     */
    public void setLogMessage(java.lang.String logMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGMESSAGE$0);
            }
            target.setStringValue(logMessage);
        }
    }
    
    /**
     * Sets (as xml) the "LogMessage" element
     */
    public void xsetLogMessage(org.apache.xmlbeans.XmlString logMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGMESSAGE$0);
            }
            target.set(logMessage);
        }
    }
    
    /**
     * Nils the "LogMessage" element
     */
    public void setNilLogMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGMESSAGE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LogMessage" element
     */
    public void unsetLogMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGMESSAGE$0, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "PropertyCode" element
     */
    public java.lang.String getPropertyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PropertyCode" element
     */
    public boolean isNilPropertyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCODE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PropertyCode" element
     */
    public boolean isSetPropertyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "PropertyCode" element
     */
    public void setPropertyCode(java.lang.String propertyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYCODE$4);
            }
            target.setStringValue(propertyCode);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyCode" element
     */
    public void xsetPropertyCode(org.apache.xmlbeans.XmlString propertyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYCODE$4);
            }
            target.set(propertyCode);
        }
    }
    
    /**
     * Nils the "PropertyCode" element
     */
    public void setNilPropertyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYCODE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PropertyCode" element
     */
    public void unsetPropertyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYCODE$4, 0);
        }
    }
    
    /**
     * Gets the "PropertyError" element
     */
    public java.lang.String getPropertyError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYERROR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyError" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYERROR$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PropertyError" element
     */
    public boolean isNilPropertyError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYERROR$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PropertyError" element
     */
    public boolean isSetPropertyError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYERROR$6) != 0;
        }
    }
    
    /**
     * Sets the "PropertyError" element
     */
    public void setPropertyError(java.lang.String propertyError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYERROR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYERROR$6);
            }
            target.setStringValue(propertyError);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyError" element
     */
    public void xsetPropertyError(org.apache.xmlbeans.XmlString propertyError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYERROR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYERROR$6);
            }
            target.set(propertyError);
        }
    }
    
    /**
     * Nils the "PropertyError" element
     */
    public void setNilPropertyError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYERROR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYERROR$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PropertyError" element
     */
    public void unsetPropertyError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYERROR$6, 0);
        }
    }
}
