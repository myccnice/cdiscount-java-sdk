/*
 * An XML document type.
 * Localname: DiscussionMailGuidCreationRequestMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.impl;
/**
 * A document containing one DiscussionMailGuidCreationRequestMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail) element.
 *
 * This is a complex type.
 */
public class DiscussionMailGuidCreationRequestMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailGuidCreationRequestMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONMAILGUIDCREATIONREQUESTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail", "DiscussionMailGuidCreationRequestMessage");
    
    
    /**
     * Gets the "DiscussionMailGuidCreationRequestMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage getDiscussionMailGuidCreationRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage)get_store().find_element_user(DISCUSSIONMAILGUIDCREATIONREQUESTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscussionMailGuidCreationRequestMessage" element
     */
    public boolean isNilDiscussionMailGuidCreationRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage)get_store().find_element_user(DISCUSSIONMAILGUIDCREATIONREQUESTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscussionMailGuidCreationRequestMessage" element
     */
    public void setDiscussionMailGuidCreationRequestMessage(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage discussionMailGuidCreationRequestMessage)
    {
        generatedSetterHelperImpl(discussionMailGuidCreationRequestMessage, DISCUSSIONMAILGUIDCREATIONREQUESTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscussionMailGuidCreationRequestMessage" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage addNewDiscussionMailGuidCreationRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage)get_store().add_element_user(DISCUSSIONMAILGUIDCREATIONREQUESTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscussionMailGuidCreationRequestMessage" element
     */
    public void setNilDiscussionMailGuidCreationRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage)get_store().find_element_user(DISCUSSIONMAILGUIDCREATIONREQUESTMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage)get_store().add_element_user(DISCUSSIONMAILGUIDCREATIONREQUESTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
