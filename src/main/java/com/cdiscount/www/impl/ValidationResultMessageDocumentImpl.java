/*
 * An XML document type.
 * Localname: ValidationResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidationResultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidationResultMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidationResultMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidationResultMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidationResultMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONRESULTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidationResultMessage");
    
    
    /**
     * Gets the "ValidationResultMessage" element
     */
    public com.cdiscount.www.ValidationResultMessage getValidationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationResultMessage target = null;
            target = (com.cdiscount.www.ValidationResultMessage)get_store().find_element_user(VALIDATIONRESULTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidationResultMessage" element
     */
    public boolean isNilValidationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationResultMessage target = null;
            target = (com.cdiscount.www.ValidationResultMessage)get_store().find_element_user(VALIDATIONRESULTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidationResultMessage" element
     */
    public void setValidationResultMessage(com.cdiscount.www.ValidationResultMessage validationResultMessage)
    {
        generatedSetterHelperImpl(validationResultMessage, VALIDATIONRESULTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidationResultMessage" element
     */
    public com.cdiscount.www.ValidationResultMessage addNewValidationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationResultMessage target = null;
            target = (com.cdiscount.www.ValidationResultMessage)get_store().add_element_user(VALIDATIONRESULTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidationResultMessage" element
     */
    public void setNilValidationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationResultMessage target = null;
            target = (com.cdiscount.www.ValidationResultMessage)get_store().find_element_user(VALIDATIONRESULTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidationResultMessage)get_store().add_element_user(VALIDATIONRESULTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
