/*
 * An XML document type.
 * Localname: OfferPriceBenchMark
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferPriceBenchMarkDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferPriceBenchMark(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferPriceBenchMarkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferPriceBenchMarkDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferPriceBenchMarkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERPRICEBENCHMARK$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPriceBenchMark");
    
    
    /**
     * Gets the "OfferPriceBenchMark" element
     */
    public com.cdiscount.www.OfferPriceBenchMark getOfferPriceBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().find_element_user(OFFERPRICEBENCHMARK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferPriceBenchMark" element
     */
    public boolean isNilOfferPriceBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().find_element_user(OFFERPRICEBENCHMARK$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferPriceBenchMark" element
     */
    public void setOfferPriceBenchMark(com.cdiscount.www.OfferPriceBenchMark offerPriceBenchMark)
    {
        generatedSetterHelperImpl(offerPriceBenchMark, OFFERPRICEBENCHMARK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferPriceBenchMark" element
     */
    public com.cdiscount.www.OfferPriceBenchMark addNewOfferPriceBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().add_element_user(OFFERPRICEBENCHMARK$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferPriceBenchMark" element
     */
    public void setNilOfferPriceBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().find_element_user(OFFERPRICEBENCHMARK$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferPriceBenchMark)get_store().add_element_user(OFFERPRICEBENCHMARK$0);
            }
            target.setNil();
        }
    }
}
