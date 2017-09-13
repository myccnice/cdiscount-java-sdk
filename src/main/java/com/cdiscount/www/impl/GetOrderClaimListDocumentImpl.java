/*
 * An XML document type.
 * Localname: GetOrderClaimList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOrderClaimListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOrderClaimList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOrderClaimListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderClaimListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOrderClaimListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETORDERCLAIMLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOrderClaimList");
    
    
    /**
     * Gets the "GetOrderClaimList" element
     */
    public com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList getGetOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList target = null;
            target = (com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList)get_store().find_element_user(GETORDERCLAIMLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOrderClaimList" element
     */
    public void setGetOrderClaimList(com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList getOrderClaimList)
    {
        generatedSetterHelperImpl(getOrderClaimList, GETORDERCLAIMLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOrderClaimList" element
     */
    public com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList addNewGetOrderClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList target = null;
            target = (com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList)get_store().add_element_user(GETORDERCLAIMLIST$0);
            return target;
        }
    }
    /**
     * An XML GetOrderClaimList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOrderClaimListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOrderClaimListDocument.GetOrderClaimList
    {
        private static final long serialVersionUID = 1L;
        
        public GetOrderClaimListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName ORDERCLAIMFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "orderClaimFilter");
        
        
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
         * Gets the "orderClaimFilter" element
         */
        public com.cdiscount.www.OrderClaimFilter getOrderClaimFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimFilter target = null;
                target = (com.cdiscount.www.OrderClaimFilter)get_store().find_element_user(ORDERCLAIMFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "orderClaimFilter" element
         */
        public boolean isNilOrderClaimFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimFilter target = null;
                target = (com.cdiscount.www.OrderClaimFilter)get_store().find_element_user(ORDERCLAIMFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "orderClaimFilter" element
         */
        public boolean isSetOrderClaimFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERCLAIMFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "orderClaimFilter" element
         */
        public void setOrderClaimFilter(com.cdiscount.www.OrderClaimFilter orderClaimFilter)
        {
            generatedSetterHelperImpl(orderClaimFilter, ORDERCLAIMFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "orderClaimFilter" element
         */
        public com.cdiscount.www.OrderClaimFilter addNewOrderClaimFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimFilter target = null;
                target = (com.cdiscount.www.OrderClaimFilter)get_store().add_element_user(ORDERCLAIMFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "orderClaimFilter" element
         */
        public void setNilOrderClaimFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OrderClaimFilter target = null;
                target = (com.cdiscount.www.OrderClaimFilter)get_store().find_element_user(ORDERCLAIMFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OrderClaimFilter)get_store().add_element_user(ORDERCLAIMFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "orderClaimFilter" element
         */
        public void unsetOrderClaimFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERCLAIMFILTER$2, 0);
            }
        }
    }
}
