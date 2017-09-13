/*
 * An XML document type.
 * Localname: ArrayOfParcelShop
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelShopDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfParcelShop(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfParcelShopDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelShopDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelShopDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPARCELSHOP$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfParcelShop");
    
    
    /**
     * Gets the "ArrayOfParcelShop" element
     */
    public com.cdiscount.www.ArrayOfParcelShop getArrayOfParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().find_element_user(ARRAYOFPARCELSHOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfParcelShop" element
     */
    public boolean isNilArrayOfParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().find_element_user(ARRAYOFPARCELSHOP$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfParcelShop" element
     */
    public void setArrayOfParcelShop(com.cdiscount.www.ArrayOfParcelShop arrayOfParcelShop)
    {
        generatedSetterHelperImpl(arrayOfParcelShop, ARRAYOFPARCELSHOP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfParcelShop" element
     */
    public com.cdiscount.www.ArrayOfParcelShop addNewArrayOfParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().add_element_user(ARRAYOFPARCELSHOP$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfParcelShop" element
     */
    public void setNilArrayOfParcelShop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelShop target = null;
            target = (com.cdiscount.www.ArrayOfParcelShop)get_store().find_element_user(ARRAYOFPARCELSHOP$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelShop)get_store().add_element_user(ARRAYOFPARCELSHOP$0);
            }
            target.setNil();
        }
    }
}
