/*
 * An XML document type.
 * Localname: CategoryTree
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CategoryTreeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CategoryTree(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CategoryTreeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CategoryTreeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryTreeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYTREE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CategoryTree");
    
    
    /**
     * Gets the "CategoryTree" element
     */
    public com.cdiscount.www.CategoryTree getCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().find_element_user(CATEGORYTREE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CategoryTree" element
     */
    public boolean isNilCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().find_element_user(CATEGORYTREE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CategoryTree" element
     */
    public void setCategoryTree(com.cdiscount.www.CategoryTree categoryTree)
    {
        generatedSetterHelperImpl(categoryTree, CATEGORYTREE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryTree" element
     */
    public com.cdiscount.www.CategoryTree addNewCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().add_element_user(CATEGORYTREE$0);
            return target;
        }
    }
    
    /**
     * Nils the "CategoryTree" element
     */
    public void setNilCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().find_element_user(CATEGORYTREE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CategoryTree)get_store().add_element_user(CATEGORYTREE$0);
            }
            target.setNil();
        }
    }
}
