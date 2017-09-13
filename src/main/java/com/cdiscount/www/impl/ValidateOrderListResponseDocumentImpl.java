/*
 * An XML document type.
 * Localname: ValidateOrderListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidateOrderListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidateOrderListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderListResponse");
    
    
    /**
     * Gets the "ValidateOrderListResponse" element
     */
    public com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse getValidateOrderListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse target = null;
            target = (com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse)get_store().find_element_user(VALIDATEORDERLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidateOrderListResponse" element
     */
    public void setValidateOrderListResponse(com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse validateOrderListResponse)
    {
        generatedSetterHelperImpl(validateOrderListResponse, VALIDATEORDERLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderListResponse" element
     */
    public com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse addNewValidateOrderListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse target = null;
            target = (com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse)get_store().add_element_user(VALIDATEORDERLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ValidateOrderListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class ValidateOrderListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderListResponseDocument.ValidateOrderListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ValidateOrderListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALIDATEORDERLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderListResult");
        
        
        /**
         * Gets the "ValidateOrderListResult" element
         */
        public com.cdiscount.www.ValidationResultMessage getValidateOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidationResultMessage target = null;
                target = (com.cdiscount.www.ValidationResultMessage)get_store().find_element_user(VALIDATEORDERLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "ValidateOrderListResult" element
         */
        public boolean isNilValidateOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidationResultMessage target = null;
                target = (com.cdiscount.www.ValidationResultMessage)get_store().find_element_user(VALIDATEORDERLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "ValidateOrderListResult" element
         */
        public boolean isSetValidateOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATEORDERLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "ValidateOrderListResult" element
         */
        public void setValidateOrderListResult(com.cdiscount.www.ValidationResultMessage validateOrderListResult)
        {
            generatedSetterHelperImpl(validateOrderListResult, VALIDATEORDERLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ValidateOrderListResult" element
         */
        public com.cdiscount.www.ValidationResultMessage addNewValidateOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidationResultMessage target = null;
                target = (com.cdiscount.www.ValidationResultMessage)get_store().add_element_user(VALIDATEORDERLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "ValidateOrderListResult" element
         */
        public void setNilValidateOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidationResultMessage target = null;
                target = (com.cdiscount.www.ValidationResultMessage)get_store().find_element_user(VALIDATEORDERLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ValidationResultMessage)get_store().add_element_user(VALIDATEORDERLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "ValidateOrderListResult" element
         */
        public void unsetValidateOrderListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATEORDERLISTRESULT$0, 0);
            }
        }
    }
}
