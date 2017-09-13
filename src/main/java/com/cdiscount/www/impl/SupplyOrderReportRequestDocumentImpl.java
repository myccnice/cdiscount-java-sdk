/*
 * An XML document type.
 * Localname: SupplyOrderReportRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderReportRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderReportRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReportRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREPORTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderReportRequest");
    
    
    /**
     * Gets the "SupplyOrderReportRequest" element
     */
    public com.cdiscount.www.SupplyOrderReportRequest getSupplyOrderReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportRequest target = null;
            target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().find_element_user(SUPPLYORDERREPORTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderReportRequest" element
     */
    public boolean isNilSupplyOrderReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportRequest target = null;
            target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().find_element_user(SUPPLYORDERREPORTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderReportRequest" element
     */
    public void setSupplyOrderReportRequest(com.cdiscount.www.SupplyOrderReportRequest supplyOrderReportRequest)
    {
        generatedSetterHelperImpl(supplyOrderReportRequest, SUPPLYORDERREPORTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderReportRequest" element
     */
    public com.cdiscount.www.SupplyOrderReportRequest addNewSupplyOrderReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportRequest target = null;
            target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().add_element_user(SUPPLYORDERREPORTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderReportRequest" element
     */
    public void setNilSupplyOrderReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportRequest target = null;
            target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().find_element_user(SUPPLYORDERREPORTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().add_element_user(SUPPLYORDERREPORTREQUEST$0);
            }
            target.setNil();
        }
    }
}
