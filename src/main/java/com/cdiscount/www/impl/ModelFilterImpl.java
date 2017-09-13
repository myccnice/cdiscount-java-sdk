/*
 * XML Type:  ModelFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ModelFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ModelFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ModelFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ModelFilter
{
    private static final long serialVersionUID = 1L;
    
    public ModelFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYCODELIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CategoryCodeList");
    
    
    /**
     * Gets the "CategoryCodeList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getCategoryCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(CATEGORYCODELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CategoryCodeList" element
     */
    public boolean isNilCategoryCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(CATEGORYCODELIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CategoryCodeList" element
     */
    public boolean isSetCategoryCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYCODELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "CategoryCodeList" element
     */
    public void setCategoryCodeList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring categoryCodeList)
    {
        generatedSetterHelperImpl(categoryCodeList, CATEGORYCODELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryCodeList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewCategoryCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(CATEGORYCODELIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "CategoryCodeList" element
     */
    public void setNilCategoryCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(CATEGORYCODELIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(CATEGORYCODELIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CategoryCodeList" element
     */
    public void unsetCategoryCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYCODELIST$0, 0);
        }
    }
}
