/*
 * An XML document type.
 * Localname: ExternalOrderStatus
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ExternalOrderStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ExternalOrderStatus(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ExternalOrderStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ExternalOrderStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalOrderStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALORDERSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ExternalOrderStatus");
    
    
    /**
     * Gets the "ExternalOrderStatus" element
     */
    public com.cdiscount.www.ExternalOrderStatus.Enum getExternalOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALORDERSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ExternalOrderStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalOrderStatus" element
     */
    public com.cdiscount.www.ExternalOrderStatus xgetExternalOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ExternalOrderStatus target = null;
            target = (com.cdiscount.www.ExternalOrderStatus)get_store().find_element_user(EXTERNALORDERSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ExternalOrderStatus" element
     */
    public boolean isNilExternalOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ExternalOrderStatus target = null;
            target = (com.cdiscount.www.ExternalOrderStatus)get_store().find_element_user(EXTERNALORDERSTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ExternalOrderStatus" element
     */
    public void setExternalOrderStatus(com.cdiscount.www.ExternalOrderStatus.Enum externalOrderStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALORDERSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALORDERSTATUS$0);
            }
            target.setEnumValue(externalOrderStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalOrderStatus" element
     */
    public void xsetExternalOrderStatus(com.cdiscount.www.ExternalOrderStatus externalOrderStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ExternalOrderStatus target = null;
            target = (com.cdiscount.www.ExternalOrderStatus)get_store().find_element_user(EXTERNALORDERSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ExternalOrderStatus)get_store().add_element_user(EXTERNALORDERSTATUS$0);
            }
            target.set(externalOrderStatus);
        }
    }
    
    /**
     * Nils the "ExternalOrderStatus" element
     */
    public void setNilExternalOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ExternalOrderStatus target = null;
            target = (com.cdiscount.www.ExternalOrderStatus)get_store().find_element_user(EXTERNALORDERSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ExternalOrderStatus)get_store().add_element_user(EXTERNALORDERSTATUS$0);
            }
            target.setNil();
        }
    }
}
