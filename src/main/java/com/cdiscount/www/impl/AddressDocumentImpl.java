/*
 * An XML document type.
 * Localname: Address
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Address(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.AddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Address");
    
    
    /**
     * Gets the "Address" element
     */
    public com.cdiscount.www.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Address" element
     */
    public boolean isNilAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(com.cdiscount.www.Address address)
    {
        generatedSetterHelperImpl(address, ADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public com.cdiscount.www.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Address" element
     */
    public void setNilAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Address)get_store().add_element_user(ADDRESS$0);
            }
            target.setNil();
        }
    }
}
