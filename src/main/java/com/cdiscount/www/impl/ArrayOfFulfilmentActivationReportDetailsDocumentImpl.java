/*
 * An XML document type.
 * Localname: ArrayOfFulfilmentActivationReportDetails
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentActivationReportDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfFulfilmentActivationReportDetails(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentActivationReportDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentActivationReportDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentActivationReportDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFULFILMENTACTIVATIONREPORTDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfFulfilmentActivationReportDetails");
    
    
    /**
     * Gets the "ArrayOfFulfilmentActivationReportDetails" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails getArrayOfFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().find_element_user(ARRAYOFFULFILMENTACTIVATIONREPORTDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfFulfilmentActivationReportDetails" element
     */
    public boolean isNilArrayOfFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().find_element_user(ARRAYOFFULFILMENTACTIVATIONREPORTDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfFulfilmentActivationReportDetails" element
     */
    public void setArrayOfFulfilmentActivationReportDetails(com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails arrayOfFulfilmentActivationReportDetails)
    {
        generatedSetterHelperImpl(arrayOfFulfilmentActivationReportDetails, ARRAYOFFULFILMENTACTIVATIONREPORTDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfFulfilmentActivationReportDetails" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails addNewArrayOfFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().add_element_user(ARRAYOFFULFILMENTACTIVATIONREPORTDETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfFulfilmentActivationReportDetails" element
     */
    public void setNilArrayOfFulfilmentActivationReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().find_element_user(ARRAYOFFULFILMENTACTIVATIONREPORTDETAILS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().add_element_user(ARRAYOFFULFILMENTACTIVATIONREPORTDETAILS$0);
            }
            target.setNil();
        }
    }
}
