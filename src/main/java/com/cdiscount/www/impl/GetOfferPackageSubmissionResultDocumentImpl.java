/*
 * An XML document type.
 * Localname: GetOfferPackageSubmissionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOfferPackageSubmissionResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOfferPackageSubmissionResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOfferPackageSubmissionResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferPackageSubmissionResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOfferPackageSubmissionResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERPACKAGESUBMISSIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferPackageSubmissionResult");
    
    
    /**
     * Gets the "GetOfferPackageSubmissionResult" element
     */
    public com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult getGetOfferPackageSubmissionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult target = null;
            target = (com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult)get_store().find_element_user(GETOFFERPACKAGESUBMISSIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferPackageSubmissionResult" element
     */
    public void setGetOfferPackageSubmissionResult(com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult getOfferPackageSubmissionResult)
    {
        generatedSetterHelperImpl(getOfferPackageSubmissionResult, GETOFFERPACKAGESUBMISSIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOfferPackageSubmissionResult" element
     */
    public com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult addNewGetOfferPackageSubmissionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult target = null;
            target = (com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult)get_store().add_element_user(GETOFFERPACKAGESUBMISSIONRESULT$0);
            return target;
        }
    }
    /**
     * An XML GetOfferPackageSubmissionResult(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOfferPackageSubmissionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferPackageSubmissionResultDocument.GetOfferPackageSubmissionResult
    {
        private static final long serialVersionUID = 1L;
        
        public GetOfferPackageSubmissionResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName OFFERPACKAGEFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "offerPackageFilter");
        
        
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
         * Gets the "offerPackageFilter" element
         */
        public com.cdiscount.www.PackageFilter getOfferPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(OFFERPACKAGEFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "offerPackageFilter" element
         */
        public boolean isNilOfferPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(OFFERPACKAGEFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "offerPackageFilter" element
         */
        public boolean isSetOfferPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERPACKAGEFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "offerPackageFilter" element
         */
        public void setOfferPackageFilter(com.cdiscount.www.PackageFilter offerPackageFilter)
        {
            generatedSetterHelperImpl(offerPackageFilter, OFFERPACKAGEFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "offerPackageFilter" element
         */
        public com.cdiscount.www.PackageFilter addNewOfferPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().add_element_user(OFFERPACKAGEFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "offerPackageFilter" element
         */
        public void setNilOfferPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(OFFERPACKAGEFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.PackageFilter)get_store().add_element_user(OFFERPACKAGEFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "offerPackageFilter" element
         */
        public void unsetOfferPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERPACKAGEFILTER$2, 0);
            }
        }
    }
}
