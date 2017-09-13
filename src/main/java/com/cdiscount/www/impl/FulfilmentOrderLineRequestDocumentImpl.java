/*
 * An XML document type.
 * Localname: FulfilmentOrderLineRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOrderLineRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentOrderLineRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentOrderLineRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOrderLineRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOrderLineRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTORDERLINEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentOrderLineRequest");
    
    
    /**
     * Gets the "FulfilmentOrderLineRequest" element
     */
    public com.cdiscount.www.FulfilmentOrderLineRequest getFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().find_element_user(FULFILMENTORDERLINEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentOrderLineRequest" element
     */
    public boolean isNilFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().find_element_user(FULFILMENTORDERLINEREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentOrderLineRequest" element
     */
    public void setFulfilmentOrderLineRequest(com.cdiscount.www.FulfilmentOrderLineRequest fulfilmentOrderLineRequest)
    {
        generatedSetterHelperImpl(fulfilmentOrderLineRequest, FULFILMENTORDERLINEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentOrderLineRequest" element
     */
    public com.cdiscount.www.FulfilmentOrderLineRequest addNewFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().add_element_user(FULFILMENTORDERLINEREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentOrderLineRequest" element
     */
    public void setNilFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().find_element_user(FULFILMENTORDERLINEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentOrderLineRequest)get_store().add_element_user(FULFILMENTORDERLINEREQUEST$0);
            }
            target.setNil();
        }
    }
}
