/*
 * An XML document type.
 * Localname: FulfilmentSupplyOrderRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentSupplyOrderRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentSupplyOrderRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentSupplyOrderRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentSupplyOrderRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentSupplyOrderRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTSUPPLYORDERREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentSupplyOrderRequest");
    
    
    /**
     * Gets the "FulfilmentSupplyOrderRequest" element
     */
    public com.cdiscount.www.FulfilmentSupplyOrderRequest getFulfilmentSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().find_element_user(FULFILMENTSUPPLYORDERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentSupplyOrderRequest" element
     */
    public boolean isNilFulfilmentSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().find_element_user(FULFILMENTSUPPLYORDERREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentSupplyOrderRequest" element
     */
    public void setFulfilmentSupplyOrderRequest(com.cdiscount.www.FulfilmentSupplyOrderRequest fulfilmentSupplyOrderRequest)
    {
        generatedSetterHelperImpl(fulfilmentSupplyOrderRequest, FULFILMENTSUPPLYORDERREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentSupplyOrderRequest" element
     */
    public com.cdiscount.www.FulfilmentSupplyOrderRequest addNewFulfilmentSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().add_element_user(FULFILMENTSUPPLYORDERREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentSupplyOrderRequest" element
     */
    public void setNilFulfilmentSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().find_element_user(FULFILMENTSUPPLYORDERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().add_element_user(FULFILMENTSUPPLYORDERREQUEST$0);
            }
            target.setNil();
        }
    }
}
