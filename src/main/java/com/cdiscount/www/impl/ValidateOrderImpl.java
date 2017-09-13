/*
 * XML Type:  ValidateOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrder
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ValidateOrder(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ValidateOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrder
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARRIERNAME$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CarrierName");
    private static final javax.xml.namespace.QName ORDERLINELIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderLineList");
    private static final javax.xml.namespace.QName ORDERNUMBER$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumber");
    private static final javax.xml.namespace.QName ORDERSTATE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderState");
    private static final javax.xml.namespace.QName TRACKINGNUMBER$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "TrackingNumber");
    private static final javax.xml.namespace.QName TRACKINGURL$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "TrackingUrl");
    
    
    /**
     * Gets the "CarrierName" element
     */
    public java.lang.String getCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CarrierName" element
     */
    public org.apache.xmlbeans.XmlString xgetCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CarrierName" element
     */
    public boolean isNilCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIERNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CarrierName" element
     */
    public boolean isSetCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARRIERNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "CarrierName" element
     */
    public void setCarrierName(java.lang.String carrierName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARRIERNAME$0);
            }
            target.setStringValue(carrierName);
        }
    }
    
    /**
     * Sets (as xml) the "CarrierName" element
     */
    public void xsetCarrierName(org.apache.xmlbeans.XmlString carrierName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARRIERNAME$0);
            }
            target.set(carrierName);
        }
    }
    
    /**
     * Nils the "CarrierName" element
     */
    public void setNilCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARRIERNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CarrierName" element
     */
    public void unsetCarrierName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARRIERNAME$0, 0);
        }
    }
    
    /**
     * Gets the "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLine getOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().find_element_user(ORDERLINELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderLineList" element
     */
    public boolean isNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().find_element_user(ORDERLINELIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderLineList" element
     */
    public boolean isSetOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERLINELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "OrderLineList" element
     */
    public void setOrderLineList(com.cdiscount.www.ArrayOfValidateOrderLine orderLineList)
    {
        generatedSetterHelperImpl(orderLineList, ORDERLINELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    public com.cdiscount.www.ArrayOfValidateOrderLine addNewOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().add_element_user(ORDERLINELIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "OrderLineList" element
     */
    public void setNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfValidateOrderLine target = null;
            target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().find_element_user(ORDERLINELIST$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfValidateOrderLine)get_store().add_element_user(ORDERLINELIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderLineList" element
     */
    public void unsetOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERLINELIST$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderNumber" element
     */
    public boolean isSetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERNUMBER$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderNumber" element
     */
    public void unsetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERNUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "OrderState" element
     */
    public com.cdiscount.www.OrderStateEnum.Enum getOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OrderStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderState" element
     */
    public com.cdiscount.www.OrderStateEnum xgetOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderState" element
     */
    public boolean isSetOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERSTATE$6) != 0;
        }
    }
    
    /**
     * Sets the "OrderState" element
     */
    public void setOrderState(com.cdiscount.www.OrderStateEnum.Enum orderState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERSTATE$6);
            }
            target.setEnumValue(orderState);
        }
    }
    
    /**
     * Sets (as xml) the "OrderState" element
     */
    public void xsetOrderState(com.cdiscount.www.OrderStateEnum orderState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATE$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderStateEnum)get_store().add_element_user(ORDERSTATE$6);
            }
            target.set(orderState);
        }
    }
    
    /**
     * Unsets the "OrderState" element
     */
    public void unsetOrderState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERSTATE$6, 0);
        }
    }
    
    /**
     * Gets the "TrackingNumber" element
     */
    public java.lang.String getTrackingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGNUMBER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackingNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGNUMBER$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TrackingNumber" element
     */
    public boolean isNilTrackingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGNUMBER$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TrackingNumber" element
     */
    public boolean isSetTrackingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKINGNUMBER$8) != 0;
        }
    }
    
    /**
     * Sets the "TrackingNumber" element
     */
    public void setTrackingNumber(java.lang.String trackingNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKINGNUMBER$8);
            }
            target.setStringValue(trackingNumber);
        }
    }
    
    /**
     * Sets (as xml) the "TrackingNumber" element
     */
    public void xsetTrackingNumber(org.apache.xmlbeans.XmlString trackingNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGNUMBER$8);
            }
            target.set(trackingNumber);
        }
    }
    
    /**
     * Nils the "TrackingNumber" element
     */
    public void setNilTrackingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGNUMBER$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TrackingNumber" element
     */
    public void unsetTrackingNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKINGNUMBER$8, 0);
        }
    }
    
    /**
     * Gets the "TrackingUrl" element
     */
    public java.lang.String getTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGURL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackingUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGURL$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TrackingUrl" element
     */
    public boolean isNilTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGURL$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TrackingUrl" element
     */
    public boolean isSetTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKINGURL$10) != 0;
        }
    }
    
    /**
     * Sets the "TrackingUrl" element
     */
    public void setTrackingUrl(java.lang.String trackingUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGURL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKINGURL$10);
            }
            target.setStringValue(trackingUrl);
        }
    }
    
    /**
     * Sets (as xml) the "TrackingUrl" element
     */
    public void xsetTrackingUrl(org.apache.xmlbeans.XmlString trackingUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGURL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGURL$10);
            }
            target.set(trackingUrl);
        }
    }
    
    /**
     * Nils the "TrackingUrl" element
     */
    public void setNilTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGURL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGURL$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TrackingUrl" element
     */
    public void unsetTrackingUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKINGURL$10, 0);
        }
    }
}
