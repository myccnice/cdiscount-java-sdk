/*
 * An XML document type.
 * Localname: OfferPool
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferPoolDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferPool(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferPoolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferPoolDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferPoolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERPOOL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPool");
    
    
    /**
     * Gets the "OfferPool" element
     */
    public com.cdiscount.www.OfferPool getOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().find_element_user(OFFERPOOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferPool" element
     */
    public boolean isNilOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().find_element_user(OFFERPOOL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferPool" element
     */
    public void setOfferPool(com.cdiscount.www.OfferPool offerPool)
    {
        generatedSetterHelperImpl(offerPool, OFFERPOOL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferPool" element
     */
    public com.cdiscount.www.OfferPool addNewOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().add_element_user(OFFERPOOL$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferPool" element
     */
    public void setNilOfferPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPool target = null;
            target = (com.cdiscount.www.OfferPool)get_store().find_element_user(OFFERPOOL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferPool)get_store().add_element_user(OFFERPOOL$0);
            }
            target.setNil();
        }
    }
}
