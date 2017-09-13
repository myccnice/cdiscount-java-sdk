/*
 * XML Type:  SellerRefundResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundResultMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SellerRefundResultMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerRefundResultMessageImpl extends org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl.ServiceMessageImpl implements com.cdiscount.www.SellerRefundResultMessage
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundResultMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNUMBER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumber");
    private static final javax.xml.namespace.QName SELLERREFUNDRESULTLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundResultList");
    
    
    /**
     * Gets the "OrderNumber" element
     */
    public java.lang.String getOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderNumber" element
     */
    public boolean isNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderNumber" element
     */
    public void setOrderNumber(java.lang.String orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$0);
            }
            target.setStringValue(orderNumber);
        }
    }
    
    /**
     * Sets (as xml) the "OrderNumber" element
     */
    public void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$0);
            }
            target.set(orderNumber);
        }
    }
    
    /**
     * Nils the "OrderNumber" element
     */
    public void setNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "SellerRefundResultList" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundResult getSellerRefundResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULTLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundResultList" element
     */
    public boolean isNilSellerRefundResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULTLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundResultList" element
     */
    public void setSellerRefundResultList(com.cdiscount.www.ArrayOfSellerRefundResult sellerRefundResultList)
    {
        generatedSetterHelperImpl(sellerRefundResultList, SELLERREFUNDRESULTLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundResultList" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundResult addNewSellerRefundResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().add_element_user(SELLERREFUNDRESULTLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundResultList" element
     */
    public void setNilSellerRefundResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(SELLERREFUNDRESULTLIST$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().add_element_user(SELLERREFUNDRESULTLIST$2);
            }
            target.setNil();
        }
    }
}
