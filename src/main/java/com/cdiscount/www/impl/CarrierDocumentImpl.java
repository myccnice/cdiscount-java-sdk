/*
 * An XML document type.
 * Localname: Carrier
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CarrierDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Carrier(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CarrierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CarrierDocument
{
    private static final long serialVersionUID = 1L;
    
    public CarrierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARRIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Carrier");
    
    
    /**
     * Gets the "Carrier" element
     */
    public com.cdiscount.www.Carrier getCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().find_element_user(CARRIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Carrier" element
     */
    public boolean isNilCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().find_element_user(CARRIER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Carrier" element
     */
    public void setCarrier(com.cdiscount.www.Carrier carrier)
    {
        generatedSetterHelperImpl(carrier, CARRIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Carrier" element
     */
    public com.cdiscount.www.Carrier addNewCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().add_element_user(CARRIER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Carrier" element
     */
    public void setNilCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Carrier target = null;
            target = (com.cdiscount.www.Carrier)get_store().find_element_user(CARRIER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Carrier)get_store().add_element_user(CARRIER$0);
            }
            target.setNil();
        }
    }
}
