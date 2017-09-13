/*
 * XML Type:  FulfilmentOrderLineListToSupplyMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentOrderLineListToSupplyMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentOrderLineListToSupplyMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOrderLineListToSupplyMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERLINELIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderLineList");
    
    
    /**
     * Gets the "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLine getOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().find_element_user(ORDERLINELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderLineList" element
     */
    public boolean isNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().find_element_user(ORDERLINELIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderLineList" element
     */
    public boolean isSetOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERLINELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "OrderLineList" element
     */
    public void setOrderLineList(com.cdiscount.www.ArrayOfFulfilmentOrderLine orderLineList)
    {
        generatedSetterHelperImpl(orderLineList, ORDERLINELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLine addNewOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().add_element_user(ORDERLINELIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderLineList" element
     */
    public void setNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().find_element_user(ORDERLINELIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentOrderLine)get_store().add_element_user(ORDERLINELIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderLineList" element
     */
    public void unsetOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERLINELIST$0, 0);
        }
    }
}
