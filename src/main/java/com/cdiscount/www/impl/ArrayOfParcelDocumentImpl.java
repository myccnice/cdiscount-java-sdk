/*
 * An XML document type.
 * Localname: ArrayOfParcel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfParcel(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfParcelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPARCEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfParcel");
    
    
    /**
     * Gets the "ArrayOfParcel" element
     */
    public com.cdiscount.www.ArrayOfParcel getArrayOfParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().find_element_user(ARRAYOFPARCEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfParcel" element
     */
    public boolean isNilArrayOfParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().find_element_user(ARRAYOFPARCEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfParcel" element
     */
    public void setArrayOfParcel(com.cdiscount.www.ArrayOfParcel arrayOfParcel)
    {
        generatedSetterHelperImpl(arrayOfParcel, ARRAYOFPARCEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfParcel" element
     */
    public com.cdiscount.www.ArrayOfParcel addNewArrayOfParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().add_element_user(ARRAYOFPARCEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfParcel" element
     */
    public void setNilArrayOfParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcel target = null;
            target = (com.cdiscount.www.ArrayOfParcel)get_store().find_element_user(ARRAYOFPARCEL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcel)get_store().add_element_user(ARRAYOFPARCEL$0);
            }
            target.setNil();
        }
    }
}
