/*
 * An XML document type.
 * Localname: DeliveryModeInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DeliveryModeInformationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DeliveryModeInformation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DeliveryModeInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DeliveryModeInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeliveryModeInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYMODEINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DeliveryModeInformation");
    
    
    /**
     * Gets the "DeliveryModeInformation" element
     */
    public com.cdiscount.www.DeliveryModeInformation getDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODEINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DeliveryModeInformation" element
     */
    public boolean isNilDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODEINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DeliveryModeInformation" element
     */
    public void setDeliveryModeInformation(com.cdiscount.www.DeliveryModeInformation deliveryModeInformation)
    {
        generatedSetterHelperImpl(deliveryModeInformation, DELIVERYMODEINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeliveryModeInformation" element
     */
    public com.cdiscount.www.DeliveryModeInformation addNewDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().add_element_user(DELIVERYMODEINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "DeliveryModeInformation" element
     */
    public void setNilDeliveryModeInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DeliveryModeInformation target = null;
            target = (com.cdiscount.www.DeliveryModeInformation)get_store().find_element_user(DELIVERYMODEINFORMATION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DeliveryModeInformation)get_store().add_element_user(DELIVERYMODEINFORMATION$0);
            }
            target.setNil();
        }
    }
}
