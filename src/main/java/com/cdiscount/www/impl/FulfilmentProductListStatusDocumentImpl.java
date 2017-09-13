/*
 * An XML document type.
 * Localname: FulfilmentProductListStatus
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentProductListStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentProductListStatus(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentProductListStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentProductListStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentProductListStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTPRODUCTLISTSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentProductListStatus");
    
    
    /**
     * Gets the "FulfilmentProductListStatus" element
     */
    public com.cdiscount.www.FulfilmentProductListStatus.Enum getFulfilmentProductListStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILMENTPRODUCTLISTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.FulfilmentProductListStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FulfilmentProductListStatus" element
     */
    public com.cdiscount.www.FulfilmentProductListStatus xgetFulfilmentProductListStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductListStatus target = null;
            target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().find_element_user(FULFILMENTPRODUCTLISTSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentProductListStatus" element
     */
    public boolean isNilFulfilmentProductListStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductListStatus target = null;
            target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().find_element_user(FULFILMENTPRODUCTLISTSTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentProductListStatus" element
     */
    public void setFulfilmentProductListStatus(com.cdiscount.www.FulfilmentProductListStatus.Enum fulfilmentProductListStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILMENTPRODUCTLISTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULFILMENTPRODUCTLISTSTATUS$0);
            }
            target.setEnumValue(fulfilmentProductListStatus);
        }
    }
    
    /**
     * Sets (as xml) the "FulfilmentProductListStatus" element
     */
    public void xsetFulfilmentProductListStatus(com.cdiscount.www.FulfilmentProductListStatus fulfilmentProductListStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductListStatus target = null;
            target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().find_element_user(FULFILMENTPRODUCTLISTSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().add_element_user(FULFILMENTPRODUCTLISTSTATUS$0);
            }
            target.set(fulfilmentProductListStatus);
        }
    }
    
    /**
     * Nils the "FulfilmentProductListStatus" element
     */
    public void setNilFulfilmentProductListStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductListStatus target = null;
            target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().find_element_user(FULFILMENTPRODUCTLISTSTATUS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentProductListStatus)get_store().add_element_user(FULFILMENTPRODUCTLISTSTATUS$0);
            }
            target.setNil();
        }
    }
}
