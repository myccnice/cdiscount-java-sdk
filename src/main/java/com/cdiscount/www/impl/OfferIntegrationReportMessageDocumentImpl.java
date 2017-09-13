/*
 * An XML document type.
 * Localname: OfferIntegrationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferIntegrationReportMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferIntegrationReportMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferIntegrationReportMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferIntegrationReportMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferIntegrationReportMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERINTEGRATIONREPORTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferIntegrationReportMessage");
    
    
    /**
     * Gets the "OfferIntegrationReportMessage" element
     */
    public com.cdiscount.www.OfferIntegrationReportMessage getOfferIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferIntegrationReportMessage target = null;
            target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(OFFERINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferIntegrationReportMessage" element
     */
    public boolean isNilOfferIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferIntegrationReportMessage target = null;
            target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(OFFERINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferIntegrationReportMessage" element
     */
    public void setOfferIntegrationReportMessage(com.cdiscount.www.OfferIntegrationReportMessage offerIntegrationReportMessage)
    {
        generatedSetterHelperImpl(offerIntegrationReportMessage, OFFERINTEGRATIONREPORTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferIntegrationReportMessage" element
     */
    public com.cdiscount.www.OfferIntegrationReportMessage addNewOfferIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferIntegrationReportMessage target = null;
            target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().add_element_user(OFFERINTEGRATIONREPORTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferIntegrationReportMessage" element
     */
    public void setNilOfferIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferIntegrationReportMessage target = null;
            target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(OFFERINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().add_element_user(OFFERINTEGRATIONREPORTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
