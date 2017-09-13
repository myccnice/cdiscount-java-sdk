/*
 * An XML document type.
 * Localname: GetOrderQuestionList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOrderQuestionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOrderQuestionList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOrderQuestionListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderQuestionListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOrderQuestionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETORDERQUESTIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderQuestionList");
    
    
    /**
     * Gets the "GetOrderQuestionList" element
     */
    public com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList getGetOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList target = null;
            target = (com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList)get_store().find_element_user(GETORDERQUESTIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOrderQuestionList" element
     */
    public void setGetOrderQuestionList(com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList getOrderQuestionList)
    {
        generatedSetterHelperImpl(getOrderQuestionList, GETORDERQUESTIONLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOrderQuestionList" element
     */
    public com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList addNewGetOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList target = null;
            target = (com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList)get_store().add_element_user(GETORDERQUESTIONLIST$0);
            return target;
        }
    }
    /**
     * An XML GetOrderQuestionList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOrderQuestionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderQuestionListDocument.GetOrderQuestionList
    {
        private static final long serialVersionUID = 1L;
        
        public GetOrderQuestionListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName ORDERQUESTIONFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "orderQuestionFilter");
        
        
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
         * Gets the "orderQuestionFilter" element
         */
        public com.cdiscount.www.OrderQuestionFilter getOrderQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionFilter target = null;
                target = (com.cdiscount.www.OrderQuestionFilter)get_store().find_element_user(ORDERQUESTIONFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "orderQuestionFilter" element
         */
        public boolean isNilOrderQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionFilter target = null;
                target = (com.cdiscount.www.OrderQuestionFilter)get_store().find_element_user(ORDERQUESTIONFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "orderQuestionFilter" element
         */
        public boolean isSetOrderQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERQUESTIONFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "orderQuestionFilter" element
         */
        public void setOrderQuestionFilter(com.cdiscount.www.OrderQuestionFilter orderQuestionFilter)
        {
            generatedSetterHelperImpl(orderQuestionFilter, ORDERQUESTIONFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "orderQuestionFilter" element
         */
        public com.cdiscount.www.OrderQuestionFilter addNewOrderQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionFilter target = null;
                target = (com.cdiscount.www.OrderQuestionFilter)get_store().add_element_user(ORDERQUESTIONFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "orderQuestionFilter" element
         */
        public void setNilOrderQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderQuestionFilter target = null;
                target = (com.cdiscount.www.OrderQuestionFilter)get_store().find_element_user(ORDERQUESTIONFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OrderQuestionFilter)get_store().add_element_user(ORDERQUESTIONFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "orderQuestionFilter" element
         */
        public void unsetOrderQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERQUESTIONFILTER$2, 0);
            }
        }
    }
}
