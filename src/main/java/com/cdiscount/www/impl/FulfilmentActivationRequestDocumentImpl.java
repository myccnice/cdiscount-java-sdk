/*
 * An XML document type.
 * Localname: FulfilmentActivationRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentActivationRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentActivationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTACTIVATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentActivationRequest");
    
    
    /**
     * Gets the "FulfilmentActivationRequest" element
     */
    public com.cdiscount.www.FulfilmentActivationRequest getFulfilmentActivationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationRequest)get_store().find_element_user(FULFILMENTACTIVATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentActivationRequest" element
     */
    public boolean isNilFulfilmentActivationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationRequest)get_store().find_element_user(FULFILMENTACTIVATIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentActivationRequest" element
     */
    public void setFulfilmentActivationRequest(com.cdiscount.www.FulfilmentActivationRequest fulfilmentActivationRequest)
    {
        generatedSetterHelperImpl(fulfilmentActivationRequest, FULFILMENTACTIVATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentActivationRequest" element
     */
    public com.cdiscount.www.FulfilmentActivationRequest addNewFulfilmentActivationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationRequest)get_store().add_element_user(FULFILMENTACTIVATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentActivationRequest" element
     */
    public void setNilFulfilmentActivationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentActivationRequest target = null;
            target = (com.cdiscount.www.FulfilmentActivationRequest)get_store().find_element_user(FULFILMENTACTIVATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentActivationRequest)get_store().add_element_user(FULFILMENTACTIVATIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
