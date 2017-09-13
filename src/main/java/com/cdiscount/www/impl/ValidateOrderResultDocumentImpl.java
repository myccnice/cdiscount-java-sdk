/*
 * An XML document type.
 * Localname: ValidateOrderResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidateOrderResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidateOrderResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderResult");
    
    
    /**
     * Gets the "ValidateOrderResult" element
     */
    public com.cdiscount.www.ValidateOrderResult getValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidateOrderResult" element
     */
    public boolean isNilValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidateOrderResult" element
     */
    public void setValidateOrderResult(com.cdiscount.www.ValidateOrderResult validateOrderResult)
    {
        generatedSetterHelperImpl(validateOrderResult, VALIDATEORDERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderResult" element
     */
    public com.cdiscount.www.ValidateOrderResult addNewValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().add_element_user(VALIDATEORDERRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidateOrderResult" element
     */
    public void setNilValidateOrderResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderResult target = null;
            target = (com.cdiscount.www.ValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidateOrderResult)get_store().add_element_user(VALIDATEORDERRESULT$0);
            }
            target.setNil();
        }
    }
}
