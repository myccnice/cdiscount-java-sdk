/*
 * An XML document type.
 * Localname: OrderFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderFilter");
    
    
    /**
     * Gets the "OrderFilter" element
     */
    public com.cdiscount.www.OrderFilter getOrderFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderFilter target = null;
            target = (com.cdiscount.www.OrderFilter)get_store().find_element_user(ORDERFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderFilter" element
     */
    public boolean isNilOrderFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderFilter target = null;
            target = (com.cdiscount.www.OrderFilter)get_store().find_element_user(ORDERFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderFilter" element
     */
    public void setOrderFilter(com.cdiscount.www.OrderFilter orderFilter)
    {
        generatedSetterHelperImpl(orderFilter, ORDERFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderFilter" element
     */
    public com.cdiscount.www.OrderFilter addNewOrderFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderFilter target = null;
            target = (com.cdiscount.www.OrderFilter)get_store().add_element_user(ORDERFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderFilter" element
     */
    public void setNilOrderFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderFilter target = null;
            target = (com.cdiscount.www.OrderFilter)get_store().find_element_user(ORDERFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderFilter)get_store().add_element_user(ORDERFILTER$0);
            }
            target.setNil();
        }
    }
}
