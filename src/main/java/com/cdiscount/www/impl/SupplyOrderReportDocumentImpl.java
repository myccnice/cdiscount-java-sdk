/*
 * An XML document type.
 * Localname: SupplyOrderReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderReport(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREPORT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderReport");
    
    
    /**
     * Gets the "SupplyOrderReport" element
     */
    public com.cdiscount.www.SupplyOrderReport getSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().find_element_user(SUPPLYORDERREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderReport" element
     */
    public boolean isNilSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().find_element_user(SUPPLYORDERREPORT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderReport" element
     */
    public void setSupplyOrderReport(com.cdiscount.www.SupplyOrderReport supplyOrderReport)
    {
        generatedSetterHelperImpl(supplyOrderReport, SUPPLYORDERREPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderReport" element
     */
    public com.cdiscount.www.SupplyOrderReport addNewSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().add_element_user(SUPPLYORDERREPORT$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderReport" element
     */
    public void setNilSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReport target = null;
            target = (com.cdiscount.www.SupplyOrderReport)get_store().find_element_user(SUPPLYORDERREPORT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderReport)get_store().add_element_user(SUPPLYORDERREPORT$0);
            }
            target.setNil();
        }
    }
}
