/*
 * An XML document type.
 * Localname: GetFulfilmentSupplyOrderReportList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetFulfilmentSupplyOrderReportList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetFulfilmentSupplyOrderReportListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFulfilmentSupplyOrderReportListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULFILMENTSUPPLYORDERREPORTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentSupplyOrderReportList");
    
    
    /**
     * Gets the "GetFulfilmentSupplyOrderReportList" element
     */
    public com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList getGetFulfilmentSupplyOrderReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList target = null;
            target = (com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList)get_store().find_element_user(GETFULFILMENTSUPPLYORDERREPORTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFulfilmentSupplyOrderReportList" element
     */
    public void setGetFulfilmentSupplyOrderReportList(com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList getFulfilmentSupplyOrderReportList)
    {
        generatedSetterHelperImpl(getFulfilmentSupplyOrderReportList, GETFULFILMENTSUPPLYORDERREPORTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetFulfilmentSupplyOrderReportList" element
     */
    public com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList addNewGetFulfilmentSupplyOrderReportList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList target = null;
            target = (com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList)get_store().add_element_user(GETFULFILMENTSUPPLYORDERREPORTLIST$0);
            return target;
        }
    }
    /**
     * An XML GetFulfilmentSupplyOrderReportList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetFulfilmentSupplyOrderReportListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentSupplyOrderReportListDocument.GetFulfilmentSupplyOrderReportList
    {
        private static final long serialVersionUID = 1L;
        
        public GetFulfilmentSupplyOrderReportListImpl(org.apache.xmlbeans.SchemaType sType)
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
        public com.cdiscount.www.SupplyOrderReportRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportRequest target = null;
                target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().find_element_user(REQUEST$2, 0);
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
                com.cdiscount.www.SupplyOrderReportRequest target = null;
                target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().find_element_user(REQUEST$2, 0);
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
        public void setRequest(com.cdiscount.www.SupplyOrderReportRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public com.cdiscount.www.SupplyOrderReportRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportRequest target = null;
                target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().add_element_user(REQUEST$2);
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
                com.cdiscount.www.SupplyOrderReportRequest target = null;
                target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SupplyOrderReportRequest)get_store().add_element_user(REQUEST$2);
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
