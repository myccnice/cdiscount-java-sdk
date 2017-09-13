/*
 * An XML document type.
 * Localname: SubmitFulfilmentSupplyOrder
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitFulfilmentSupplyOrder(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitFulfilmentSupplyOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitFulfilmentSupplyOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITFULFILMENTSUPPLYORDER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitFulfilmentSupplyOrder");
    
    
    /**
     * Gets the "SubmitFulfilmentSupplyOrder" element
     */
    public com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder getSubmitFulfilmentSupplyOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder target = null;
            target = (com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder)get_store().find_element_user(SUBMITFULFILMENTSUPPLYORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitFulfilmentSupplyOrder" element
     */
    public void setSubmitFulfilmentSupplyOrder(com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder submitFulfilmentSupplyOrder)
    {
        generatedSetterHelperImpl(submitFulfilmentSupplyOrder, SUBMITFULFILMENTSUPPLYORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitFulfilmentSupplyOrder" element
     */
    public com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder addNewSubmitFulfilmentSupplyOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder target = null;
            target = (com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder)get_store().add_element_user(SUBMITFULFILMENTSUPPLYORDER$0);
            return target;
        }
    }
    /**
     * An XML SubmitFulfilmentSupplyOrder(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitFulfilmentSupplyOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentSupplyOrderDocument.SubmitFulfilmentSupplyOrder
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitFulfilmentSupplyOrderImpl(org.apache.xmlbeans.SchemaType sType)
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
        public com.cdiscount.www.FulfilmentSupplyOrderRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
                target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().find_element_user(REQUEST$2, 0);
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
                com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
                target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().find_element_user(REQUEST$2, 0);
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
        public void setRequest(com.cdiscount.www.FulfilmentSupplyOrderRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public com.cdiscount.www.FulfilmentSupplyOrderRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
                target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().add_element_user(REQUEST$2);
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
                com.cdiscount.www.FulfilmentSupplyOrderRequest target = null;
                target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.FulfilmentSupplyOrderRequest)get_store().add_element_user(REQUEST$2);
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
