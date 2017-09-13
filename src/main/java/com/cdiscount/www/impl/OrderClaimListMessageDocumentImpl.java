/*
 * An XML document type.
 * Localname: OrderClaimListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderClaimListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderClaimListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderClaimListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderClaimListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderClaimListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERCLAIMLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderClaimListMessage");
    
    
    /**
     * Gets the "OrderClaimListMessage" element
     */
    public com.cdiscount.www.OrderClaimListMessage getOrderClaimListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimListMessage target = null;
            target = (com.cdiscount.www.OrderClaimListMessage)get_store().find_element_user(ORDERCLAIMLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderClaimListMessage" element
     */
    public boolean isNilOrderClaimListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimListMessage target = null;
            target = (com.cdiscount.www.OrderClaimListMessage)get_store().find_element_user(ORDERCLAIMLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderClaimListMessage" element
     */
    public void setOrderClaimListMessage(com.cdiscount.www.OrderClaimListMessage orderClaimListMessage)
    {
        generatedSetterHelperImpl(orderClaimListMessage, ORDERCLAIMLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderClaimListMessage" element
     */
    public com.cdiscount.www.OrderClaimListMessage addNewOrderClaimListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimListMessage target = null;
            target = (com.cdiscount.www.OrderClaimListMessage)get_store().add_element_user(ORDERCLAIMLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderClaimListMessage" element
     */
    public void setNilOrderClaimListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimListMessage target = null;
            target = (com.cdiscount.www.OrderClaimListMessage)get_store().find_element_user(ORDERCLAIMLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderClaimListMessage)get_store().add_element_user(ORDERCLAIMLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
