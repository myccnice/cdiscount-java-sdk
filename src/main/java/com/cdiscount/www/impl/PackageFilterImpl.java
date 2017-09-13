/*
 * XML Type:  PackageFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.PackageFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML PackageFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class PackageFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.PackageFilter
{
    private static final long serialVersionUID = 1L;
    
    public PackageFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PackageID");
    
    
    /**
     * Gets the "PackageID" element
     */
    public long getPackageID()
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
     * Gets (as xml) the "PackageID" element
     */
    public org.apache.xmlbeans.XmlLong xgetPackageID()
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
     * True if has "PackageID" element
     */
    public boolean isSetPackageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGEID$0) != 0;
        }
    }
    
    /**
     * Sets the "PackageID" element
     */
    public void setPackageID(long packageID)
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
            target.setLongValue(packageID);
        }
    }
    
    /**
     * Sets (as xml) the "PackageID" element
     */
    public void xsetPackageID(org.apache.xmlbeans.XmlLong packageID)
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
            target.set(packageID);
        }
    }
    
    /**
     * Unsets the "PackageID" element
     */
    public void unsetPackageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGEID$0, 0);
        }
    }
}
