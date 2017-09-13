/*
 * An XML document type.
 * Localname: CategoryTreeMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CategoryTreeMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CategoryTreeMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CategoryTreeMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CategoryTreeMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryTreeMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYTREEMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CategoryTreeMessage");
    
    
    /**
     * Gets the "CategoryTreeMessage" element
     */
    public com.cdiscount.www.CategoryTreeMessage getCategoryTreeMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTreeMessage target = null;
            target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(CATEGORYTREEMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CategoryTreeMessage" element
     */
    public boolean isNilCategoryTreeMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTreeMessage target = null;
            target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(CATEGORYTREEMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CategoryTreeMessage" element
     */
    public void setCategoryTreeMessage(com.cdiscount.www.CategoryTreeMessage categoryTreeMessage)
    {
        generatedSetterHelperImpl(categoryTreeMessage, CATEGORYTREEMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryTreeMessage" element
     */
    public com.cdiscount.www.CategoryTreeMessage addNewCategoryTreeMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTreeMessage target = null;
            target = (com.cdiscount.www.CategoryTreeMessage)get_store().add_element_user(CATEGORYTREEMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "CategoryTreeMessage" element
     */
    public void setNilCategoryTreeMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTreeMessage target = null;
            target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(CATEGORYTREEMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().add_element_user(CATEGORYTREEMESSAGE$0);
            }
            target.setNil();
        }
    }
}
