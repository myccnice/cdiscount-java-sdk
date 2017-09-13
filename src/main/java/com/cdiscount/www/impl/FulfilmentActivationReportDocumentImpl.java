/*
 * An XML document type.
 * Localname: FulfilmentActivationReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReportDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentActivationReport(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentActivationReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREPORT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationReport");
    
    
    /**
     * Gets the "FulfilmentActivationReport" element
     */
    public com.cdiscount.www.FulfilmentActivationReport getFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentActivationReport" element
     */
    public boolean isNilFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentActivationReport" element
     */
    public void setFulfilmentActivationReport(com.cdiscount.www.FulfilmentActivationReport fulfilmentActivationReport)
    {
        generatedSetterHelperImpl(fulfilmentActivationReport, FULFILMENTACTIVATIONREPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentActivationReport" element
     */
    public com.cdiscount.www.FulfilmentActivationReport addNewFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().add_element_user(FULFILMENTACTIVATIONREPORT$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentActivationReport" element
     */
    public void setNilFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReport target = null;
            target = (com.cdiscount.www.FulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentActivationReport)get_store().add_element_user(FULFILMENTACTIVATIONREPORT$0);
            }
            target.setNil();
        }
    }
}
