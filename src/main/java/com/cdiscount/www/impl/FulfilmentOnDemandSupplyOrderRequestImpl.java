/*
 * XML Type:  FulfilmentOnDemandSupplyOrderRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentOnDemandSupplyOrderRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentOnDemandSupplyOrderRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOnDemandSupplyOrderRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERLINELIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderLineList");
    
    
    /**
     * Gets the "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest getOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().find_element_user(ORDERLINELIST$0, 0);
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
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().find_element_user(ORDERLINELIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderLineList" element
     */
    public void setOrderLineList(com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest orderLineList)
    {
        generatedSetterHelperImpl(orderLineList, ORDERLINELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest addNewOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().add_element_user(ORDERLINELIST$0);
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
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().find_element_user(ORDERLINELIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().add_element_user(ORDERLINELIST$0);
            }
            target.setNil();
        }
    }
}
