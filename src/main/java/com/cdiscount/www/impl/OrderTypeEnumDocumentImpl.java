/*
 * An XML document type.
 * Localname: OrderTypeEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderTypeEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderTypeEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderTypeEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderTypeEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderTypeEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERTYPEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderTypeEnum");
    
    
    /**
     * Gets the "OrderTypeEnum" element
     */
    public com.cdiscount.www.OrderTypeEnum.Enum getOrderTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OrderTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderTypeEnum" element
     */
    public com.cdiscount.www.OrderTypeEnum xgetOrderTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderTypeEnum" element
     */
    public boolean isNilOrderTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderTypeEnum" element
     */
    public void setOrderTypeEnum(com.cdiscount.www.OrderTypeEnum.Enum orderTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPEENUM$0);
            }
            target.setEnumValue(orderTypeEnum);
        }
    }
    
    /**
     * Sets (as xml) the "OrderTypeEnum" element
     */
    public void xsetOrderTypeEnum(com.cdiscount.www.OrderTypeEnum orderTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderTypeEnum)get_store().add_element_user(ORDERTYPEENUM$0);
            }
            target.set(orderTypeEnum);
        }
    }
    
    /**
     * Nils the "OrderTypeEnum" element
     */
    public void setNilOrderTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderTypeEnum)get_store().add_element_user(ORDERTYPEENUM$0);
            }
            target.setNil();
        }
    }
}
