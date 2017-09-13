/*
 * XML Type:  ProductModelListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductModelListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ProductModelListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ProductModelListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.ProductModelListMessage
{
    private static final long serialVersionUID = 1L;
    
    public ProductModelListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODELLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ModelList");
    
    
    /**
     * Gets the "ModelList" element
     */
    public com.cdiscount.www.ArrayOfProductModel getModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().find_element_user(MODELLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ModelList" element
     */
    public boolean isNilModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().find_element_user(MODELLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ModelList" element
     */
    public boolean isSetModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODELLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ModelList" element
     */
    public void setModelList(com.cdiscount.www.ArrayOfProductModel modelList)
    {
        generatedSetterHelperImpl(modelList, MODELLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ModelList" element
     */
    public com.cdiscount.www.ArrayOfProductModel addNewModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().add_element_user(MODELLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ModelList" element
     */
    public void setNilModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().find_element_user(MODELLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductModel)get_store().add_element_user(MODELLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ModelList" element
     */
    public void unsetModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODELLIST$0, 0);
        }
    }
}
