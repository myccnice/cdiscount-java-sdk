/*
 * An XML document type.
 * Localname: ArrayOfOfferPool
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferPoolDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOfferPool(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOfferPoolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferPoolDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferPoolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOFFERPOOL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOfferPool");
    
    
    /**
     * Gets the "ArrayOfOfferPool" element
     */
    public com.cdiscount.www.ArrayOfOfferPool getArrayOfOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(ARRAYOFOFFERPOOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOfferPool" element
     */
    public boolean isNilArrayOfOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(ARRAYOFOFFERPOOL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOfferPool" element
     */
    public void setArrayOfOfferPool(com.cdiscount.www.ArrayOfOfferPool arrayOfOfferPool)
    {
        generatedSetterHelperImpl(arrayOfOfferPool, ARRAYOFOFFERPOOL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOfferPool" element
     */
    public com.cdiscount.www.ArrayOfOfferPool addNewArrayOfOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().add_element_user(ARRAYOFOFFERPOOL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOfferPool" element
     */
    public void setNilArrayOfOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(ARRAYOFOFFERPOOL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferPool)get_store().add_element_user(ARRAYOFOFFERPOOL$0);
            }
            target.setNil();
        }
    }
}
