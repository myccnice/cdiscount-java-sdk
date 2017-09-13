/*
 * An XML document type.
 * Localname: Customer
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CustomerDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Customer(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CustomerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CustomerDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Customer");
    
    
    /**
     * Gets the "Customer" element
     */
    public com.cdiscount.www.Customer getCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().find_element_user(CUSTOMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Customer" element
     */
    public boolean isNilCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().find_element_user(CUSTOMER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Customer" element
     */
    public void setCustomer(com.cdiscount.www.Customer customer)
    {
        generatedSetterHelperImpl(customer, CUSTOMER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    public com.cdiscount.www.Customer addNewCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().add_element_user(CUSTOMER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Customer" element
     */
    public void setNilCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Customer target = null;
            target = (com.cdiscount.www.Customer)get_store().find_element_user(CUSTOMER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Customer)get_store().add_element_user(CUSTOMER$0);
            }
            target.setNil();
        }
    }
}
