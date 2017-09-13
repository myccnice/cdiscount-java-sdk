/*
 * An XML document type.
 * Localname: ArrayOfProduct
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfProduct(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfProduct");
    
    
    /**
     * Gets the "ArrayOfProduct" element
     */
    public com.cdiscount.www.ArrayOfProduct getArrayOfProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().find_element_user(ARRAYOFPRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProduct" element
     */
    public boolean isNilArrayOfProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().find_element_user(ARRAYOFPRODUCT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProduct" element
     */
    public void setArrayOfProduct(com.cdiscount.www.ArrayOfProduct arrayOfProduct)
    {
        generatedSetterHelperImpl(arrayOfProduct, ARRAYOFPRODUCT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProduct" element
     */
    public com.cdiscount.www.ArrayOfProduct addNewArrayOfProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().add_element_user(ARRAYOFPRODUCT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProduct" element
     */
    public void setNilArrayOfProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProduct target = null;
            target = (com.cdiscount.www.ArrayOfProduct)get_store().find_element_user(ARRAYOFPRODUCT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProduct)get_store().add_element_user(ARRAYOFPRODUCT$0);
            }
            target.setNil();
        }
    }
}
