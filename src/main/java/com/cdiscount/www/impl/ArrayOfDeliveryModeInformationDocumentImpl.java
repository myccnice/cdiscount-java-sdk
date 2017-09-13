/*
 * An XML document type.
 * Localname: ArrayOfDeliveryModeInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDeliveryModeInformationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfDeliveryModeInformation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfDeliveryModeInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDeliveryModeInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDeliveryModeInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDELIVERYMODEINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfDeliveryModeInformation");
    
    
    /**
     * Gets the "ArrayOfDeliveryModeInformation" element
     */
    public com.cdiscount.www.ArrayOfDeliveryModeInformation getArrayOfDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().find_element_user(ARRAYOFDELIVERYMODEINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfDeliveryModeInformation" element
     */
    public boolean isNilArrayOfDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().find_element_user(ARRAYOFDELIVERYMODEINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfDeliveryModeInformation" element
     */
    public void setArrayOfDeliveryModeInformation(com.cdiscount.www.ArrayOfDeliveryModeInformation arrayOfDeliveryModeInformation)
    {
        generatedSetterHelperImpl(arrayOfDeliveryModeInformation, ARRAYOFDELIVERYMODEINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfDeliveryModeInformation" element
     */
    public com.cdiscount.www.ArrayOfDeliveryModeInformation addNewArrayOfDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().add_element_user(ARRAYOFDELIVERYMODEINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfDeliveryModeInformation" element
     */
    public void setNilArrayOfDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().find_element_user(ARRAYOFDELIVERYMODEINFORMATION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().add_element_user(ARRAYOFDELIVERYMODEINFORMATION$0);
            }
            target.setNil();
        }
    }
}
