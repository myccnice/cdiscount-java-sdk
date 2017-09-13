/*
 * An XML document type.
 * Localname: AskingForReturnType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.AskingForReturnTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one AskingForReturnType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class AskingForReturnTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.AskingForReturnTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AskingForReturnTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASKINGFORRETURNTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "AskingForReturnType");
    
    
    /**
     * Gets the "AskingForReturnType" element
     */
    public com.cdiscount.www.AskingForReturnType.Enum getAskingForReturnType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASKINGFORRETURNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.AskingForReturnType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AskingForReturnType" element
     */
    public com.cdiscount.www.AskingForReturnType xgetAskingForReturnType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(ASKINGFORRETURNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AskingForReturnType" element
     */
    public boolean isNilAskingForReturnType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(ASKINGFORRETURNTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AskingForReturnType" element
     */
    public void setAskingForReturnType(com.cdiscount.www.AskingForReturnType.Enum askingForReturnType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASKINGFORRETURNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASKINGFORRETURNTYPE$0);
            }
            target.setEnumValue(askingForReturnType);
        }
    }
    
    /**
     * Sets (as xml) the "AskingForReturnType" element
     */
    public void xsetAskingForReturnType(com.cdiscount.www.AskingForReturnType askingForReturnType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(ASKINGFORRETURNTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AskingForReturnType)get_store().add_element_user(ASKINGFORRETURNTYPE$0);
            }
            target.set(askingForReturnType);
        }
    }
    
    /**
     * Nils the "AskingForReturnType" element
     */
    public void setNilAskingForReturnType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(ASKINGFORRETURNTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AskingForReturnType)get_store().add_element_user(ASKINGFORRETURNTYPE$0);
            }
            target.setNil();
        }
    }
}
