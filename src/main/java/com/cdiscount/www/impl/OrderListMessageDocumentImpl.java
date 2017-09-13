/*
 * An XML document type.
 * Localname: OrderListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderListMessage");
    
    
    /**
     * Gets the "OrderListMessage" element
     */
    public com.cdiscount.www.OrderListMessage getOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderListMessage target = null;
            target = (com.cdiscount.www.OrderListMessage)get_store().find_element_user(ORDERLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderListMessage" element
     */
    public boolean isNilOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderListMessage target = null;
            target = (com.cdiscount.www.OrderListMessage)get_store().find_element_user(ORDERLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderListMessage" element
     */
    public void setOrderListMessage(com.cdiscount.www.OrderListMessage orderListMessage)
    {
        generatedSetterHelperImpl(orderListMessage, ORDERLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderListMessage" element
     */
    public com.cdiscount.www.OrderListMessage addNewOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderListMessage target = null;
            target = (com.cdiscount.www.OrderListMessage)get_store().add_element_user(ORDERLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderListMessage" element
     */
    public void setNilOrderListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderListMessage target = null;
            target = (com.cdiscount.www.OrderListMessage)get_store().find_element_user(ORDERLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderListMessage)get_store().add_element_user(ORDERLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
