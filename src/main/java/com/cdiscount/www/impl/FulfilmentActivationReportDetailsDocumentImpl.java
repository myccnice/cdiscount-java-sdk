/*
 * An XML document type.
 * Localname: FulfilmentActivationReportDetails
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReportDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentActivationReportDetails(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentActivationReportDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationReportDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationReportDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREPORTDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationReportDetails");
    
    
    /**
     * Gets the "FulfilmentActivationReportDetails" element
     */
    public com.cdiscount.www.FulfilmentActivationReportDetails getFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().find_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentActivationReportDetails" element
     */
    public boolean isNilFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().find_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentActivationReportDetails" element
     */
    public void setFulfilmentActivationReportDetails(com.cdiscount.www.FulfilmentActivationReportDetails fulfilmentActivationReportDetails)
    {
        generatedSetterHelperImpl(fulfilmentActivationReportDetails, FULFILMENTACTIVATIONREPORTDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentActivationReportDetails" element
     */
    public com.cdiscount.www.FulfilmentActivationReportDetails addNewFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().add_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentActivationReportDetails" element
     */
    public void setNilFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().find_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentActivationReportDetails)get_store().add_element_user(FULFILMENTACTIVATIONREPORTDETAILS$0);
            }
            target.setNil();
        }
    }
}
