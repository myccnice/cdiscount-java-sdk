/*
 * An XML document type.
 * Localname: ArrayOfProductModel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductModelDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfProductModel(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductModelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductModelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductModelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCTMODEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfProductModel");
    
    
    /**
     * Gets the "ArrayOfProductModel" element
     */
    public com.cdiscount.www.ArrayOfProductModel getArrayOfProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().find_element_user(ARRAYOFPRODUCTMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProductModel" element
     */
    public boolean isNilArrayOfProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().find_element_user(ARRAYOFPRODUCTMODEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProductModel" element
     */
    public void setArrayOfProductModel(com.cdiscount.www.ArrayOfProductModel arrayOfProductModel)
    {
        generatedSetterHelperImpl(arrayOfProductModel, ARRAYOFPRODUCTMODEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProductModel" element
     */
    public com.cdiscount.www.ArrayOfProductModel addNewArrayOfProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().add_element_user(ARRAYOFPRODUCTMODEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProductModel" element
     */
    public void setNilArrayOfProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductModel target = null;
            target = (com.cdiscount.www.ArrayOfProductModel)get_store().find_element_user(ARRAYOFPRODUCTMODEL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductModel)get_store().add_element_user(ARRAYOFPRODUCTMODEL$0);
            }
            target.setNil();
        }
    }
}
