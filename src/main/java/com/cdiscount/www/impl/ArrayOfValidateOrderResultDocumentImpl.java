/*
 * An XML document type.
 * Localname: ArrayOfValidateOrderResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrderResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfValidateOrderResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrderResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATEORDERRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfValidateOrderResult");
    
    
    /**
     * Gets the "ArrayOfValidateOrderResult" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderResult getArrayOfValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().find_element_user(ARRAYOFVALIDATEORDERRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValidateOrderResult" element
     */
    public boolean isNilArrayOfValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().find_element_user(ARRAYOFVALIDATEORDERRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValidateOrderResult" element
     */
    public void setArrayOfValidateOrderResult(com.cdiscount.www.ArrayOfValidateOrderResult arrayOfValidateOrderResult)
    {
        generatedSetterHelperImpl(arrayOfValidateOrderResult, ARRAYOFVALIDATEORDERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValidateOrderResult" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderResult addNewArrayOfValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().add_element_user(ARRAYOFVALIDATEORDERRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValidateOrderResult" element
     */
    public void setNilArrayOfValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().find_element_user(ARRAYOFVALIDATEORDERRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().add_element_user(ARRAYOFVALIDATEORDERRESULT$0);
            }
            target.setNil();
        }
    }
}
