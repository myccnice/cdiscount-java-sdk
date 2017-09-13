/*
 * An XML document type.
 * Localname: Seller
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Seller(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SellerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerDocument
{
    private static final long serialVersionUID = 1L;
    
    public SellerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Seller");
    
    
    /**
     * Gets the "Seller" element
     */
    public com.cdiscount.www.Seller getSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().find_element_user(SELLER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Seller" element
     */
    public boolean isNilSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().find_element_user(SELLER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Seller" element
     */
    public void setSeller(com.cdiscount.www.Seller seller)
    {
        generatedSetterHelperImpl(seller, SELLER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Seller" element
     */
    public com.cdiscount.www.Seller addNewSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().add_element_user(SELLER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Seller" element
     */
    public void setNilSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().find_element_user(SELLER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Seller)get_store().add_element_user(SELLER$0);
            }
            target.setNil();
        }
    }
}
