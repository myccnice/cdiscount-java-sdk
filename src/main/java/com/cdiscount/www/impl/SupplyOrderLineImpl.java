/*
 * XML Type:  SupplyOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SupplyOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SupplyOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISFOD$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsFod");
    private static final javax.xml.namespace.QName ORDERREFERENCELIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderReferenceList");
    private static final javax.xml.namespace.QName ORDEREDQUANTITY$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderedQuantity");
    private static final javax.xml.namespace.QName PRODUCTEAN$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName RECEIVEDQUANTITY$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ReceivedQuantity");
    private static final javax.xml.namespace.QName SELLERPRODUCTREFERENCE$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductReference");
    private static final javax.xml.namespace.QName SELLERSUPPLYORDERNUMBER$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerSupplyOrderNumber");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Status");
    private static final javax.xml.namespace.QName SUPPLYORDERNUMBER$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderNumber");
    private static final javax.xml.namespace.QName UNDELIVEREDQUANTITY$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "UndeliveredQuantity");
    private static final javax.xml.namespace.QName WAREHOUSE$20 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Warehouse");
    private static final javax.xml.namespace.QName WAREHOUSERECEPTIONMINDATE$22 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "WarehouseReceptionMinDate");
    
    
    /**
     * Gets the "IsFod" element
     */
    public boolean getIsFod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFOD$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsFod" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsFod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFOD$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsFod" element
     */
    public boolean isSetIsFod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISFOD$0) != 0;
        }
    }
    
    /**
     * Sets the "IsFod" element
     */
    public void setIsFod(boolean isFod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISFOD$0);
            }
            target.setBooleanValue(isFod);
        }
    }
    
    /**
     * Sets (as xml) the "IsFod" element
     */
    public void xsetIsFod(org.apache.xmlbeans.XmlBoolean isFod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISFOD$0);
            }
            target.set(isFod);
        }
    }
    
    /**
     * Unsets the "IsFod" element
     */
    public void unsetIsFod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISFOD$0, 0);
        }
    }
    
    /**
     * Gets the "OrderReferenceList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERREFERENCELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderReferenceList" element
     */
    public boolean isNilOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERREFERENCELIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderReferenceList" element
     */
    public boolean isSetOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERREFERENCELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "OrderReferenceList" element
     */
    public void setOrderReferenceList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring orderReferenceList)
    {
        generatedSetterHelperImpl(orderReferenceList, ORDERREFERENCELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderReferenceList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ORDERREFERENCELIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "OrderReferenceList" element
     */
    public void setNilOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERREFERENCELIST$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ORDERREFERENCELIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderReferenceList" element
     */
    public void unsetOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERREFERENCELIST$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDEREDQUANTITY$4, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDEREDQUANTITY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderedQuantity" element
     */
    public boolean isSetOrderedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDEREDQUANTITY$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDEREDQUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDEREDQUANTITY$4);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDEREDQUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDEREDQUANTITY$4);
            }
            target.set(orderedQuantity);
        }
    }
    
    /**
     * Unsets the "OrderedQuantity" element
     */
    public void unsetOrderedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDEREDQUANTITY$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$6, 0);
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
            return get_store().count_elements(PRODUCTEAN$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTEAN$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$6);
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
            get_store().remove_element(PRODUCTEAN$6, 0);
        }
    }
    
    /**
     * Gets the "ReceivedQuantity" element
     */
    public int getReceivedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDQUANTITY$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReceivedQuantity" element
     */
    public org.apache.xmlbeans.XmlInt xgetReceivedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECEIVEDQUANTITY$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ReceivedQuantity" element
     */
    public boolean isNilReceivedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECEIVEDQUANTITY$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ReceivedQuantity" element
     */
    public boolean isSetReceivedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDQUANTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "ReceivedQuantity" element
     */
    public void setReceivedQuantity(int receivedQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDQUANTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVEDQUANTITY$8);
            }
            target.setIntValue(receivedQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "ReceivedQuantity" element
     */
    public void xsetReceivedQuantity(org.apache.xmlbeans.XmlInt receivedQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECEIVEDQUANTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECEIVEDQUANTITY$8);
            }
            target.set(receivedQuantity);
        }
    }
    
    /**
     * Nils the "ReceivedQuantity" element
     */
    public void setNilReceivedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECEIVEDQUANTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECEIVEDQUANTITY$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ReceivedQuantity" element
     */
    public void unsetReceivedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDQUANTITY$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$10, 0);
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
            return get_store().count_elements(SELLERPRODUCTREFERENCE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTREFERENCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTREFERENCE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTREFERENCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTREFERENCE$10);
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
            get_store().remove_element(SELLERPRODUCTREFERENCE$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$12, 0);
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
            return get_store().count_elements(SELLERSUPPLYORDERNUMBER$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERSUPPLYORDERNUMBER$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERSUPPLYORDERNUMBER$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERSUPPLYORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERSUPPLYORDERNUMBER$12);
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
            get_store().remove_element(SELLERSUPPLYORDERNUMBER$12, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.cdiscount.www.SupplyOrderStatusType.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$14, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SupplyOrderStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.cdiscount.www.SupplyOrderStatusType xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(STATUS$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Status" element
     */
    public boolean isNilStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(STATUS$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$14) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.cdiscount.www.SupplyOrderStatusType.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$14);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.cdiscount.www.SupplyOrderStatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(STATUS$14, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderStatusType)get_store().add_element_user(STATUS$14);
            }
            target.set(status);
        }
    }
    
    /**
     * Nils the "Status" element
     */
    public void setNilStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(STATUS$14, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderStatusType)get_store().add_element_user(STATUS$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYORDERNUMBER$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SupplyOrderNumber" element
     */
    public boolean isSetSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYORDERNUMBER$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYORDERNUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLYORDERNUMBER$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPPLYORDERNUMBER$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYORDERNUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPPLYORDERNUMBER$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SupplyOrderNumber" element
     */
    public void unsetSupplyOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYORDERNUMBER$16, 0);
        }
    }
    
    /**
     * Gets the "UndeliveredQuantity" element
     */
    public int getUndeliveredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDELIVEREDQUANTITY$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UndeliveredQuantity" element
     */
    public org.apache.xmlbeans.XmlInt xgetUndeliveredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNDELIVEREDQUANTITY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "UndeliveredQuantity" element
     */
    public boolean isSetUndeliveredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNDELIVEREDQUANTITY$18) != 0;
        }
    }
    
    /**
     * Sets the "UndeliveredQuantity" element
     */
    public void setUndeliveredQuantity(int undeliveredQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDELIVEREDQUANTITY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNDELIVEREDQUANTITY$18);
            }
            target.setIntValue(undeliveredQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "UndeliveredQuantity" element
     */
    public void xsetUndeliveredQuantity(org.apache.xmlbeans.XmlInt undeliveredQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNDELIVEREDQUANTITY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNDELIVEREDQUANTITY$18);
            }
            target.set(undeliveredQuantity);
        }
    }
    
    /**
     * Unsets the "UndeliveredQuantity" element
     */
    public void unsetUndeliveredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNDELIVEREDQUANTITY$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$20, 0);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$20, 0);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$20, 0);
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
            return get_store().count_elements(WAREHOUSE$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSE$20);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$20, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$20);
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
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSE$20, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSE$20);
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
            get_store().remove_element(WAREHOUSE$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$22, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$22, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$22, 0);
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
            return get_store().count_elements(WAREHOUSERECEPTIONMINDATE$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$22);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$22);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WAREHOUSERECEPTIONMINDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WAREHOUSERECEPTIONMINDATE$22);
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
            get_store().remove_element(WAREHOUSERECEPTIONMINDATE$22, 0);
        }
    }
}
