/*
 * An XML document type.
 * Localname: ManageParcel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ManageParcelDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ManageParcel(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ManageParcelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ManageParcelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManageParcelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEPARCEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ManageParcel");
    
    
    /**
     * Gets the "ManageParcel" element
     */
    public com.cdiscount.www.ManageParcelDocument.ManageParcel getManageParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelDocument.ManageParcel target = null;
            target = (com.cdiscount.www.ManageParcelDocument.ManageParcel)get_store().find_element_user(MANAGEPARCEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ManageParcel" element
     */
    public void setManageParcel(com.cdiscount.www.ManageParcelDocument.ManageParcel manageParcel)
    {
        generatedSetterHelperImpl(manageParcel, MANAGEPARCEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManageParcel" element
     */
    public com.cdiscount.www.ManageParcelDocument.ManageParcel addNewManageParcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelDocument.ManageParcel target = null;
            target = (com.cdiscount.www.ManageParcelDocument.ManageParcel)get_store().add_element_user(MANAGEPARCEL$0);
            return target;
        }
    }
    /**
     * An XML ManageParcel(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class ManageParcelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ManageParcelDocument.ManageParcel
    {
        private static final long serialVersionUID = 1L;
        
        public ManageParcelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName MANAGEPARCELREQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "manageParcelRequest");
        
        
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
         * Gets the "manageParcelRequest" element
         */
        public com.cdiscount.www.ManageParcelRequest getManageParcelRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelRequest target = null;
                target = (com.cdiscount.www.ManageParcelRequest)get_store().find_element_user(MANAGEPARCELREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "manageParcelRequest" element
         */
        public boolean isNilManageParcelRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelRequest target = null;
                target = (com.cdiscount.www.ManageParcelRequest)get_store().find_element_user(MANAGEPARCELREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "manageParcelRequest" element
         */
        public boolean isSetManageParcelRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MANAGEPARCELREQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "manageParcelRequest" element
         */
        public void setManageParcelRequest(com.cdiscount.www.ManageParcelRequest manageParcelRequest)
        {
            generatedSetterHelperImpl(manageParcelRequest, MANAGEPARCELREQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "manageParcelRequest" element
         */
        public com.cdiscount.www.ManageParcelRequest addNewManageParcelRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelRequest target = null;
                target = (com.cdiscount.www.ManageParcelRequest)get_store().add_element_user(MANAGEPARCELREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "manageParcelRequest" element
         */
        public void setNilManageParcelRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelRequest target = null;
                target = (com.cdiscount.www.ManageParcelRequest)get_store().find_element_user(MANAGEPARCELREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ManageParcelRequest)get_store().add_element_user(MANAGEPARCELREQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "manageParcelRequest" element
         */
        public void unsetManageParcelRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MANAGEPARCELREQUEST$2, 0);
            }
        }
    }
}
