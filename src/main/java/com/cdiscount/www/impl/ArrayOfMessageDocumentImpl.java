/*
 * An XML document type.
 * Localname: ArrayOfMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfMessage");
    
    
    /**
     * Gets the "ArrayOfMessage" element
     */
    public com.cdiscount.www.ArrayOfMessage getArrayOfMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().find_element_user(ARRAYOFMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfMessage" element
     */
    public boolean isNilArrayOfMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().find_element_user(ARRAYOFMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfMessage" element
     */
    public void setArrayOfMessage(com.cdiscount.www.ArrayOfMessage arrayOfMessage)
    {
        generatedSetterHelperImpl(arrayOfMessage, ARRAYOFMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfMessage" element
     */
    public com.cdiscount.www.ArrayOfMessage addNewArrayOfMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().add_element_user(ARRAYOFMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfMessage" element
     */
    public void setNilArrayOfMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfMessage target = null;
            target = (com.cdiscount.www.ArrayOfMessage)get_store().find_element_user(ARRAYOFMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfMessage)get_store().add_element_user(ARRAYOFMESSAGE$0);
            }
            target.setNil();
        }
    }
}
