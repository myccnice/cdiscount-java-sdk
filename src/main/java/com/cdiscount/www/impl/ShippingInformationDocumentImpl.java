/*
 * An XML document type.
 * Localname: ShippingInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ShippingInformationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ShippingInformation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ShippingInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ShippingInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShippingInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPPINGINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingInformation");
    
    
    /**
     * Gets the "ShippingInformation" element
     */
    public com.cdiscount.www.ShippingInformation getShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().find_element_user(SHIPPINGINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingInformation" element
     */
    public boolean isNilShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().find_element_user(SHIPPINGINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShippingInformation" element
     */
    public void setShippingInformation(com.cdiscount.www.ShippingInformation shippingInformation)
    {
        generatedSetterHelperImpl(shippingInformation, SHIPPINGINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShippingInformation" element
     */
    public com.cdiscount.www.ShippingInformation addNewShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().add_element_user(SHIPPINGINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ShippingInformation" element
     */
    public void setNilShippingInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ShippingInformation target = null;
            target = (com.cdiscount.www.ShippingInformation)get_store().find_element_user(SHIPPINGINFORMATION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ShippingInformation)get_store().add_element_user(SHIPPINGINFORMATION$0);
            }
            target.setNil();
        }
    }
}
