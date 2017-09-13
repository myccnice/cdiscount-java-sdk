/*
 * An XML document type.
 * Localname: OfferSortOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferSortOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferSortOrder(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferSortOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferSortOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferSortOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERSORTORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferSortOrder");
    
    
    /**
     * Gets the "OfferSortOrder" element
     */
    public com.cdiscount.www.OfferSortOrder.Enum getOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSORTORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OfferSortOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferSortOrder" element
     */
    public com.cdiscount.www.OfferSortOrder xgetOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferSortOrder" element
     */
    public boolean isNilOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferSortOrder" element
     */
    public void setOfferSortOrder(com.cdiscount.www.OfferSortOrder.Enum offerSortOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSORTORDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERSORTORDER$0);
            }
            target.setEnumValue(offerSortOrder);
        }
    }
    
    /**
     * Sets (as xml) the "OfferSortOrder" element
     */
    public void xsetOfferSortOrder(com.cdiscount.www.OfferSortOrder offerSortOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferSortOrder)get_store().add_element_user(OFFERSORTORDER$0);
            }
            target.set(offerSortOrder);
        }
    }
    
    /**
     * Nils the "OfferSortOrder" element
     */
    public void setNilOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferSortOrder)get_store().add_element_user(OFFERSORTORDER$0);
            }
            target.setNil();
        }
    }
}
