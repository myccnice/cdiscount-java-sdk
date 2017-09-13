/*
 * XML Type:  SecurityContext
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML SecurityContext(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class SecurityContextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext
{
    private static final long serialVersionUID = 1L;
    
    public SecurityContextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINRIGHTSLIST$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "DomainRightsList");
    private static final javax.xml.namespace.QName ISSUERID$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "IssuerID");
    private static final javax.xml.namespace.QName SESSIONID$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SessionID");
    private static final javax.xml.namespace.QName SUBJECTLOCALITY$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SubjectLocality");
    private static final javax.xml.namespace.QName TOKENID$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "TokenId");
    private static final javax.xml.namespace.QName USERNAME$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "UserName");
    
    
    /**
     * Gets the "DomainRightsList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights getDomainRightsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().find_element_user(DOMAINRIGHTSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DomainRightsList" element
     */
    public boolean isNilDomainRightsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().find_element_user(DOMAINRIGHTSLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DomainRightsList" element
     */
    public void setDomainRightsList(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights domainRightsList)
    {
        generatedSetterHelperImpl(domainRightsList, DOMAINRIGHTSLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DomainRightsList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights addNewDomainRightsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().add_element_user(DOMAINRIGHTSLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "DomainRightsList" element
     */
    public void setNilDomainRightsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().find_element_user(DOMAINRIGHTSLIST$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ArrayOfDomainRights)get_store().add_element_user(DOMAINRIGHTSLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "IssuerID" element
     */
    public java.lang.String getIssuerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IssuerID" element
     */
    public org.apache.xmlbeans.XmlString xgetIssuerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUERID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IssuerID" element
     */
    public boolean isNilIssuerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUERID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IssuerID" element
     */
    public void setIssuerID(java.lang.String issuerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUERID$2);
            }
            target.setStringValue(issuerID);
        }
    }
    
    /**
     * Sets (as xml) the "IssuerID" element
     */
    public void xsetIssuerID(org.apache.xmlbeans.XmlString issuerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUERID$2);
            }
            target.set(issuerID);
        }
    }
    
    /**
     * Nils the "IssuerID" element
     */
    public void setNilIssuerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUERID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "SessionID" element
     */
    public java.lang.String getSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SessionID" element
     */
    public org.apache.xmlbeans.XmlString xgetSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SessionID" element
     */
    public boolean isNilSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SessionID" element
     */
    public void setSessionID(java.lang.String sessionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONID$4);
            }
            target.setStringValue(sessionID);
        }
    }
    
    /**
     * Sets (as xml) the "SessionID" element
     */
    public void xsetSessionID(org.apache.xmlbeans.XmlString sessionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONID$4);
            }
            target.set(sessionID);
        }
    }
    
    /**
     * Nils the "SessionID" element
     */
    public void setNilSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONID$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "SubjectLocality" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality getSubjectLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().find_element_user(SUBJECTLOCALITY$6, 0);
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
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().find_element_user(SUBJECTLOCALITY$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SubjectLocality" element
     */
    public boolean isSetSubjectLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTLOCALITY$6) != 0;
        }
    }
    
    /**
     * Sets the "SubjectLocality" element
     */
    public void setSubjectLocality(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality subjectLocality)
    {
        generatedSetterHelperImpl(subjectLocality, SUBJECTLOCALITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().add_element_user(SUBJECTLOCALITY$6);
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
            target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().find_element_user(SUBJECTLOCALITY$6, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SubjectLocality)get_store().add_element_user(SUBJECTLOCALITY$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SubjectLocality" element
     */
    public void unsetSubjectLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTLOCALITY$6, 0);
        }
    }
    
    /**
     * Gets the "TokenId" element
     */
    public java.lang.String getTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TokenId" element
     */
    public org.apache.xmlbeans.XmlString xgetTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TokenId" element
     */
    public boolean isNilTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TokenId" element
     */
    public void setTokenId(java.lang.String tokenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKENID$8);
            }
            target.setStringValue(tokenId);
        }
    }
    
    /**
     * Sets (as xml) the "TokenId" element
     */
    public void xsetTokenId(org.apache.xmlbeans.XmlString tokenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENID$8);
            }
            target.set(tokenId);
        }
    }
    
    /**
     * Nils the "TokenId" element
     */
    public void setNilTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENID$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "UserName" element
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserName" element
     */
    public org.apache.xmlbeans.XmlString xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "UserName" element
     */
    public boolean isNilUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "UserName" element
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$10);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "UserName" element
     */
    public void xsetUserName(org.apache.xmlbeans.XmlString userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$10);
            }
            target.set(userName);
        }
    }
    
    /**
     * Nils the "UserName" element
     */
    public void setNilUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$10);
            }
            target.setNil();
        }
    }
}
