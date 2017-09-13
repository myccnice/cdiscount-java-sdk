/*
 * XML Type:  ArrayOfSecurityDescriptor
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML ArrayOfSecurityDescriptor(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class ArrayOfSecurityDescriptorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSecurityDescriptorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYDESCRIPTOR$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SecurityDescriptor");
    
    
    /**
     * Gets array of all "SecurityDescriptor" elements
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor[] getSecurityDescriptorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECURITYDESCRIPTOR$0, targetList);
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor[] result = new org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecurityDescriptor" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor getSecurityDescriptorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SecurityDescriptor" element
     */
    public boolean isNilSecurityDescriptorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SecurityDescriptor" element
     */
    public int sizeOfSecurityDescriptorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYDESCRIPTOR$0);
        }
    }
    
    /**
     * Sets array of all "SecurityDescriptor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecurityDescriptorArray(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor[] securityDescriptorArray)
    {
        check_orphaned();
        arraySetterHelper(securityDescriptorArray, SECURITYDESCRIPTOR$0);
    }
    
    /**
     * Sets ith "SecurityDescriptor" element
     */
    public void setSecurityDescriptorArray(int i, org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor securityDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityDescriptor);
        }
    }
    
    /**
     * Nils the ith "SecurityDescriptor" element
     */
    public void setNilSecurityDescriptorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().find_element_user(SECURITYDESCRIPTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecurityDescriptor" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor insertNewSecurityDescriptor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().insert_element_user(SECURITYDESCRIPTOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecurityDescriptor" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor addNewSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor)get_store().add_element_user(SECURITYDESCRIPTOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecurityDescriptor" element
     */
    public void removeSecurityDescriptor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYDESCRIPTOR$0, i);
        }
    }
}
