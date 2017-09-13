/*
 * XML Type:  FulfilmentOnDemandOrderLineFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOnDemandOrderLineFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentOnDemandOrderLineFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentOnDemandOrderLineFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOnDemandOrderLineFilter
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOnDemandOrderLineFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderReference");
    private static final javax.xml.namespace.QName PRODUCTEAN$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName WAREHOUSE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Warehouse");
    
    
    /**
     * Gets the "OrderReference" element
     */
    public java.lang.String getOrderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREFERENCE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$0, 0);
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
            return get_store().count_elements(ORDERREFERENCE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERREFERENCE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERREFERENCE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERREFERENCE$0);
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
            get_store().remove_element(ORDERREFERENCE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$2, 0);
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
            return get_store().count_elements(PRODUCTEAN$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTEAN$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$2);
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
            get_store().remove_element(PRODUCTEAN$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$4, 0);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$4, 0);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$4, 0);
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
            return get_store().count_elements(WAREHOUSE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSE$4);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$4);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$4);
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
            get_store().remove_element(WAREHOUSE$4, 0);
        }
    }
}
