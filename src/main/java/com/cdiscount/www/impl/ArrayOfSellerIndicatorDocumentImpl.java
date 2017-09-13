/*
 * An XML document type.
 * Localname: ArrayOfSellerIndicator
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSellerIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfSellerIndicator(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfSellerIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSellerIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSellerIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSELLERINDICATOR$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfSellerIndicator");
    
    
    /**
     * Gets the "ArrayOfSellerIndicator" element
     */
    public com.cdiscount.www.ArrayOfSellerIndicator getArrayOfSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().find_element_user(ARRAYOFSELLERINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSellerIndicator" element
     */
    public boolean isNilArrayOfSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().find_element_user(ARRAYOFSELLERINDICATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSellerIndicator" element
     */
    public void setArrayOfSellerIndicator(com.cdiscount.www.ArrayOfSellerIndicator arrayOfSellerIndicator)
    {
        generatedSetterHelperImpl(arrayOfSellerIndicator, ARRAYOFSELLERINDICATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSellerIndicator" element
     */
    public com.cdiscount.www.ArrayOfSellerIndicator addNewArrayOfSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().add_element_user(ARRAYOFSELLERINDICATOR$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSellerIndicator" element
     */
    public void setNilArrayOfSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().find_element_user(ARRAYOFSELLERINDICATOR$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().add_element_user(ARRAYOFSELLERINDICATOR$0);
            }
            target.setNil();
        }
    }
}
