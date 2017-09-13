/*
 * An XML document type.
 * Localname: FulfilmentOnDemandOrderLineFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOnDemandOrderLineFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentOnDemandOrderLineFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentOnDemandOrderLineFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOnDemandOrderLineFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOnDemandOrderLineFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTONDEMANDORDERLINEFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentOnDemandOrderLineFilter");
    
    
    /**
     * Gets the "FulfilmentOnDemandOrderLineFilter" element
     */
    public com.cdiscount.www.FulfilmentOnDemandOrderLineFilter getFulfilmentOnDemandOrderLineFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandOrderLineFilter target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandOrderLineFilter)get_store().find_element_user(FULFILMENTONDEMANDORDERLINEFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentOnDemandOrderLineFilter" element
     */
    public boolean isNilFulfilmentOnDemandOrderLineFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandOrderLineFilter target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandOrderLineFilter)get_store().find_element_user(FULFILMENTONDEMANDORDERLINEFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentOnDemandOrderLineFilter" element
     */
    public void setFulfilmentOnDemandOrderLineFilter(com.cdiscount.www.FulfilmentOnDemandOrderLineFilter fulfilmentOnDemandOrderLineFilter)
    {
        generatedSetterHelperImpl(fulfilmentOnDemandOrderLineFilter, FULFILMENTONDEMANDORDERLINEFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentOnDemandOrderLineFilter" element
     */
    public com.cdiscount.www.FulfilmentOnDemandOrderLineFilter addNewFulfilmentOnDemandOrderLineFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandOrderLineFilter target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandOrderLineFilter)get_store().add_element_user(FULFILMENTONDEMANDORDERLINEFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentOnDemandOrderLineFilter" element
     */
    public void setNilFulfilmentOnDemandOrderLineFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOnDemandOrderLineFilter target = null;
            target = (com.cdiscount.www.FulfilmentOnDemandOrderLineFilter)get_store().find_element_user(FULFILMENTONDEMANDORDERLINEFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentOnDemandOrderLineFilter)get_store().add_element_user(FULFILMENTONDEMANDORDERLINEFILTER$0);
            }
            target.setNil();
        }
    }
}
