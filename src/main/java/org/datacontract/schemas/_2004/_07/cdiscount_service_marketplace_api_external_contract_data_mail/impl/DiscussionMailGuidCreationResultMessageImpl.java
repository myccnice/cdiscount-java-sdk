/*
 * XML Type:  DiscussionMailGuidCreationResultMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.impl;
/**
 * An XML DiscussionMailGuidCreationResultMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail).
 *
 * This is a complex type.
 */
public class DiscussionMailGuidCreationResultMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationResultMessage
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailGuidCreationResultMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAILGUID$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail", "MailGuid");
    
    
    /**
     * Gets the "MailGuid" element
     */
    public java.lang.String getMailGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILGUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MailGuid" element
     */
    public org.apache.xmlbeans.XmlString xgetMailGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAILGUID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MailGuid" element
     */
    public boolean isNilMailGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAILGUID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MailGuid" element
     */
    public boolean isSetMailGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAILGUID$0) != 0;
        }
    }
    
    /**
     * Sets the "MailGuid" element
     */
    public void setMailGuid(java.lang.String mailGuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILGUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAILGUID$0);
            }
            target.setStringValue(mailGuid);
        }
    }
    
    /**
     * Sets (as xml) the "MailGuid" element
     */
    public void xsetMailGuid(org.apache.xmlbeans.XmlString mailGuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAILGUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAILGUID$0);
            }
            target.set(mailGuid);
        }
    }
    
    /**
     * Nils the "MailGuid" element
     */
    public void setNilMailGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAILGUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAILGUID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MailGuid" element
     */
    public void unsetMailGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAILGUID$0, 0);
        }
    }
}
