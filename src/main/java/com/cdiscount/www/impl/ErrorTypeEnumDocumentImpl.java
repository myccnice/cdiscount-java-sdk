/*
 * An XML document type.
 * Localname: ErrorTypeEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ErrorTypeEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ErrorTypeEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ErrorTypeEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ErrorTypeEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorTypeEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORTYPEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ErrorTypeEnum");
    
    
    /**
     * Gets the "ErrorTypeEnum" element
     */
    public com.cdiscount.www.ErrorTypeEnum.Enum getErrorTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORTYPEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ErrorTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorTypeEnum" element
     */
    public com.cdiscount.www.ErrorTypeEnum xgetErrorTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ErrorTypeEnum target = null;
            target = (com.cdiscount.www.ErrorTypeEnum)get_store().find_element_user(ERRORTYPEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorTypeEnum" element
     */
    public boolean isNilErrorTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ErrorTypeEnum target = null;
            target = (com.cdiscount.www.ErrorTypeEnum)get_store().find_element_user(ERRORTYPEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ErrorTypeEnum" element
     */
    public void setErrorTypeEnum(com.cdiscount.www.ErrorTypeEnum.Enum errorTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORTYPEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORTYPEENUM$0);
            }
            target.setEnumValue(errorTypeEnum);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorTypeEnum" element
     */
    public void xsetErrorTypeEnum(com.cdiscount.www.ErrorTypeEnum errorTypeEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ErrorTypeEnum target = null;
            target = (com.cdiscount.www.ErrorTypeEnum)get_store().find_element_user(ERRORTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ErrorTypeEnum)get_store().add_element_user(ERRORTYPEENUM$0);
            }
            target.set(errorTypeEnum);
        }
    }
    
    /**
     * Nils the "ErrorTypeEnum" element
     */
    public void setNilErrorTypeEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ErrorTypeEnum target = null;
            target = (com.cdiscount.www.ErrorTypeEnum)get_store().find_element_user(ERRORTYPEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ErrorTypeEnum)get_store().add_element_user(ERRORTYPEENUM$0);
            }
            target.setNil();
        }
    }
}
