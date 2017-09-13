/*
 * An XML document type.
 * Localname: CreateRefundVoucherAfterShipmentResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CreateRefundVoucherAfterShipmentResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CreateRefundVoucherAfterShipmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateRefundVoucherAfterShipmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEREFUNDVOUCHERAFTERSHIPMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateRefundVoucherAfterShipmentResponse");
    
    
    /**
     * Gets the "CreateRefundVoucherAfterShipmentResponse" element
     */
    public com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse getCreateRefundVoucherAfterShipmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse target = null;
            target = (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse)get_store().find_element_user(CREATEREFUNDVOUCHERAFTERSHIPMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateRefundVoucherAfterShipmentResponse" element
     */
    public void setCreateRefundVoucherAfterShipmentResponse(com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse createRefundVoucherAfterShipmentResponse)
    {
        generatedSetterHelperImpl(createRefundVoucherAfterShipmentResponse, CREATEREFUNDVOUCHERAFTERSHIPMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateRefundVoucherAfterShipmentResponse" element
     */
    public com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse addNewCreateRefundVoucherAfterShipmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse target = null;
            target = (com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse)get_store().add_element_user(CREATEREFUNDVOUCHERAFTERSHIPMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateRefundVoucherAfterShipmentResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class CreateRefundVoucherAfterShipmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument.CreateRefundVoucherAfterShipmentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateRefundVoucherAfterShipmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateRefundVoucherAfterShipmentResult");
        
        
        /**
         * Gets the "CreateRefundVoucherAfterShipmentResult" element
         */
        public com.cdiscount.www.SellerRefundResultMessage getCreateRefundVoucherAfterShipmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerRefundResultMessage target = null;
                target = (com.cdiscount.www.SellerRefundResultMessage)get_store().find_element_user(CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "CreateRefundVoucherAfterShipmentResult" element
         */
        public boolean isNilCreateRefundVoucherAfterShipmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerRefundResultMessage target = null;
                target = (com.cdiscount.www.SellerRefundResultMessage)get_store().find_element_user(CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "CreateRefundVoucherAfterShipmentResult" element
         */
        public boolean isSetCreateRefundVoucherAfterShipmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CreateRefundVoucherAfterShipmentResult" element
         */
        public void setCreateRefundVoucherAfterShipmentResult(com.cdiscount.www.SellerRefundResultMessage createRefundVoucherAfterShipmentResult)
        {
            generatedSetterHelperImpl(createRefundVoucherAfterShipmentResult, CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CreateRefundVoucherAfterShipmentResult" element
         */
        public com.cdiscount.www.SellerRefundResultMessage addNewCreateRefundVoucherAfterShipmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerRefundResultMessage target = null;
                target = (com.cdiscount.www.SellerRefundResultMessage)get_store().add_element_user(CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "CreateRefundVoucherAfterShipmentResult" element
         */
        public void setNilCreateRefundVoucherAfterShipmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerRefundResultMessage target = null;
                target = (com.cdiscount.www.SellerRefundResultMessage)get_store().find_element_user(CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SellerRefundResultMessage)get_store().add_element_user(CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "CreateRefundVoucherAfterShipmentResult" element
         */
        public void unsetCreateRefundVoucherAfterShipmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEREFUNDVOUCHERAFTERSHIPMENTRESULT$0, 0);
            }
        }
    }
}
