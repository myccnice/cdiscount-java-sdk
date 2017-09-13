/*
 * An XML document type.
 * Localname: ArrayOfParcelActionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelActionResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfParcelActionResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfParcelActionResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelActionResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelActionResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPARCELACTIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfParcelActionResult");
    
    
    /**
     * Gets the "ArrayOfParcelActionResult" element
     */
    public com.cdiscount.www.ArrayOfParcelActionResult getArrayOfParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().find_element_user(ARRAYOFPARCELACTIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfParcelActionResult" element
     */
    public boolean isNilArrayOfParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().find_element_user(ARRAYOFPARCELACTIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfParcelActionResult" element
     */
    public void setArrayOfParcelActionResult(com.cdiscount.www.ArrayOfParcelActionResult arrayOfParcelActionResult)
    {
        generatedSetterHelperImpl(arrayOfParcelActionResult, ARRAYOFPARCELACTIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfParcelActionResult" element
     */
    public com.cdiscount.www.ArrayOfParcelActionResult addNewArrayOfParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().add_element_user(ARRAYOFPARCELACTIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfParcelActionResult" element
     */
    public void setNilArrayOfParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().find_element_user(ARRAYOFPARCELACTIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().add_element_user(ARRAYOFPARCELACTIONRESULT$0);
            }
            target.setNil();
        }
    }
}
