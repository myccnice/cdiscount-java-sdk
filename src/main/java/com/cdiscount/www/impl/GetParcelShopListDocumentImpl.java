/*
 * An XML document type.
 * Localname: GetParcelShopList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetParcelShopListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetParcelShopList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetParcelShopListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetParcelShopListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetParcelShopListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPARCELSHOPLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetParcelShopList");
    
    
    /**
     * Gets the "GetParcelShopList" element
     */
    public com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList getGetParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList target = null;
            target = (com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList)get_store().find_element_user(GETPARCELSHOPLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetParcelShopList" element
     */
    public void setGetParcelShopList(com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList getParcelShopList)
    {
        generatedSetterHelperImpl(getParcelShopList, GETPARCELSHOPLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetParcelShopList" element
     */
    public com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList addNewGetParcelShopList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList target = null;
            target = (com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList)get_store().add_element_user(GETPARCELSHOPLIST$0);
            return target;
        }
    }
    /**
     * An XML GetParcelShopList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetParcelShopListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetParcelShopListDocument.GetParcelShopList
    {
        private static final long serialVersionUID = 1L;
        
        public GetParcelShopListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        
        
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
    }
}
