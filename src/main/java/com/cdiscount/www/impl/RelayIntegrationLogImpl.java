/*
 * XML Type:  RelayIntegrationLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelayIntegrationLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML RelayIntegrationLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class RelayIntegrationLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RelayIntegrationLog
{
    private static final long serialVersionUID = 1L;
    
    public RelayIntegrationLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Errors");
    private static final javax.xml.namespace.QName LOGDATE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LogDate");
    private static final javax.xml.namespace.QName RELAYREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelayReference");
    private static final javax.xml.namespace.QName VALIDATED$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Validated");
    
    
    /**
     * Gets the "Errors" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Errors" element
     */
    public boolean isNilErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ERRORS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Errors" element
     */
    public boolean isSetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORS$0) != 0;
        }
    }
    
    /**
     * Sets the "Errors" element
     */
    public void setErrors(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring errors)
    {
        generatedSetterHelperImpl(errors, ERRORS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Errors" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ERRORS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Errors" element
     */
    public void setNilErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ERRORS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Errors" element
     */
    public void unsetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORS$0, 0);
        }
    }
    
    /**
     * Gets the "LogDate" element
     */
    public java.util.Calendar getLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOGDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LogDate" element
     */
    public boolean isSetLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "LogDate" element
     */
    public void setLogDate(java.util.Calendar logDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGDATE$2);
            }
            target.setCalendarValue(logDate);
        }
    }
    
    /**
     * Sets (as xml) the "LogDate" element
     */
    public void xsetLogDate(org.apache.xmlbeans.XmlDateTime logDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOGDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LOGDATE$2);
            }
            target.set(logDate);
        }
    }
    
    /**
     * Unsets the "LogDate" element
     */
    public void unsetLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGDATE$2, 0);
        }
    }
    
    /**
     * Gets the "RelayReference" element
     */
    public java.lang.String getRelayReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelayReference" element
     */
    public org.apache.xmlbeans.XmlString xgetRelayReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYREFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RelayReference" element
     */
    public boolean isNilRelayReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYREFERENCE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RelayReference" element
     */
    public boolean isSetRelayReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELAYREFERENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "RelayReference" element
     */
    public void setRelayReference(java.lang.String relayReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELAYREFERENCE$4);
            }
            target.setStringValue(relayReference);
        }
    }
    
    /**
     * Sets (as xml) the "RelayReference" element
     */
    public void xsetRelayReference(org.apache.xmlbeans.XmlString relayReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELAYREFERENCE$4);
            }
            target.set(relayReference);
        }
    }
    
    /**
     * Nils the "RelayReference" element
     */
    public void setNilRelayReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELAYREFERENCE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RelayReference" element
     */
    public void unsetRelayReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELAYREFERENCE$4, 0);
        }
    }
    
    /**
     * Gets the "Validated" element
     */
    public boolean getValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Validated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Validated" element
     */
    public boolean isSetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATED$6) != 0;
        }
    }
    
    /**
     * Sets the "Validated" element
     */
    public void setValidated(boolean validated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATED$6);
            }
            target.setBooleanValue(validated);
        }
    }
    
    /**
     * Sets (as xml) the "Validated" element
     */
    public void xsetValidated(org.apache.xmlbeans.XmlBoolean validated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALIDATED$6);
            }
            target.set(validated);
        }
    }
    
    /**
     * Unsets the "Validated" element
     */
    public void unsetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATED$6, 0);
        }
    }
}
