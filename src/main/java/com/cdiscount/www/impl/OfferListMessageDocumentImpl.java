/*
 * An XML document type.
 * Localname: OfferListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferListMessage");
    
    
    /**
     * Gets the "OfferListMessage" element
     */
    public com.cdiscount.www.OfferListMessage getOfferListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListMessage target = null;
            target = (com.cdiscount.www.OfferListMessage)get_store().find_element_user(OFFERLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferListMessage" element
     */
    public boolean isNilOfferListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListMessage target = null;
            target = (com.cdiscount.www.OfferListMessage)get_store().find_element_user(OFFERLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferListMessage" element
     */
    public void setOfferListMessage(com.cdiscount.www.OfferListMessage offerListMessage)
    {
        generatedSetterHelperImpl(offerListMessage, OFFERLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferListMessage" element
     */
    public com.cdiscount.www.OfferListMessage addNewOfferListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListMessage target = null;
            target = (com.cdiscount.www.OfferListMessage)get_store().add_element_user(OFFERLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferListMessage" element
     */
    public void setNilOfferListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListMessage target = null;
            target = (com.cdiscount.www.OfferListMessage)get_store().find_element_user(OFFERLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferListMessage)get_store().add_element_user(OFFERLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
