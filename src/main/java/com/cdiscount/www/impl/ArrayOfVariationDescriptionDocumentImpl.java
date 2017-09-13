/*
 * An XML document type.
 * Localname: ArrayOfVariationDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfVariationDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfVariationDescription(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfVariationDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfVariationDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfVariationDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVARIATIONDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfVariationDescription");
    
    
    /**
     * Gets the "ArrayOfVariationDescription" element
     */
    public com.cdiscount.www.ArrayOfVariationDescription getArrayOfVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().find_element_user(ARRAYOFVARIATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfVariationDescription" element
     */
    public boolean isNilArrayOfVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().find_element_user(ARRAYOFVARIATIONDESCRIPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfVariationDescription" element
     */
    public void setArrayOfVariationDescription(com.cdiscount.www.ArrayOfVariationDescription arrayOfVariationDescription)
    {
        generatedSetterHelperImpl(arrayOfVariationDescription, ARRAYOFVARIATIONDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfVariationDescription" element
     */
    public com.cdiscount.www.ArrayOfVariationDescription addNewArrayOfVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().add_element_user(ARRAYOFVARIATIONDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfVariationDescription" element
     */
    public void setNilArrayOfVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().find_element_user(ARRAYOFVARIATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().add_element_user(ARRAYOFVARIATIONDESCRIPTION$0);
            }
            target.setNil();
        }
    }
}
