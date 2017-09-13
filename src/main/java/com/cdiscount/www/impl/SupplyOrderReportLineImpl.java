/*
 * XML Type:  SupplyOrderReportLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderReportLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SupplyOrderReportLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SupplyOrderReportLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderReportLine
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderReportLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ErrorDetails");
    private static final javax.xml.namespace.QName ORDEREDQUANTITY$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderedQuantity");
    private static final javax.xml.namespace.QName PRODUCTEAN$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName SELLERID$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerId");
    private static final javax.xml.namespace.QName SELLERPRODUCTREFERENCE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductReference");
    private static final javax.xml.namespace.QName SELLERSUPPLYORDERNUMBER$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerSupplyOrderNumber");
    private static final javax.xml.namespace.QName SUPPLYORDERNUMBER$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderNumber");
    private static final javax.xml.namespace.QName WAREHOUSE$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Warehouse");
    private static final javax.xml.namespace.QName WAREHOUSERECEPTIONMINDATE$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "WarehouseReceptionMinDate");
    
    
    /**
     * Gets the "ErrorDetails" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring getErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(ERRORDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorDetails" element
     */
    public boolean isNilErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(ERRORDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorDetails" element
     */
    public boolean isSetErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORDETAILS$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorDetails" element
     */
    public void setErrorDetails(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring errorDetails)
    {
        generatedSetterHelperImpl(errorDetails, ERRORDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ErrorDetails" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring addNewErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().add_element_user(ERRORDETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ErrorDetails" element
     */
    public void setNilErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(ERRORDETAILS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().add_element_user(ERRORDETAILS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorDetails" element
     */
    public void unsetErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORDETAILS$0, 0);
        }
    }
    
    /**
     * Gets the "OrderedQuantity" element
     */
    public int getOrderedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDEREDQUANTITY$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderedQuantity" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrderedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDEREDQUANTITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderedQuantity" element
     */
    public void setOrderedQuantity(int orderedQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDEREDQUANTITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDEREDQUANTITY$2);
            }
            target.setIntValue(orderedQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "OrderedQuantity" element
     */
    public void xsetOrderedQuantity(org.apache.xmlbeans.XmlInt orderedQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDEREDQUANTITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDEREDQUANTITY$2);
            }
            target.set(orderedQuantity);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTEAN$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "SellerId" element
     */
    public long getSellerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERID$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerId" element
     */
    public org.apache.xmlbeans.XmlLong xgetSellerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SELLERID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SellerId" element
     */
    public boolean isSetSellerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERID$6) != 0;
        }
    }
    
    /**
     * Sets the "SellerId" element
     */
    public void setSellerId(long sellerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERID$6);
            }
            target.setLongValue(sellerId);
        }
    }
    
    /**
     * Sets (as xml) the "SellerId" element
     */
    public void xsetSellerId(org.apache.xmlbeans.XmlLong sellerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SELLERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SELLERID$6);
            }
            target.set(sellerId);
        }
    }
    
    /**
     * Unsets the "SellerId" element
     */
    public void unsetSellerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERID$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$8, 0);
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
            return get_store().count_elements(SELLERPRODUCTREFERENCE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTREFERENCE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$8);
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
            get_store().remove_element(SELLERPRODUCTREFERENCE$8, 0);
        }
    }
    
    /**
     * Gets the "SellerSupplyOrderNumber" element
     */
    public java.lang.String getSellerSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerSupplyOrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerSupplyOrderNumber" element
     */
    public boolean isNilSellerSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerSupplyOrderNumber" element
     */
    public boolean isSetSellerSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERSUPPLYORDERNUMBER$10) != 0;
        }
    }
    
    /**
     * Sets the "SellerSupplyOrderNumber" element
     */
    public void setSellerSupplyOrderNumber(java.lang.String sellerSupplyOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERSUPPLYORDERNUMBER$10);
            }
            target.setStringValue(sellerSupplyOrderNumber);
        }
    }
    
    /**
     * Sets (as xml) the "SellerSupplyOrderNumber" element
     */
    public void xsetSellerSupplyOrderNumber(org.apache.xmlbeans.XmlString sellerSupplyOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERSUPPLYORDERNUMBER$10);
            }
            target.set(sellerSupplyOrderNumber);
        }
    }
    
    /**
     * Nils the "SellerSupplyOrderNumber" element
     */
    public void setNilSellerSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERSUPPLYORDERNUMBER$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerSupplyOrderNumber" element
     */
    public void unsetSellerSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERSUPPLYORDERNUMBER$10, 0);
        }
    }
    
    /**
     * Gets the "SupplyOrderNumber" element
     */
    public java.lang.String getSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYORDERNUMBER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupplyOrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderNumber" element
     */
    public boolean isNilSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderNumber" element
     */
    public void setSupplyOrderNumber(java.lang.String supplyOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLYORDERNUMBER$12);
            }
            target.setStringValue(supplyOrderNumber);
        }
    }
    
    /**
     * Sets (as xml) the "SupplyOrderNumber" element
     */
    public void xsetSupplyOrderNumber(org.apache.xmlbeans.XmlString supplyOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPPLYORDERNUMBER$12);
            }
            target.set(supplyOrderNumber);
        }
    }
    
    /**
     * Nils the "SupplyOrderNumber" element
     */
    public void setNilSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPPLYORDERNUMBER$12);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$14, 0);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$14, 0);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$14, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSE$14);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$14, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$14);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$14, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$14);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$16, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$16, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$16, 0);
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
            return get_store().count_elements(WAREHOUSERECEPTIONMINDATE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$16);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$16);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$16);
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
            get_store().remove_element(WAREHOUSERECEPTIONMINDATE$16, 0);
        }
    }
}
