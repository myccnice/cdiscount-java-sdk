/*
 * XML Type:  SupplyOrderReportListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SupplyOrderReportListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SupplyOrderReportListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.SupplyOrderReportListMessage
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTPAGENUMBER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CurrentPageNumber");
    private static final javax.xml.namespace.QName NUMBEROFPAGES$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfPages");
    private static final javax.xml.namespace.QName REPORTLIST$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ReportList");
    
    
    /**
     * Gets the "CurrentPageNumber" element
     */
    public int getCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentPageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CurrentPageNumber" element
     */
    public void setCurrentPageNumber(int currentPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTPAGENUMBER$0);
            }
            target.setIntValue(currentPageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentPageNumber" element
     */
    public void xsetCurrentPageNumber(org.apache.xmlbeans.XmlInt currentPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTPAGENUMBER$0);
            }
            target.set(currentPageNumber);
        }
    }
    
    /**
     * Gets the "NumberOfPages" element
     */
    public int getNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfPages" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfPages" element
     */
    public void setNumberOfPages(int numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPAGES$2);
            }
            target.setIntValue(numberOfPages);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfPages" element
     */
    public void xsetNumberOfPages(org.apache.xmlbeans.XmlInt numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFPAGES$2);
            }
            target.set(numberOfPages);
        }
    }
    
    /**
     * Gets the "ReportList" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReport getReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().find_element_user(REPORTLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ReportList" element
     */
    public boolean isNilReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().find_element_user(REPORTLIST$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ReportList" element
     */
    public void setReportList(com.cdiscount.www.ArrayOfSupplyOrderReport reportList)
    {
        generatedSetterHelperImpl(reportList, REPORTLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReportList" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReport addNewReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().add_element_user(REPORTLIST$4);
            return target;
        }
    }
    
    /**
     * Nils the "ReportList" element
     */
    public void setNilReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().find_element_user(REPORTLIST$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().add_element_user(REPORTLIST$4);
            }
            target.setNil();
        }
    }
}
