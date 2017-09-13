/*
 * An XML document type.
 * Localname: ProductPackageRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductPackageRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductPackageRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductPackageRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductPackageRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductPackageRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTPACKAGEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductPackageRequest");
    
    
    /**
     * Gets the "ProductPackageRequest" element
     */
    public com.cdiscount.www.ProductPackageRequest getProductPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackageRequest target = null;
            target = (com.cdiscount.www.ProductPackageRequest)get_store().find_element_user(PRODUCTPACKAGEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductPackageRequest" element
     */
    public boolean isNilProductPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackageRequest target = null;
            target = (com.cdiscount.www.ProductPackageRequest)get_store().find_element_user(PRODUCTPACKAGEREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductPackageRequest" element
     */
    public void setProductPackageRequest(com.cdiscount.www.ProductPackageRequest productPackageRequest)
    {
        generatedSetterHelperImpl(productPackageRequest, PRODUCTPACKAGEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductPackageRequest" element
     */
    public com.cdiscount.www.ProductPackageRequest addNewProductPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackageRequest target = null;
            target = (com.cdiscount.www.ProductPackageRequest)get_store().add_element_user(PRODUCTPACKAGEREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductPackageRequest" element
     */
    public void setNilProductPackageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackageRequest target = null;
            target = (com.cdiscount.www.ProductPackageRequest)get_store().find_element_user(PRODUCTPACKAGEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductPackageRequest)get_store().add_element_user(PRODUCTPACKAGEREQUEST$0);
            }
            target.setNil();
        }
    }
}
