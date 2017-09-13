/*
 * An XML document type.
 * Localname: FulfilmentOnDemandSupplyOrderRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentOnDemandSupplyOrderRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentOnDemandSupplyOrderRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOnDemandSupplyOrderRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTONDEMANDSUPPLYORDERREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentOnDemandSupplyOrderRequest");
    
    
    /**
     * Gets the "FulfilmentOnDemandSupplyOrderRequest" element
     */
    public com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest getFulfilmentOnDemandSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest)get_store().find_element_user(FULFILMENTONDEMANDSUPPLYORDERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentOnDemandSupplyOrderRequest" element
     */
    public boolean isNilFulfilmentOnDemandSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest)get_store().find_element_user(FULFILMENTONDEMANDSUPPLYORDERREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentOnDemandSupplyOrderRequest" element
     */
    public void setFulfilmentOnDemandSupplyOrderRequest(com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest fulfilmentOnDemandSupplyOrderRequest)
    {
        generatedSetterHelperImpl(fulfilmentOnDemandSupplyOrderRequest, FULFILMENTONDEMANDSUPPLYORDERREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentOnDemandSupplyOrderRequest" element
     */
    public com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest addNewFulfilmentOnDemandSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest)get_store().add_element_user(FULFILMENTONDEMANDSUPPLYORDERREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentOnDemandSupplyOrderRequest" element
     */
    public void setNilFulfilmentOnDemandSupplyOrderRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest)get_store().find_element_user(FULFILMENTONDEMANDSUPPLYORDERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentOnDemandSupplyOrderRequest)get_store().add_element_user(FULFILMENTONDEMANDSUPPLYORDERREQUEST$0);
            }
            target.setNil();
        }
    }
}
