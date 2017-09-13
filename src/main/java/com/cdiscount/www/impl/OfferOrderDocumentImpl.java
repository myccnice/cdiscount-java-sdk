/*
 * An XML document type.
 * Localname: OfferOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferOrder(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferOrder");
    
    
    /**
     * Gets the "OfferOrder" element
     */
    public com.cdiscount.www.OfferOrder getOfferOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().find_element_user(OFFERORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferOrder" element
     */
    public boolean isNilOfferOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().find_element_user(OFFERORDER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferOrder" element
     */
    public void setOfferOrder(com.cdiscount.www.OfferOrder offerOrder)
    {
        generatedSetterHelperImpl(offerOrder, OFFERORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferOrder" element
     */
    public com.cdiscount.www.OfferOrder addNewOfferOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().add_element_user(OFFERORDER$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferOrder" element
     */
    public void setNilOfferOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferOrder target = null;
            target = (com.cdiscount.www.OfferOrder)get_store().find_element_user(OFFERORDER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferOrder)get_store().add_element_user(OFFERORDER$0);
            }
            target.setNil();
        }
    }
}
