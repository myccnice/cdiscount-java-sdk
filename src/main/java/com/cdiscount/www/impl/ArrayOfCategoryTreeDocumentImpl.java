/*
 * An XML document type.
 * Localname: ArrayOfCategoryTree
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfCategoryTreeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfCategoryTree(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfCategoryTreeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfCategoryTreeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCategoryTreeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCATEGORYTREE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfCategoryTree");
    
    
    /**
     * Gets the "ArrayOfCategoryTree" element
     */
    public com.cdiscount.www.ArrayOfCategoryTree getArrayOfCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().find_element_user(ARRAYOFCATEGORYTREE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfCategoryTree" element
     */
    public boolean isNilArrayOfCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().find_element_user(ARRAYOFCATEGORYTREE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfCategoryTree" element
     */
    public void setArrayOfCategoryTree(com.cdiscount.www.ArrayOfCategoryTree arrayOfCategoryTree)
    {
        generatedSetterHelperImpl(arrayOfCategoryTree, ARRAYOFCATEGORYTREE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfCategoryTree" element
     */
    public com.cdiscount.www.ArrayOfCategoryTree addNewArrayOfCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().add_element_user(ARRAYOFCATEGORYTREE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfCategoryTree" element
     */
    public void setNilArrayOfCategoryTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().find_element_user(ARRAYOFCATEGORYTREE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().add_element_user(ARRAYOFCATEGORYTREE$0);
            }
            target.setNil();
        }
    }
}
