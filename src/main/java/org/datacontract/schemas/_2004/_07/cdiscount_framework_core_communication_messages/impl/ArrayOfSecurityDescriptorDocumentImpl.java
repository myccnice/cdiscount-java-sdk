/*
 * An XML document type.
 * Localname: ArrayOfSecurityDescriptor
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one ArrayOfSecurityDescriptor(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class ArrayOfSecurityDescriptorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSecurityDescriptorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSECURITYDESCRIPTOR$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "ArrayOfSecurityDescriptor");
    
    
    /**
     * Gets the "ArrayOfSecurityDescriptor" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor getArrayOfSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().find_element_user(ARRAYOFSECURITYDESCRIPTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSecurityDescriptor" element
     */
    public boolean isNilArrayOfSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().find_element_user(ARRAYOFSECURITYDESCRIPTOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSecurityDescriptor" element
     */
    public void setArrayOfSecurityDescriptor(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor arrayOfSecurityDescriptor)
    {
        generatedSetterHelperImpl(arrayOfSecurityDescriptor, ARRAYOFSECURITYDESCRIPTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSecurityDescriptor" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor addNewArrayOfSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().add_element_user(ARRAYOFSECURITYDESCRIPTOR$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSecurityDescriptor" element
     */
    public void setNilArrayOfSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().find_element_user(ARRAYOFSECURITYDESCRIPTOR$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfSecurityDescriptor)get_store().add_element_user(ARRAYOFSECURITYDESCRIPTOR$0);
            }
            target.setNil();
        }
    }
}
