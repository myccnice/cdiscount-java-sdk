/*
 * An XML document type.
 * Localname: OrderStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderStateEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderStateEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderStateEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderStateEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderStateEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderStateEnum");
    
    
    /**
     * Gets the "OrderStateEnum" element
     */
    public com.cdiscount.www.OrderStateEnum.Enum getOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OrderStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderStateEnum" element
     */
    public com.cdiscount.www.OrderStateEnum xgetOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderStateEnum" element
     */
    public boolean isNilOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderStateEnum" element
     */
    public void setOrderStateEnum(com.cdiscount.www.OrderStateEnum.Enum orderStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERSTATEENUM$0);
            }
            target.setEnumValue(orderStateEnum);
        }
    }
    
    /**
     * Sets (as xml) the "OrderStateEnum" element
     */
    public void xsetOrderStateEnum(com.cdiscount.www.OrderStateEnum orderStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStateEnum)get_store().add_element_user(ORDERSTATEENUM$0);
            }
            target.set(orderStateEnum);
        }
    }
    
    /**
     * Nils the "OrderStateEnum" element
     */
    public void setNilOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStateEnum)get_store().add_element_user(ORDERSTATEENUM$0);
            }
            target.setNil();
        }
    }
}
