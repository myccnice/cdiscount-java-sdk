/*
 * An XML document type.
 * Localname: ArrayOfDomainRights
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRightsDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one ArrayOfDomainRights(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class ArrayOfDomainRightsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRightsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDomainRightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDOMAINRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "ArrayOfDomainRights");
    
    
    /**
     * Gets the "ArrayOfDomainRights" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights getArrayOfDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().find_element_user(ARRAYOFDOMAINRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfDomainRights" element
     */
    public boolean isNilArrayOfDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().find_element_user(ARRAYOFDOMAINRIGHTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfDomainRights" element
     */
    public void setArrayOfDomainRights(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights arrayOfDomainRights)
    {
        generatedSetterHelperImpl(arrayOfDomainRights, ARRAYOFDOMAINRIGHTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfDomainRights" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights addNewArrayOfDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().add_element_user(ARRAYOFDOMAINRIGHTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfDomainRights" element
     */
    public void setNilArrayOfDomainRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().find_element_user(ARRAYOFDOMAINRIGHTS$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().add_element_user(ARRAYOFDOMAINRIGHTS$0);
            }
            target.setNil();
        }
    }
}
