/*
 * An XML document type.
 * Localname: ModelFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ModelFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ModelFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ModelFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ModelFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModelFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODELFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ModelFilter");
    
    
    /**
     * Gets the "ModelFilter" element
     */
    public com.cdiscount.www.ModelFilter getModelFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelFilter target = null;
            target = (com.cdiscount.www.ModelFilter)get_store().find_element_user(MODELFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ModelFilter" element
     */
    public boolean isNilModelFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelFilter target = null;
            target = (com.cdiscount.www.ModelFilter)get_store().find_element_user(MODELFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ModelFilter" element
     */
    public void setModelFilter(com.cdiscount.www.ModelFilter modelFilter)
    {
        generatedSetterHelperImpl(modelFilter, MODELFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ModelFilter" element
     */
    public com.cdiscount.www.ModelFilter addNewModelFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelFilter target = null;
            target = (com.cdiscount.www.ModelFilter)get_store().add_element_user(MODELFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ModelFilter" element
     */
    public void setNilModelFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelFilter target = null;
            target = (com.cdiscount.www.ModelFilter)get_store().find_element_user(MODELFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ModelFilter)get_store().add_element_user(MODELFILTER$0);
            }
            target.setNil();
        }
    }
}
