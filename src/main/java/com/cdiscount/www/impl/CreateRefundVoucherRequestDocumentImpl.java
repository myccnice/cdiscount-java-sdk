/*
 * An XML document type.
 * Localname: CreateRefundVoucherRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateRefundVoucherRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CreateRefundVoucherRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CreateRefundVoucherRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateRefundVoucherRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateRefundVoucherRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEREFUNDVOUCHERREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateRefundVoucherRequest");
    
    
    /**
     * Gets the "CreateRefundVoucherRequest" element
     */
    public com.cdiscount.www.CreateRefundVoucherRequest getCreateRefundVoucherRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherRequest target = null;
            target = (com.cdiscount.www.CreateRefundVoucherRequest)get_store().find_element_user(CREATEREFUNDVOUCHERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CreateRefundVoucherRequest" element
     */
    public boolean isNilCreateRefundVoucherRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherRequest target = null;
            target = (com.cdiscount.www.CreateRefundVoucherRequest)get_store().find_element_user(CREATEREFUNDVOUCHERREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CreateRefundVoucherRequest" element
     */
    public void setCreateRefundVoucherRequest(com.cdiscount.www.CreateRefundVoucherRequest createRefundVoucherRequest)
    {
        generatedSetterHelperImpl(createRefundVoucherRequest, CREATEREFUNDVOUCHERREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateRefundVoucherRequest" element
     */
    public com.cdiscount.www.CreateRefundVoucherRequest addNewCreateRefundVoucherRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherRequest target = null;
            target = (com.cdiscount.www.CreateRefundVoucherRequest)get_store().add_element_user(CREATEREFUNDVOUCHERREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "CreateRefundVoucherRequest" element
     */
    public void setNilCreateRefundVoucherRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherRequest target = null;
            target = (com.cdiscount.www.CreateRefundVoucherRequest)get_store().find_element_user(CREATEREFUNDVOUCHERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CreateRefundVoucherRequest)get_store().add_element_user(CREATEREFUNDVOUCHERREQUEST$0);
            }
            target.setNil();
        }
    }
}
