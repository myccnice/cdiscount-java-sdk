/*
 * An XML document type.
 * Localname: PriceAlignmentAction
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.PriceAlignmentActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one PriceAlignmentAction(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class PriceAlignmentActionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.PriceAlignmentActionDocument
{
    private static final long serialVersionUID = 1L;
    
    public PriceAlignmentActionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICEALIGNMENTACTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PriceAlignmentAction");
    
    
    /**
     * Gets the "PriceAlignmentAction" element
     */
    public com.cdiscount.www.PriceAlignmentAction.Enum getPriceAlignmentAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEALIGNMENTACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.PriceAlignmentAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PriceAlignmentAction" element
     */
    public com.cdiscount.www.PriceAlignmentAction xgetPriceAlignmentAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PriceAlignmentAction target = null;
            target = (com.cdiscount.www.PriceAlignmentAction)get_store().find_element_user(PRICEALIGNMENTACTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PriceAlignmentAction" element
     */
    public boolean isNilPriceAlignmentAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PriceAlignmentAction target = null;
            target = (com.cdiscount.www.PriceAlignmentAction)get_store().find_element_user(PRICEALIGNMENTACTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PriceAlignmentAction" element
     */
    public void setPriceAlignmentAction(com.cdiscount.www.PriceAlignmentAction.Enum priceAlignmentAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEALIGNMENTACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICEALIGNMENTACTION$0);
            }
            target.setEnumValue(priceAlignmentAction);
        }
    }
    
    /**
     * Sets (as xml) the "PriceAlignmentAction" element
     */
    public void xsetPriceAlignmentAction(com.cdiscount.www.PriceAlignmentAction priceAlignmentAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PriceAlignmentAction target = null;
            target = (com.cdiscount.www.PriceAlignmentAction)get_store().find_element_user(PRICEALIGNMENTACTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.PriceAlignmentAction)get_store().add_element_user(PRICEALIGNMENTACTION$0);
            }
            target.set(priceAlignmentAction);
        }
    }
    
    /**
     * Nils the "PriceAlignmentAction" element
     */
    public void setNilPriceAlignmentAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PriceAlignmentAction target = null;
            target = (com.cdiscount.www.PriceAlignmentAction)get_store().find_element_user(PRICEALIGNMENTACTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.PriceAlignmentAction)get_store().add_element_user(PRICEALIGNMENTACTION$0);
            }
            target.setNil();
        }
    }
}
