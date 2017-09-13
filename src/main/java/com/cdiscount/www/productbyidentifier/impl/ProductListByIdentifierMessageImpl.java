/*
 * XML Type:  ProductListByIdentifierMessage
 * Namespace: http://www.cdiscount.com/ProductByIdentifier
 * Java type: com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.productbyidentifier.impl;
/**
 * An XML ProductListByIdentifierMessage(@http://www.cdiscount.com/ProductByIdentifier).
 *
 * This is a complex type.
 */
public class ProductListByIdentifierMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage
{
    private static final long serialVersionUID = 1L;
    
    public ProductListByIdentifierMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTLISTBYIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ProductListByIdentifier");
    
    
    /**
     * Gets the "ProductListByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier getProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().find_element_user(PRODUCTLISTBYIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductListByIdentifier" element
     */
    public boolean isNilProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().find_element_user(PRODUCTLISTBYIDENTIFIER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductListByIdentifier" element
     */
    public boolean isSetProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTLISTBYIDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductListByIdentifier" element
     */
    public void setProductListByIdentifier(com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier productListByIdentifier)
    {
        generatedSetterHelperImpl(productListByIdentifier, PRODUCTLISTBYIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductListByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier addNewProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().add_element_user(PRODUCTLISTBYIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductListByIdentifier" element
     */
    public void setNilProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().find_element_user(PRODUCTLISTBYIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().add_element_user(PRODUCTLISTBYIDENTIFIER$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductListByIdentifier" element
     */
    public void unsetProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTLISTBYIDENTIFIER$0, 0);
        }
    }
}
