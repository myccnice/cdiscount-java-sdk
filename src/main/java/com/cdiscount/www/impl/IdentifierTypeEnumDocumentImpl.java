/*
 * An XML document type.
 * Localname: IdentifierTypeEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.IdentifierTypeEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one IdentifierTypeEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class IdentifierTypeEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.IdentifierTypeEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierTypeEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIERTYPEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IdentifierTypeEnum");
    
    
    /**
     * Gets the "IdentifierTypeEnum" element
     */
    public com.cdiscount.www.IdentifierTypeEnum.Enum getIdentifierTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.IdentifierTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdentifierTypeEnum" element
     */
    public com.cdiscount.www.IdentifierTypeEnum xgetIdentifierTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierTypeEnum target = null;
            target = (com.cdiscount.www.IdentifierTypeEnum)get_store().find_element_user(IDENTIFIERTYPEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentifierTypeEnum" element
     */
    public boolean isNilIdentifierTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierTypeEnum target = null;
            target = (com.cdiscount.www.IdentifierTypeEnum)get_store().find_element_user(IDENTIFIERTYPEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentifierTypeEnum" element
     */
    public void setIdentifierTypeEnum(com.cdiscount.www.IdentifierTypeEnum.Enum identifierTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERTYPEENUM$0);
            }
            target.setEnumValue(identifierTypeEnum);
        }
    }
    
    /**
     * Sets (as xml) the "IdentifierTypeEnum" element
     */
    public void xsetIdentifierTypeEnum(com.cdiscount.www.IdentifierTypeEnum identifierTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierTypeEnum target = null;
            target = (com.cdiscount.www.IdentifierTypeEnum)get_store().find_element_user(IDENTIFIERTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.IdentifierTypeEnum)get_store().add_element_user(IDENTIFIERTYPEENUM$0);
            }
            target.set(identifierTypeEnum);
        }
    }
    
    /**
     * Nils the "IdentifierTypeEnum" element
     */
    public void setNilIdentifierTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierTypeEnum target = null;
            target = (com.cdiscount.www.IdentifierTypeEnum)get_store().find_element_user(IDENTIFIERTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.IdentifierTypeEnum)get_store().add_element_user(IDENTIFIERTYPEENUM$0);
            }
            target.setNil();
        }
    }
}
