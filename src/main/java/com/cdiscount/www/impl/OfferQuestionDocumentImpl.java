/*
 * An XML document type.
 * Localname: OfferQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferQuestionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferQuestion(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferQuestionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferQuestionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferQuestionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERQUESTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferQuestion");
    
    
    /**
     * Gets the "OfferQuestion" element
     */
    public com.cdiscount.www.OfferQuestion getOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().find_element_user(OFFERQUESTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferQuestion" element
     */
    public boolean isNilOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().find_element_user(OFFERQUESTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferQuestion" element
     */
    public void setOfferQuestion(com.cdiscount.www.OfferQuestion offerQuestion)
    {
        generatedSetterHelperImpl(offerQuestion, OFFERQUESTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferQuestion" element
     */
    public com.cdiscount.www.OfferQuestion addNewOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().add_element_user(OFFERQUESTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferQuestion" element
     */
    public void setNilOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().find_element_user(OFFERQUESTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferQuestion)get_store().add_element_user(OFFERQUESTION$0);
            }
            target.setNil();
        }
    }
}
