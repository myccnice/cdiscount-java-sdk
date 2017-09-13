/*
 * An XML document type.
 * Localname: ArrayOfSellerRefundRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSellerRefundRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfSellerRefundRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfSellerRefundRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSellerRefundRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSellerRefundRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSELLERREFUNDREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfSellerRefundRequest");
    
    
    /**
     * Gets the "ArrayOfSellerRefundRequest" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundRequest getArrayOfSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(ARRAYOFSELLERREFUNDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSellerRefundRequest" element
     */
    public boolean isNilArrayOfSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(ARRAYOFSELLERREFUNDREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSellerRefundRequest" element
     */
    public void setArrayOfSellerRefundRequest(com.cdiscount.www.ArrayOfSellerRefundRequest arrayOfSellerRefundRequest)
    {
        generatedSetterHelperImpl(arrayOfSellerRefundRequest, ARRAYOFSELLERREFUNDREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSellerRefundRequest" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundRequest addNewArrayOfSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().add_element_user(ARRAYOFSELLERREFUNDREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSellerRefundRequest" element
     */
    public void setNilArrayOfSellerRefundRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundRequest target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().find_element_user(ARRAYOFSELLERREFUNDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerRefundRequest)get_store().add_element_user(ARRAYOFSELLERREFUNDREQUEST$0);
            }
            target.setNil();
        }
    }
}
