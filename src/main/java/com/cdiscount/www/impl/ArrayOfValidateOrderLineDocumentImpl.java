/*
 * An XML document type.
 * Localname: ArrayOfValidateOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfValidateOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATEORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfValidateOrderLine");
    
    
    /**
     * Gets the "ArrayOfValidateOrderLine" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLine getArrayOfValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().find_element_user(ARRAYOFVALIDATEORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValidateOrderLine" element
     */
    public boolean isNilArrayOfValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().find_element_user(ARRAYOFVALIDATEORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValidateOrderLine" element
     */
    public void setArrayOfValidateOrderLine(com.cdiscount.www.ArrayOfValidateOrderLine arrayOfValidateOrderLine)
    {
        generatedSetterHelperImpl(arrayOfValidateOrderLine, ARRAYOFVALIDATEORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValidateOrderLine" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLine addNewArrayOfValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().add_element_user(ARRAYOFVALIDATEORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValidateOrderLine" element
     */
    public void setNilArrayOfValidateOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().find_element_user(ARRAYOFVALIDATEORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().add_element_user(ARRAYOFVALIDATEORDERLINE$0);
            }
            target.setNil();
        }
    }
}
