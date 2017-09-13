/*
 * An XML document type.
 * Localname: OfferQuestionFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferQuestionFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferQuestionFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferQuestionFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferQuestionFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferQuestionFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERQUESTIONFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferQuestionFilter");
    
    
    /**
     * Gets the "OfferQuestionFilter" element
     */
    public com.cdiscount.www.OfferQuestionFilter getOfferQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionFilter target = null;
            target = (com.cdiscount.www.OfferQuestionFilter)get_store().find_element_user(OFFERQUESTIONFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferQuestionFilter" element
     */
    public boolean isNilOfferQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionFilter target = null;
            target = (com.cdiscount.www.OfferQuestionFilter)get_store().find_element_user(OFFERQUESTIONFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferQuestionFilter" element
     */
    public void setOfferQuestionFilter(com.cdiscount.www.OfferQuestionFilter offerQuestionFilter)
    {
        generatedSetterHelperImpl(offerQuestionFilter, OFFERQUESTIONFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferQuestionFilter" element
     */
    public com.cdiscount.www.OfferQuestionFilter addNewOfferQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionFilter target = null;
            target = (com.cdiscount.www.OfferQuestionFilter)get_store().add_element_user(OFFERQUESTIONFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferQuestionFilter" element
     */
    public void setNilOfferQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionFilter target = null;
            target = (com.cdiscount.www.OfferQuestionFilter)get_store().find_element_user(OFFERQUESTIONFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferQuestionFilter)get_store().add_element_user(OFFERQUESTIONFILTER$0);
            }
            target.setNil();
        }
    }
}
