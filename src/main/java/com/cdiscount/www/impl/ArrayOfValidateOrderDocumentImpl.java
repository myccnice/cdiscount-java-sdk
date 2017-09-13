/*
 * An XML document type.
 * Localname: ArrayOfValidateOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfValidateOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfValidateOrder(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfValidateOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfValidateOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidateOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATEORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfValidateOrder");
    
    
    /**
     * Gets the "ArrayOfValidateOrder" element
     */
    public com.cdiscount.www.ArrayOfValidateOrder getArrayOfValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().find_element_user(ARRAYOFVALIDATEORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValidateOrder" element
     */
    public boolean isNilArrayOfValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().find_element_user(ARRAYOFVALIDATEORDER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValidateOrder" element
     */
    public void setArrayOfValidateOrder(com.cdiscount.www.ArrayOfValidateOrder arrayOfValidateOrder)
    {
        generatedSetterHelperImpl(arrayOfValidateOrder, ARRAYOFVALIDATEORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValidateOrder" element
     */
    public com.cdiscount.www.ArrayOfValidateOrder addNewArrayOfValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().add_element_user(ARRAYOFVALIDATEORDER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValidateOrder" element
     */
    public void setNilArrayOfValidateOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrder target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().find_element_user(ARRAYOFVALIDATEORDER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrder)get_store().add_element_user(ARRAYOFVALIDATEORDER$0);
            }
            target.setNil();
        }
    }
}
