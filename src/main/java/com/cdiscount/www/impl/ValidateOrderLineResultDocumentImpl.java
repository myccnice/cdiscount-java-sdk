/*
 * An XML document type.
 * Localname: ValidateOrderLineResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderLineResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidateOrderLineResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidateOrderLineResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderLineResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderLineResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERLINERESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderLineResult");
    
    
    /**
     * Gets the "ValidateOrderLineResult" element
     */
    public com.cdiscount.www.ValidateOrderLineResult getValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidateOrderLineResult" element
     */
    public boolean isNilValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidateOrderLineResult" element
     */
    public void setValidateOrderLineResult(com.cdiscount.www.ValidateOrderLineResult validateOrderLineResult)
    {
        generatedSetterHelperImpl(validateOrderLineResult, VALIDATEORDERLINERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderLineResult" element
     */
    public com.cdiscount.www.ValidateOrderLineResult addNewValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().add_element_user(VALIDATEORDERLINERESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidateOrderLineResult" element
     */
    public void setNilValidateOrderLineResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidateOrderLineResult)get_store().add_element_user(VALIDATEORDERLINERESULT$0);
            }
            target.setNil();
        }
    }
}
