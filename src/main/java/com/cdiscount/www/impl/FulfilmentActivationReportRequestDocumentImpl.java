/*
 * An XML document type.
 * Localname: FulfilmentActivationReportRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReportRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentActivationReportRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentActivationReportRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationReportRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationReportRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREPORTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationReportRequest");
    
    
    /**
     * Gets the "FulfilmentActivationReportRequest" element
     */
    public com.cdiscount.www.FulfilmentActivationReportRequest getFulfilmentActivationReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().find_element_user(FULFILMENTACTIVATIONREPORTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentActivationReportRequest" element
     */
    public boolean isNilFulfilmentActivationReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().find_element_user(FULFILMENTACTIVATIONREPORTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentActivationReportRequest" element
     */
    public void setFulfilmentActivationReportRequest(com.cdiscount.www.FulfilmentActivationReportRequest fulfilmentActivationReportRequest)
    {
        generatedSetterHelperImpl(fulfilmentActivationReportRequest, FULFILMENTACTIVATIONREPORTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentActivationReportRequest" element
     */
    public com.cdiscount.www.FulfilmentActivationReportRequest addNewFulfilmentActivationReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().add_element_user(FULFILMENTACTIVATIONREPORTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentActivationReportRequest" element
     */
    public void setNilFulfilmentActivationReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().find_element_user(FULFILMENTACTIVATIONREPORTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().add_element_user(FULFILMENTACTIVATIONREPORTREQUEST$0);
            }
            target.setNil();
        }
    }
}
