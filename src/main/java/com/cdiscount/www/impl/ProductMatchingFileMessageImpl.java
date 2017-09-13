/*
 * XML Type:  ProductMatchingFileMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductMatchingFileMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ProductMatchingFileMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ProductMatchingFileMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.ProductMatchingFileMessage
{
    private static final long serialVersionUID = 1L;
    
    public ProductMatchingFileMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PackageId");
    private static final javax.xml.namespace.QName PRODUCTMATCHINGLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductMatchingList");
    
    
    /**
     * Gets the "PackageId" element
     */
    public long getPackageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEID$0, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PACKAGEID$0, 0);
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
            return get_store().count_elements(PACKAGEID$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGEID$0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PACKAGEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PACKAGEID$0);
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
            get_store().remove_element(PACKAGEID$0, 0);
        }
    }
    
    /**
     * Gets the "ProductMatchingList" element
     */
    public com.cdiscount.www.ArrayOfProductMatching getProductMatchingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().find_element_user(PRODUCTMATCHINGLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductMatchingList" element
     */
    public boolean isNilProductMatchingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().find_element_user(PRODUCTMATCHINGLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductMatchingList" element
     */
    public boolean isSetProductMatchingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTMATCHINGLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductMatchingList" element
     */
    public void setProductMatchingList(com.cdiscount.www.ArrayOfProductMatching productMatchingList)
    {
        generatedSetterHelperImpl(productMatchingList, PRODUCTMATCHINGLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductMatchingList" element
     */
    public com.cdiscount.www.ArrayOfProductMatching addNewProductMatchingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().add_element_user(PRODUCTMATCHINGLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "ProductMatchingList" element
     */
    public void setNilProductMatchingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductMatching target = null;
            target = (com.cdiscount.www.ArrayOfProductMatching)get_store().find_element_user(PRODUCTMATCHINGLIST$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductMatching)get_store().add_element_user(PRODUCTMATCHINGLIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductMatchingList" element
     */
    public void unsetProductMatchingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTMATCHINGLIST$2, 0);
        }
    }
}
