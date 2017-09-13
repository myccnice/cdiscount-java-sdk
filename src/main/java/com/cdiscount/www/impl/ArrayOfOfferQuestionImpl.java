/*
 * XML Type:  ArrayOfOfferQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferQuestion
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOfferQuestion(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOfferQuestionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferQuestion
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferQuestionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERQUESTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferQuestion");
    
    
    /**
     * Gets array of all "OfferQuestion" elements
     */
    public com.cdiscount.www.OfferQuestion[] getOfferQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFERQUESTION$0, targetList);
            com.cdiscount.www.OfferQuestion[] result = new com.cdiscount.www.OfferQuestion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OfferQuestion" element
     */
    public com.cdiscount.www.OfferQuestion getOfferQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().find_element_user(OFFERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OfferQuestion" element
     */
    public boolean isNilOfferQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().find_element_user(OFFERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OfferQuestion" element
     */
    public int sizeOfOfferQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERQUESTION$0);
        }
    }
    
    /**
     * Sets array of all "OfferQuestion" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOfferQuestionArray(com.cdiscount.www.OfferQuestion[] offerQuestionArray)
    {
        check_orphaned();
        arraySetterHelper(offerQuestionArray, OFFERQUESTION$0);
    }
    
    /**
     * Sets ith "OfferQuestion" element
     */
    public void setOfferQuestionArray(int i, com.cdiscount.www.OfferQuestion offerQuestion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().find_element_user(OFFERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offerQuestion);
        }
    }
    
    /**
     * Nils the ith "OfferQuestion" element
     */
    public void setNilOfferQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().find_element_user(OFFERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OfferQuestion" element
     */
    public com.cdiscount.www.OfferQuestion insertNewOfferQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferQuestion target = null;
            target = (com.cdiscount.www.OfferQuestion)get_store().insert_element_user(OFFERQUESTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OfferQuestion" element
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
     * Removes the ith "OfferQuestion" element
     */
    public void removeOfferQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERQUESTION$0, i);
        }
    }
}
