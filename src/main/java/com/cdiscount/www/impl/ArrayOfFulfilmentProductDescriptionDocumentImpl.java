/*
 * An XML document type.
 * Localname: ArrayOfFulfilmentProductDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentProductDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfFulfilmentProductDescription(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentProductDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentProductDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentProductDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFULFILMENTPRODUCTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfFulfilmentProductDescription");
    
    
    /**
     * Gets the "ArrayOfFulfilmentProductDescription" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentProductDescription getArrayOfFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().find_element_user(ARRAYOFFULFILMENTPRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfFulfilmentProductDescription" element
     */
    public boolean isNilArrayOfFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().find_element_user(ARRAYOFFULFILMENTPRODUCTDESCRIPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfFulfilmentProductDescription" element
     */
    public void setArrayOfFulfilmentProductDescription(com.cdiscount.www.ArrayOfFulfilmentProductDescription arrayOfFulfilmentProductDescription)
    {
        generatedSetterHelperImpl(arrayOfFulfilmentProductDescription, ARRAYOFFULFILMENTPRODUCTDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfFulfilmentProductDescription" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentProductDescription addNewArrayOfFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().add_element_user(ARRAYOFFULFILMENTPRODUCTDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfFulfilmentProductDescription" element
     */
    public void setNilArrayOfFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentProductDescription target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().find_element_user(ARRAYOFFULFILMENTPRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentProductDescription)get_store().add_element_user(ARRAYOFFULFILMENTPRODUCTDESCRIPTION$0);
            }
            target.setNil();
        }
    }
}
