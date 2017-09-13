/*
 * XML Type:  SupplyOrderReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReport
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SupplyOrderReport(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SupplyOrderReportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReport
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPOSITID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DepositId");
    private static final javax.xml.namespace.QName REPORTLINELIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ReportLineList");
    
    
    /**
     * Gets the "DepositId" element
     */
    public int getDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepositId" element
     */
    public org.apache.xmlbeans.XmlInt xgetDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DepositId" element
     */
    public void setDepositId(int depositId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPOSITID$0);
            }
            target.setIntValue(depositId);
        }
    }
    
    /**
     * Sets (as xml) the "DepositId" element
     */
    public void xsetDepositId(org.apache.xmlbeans.XmlInt depositId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPOSITID$0);
            }
            target.set(depositId);
        }
    }
    
    /**
     * Gets the "ReportLineList" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReportLine getReportLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().find_element_user(REPORTLINELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ReportLineList" element
     */
    public boolean isNilReportLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().find_element_user(REPORTLINELIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ReportLineList" element
     */
    public void setReportLineList(com.cdiscount.www.ArrayOfSupplyOrderReportLine reportLineList)
    {
        generatedSetterHelperImpl(reportLineList, REPORTLINELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReportLineList" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReportLine addNewReportLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().add_element_user(REPORTLINELIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "ReportLineList" element
     */
    public void setNilReportLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().find_element_user(REPORTLINELIST$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().add_element_user(REPORTLINELIST$2);
            }
            target.setNil();
        }
    }
}
