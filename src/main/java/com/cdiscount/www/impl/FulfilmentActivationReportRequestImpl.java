/*
 * XML Type:  FulfilmentActivationReportRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReportRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentActivationReportRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentActivationReportRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationReportRequest
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationReportRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BeginDate");
    private static final javax.xml.namespace.QName DEPOSITIDLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DepositIdList");
    private static final javax.xml.namespace.QName ENDDATE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EndDate");
    
    
    /**
     * Gets the "BeginDate" element
     */
    public java.util.Calendar getBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BeginDate" element
     */
    public boolean isNilBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BeginDate" element
     */
    public boolean isSetBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "BeginDate" element
     */
    public void setBeginDate(java.util.Calendar beginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINDATE$0);
            }
            target.setCalendarValue(beginDate);
        }
    }
    
    /**
     * Sets (as xml) the "BeginDate" element
     */
    public void xsetBeginDate(org.apache.xmlbeans.XmlDateTime beginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINDATE$0);
            }
            target.set(beginDate);
        }
    }
    
    /**
     * Nils the "BeginDate" element
     */
    public void setNilBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BeginDate" element
     */
    public void unsetBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINDATE$0, 0);
        }
    }
    
    /**
     * Gets the "DepositIdList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint getDepositIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(DEPOSITIDLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DepositIdList" element
     */
    public boolean isNilDepositIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(DEPOSITIDLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DepositIdList" element
     */
    public boolean isSetDepositIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPOSITIDLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "DepositIdList" element
     */
    public void setDepositIdList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint depositIdList)
    {
        generatedSetterHelperImpl(depositIdList, DEPOSITIDLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DepositIdList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint addNewDepositIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().add_element_user(DEPOSITIDLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "DepositIdList" element
     */
    public void setNilDepositIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(DEPOSITIDLIST$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().add_element_user(DEPOSITIDLIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DepositIdList" element
     */
    public void unsetDepositIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPOSITIDLIST$2, 0);
        }
    }
    
    /**
     * Gets the "EndDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndDate" element
     */
    public boolean isNilEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EndDate" element
     */
    public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "EndDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$4);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Nils the "EndDate" element
     */
    public void setNilEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EndDate" element
     */
    public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATE$4, 0);
        }
    }
}
