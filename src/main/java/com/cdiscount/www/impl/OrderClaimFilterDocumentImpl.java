/*
 * An XML document type.
 * Localname: OrderClaimFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderClaimFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderClaimFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderClaimFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderClaimFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderClaimFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERCLAIMFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderClaimFilter");
    
    
    /**
     * Gets the "OrderClaimFilter" element
     */
    public com.cdiscount.www.OrderClaimFilter getOrderClaimFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimFilter target = null;
            target = (com.cdiscount.www.OrderClaimFilter)get_store().find_element_user(ORDERCLAIMFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderClaimFilter" element
     */
    public boolean isNilOrderClaimFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimFilter target = null;
            target = (com.cdiscount.www.OrderClaimFilter)get_store().find_element_user(ORDERCLAIMFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderClaimFilter" element
     */
    public void setOrderClaimFilter(com.cdiscount.www.OrderClaimFilter orderClaimFilter)
    {
        generatedSetterHelperImpl(orderClaimFilter, ORDERCLAIMFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderClaimFilter" element
     */
    public com.cdiscount.www.OrderClaimFilter addNewOrderClaimFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimFilter target = null;
            target = (com.cdiscount.www.OrderClaimFilter)get_store().add_element_user(ORDERCLAIMFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderClaimFilter" element
     */
    public void setNilOrderClaimFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaimFilter target = null;
            target = (com.cdiscount.www.OrderClaimFilter)get_store().find_element_user(ORDERCLAIMFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderClaimFilter)get_store().add_element_user(ORDERCLAIMFILTER$0);
            }
            target.setNil();
        }
    }
}
