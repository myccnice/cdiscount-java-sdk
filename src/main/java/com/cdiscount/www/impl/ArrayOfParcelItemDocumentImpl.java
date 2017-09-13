/*
 * An XML document type.
 * Localname: ArrayOfParcelItem
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfParcelItem(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfParcelItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPARCELITEM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfParcelItem");
    
    
    /**
     * Gets the "ArrayOfParcelItem" element
     */
    public com.cdiscount.www.ArrayOfParcelItem getArrayOfParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().find_element_user(ARRAYOFPARCELITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfParcelItem" element
     */
    public boolean isNilArrayOfParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().find_element_user(ARRAYOFPARCELITEM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfParcelItem" element
     */
    public void setArrayOfParcelItem(com.cdiscount.www.ArrayOfParcelItem arrayOfParcelItem)
    {
        generatedSetterHelperImpl(arrayOfParcelItem, ARRAYOFPARCELITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfParcelItem" element
     */
    public com.cdiscount.www.ArrayOfParcelItem addNewArrayOfParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().add_element_user(ARRAYOFPARCELITEM$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfParcelItem" element
     */
    public void setNilArrayOfParcelItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelItem target = null;
            target = (com.cdiscount.www.ArrayOfParcelItem)get_store().find_element_user(ARRAYOFPARCELITEM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelItem)get_store().add_element_user(ARRAYOFPARCELITEM$0);
            }
            target.setNil();
        }
    }
}
