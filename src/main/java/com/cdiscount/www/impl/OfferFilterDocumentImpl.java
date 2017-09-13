/*
 * An XML document type.
 * Localname: OfferFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferFilter");
    
    
    /**
     * Gets the "OfferFilter" element
     */
    public com.cdiscount.www.OfferFilter getOfferFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilter target = null;
            target = (com.cdiscount.www.OfferFilter)get_store().find_element_user(OFFERFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferFilter" element
     */
    public boolean isNilOfferFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilter target = null;
            target = (com.cdiscount.www.OfferFilter)get_store().find_element_user(OFFERFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferFilter" element
     */
    public void setOfferFilter(com.cdiscount.www.OfferFilter offerFilter)
    {
        generatedSetterHelperImpl(offerFilter, OFFERFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferFilter" element
     */
    public com.cdiscount.www.OfferFilter addNewOfferFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilter target = null;
            target = (com.cdiscount.www.OfferFilter)get_store().add_element_user(OFFERFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferFilter" element
     */
    public void setNilOfferFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilter target = null;
            target = (com.cdiscount.www.OfferFilter)get_store().find_element_user(OFFERFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferFilter)get_store().add_element_user(OFFERFILTER$0);
            }
            target.setNil();
        }
    }
}
