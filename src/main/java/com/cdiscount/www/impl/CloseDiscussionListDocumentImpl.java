/*
 * An XML document type.
 * Localname: CloseDiscussionList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CloseDiscussionList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CloseDiscussionListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionList");
    
    
    /**
     * Gets the "CloseDiscussionList" element
     */
    public com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList getCloseDiscussionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList target = null;
            target = (com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList)get_store().find_element_user(CLOSEDISCUSSIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseDiscussionList" element
     */
    public void setCloseDiscussionList(com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList closeDiscussionList)
    {
        generatedSetterHelperImpl(closeDiscussionList, CLOSEDISCUSSIONLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CloseDiscussionList" element
     */
    public com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList addNewCloseDiscussionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList target = null;
            target = (com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList)get_store().add_element_user(CLOSEDISCUSSIONLIST$0);
            return target;
        }
    }
    /**
     * An XML CloseDiscussionList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class CloseDiscussionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionListDocument.CloseDiscussionList
    {
        private static final long serialVersionUID = 1L;
        
        public CloseDiscussionListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName CLOSEDISCUSSIONREQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "closeDiscussionRequest");
        
        
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
         * Gets the "closeDiscussionRequest" element
         */
        public com.cdiscount.www.CloseDiscussionRequest getCloseDiscussionRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionRequest target = null;
                target = (com.cdiscount.www.CloseDiscussionRequest)get_store().find_element_user(CLOSEDISCUSSIONREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "closeDiscussionRequest" element
         */
        public boolean isNilCloseDiscussionRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionRequest target = null;
                target = (com.cdiscount.www.CloseDiscussionRequest)get_store().find_element_user(CLOSEDISCUSSIONREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "closeDiscussionRequest" element
         */
        public boolean isSetCloseDiscussionRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLOSEDISCUSSIONREQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "closeDiscussionRequest" element
         */
        public void setCloseDiscussionRequest(com.cdiscount.www.CloseDiscussionRequest closeDiscussionRequest)
        {
            generatedSetterHelperImpl(closeDiscussionRequest, CLOSEDISCUSSIONREQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "closeDiscussionRequest" element
         */
        public com.cdiscount.www.CloseDiscussionRequest addNewCloseDiscussionRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionRequest target = null;
                target = (com.cdiscount.www.CloseDiscussionRequest)get_store().add_element_user(CLOSEDISCUSSIONREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "closeDiscussionRequest" element
         */
        public void setNilCloseDiscussionRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CloseDiscussionRequest target = null;
                target = (com.cdiscount.www.CloseDiscussionRequest)get_store().find_element_user(CLOSEDISCUSSIONREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.CloseDiscussionRequest)get_store().add_element_user(CLOSEDISCUSSIONREQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "closeDiscussionRequest" element
         */
        public void unsetCloseDiscussionRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLOSEDISCUSSIONREQUEST$2, 0);
            }
        }
    }
}
