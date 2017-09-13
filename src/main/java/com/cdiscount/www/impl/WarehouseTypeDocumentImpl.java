/*
 * An XML document type.
 * Localname: WarehouseType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.WarehouseTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one WarehouseType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class WarehouseTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.WarehouseTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public WarehouseTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WAREHOUSETYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "WarehouseType");
    
    
    /**
     * Gets the "WarehouseType" element
     */
    public com.cdiscount.www.WarehouseType.Enum getWarehouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.WarehouseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WarehouseType" element
     */
    public com.cdiscount.www.WarehouseType xgetWarehouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "WarehouseType" element
     */
    public boolean isNilWarehouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSETYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "WarehouseType" element
     */
    public void setWarehouseType(com.cdiscount.www.WarehouseType.Enum warehouseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSETYPE$0);
            }
            target.setEnumValue(warehouseType);
        }
    }
    
    /**
     * Sets (as xml) the "WarehouseType" element
     */
    public void xsetWarehouseType(com.cdiscount.www.WarehouseType warehouseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSETYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSETYPE$0);
            }
            target.set(warehouseType);
        }
    }
    
    /**
     * Nils the "WarehouseType" element
     */
    public void setNilWarehouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.WarehouseType target = null;
            target = (com.cdiscount.www.WarehouseType)get_store().find_element_user(WAREHOUSETYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.WarehouseType)get_store().add_element_user(WAREHOUSETYPE$0);
            }
            target.setNil();
        }
    }
}
