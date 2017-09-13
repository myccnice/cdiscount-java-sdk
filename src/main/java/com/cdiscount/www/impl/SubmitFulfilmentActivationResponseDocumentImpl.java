/*
 * An XML document type.
 * Localname: SubmitFulfilmentActivationResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitFulfilmentActivationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitFulfilmentActivationResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitFulfilmentActivationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentActivationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitFulfilmentActivationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITFULFILMENTACTIVATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitFulfilmentActivationResponse");
    
    
    /**
     * Gets the "SubmitFulfilmentActivationResponse" element
     */
    public com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse getSubmitFulfilmentActivationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse target = null;
            target = (com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse)get_store().find_element_user(SUBMITFULFILMENTACTIVATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitFulfilmentActivationResponse" element
     */
    public void setSubmitFulfilmentActivationResponse(com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse submitFulfilmentActivationResponse)
    {
        generatedSetterHelperImpl(submitFulfilmentActivationResponse, SUBMITFULFILMENTACTIVATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitFulfilmentActivationResponse" element
     */
    public com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse addNewSubmitFulfilmentActivationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse target = null;
            target = (com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse)get_store().add_element_user(SUBMITFULFILMENTACTIVATIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitFulfilmentActivationResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitFulfilmentActivationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentActivationResponseDocument.SubmitFulfilmentActivationResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitFulfilmentActivationResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBMITFULFILMENTACTIVATIONRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitFulfilmentActivationResult");
        
        
        /**
         * Gets the "SubmitFulfilmentActivationResult" element
         */
        public com.cdiscount.www.FulfilmentActivationMessage getSubmitFulfilmentActivationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().find_element_user(SUBMITFULFILMENTACTIVATIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SubmitFulfilmentActivationResult" element
         */
        public boolean isNilSubmitFulfilmentActivationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().find_element_user(SUBMITFULFILMENTACTIVATIONRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "SubmitFulfilmentActivationResult" element
         */
        public boolean isSetSubmitFulfilmentActivationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITFULFILMENTACTIVATIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SubmitFulfilmentActivationResult" element
         */
        public void setSubmitFulfilmentActivationResult(com.cdiscount.www.FulfilmentActivationMessage submitFulfilmentActivationResult)
        {
            generatedSetterHelperImpl(submitFulfilmentActivationResult, SUBMITFULFILMENTACTIVATIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SubmitFulfilmentActivationResult" element
         */
        public com.cdiscount.www.FulfilmentActivationMessage addNewSubmitFulfilmentActivationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().add_element_user(SUBMITFULFILMENTACTIVATIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "SubmitFulfilmentActivationResult" element
         */
        public void setNilSubmitFulfilmentActivationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().find_element_user(SUBMITFULFILMENTACTIVATIONRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.FulfilmentActivationMessage)get_store().add_element_user(SUBMITFULFILMENTACTIVATIONRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "SubmitFulfilmentActivationResult" element
         */
        public void unsetSubmitFulfilmentActivationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITFULFILMENTACTIVATIONRESULT$0, 0);
            }
        }
    }
}
