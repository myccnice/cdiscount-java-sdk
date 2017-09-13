/*
 * XML Type:  FulfilmentOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPECTEDCUSTOMERDELIVERYMAX$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ExpectedCustomerDeliveryMax");
    private static final javax.xml.namespace.QName EXPECTEDCUSTOMERDELIVERYMIN$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ExpectedCustomerDeliveryMin");
    private static final javax.xml.namespace.QName LATESTWAREHOUSEDELIVERYDATE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LatestWarehouseDeliveryDate");
    private static final javax.xml.namespace.QName ORDERDATE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderDate");
    private static final javax.xml.namespace.QName ORDERREFERENCE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderReference");
    private static final javax.xml.namespace.QName PRODUCTEAN$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName PRODUCTNAME$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductName");
    private static final javax.xml.namespace.QName QUANTITY$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Quantity");
    private static final javax.xml.namespace.QName SELLERPRODUCTREFERENCE$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductReference");
    private static final javax.xml.namespace.QName WAREHOUSE$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Warehouse");
    
    
    /**
     * Gets the "ExpectedCustomerDeliveryMax" element
     */
    public java.util.Calendar getExpectedCustomerDeliveryMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExpectedCustomerDeliveryMax" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpectedCustomerDeliveryMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMAX$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExpectedCustomerDeliveryMax" element
     */
    public boolean isSetExpectedCustomerDeliveryMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDCUSTOMERDELIVERYMAX$0) != 0;
        }
    }
    
    /**
     * Sets the "ExpectedCustomerDeliveryMax" element
     */
    public void setExpectedCustomerDeliveryMax(java.util.Calendar expectedCustomerDeliveryMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPECTEDCUSTOMERDELIVERYMAX$0);
            }
            target.setCalendarValue(expectedCustomerDeliveryMax);
        }
    }
    
    /**
     * Sets (as xml) the "ExpectedCustomerDeliveryMax" element
     */
    public void xsetExpectedCustomerDeliveryMax(org.apache.xmlbeans.XmlDateTime expectedCustomerDeliveryMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPECTEDCUSTOMERDELIVERYMAX$0);
            }
            target.set(expectedCustomerDeliveryMax);
        }
    }
    
    /**
     * Unsets the "ExpectedCustomerDeliveryMax" element
     */
    public void unsetExpectedCustomerDeliveryMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDCUSTOMERDELIVERYMAX$0, 0);
        }
    }
    
    /**
     * Gets the "ExpectedCustomerDeliveryMin" element
     */
    public java.util.Calendar getExpectedCustomerDeliveryMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExpectedCustomerDeliveryMin" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpectedCustomerDeliveryMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMIN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExpectedCustomerDeliveryMin" element
     */
    public boolean isSetExpectedCustomerDeliveryMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDCUSTOMERDELIVERYMIN$2) != 0;
        }
    }
    
    /**
     * Sets the "ExpectedCustomerDeliveryMin" element
     */
    public void setExpectedCustomerDeliveryMin(java.util.Calendar expectedCustomerDeliveryMin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMIN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPECTEDCUSTOMERDELIVERYMIN$2);
            }
            target.setCalendarValue(expectedCustomerDeliveryMin);
        }
    }
    
    /**
     * Sets (as xml) the "ExpectedCustomerDeliveryMin" element
     */
    public void xsetExpectedCustomerDeliveryMin(org.apache.xmlbeans.XmlDateTime expectedCustomerDeliveryMin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPECTEDCUSTOMERDELIVERYMIN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPECTEDCUSTOMERDELIVERYMIN$2);
            }
            target.set(expectedCustomerDeliveryMin);
        }
    }
    
    /**
     * Unsets the "ExpectedCustomerDeliveryMin" element
     */
    public void unsetExpectedCustomerDeliveryMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDCUSTOMERDELIVERYMIN$2, 0);
        }
    }
    
    /**
     * Gets the "LatestWarehouseDeliveryDate" element
     */
    public java.util.Calendar getLatestWarehouseDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATESTWAREHOUSEDELIVERYDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LatestWarehouseDeliveryDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLatestWarehouseDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LATESTWAREHOUSEDELIVERYDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LatestWarehouseDeliveryDate" element
     */
    public boolean isSetLatestWarehouseDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATESTWAREHOUSEDELIVERYDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "LatestWarehouseDeliveryDate" element
     */
    public void setLatestWarehouseDeliveryDate(java.util.Calendar latestWarehouseDeliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATESTWAREHOUSEDELIVERYDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATESTWAREHOUSEDELIVERYDATE$4);
            }
            target.setCalendarValue(latestWarehouseDeliveryDate);
        }
    }
    
    /**
     * Sets (as xml) the "LatestWarehouseDeliveryDate" element
     */
    public void xsetLatestWarehouseDeliveryDate(org.apache.xmlbeans.XmlDateTime latestWarehouseDeliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LATESTWAREHOUSEDELIVERYDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LATESTWAREHOUSEDELIVERYDATE$4);
            }
            target.set(latestWarehouseDeliveryDate);
        }
    }
    
    /**
     * Unsets the "LatestWarehouseDeliveryDate" element
     */
    public void unsetLatestWarehouseDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATESTWAREHOUSEDELIVERYDATE$4, 0);
        }
    }
    
    /**
     * Gets the "OrderDate" element
     */
    public java.util.Calendar getOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderDate" element
     */
    public boolean isSetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "OrderDate" element
     */
    public void setOrderDate(java.util.Calendar orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATE$6);
            }
            target.setCalendarValue(orderDate);
        }
    }
    
    /**
     * Sets (as xml) the "OrderDate" element
     */
    public void xsetOrderDate(org.apache.xmlbeans.XmlDateTime orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ORDERDATE$6);
            }
            target.set(orderDate);
        }
    }
    
    /**
     * Unsets the "OrderDate" element
     */
    public void unsetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERDATE$6, 0);
        }
    }
    
    /**
     * Gets the "OrderReference" element
     */
    public java.lang.String getOrderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREFERENCE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderReference" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderReference" element
     */
    public boolean isNilOrderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderReference" element
     */
    public boolean isSetOrderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERREFERENCE$8) != 0;
        }
    }
    
    /**
     * Sets the "OrderReference" element
     */
    public void setOrderReference(java.lang.String orderReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREFERENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERREFERENCE$8);
            }
            target.setStringValue(orderReference);
        }
    }
    
    /**
     * Sets (as xml) the "OrderReference" element
     */
    public void xsetOrderReference(org.apache.xmlbeans.XmlString orderReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERREFERENCE$8);
            }
            target.set(orderReference);
        }
    }
    
    /**
     * Nils the "OrderReference" element
     */
    public void setNilOrderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERREFERENCE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderReference" element
     */
    public void unsetOrderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERREFERENCE$8, 0);
        }
    }
    
    /**
     * Gets the "ProductEan" element
     */
    public java.lang.String getProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductEan" element
     */
    public org.apache.xmlbeans.XmlString xgetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductEan" element
     */
    public boolean isNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductEan" element
     */
    public boolean isSetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTEAN$10) != 0;
        }
    }
    
    /**
     * Sets the "ProductEan" element
     */
    public void setProductEan(java.lang.String productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTEAN$10);
            }
            target.setStringValue(productEan);
        }
    }
    
    /**
     * Sets (as xml) the "ProductEan" element
     */
    public void xsetProductEan(org.apache.xmlbeans.XmlString productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$10);
            }
            target.set(productEan);
        }
    }
    
    /**
     * Nils the "ProductEan" element
     */
    public void setNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductEan" element
     */
    public void unsetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTEAN$10, 0);
        }
    }
    
    /**
     * Gets the "ProductName" element
     */
    public java.lang.String getProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductName" element
     */
    public org.apache.xmlbeans.XmlString xgetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductName" element
     */
    public boolean isNilProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductName" element
     */
    public boolean isSetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "ProductName" element
     */
    public void setProductName(java.lang.String productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$12);
            }
            target.setStringValue(productName);
        }
    }
    
    /**
     * Sets (as xml) the "ProductName" element
     */
    public void xsetProductName(org.apache.xmlbeans.XmlString productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$12);
            }
            target.set(productName);
        }
    }
    
    /**
     * Nils the "ProductName" element
     */
    public void setNilProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductName" element
     */
    public void unsetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTNAME$12, 0);
        }
    }
    
    /**
     * Gets the "Quantity" element
     */
    public int getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quantity" element
     */
    public org.apache.xmlbeans.XmlInt xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$14) != 0;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(int quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$14);
            }
            target.setIntValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "Quantity" element
     */
    public void xsetQuantity(org.apache.xmlbeans.XmlInt quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANTITY$14);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Unsets the "Quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$14, 0);
        }
    }
    
    /**
     * Gets the "SellerProductReference" element
     */
    public java.lang.String getSellerProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerProductReference" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerProductReference" element
     */
    public boolean isNilSellerProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerProductReference" element
     */
    public boolean isSetSellerProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERPRODUCTREFERENCE$16) != 0;
        }
    }
    
    /**
     * Sets the "SellerProductReference" element
     */
    public void setSellerProductReference(java.lang.String sellerProductReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTREFERENCE$16);
            }
            target.setStringValue(sellerProductReference);
        }
    }
    
    /**
     * Sets (as xml) the "SellerProductReference" element
     */
    public void xsetSellerProductReference(org.apache.xmlbeans.XmlString sellerProductReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$16);
            }
            target.set(sellerProductReference);
        }
    }
    
    /**
     * Nils the "SellerProductReference" element
     */
    public void setNilSellerProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerProductReference" element
     */
    public void unsetSellerProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERPRODUCTREFERENCE$16, 0);
        }
    }
    
    /**
     * Gets the "Warehouse" element
     */
    public com.cdiscount.www.WarehouseType.Enum getWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.WarehouseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Warehouse" element
     */
    public com.cdiscount.www.WarehouseType xgetWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Warehouse" element
     */
    public boolean isNilWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Warehouse" element
     */
    public boolean isSetWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAREHOUSE$18) != 0;
        }
    }
    
    /**
     * Sets the "Warehouse" element
     */
    public void setWarehouse(com.cdiscount.www.WarehouseType.Enum warehouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSE$18);
            }
            target.setEnumValue(warehouse);
        }
    }
    
    /**
     * Sets (as xml) the "Warehouse" element
     */
    public void xsetWarehouse(com.cdiscount.www.WarehouseType warehouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$18);
            }
            target.set(warehouse);
        }
    }
    
    /**
     * Nils the "Warehouse" element
     */
    public void setNilWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Warehouse" element
     */
    public void unsetWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAREHOUSE$18, 0);
        }
    }
}
