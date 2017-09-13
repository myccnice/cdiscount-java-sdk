/*
 * An XML document type.
 * Localname: FulfilmentProductActionType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentProductActionTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentProductActionType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentProductActionTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentProductActionTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentProductActionTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTPRODUCTACTIONTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentProductActionType");
    
    
    /**
     * Gets the "FulfilmentProductActionType" element
     */
    public com.cdiscount.www.FulfilmentProductActionType.Enum getFulfilmentProductActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILMENTPRODUCTACTIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.FulfilmentProductActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FulfilmentProductActionType" element
     */
    public com.cdiscount.www.FulfilmentProductActionType xgetFulfilmentProductActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductActionType target = null;
            target = (com.cdiscount.www.FulfilmentProductActionType)get_store().find_element_user(FULFILMENTPRODUCTACTIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentProductActionType" element
     */
    public boolean isNilFulfilmentProductActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductActionType target = null;
            target = (com.cdiscount.www.FulfilmentProductActionType)get_store().find_element_user(FULFILMENTPRODUCTACTIONTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentProductActionType" element
     */
    public void setFulfilmentProductActionType(com.cdiscount.www.FulfilmentProductActionType.Enum fulfilmentProductActionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULFILMENTPRODUCTACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULFILMENTPRODUCTACTIONTYPE$0);
            }
            target.setEnumValue(fulfilmentProductActionType);
        }
    }
    
    /**
     * Sets (as xml) the "FulfilmentProductActionType" element
     */
    public void xsetFulfilmentProductActionType(com.cdiscount.www.FulfilmentProductActionType fulfilmentProductActionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductActionType target = null;
            target = (com.cdiscount.www.FulfilmentProductActionType)get_store().find_element_user(FULFILMENTPRODUCTACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentProductActionType)get_store().add_element_user(FULFILMENTPRODUCTACTIONTYPE$0);
            }
            target.set(fulfilmentProductActionType);
        }
    }
    
    /**
     * Nils the "FulfilmentProductActionType" element
     */
    public void setNilFulfilmentProductActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductActionType target = null;
            target = (com.cdiscount.www.FulfilmentProductActionType)get_store().find_element_user(FULFILMENTPRODUCTACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentProductActionType)get_store().add_element_user(FULFILMENTPRODUCTACTIONTYPE$0);
            }
            target.setNil();
        }
    }
}
