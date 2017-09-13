/*
 * An XML document type.
 * Localname: OfferPackageRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferPackageRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferPackageRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferPackageRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferPackageRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferPackageRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERPACKAGEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPackageRequest");
    
    
    /**
     * Gets the "OfferPackageRequest" element
     */
    public com.cdiscount.www.OfferPackageRequest getOfferPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPackageRequest target = null;
            target = (com.cdiscount.www.OfferPackageRequest)get_store().find_element_user(OFFERPACKAGEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferPackageRequest" element
     */
    public boolean isNilOfferPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPackageRequest target = null;
            target = (com.cdiscount.www.OfferPackageRequest)get_store().find_element_user(OFFERPACKAGEREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferPackageRequest" element
     */
    public void setOfferPackageRequest(com.cdiscount.www.OfferPackageRequest offerPackageRequest)
    {
        generatedSetterHelperImpl(offerPackageRequest, OFFERPACKAGEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferPackageRequest" element
     */
    public com.cdiscount.www.OfferPackageRequest addNewOfferPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPackageRequest target = null;
            target = (com.cdiscount.www.OfferPackageRequest)get_store().add_element_user(OFFERPACKAGEREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferPackageRequest" element
     */
    public void setNilOfferPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPackageRequest target = null;
            target = (com.cdiscount.www.OfferPackageRequest)get_store().find_element_user(OFFERPACKAGEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferPackageRequest)get_store().add_element_user(OFFERPACKAGEREQUEST$0);
            }
            target.setNil();
        }
    }
}
