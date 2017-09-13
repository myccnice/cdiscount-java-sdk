/*
 * An XML document type.
 * Localname: ArrayOfFulfilmentOrderLineRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfFulfilmentOrderLineRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfFulfilmentOrderLineRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfFulfilmentOrderLineRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfFulfilmentOrderLineRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFulfilmentOrderLineRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFULFILMENTORDERLINEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfFulfilmentOrderLineRequest");
    
    
    /**
     * Gets the "ArrayOfFulfilmentOrderLineRequest" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest getArrayOfFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().find_element_user(ARRAYOFFULFILMENTORDERLINEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfFulfilmentOrderLineRequest" element
     */
    public boolean isNilArrayOfFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().find_element_user(ARRAYOFFULFILMENTORDERLINEREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfFulfilmentOrderLineRequest" element
     */
    public void setArrayOfFulfilmentOrderLineRequest(com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest arrayOfFulfilmentOrderLineRequest)
    {
        generatedSetterHelperImpl(arrayOfFulfilmentOrderLineRequest, ARRAYOFFULFILMENTORDERLINEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfFulfilmentOrderLineRequest" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest addNewArrayOfFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().add_element_user(ARRAYOFFULFILMENTORDERLINEREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfFulfilmentOrderLineRequest" element
     */
    public void setNilArrayOfFulfilmentOrderLineRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().find_element_user(ARRAYOFFULFILMENTORDERLINEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentOrderLineRequest)get_store().add_element_user(ARRAYOFFULFILMENTORDERLINEREQUEST$0);
            }
            target.setNil();
        }
    }
}
