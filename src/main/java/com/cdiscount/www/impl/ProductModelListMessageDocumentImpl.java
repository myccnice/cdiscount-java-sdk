/*
 * An XML document type.
 * Localname: ProductModelListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductModelListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductModelListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductModelListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductModelListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductModelListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTMODELLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductModelListMessage");
    
    
    /**
     * Gets the "ProductModelListMessage" element
     */
    public com.cdiscount.www.ProductModelListMessage getProductModelListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModelListMessage target = null;
            target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(PRODUCTMODELLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductModelListMessage" element
     */
    public boolean isNilProductModelListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModelListMessage target = null;
            target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(PRODUCTMODELLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductModelListMessage" element
     */
    public void setProductModelListMessage(com.cdiscount.www.ProductModelListMessage productModelListMessage)
    {
        generatedSetterHelperImpl(productModelListMessage, PRODUCTMODELLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductModelListMessage" element
     */
    public com.cdiscount.www.ProductModelListMessage addNewProductModelListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModelListMessage target = null;
            target = (com.cdiscount.www.ProductModelListMessage)get_store().add_element_user(PRODUCTMODELLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductModelListMessage" element
     */
    public void setNilProductModelListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModelListMessage target = null;
            target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(PRODUCTMODELLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductModelListMessage)get_store().add_element_user(PRODUCTMODELLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
