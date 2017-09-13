/*
 * XML Type:  DiscussionMailGuidCreationRequestMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.impl;
/**
 * An XML DiscussionMailGuidCreationRequestMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail).
 *
 * This is a complex type.
 */
public class DiscussionMailGuidCreationRequestMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_mail.DiscussionMailGuidCreationRequestMessage
{
    private static final long serialVersionUID = 1L;
    
    public DiscussionMailGuidCreationRequestMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPUSID$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Mail", "ScopusId");
    
    
    /**
     * Gets the "ScopusId" element
     */
    public java.lang.String getScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPUSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScopusId" element
     */
    public org.apache.xmlbeans.XmlString xgetScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ScopusId" element
     */
    public boolean isNilScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ScopusId" element
     */
    public boolean isSetScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPUSID$0) != 0;
        }
    }
    
    /**
     * Sets the "ScopusId" element
     */
    public void setScopusId(java.lang.String scopusId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPUSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPUSID$0);
            }
            target.setStringValue(scopusId);
        }
    }
    
    /**
     * Sets (as xml) the "ScopusId" element
     */
    public void xsetScopusId(org.apache.xmlbeans.XmlString scopusId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPUSID$0);
            }
            target.set(scopusId);
        }
    }
    
    /**
     * Nils the "ScopusId" element
     */
    public void setNilScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPUSID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ScopusId" element
     */
    public void unsetScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPUSID$0, 0);
        }
    }
}
