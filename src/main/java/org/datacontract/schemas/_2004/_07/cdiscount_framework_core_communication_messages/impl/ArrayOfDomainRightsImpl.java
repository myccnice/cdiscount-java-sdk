/*
 * XML Type:  ArrayOfDomainRights
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML ArrayOfDomainRights(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class ArrayOfDomainRightsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDomainRightsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "DomainRights");
    
    
    /**
     * Gets array of all "DomainRights" elements
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights[] getDomainRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOMAINRIGHTS$0, targetList);
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights[] result = new org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DomainRights" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights getDomainRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().find_element_user(DOMAINRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "DomainRights" element
     */
    public boolean isNilDomainRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().find_element_user(DOMAINRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "DomainRights" element
     */
    public int sizeOfDomainRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINRIGHTS$0);
        }
    }
    
    /**
     * Sets array of all "DomainRights" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDomainRightsArray(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights[] domainRightsArray)
    {
        check_orphaned();
        arraySetterHelper(domainRightsArray, DOMAINRIGHTS$0);
    }
    
    /**
     * Sets ith "DomainRights" element
     */
    public void setDomainRightsArray(int i, org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights domainRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().find_element_user(DOMAINRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(domainRights);
        }
    }
    
    /**
     * Nils the ith "DomainRights" element
     */
    public void setNilDomainRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().find_element_user(DOMAINRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DomainRights" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights insertNewDomainRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.DomainRights)get_store().insert_element_user(DOMAINRIGHTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DomainRights" element
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
     * Removes the ith "DomainRights" element
     */
    public void removeDomainRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINRIGHTS$0, i);
        }
    }
}
