/*
 * An XML document type.
 * Localname: FbcReferencementFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FbcReferencementFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FbcReferencementFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FbcReferencementFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FbcReferencementFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public FbcReferencementFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FBCREFERENCEMENTFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FbcReferencementFilter");
    
    
    /**
     * Gets the "FbcReferencementFilter" element
     */
    public com.cdiscount.www.FbcReferencementFilter.Enum getFbcReferencementFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FBCREFERENCEMENTFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.FbcReferencementFilter.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FbcReferencementFilter" element
     */
    public com.cdiscount.www.FbcReferencementFilter xgetFbcReferencementFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FbcReferencementFilter target = null;
            target = (com.cdiscount.www.FbcReferencementFilter)get_store().find_element_user(FBCREFERENCEMENTFILTER$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FbcReferencementFilter" element
     */
    public boolean isNilFbcReferencementFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FbcReferencementFilter target = null;
            target = (com.cdiscount.www.FbcReferencementFilter)get_store().find_element_user(FBCREFERENCEMENTFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FbcReferencementFilter" element
     */
    public void setFbcReferencementFilter(com.cdiscount.www.FbcReferencementFilter.Enum fbcReferencementFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FBCREFERENCEMENTFILTER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FBCREFERENCEMENTFILTER$0);
            }
            target.setEnumValue(fbcReferencementFilter);
        }
    }
    
    /**
     * Sets (as xml) the "FbcReferencementFilter" element
     */
    public void xsetFbcReferencementFilter(com.cdiscount.www.FbcReferencementFilter fbcReferencementFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FbcReferencementFilter target = null;
            target = (com.cdiscount.www.FbcReferencementFilter)get_store().find_element_user(FBCREFERENCEMENTFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FbcReferencementFilter)get_store().add_element_user(FBCREFERENCEMENTFILTER$0);
            }
            target.set(fbcReferencementFilter);
        }
    }
    
    /**
     * Nils the "FbcReferencementFilter" element
     */
    public void setNilFbcReferencementFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FbcReferencementFilter target = null;
            target = (com.cdiscount.www.FbcReferencementFilter)get_store().find_element_user(FBCREFERENCEMENTFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FbcReferencementFilter)get_store().add_element_user(FBCREFERENCEMENTFILTER$0);
            }
            target.setNil();
        }
    }
}
