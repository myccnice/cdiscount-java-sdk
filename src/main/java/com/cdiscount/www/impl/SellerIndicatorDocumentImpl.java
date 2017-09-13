/*
 * An XML document type.
 * Localname: SellerIndicator
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SellerIndicator(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERINDICATOR$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerIndicator");
    
    
    /**
     * Gets the "SellerIndicator" element
     */
    public com.cdiscount.www.SellerIndicator getSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().find_element_user(SELLERINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerIndicator" element
     */
    public boolean isNilSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().find_element_user(SELLERINDICATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerIndicator" element
     */
    public void setSellerIndicator(com.cdiscount.www.SellerIndicator sellerIndicator)
    {
        generatedSetterHelperImpl(sellerIndicator, SELLERINDICATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerIndicator" element
     */
    public com.cdiscount.www.SellerIndicator addNewSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().add_element_user(SELLERINDICATOR$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerIndicator" element
     */
    public void setNilSellerIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerIndicator target = null;
            target = (com.cdiscount.www.SellerIndicator)get_store().find_element_user(SELLERINDICATOR$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerIndicator)get_store().add_element_user(SELLERINDICATOR$0);
            }
            target.setNil();
        }
    }
}
