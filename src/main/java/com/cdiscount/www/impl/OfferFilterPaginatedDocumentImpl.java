/*
 * An XML document type.
 * Localname: OfferFilterPaginated
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferFilterPaginatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferFilterPaginated(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferFilterPaginatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferFilterPaginatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferFilterPaginatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERFILTERPAGINATED$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferFilterPaginated");
    
    
    /**
     * Gets the "OfferFilterPaginated" element
     */
    public com.cdiscount.www.OfferFilterPaginated getOfferFilterPaginated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterPaginated target = null;
            target = (com.cdiscount.www.OfferFilterPaginated)get_store().find_element_user(OFFERFILTERPAGINATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferFilterPaginated" element
     */
    public boolean isNilOfferFilterPaginated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterPaginated target = null;
            target = (com.cdiscount.www.OfferFilterPaginated)get_store().find_element_user(OFFERFILTERPAGINATED$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferFilterPaginated" element
     */
    public void setOfferFilterPaginated(com.cdiscount.www.OfferFilterPaginated offerFilterPaginated)
    {
        generatedSetterHelperImpl(offerFilterPaginated, OFFERFILTERPAGINATED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferFilterPaginated" element
     */
    public com.cdiscount.www.OfferFilterPaginated addNewOfferFilterPaginated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterPaginated target = null;
            target = (com.cdiscount.www.OfferFilterPaginated)get_store().add_element_user(OFFERFILTERPAGINATED$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferFilterPaginated" element
     */
    public void setNilOfferFilterPaginated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterPaginated target = null;
            target = (com.cdiscount.www.OfferFilterPaginated)get_store().find_element_user(OFFERFILTERPAGINATED$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferFilterPaginated)get_store().add_element_user(OFFERFILTERPAGINATED$0);
            }
            target.setNil();
        }
    }
}
