/*
 * An XML document type.
 * Localname: ArrayOfRefundInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfRefundInformationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfRefundInformation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfRefundInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfRefundInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRefundInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFREFUNDINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfRefundInformation");
    
    
    /**
     * Gets the "ArrayOfRefundInformation" element
     */
    public com.cdiscount.www.ArrayOfRefundInformation getArrayOfRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().find_element_user(ARRAYOFREFUNDINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRefundInformation" element
     */
    public boolean isNilArrayOfRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().find_element_user(ARRAYOFREFUNDINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRefundInformation" element
     */
    public void setArrayOfRefundInformation(com.cdiscount.www.ArrayOfRefundInformation arrayOfRefundInformation)
    {
        generatedSetterHelperImpl(arrayOfRefundInformation, ARRAYOFREFUNDINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRefundInformation" element
     */
    public com.cdiscount.www.ArrayOfRefundInformation addNewArrayOfRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().add_element_user(ARRAYOFREFUNDINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRefundInformation" element
     */
    public void setNilArrayOfRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().find_element_user(ARRAYOFREFUNDINFORMATION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().add_element_user(ARRAYOFREFUNDINFORMATION$0);
            }
            target.setNil();
        }
    }
}
