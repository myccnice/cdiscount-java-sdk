/*
 * An XML document type.
 * Localname: SubjectLocality
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocalityDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * A document containing one SubjectLocality(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public class SubjectLocalityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocalityDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubjectLocalityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECTLOCALITY$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SubjectLocality");
    
    
    /**
     * Gets the "SubjectLocality" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality getSubjectLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().find_element_user(SUBJECTLOCALITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SubjectLocality" element
     */
    public boolean isNilSubjectLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().find_element_user(SUBJECTLOCALITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SubjectLocality" element
     */
    public void setSubjectLocality(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality subjectLocality)
    {
        generatedSetterHelperImpl(subjectLocality, SUBJECTLOCALITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubjectLocality" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality addNewSubjectLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().add_element_user(SUBJECTLOCALITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "SubjectLocality" element
     */
    public void setNilSubjectLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().find_element_user(SUBJECTLOCALITY$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().add_element_user(SUBJECTLOCALITY$0);
            }
            target.setNil();
        }
    }
}
