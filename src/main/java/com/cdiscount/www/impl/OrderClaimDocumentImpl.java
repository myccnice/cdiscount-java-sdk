/*
 * An XML document type.
 * Localname: OrderClaim
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderClaimDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderClaim(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderClaimDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderClaimDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderClaimDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERCLAIM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderClaim");
    
    
    /**
     * Gets the "OrderClaim" element
     */
    public com.cdiscount.www.OrderClaim getOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().find_element_user(ORDERCLAIM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderClaim" element
     */
    public boolean isNilOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().find_element_user(ORDERCLAIM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderClaim" element
     */
    public void setOrderClaim(com.cdiscount.www.OrderClaim orderClaim)
    {
        generatedSetterHelperImpl(orderClaim, ORDERCLAIM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderClaim" element
     */
    public com.cdiscount.www.OrderClaim addNewOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().add_element_user(ORDERCLAIM$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderClaim" element
     */
    public void setNilOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().find_element_user(ORDERCLAIM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderClaim)get_store().add_element_user(ORDERCLAIM$0);
            }
            target.setNil();
        }
    }
}
