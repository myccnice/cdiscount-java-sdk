/*
 * XML Type:  SellerRefundRequestMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerRefundRequestMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SellerRefundRequestMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerRefundRequestMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerRefundRequestMessage
{
    private static final long serialVersionUID = 1L;
    
    public SellerRefundRequestMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNUMBER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumber");
    private static final javax.xml.namespace.QName SELLERREFUNDREQUESTLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundRequestList");
    
    
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
     * Gets the "SellerRefundRequestList" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundRequest getSellerRefundRequestList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUESTLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundRequestList" element
     */
    public boolean isNilSellerRefundRequestList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUESTLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundRequestList" element
     */
    public void setSellerRefundRequestList(com.cdiscount.www.ArrayOfSellerRefundRequest sellerRefundRequestList)
    {
        generatedSetterHelperImpl(sellerRefundRequestList, SELLERREFUNDREQUESTLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundRequestList" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundRequest addNewSellerRefundRequestList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().add_element_user(SELLERREFUNDREQUESTLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundRequestList" element
     */
    public void setNilSellerRefundRequestList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(SELLERREFUNDREQUESTLIST$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().add_element_user(SELLERREFUNDREQUESTLIST$2);
            }
            target.setNil();
        }
    }
}
