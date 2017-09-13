/*
 * An XML document type.
 * Localname: SupplyOrderStatusType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderStatusTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderStatusType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderStatusTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderStatusTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderStatusTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERSTATUSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderStatusType");
    
    
    /**
     * Gets the "SupplyOrderStatusType" element
     */
    public com.cdiscount.www.SupplyOrderStatusType.Enum getSupplyOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SupplyOrderStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupplyOrderStatusType" element
     */
    public com.cdiscount.www.SupplyOrderStatusType xgetSupplyOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(SUPPLYORDERSTATUSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderStatusType" element
     */
    public boolean isNilSupplyOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(SUPPLYORDERSTATUSTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderStatusType" element
     */
    public void setSupplyOrderStatusType(com.cdiscount.www.SupplyOrderStatusType.Enum supplyOrderStatusType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLYORDERSTATUSTYPE$0);
            }
            target.setEnumValue(supplyOrderStatusType);
        }
    }
    
    /**
     * Sets (as xml) the "SupplyOrderStatusType" element
     */
    public void xsetSupplyOrderStatusType(com.cdiscount.www.SupplyOrderStatusType supplyOrderStatusType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(SUPPLYORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderStatusType)get_store().add_element_user(SUPPLYORDERSTATUSTYPE$0);
            }
            target.set(supplyOrderStatusType);
        }
    }
    
    /**
     * Nils the "SupplyOrderStatusType" element
     */
    public void setNilSupplyOrderStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderStatusType target = null;
            target = (com.cdiscount.www.SupplyOrderStatusType)get_store().find_element_user(SUPPLYORDERSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderStatusType)get_store().add_element_user(SUPPLYORDERSTATUSTYPE$0);
            }
            target.setNil();
        }
    }
}
