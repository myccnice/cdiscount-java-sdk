/*
 * XML Type:  ValidateOrderResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ValidateOrderResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ValidateOrderResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderResult
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Errors");
    private static final javax.xml.namespace.QName ORDERNUMBER$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumber");
    private static final javax.xml.namespace.QName VALIDATEORDERLINERESULTS$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderLineResults");
    private static final javax.xml.namespace.QName VALIDATED$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Validated");
    private static final javax.xml.namespace.QName WARNINGS$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Warnings");
    
    
    /**
     * Gets the "Errors" element
     */
    public com.cdiscount.www.ArrayOfError getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Errors" element
     */
    public boolean isNilErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Errors" element
     */
    public boolean isSetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORS$0) != 0;
        }
    }
    
    /**
     * Sets the "Errors" element
     */
    public void setErrors(com.cdiscount.www.ArrayOfError errors)
    {
        generatedSetterHelperImpl(errors, ERRORS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Errors" element
     */
    public com.cdiscount.www.ArrayOfError addNewErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ERRORS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Errors" element
     */
    public void setNilErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ERRORS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Errors" element
     */
    public void unsetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORS$0, 0);
        }
    }
    
    /**
     * Gets the "OrderNumber" element
     */
    public java.lang.String getOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderNumber" element
     */
    public boolean isNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderNumber" element
     */
    public boolean isSetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERNUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "OrderNumber" element
     */
    public void setOrderNumber(java.lang.String orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$2);
            }
            target.setStringValue(orderNumber);
        }
    }
    
    /**
     * Sets (as xml) the "OrderNumber" element
     */
    public void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$2);
            }
            target.set(orderNumber);
        }
    }
    
    /**
     * Nils the "OrderNumber" element
     */
    public void setNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderNumber" element
     */
    public void unsetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERNUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "ValidateOrderLineResults" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLineResult getValidateOrderLineResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidateOrderLineResults" element
     */
    public boolean isNilValidateOrderLineResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULTS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ValidateOrderLineResults" element
     */
    public boolean isSetValidateOrderLineResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATEORDERLINERESULTS$4) != 0;
        }
    }
    
    /**
     * Sets the "ValidateOrderLineResults" element
     */
    public void setValidateOrderLineResults(com.cdiscount.www.ArrayOfValidateOrderLineResult validateOrderLineResults)
    {
        generatedSetterHelperImpl(validateOrderLineResults, VALIDATEORDERLINERESULTS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderLineResults" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLineResult addNewValidateOrderLineResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().add_element_user(VALIDATEORDERLINERESULTS$4);
            return target;
        }
    }
    
    /**
     * Nils the "ValidateOrderLineResults" element
     */
    public void setNilValidateOrderLineResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLineResult target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().find_element_user(VALIDATEORDERLINERESULTS$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrderLineResult)get_store().add_element_user(VALIDATEORDERLINERESULTS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ValidateOrderLineResults" element
     */
    public void unsetValidateOrderLineResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATEORDERLINERESULTS$4, 0);
        }
    }
    
    /**
     * Gets the "Validated" element
     */
    public boolean getValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Validated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Validated" element
     */
    public boolean isSetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATED$6) != 0;
        }
    }
    
    /**
     * Sets the "Validated" element
     */
    public void setValidated(boolean validated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATED$6);
            }
            target.setBooleanValue(validated);
        }
    }
    
    /**
     * Sets (as xml) the "Validated" element
     */
    public void xsetValidated(org.apache.xmlbeans.XmlBoolean validated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALIDATED$6);
            }
            target.set(validated);
        }
    }
    
    /**
     * Unsets the "Validated" element
     */
    public void unsetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATED$6, 0);
        }
    }
    
    /**
     * Gets the "Warnings" element
     */
    public com.cdiscount.www.ArrayOfError getWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(WARNINGS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Warnings" element
     */
    public boolean isNilWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(WARNINGS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Warnings" element
     */
    public boolean isSetWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WARNINGS$8) != 0;
        }
    }
    
    /**
     * Sets the "Warnings" element
     */
    public void setWarnings(com.cdiscount.www.ArrayOfError warnings)
    {
        generatedSetterHelperImpl(warnings, WARNINGS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Warnings" element
     */
    public com.cdiscount.www.ArrayOfError addNewWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(WARNINGS$8);
            return target;
        }
    }
    
    /**
     * Nils the "Warnings" element
     */
    public void setNilWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(WARNINGS$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(WARNINGS$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Warnings" element
     */
    public void unsetWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WARNINGS$8, 0);
        }
    }
}
