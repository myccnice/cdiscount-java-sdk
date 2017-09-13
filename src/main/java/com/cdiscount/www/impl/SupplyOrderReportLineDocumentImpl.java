/*
 * An XML document type.
 * Localname: SupplyOrderReportLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderReportLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderReportLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReportLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREPORTLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderReportLine");
    
    
    /**
     * Gets the "SupplyOrderReportLine" element
     */
    public com.cdiscount.www.SupplyOrderReportLine getSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().find_element_user(SUPPLYORDERREPORTLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderReportLine" element
     */
    public boolean isNilSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().find_element_user(SUPPLYORDERREPORTLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderReportLine" element
     */
    public void setSupplyOrderReportLine(com.cdiscount.www.SupplyOrderReportLine supplyOrderReportLine)
    {
        generatedSetterHelperImpl(supplyOrderReportLine, SUPPLYORDERREPORTLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderReportLine" element
     */
    public com.cdiscount.www.SupplyOrderReportLine addNewSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().add_element_user(SUPPLYORDERREPORTLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderReportLine" element
     */
    public void setNilSupplyOrderReportLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportLine target = null;
            target = (com.cdiscount.www.SupplyOrderReportLine)get_store().find_element_user(SUPPLYORDERREPORTLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderReportLine)get_store().add_element_user(SUPPLYORDERREPORTLINE$0);
            }
            target.setNil();
        }
    }
}
