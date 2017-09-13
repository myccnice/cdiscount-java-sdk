/*
 * An XML document type.
 * Localname: ArrayOfOrderClaim
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderClaimDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOrderClaim(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOrderClaimDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderClaimDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderClaimDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORDERCLAIM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOrderClaim");
    
    
    /**
     * Gets the "ArrayOfOrderClaim" element
     */
    public com.cdiscount.www.ArrayOfOrderClaim getArrayOfOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().find_element_user(ARRAYOFORDERCLAIM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOrderClaim" element
     */
    public boolean isNilArrayOfOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().find_element_user(ARRAYOFORDERCLAIM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOrderClaim" element
     */
    public void setArrayOfOrderClaim(com.cdiscount.www.ArrayOfOrderClaim arrayOfOrderClaim)
    {
        generatedSetterHelperImpl(arrayOfOrderClaim, ARRAYOFORDERCLAIM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOrderClaim" element
     */
    public com.cdiscount.www.ArrayOfOrderClaim addNewArrayOfOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().add_element_user(ARRAYOFORDERCLAIM$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOrderClaim" element
     */
    public void setNilArrayOfOrderClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderClaim target = null;
            target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().find_element_user(ARRAYOFORDERCLAIM$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderClaim)get_store().add_element_user(ARRAYOFORDERCLAIM$0);
            }
            target.setNil();
        }
    }
}
