/*
 * An XML document type.
 * Localname: ArrayOfProductMatching
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductMatchingDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfProductMatching(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductMatchingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductMatchingDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductMatchingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCTMATCHING$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfProductMatching");
    
    
    /**
     * Gets the "ArrayOfProductMatching" element
     */
    public com.cdiscount.www.ArrayOfProductMatching getArrayOfProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().find_element_user(ARRAYOFPRODUCTMATCHING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProductMatching" element
     */
    public boolean isNilArrayOfProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().find_element_user(ARRAYOFPRODUCTMATCHING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProductMatching" element
     */
    public void setArrayOfProductMatching(com.cdiscount.www.ArrayOfProductMatching arrayOfProductMatching)
    {
        generatedSetterHelperImpl(arrayOfProductMatching, ARRAYOFPRODUCTMATCHING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProductMatching" element
     */
    public com.cdiscount.www.ArrayOfProductMatching addNewArrayOfProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().add_element_user(ARRAYOFPRODUCTMATCHING$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProductMatching" element
     */
    public void setNilArrayOfProductMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().find_element_user(ARRAYOFPRODUCTMATCHING$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductMatching)get_store().add_element_user(ARRAYOFPRODUCTMATCHING$0);
            }
            target.setNil();
        }
    }
}
