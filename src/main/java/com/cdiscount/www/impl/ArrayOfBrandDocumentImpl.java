/*
 * An XML document type.
 * Localname: ArrayOfBrand
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfBrandDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfBrand(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfBrandDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfBrandDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBrandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBRAND$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfBrand");
    
    
    /**
     * Gets the "ArrayOfBrand" element
     */
    public com.cdiscount.www.ArrayOfBrand getArrayOfBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().find_element_user(ARRAYOFBRAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfBrand" element
     */
    public boolean isNilArrayOfBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().find_element_user(ARRAYOFBRAND$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfBrand" element
     */
    public void setArrayOfBrand(com.cdiscount.www.ArrayOfBrand arrayOfBrand)
    {
        generatedSetterHelperImpl(arrayOfBrand, ARRAYOFBRAND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfBrand" element
     */
    public com.cdiscount.www.ArrayOfBrand addNewArrayOfBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().add_element_user(ARRAYOFBRAND$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfBrand" element
     */
    public void setNilArrayOfBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfBrand target = null;
            target = (com.cdiscount.www.ArrayOfBrand)get_store().find_element_user(ARRAYOFBRAND$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfBrand)get_store().add_element_user(ARRAYOFBRAND$0);
            }
            target.setNil();
        }
    }
}
