/*
 * An XML document type.
 * Localname: ArrayOfCarrier
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfCarrierDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfCarrier(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfCarrierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfCarrierDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCarrierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCARRIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfCarrier");
    
    
    /**
     * Gets the "ArrayOfCarrier" element
     */
    public com.cdiscount.www.ArrayOfCarrier getArrayOfCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().find_element_user(ARRAYOFCARRIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfCarrier" element
     */
    public boolean isNilArrayOfCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().find_element_user(ARRAYOFCARRIER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfCarrier" element
     */
    public void setArrayOfCarrier(com.cdiscount.www.ArrayOfCarrier arrayOfCarrier)
    {
        generatedSetterHelperImpl(arrayOfCarrier, ARRAYOFCARRIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfCarrier" element
     */
    public com.cdiscount.www.ArrayOfCarrier addNewArrayOfCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().add_element_user(ARRAYOFCARRIER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfCarrier" element
     */
    public void setNilArrayOfCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().find_element_user(ARRAYOFCARRIER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfCarrier)get_store().add_element_user(ARRAYOFCARRIER$0);
            }
            target.setNil();
        }
    }
}
