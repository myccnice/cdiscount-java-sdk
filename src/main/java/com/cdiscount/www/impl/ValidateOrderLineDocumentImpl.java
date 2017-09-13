/*
 * An XML document type.
 * Localname: ValidateOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidateOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidateOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderLine");
    
    
    /**
     * Gets the "ValidateOrderLine" element
     */
    public com.cdiscount.www.ValidateOrderLine getValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().find_element_user(VALIDATEORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidateOrderLine" element
     */
    public boolean isNilValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().find_element_user(VALIDATEORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidateOrderLine" element
     */
    public void setValidateOrderLine(com.cdiscount.www.ValidateOrderLine validateOrderLine)
    {
        generatedSetterHelperImpl(validateOrderLine, VALIDATEORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderLine" element
     */
    public com.cdiscount.www.ValidateOrderLine addNewValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().add_element_user(VALIDATEORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidateOrderLine" element
     */
    public void setNilValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderLine target = null;
            target = (com.cdiscount.www.ValidateOrderLine)get_store().find_element_user(VALIDATEORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidateOrderLine)get_store().add_element_user(VALIDATEORDERLINE$0);
            }
            target.setNil();
        }
    }
}
