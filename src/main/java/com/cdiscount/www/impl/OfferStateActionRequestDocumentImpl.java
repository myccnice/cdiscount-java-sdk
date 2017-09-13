/*
 * An XML document type.
 * Localname: OfferStateActionRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferStateActionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferStateActionRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferStateActionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferStateActionRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferStateActionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERSTATEACTIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferStateActionRequest");
    
    
    /**
     * Gets the "OfferStateActionRequest" element
     */
    public com.cdiscount.www.OfferStateActionRequest getOfferStateActionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateActionRequest target = null;
            target = (com.cdiscount.www.OfferStateActionRequest)get_store().find_element_user(OFFERSTATEACTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferStateActionRequest" element
     */
    public boolean isNilOfferStateActionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateActionRequest target = null;
            target = (com.cdiscount.www.OfferStateActionRequest)get_store().find_element_user(OFFERSTATEACTIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferStateActionRequest" element
     */
    public void setOfferStateActionRequest(com.cdiscount.www.OfferStateActionRequest offerStateActionRequest)
    {
        generatedSetterHelperImpl(offerStateActionRequest, OFFERSTATEACTIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferStateActionRequest" element
     */
    public com.cdiscount.www.OfferStateActionRequest addNewOfferStateActionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateActionRequest target = null;
            target = (com.cdiscount.www.OfferStateActionRequest)get_store().add_element_user(OFFERSTATEACTIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferStateActionRequest" element
     */
    public void setNilOfferStateActionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateActionRequest target = null;
            target = (com.cdiscount.www.OfferStateActionRequest)get_store().find_element_user(OFFERSTATEACTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferStateActionRequest)get_store().add_element_user(OFFERSTATEACTIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
