/*
 * An XML document type.
 * Localname: FulfilmentActivationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReportMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentActivationReportMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentActivationReportMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationReportMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationReportMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREPORTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationReportMessage");
    
    
    /**
     * Gets the "FulfilmentActivationReportMessage" element
     */
    public com.cdiscount.www.FulfilmentActivationReportMessage getFulfilmentActivationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().find_element_user(FULFILMENTACTIVATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentActivationReportMessage" element
     */
    public boolean isNilFulfilmentActivationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().find_element_user(FULFILMENTACTIVATIONREPORTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentActivationReportMessage" element
     */
    public void setFulfilmentActivationReportMessage(com.cdiscount.www.FulfilmentActivationReportMessage fulfilmentActivationReportMessage)
    {
        generatedSetterHelperImpl(fulfilmentActivationReportMessage, FULFILMENTACTIVATIONREPORTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentActivationReportMessage" element
     */
    public com.cdiscount.www.FulfilmentActivationReportMessage addNewFulfilmentActivationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().add_element_user(FULFILMENTACTIVATIONREPORTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentActivationReportMessage" element
     */
    public void setNilFulfilmentActivationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationReportMessage target = null;
            target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().find_element_user(FULFILMENTACTIVATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().add_element_user(FULFILMENTACTIVATIONREPORTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
