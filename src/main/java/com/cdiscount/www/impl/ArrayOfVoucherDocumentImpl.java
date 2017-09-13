/*
 * An XML document type.
 * Localname: ArrayOfVoucher
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfVoucherDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfVoucher(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfVoucherDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfVoucherDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfVoucherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVOUCHER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfVoucher");
    
    
    /**
     * Gets the "ArrayOfVoucher" element
     */
    public com.cdiscount.www.ArrayOfVoucher getArrayOfVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().find_element_user(ARRAYOFVOUCHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfVoucher" element
     */
    public boolean isNilArrayOfVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().find_element_user(ARRAYOFVOUCHER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfVoucher" element
     */
    public void setArrayOfVoucher(com.cdiscount.www.ArrayOfVoucher arrayOfVoucher)
    {
        generatedSetterHelperImpl(arrayOfVoucher, ARRAYOFVOUCHER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfVoucher" element
     */
    public com.cdiscount.www.ArrayOfVoucher addNewArrayOfVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().add_element_user(ARRAYOFVOUCHER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfVoucher" element
     */
    public void setNilArrayOfVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVoucher target = null;
            target = (com.cdiscount.www.ArrayOfVoucher)get_store().find_element_user(ARRAYOFVOUCHER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfVoucher)get_store().add_element_user(ARRAYOFVOUCHER$0);
            }
            target.setNil();
        }
    }
}
