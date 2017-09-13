/*
 * An XML document type.
 * Localname: GetRelaysFileSubmissionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetRelaysFileSubmissionResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetRelaysFileSubmissionResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetRelaysFileSubmissionResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetRelaysFileSubmissionResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRelaysFileSubmissionResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRELAYSFILESUBMISSIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetRelaysFileSubmissionResult");
    
    
    /**
     * Gets the "GetRelaysFileSubmissionResult" element
     */
    public com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult getGetRelaysFileSubmissionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult target = null;
            target = (com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult)get_store().find_element_user(GETRELAYSFILESUBMISSIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRelaysFileSubmissionResult" element
     */
    public void setGetRelaysFileSubmissionResult(com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult getRelaysFileSubmissionResult)
    {
        generatedSetterHelperImpl(getRelaysFileSubmissionResult, GETRELAYSFILESUBMISSIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetRelaysFileSubmissionResult" element
     */
    public com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult addNewGetRelaysFileSubmissionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult target = null;
            target = (com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult)get_store().add_element_user(GETRELAYSFILESUBMISSIONRESULT$0);
            return target;
        }
    }
    /**
     * An XML GetRelaysFileSubmissionResult(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetRelaysFileSubmissionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetRelaysFileSubmissionResultDocument.GetRelaysFileSubmissionResult
    {
        private static final long serialVersionUID = 1L;
        
        public GetRelaysFileSubmissionResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName RELAYSFILEFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "relaysFileFilter");
        
        
        /**
         * Gets the "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage getHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "headerMessage" element
         */
        public boolean isNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "headerMessage" element
         */
        public boolean isSetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADERMESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "headerMessage" element
         */
        public void setHeaderMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage headerMessage)
        {
            generatedSetterHelperImpl(headerMessage, HEADERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage addNewHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                return target;
            }
        }
        
        /**
         * Nils the "headerMessage" element
         */
        public void setNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "headerMessage" element
         */
        public void unsetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADERMESSAGE$0, 0);
            }
        }
        
        /**
         * Gets the "relaysFileFilter" element
         */
        public com.cdiscount.www.RelaysFileFilter getRelaysFileFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileFilter target = null;
                target = (com.cdiscount.www.RelaysFileFilter)get_store().find_element_user(RELAYSFILEFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "relaysFileFilter" element
         */
        public boolean isNilRelaysFileFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileFilter target = null;
                target = (com.cdiscount.www.RelaysFileFilter)get_store().find_element_user(RELAYSFILEFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "relaysFileFilter" element
         */
        public boolean isSetRelaysFileFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELAYSFILEFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "relaysFileFilter" element
         */
        public void setRelaysFileFilter(com.cdiscount.www.RelaysFileFilter relaysFileFilter)
        {
            generatedSetterHelperImpl(relaysFileFilter, RELAYSFILEFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relaysFileFilter" element
         */
        public com.cdiscount.www.RelaysFileFilter addNewRelaysFileFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileFilter target = null;
                target = (com.cdiscount.www.RelaysFileFilter)get_store().add_element_user(RELAYSFILEFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "relaysFileFilter" element
         */
        public void setNilRelaysFileFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileFilter target = null;
                target = (com.cdiscount.www.RelaysFileFilter)get_store().find_element_user(RELAYSFILEFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.RelaysFileFilter)get_store().add_element_user(RELAYSFILEFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "relaysFileFilter" element
         */
        public void unsetRelaysFileFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELAYSFILEFILTER$2, 0);
            }
        }
    }
}
