/*
 * An XML document type.
 * Localname: AcceptationStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.AcceptationStateEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one AcceptationStateEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class AcceptationStateEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.AcceptationStateEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public AcceptationStateEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCEPTATIONSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "AcceptationStateEnum");
    
    
    /**
     * Gets the "AcceptationStateEnum" element
     */
    public com.cdiscount.www.AcceptationStateEnum.Enum getAcceptationStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTATIONSTATEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.AcceptationStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AcceptationStateEnum" element
     */
    public com.cdiscount.www.AcceptationStateEnum xgetAcceptationStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AcceptationStateEnum" element
     */
    public boolean isNilAcceptationStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AcceptationStateEnum" element
     */
    public void setAcceptationStateEnum(com.cdiscount.www.AcceptationStateEnum.Enum acceptationStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTATIONSTATEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCEPTATIONSTATEENUM$0);
            }
            target.setEnumValue(acceptationStateEnum);
        }
    }
    
    /**
     * Sets (as xml) the "AcceptationStateEnum" element
     */
    public void xsetAcceptationStateEnum(com.cdiscount.www.AcceptationStateEnum acceptationStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AcceptationStateEnum)get_store().add_element_user(ACCEPTATIONSTATEENUM$0);
            }
            target.set(acceptationStateEnum);
        }
    }
    
    /**
     * Nils the "AcceptationStateEnum" element
     */
    public void setNilAcceptationStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AcceptationStateEnum)get_store().add_element_user(ACCEPTATIONSTATEENUM$0);
            }
            target.setNil();
        }
    }
}
