/*
 * An XML document type.
 * Localname: GetProductListByIdentifier
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductListByIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductListByIdentifier(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductListByIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListByIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductListByIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTLISTBYIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductListByIdentifier");
    
    
    /**
     * Gets the "GetProductListByIdentifier" element
     */
    public com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier getGetProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier target = null;
            target = (com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier)get_store().find_element_user(GETPRODUCTLISTBYIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductListByIdentifier" element
     */
    public void setGetProductListByIdentifier(com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier getProductListByIdentifier)
    {
        generatedSetterHelperImpl(getProductListByIdentifier, GETPRODUCTLISTBYIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductListByIdentifier" element
     */
    public com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier addNewGetProductListByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier target = null;
            target = (com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier)get_store().add_element_user(GETPRODUCTLISTBYIDENTIFIER$0);
            return target;
        }
    }
    /**
     * An XML GetProductListByIdentifier(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductListByIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListByIdentifierDocument.GetProductListByIdentifier
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductListByIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName IDENTIFIERREQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "identifierRequest");
        
        
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
         * Gets the "identifierRequest" element
         */
        public com.cdiscount.www.IdentifierRequest getIdentifierRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.IdentifierRequest target = null;
                target = (com.cdiscount.www.IdentifierRequest)get_store().find_element_user(IDENTIFIERREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "identifierRequest" element
         */
        public boolean isNilIdentifierRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.IdentifierRequest target = null;
                target = (com.cdiscount.www.IdentifierRequest)get_store().find_element_user(IDENTIFIERREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "identifierRequest" element
         */
        public boolean isSetIdentifierRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIERREQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "identifierRequest" element
         */
        public void setIdentifierRequest(com.cdiscount.www.IdentifierRequest identifierRequest)
        {
            generatedSetterHelperImpl(identifierRequest, IDENTIFIERREQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "identifierRequest" element
         */
        public com.cdiscount.www.IdentifierRequest addNewIdentifierRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.IdentifierRequest target = null;
                target = (com.cdiscount.www.IdentifierRequest)get_store().add_element_user(IDENTIFIERREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "identifierRequest" element
         */
        public void setNilIdentifierRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.IdentifierRequest target = null;
                target = (com.cdiscount.www.IdentifierRequest)get_store().find_element_user(IDENTIFIERREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.IdentifierRequest)get_store().add_element_user(IDENTIFIERREQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "identifierRequest" element
         */
        public void unsetIdentifierRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIERREQUEST$2, 0);
            }
        }
    }
}
