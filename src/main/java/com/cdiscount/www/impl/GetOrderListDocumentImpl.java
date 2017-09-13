/*
 * An XML document type.
 * Localname: GetOrderList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOrderListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOrderList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOrderListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOrderListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETORDERLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderList");
    
    
    /**
     * Gets the "GetOrderList" element
     */
    public com.cdiscount.www.GetOrderListDocument.GetOrderList getGetOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderListDocument.GetOrderList target = null;
            target = (com.cdiscount.www.GetOrderListDocument.GetOrderList)get_store().find_element_user(GETORDERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOrderList" element
     */
    public void setGetOrderList(com.cdiscount.www.GetOrderListDocument.GetOrderList getOrderList)
    {
        generatedSetterHelperImpl(getOrderList, GETORDERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOrderList" element
     */
    public com.cdiscount.www.GetOrderListDocument.GetOrderList addNewGetOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderListDocument.GetOrderList target = null;
            target = (com.cdiscount.www.GetOrderListDocument.GetOrderList)get_store().add_element_user(GETORDERLIST$0);
            return target;
        }
    }
    /**
     * An XML GetOrderList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOrderListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderListDocument.GetOrderList
    {
        private static final long serialVersionUID = 1L;
        
        public GetOrderListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName ORDERFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "orderFilter");
        
        
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
         * Gets the "orderFilter" element
         */
        public com.cdiscount.www.OrderFilter getOrderFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderFilter target = null;
                target = (com.cdiscount.www.OrderFilter)get_store().find_element_user(ORDERFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "orderFilter" element
         */
        public boolean isNilOrderFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderFilter target = null;
                target = (com.cdiscount.www.OrderFilter)get_store().find_element_user(ORDERFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "orderFilter" element
         */
        public boolean isSetOrderFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "orderFilter" element
         */
        public void setOrderFilter(com.cdiscount.www.OrderFilter orderFilter)
        {
            generatedSetterHelperImpl(orderFilter, ORDERFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "orderFilter" element
         */
        public com.cdiscount.www.OrderFilter addNewOrderFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderFilter target = null;
                target = (com.cdiscount.www.OrderFilter)get_store().add_element_user(ORDERFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "orderFilter" element
         */
        public void setNilOrderFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderFilter target = null;
                target = (com.cdiscount.www.OrderFilter)get_store().find_element_user(ORDERFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OrderFilter)get_store().add_element_user(ORDERFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "orderFilter" element
         */
        public void unsetOrderFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERFILTER$2, 0);
            }
        }
    }
}
