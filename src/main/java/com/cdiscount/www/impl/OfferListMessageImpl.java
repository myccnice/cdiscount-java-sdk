/*
 * XML Type:  OfferListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.OfferListMessage
{
    private static final long serialVersionUID = 1L;
    
    public OfferListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferList");
    
    
    /**
     * Gets the "OfferList" element
     */
    public com.cdiscount.www.ArrayOfOffer getOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().find_element_user(OFFERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferList" element
     */
    public boolean isNilOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().find_element_user(OFFERLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferList" element
     */
    public boolean isSetOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "OfferList" element
     */
    public void setOfferList(com.cdiscount.www.ArrayOfOffer offerList)
    {
        generatedSetterHelperImpl(offerList, OFFERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferList" element
     */
    public com.cdiscount.www.ArrayOfOffer addNewOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().add_element_user(OFFERLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferList" element
     */
    public void setNilOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().find_element_user(OFFERLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOffer)get_store().add_element_user(OFFERLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferList" element
     */
    public void unsetOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERLIST$0, 0);
        }
    }
}
