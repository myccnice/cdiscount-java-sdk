/*
 * An XML document type.
 * Localname: ArrayOfOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOrder(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOrder");
    
    
    /**
     * Gets the "ArrayOfOrder" element
     */
    public com.cdiscount.www.ArrayOfOrder getArrayOfOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().find_element_user(ARRAYOFORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOrder" element
     */
    public boolean isNilArrayOfOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().find_element_user(ARRAYOFORDER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOrder" element
     */
    public void setArrayOfOrder(com.cdiscount.www.ArrayOfOrder arrayOfOrder)
    {
        generatedSetterHelperImpl(arrayOfOrder, ARRAYOFORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOrder" element
     */
    public com.cdiscount.www.ArrayOfOrder addNewArrayOfOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().add_element_user(ARRAYOFORDER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOrder" element
     */
    public void setNilArrayOfOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrder target = null;
            target = (com.cdiscount.www.ArrayOfOrder)get_store().find_element_user(ARRAYOFORDER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrder)get_store().add_element_user(ARRAYOFORDER$0);
            }
            target.setNil();
        }
    }
}
