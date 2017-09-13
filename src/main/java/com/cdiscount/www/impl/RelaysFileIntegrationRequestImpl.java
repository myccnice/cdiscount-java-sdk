/*
 * XML Type:  RelaysFileIntegrationRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelaysFileIntegrationRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML RelaysFileIntegrationRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class RelaysFileIntegrationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RelaysFileIntegrationRequest
{
    private static final long serialVersionUID = 1L;
    
    public RelaysFileIntegrationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYSFILEURI$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysFileURI");
    
    
    /**
     * Gets the "RelaysFileURI" element
     */
    public java.lang.String getRelaysFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelaysFileURI" element
     */
    public org.apache.xmlbeans.XmlString xgetRelaysFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEURI$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RelaysFileURI" element
     */
    public boolean isNilRelaysFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEURI$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RelaysFileURI" element
     */
    public boolean isSetRelaysFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELAYSFILEURI$0) != 0;
        }
    }
    
    /**
     * Sets the "RelaysFileURI" element
     */
    public void setRelaysFileURI(java.lang.String relaysFileURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELAYSFILEURI$0);
            }
            target.setStringValue(relaysFileURI);
        }
    }
    
    /**
     * Sets (as xml) the "RelaysFileURI" element
     */
    public void xsetRelaysFileURI(org.apache.xmlbeans.XmlString relaysFileURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELAYSFILEURI$0);
            }
            target.set(relaysFileURI);
        }
    }
    
    /**
     * Nils the "RelaysFileURI" element
     */
    public void setNilRelaysFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELAYSFILEURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELAYSFILEURI$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RelaysFileURI" element
     */
    public void unsetRelaysFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELAYSFILEURI$0, 0);
        }
    }
}
