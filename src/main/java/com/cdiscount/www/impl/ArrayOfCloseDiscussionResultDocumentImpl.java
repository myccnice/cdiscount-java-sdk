/*
 * An XML document type.
 * Localname: ArrayOfCloseDiscussionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfCloseDiscussionResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfCloseDiscussionResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfCloseDiscussionResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfCloseDiscussionResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCloseDiscussionResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCLOSEDISCUSSIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfCloseDiscussionResult");
    
    
    /**
     * Gets the "ArrayOfCloseDiscussionResult" element
     */
    public com.cdiscount.www.ArrayOfCloseDiscussionResult getArrayOfCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().find_element_user(ARRAYOFCLOSEDISCUSSIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfCloseDiscussionResult" element
     */
    public boolean isNilArrayOfCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().find_element_user(ARRAYOFCLOSEDISCUSSIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfCloseDiscussionResult" element
     */
    public void setArrayOfCloseDiscussionResult(com.cdiscount.www.ArrayOfCloseDiscussionResult arrayOfCloseDiscussionResult)
    {
        generatedSetterHelperImpl(arrayOfCloseDiscussionResult, ARRAYOFCLOSEDISCUSSIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfCloseDiscussionResult" element
     */
    public com.cdiscount.www.ArrayOfCloseDiscussionResult addNewArrayOfCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().add_element_user(ARRAYOFCLOSEDISCUSSIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfCloseDiscussionResult" element
     */
    public void setNilArrayOfCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().find_element_user(ARRAYOFCLOSEDISCUSSIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().add_element_user(ARRAYOFCLOSEDISCUSSIONRESULT$0);
            }
            target.setNil();
        }
    }
}
