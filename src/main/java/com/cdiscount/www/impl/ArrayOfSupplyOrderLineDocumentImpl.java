/*
 * An XML document type.
 * Localname: ArrayOfSupplyOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSupplyOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfSupplyOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfSupplyOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSupplyOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSupplyOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSUPPLYORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfSupplyOrderLine");
    
    
    /**
     * Gets the "ArrayOfSupplyOrderLine" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderLine getArrayOfSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().find_element_user(ARRAYOFSUPPLYORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSupplyOrderLine" element
     */
    public boolean isNilArrayOfSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().find_element_user(ARRAYOFSUPPLYORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSupplyOrderLine" element
     */
    public void setArrayOfSupplyOrderLine(com.cdiscount.www.ArrayOfSupplyOrderLine arrayOfSupplyOrderLine)
    {
        generatedSetterHelperImpl(arrayOfSupplyOrderLine, ARRAYOFSUPPLYORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSupplyOrderLine" element
     */
    public com.cdiscount.www.ArrayOfSupplyOrderLine addNewArrayOfSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().add_element_user(ARRAYOFSUPPLYORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSupplyOrderLine" element
     */
    public void setNilArrayOfSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSupplyOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().find_element_user(ARRAYOFSUPPLYORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSupplyOrderLine)get_store().add_element_user(ARRAYOFSUPPLYORDERLINE$0);
            }
            target.setNil();
        }
    }
}
