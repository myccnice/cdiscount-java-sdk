/*
 * An XML document type.
 * Localname: ArrayOfDiscussionStateFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDiscussionStateFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfDiscussionStateFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfDiscussionStateFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDiscussionStateFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDiscussionStateFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDISCUSSIONSTATEFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfDiscussionStateFilter");
    
    
    /**
     * Gets the "ArrayOfDiscussionStateFilter" element
     */
    public com.cdiscount.www.ArrayOfDiscussionStateFilter getArrayOfDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().find_element_user(ARRAYOFDISCUSSIONSTATEFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfDiscussionStateFilter" element
     */
    public boolean isNilArrayOfDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().find_element_user(ARRAYOFDISCUSSIONSTATEFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfDiscussionStateFilter" element
     */
    public void setArrayOfDiscussionStateFilter(com.cdiscount.www.ArrayOfDiscussionStateFilter arrayOfDiscussionStateFilter)
    {
        generatedSetterHelperImpl(arrayOfDiscussionStateFilter, ARRAYOFDISCUSSIONSTATEFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfDiscussionStateFilter" element
     */
    public com.cdiscount.www.ArrayOfDiscussionStateFilter addNewArrayOfDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().add_element_user(ARRAYOFDISCUSSIONSTATEFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfDiscussionStateFilter" element
     */
    public void setNilArrayOfDiscussionStateFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionStateFilter target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().find_element_user(ARRAYOFDISCUSSIONSTATEFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDiscussionStateFilter)get_store().add_element_user(ARRAYOFDISCUSSIONSTATEFILTER$0);
            }
            target.setNil();
        }
    }
}
