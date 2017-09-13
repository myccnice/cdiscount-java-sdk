/*
 * An XML document type.
 * Localname: OrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderLine");
    
    
    /**
     * Gets the "OrderLine" element
     */
    public com.cdiscount.www.OrderLine getOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().find_element_user(ORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderLine" element
     */
    public boolean isNilOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().find_element_user(ORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderLine" element
     */
    public void setOrderLine(com.cdiscount.www.OrderLine orderLine)
    {
        generatedSetterHelperImpl(orderLine, ORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderLine" element
     */
    public com.cdiscount.www.OrderLine addNewOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().add_element_user(ORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderLine" element
     */
    public void setNilOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderLine target = null;
            target = (com.cdiscount.www.OrderLine)get_store().find_element_user(ORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderLine)get_store().add_element_user(ORDERLINE$0);
            }
            target.setNil();
        }
    }
}
