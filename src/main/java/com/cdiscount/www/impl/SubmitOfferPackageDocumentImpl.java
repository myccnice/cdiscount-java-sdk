/*
 * An XML document type.
 * Localname: SubmitOfferPackage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitOfferPackageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitOfferPackage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitOfferPackageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferPackageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitOfferPackageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITOFFERPACKAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitOfferPackage");
    
    
    /**
     * Gets the "SubmitOfferPackage" element
     */
    public com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage getSubmitOfferPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage target = null;
            target = (com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage)get_store().find_element_user(SUBMITOFFERPACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitOfferPackage" element
     */
    public void setSubmitOfferPackage(com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage submitOfferPackage)
    {
        generatedSetterHelperImpl(submitOfferPackage, SUBMITOFFERPACKAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitOfferPackage" element
     */
    public com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage addNewSubmitOfferPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage target = null;
            target = (com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage)get_store().add_element_user(SUBMITOFFERPACKAGE$0);
            return target;
        }
    }
    /**
     * An XML SubmitOfferPackage(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitOfferPackageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferPackageDocument.SubmitOfferPackage
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitOfferPackageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName OFFERPACKAGEREQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "offerPackageRequest");
        
        
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
         * Gets the "offerPackageRequest" element
         */
        public com.cdiscount.www.OfferPackageRequest getOfferPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferPackageRequest target = null;
                target = (com.cdiscount.www.OfferPackageRequest)get_store().find_element_user(OFFERPACKAGEREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "offerPackageRequest" element
         */
        public boolean isNilOfferPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferPackageRequest target = null;
                target = (com.cdiscount.www.OfferPackageRequest)get_store().find_element_user(OFFERPACKAGEREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "offerPackageRequest" element
         */
        public boolean isSetOfferPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERPACKAGEREQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "offerPackageRequest" element
         */
        public void setOfferPackageRequest(com.cdiscount.www.OfferPackageRequest offerPackageRequest)
        {
            generatedSetterHelperImpl(offerPackageRequest, OFFERPACKAGEREQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "offerPackageRequest" element
         */
        public com.cdiscount.www.OfferPackageRequest addNewOfferPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferPackageRequest target = null;
                target = (com.cdiscount.www.OfferPackageRequest)get_store().add_element_user(OFFERPACKAGEREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "offerPackageRequest" element
         */
        public void setNilOfferPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferPackageRequest target = null;
                target = (com.cdiscount.www.OfferPackageRequest)get_store().find_element_user(OFFERPACKAGEREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferPackageRequest)get_store().add_element_user(OFFERPACKAGEREQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "offerPackageRequest" element
         */
        public void unsetOfferPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERPACKAGEREQUEST$2, 0);
            }
        }
    }
}
