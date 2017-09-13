/*
 * An XML document type.
 * Localname: ArrayOfShippingInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfShippingInformationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfShippingInformation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfShippingInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfShippingInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfShippingInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSHIPPINGINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfShippingInformation");
    
    
    /**
     * Gets the "ArrayOfShippingInformation" element
     */
    public com.cdiscount.www.ArrayOfShippingInformation getArrayOfShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().find_element_user(ARRAYOFSHIPPINGINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfShippingInformation" element
     */
    public boolean isNilArrayOfShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().find_element_user(ARRAYOFSHIPPINGINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfShippingInformation" element
     */
    public void setArrayOfShippingInformation(com.cdiscount.www.ArrayOfShippingInformation arrayOfShippingInformation)
    {
        generatedSetterHelperImpl(arrayOfShippingInformation, ARRAYOFSHIPPINGINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfShippingInformation" element
     */
    public com.cdiscount.www.ArrayOfShippingInformation addNewArrayOfShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().add_element_user(ARRAYOFSHIPPINGINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfShippingInformation" element
     */
    public void setNilArrayOfShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().find_element_user(ARRAYOFSHIPPINGINFORMATION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().add_element_user(ARRAYOFSHIPPINGINFORMATION$0);
            }
            target.setNil();
        }
    }
}
