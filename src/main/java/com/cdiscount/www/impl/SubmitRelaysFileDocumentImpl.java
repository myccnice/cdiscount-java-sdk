/*
 * An XML document type.
 * Localname: SubmitRelaysFile
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitRelaysFileDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitRelaysFile(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitRelaysFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitRelaysFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRelaysFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITRELAYSFILE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitRelaysFile");
    
    
    /**
     * Gets the "SubmitRelaysFile" element
     */
    public com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile getSubmitRelaysFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile target = null;
            target = (com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile)get_store().find_element_user(SUBMITRELAYSFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitRelaysFile" element
     */
    public void setSubmitRelaysFile(com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile submitRelaysFile)
    {
        generatedSetterHelperImpl(submitRelaysFile, SUBMITRELAYSFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitRelaysFile" element
     */
    public com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile addNewSubmitRelaysFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile target = null;
            target = (com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile)get_store().add_element_user(SUBMITRELAYSFILE$0);
            return target;
        }
    }
    /**
     * An XML SubmitRelaysFile(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitRelaysFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitRelaysFileDocument.SubmitRelaysFile
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitRelaysFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName RELAYSFILEREQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "relaysFileRequest");
        
        
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
         * Gets the "relaysFileRequest" element
         */
        public com.cdiscount.www.RelaysFileIntegrationRequest getRelaysFileRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileIntegrationRequest target = null;
                target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().find_element_user(RELAYSFILEREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "relaysFileRequest" element
         */
        public boolean isNilRelaysFileRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileIntegrationRequest target = null;
                target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().find_element_user(RELAYSFILEREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "relaysFileRequest" element
         */
        public boolean isSetRelaysFileRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELAYSFILEREQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "relaysFileRequest" element
         */
        public void setRelaysFileRequest(com.cdiscount.www.RelaysFileIntegrationRequest relaysFileRequest)
        {
            generatedSetterHelperImpl(relaysFileRequest, RELAYSFILEREQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relaysFileRequest" element
         */
        public com.cdiscount.www.RelaysFileIntegrationRequest addNewRelaysFileRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileIntegrationRequest target = null;
                target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().add_element_user(RELAYSFILEREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "relaysFileRequest" element
         */
        public void setNilRelaysFileRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelaysFileIntegrationRequest target = null;
                target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().find_element_user(RELAYSFILEREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().add_element_user(RELAYSFILEREQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "relaysFileRequest" element
         */
        public void unsetRelaysFileRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELAYSFILEREQUEST$2, 0);
            }
        }
    }
}
