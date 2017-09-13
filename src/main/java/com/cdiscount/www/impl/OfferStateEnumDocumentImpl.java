/*
 * An XML document type.
 * Localname: OfferStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferStateEnumDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferStateEnum(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferStateEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferStateEnumDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferStateEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferStateEnum");
    
    
    /**
     * Gets the "OfferStateEnum" element
     */
    public com.cdiscount.www.OfferStateEnum.Enum getOfferStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSTATEENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OfferStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferStateEnum" element
     */
    public com.cdiscount.www.OfferStateEnum xgetOfferStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateEnum target = null;
            target = (com.cdiscount.www.OfferStateEnum)get_store().find_element_user(OFFERSTATEENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferStateEnum" element
     */
    public boolean isNilOfferStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateEnum target = null;
            target = (com.cdiscount.www.OfferStateEnum)get_store().find_element_user(OFFERSTATEENUM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferStateEnum" element
     */
    public void setOfferStateEnum(com.cdiscount.www.OfferStateEnum.Enum offerStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERSTATEENUM$0);
            }
            target.setEnumValue(offerStateEnum);
        }
    }
    
    /**
     * Sets (as xml) the "OfferStateEnum" element
     */
    public void xsetOfferStateEnum(com.cdiscount.www.OfferStateEnum offerStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateEnum target = null;
            target = (com.cdiscount.www.OfferStateEnum)get_store().find_element_user(OFFERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferStateEnum)get_store().add_element_user(OFFERSTATEENUM$0);
            }
            target.set(offerStateEnum);
        }
    }
    
    /**
     * Nils the "OfferStateEnum" element
     */
    public void setNilOfferStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateEnum target = null;
            target = (com.cdiscount.www.OfferStateEnum)get_store().find_element_user(OFFERSTATEENUM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferStateEnum)get_store().add_element_user(OFFERSTATEENUM$0);
            }
            target.setNil();
        }
    }
}
