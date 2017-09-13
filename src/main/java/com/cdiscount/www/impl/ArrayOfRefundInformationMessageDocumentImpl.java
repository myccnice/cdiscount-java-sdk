/*
 * An XML document type.
 * Localname: ArrayOfRefundInformationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfRefundInformationMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfRefundInformationMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfRefundInformationMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfRefundInformationMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRefundInformationMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFREFUNDINFORMATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfRefundInformationMessage");
    
    
    /**
     * Gets the "ArrayOfRefundInformationMessage" element
     */
    public com.cdiscount.www.ArrayOfRefundInformationMessage getArrayOfRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().find_element_user(ARRAYOFREFUNDINFORMATIONMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRefundInformationMessage" element
     */
    public boolean isNilArrayOfRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().find_element_user(ARRAYOFREFUNDINFORMATIONMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRefundInformationMessage" element
     */
    public void setArrayOfRefundInformationMessage(com.cdiscount.www.ArrayOfRefundInformationMessage arrayOfRefundInformationMessage)
    {
        generatedSetterHelperImpl(arrayOfRefundInformationMessage, ARRAYOFREFUNDINFORMATIONMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRefundInformationMessage" element
     */
    public com.cdiscount.www.ArrayOfRefundInformationMessage addNewArrayOfRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().add_element_user(ARRAYOFREFUNDINFORMATIONMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRefundInformationMessage" element
     */
    public void setNilArrayOfRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().find_element_user(ARRAYOFREFUNDINFORMATIONMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().add_element_user(ARRAYOFREFUNDINFORMATIONMESSAGE$0);
            }
            target.setNil();
        }
    }
}
