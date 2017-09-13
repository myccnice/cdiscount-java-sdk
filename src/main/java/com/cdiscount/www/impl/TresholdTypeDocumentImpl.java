/*
 * An XML document type.
 * Localname: TresholdType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.TresholdTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one TresholdType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class TresholdTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.TresholdTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TresholdTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRESHOLDTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "TresholdType");
    
    
    /**
     * Gets the "TresholdType" element
     */
    public com.cdiscount.www.TresholdType.Enum getTresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRESHOLDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.TresholdType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TresholdType" element
     */
    public com.cdiscount.www.TresholdType xgetTresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.TresholdType target = null;
            target = (com.cdiscount.www.TresholdType)get_store().find_element_user(TRESHOLDTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TresholdType" element
     */
    public boolean isNilTresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.TresholdType target = null;
            target = (com.cdiscount.www.TresholdType)get_store().find_element_user(TRESHOLDTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TresholdType" element
     */
    public void setTresholdType(com.cdiscount.www.TresholdType.Enum tresholdType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRESHOLDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRESHOLDTYPE$0);
            }
            target.setEnumValue(tresholdType);
        }
    }
    
    /**
     * Sets (as xml) the "TresholdType" element
     */
    public void xsetTresholdType(com.cdiscount.www.TresholdType tresholdType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.TresholdType target = null;
            target = (com.cdiscount.www.TresholdType)get_store().find_element_user(TRESHOLDTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.TresholdType)get_store().add_element_user(TRESHOLDTYPE$0);
            }
            target.set(tresholdType);
        }
    }
    
    /**
     * Nils the "TresholdType" element
     */
    public void setNilTresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.TresholdType target = null;
            target = (com.cdiscount.www.TresholdType)get_store().find_element_user(TRESHOLDTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.TresholdType)get_store().add_element_user(TRESHOLDTYPE$0);
            }
            target.setNil();
        }
    }
}
