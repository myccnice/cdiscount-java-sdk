/*
 * An XML document type.
 * Localname: OfferFilterCriterion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferFilterCriterionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferFilterCriterion(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferFilterCriterionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferFilterCriterionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferFilterCriterionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERFILTERCRITERION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferFilterCriterion");
    
    
    /**
     * Gets the "OfferFilterCriterion" element
     */
    public com.cdiscount.www.OfferFilterCriterion.Enum getOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OfferFilterCriterion.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferFilterCriterion" element
     */
    public com.cdiscount.www.OfferFilterCriterion xgetOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferFilterCriterion" element
     */
    public boolean isNilOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferFilterCriterion" element
     */
    public void setOfferFilterCriterion(com.cdiscount.www.OfferFilterCriterion.Enum offerFilterCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERFILTERCRITERION$0);
            }
            target.setEnumValue(offerFilterCriterion);
        }
    }
    
    /**
     * Sets (as xml) the "OfferFilterCriterion" element
     */
    public void xsetOfferFilterCriterion(com.cdiscount.www.OfferFilterCriterion offerFilterCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferFilterCriterion)get_store().add_element_user(OFFERFILTERCRITERION$0);
            }
            target.set(offerFilterCriterion);
        }
    }
    
    /**
     * Nils the "OfferFilterCriterion" element
     */
    public void setNilOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferFilterCriterion)get_store().add_element_user(OFFERFILTERCRITERION$0);
            }
            target.setNil();
        }
    }
}
