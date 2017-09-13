/*
 * An XML document type.
 * Localname: RelaysFileFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelaysFileFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RelaysFileFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RelaysFileFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RelaysFileFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelaysFileFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYSFILEFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysFileFilter");
    
    
    /**
     * Gets the "RelaysFileFilter" element
     */
    public com.cdiscount.www.RelaysFileFilter getRelaysFileFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileFilter target = null;
            target = (com.cdiscount.www.RelaysFileFilter)get_store().find_element_user(RELAYSFILEFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelaysFileFilter" element
     */
    public boolean isNilRelaysFileFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileFilter target = null;
            target = (com.cdiscount.www.RelaysFileFilter)get_store().find_element_user(RELAYSFILEFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelaysFileFilter" element
     */
    public void setRelaysFileFilter(com.cdiscount.www.RelaysFileFilter relaysFileFilter)
    {
        generatedSetterHelperImpl(relaysFileFilter, RELAYSFILEFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelaysFileFilter" element
     */
    public com.cdiscount.www.RelaysFileFilter addNewRelaysFileFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileFilter target = null;
            target = (com.cdiscount.www.RelaysFileFilter)get_store().add_element_user(RELAYSFILEFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelaysFileFilter" element
     */
    public void setNilRelaysFileFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileFilter target = null;
            target = (com.cdiscount.www.RelaysFileFilter)get_store().find_element_user(RELAYSFILEFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RelaysFileFilter)get_store().add_element_user(RELAYSFILEFILTER$0);
            }
            target.setNil();
        }
    }
}
