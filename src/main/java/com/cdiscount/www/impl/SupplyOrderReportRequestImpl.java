/*
 * XML Type:  SupplyOrderReportRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SupplyOrderReportRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SupplyOrderReportRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReportRequest
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINCREATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BeginCreationDate");
    private static final javax.xml.namespace.QName DEPOSITIDLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DepositIdList");
    private static final javax.xml.namespace.QName ENDCREATIONDATE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EndCreationDate");
    private static final javax.xml.namespace.QName PAGENUMBER$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PageNumber");
    private static final javax.xml.namespace.QName PAGESIZE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PageSize");
    
    
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
     * Gets the "PageNumber" element
     */
    public int getPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PageNumber" element
     */
    public boolean isSetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGENUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "PageNumber" element
     */
    public void setPageNumber(int pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGENUMBER$6);
            }
            target.setIntValue(pageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PageNumber" element
     */
    public void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$6);
            }
            target.set(pageNumber);
        }
    }
    
    /**
     * Unsets the "PageNumber" element
     */
    public void unsetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGENUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "PageSize" element
     */
    public int getPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGESIZE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PageSize" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PageSize" element
     */
    public void setPageSize(int pageSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGESIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGESIZE$8);
            }
            target.setIntValue(pageSize);
        }
    }
    
    /**
     * Sets (as xml) the "PageSize" element
     */
    public void xsetPageSize(org.apache.xmlbeans.XmlInt pageSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGESIZE$8);
            }
            target.set(pageSize);
        }
    }
}
