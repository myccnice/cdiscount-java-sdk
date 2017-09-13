/*
 * An XML document type.
 * Localname: ArrayOfOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOrderLine");
    
    
    /**
     * Gets the "ArrayOfOrderLine" element
     */
    public com.cdiscount.www.ArrayOfOrderLine getArrayOfOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ARRAYOFORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOrderLine" element
     */
    public boolean isNilArrayOfOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ARRAYOFORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOrderLine" element
     */
    public void setArrayOfOrderLine(com.cdiscount.www.ArrayOfOrderLine arrayOfOrderLine)
    {
        generatedSetterHelperImpl(arrayOfOrderLine, ARRAYOFORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOrderLine" element
     */
    public com.cdiscount.www.ArrayOfOrderLine addNewArrayOfOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().add_element_user(ARRAYOFORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOrderLine" element
     */
    public void setNilArrayOfOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfOrderLine)get_store().find_element_user(ARRAYOFORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderLine)get_store().add_element_user(ARRAYOFORDERLINE$0);
            }
            target.setNil();
        }
    }
}
