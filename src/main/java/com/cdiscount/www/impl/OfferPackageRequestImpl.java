/*
 * XML Type:  OfferPackageRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferPackageRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferPackageRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferPackageRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferPackageRequest
{
    private static final long serialVersionUID = 1L;
    
    public OfferPackageRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ZIPFILEFULLPATH$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ZipFileFullPath");
    
    
    /**
     * Gets the "ZipFileFullPath" element
     */
    public java.lang.String getZipFileFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPFILEFULLPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ZipFileFullPath" element
     */
    public org.apache.xmlbeans.XmlString xgetZipFileFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPFILEFULLPATH$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ZipFileFullPath" element
     */
    public boolean isNilZipFileFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPFILEFULLPATH$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ZipFileFullPath" element
     */
    public boolean isSetZipFileFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZIPFILEFULLPATH$0) != 0;
        }
    }
    
    /**
     * Sets the "ZipFileFullPath" element
     */
    public void setZipFileFullPath(java.lang.String zipFileFullPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPFILEFULLPATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPFILEFULLPATH$0);
            }
            target.setStringValue(zipFileFullPath);
        }
    }
    
    /**
     * Sets (as xml) the "ZipFileFullPath" element
     */
    public void xsetZipFileFullPath(org.apache.xmlbeans.XmlString zipFileFullPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPFILEFULLPATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPFILEFULLPATH$0);
            }
            target.set(zipFileFullPath);
        }
    }
    
    /**
     * Nils the "ZipFileFullPath" element
     */
    public void setNilZipFileFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPFILEFULLPATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPFILEFULLPATH$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ZipFileFullPath" element
     */
    public void unsetZipFileFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZIPFILEFULLPATH$0, 0);
        }
    }
}
