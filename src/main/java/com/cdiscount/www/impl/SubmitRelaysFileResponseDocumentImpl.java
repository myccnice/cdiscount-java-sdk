/*
 * An XML document type.
 * Localname: SubmitRelaysFileResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitRelaysFileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitRelaysFileResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitRelaysFileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitRelaysFileResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRelaysFileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITRELAYSFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitRelaysFileResponse");
    
    
    /**
     * Gets the "SubmitRelaysFileResponse" element
     */
    public com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse getSubmitRelaysFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse target = null;
            target = (com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse)get_store().find_element_user(SUBMITRELAYSFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitRelaysFileResponse" element
     */
    public void setSubmitRelaysFileResponse(com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse submitRelaysFileResponse)
    {
        generatedSetterHelperImpl(submitRelaysFileResponse, SUBMITRELAYSFILERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitRelaysFileResponse" element
     */
    public com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse addNewSubmitRelaysFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse target = null;
            target = (com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse)get_store().add_element_user(SUBMITRELAYSFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitRelaysFileResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitRelaysFileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitRelaysFileResponseDocument.SubmitRelaysFileResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitRelaysFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBMITRELAYSFILERESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitRelaysFileResult");
        
        
        /**
         * Gets the "SubmitRelaysFileResult" element
         */
        public com.cdiscount.www.RelaysFileDepositMessage getSubmitRelaysFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileDepositMessage target = null;
                target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().find_element_user(SUBMITRELAYSFILERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SubmitRelaysFileResult" element
         */
        public boolean isNilSubmitRelaysFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileDepositMessage target = null;
                target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().find_element_user(SUBMITRELAYSFILERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "SubmitRelaysFileResult" element
         */
        public boolean isSetSubmitRelaysFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITRELAYSFILERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SubmitRelaysFileResult" element
         */
        public void setSubmitRelaysFileResult(com.cdiscount.www.RelaysFileDepositMessage submitRelaysFileResult)
        {
            generatedSetterHelperImpl(submitRelaysFileResult, SUBMITRELAYSFILERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SubmitRelaysFileResult" element
         */
        public com.cdiscount.www.RelaysFileDepositMessage addNewSubmitRelaysFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileDepositMessage target = null;
                target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().add_element_user(SUBMITRELAYSFILERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "SubmitRelaysFileResult" element
         */
        public void setNilSubmitRelaysFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileDepositMessage target = null;
                target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().find_element_user(SUBMITRELAYSFILERESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.RelaysFileDepositMessage)get_store().add_element_user(SUBMITRELAYSFILERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "SubmitRelaysFileResult" element
         */
        public void unsetSubmitRelaysFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITRELAYSFILERESULT$0, 0);
            }
        }
    }
}
