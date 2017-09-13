/*
 * An XML document type.
 * Localname: GetFulfilmentActivationReportList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentActivationReportListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetFulfilmentActivationReportList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetFulfilmentActivationReportListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentActivationReportListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFulfilmentActivationReportListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULFILMENTACTIVATIONREPORTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentActivationReportList");
    
    
    /**
     * Gets the "GetFulfilmentActivationReportList" element
     */
    public com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList getGetFulfilmentActivationReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList target = null;
            target = (com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList)get_store().find_element_user(GETFULFILMENTACTIVATIONREPORTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFulfilmentActivationReportList" element
     */
    public void setGetFulfilmentActivationReportList(com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList getFulfilmentActivationReportList)
    {
        generatedSetterHelperImpl(getFulfilmentActivationReportList, GETFULFILMENTACTIVATIONREPORTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetFulfilmentActivationReportList" element
     */
    public com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList addNewGetFulfilmentActivationReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList target = null;
            target = (com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList)get_store().add_element_user(GETFULFILMENTACTIVATIONREPORTLIST$0);
            return target;
        }
    }
    /**
     * An XML GetFulfilmentActivationReportList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetFulfilmentActivationReportListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentActivationReportListDocument.GetFulfilmentActivationReportList
    {
        private static final long serialVersionUID = 1L;
        
        public GetFulfilmentActivationReportListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName REQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "request");
        
        
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
         * Gets the "request" element
         */
        public com.cdiscount.www.FulfilmentActivationReportRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportRequest target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "request" element
         */
        public boolean isNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportRequest target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(com.cdiscount.www.FulfilmentActivationReportRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public com.cdiscount.www.FulfilmentActivationReportRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportRequest target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().add_element_user(REQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "request" element
         */
        public void setNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportRequest target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.FulfilmentActivationReportRequest)get_store().add_element_user(REQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$2, 0);
            }
        }
    }
}
