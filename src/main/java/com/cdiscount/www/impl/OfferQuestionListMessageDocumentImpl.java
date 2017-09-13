/*
 * An XML document type.
 * Localname: OfferQuestionListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferQuestionListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferQuestionListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferQuestionListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferQuestionListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferQuestionListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERQUESTIONLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferQuestionListMessage");
    
    
    /**
     * Gets the "OfferQuestionListMessage" element
     */
    public com.cdiscount.www.OfferQuestionListMessage getOfferQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionListMessage target = null;
            target = (com.cdiscount.www.OfferQuestionListMessage)get_store().find_element_user(OFFERQUESTIONLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferQuestionListMessage" element
     */
    public boolean isNilOfferQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionListMessage target = null;
            target = (com.cdiscount.www.OfferQuestionListMessage)get_store().find_element_user(OFFERQUESTIONLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferQuestionListMessage" element
     */
    public void setOfferQuestionListMessage(com.cdiscount.www.OfferQuestionListMessage offerQuestionListMessage)
    {
        generatedSetterHelperImpl(offerQuestionListMessage, OFFERQUESTIONLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferQuestionListMessage" element
     */
    public com.cdiscount.www.OfferQuestionListMessage addNewOfferQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionListMessage target = null;
            target = (com.cdiscount.www.OfferQuestionListMessage)get_store().add_element_user(OFFERQUESTIONLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferQuestionListMessage" element
     */
    public void setNilOfferQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestionListMessage target = null;
            target = (com.cdiscount.www.OfferQuestionListMessage)get_store().find_element_user(OFFERQUESTIONLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferQuestionListMessage)get_store().add_element_user(OFFERQUESTIONLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
