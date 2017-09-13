/*
 * An XML document type.
 * Localname: ArrayOfOffer
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOffer(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOfferDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOFFER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOffer");
    
    
    /**
     * Gets the "ArrayOfOffer" element
     */
    public com.cdiscount.www.ArrayOfOffer getArrayOfOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().find_element_user(ARRAYOFOFFER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOffer" element
     */
    public boolean isNilArrayOfOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().find_element_user(ARRAYOFOFFER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOffer" element
     */
    public void setArrayOfOffer(com.cdiscount.www.ArrayOfOffer arrayOfOffer)
    {
        generatedSetterHelperImpl(arrayOfOffer, ARRAYOFOFFER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOffer" element
     */
    public com.cdiscount.www.ArrayOfOffer addNewArrayOfOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().add_element_user(ARRAYOFOFFER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOffer" element
     */
    public void setNilArrayOfOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOffer target = null;
            target = (com.cdiscount.www.ArrayOfOffer)get_store().find_element_user(ARRAYOFOFFER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOffer)get_store().add_element_user(ARRAYOFOFFER$0);
            }
            target.setNil();
        }
    }
}
