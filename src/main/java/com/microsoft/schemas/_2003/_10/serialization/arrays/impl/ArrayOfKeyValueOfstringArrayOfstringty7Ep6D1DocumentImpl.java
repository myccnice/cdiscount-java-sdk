/*
 * An XML document type.
 * Localname: ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1Document
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1Document
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFKEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1");
    
    
    /**
     * Gets the "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getArrayOfKeyValueOfstringArrayOfstringty7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(ARRAYOFKEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public boolean isNilArrayOfKeyValueOfstringArrayOfstringty7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(ARRAYOFKEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public void setArrayOfKeyValueOfstringArrayOfstringty7Ep6D1(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 arrayOfKeyValueOfstringArrayOfstringty7Ep6D1)
    {
        generatedSetterHelperImpl(arrayOfKeyValueOfstringArrayOfstringty7Ep6D1, ARRAYOFKEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 addNewArrayOfKeyValueOfstringArrayOfstringty7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(ARRAYOFKEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public void setNilArrayOfKeyValueOfstringArrayOfstringty7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(ARRAYOFKEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(ARRAYOFKEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0);
            }
            target.setNil();
        }
    }
}
