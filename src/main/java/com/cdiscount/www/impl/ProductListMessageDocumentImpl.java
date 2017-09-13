/*
 * An XML document type.
 * Localname: ProductListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductListMessage");
    
    
    /**
     * Gets the "ProductListMessage" element
     */
    public com.cdiscount.www.ProductListMessage getProductListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductListMessage target = null;
            target = (com.cdiscount.www.ProductListMessage)get_store().find_element_user(PRODUCTLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductListMessage" element
     */
    public boolean isNilProductListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductListMessage target = null;
            target = (com.cdiscount.www.ProductListMessage)get_store().find_element_user(PRODUCTLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductListMessage" element
     */
    public void setProductListMessage(com.cdiscount.www.ProductListMessage productListMessage)
    {
        generatedSetterHelperImpl(productListMessage, PRODUCTLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductListMessage" element
     */
    public com.cdiscount.www.ProductListMessage addNewProductListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductListMessage target = null;
            target = (com.cdiscount.www.ProductListMessage)get_store().add_element_user(PRODUCTLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductListMessage" element
     */
    public void setNilProductListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductListMessage target = null;
            target = (com.cdiscount.www.ProductListMessage)get_store().find_element_user(PRODUCTLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductListMessage)get_store().add_element_user(PRODUCTLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
