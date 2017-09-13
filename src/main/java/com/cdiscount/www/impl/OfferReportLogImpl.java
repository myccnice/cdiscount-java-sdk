/*
 * XML Type:  OfferReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferReportLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferReportLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferReportLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferReportLog
{
    private static final long serialVersionUID = 1L;
    
    public OfferReportLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LogDate");
    private static final javax.xml.namespace.QName OFFERINTEGRATIONSTATUS$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferIntegrationStatus");
    private static final javax.xml.namespace.QName PRODUCTEAN$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName PROPERTYLIST$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PropertyList");
    private static final javax.xml.namespace.QName SELLERPRODUCTID$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductId");
    private static final javax.xml.namespace.QName SKU$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Sku");
    private static final javax.xml.namespace.QName VALIDATED$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Validated");
    
    
    /**
     * Gets the "LogDate" element
     */
    public java.util.Calendar getLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOGDATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LogDate" element
     */
    public boolean isSetLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "LogDate" element
     */
    public void setLogDate(java.util.Calendar logDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGDATE$0);
            }
            target.setCalendarValue(logDate);
        }
    }
    
    /**
     * Sets (as xml) the "LogDate" element
     */
    public void xsetLogDate(org.apache.xmlbeans.XmlDateTime logDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOGDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LOGDATE$0);
            }
            target.set(logDate);
        }
    }
    
    /**
     * Unsets the "LogDate" element
     */
    public void unsetLogDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGDATE$0, 0);
        }
    }
    
    /**
     * Gets the "OfferIntegrationStatus" element
     */
    public java.lang.String getOfferIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferIntegrationStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINTEGRATIONSTATUS$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferIntegrationStatus" element
     */
    public boolean isNilOfferIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINTEGRATIONSTATUS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferIntegrationStatus" element
     */
    public boolean isSetOfferIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERINTEGRATIONSTATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "OfferIntegrationStatus" element
     */
    public void setOfferIntegrationStatus(java.lang.String offerIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERINTEGRATIONSTATUS$2);
            }
            target.setStringValue(offerIntegrationStatus);
        }
    }
    
    /**
     * Sets (as xml) the "OfferIntegrationStatus" element
     */
    public void xsetOfferIntegrationStatus(org.apache.xmlbeans.XmlString offerIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERINTEGRATIONSTATUS$2);
            }
            target.set(offerIntegrationStatus);
        }
    }
    
    /**
     * Nils the "OfferIntegrationStatus" element
     */
    public void setNilOfferIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERINTEGRATIONSTATUS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferIntegrationStatus" element
     */
    public void unsetOfferIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERINTEGRATIONSTATUS$2, 0);
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
     * True if has "ProductEan" element
     */
    public boolean isSetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTEAN$4) != 0;
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
     * Unsets the "ProductEan" element
     */
    public void unsetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTEAN$4, 0);
        }
    }
    
    /**
     * Gets the "PropertyList" element
     */
    public com.cdiscount.www.ArrayOfOfferReportPropertyLog getPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().find_element_user(PROPERTYLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PropertyList" element
     */
    public boolean isNilPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().find_element_user(PROPERTYLIST$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PropertyList" element
     */
    public boolean isSetPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "PropertyList" element
     */
    public void setPropertyList(com.cdiscount.www.ArrayOfOfferReportPropertyLog propertyList)
    {
        generatedSetterHelperImpl(propertyList, PROPERTYLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PropertyList" element
     */
    public com.cdiscount.www.ArrayOfOfferReportPropertyLog addNewPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().add_element_user(PROPERTYLIST$6);
            return target;
        }
    }
    
    /**
     * Nils the "PropertyList" element
     */
    public void setNilPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().find_element_user(PROPERTYLIST$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().add_element_user(PROPERTYLIST$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PropertyList" element
     */
    public void unsetPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYLIST$6, 0);
        }
    }
    
    /**
     * Gets the "SellerProductId" element
     */
    public java.lang.String getSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerProductId" element
     */
    public boolean isNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerProductId" element
     */
    public boolean isSetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERPRODUCTID$8) != 0;
        }
    }
    
    /**
     * Sets the "SellerProductId" element
     */
    public void setSellerProductId(java.lang.String sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTID$8);
            }
            target.setStringValue(sellerProductId);
        }
    }
    
    /**
     * Sets (as xml) the "SellerProductId" element
     */
    public void xsetSellerProductId(org.apache.xmlbeans.XmlString sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$8);
            }
            target.set(sellerProductId);
        }
    }
    
    /**
     * Nils the "SellerProductId" element
     */
    public void setNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerProductId" element
     */
    public void unsetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERPRODUCTID$8, 0);
        }
    }
    
    /**
     * Gets the "Sku" element
     */
    public java.lang.String getSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sku" element
     */
    public org.apache.xmlbeans.XmlString xgetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Sku" element
     */
    public boolean isNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Sku" element
     */
    public boolean isSetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKU$10) != 0;
        }
    }
    
    /**
     * Sets the "Sku" element
     */
    public void setSku(java.lang.String sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKU$10);
            }
            target.setStringValue(sku);
        }
    }
    
    /**
     * Sets (as xml) the "Sku" element
     */
    public void xsetSku(org.apache.xmlbeans.XmlString sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$10);
            }
            target.set(sku);
        }
    }
    
    /**
     * Nils the "Sku" element
     */
    public void setNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Sku" element
     */
    public void unsetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKU$10, 0);
        }
    }
    
    /**
     * Gets the "Validated" element
     */
    public boolean getValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Validated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Validated" element
     */
    public boolean isSetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATED$12) != 0;
        }
    }
    
    /**
     * Sets the "Validated" element
     */
    public void setValidated(boolean validated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATED$12);
            }
            target.setBooleanValue(validated);
        }
    }
    
    /**
     * Sets (as xml) the "Validated" element
     */
    public void xsetValidated(org.apache.xmlbeans.XmlBoolean validated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALIDATED$12);
            }
            target.set(validated);
        }
    }
    
    /**
     * Unsets the "Validated" element
     */
    public void unsetValidated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATED$12, 0);
        }
    }
}
