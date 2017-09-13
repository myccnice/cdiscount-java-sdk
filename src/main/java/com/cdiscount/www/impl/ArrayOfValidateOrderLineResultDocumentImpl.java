/*
 * An XML document type.
 * Localname: ArrayOfValidateOrderLineResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrderLineResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfValidateOrderLineResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderLineResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrderLineResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderLineResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATEORDERLINERESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfValidateOrderLineResult");
    
    
    /**
     * Gets the "ArrayOfValidateOrderLineResult" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLineResult getArrayOfValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().find_element_user(ARRAYOFVALIDATEORDERLINERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValidateOrderLineResult" element
     */
    public boolean isNilArrayOfValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().find_element_user(ARRAYOFVALIDATEORDERLINERESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValidateOrderLineResult" element
     */
    public void setArrayOfValidateOrderLineResult(com.cdiscount.www.ArrayOfValidateOrderLineResult arrayOfValidateOrderLineResult)
    {
        generatedSetterHelperImpl(arrayOfValidateOrderLineResult, ARRAYOFVALIDATEORDERLINERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValidateOrderLineResult" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLineResult addNewArrayOfValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().add_element_user(ARRAYOFVALIDATEORDERLINERESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValidateOrderLineResult" element
     */
    public void setNilArrayOfValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().find_element_user(ARRAYOFVALIDATEORDERLINERESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().add_element_user(ARRAYOFVALIDATEORDERLINERESULT$0);
            }
            target.setNil();
        }
    }
}
