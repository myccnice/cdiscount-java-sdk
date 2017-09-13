/*
 * XML Type:  OfferQuestionListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferQuestionListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferQuestionListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferQuestionListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.OfferQuestionListMessage
{
    private static final long serialVersionUID = 1L;
    
    public OfferQuestionListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERQUESTIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferQuestionList");
    
    
    /**
     * Gets the "OfferQuestionList" element
     */
    public com.cdiscount.www.ArrayOfOfferQuestion getOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().find_element_user(OFFERQUESTIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferQuestionList" element
     */
    public boolean isNilOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().find_element_user(OFFERQUESTIONLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferQuestionList" element
     */
    public boolean isSetOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERQUESTIONLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "OfferQuestionList" element
     */
    public void setOfferQuestionList(com.cdiscount.www.ArrayOfOfferQuestion offerQuestionList)
    {
        generatedSetterHelperImpl(offerQuestionList, OFFERQUESTIONLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferQuestionList" element
     */
    public com.cdiscount.www.ArrayOfOfferQuestion addNewOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().add_element_user(OFFERQUESTIONLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferQuestionList" element
     */
    public void setNilOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().find_element_user(OFFERQUESTIONLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().add_element_user(OFFERQUESTIONLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferQuestionList" element
     */
    public void unsetOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERQUESTIONLIST$0, 0);
        }
    }
}
