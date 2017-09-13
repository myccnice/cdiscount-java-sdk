/*
 * An XML document type.
 * Localname: PackageFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.PackageFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one PackageFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class PackageFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.PackageFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public PackageFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PackageFilter");
    
    
    /**
     * Gets the "PackageFilter" element
     */
    public com.cdiscount.www.PackageFilter getPackageFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PackageFilter target = null;
            target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(PACKAGEFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PackageFilter" element
     */
    public boolean isNilPackageFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PackageFilter target = null;
            target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(PACKAGEFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PackageFilter" element
     */
    public void setPackageFilter(com.cdiscount.www.PackageFilter packageFilter)
    {
        generatedSetterHelperImpl(packageFilter, PACKAGEFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PackageFilter" element
     */
    public com.cdiscount.www.PackageFilter addNewPackageFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PackageFilter target = null;
            target = (com.cdiscount.www.PackageFilter)get_store().add_element_user(PACKAGEFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "PackageFilter" element
     */
    public void setNilPackageFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PackageFilter target = null;
            target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(PACKAGEFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.PackageFilter)get_store().add_element_user(PACKAGEFILTER$0);
            }
            target.setNil();
        }
    }
}
