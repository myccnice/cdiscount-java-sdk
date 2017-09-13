/*
 * XML Type:  ArrayOfCategoryTree
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfCategoryTree
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfCategoryTree(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfCategoryTreeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfCategoryTree
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCategoryTreeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYTREE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CategoryTree");
    
    
    /**
     * Gets array of all "CategoryTree" elements
     */
    public com.cdiscount.www.CategoryTree[] getCategoryTreeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYTREE$0, targetList);
            com.cdiscount.www.CategoryTree[] result = new com.cdiscount.www.CategoryTree[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryTree" element
     */
    public com.cdiscount.www.CategoryTree getCategoryTreeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().find_element_user(CATEGORYTREE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CategoryTree" element
     */
    public boolean isNilCategoryTreeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().find_element_user(CATEGORYTREE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CategoryTree" element
     */
    public int sizeOfCategoryTreeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYTREE$0);
        }
    }
    
    /**
     * Sets array of all "CategoryTree" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCategoryTreeArray(com.cdiscount.www.CategoryTree[] categoryTreeArray)
    {
        check_orphaned();
        arraySetterHelper(categoryTreeArray, CATEGORYTREE$0);
    }
    
    /**
     * Sets ith "CategoryTree" element
     */
    public void setCategoryTreeArray(int i, com.cdiscount.www.CategoryTree categoryTree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().find_element_user(CATEGORYTREE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryTree);
        }
    }
    
    /**
     * Nils the ith "CategoryTree" element
     */
    public void setNilCategoryTreeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().find_element_user(CATEGORYTREE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryTree" element
     */
    public com.cdiscount.www.CategoryTree insertNewCategoryTree(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CategoryTree target = null;
            target = (com.cdiscount.www.CategoryTree)get_store().insert_element_user(CATEGORYTREE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryTree" element
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
     * Removes the ith "CategoryTree" element
     */
    public void removeCategoryTree(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYTREE$0, i);
        }
    }
}
