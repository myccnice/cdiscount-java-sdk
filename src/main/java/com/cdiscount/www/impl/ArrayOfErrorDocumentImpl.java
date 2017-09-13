/*
 * An XML document type.
 * Localname: ArrayOfError
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfError(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFERROR$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfError");
    
    
    /**
     * Gets the "ArrayOfError" element
     */
    public com.cdiscount.www.ArrayOfError getArrayOfError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ARRAYOFERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfError" element
     */
    public boolean isNilArrayOfError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ARRAYOFERROR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfError" element
     */
    public void setArrayOfError(com.cdiscount.www.ArrayOfError arrayOfError)
    {
        generatedSetterHelperImpl(arrayOfError, ARRAYOFERROR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfError" element
     */
    public com.cdiscount.www.ArrayOfError addNewArrayOfError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ARRAYOFERROR$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfError" element
     */
    public void setNilArrayOfError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ARRAYOFERROR$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ARRAYOFERROR$0);
            }
            target.setNil();
        }
    }
}
