/*
 * An XML document type.
 * Localname: ArrayOflong
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflongDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOflong(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOflongDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflongDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOflongDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFLONG$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    
    
    /**
     * Gets the "ArrayOflong" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong getArrayOflong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().find_element_user(ARRAYOFLONG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOflong" element
     */
    public boolean isNilArrayOflong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().find_element_user(ARRAYOFLONG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOflong" element
     */
    public void setArrayOflong(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong arrayOflong)
    {
        generatedSetterHelperImpl(arrayOflong, ARRAYOFLONG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOflong" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong addNewArrayOflong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().add_element_user(ARRAYOFLONG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOflong" element
     */
    public void setNilArrayOflong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().find_element_user(ARRAYOFLONG$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong)get_store().add_element_user(ARRAYOFLONG$0);
            }
            target.setNil();
        }
    }
}
