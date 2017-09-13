/*
 * An XML document type.
 * Localname: DiscussionMailGuidCreationResultMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.impl;
/**
 * A document containing one DiscussionMailGuidCreationResultMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail) element.
 *
 * This is a complex type.
 */
public class DiscussionMailGuidCreationResultMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailGuidCreationResultMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONMAILGUIDCREATIONRESULTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail", "DiscussionMailGuidCreationResultMessage");
    
    
    /**
     * Gets the "DiscussionMailGuidCreationResultMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage getDiscussionMailGuidCreationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().find_element_user(DISCUSSIONMAILGUIDCREATIONRESULTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionMailGuidCreationResultMessage" element
     */
    public boolean isNilDiscussionMailGuidCreationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().find_element_user(DISCUSSIONMAILGUIDCREATIONRESULTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionMailGuidCreationResultMessage" element
     */
    public void setDiscussionMailGuidCreationResultMessage(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage discussionMailGuidCreationResultMessage)
    {
        generatedSetterHelperImpl(discussionMailGuidCreationResultMessage, DISCUSSIONMAILGUIDCREATIONRESULTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionMailGuidCreationResultMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage addNewDiscussionMailGuidCreationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().add_element_user(DISCUSSIONMAILGUIDCREATIONRESULTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscussionMailGuidCreationResultMessage" element
     */
    public void setNilDiscussionMailGuidCreationResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().find_element_user(DISCUSSIONMAILGUIDCREATIONRESULTMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage)get_store().add_element_user(DISCUSSIONMAILGUIDCREATIONRESULTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
