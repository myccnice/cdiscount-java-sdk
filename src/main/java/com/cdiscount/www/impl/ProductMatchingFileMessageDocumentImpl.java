/*
 * An XML document type.
 * Localname: ProductMatchingFileMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductMatchingFileMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductMatchingFileMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductMatchingFileMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductMatchingFileMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductMatchingFileMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTMATCHINGFILEMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductMatchingFileMessage");
    
    
    /**
     * Gets the "ProductMatchingFileMessage" element
     */
    public com.cdiscount.www.ProductMatchingFileMessage getProductMatchingFileMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingFileMessage target = null;
            target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().find_element_user(PRODUCTMATCHINGFILEMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductMatchingFileMessage" element
     */
    public boolean isNilProductMatchingFileMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingFileMessage target = null;
            target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().find_element_user(PRODUCTMATCHINGFILEMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductMatchingFileMessage" element
     */
    public void setProductMatchingFileMessage(com.cdiscount.www.ProductMatchingFileMessage productMatchingFileMessage)
    {
        generatedSetterHelperImpl(productMatchingFileMessage, PRODUCTMATCHINGFILEMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductMatchingFileMessage" element
     */
    public com.cdiscount.www.ProductMatchingFileMessage addNewProductMatchingFileMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingFileMessage target = null;
            target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().add_element_user(PRODUCTMATCHINGFILEMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductMatchingFileMessage" element
     */
    public void setNilProductMatchingFileMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductMatchingFileMessage target = null;
            target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().find_element_user(PRODUCTMATCHINGFILEMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().add_element_user(PRODUCTMATCHINGFILEMESSAGE$0);
            }
            target.setNil();
        }
    }
}
