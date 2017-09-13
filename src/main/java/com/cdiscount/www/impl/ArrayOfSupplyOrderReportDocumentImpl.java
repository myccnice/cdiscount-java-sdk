/*
 * An XML document type.
 * Localname: ArrayOfSupplyOrderReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSupplyOrderReportDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfSupplyOrderReport(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfSupplyOrderReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSupplyOrderReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSupplyOrderReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSUPPLYORDERREPORT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfSupplyOrderReport");
    
    
    /**
     * Gets the "ArrayOfSupplyOrderReport" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReport getArrayOfSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().find_element_user(ARRAYOFSUPPLYORDERREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSupplyOrderReport" element
     */
    public boolean isNilArrayOfSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().find_element_user(ARRAYOFSUPPLYORDERREPORT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSupplyOrderReport" element
     */
    public void setArrayOfSupplyOrderReport(com.cdiscount.www.ArrayOfSupplyOrderReport arrayOfSupplyOrderReport)
    {
        generatedSetterHelperImpl(arrayOfSupplyOrderReport, ARRAYOFSUPPLYORDERREPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSupplyOrderReport" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReport addNewArrayOfSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().add_element_user(ARRAYOFSUPPLYORDERREPORT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSupplyOrderReport" element
     */
    public void setNilArrayOfSupplyOrderReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReport target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().find_element_user(ARRAYOFSUPPLYORDERREPORT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSupplyOrderReport)get_store().add_element_user(ARRAYOFSUPPLYORDERREPORT$0);
            }
            target.setNil();
        }
    }
}
