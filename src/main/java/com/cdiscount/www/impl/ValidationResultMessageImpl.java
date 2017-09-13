/*
 * XML Type:  ValidationResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidationResultMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ValidationResultMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ValidationResultMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.ValidationResultMessage
{
    private static final long serialVersionUID = 1L;
    
    public ValidationResultMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERRESULTS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderResults");
    
    
    /**
     * Gets the "ValidateOrderResults" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderResult getValidateOrderResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidateOrderResults" element
     */
    public boolean isNilValidateOrderResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ValidateOrderResults" element
     */
    public boolean isSetValidateOrderResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEORDERRESULTS$0) != 0;
        }
    }
    
    /**
     * Sets the "ValidateOrderResults" element
     */
    public void setValidateOrderResults(com.cdiscount.www.ArrayOfValidateOrderResult validateOrderResults)
    {
        generatedSetterHelperImpl(validateOrderResults, VALIDATEORDERRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderResults" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderResult addNewValidateOrderResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().add_element_user(VALIDATEORDERRESULTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidateOrderResults" element
     */
    public void setNilValidateOrderResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().find_element_user(VALIDATEORDERRESULTS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrderResult)get_store().add_element_user(VALIDATEORDERRESULTS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ValidateOrderResults" element
     */
    public void unsetValidateOrderResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEORDERRESULTS$0, 0);
        }
    }
}
