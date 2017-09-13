/*
 * An XML document type.
 * Localname: Offer
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Offer(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Offer");
    
    
    /**
     * Gets the "Offer" element
     */
    public com.cdiscount.www.Offer getOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().find_element_user(OFFER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Offer" element
     */
    public boolean isNilOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().find_element_user(OFFER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Offer" element
     */
    public void setOffer(com.cdiscount.www.Offer offer)
    {
        generatedSetterHelperImpl(offer, OFFER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Offer" element
     */
    public com.cdiscount.www.Offer addNewOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().add_element_user(OFFER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Offer" element
     */
    public void setNilOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Offer target = null;
            target = (com.cdiscount.www.Offer)get_store().find_element_user(OFFER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Offer)get_store().add_element_user(OFFER$0);
            }
            target.setNil();
        }
    }
}
