/*
 * An XML document type.
 * Localname: GenerateDiscussionMailGuidResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GenerateDiscussionMailGuidResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GenerateDiscussionMailGuidResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenerateDiscussionMailGuidResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERATEDISCUSSIONMAILGUIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GenerateDiscussionMailGuidResponse");
    
    
    /**
     * Gets the "GenerateDiscussionMailGuidResponse" element
     */
    public com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse getGenerateDiscussionMailGuidResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse target = null;
            target = (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse)get_store().find_element_user(GENERATEDISCUSSIONMAILGUIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenerateDiscussionMailGuidResponse" element
     */
    public void setGenerateDiscussionMailGuidResponse(com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse generateDiscussionMailGuidResponse)
    {
        generatedSetterHelperImpl(generateDiscussionMailGuidResponse, GENERATEDISCUSSIONMAILGUIDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GenerateDiscussionMailGuidResponse" element
     */
    public com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse addNewGenerateDiscussionMailGuidResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse target = null;
            target = (com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse)get_store().add_element_user(GENERATEDISCUSSIONMAILGUIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GenerateDiscussionMailGuidResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GenerateDiscussionMailGuidResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument.GenerateDiscussionMailGuidResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GenerateDiscussionMailGuidResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENERATEDISCUSSIONMAILGUIDRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GenerateDiscussionMailGuidResult");
        
        
        /**
         * Gets the "GenerateDiscussionMailGuidResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage getGenerateDiscussionMailGuidResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().find_element_user(GENERATEDISCUSSIONMAILGUIDRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GenerateDiscussionMailGuidResult" element
         */
        public boolean isNilGenerateDiscussionMailGuidResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().find_element_user(GENERATEDISCUSSIONMAILGUIDRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GenerateDiscussionMailGuidResult" element
         */
        public boolean isSetGenerateDiscussionMailGuidResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERATEDISCUSSIONMAILGUIDRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GenerateDiscussionMailGuidResult" element
         */
        public void setGenerateDiscussionMailGuidResult(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage generateDiscussionMailGuidResult)
        {
            generatedSetterHelperImpl(generateDiscussionMailGuidResult, GENERATEDISCUSSIONMAILGUIDRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GenerateDiscussionMailGuidResult" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage addNewGenerateDiscussionMailGuidResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().add_element_user(GENERATEDISCUSSIONMAILGUIDRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GenerateDiscussionMailGuidResult" element
         */
        public void setNilGenerateDiscussionMailGuidResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().find_element_user(GENERATEDISCUSSIONMAILGUIDRESULT$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().add_element_user(GENERATEDISCUSSIONMAILGUIDRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GenerateDiscussionMailGuidResult" element
         */
        public void unsetGenerateDiscussionMailGuidResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERATEDISCUSSIONMAILGUIDRESULT$0, 0);
            }
        }
    }
}
