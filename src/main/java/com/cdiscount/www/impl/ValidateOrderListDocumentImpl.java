/*
 * An XML document type.
 * Localname: ValidateOrderList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ValidateOrderList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ValidateOrderListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATEORDERLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValidateOrderList");
    
    
    /**
     * Gets the "ValidateOrderList" element
     */
    public com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList getValidateOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList target = null;
            target = (com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList)get_store().find_element_user(VALIDATEORDERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidateOrderList" element
     */
    public void setValidateOrderList(com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList validateOrderList)
    {
        generatedSetterHelperImpl(validateOrderList, VALIDATEORDERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidateOrderList" element
     */
    public com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList addNewValidateOrderList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList target = null;
            target = (com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList)get_store().add_element_user(VALIDATEORDERLIST$0);
            return target;
        }
    }
    /**
     * An XML ValidateOrderList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class ValidateOrderListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderListDocument.ValidateOrderList
    {
        private static final long serialVersionUID = 1L;
        
        public ValidateOrderListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName VALIDATEORDERLISTMESSAGE$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "validateOrderListMessage");
        
        
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
         * Gets the "validateOrderListMessage" element
         */
        public com.cdiscount.www.ValidateOrderListMessage getValidateOrderListMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidateOrderListMessage target = null;
                target = (com.cdiscount.www.ValidateOrderListMessage)get_store().find_element_user(VALIDATEORDERLISTMESSAGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "validateOrderListMessage" element
         */
        public boolean isNilValidateOrderListMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidateOrderListMessage target = null;
                target = (com.cdiscount.www.ValidateOrderListMessage)get_store().find_element_user(VALIDATEORDERLISTMESSAGE$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "validateOrderListMessage" element
         */
        public boolean isSetValidateOrderListMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATEORDERLISTMESSAGE$2) != 0;
            }
        }
        
        /**
         * Sets the "validateOrderListMessage" element
         */
        public void setValidateOrderListMessage(com.cdiscount.www.ValidateOrderListMessage validateOrderListMessage)
        {
            generatedSetterHelperImpl(validateOrderListMessage, VALIDATEORDERLISTMESSAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "validateOrderListMessage" element
         */
        public com.cdiscount.www.ValidateOrderListMessage addNewValidateOrderListMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidateOrderListMessage target = null;
                target = (com.cdiscount.www.ValidateOrderListMessage)get_store().add_element_user(VALIDATEORDERLISTMESSAGE$2);
                return target;
            }
        }
        
        /**
         * Nils the "validateOrderListMessage" element
         */
        public void setNilValidateOrderListMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ValidateOrderListMessage target = null;
                target = (com.cdiscount.www.ValidateOrderListMessage)get_store().find_element_user(VALIDATEORDERLISTMESSAGE$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ValidateOrderListMessage)get_store().add_element_user(VALIDATEORDERLISTMESSAGE$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "validateOrderListMessage" element
         */
        public void unsetValidateOrderListMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATEORDERLISTMESSAGE$2, 0);
            }
        }
    }
}
