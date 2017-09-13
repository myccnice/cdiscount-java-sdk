/*
 * An XML document type.
 * Localname: ArrayOfSupplyOrderReportLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSupplyOrderReportLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfSupplyOrderReportLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfSupplyOrderReportLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSupplyOrderReportLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSupplyOrderReportLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSUPPLYORDERREPORTLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfSupplyOrderReportLine");
    
    
    /**
     * Gets the "ArrayOfSupplyOrderReportLine" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReportLine getArrayOfSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().find_element_user(ARRAYOFSUPPLYORDERREPORTLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSupplyOrderReportLine" element
     */
    public boolean isNilArrayOfSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().find_element_user(ARRAYOFSUPPLYORDERREPORTLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSupplyOrderReportLine" element
     */
    public void setArrayOfSupplyOrderReportLine(com.cdiscount.www.ArrayOfSupplyOrderReportLine arrayOfSupplyOrderReportLine)
    {
        generatedSetterHelperImpl(arrayOfSupplyOrderReportLine, ARRAYOFSUPPLYORDERREPORTLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSupplyOrderReportLine" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderReportLine addNewArrayOfSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().add_element_user(ARRAYOFSUPPLYORDERREPORTLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSupplyOrderReportLine" element
     */
    public void setNilArrayOfSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderReportLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().find_element_user(ARRAYOFSUPPLYORDERREPORTLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSupplyOrderReportLine)get_store().add_element_user(ARRAYOFSUPPLYORDERREPORTLINE$0);
            }
            target.setNil();
        }
    }
}
