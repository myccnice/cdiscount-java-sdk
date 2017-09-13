/*
 * An XML document type.
 * Localname: ArrayOfProductByIdentifier
 * Namespace: http://www.cdiscount.com/ProductByIdentifier
 * Java type: com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.productbyidentifier.impl;
/**
 * A document containing one ArrayOfProductByIdentifier(@http://www.cdiscount.com/ProductByIdentifier) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductByIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductByIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCTBYIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ArrayOfProductByIdentifier");
    
    
    /**
     * Gets the "ArrayOfProductByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier getArrayOfProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().find_element_user(ARRAYOFPRODUCTBYIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProductByIdentifier" element
     */
    public boolean isNilArrayOfProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().find_element_user(ARRAYOFPRODUCTBYIDENTIFIER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProductByIdentifier" element
     */
    public void setArrayOfProductByIdentifier(com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier arrayOfProductByIdentifier)
    {
        generatedSetterHelperImpl(arrayOfProductByIdentifier, ARRAYOFPRODUCTBYIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProductByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier addNewArrayOfProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().add_element_user(ARRAYOFPRODUCTBYIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProductByIdentifier" element
     */
    public void setNilArrayOfProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().find_element_user(ARRAYOFPRODUCTBYIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier)get_store().add_element_user(ARRAYOFPRODUCTBYIDENTIFIER$0);
            }
            target.setNil();
        }
    }
}
