/*
 * An XML document type.
 * Localname: GetOfferQuestionList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOfferQuestionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOfferQuestionList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOfferQuestionListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferQuestionListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOfferQuestionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERQUESTIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferQuestionList");
    
    
    /**
     * Gets the "GetOfferQuestionList" element
     */
    public com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList getGetOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList target = null;
            target = (com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList)get_store().find_element_user(GETOFFERQUESTIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferQuestionList" element
     */
    public void setGetOfferQuestionList(com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList getOfferQuestionList)
    {
        generatedSetterHelperImpl(getOfferQuestionList, GETOFFERQUESTIONLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOfferQuestionList" element
     */
    public com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList addNewGetOfferQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList target = null;
            target = (com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList)get_store().add_element_user(GETOFFERQUESTIONLIST$0);
            return target;
        }
    }
    /**
     * An XML GetOfferQuestionList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOfferQuestionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferQuestionListDocument.GetOfferQuestionList
    {
        private static final long serialVersionUID = 1L;
        
        public GetOfferQuestionListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName OFFERQUESTIONFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "offerQuestionFilter");
        
        
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
         * Gets the "offerQuestionFilter" element
         */
        public com.cdiscount.www.OfferQuestionFilter getOfferQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionFilter target = null;
                target = (com.cdiscount.www.OfferQuestionFilter)get_store().find_element_user(OFFERQUESTIONFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "offerQuestionFilter" element
         */
        public boolean isNilOfferQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionFilter target = null;
                target = (com.cdiscount.www.OfferQuestionFilter)get_store().find_element_user(OFFERQUESTIONFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "offerQuestionFilter" element
         */
        public boolean isSetOfferQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERQUESTIONFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "offerQuestionFilter" element
         */
        public void setOfferQuestionFilter(com.cdiscount.www.OfferQuestionFilter offerQuestionFilter)
        {
            generatedSetterHelperImpl(offerQuestionFilter, OFFERQUESTIONFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "offerQuestionFilter" element
         */
        public com.cdiscount.www.OfferQuestionFilter addNewOfferQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionFilter target = null;
                target = (com.cdiscount.www.OfferQuestionFilter)get_store().add_element_user(OFFERQUESTIONFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "offerQuestionFilter" element
         */
        public void setNilOfferQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferQuestionFilter target = null;
                target = (com.cdiscount.www.OfferQuestionFilter)get_store().find_element_user(OFFERQUESTIONFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferQuestionFilter)get_store().add_element_user(OFFERQUESTIONFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "offerQuestionFilter" element
         */
        public void unsetOfferQuestionFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERQUESTIONFILTER$2, 0);
            }
        }
    }
}
