/*
 * XML Type:  ProductIntegrationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductIntegrationReportMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ProductIntegrationReportMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ProductIntegrationReportMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.ProductIntegrationReportMessage
{
    private static final long serialVersionUID = 1L;
    
    public ProductIntegrationReportMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFERRORS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfErrors");
    private static final javax.xml.namespace.QName PACKAGEID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PackageId");
    private static final javax.xml.namespace.QName PACKAGEINTEGRATIONSTATUS$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PackageIntegrationStatus");
    private static final javax.xml.namespace.QName PRODUCTLOGLIST$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductLogList");
    
    
    /**
     * Gets the "NumberOfErrors" element
     */
    public int getNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfErrors" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfErrors" element
     */
    public boolean isSetNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFERRORS$0) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfErrors" element
     */
    public void setNumberOfErrors(int numberOfErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFERRORS$0);
            }
            target.setIntValue(numberOfErrors);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfErrors" element
     */
    public void xsetNumberOfErrors(org.apache.xmlbeans.XmlInt numberOfErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFERRORS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFERRORS$0);
            }
            target.set(numberOfErrors);
        }
    }
    
    /**
     * Unsets the "NumberOfErrors" element
     */
    public void unsetNumberOfErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFERRORS$0, 0);
        }
    }
    
    /**
     * Gets the "PackageId" element
     */
    public long getPackageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEID$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "PackageId" element
     */
    public org.apache.xmlbeans.XmlLong xgetPackageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PACKAGEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PackageId" element
     */
    public boolean isSetPackageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGEID$2) != 0;
        }
    }
    
    /**
     * Sets the "PackageId" element
     */
    public void setPackageId(long packageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGEID$2);
            }
            target.setLongValue(packageId);
        }
    }
    
    /**
     * Sets (as xml) the "PackageId" element
     */
    public void xsetPackageId(org.apache.xmlbeans.XmlLong packageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PACKAGEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PACKAGEID$2);
            }
            target.set(packageId);
        }
    }
    
    /**
     * Unsets the "PackageId" element
     */
    public void unsetPackageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGEID$2, 0);
        }
    }
    
    /**
     * Gets the "PackageIntegrationStatus" element
     */
    public java.lang.String getPackageIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PackageIntegrationStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetPackageIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEINTEGRATIONSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PackageIntegrationStatus" element
     */
    public boolean isNilPackageIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEINTEGRATIONSTATUS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PackageIntegrationStatus" element
     */
    public boolean isSetPackageIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGEINTEGRATIONSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "PackageIntegrationStatus" element
     */
    public void setPackageIntegrationStatus(java.lang.String packageIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGEINTEGRATIONSTATUS$4);
            }
            target.setStringValue(packageIntegrationStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PackageIntegrationStatus" element
     */
    public void xsetPackageIntegrationStatus(org.apache.xmlbeans.XmlString packageIntegrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGEINTEGRATIONSTATUS$4);
            }
            target.set(packageIntegrationStatus);
        }
    }
    
    /**
     * Nils the "PackageIntegrationStatus" element
     */
    public void setNilPackageIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEINTEGRATIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGEINTEGRATIONSTATUS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PackageIntegrationStatus" element
     */
    public void unsetPackageIntegrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGEINTEGRATIONSTATUS$4, 0);
        }
    }
    
    /**
     * Gets the "ProductLogList" element
     */
    public com.cdiscount.www.ArrayOfProductReportLog getProductLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().find_element_user(PRODUCTLOGLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductLogList" element
     */
    public boolean isNilProductLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().find_element_user(PRODUCTLOGLIST$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductLogList" element
     */
    public boolean isSetProductLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTLOGLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "ProductLogList" element
     */
    public void setProductLogList(com.cdiscount.www.ArrayOfProductReportLog productLogList)
    {
        generatedSetterHelperImpl(productLogList, PRODUCTLOGLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductLogList" element
     */
    public com.cdiscount.www.ArrayOfProductReportLog addNewProductLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().add_element_user(PRODUCTLOGLIST$6);
            return target;
        }
    }
    
    /**
     * Nils the "ProductLogList" element
     */
    public void setNilProductLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().find_element_user(PRODUCTLOGLIST$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().add_element_user(PRODUCTLOGLIST$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductLogList" element
     */
    public void unsetProductLogList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTLOGLIST$6, 0);
        }
    }
}
