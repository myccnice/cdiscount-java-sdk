/*
 * XML Type:  DiscussionThreadBase
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionThreadBase
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML DiscussionThreadBase(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class DiscussionThreadBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionThreadBase
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionThreadBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDate");
    private static final javax.xml.namespace.QName CREATIONDATE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreationDate");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Id");
    private static final javax.xml.namespace.QName LASTUPDATEDDATE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LastUpdatedDate");
    private static final javax.xml.namespace.QName MESSAGES$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Messages");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Status");
    private static final javax.xml.namespace.QName SUBJECT$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Subject");
    
    
    /**
     * Gets the "CloseDate" element
     */
    public java.util.Calendar getCloseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CloseDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCloseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CloseDate" element
     */
    public boolean isNilCloseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CloseDate" element
     */
    public boolean isSetCloseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSEDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "CloseDate" element
     */
    public void setCloseDate(java.util.Calendar closeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSEDATE$0);
            }
            target.setCalendarValue(closeDate);
        }
    }
    
    /**
     * Sets (as xml) the "CloseDate" element
     */
    public void xsetCloseDate(org.apache.xmlbeans.XmlDateTime closeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLOSEDATE$0);
            }
            target.set(closeDate);
        }
    }
    
    /**
     * Nils the "CloseDate" element
     */
    public void setNilCloseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLOSEDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CloseDate" element
     */
    public void unsetCloseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSEDATE$0, 0);
        }
    }
    
    /**
     * Gets the "CreationDate" element
     */
    public java.util.Calendar getCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreationDate" element
     */
    public boolean isSetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATIONDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "CreationDate" element
     */
    public void setCreationDate(java.util.Calendar creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONDATE$2);
            }
            target.setCalendarValue(creationDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreationDate" element
     */
    public void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATIONDATE$2);
            }
            target.set(creationDate);
        }
    }
    
    /**
     * Unsets the "CreationDate" element
     */
    public void unsetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATIONDATE$2, 0);
        }
    }
    
    /**
     * Gets the "Id" element
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Id" element
     */
    public org.apache.xmlbeans.XmlLong xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$4) != 0;
        }
    }
    
    /**
     * Sets the "Id" element
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "Id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlLong id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "Id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$4, 0);
        }
    }
    
    /**
     * Gets the "LastUpdatedDate" element
     */
    public java.util.Calendar getLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATEDDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastUpdatedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LastUpdatedDate" element
     */
    public boolean isNilLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LastUpdatedDate" element
     */
    public boolean isSetLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTUPDATEDDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "LastUpdatedDate" element
     */
    public void setLastUpdatedDate(java.util.Calendar lastUpdatedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATEDDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATEDDATE$6);
            }
            target.setCalendarValue(lastUpdatedDate);
        }
    }
    
    /**
     * Sets (as xml) the "LastUpdatedDate" element
     */
    public void xsetLastUpdatedDate(org.apache.xmlbeans.XmlDateTime lastUpdatedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTUPDATEDDATE$6);
            }
            target.set(lastUpdatedDate);
        }
    }
    
    /**
     * Nils the "LastUpdatedDate" element
     */
    public void setNilLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTUPDATEDDATE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LastUpdatedDate" element
     */
    public void unsetLastUpdatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTUPDATEDDATE$6, 0);
        }
    }
    
    /**
     * Gets the "Messages" element
     */
    public com.cdiscount.www.ArrayOfMessage getMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().find_element_user(MESSAGES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Messages" element
     */
    public boolean isNilMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().find_element_user(MESSAGES$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Messages" element
     */
    public boolean isSetMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGES$8) != 0;
        }
    }
    
    /**
     * Sets the "Messages" element
     */
    public void setMessages(com.cdiscount.www.ArrayOfMessage messages)
    {
        generatedSetterHelperImpl(messages, MESSAGES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Messages" element
     */
    public com.cdiscount.www.ArrayOfMessage addNewMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().add_element_user(MESSAGES$8);
            return target;
        }
    }
    
    /**
     * Nils the "Messages" element
     */
    public void setNilMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().find_element_user(MESSAGES$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfMessage)get_store().add_element_user(MESSAGES$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Messages" element
     */
    public void unsetMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGES$8, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.cdiscount.www.DiscussionState.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.DiscussionState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.cdiscount.www.DiscussionState xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionState target = null;
            target = (com.cdiscount.www.DiscussionState)get_store().find_element_user(STATUS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$10) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.cdiscount.www.DiscussionState.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$10);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.cdiscount.www.DiscussionState status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscussionState target = null;
            target = (com.cdiscount.www.DiscussionState)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscussionState)get_store().add_element_user(STATUS$10);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$10, 0);
        }
    }
    
    /**
     * Gets the "Subject" element
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Subject" element
     */
    public org.apache.xmlbeans.XmlString xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Subject" element
     */
    public boolean isNilSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$12) != 0;
        }
    }
    
    /**
     * Sets the "Subject" element
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$12);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "Subject" element
     */
    public void xsetSubject(org.apache.xmlbeans.XmlString subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$12);
            }
            target.set(subject);
        }
    }
    
    /**
     * Nils the "Subject" element
     */
    public void setNilSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$12, 0);
        }
    }
}
