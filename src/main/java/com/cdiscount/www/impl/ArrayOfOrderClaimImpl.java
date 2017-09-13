/*
 * XML Type:  ArrayOfOrderClaim
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderClaim
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOrderClaim(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOrderClaimImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderClaim
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderClaimImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERCLAIM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderClaim");
    
    
    /**
     * Gets array of all "OrderClaim" elements
     */
    public com.cdiscount.www.OrderClaim[] getOrderClaimArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERCLAIM$0, targetList);
            com.cdiscount.www.OrderClaim[] result = new com.cdiscount.www.OrderClaim[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrderClaim" element
     */
    public com.cdiscount.www.OrderClaim getOrderClaimArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().find_element_user(ORDERCLAIM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrderClaim" element
     */
    public boolean isNilOrderClaimArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().find_element_user(ORDERCLAIM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrderClaim" element
     */
    public int sizeOfOrderClaimArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERCLAIM$0);
        }
    }
    
    /**
     * Sets array of all "OrderClaim" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderClaimArray(com.cdiscount.www.OrderClaim[] orderClaimArray)
    {
        check_orphaned();
        arraySetterHelper(orderClaimArray, ORDERCLAIM$0);
    }
    
    /**
     * Sets ith "OrderClaim" element
     */
    public void setOrderClaimArray(int i, com.cdiscount.www.OrderClaim orderClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().find_element_user(ORDERCLAIM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderClaim);
        }
    }
    
    /**
     * Nils the ith "OrderClaim" element
     */
    public void setNilOrderClaimArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().find_element_user(ORDERCLAIM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderClaim" element
     */
    public com.cdiscount.www.OrderClaim insertNewOrderClaim(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderClaim target = null;
            target = (com.cdiscount.www.OrderClaim)get_store().insert_element_user(ORDERCLAIM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderClaim" element
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
     * Removes the ith "OrderClaim" element
     */
    public void removeOrderClaim(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERCLAIM$0, i);
        }
    }
}
