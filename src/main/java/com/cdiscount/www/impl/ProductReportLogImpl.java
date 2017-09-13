/*
 * XML Type:  ProductReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductReportLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ProductReportLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ProductReportLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductReportLog
{
    private static final long serialVersionUID = 1L;
    
    public ProductReportLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LogDate");
    private static final javax.xml.namespace.QName PRODUCTINTEGRATIONSTATUS$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductIntegrationStatus");
    private static final javax.xml.namespace.QName PROPERTYLIST$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PropertyList");
    private static final javax.xml.namespace.QName SKU$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SKU");
    private static final javax.xml.namespace.QName VALIDATED$8 = 
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
     * Gets the "ProductIntegrationStatus" element
     */
    public java.lang.String getProductIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductIntegrationStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetProductIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTINTEGRATIONSTATUS$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductIntegrationStatus" element
     */
    public boolean isNilProductIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTINTEGRATIONSTATUS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductIntegrationStatus" element
     */
    public boolean isSetProductIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTINTEGRATIONSTATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductIntegrationStatus" element
     */
    public void setProductIntegrationStatus(java.lang.String productIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTINTEGRATIONSTATUS$2);
            }
            target.setStringValue(productIntegrationStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ProductIntegrationStatus" element
     */
    public void xsetProductIntegrationStatus(org.apache.xmlbeans.XmlString productIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTINTEGRATIONSTATUS$2);
            }
            target.set(productIntegrationStatus);
        }
    }
    
    /**
     * Nils the "ProductIntegrationStatus" element
     */
    public void setNilProductIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTINTEGRATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTINTEGRATIONSTATUS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductIntegrationStatus" element
     */
    public void unsetProductIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTINTEGRATIONSTATUS$2, 0);
        }
    }
    
    /**
     * Gets the "PropertyList" element
     */
    public com.cdiscount.www.ArrayOfProductReportPropertyLog getPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().find_element_user(PROPERTYLIST$4, 0);
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
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().find_element_user(PROPERTYLIST$4, 0);
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
            return get_store().count_elements(PROPERTYLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "PropertyList" element
     */
    public void setPropertyList(com.cdiscount.www.ArrayOfProductReportPropertyLog propertyList)
    {
        generatedSetterHelperImpl(propertyList, PROPERTYLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PropertyList" element
     */
    public com.cdiscount.www.ArrayOfProductReportPropertyLog addNewPropertyList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().add_element_user(PROPERTYLIST$4);
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
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().find_element_user(PROPERTYLIST$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().add_element_user(PROPERTYLIST$4);
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
            get_store().remove_element(PROPERTYLIST$4, 0);
        }
    }
    
    /**
     * Gets the "SKU" element
     */
    public java.lang.String getSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SKU" element
     */
    public org.apache.xmlbeans.XmlString xgetSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SKU" element
     */
    public boolean isNilSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SKU" element
     */
    public boolean isSetSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKU$6) != 0;
        }
    }
    
    /**
     * Sets the "SKU" element
     */
    public void setSKU(java.lang.String sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKU$6);
            }
            target.setStringValue(sku);
        }
    }
    
    /**
     * Sets (as xml) the "SKU" element
     */
    public void xsetSKU(org.apache.xmlbeans.XmlString sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$6);
            }
            target.set(sku);
        }
    }
    
    /**
     * Nils the "SKU" element
     */
    public void setNilSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SKU" element
     */
    public void unsetSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKU$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$8, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$8, 0);
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
            return get_store().count_elements(VALIDATED$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATED$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALIDATED$8);
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
            get_store().remove_element(VALIDATED$8, 0);
        }
    }
}
