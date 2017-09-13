/*
 * An XML document type.
 * Localname: ArrayOfOfferQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferQuestionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOfferQuestion(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOfferQuestionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferQuestionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferQuestionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOFFERQUESTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOfferQuestion");
    
    
    /**
     * Gets the "ArrayOfOfferQuestion" element
     */
    public com.cdiscount.www.ArrayOfOfferQuestion getArrayOfOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().find_element_user(ARRAYOFOFFERQUESTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOfferQuestion" element
     */
    public boolean isNilArrayOfOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().find_element_user(ARRAYOFOFFERQUESTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOfferQuestion" element
     */
    public void setArrayOfOfferQuestion(com.cdiscount.www.ArrayOfOfferQuestion arrayOfOfferQuestion)
    {
        generatedSetterHelperImpl(arrayOfOfferQuestion, ARRAYOFOFFERQUESTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOfferQuestion" element
     */
    public com.cdiscount.www.ArrayOfOfferQuestion addNewArrayOfOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().add_element_user(ARRAYOFOFFERQUESTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOfferQuestion" element
     */
    public void setNilArrayOfOfferQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().find_element_user(ARRAYOFOFFERQUESTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferQuestion)get_store().add_element_user(ARRAYOFOFFERQUESTION$0);
            }
            target.setNil();
        }
    }
}
