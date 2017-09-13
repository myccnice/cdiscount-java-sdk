/*
 * An XML document type.
 * Localname: ProductListByIdentifierMessage
 * Namespace: http://www.cdiscount.com/ProductByIdentifier
 * Java type: com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.productbyidentifier.impl;
/**
 * A document containing one ProductListByIdentifierMessage(@http://www.cdiscount.com/ProductByIdentifier) element.
 *
 * This is a complex type.
 */
public class ProductListByIdentifierMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductListByIdentifierMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTLISTBYIDENTIFIERMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ProductListByIdentifierMessage");
    
    
    /**
     * Gets the "ProductListByIdentifierMessage" element
     */
    public com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage getProductListByIdentifierMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().find_element_user(PRODUCTLISTBYIDENTIFIERMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductListByIdentifierMessage" element
     */
    public boolean isNilProductListByIdentifierMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().find_element_user(PRODUCTLISTBYIDENTIFIERMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductListByIdentifierMessage" element
     */
    public void setProductListByIdentifierMessage(com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage productListByIdentifierMessage)
    {
        generatedSetterHelperImpl(productListByIdentifierMessage, PRODUCTLISTBYIDENTIFIERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductListByIdentifierMessage" element
     */
    public com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage addNewProductListByIdentifierMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().add_element_user(PRODUCTLISTBYIDENTIFIERMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductListByIdentifierMessage" element
     */
    public void setNilProductListByIdentifierMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().find_element_user(PRODUCTLISTBYIDENTIFIERMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().add_element_user(PRODUCTLISTBYIDENTIFIERMESSAGE$0);
            }
            target.setNil();
        }
    }
}
