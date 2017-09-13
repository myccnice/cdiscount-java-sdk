/*
 * An XML document type.
 * Localname: ProductByIdentifier
 * Namespace: http://www.cdiscount.com/ProductByIdentifier
 * Java type: com.cdiscount.www.productbyidentifier.ProductByIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.productbyidentifier.impl;
/**
 * A document containing one ProductByIdentifier(@http://www.cdiscount.com/ProductByIdentifier) element.
 *
 * This is a complex type.
 */
public class ProductByIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.productbyidentifier.ProductByIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductByIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTBYIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ProductByIdentifier");
    
    
    /**
     * Gets the "ProductByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ProductByIdentifier getProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().find_element_user(PRODUCTBYIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductByIdentifier" element
     */
    public boolean isNilProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().find_element_user(PRODUCTBYIDENTIFIER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductByIdentifier" element
     */
    public void setProductByIdentifier(com.cdiscount.www.productbyidentifier.ProductByIdentifier productByIdentifier)
    {
        generatedSetterHelperImpl(productByIdentifier, PRODUCTBYIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ProductByIdentifier addNewProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().add_element_user(PRODUCTBYIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductByIdentifier" element
     */
    public void setNilProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().find_element_user(PRODUCTBYIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().add_element_user(PRODUCTBYIDENTIFIER$0);
            }
            target.setNil();
        }
    }
}
