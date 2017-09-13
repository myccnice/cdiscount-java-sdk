/*
 * An XML document type.
 * Localname: ValidationStatusType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidationStatusTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidationStatusType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidationStatusTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidationStatusTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidationStatusTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONSTATUSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidationStatusType");
    
    
    /**
     * Gets the "ValidationStatusType" element
     */
    public com.cdiscount.www.ValidationStatusType.Enum getValidationStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSTATUSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ValidationStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidationStatusType" element
     */
    public com.cdiscount.www.ValidationStatusType xgetValidationStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationStatusType target = null;
            target = (com.cdiscount.www.ValidationStatusType)get_store().find_element_user(VALIDATIONSTATUSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidationStatusType" element
     */
    public boolean isNilValidationStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationStatusType target = null;
            target = (com.cdiscount.www.ValidationStatusType)get_store().find_element_user(VALIDATIONSTATUSTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidationStatusType" element
     */
    public void setValidationStatusType(com.cdiscount.www.ValidationStatusType.Enum validationStatusType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATIONSTATUSTYPE$0);
            }
            target.setEnumValue(validationStatusType);
        }
    }
    
    /**
     * Sets (as xml) the "ValidationStatusType" element
     */
    public void xsetValidationStatusType(com.cdiscount.www.ValidationStatusType validationStatusType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationStatusType target = null;
            target = (com.cdiscount.www.ValidationStatusType)get_store().find_element_user(VALIDATIONSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidationStatusType)get_store().add_element_user(VALIDATIONSTATUSTYPE$0);
            }
            target.set(validationStatusType);
        }
    }
    
    /**
     * Nils the "ValidationStatusType" element
     */
    public void setNilValidationStatusType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidationStatusType target = null;
            target = (com.cdiscount.www.ValidationStatusType)get_store().find_element_user(VALIDATIONSTATUSTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ValidationStatusType)get_store().add_element_user(VALIDATIONSTATUSTYPE$0);
            }
            target.setNil();
        }
    }
}
