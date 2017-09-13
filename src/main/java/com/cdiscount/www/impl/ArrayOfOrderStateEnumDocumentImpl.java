/*
 * An XML document type.
 * Localname: ArrayOfOrderStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderStateEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOrderStateEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOrderStateEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderStateEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderStateEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORDERSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOrderStateEnum");
    
    
    /**
     * Gets the "ArrayOfOrderStateEnum" element
     */
    public com.cdiscount.www.ArrayOfOrderStateEnum getArrayOfOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().find_element_user(ARRAYOFORDERSTATEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOrderStateEnum" element
     */
    public boolean isNilArrayOfOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().find_element_user(ARRAYOFORDERSTATEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOrderStateEnum" element
     */
    public void setArrayOfOrderStateEnum(com.cdiscount.www.ArrayOfOrderStateEnum arrayOfOrderStateEnum)
    {
        generatedSetterHelperImpl(arrayOfOrderStateEnum, ARRAYOFORDERSTATEENUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOrderStateEnum" element
     */
    public com.cdiscount.www.ArrayOfOrderStateEnum addNewArrayOfOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().add_element_user(ARRAYOFORDERSTATEENUM$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOrderStateEnum" element
     */
    public void setNilArrayOfOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().find_element_user(ARRAYOFORDERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().add_element_user(ARRAYOFORDERSTATEENUM$0);
            }
            target.setNil();
        }
    }
}
