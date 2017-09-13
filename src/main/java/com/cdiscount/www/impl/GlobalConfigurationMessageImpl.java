/*
 * XML Type:  GlobalConfigurationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GlobalConfigurationMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML GlobalConfigurationMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class GlobalConfigurationMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.GlobalConfigurationMessage
{
    private static final long serialVersionUID = 1L;
    
    public GlobalConfigurationMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARRIERLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CarrierList");
    
    
    /**
     * Gets the "CarrierList" element
     */
    public com.cdiscount.www.ArrayOfCarrier getCarrierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().find_element_user(CARRIERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CarrierList" element
     */
    public boolean isNilCarrierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().find_element_user(CARRIERLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CarrierList" element
     */
    public boolean isSetCarrierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARRIERLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "CarrierList" element
     */
    public void setCarrierList(com.cdiscount.www.ArrayOfCarrier carrierList)
    {
        generatedSetterHelperImpl(carrierList, CARRIERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CarrierList" element
     */
    public com.cdiscount.www.ArrayOfCarrier addNewCarrierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().add_element_user(CARRIERLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "CarrierList" element
     */
    public void setNilCarrierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCarrier target = null;
            target = (com.cdiscount.www.ArrayOfCarrier)get_store().find_element_user(CARRIERLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfCarrier)get_store().add_element_user(CARRIERLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CarrierList" element
     */
    public void unsetCarrierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARRIERLIST$0, 0);
        }
    }
}
