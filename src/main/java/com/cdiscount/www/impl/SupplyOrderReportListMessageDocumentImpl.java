/*
 * An XML document type.
 * Localname: SupplyOrderReportListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderReportListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderReportListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReportListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREPORTLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderReportListMessage");
    
    
    /**
     * Gets the "SupplyOrderReportListMessage" element
     */
    public com.cdiscount.www.SupplyOrderReportListMessage getSupplyOrderReportListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportListMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().find_element_user(SUPPLYORDERREPORTLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderReportListMessage" element
     */
    public boolean isNilSupplyOrderReportListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportListMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().find_element_user(SUPPLYORDERREPORTLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderReportListMessage" element
     */
    public void setSupplyOrderReportListMessage(com.cdiscount.www.SupplyOrderReportListMessage supplyOrderReportListMessage)
    {
        generatedSetterHelperImpl(supplyOrderReportListMessage, SUPPLYORDERREPORTLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderReportListMessage" element
     */
    public com.cdiscount.www.SupplyOrderReportListMessage addNewSupplyOrderReportListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportListMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().add_element_user(SUPPLYORDERREPORTLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderReportListMessage" element
     */
    public void setNilSupplyOrderReportListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportListMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().find_element_user(SUPPLYORDERREPORTLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().add_element_user(SUPPLYORDERREPORTLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
