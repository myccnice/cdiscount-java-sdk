/*
 * An XML document type.
 * Localname: GetSellerInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetSellerInformationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetSellerInformation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetSellerInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetSellerInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSellerInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELLERINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetSellerInformation");
    
    
    /**
     * Gets the "GetSellerInformation" element
     */
    public com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation getGetSellerInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation target = null;
            target = (com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation)get_store().find_element_user(GETSELLERINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSellerInformation" element
     */
    public void setGetSellerInformation(com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation getSellerInformation)
    {
        generatedSetterHelperImpl(getSellerInformation, GETSELLERINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetSellerInformation" element
     */
    public com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation addNewGetSellerInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation target = null;
            target = (com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation)get_store().add_element_user(GETSELLERINFORMATION$0);
            return target;
        }
    }
    /**
     * An XML GetSellerInformation(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetSellerInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetSellerInformationDocument.GetSellerInformation
    {
        private static final long serialVersionUID = 1L;
        
        public GetSellerInformationImpl(org.apache.xmlbeans.SchemaType sType)
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
