/*
 * An XML document type.
 * Localname: ArrayOfFulfilmentOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfFulfilmentOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFULFILMENTORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfFulfilmentOrderLine");
    
    
    /**
     * Gets the "ArrayOfFulfilmentOrderLine" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLine getArrayOfFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().find_element_user(ARRAYOFFULFILMENTORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfFulfilmentOrderLine" element
     */
    public boolean isNilArrayOfFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().find_element_user(ARRAYOFFULFILMENTORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfFulfilmentOrderLine" element
     */
    public void setArrayOfFulfilmentOrderLine(com.cdiscount.www.ArrayOfFulfilmentOrderLine arrayOfFulfilmentOrderLine)
    {
        generatedSetterHelperImpl(arrayOfFulfilmentOrderLine, ARRAYOFFULFILMENTORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfFulfilmentOrderLine" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLine addNewArrayOfFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().add_element_user(ARRAYOFFULFILMENTORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfFulfilmentOrderLine" element
     */
    public void setNilArrayOfFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().find_element_user(ARRAYOFFULFILMENTORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().add_element_user(ARRAYOFFULFILMENTORDERLINE$0);
            }
            target.setNil();
        }
    }
}
