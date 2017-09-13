/*
 * An XML document type.
 * Localname: ValidateOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidateOrder(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidateOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrder");
    
    
    /**
     * Gets the "ValidateOrder" element
     */
    public com.cdiscount.www.ValidateOrder getValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().find_element_user(VALIDATEORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidateOrder" element
     */
    public boolean isNilValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().find_element_user(VALIDATEORDER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidateOrder" element
     */
    public void setValidateOrder(com.cdiscount.www.ValidateOrder validateOrder)
    {
        generatedSetterHelperImpl(validateOrder, VALIDATEORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrder" element
     */
    public com.cdiscount.www.ValidateOrder addNewValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().add_element_user(VALIDATEORDER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidateOrder" element
     */
    public void setNilValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrder target = null;
            target = (com.cdiscount.www.ValidateOrder)get_store().find_element_user(VALIDATEORDER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidateOrder)get_store().add_element_user(VALIDATEORDER$0);
            }
            target.setNil();
        }
    }
}
