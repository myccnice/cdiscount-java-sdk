/*
 * An XML document type.
 * Localname: SupplyOrderRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderRequest");
    
    
    /**
     * Gets the "SupplyOrderRequest" element
     */
    public com.cdiscount.www.SupplyOrderRequest getSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderRequest target = null;
            target = (com.cdiscount.www.SupplyOrderRequest)get_store().find_element_user(SUPPLYORDERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderRequest" element
     */
    public boolean isNilSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderRequest target = null;
            target = (com.cdiscount.www.SupplyOrderRequest)get_store().find_element_user(SUPPLYORDERREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderRequest" element
     */
    public void setSupplyOrderRequest(com.cdiscount.www.SupplyOrderRequest supplyOrderRequest)
    {
        generatedSetterHelperImpl(supplyOrderRequest, SUPPLYORDERREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderRequest" element
     */
    public com.cdiscount.www.SupplyOrderRequest addNewSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderRequest target = null;
            target = (com.cdiscount.www.SupplyOrderRequest)get_store().add_element_user(SUPPLYORDERREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderRequest" element
     */
    public void setNilSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderRequest target = null;
            target = (com.cdiscount.www.SupplyOrderRequest)get_store().find_element_user(SUPPLYORDERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderRequest)get_store().add_element_user(SUPPLYORDERREQUEST$0);
            }
            target.setNil();
        }
    }
}
