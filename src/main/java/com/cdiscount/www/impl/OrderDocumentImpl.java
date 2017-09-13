/*
 * An XML document type.
 * Localname: Order
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Order(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Order");
    
    
    /**
     * Gets the "Order" element
     */
    public com.cdiscount.www.Order getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().find_element_user(ORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Order" element
     */
    public boolean isNilOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().find_element_user(ORDER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Order" element
     */
    public void setOrder(com.cdiscount.www.Order order)
    {
        generatedSetterHelperImpl(order, ORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Order" element
     */
    public com.cdiscount.www.Order addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().add_element_user(ORDER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Order" element
     */
    public void setNilOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Order target = null;
            target = (com.cdiscount.www.Order)get_store().find_element_user(ORDER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Order)get_store().add_element_user(ORDER$0);
            }
            target.setNil();
        }
    }
}
