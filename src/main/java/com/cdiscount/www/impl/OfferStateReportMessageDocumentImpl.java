/*
 * An XML document type.
 * Localname: OfferStateReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferStateReportMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferStateReportMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferStateReportMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferStateReportMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferStateReportMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERSTATEREPORTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferStateReportMessage");
    
    
    /**
     * Gets the "OfferStateReportMessage" element
     */
    public com.cdiscount.www.OfferStateReportMessage getOfferStateReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateReportMessage target = null;
            target = (com.cdiscount.www.OfferStateReportMessage)get_store().find_element_user(OFFERSTATEREPORTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferStateReportMessage" element
     */
    public boolean isNilOfferStateReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateReportMessage target = null;
            target = (com.cdiscount.www.OfferStateReportMessage)get_store().find_element_user(OFFERSTATEREPORTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferStateReportMessage" element
     */
    public void setOfferStateReportMessage(com.cdiscount.www.OfferStateReportMessage offerStateReportMessage)
    {
        generatedSetterHelperImpl(offerStateReportMessage, OFFERSTATEREPORTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferStateReportMessage" element
     */
    public com.cdiscount.www.OfferStateReportMessage addNewOfferStateReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateReportMessage target = null;
            target = (com.cdiscount.www.OfferStateReportMessage)get_store().add_element_user(OFFERSTATEREPORTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferStateReportMessage" element
     */
    public void setNilOfferStateReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateReportMessage target = null;
            target = (com.cdiscount.www.OfferStateReportMessage)get_store().find_element_user(OFFERSTATEREPORTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferStateReportMessage)get_store().add_element_user(OFFERSTATEREPORTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
