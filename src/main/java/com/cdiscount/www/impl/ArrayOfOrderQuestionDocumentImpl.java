/*
 * An XML document type.
 * Localname: ArrayOfOrderQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderQuestionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOrderQuestion(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOrderQuestionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderQuestionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderQuestionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORDERQUESTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOrderQuestion");
    
    
    /**
     * Gets the "ArrayOfOrderQuestion" element
     */
    public com.cdiscount.www.ArrayOfOrderQuestion getArrayOfOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().find_element_user(ARRAYOFORDERQUESTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOrderQuestion" element
     */
    public boolean isNilArrayOfOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().find_element_user(ARRAYOFORDERQUESTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOrderQuestion" element
     */
    public void setArrayOfOrderQuestion(com.cdiscount.www.ArrayOfOrderQuestion arrayOfOrderQuestion)
    {
        generatedSetterHelperImpl(arrayOfOrderQuestion, ARRAYOFORDERQUESTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOrderQuestion" element
     */
    public com.cdiscount.www.ArrayOfOrderQuestion addNewArrayOfOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().add_element_user(ARRAYOFORDERQUESTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOrderQuestion" element
     */
    public void setNilArrayOfOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().find_element_user(ARRAYOFORDERQUESTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().add_element_user(ARRAYOFORDERQUESTION$0);
            }
            target.setNil();
        }
    }
}
