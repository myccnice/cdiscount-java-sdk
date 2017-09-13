/*
 * XML Type:  OrderClaimListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderClaimListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderClaimListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderClaimListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.OrderClaimListMessage
{
    private static final long serialVersionUID = 1L;
    
    public OrderClaimListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERCLAIMLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderClaimList");
    
    
    /**
     * Gets the "OrderClaimList" element
     */
    public com.cdiscount.www.ArrayOfOrderClaim getOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().find_element_user(ORDERCLAIMLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderClaimList" element
     */
    public boolean isNilOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().find_element_user(ORDERCLAIMLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderClaimList" element
     */
    public boolean isSetOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERCLAIMLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "OrderClaimList" element
     */
    public void setOrderClaimList(com.cdiscount.www.ArrayOfOrderClaim orderClaimList)
    {
        generatedSetterHelperImpl(orderClaimList, ORDERCLAIMLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderClaimList" element
     */
    public com.cdiscount.www.ArrayOfOrderClaim addNewOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().add_element_user(ORDERCLAIMLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderClaimList" element
     */
    public void setNilOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().find_element_user(ORDERCLAIMLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().add_element_user(ORDERCLAIMLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderClaimList" element
     */
    public void unsetOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERCLAIMLIST$0, 0);
        }
    }
}
