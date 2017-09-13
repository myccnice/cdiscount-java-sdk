/*
 * An XML document type.
 * Localname: DomainRights
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRightsDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one DomainRights(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class DomainRightsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRightsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DomainRightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "DomainRights");
    
    
    /**
     * Gets the "DomainRights" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights getDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().find_element_user(DOMAINRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DomainRights" element
     */
    public boolean isNilDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().find_element_user(DOMAINRIGHTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DomainRights" element
     */
    public void setDomainRights(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights domainRights)
    {
        generatedSetterHelperImpl(domainRights, DOMAINRIGHTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DomainRights" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights addNewDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().add_element_user(DOMAINRIGHTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "DomainRights" element
     */
    public void setNilDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().find_element_user(DOMAINRIGHTS$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().add_element_user(DOMAINRIGHTS$0);
            }
            target.setNil();
        }
    }
}
