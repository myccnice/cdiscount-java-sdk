/*
 * XML Type:  CreateRefundVoucherMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateRefundVoucherMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML CreateRefundVoucherMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class CreateRefundVoucherMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.CreateRefundVoucherMessage
{
    private static final long serialVersionUID = 1L;
    
    public CreateRefundVoucherMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMERCIALGESTURELIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CommercialGestureList");
    private static final javax.xml.namespace.QName ORDERNUMBER$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumber");
    private static final javax.xml.namespace.QName SELLERREFUNDLIST$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerRefundList");
    
    
    /**
     * Gets the "CommercialGestureList" element
     */
    public com.cdiscount.www.ArrayOfRefundInformationMessage getCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().find_element_user(COMMERCIALGESTURELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CommercialGestureList" element
     */
    public boolean isNilCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().find_element_user(COMMERCIALGESTURELIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CommercialGestureList" element
     */
    public void setCommercialGestureList(com.cdiscount.www.ArrayOfRefundInformationMessage commercialGestureList)
    {
        generatedSetterHelperImpl(commercialGestureList, COMMERCIALGESTURELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CommercialGestureList" element
     */
    public com.cdiscount.www.ArrayOfRefundInformationMessage addNewCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().add_element_user(COMMERCIALGESTURELIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "CommercialGestureList" element
     */
    public void setNilCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformationMessage target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().find_element_user(COMMERCIALGESTURELIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfRefundInformationMessage)get_store().add_element_user(COMMERCIALGESTURELIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "OrderNumber" element
     */
    public java.lang.String getOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "SellerRefundList" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundResult getSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(SELLERREFUNDLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerRefundList" element
     */
    public boolean isNilSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(SELLERREFUNDLIST$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerRefundList" element
     */
    public void setSellerRefundList(com.cdiscount.www.ArrayOfSellerRefundResult sellerRefundList)
    {
        generatedSetterHelperImpl(sellerRefundList, SELLERREFUNDLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundList" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundResult addNewSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().add_element_user(SELLERREFUNDLIST$4);
            return target;
        }
    }
    
    /**
     * Nils the "SellerRefundList" element
     */
    public void setNilSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(SELLERREFUNDLIST$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().add_element_user(SELLERREFUNDLIST$4);
            }
            target.setNil();
        }
    }
}
