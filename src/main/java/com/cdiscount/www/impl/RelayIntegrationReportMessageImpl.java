/*
 * XML Type:  RelayIntegrationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelayIntegrationReportMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML RelayIntegrationReportMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class RelayIntegrationReportMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.RelayIntegrationReportMessage
{
    private static final long serialVersionUID = 1L;
    
    public RelayIntegrationReportMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFERRORS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfErrors");
    private static final javax.xml.namespace.QName RELAYSFILEID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysFileId");
    private static final javax.xml.namespace.QName RELAYSFILEINTEGRATIONSTATUS$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysFileIntegrationStatus");
    private static final javax.xml.namespace.QName RELAYSLOGLIST$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysLogList");
    
    
    /**
     * Gets the "NumberOfErrors" element
     */
    public int getNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfErrors" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfErrors" element
     */
    public boolean isSetNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFERRORS$0) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfErrors" element
     */
    public void setNumberOfErrors(int numberOfErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFERRORS$0);
            }
            target.setIntValue(numberOfErrors);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfErrors" element
     */
    public void xsetNumberOfErrors(org.apache.xmlbeans.XmlInt numberOfErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFERRORS$0);
            }
            target.set(numberOfErrors);
        }
    }
    
    /**
     * Unsets the "NumberOfErrors" element
     */
    public void unsetNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFERRORS$0, 0);
        }
    }
    
    /**
     * Gets the "RelaysFileId" element
     */
    public int getRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelaysFileId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELAYSFILEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RelaysFileId" element
     */
    public boolean isSetRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELAYSFILEID$2) != 0;
        }
    }
    
    /**
     * Sets the "RelaysFileId" element
     */
    public void setRelaysFileId(int relaysFileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELAYSFILEID$2);
            }
            target.setIntValue(relaysFileId);
        }
    }
    
    /**
     * Sets (as xml) the "RelaysFileId" element
     */
    public void xsetRelaysFileId(org.apache.xmlbeans.XmlInt relaysFileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELAYSFILEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RELAYSFILEID$2);
            }
            target.set(relaysFileId);
        }
    }
    
    /**
     * Unsets the "RelaysFileId" element
     */
    public void unsetRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELAYSFILEID$2, 0);
        }
    }
    
    /**
     * Gets the "RelaysFileIntegrationStatus" element
     */
    public java.lang.String getRelaysFileIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelaysFileIntegrationStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetRelaysFileIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEINTEGRATIONSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RelaysFileIntegrationStatus" element
     */
    public boolean isNilRelaysFileIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEINTEGRATIONSTATUS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RelaysFileIntegrationStatus" element
     */
    public boolean isSetRelaysFileIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELAYSFILEINTEGRATIONSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "RelaysFileIntegrationStatus" element
     */
    public void setRelaysFileIntegrationStatus(java.lang.String relaysFileIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELAYSFILEINTEGRATIONSTATUS$4);
            }
            target.setStringValue(relaysFileIntegrationStatus);
        }
    }
    
    /**
     * Sets (as xml) the "RelaysFileIntegrationStatus" element
     */
    public void xsetRelaysFileIntegrationStatus(org.apache.xmlbeans.XmlString relaysFileIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELAYSFILEINTEGRATIONSTATUS$4);
            }
            target.set(relaysFileIntegrationStatus);
        }
    }
    
    /**
     * Nils the "RelaysFileIntegrationStatus" element
     */
    public void setNilRelaysFileIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELAYSFILEINTEGRATIONSTATUS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RelaysFileIntegrationStatus" element
     */
    public void unsetRelaysFileIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELAYSFILEINTEGRATIONSTATUS$4, 0);
        }
    }
    
    /**
     * Gets the "RelaysLogList" element
     */
    public com.cdiscount.www.ArrayOfRelayIntegrationLog getRelaysLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().find_element_user(RELAYSLOGLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelaysLogList" element
     */
    public boolean isNilRelaysLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().find_element_user(RELAYSLOGLIST$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RelaysLogList" element
     */
    public boolean isSetRelaysLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELAYSLOGLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "RelaysLogList" element
     */
    public void setRelaysLogList(com.cdiscount.www.ArrayOfRelayIntegrationLog relaysLogList)
    {
        generatedSetterHelperImpl(relaysLogList, RELAYSLOGLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelaysLogList" element
     */
    public com.cdiscount.www.ArrayOfRelayIntegrationLog addNewRelaysLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().add_element_user(RELAYSLOGLIST$6);
            return target;
        }
    }
    
    /**
     * Nils the "RelaysLogList" element
     */
    public void setNilRelaysLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().find_element_user(RELAYSLOGLIST$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().add_element_user(RELAYSLOGLIST$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RelaysLogList" element
     */
    public void unsetRelaysLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELAYSLOGLIST$6, 0);
        }
    }
}
