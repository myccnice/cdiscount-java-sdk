/*
 * An XML document type.
 * Localname: FulfilmentDeliveryDocumentRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentDeliveryDocumentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentDeliveryDocumentRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentDeliveryDocumentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentDeliveryDocumentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentDeliveryDocumentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTDELIVERYDOCUMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentDeliveryDocumentRequest");
    
    
    /**
     * Gets the "FulfilmentDeliveryDocumentRequest" element
     */
    public com.cdiscount.www.FulfilmentDeliveryDocumentRequest getFulfilmentDeliveryDocumentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentDeliveryDocumentRequest target = null;
            target = (com.cdiscount.www.FulfilmentDeliveryDocumentRequest)get_store().find_element_user(FULFILMENTDELIVERYDOCUMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentDeliveryDocumentRequest" element
     */
    public boolean isNilFulfilmentDeliveryDocumentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentDeliveryDocumentRequest target = null;
            target = (com.cdiscount.www.FulfilmentDeliveryDocumentRequest)get_store().find_element_user(FULFILMENTDELIVERYDOCUMENTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentDeliveryDocumentRequest" element
     */
    public void setFulfilmentDeliveryDocumentRequest(com.cdiscount.www.FulfilmentDeliveryDocumentRequest fulfilmentDeliveryDocumentRequest)
    {
        generatedSetterHelperImpl(fulfilmentDeliveryDocumentRequest, FULFILMENTDELIVERYDOCUMENTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentDeliveryDocumentRequest" element
     */
    public com.cdiscount.www.FulfilmentDeliveryDocumentRequest addNewFulfilmentDeliveryDocumentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentDeliveryDocumentRequest target = null;
            target = (com.cdiscount.www.FulfilmentDeliveryDocumentRequest)get_store().add_element_user(FULFILMENTDELIVERYDOCUMENTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentDeliveryDocumentRequest" element
     */
    public void setNilFulfilmentDeliveryDocumentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentDeliveryDocumentRequest target = null;
            target = (com.cdiscount.www.FulfilmentDeliveryDocumentRequest)get_store().find_element_user(FULFILMENTDELIVERYDOCUMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentDeliveryDocumentRequest)get_store().add_element_user(FULFILMENTDELIVERYDOCUMENTREQUEST$0);
            }
            target.setNil();
        }
    }
}
