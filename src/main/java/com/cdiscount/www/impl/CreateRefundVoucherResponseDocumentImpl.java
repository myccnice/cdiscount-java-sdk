/*
 * An XML document type.
 * Localname: CreateRefundVoucherResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CreateRefundVoucherResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CreateRefundVoucherResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CreateRefundVoucherResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateRefundVoucherResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateRefundVoucherResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEREFUNDVOUCHERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateRefundVoucherResponse");
    
    
    /**
     * Gets the "CreateRefundVoucherResponse" element
     */
    public com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse getCreateRefundVoucherResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse target = null;
            target = (com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse)get_store().find_element_user(CREATEREFUNDVOUCHERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateRefundVoucherResponse" element
     */
    public void setCreateRefundVoucherResponse(com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse createRefundVoucherResponse)
    {
        generatedSetterHelperImpl(createRefundVoucherResponse, CREATEREFUNDVOUCHERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateRefundVoucherResponse" element
     */
    public com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse addNewCreateRefundVoucherResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse target = null;
            target = (com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse)get_store().add_element_user(CREATEREFUNDVOUCHERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateRefundVoucherResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class CreateRefundVoucherResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CreateRefundVoucherResponseDocument.CreateRefundVoucherResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateRefundVoucherResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEREFUNDVOUCHERRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "CreateRefundVoucherResult");
        
        
        /**
         * Gets the "CreateRefundVoucherResult" element
         */
        public com.cdiscount.www.CreateRefundVoucherMessage getCreateRefundVoucherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CreateRefundVoucherMessage target = null;
                target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().find_element_user(CREATEREFUNDVOUCHERRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "CreateRefundVoucherResult" element
         */
        public boolean isNilCreateRefundVoucherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CreateRefundVoucherMessage target = null;
                target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().find_element_user(CREATEREFUNDVOUCHERRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "CreateRefundVoucherResult" element
         */
        public boolean isSetCreateRefundVoucherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEREFUNDVOUCHERRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CreateRefundVoucherResult" element
         */
        public void setCreateRefundVoucherResult(com.cdiscount.www.CreateRefundVoucherMessage createRefundVoucherResult)
        {
            generatedSetterHelperImpl(createRefundVoucherResult, CREATEREFUNDVOUCHERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CreateRefundVoucherResult" element
         */
        public com.cdiscount.www.CreateRefundVoucherMessage addNewCreateRefundVoucherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CreateRefundVoucherMessage target = null;
                target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().add_element_user(CREATEREFUNDVOUCHERRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "CreateRefundVoucherResult" element
         */
        public void setNilCreateRefundVoucherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CreateRefundVoucherMessage target = null;
                target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().find_element_user(CREATEREFUNDVOUCHERRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.CreateRefundVoucherMessage)get_store().add_element_user(CREATEREFUNDVOUCHERRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "CreateRefundVoucherResult" element
         */
        public void unsetCreateRefundVoucherResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEREFUNDVOUCHERRESULT$0, 0);
            }
        }
    }
}
