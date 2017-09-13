/*
 * An XML document type.
 * Localname: ArrayOfDiscountComponent
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDiscountComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfDiscountComponent(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfDiscountComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDiscountComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDiscountComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDISCOUNTCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfDiscountComponent");
    
    
    /**
     * Gets the "ArrayOfDiscountComponent" element
     */
    public com.cdiscount.www.ArrayOfDiscountComponent getArrayOfDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().find_element_user(ARRAYOFDISCOUNTCOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfDiscountComponent" element
     */
    public boolean isNilArrayOfDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().find_element_user(ARRAYOFDISCOUNTCOMPONENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfDiscountComponent" element
     */
    public void setArrayOfDiscountComponent(com.cdiscount.www.ArrayOfDiscountComponent arrayOfDiscountComponent)
    {
        generatedSetterHelperImpl(arrayOfDiscountComponent, ARRAYOFDISCOUNTCOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfDiscountComponent" element
     */
    public com.cdiscount.www.ArrayOfDiscountComponent addNewArrayOfDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().add_element_user(ARRAYOFDISCOUNTCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfDiscountComponent" element
     */
    public void setNilArrayOfDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().find_element_user(ARRAYOFDISCOUNTCOMPONENT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().add_element_user(ARRAYOFDISCOUNTCOMPONENT$0);
            }
            target.setNil();
        }
    }
}
