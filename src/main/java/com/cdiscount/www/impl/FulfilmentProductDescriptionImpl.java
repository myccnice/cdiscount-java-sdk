/*
 * XML Type:  FulfilmentProductDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentProductDescription
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentProductDescription(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentProductDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentProductDescription
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentProductDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALSUPPLYORDERID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ExternalSupplyOrderId");
    private static final javax.xml.namespace.QName PRODUCTEAN$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName QUANTITY$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Quantity");
    private static final javax.xml.namespace.QName SELLERPRODUCTREFERENCE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductReference");
    private static final javax.xml.namespace.QName WAREHOUSE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Warehouse");
    private static final javax.xml.namespace.QName WAREHOUSERECEPTIONMINDATE$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "WarehouseReceptionMinDate");
    
    
    /**
     * Gets the "ExternalSupplyOrderId" element
     */
    public java.lang.String getExternalSupplyOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALSUPPLYORDERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalSupplyOrderId" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalSupplyOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALSUPPLYORDERID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ExternalSupplyOrderId" element
     */
    public boolean isNilExternalSupplyOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALSUPPLYORDERID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ExternalSupplyOrderId" element
     */
    public boolean isSetExternalSupplyOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALSUPPLYORDERID$0) != 0;
        }
    }
    
    /**
     * Sets the "ExternalSupplyOrderId" element
     */
    public void setExternalSupplyOrderId(java.lang.String externalSupplyOrderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALSUPPLYORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALSUPPLYORDERID$0);
            }
            target.setStringValue(externalSupplyOrderId);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalSupplyOrderId" element
     */
    public void xsetExternalSupplyOrderId(org.apache.xmlbeans.XmlString externalSupplyOrderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALSUPPLYORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALSUPPLYORDERID$0);
            }
            target.set(externalSupplyOrderId);
        }
    }
    
    /**
     * Nils the "ExternalSupplyOrderId" element
     */
    public void setNilExternalSupplyOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALSUPPLYORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALSUPPLYORDERID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ExternalSupplyOrderId" element
     */
    public void unsetExternalSupplyOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALSUPPLYORDERID$0, 0);
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
     * Gets the "Quantity" element
     */
    public int getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$4, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$4);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANTITY$4);
            }
            target.set(quantity);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$6, 0);
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
            return get_store().count_elements(SELLERPRODUCTREFERENCE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTREFERENCE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$6);
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
            get_store().remove_element(SELLERPRODUCTREFERENCE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$8, 0);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$8, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSE$8);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$8);
            }
            target.set(warehouse);
        }
    }
    
    /**
     * Gets the "WarehouseReceptionMinDate" element
     */
    public java.util.Calendar getWarehouseReceptionMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "WarehouseReceptionMinDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetWarehouseReceptionMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "WarehouseReceptionMinDate" element
     */
    public boolean isNilWarehouseReceptionMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "WarehouseReceptionMinDate" element
     */
    public boolean isSetWarehouseReceptionMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAREHOUSERECEPTIONMINDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "WarehouseReceptionMinDate" element
     */
    public void setWarehouseReceptionMinDate(java.util.Calendar warehouseReceptionMinDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$10);
            }
            target.setCalendarValue(warehouseReceptionMinDate);
        }
    }
    
    /**
     * Sets (as xml) the "WarehouseReceptionMinDate" element
     */
    public void xsetWarehouseReceptionMinDate(org.apache.xmlbeans.XmlDateTime warehouseReceptionMinDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$10);
            }
            target.set(warehouseReceptionMinDate);
        }
    }
    
    /**
     * Nils the "WarehouseReceptionMinDate" element
     */
    public void setNilWarehouseReceptionMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "WarehouseReceptionMinDate" element
     */
    public void unsetWarehouseReceptionMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAREHOUSERECEPTIONMINDATE$10, 0);
        }
    }
}
