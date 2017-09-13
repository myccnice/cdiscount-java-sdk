/*
 * An XML document type.
 * Localname: OfferListPaginatedMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferListPaginatedMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferListPaginatedMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferListPaginatedMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferListPaginatedMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferListPaginatedMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERLISTPAGINATEDMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferListPaginatedMessage");
    
    
    /**
     * Gets the "OfferListPaginatedMessage" element
     */
    public com.cdiscount.www.OfferListPaginatedMessage getOfferListPaginatedMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListPaginatedMessage target = null;
            target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().find_element_user(OFFERLISTPAGINATEDMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferListPaginatedMessage" element
     */
    public boolean isNilOfferListPaginatedMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListPaginatedMessage target = null;
            target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().find_element_user(OFFERLISTPAGINATEDMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferListPaginatedMessage" element
     */
    public void setOfferListPaginatedMessage(com.cdiscount.www.OfferListPaginatedMessage offerListPaginatedMessage)
    {
        generatedSetterHelperImpl(offerListPaginatedMessage, OFFERLISTPAGINATEDMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferListPaginatedMessage" element
     */
    public com.cdiscount.www.OfferListPaginatedMessage addNewOfferListPaginatedMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListPaginatedMessage target = null;
            target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().add_element_user(OFFERLISTPAGINATEDMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferListPaginatedMessage" element
     */
    public void setNilOfferListPaginatedMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferListPaginatedMessage target = null;
            target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().find_element_user(OFFERLISTPAGINATEDMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().add_element_user(OFFERLISTPAGINATEDMESSAGE$0);
            }
            target.setNil();
        }
    }
}
