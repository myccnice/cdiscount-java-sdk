/*
 * XML Type:  FulfilmentActivationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReportMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentActivationReportMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentActivationReportMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.FulfilmentActivationReportMessage
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationReportMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREPORTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationReportList");
    
    
    /**
     * Gets the "FulfilmentActivationReportList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReport getFulfilmentActivationReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentActivationReportList" element
     */
    public boolean isNilFulfilmentActivationReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORTLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentActivationReportList" element
     */
    public void setFulfilmentActivationReportList(com.cdiscount.www.ArrayOfFulfilmentActivationReport fulfilmentActivationReportList)
    {
        generatedSetterHelperImpl(fulfilmentActivationReportList, FULFILMENTACTIVATIONREPORTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentActivationReportList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReport addNewFulfilmentActivationReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().add_element_user(FULFILMENTACTIVATIONREPORTLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentActivationReportList" element
     */
    public void setNilFulfilmentActivationReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().find_element_user(FULFILMENTACTIVATIONREPORTLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().add_element_user(FULFILMENTACTIVATIONREPORTLIST$0);
            }
            target.setNil();
        }
    }
}
