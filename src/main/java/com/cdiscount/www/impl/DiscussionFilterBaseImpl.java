/*
 * XML Type:  DiscussionFilterBase
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscussionFilterBase
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML DiscussionFilterBase(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class DiscussionFilterBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscussionFilterBase
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionFilterBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINCREATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BeginCreationDate");
    private static final javax.xml.namespace.QName BEGINMODIFICATIONDATE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BeginModificationDate");
    private static final javax.xml.namespace.QName ENDCREATIONDATE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EndCreationDate");
    private static final javax.xml.namespace.QName ENDMODIFICATIONDATE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EndModificationDate");
    private static final javax.xml.namespace.QName STATUSLIST$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "StatusList");
    
    
    /**
     * Gets the "BeginCreationDate" element
     */
    public java.util.Calendar getBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginCreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BeginCreationDate" element
     */
    public boolean isNilBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BeginCreationDate" element
     */
    public boolean isSetBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINCREATIONDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "BeginCreationDate" element
     */
    public void setBeginCreationDate(java.util.Calendar beginCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINCREATIONDATE$0);
            }
            target.setCalendarValue(beginCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "BeginCreationDate" element
     */
    public void xsetBeginCreationDate(org.apache.xmlbeans.XmlDateTime beginCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINCREATIONDATE$0);
            }
            target.set(beginCreationDate);
        }
    }
    
    /**
     * Nils the "BeginCreationDate" element
     */
    public void setNilBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINCREATIONDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BeginCreationDate" element
     */
    public void unsetBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINCREATIONDATE$0, 0);
        }
    }
    
    /**
     * Gets the "BeginModificationDate" element
     */
    public java.util.Calendar getBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginModificationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BeginModificationDate" element
     */
    public boolean isNilBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BeginModificationDate" element
     */
    public boolean isSetBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINMODIFICATIONDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "BeginModificationDate" element
     */
    public void setBeginModificationDate(java.util.Calendar beginModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINMODIFICATIONDATE$2);
            }
            target.setCalendarValue(beginModificationDate);
        }
    }
    
    /**
     * Sets (as xml) the "BeginModificationDate" element
     */
    public void xsetBeginModificationDate(org.apache.xmlbeans.XmlDateTime beginModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINMODIFICATIONDATE$2);
            }
            target.set(beginModificationDate);
        }
    }
    
    /**
     * Nils the "BeginModificationDate" element
     */
    public void setNilBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINMODIFICATIONDATE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BeginModificationDate" element
     */
    public void unsetBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINMODIFICATIONDATE$2, 0);
        }
    }
    
    /**
     * Gets the "EndCreationDate" element
     */
    public java.util.Calendar getEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDCREATIONDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndCreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndCreationDate" element
     */
    public boolean isNilEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EndCreationDate" element
     */
    public boolean isSetEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDCREATIONDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "EndCreationDate" element
     */
    public void setEndCreationDate(java.util.Calendar endCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDCREATIONDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDCREATIONDATE$4);
            }
            target.setCalendarValue(endCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndCreationDate" element
     */
    public void xsetEndCreationDate(org.apache.xmlbeans.XmlDateTime endCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDCREATIONDATE$4);
            }
            target.set(endCreationDate);
        }
    }
    
    /**
     * Nils the "EndCreationDate" element
     */
    public void setNilEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDCREATIONDATE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EndCreationDate" element
     */
    public void unsetEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDCREATIONDATE$4, 0);
        }
    }
    
    /**
     * Gets the "EndModificationDate" element
     */
    public java.util.Calendar getEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDMODIFICATIONDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndModificationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndModificationDate" element
     */
    public boolean isNilEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EndModificationDate" element
     */
    public boolean isSetEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDMODIFICATIONDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "EndModificationDate" element
     */
    public void setEndModificationDate(java.util.Calendar endModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDMODIFICATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDMODIFICATIONDATE$6);
            }
            target.setCalendarValue(endModificationDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndModificationDate" element
     */
    public void xsetEndModificationDate(org.apache.xmlbeans.XmlDateTime endModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDMODIFICATIONDATE$6);
            }
            target.set(endModificationDate);
        }
    }
    
    /**
     * Nils the "EndModificationDate" element
     */
    public void setNilEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDMODIFICATIONDATE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EndModificationDate" element
     */
    public void unsetEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDMODIFICATIONDATE$6, 0);
        }
    }
    
    /**
     * Gets the "StatusList" element
     */
    public com.cdiscount.www.ArrayOfDiscussionStateFilter getStatusList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().find_element_user(STATUSLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StatusList" element
     */
    public boolean isNilStatusList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().find_element_user(STATUSLIST$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "StatusList" element
     */
    public boolean isSetStatusList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSLIST$8) != 0;
        }
    }
    
    /**
     * Sets the "StatusList" element
     */
    public void setStatusList(com.cdiscount.www.ArrayOfDiscussionStateFilter statusList)
    {
        generatedSetterHelperImpl(statusList, STATUSLIST$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusList" element
     */
    public com.cdiscount.www.ArrayOfDiscussionStateFilter addNewStatusList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().add_element_user(STATUSLIST$8);
            return target;
        }
    }
    
    /**
     * Nils the "StatusList" element
     */
    public void setNilStatusList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().find_element_user(STATUSLIST$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().add_element_user(STATUSLIST$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "StatusList" element
     */
    public void unsetStatusList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSLIST$8, 0);
        }
    }
}
