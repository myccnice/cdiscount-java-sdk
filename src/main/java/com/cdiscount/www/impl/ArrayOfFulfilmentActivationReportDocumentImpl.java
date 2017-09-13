/*
 * An XML document type.
 * Localname: ArrayOfFulfilmentActivationReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentActivationReportDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfFulfilmentActivationReport(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentActivationReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentActivationReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentActivationReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFULFILMENTACTIVATIONREPORT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfFulfilmentActivationReport");
    
    
    /**
     * Gets the "ArrayOfFulfilmentActivationReport" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReport getArrayOfFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().find_element_user(ARRAYOFFULFILMENTACTIVATIONREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfFulfilmentActivationReport" element
     */
    public boolean isNilArrayOfFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().find_element_user(ARRAYOFFULFILMENTACTIVATIONREPORT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfFulfilmentActivationReport" element
     */
    public void setArrayOfFulfilmentActivationReport(com.cdiscount.www.ArrayOfFulfilmentActivationReport arrayOfFulfilmentActivationReport)
    {
        generatedSetterHelperImpl(arrayOfFulfilmentActivationReport, ARRAYOFFULFILMENTACTIVATIONREPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfFulfilmentActivationReport" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReport addNewArrayOfFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().add_element_user(ARRAYOFFULFILMENTACTIVATIONREPORT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfFulfilmentActivationReport" element
     */
    public void setNilArrayOfFulfilmentActivationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReport target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().find_element_user(ARRAYOFFULFILMENTACTIVATIONREPORT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentActivationReport)get_store().add_element_user(ARRAYOFFULFILMENTACTIVATIONREPORT$0);
            }
            target.setNil();
        }
    }
}
