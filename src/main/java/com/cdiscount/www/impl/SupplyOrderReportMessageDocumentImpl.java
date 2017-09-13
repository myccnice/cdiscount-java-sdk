/*
 * An XML document type.
 * Localname: SupplyOrderReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderReportMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderReportMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReportMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREPORTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderReportMessage");
    
    
    /**
     * Gets the "SupplyOrderReportMessage" element
     */
    public com.cdiscount.www.SupplyOrderReportMessage getSupplyOrderReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUPPLYORDERREPORTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderReportMessage" element
     */
    public boolean isNilSupplyOrderReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUPPLYORDERREPORTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderReportMessage" element
     */
    public void setSupplyOrderReportMessage(com.cdiscount.www.SupplyOrderReportMessage supplyOrderReportMessage)
    {
        generatedSetterHelperImpl(supplyOrderReportMessage, SUPPLYORDERREPORTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderReportMessage" element
     */
    public com.cdiscount.www.SupplyOrderReportMessage addNewSupplyOrderReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().add_element_user(SUPPLYORDERREPORTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderReportMessage" element
     */
    public void setNilSupplyOrderReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderReportMessage target = null;
            target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUPPLYORDERREPORTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().add_element_user(SUPPLYORDERREPORTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
