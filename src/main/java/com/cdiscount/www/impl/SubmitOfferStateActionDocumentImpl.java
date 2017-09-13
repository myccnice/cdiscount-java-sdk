/*
 * An XML document type.
 * Localname: SubmitOfferStateAction
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitOfferStateActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitOfferStateAction(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitOfferStateActionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferStateActionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitOfferStateActionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITOFFERSTATEACTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitOfferStateAction");
    
    
    /**
     * Gets the "SubmitOfferStateAction" element
     */
    public com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction getSubmitOfferStateAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction target = null;
            target = (com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction)get_store().find_element_user(SUBMITOFFERSTATEACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitOfferStateAction" element
     */
    public void setSubmitOfferStateAction(com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction submitOfferStateAction)
    {
        generatedSetterHelperImpl(submitOfferStateAction, SUBMITOFFERSTATEACTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitOfferStateAction" element
     */
    public com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction addNewSubmitOfferStateAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction target = null;
            target = (com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction)get_store().add_element_user(SUBMITOFFERSTATEACTION$0);
            return target;
        }
    }
    /**
     * An XML SubmitOfferStateAction(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitOfferStateActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitOfferStateActionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName OFFERSTATEREQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "offerStateRequest");
        
        
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
         * Gets the "offerStateRequest" element
         */
        public com.cdiscount.www.OfferStateActionRequest getOfferStateRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateActionRequest target = null;
                target = (com.cdiscount.www.OfferStateActionRequest)get_store().find_element_user(OFFERSTATEREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "offerStateRequest" element
         */
        public boolean isNilOfferStateRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateActionRequest target = null;
                target = (com.cdiscount.www.OfferStateActionRequest)get_store().find_element_user(OFFERSTATEREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "offerStateRequest" element
         */
        public boolean isSetOfferStateRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERSTATEREQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "offerStateRequest" element
         */
        public void setOfferStateRequest(com.cdiscount.www.OfferStateActionRequest offerStateRequest)
        {
            generatedSetterHelperImpl(offerStateRequest, OFFERSTATEREQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "offerStateRequest" element
         */
        public com.cdiscount.www.OfferStateActionRequest addNewOfferStateRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateActionRequest target = null;
                target = (com.cdiscount.www.OfferStateActionRequest)get_store().add_element_user(OFFERSTATEREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "offerStateRequest" element
         */
        public void setNilOfferStateRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateActionRequest target = null;
                target = (com.cdiscount.www.OfferStateActionRequest)get_store().find_element_user(OFFERSTATEREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferStateActionRequest)get_store().add_element_user(OFFERSTATEREQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "offerStateRequest" element
         */
        public void unsetOfferStateRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERSTATEREQUEST$2, 0);
            }
        }
    }
}
