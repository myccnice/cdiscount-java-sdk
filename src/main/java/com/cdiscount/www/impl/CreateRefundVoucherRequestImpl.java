/*
 * XML Type:  CreateRefundVoucherRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateRefundVoucherRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML CreateRefundVoucherRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class CreateRefundVoucherRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateRefundVoucherRequest
{
    private static final long serialVersionUID = 1L;
    
    public CreateRefundVoucherRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
    public com.cdiscount.www.ArrayOfRefundInformation getCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().find_element_user(COMMERCIALGESTURELIST$0, 0);
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
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().find_element_user(COMMERCIALGESTURELIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CommercialGestureList" element
     */
    public boolean isSetCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMERCIALGESTURELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "CommercialGestureList" element
     */
    public void setCommercialGestureList(com.cdiscount.www.ArrayOfRefundInformation commercialGestureList)
    {
        generatedSetterHelperImpl(commercialGestureList, COMMERCIALGESTURELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CommercialGestureList" element
     */
    public com.cdiscount.www.ArrayOfRefundInformation addNewCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().add_element_user(COMMERCIALGESTURELIST$0);
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
            com.cdiscount.www.ArrayOfRefundInformation target = null;
            target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().find_element_user(COMMERCIALGESTURELIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfRefundInformation)get_store().add_element_user(COMMERCIALGESTURELIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CommercialGestureList" element
     */
    public void unsetCommercialGestureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMERCIALGESTURELIST$0, 0);
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
    public com.cdiscount.www.ArrayOfSellerRefundRequest getSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(SELLERREFUNDLIST$4, 0);
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
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(SELLERREFUNDLIST$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerRefundList" element
     */
    public boolean isSetSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERREFUNDLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "SellerRefundList" element
     */
    public void setSellerRefundList(com.cdiscount.www.ArrayOfSellerRefundRequest sellerRefundList)
    {
        generatedSetterHelperImpl(sellerRefundList, SELLERREFUNDLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerRefundList" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundRequest addNewSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().add_element_user(SELLERREFUNDLIST$4);
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
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(SELLERREFUNDLIST$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().add_element_user(SELLERREFUNDLIST$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerRefundList" element
     */
    public void unsetSellerRefundList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERREFUNDLIST$4, 0);
        }
    }
}
