/*
 * An XML document type.
 * Localname: GetOfferListPaginated
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOfferListPaginatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOfferListPaginated(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOfferListPaginatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferListPaginatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOfferListPaginatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERLISTPAGINATED$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferListPaginated");
    
    
    /**
     * Gets the "GetOfferListPaginated" element
     */
    public com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated getGetOfferListPaginated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated target = null;
            target = (com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated)get_store().find_element_user(GETOFFERLISTPAGINATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferListPaginated" element
     */
    public void setGetOfferListPaginated(com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated getOfferListPaginated)
    {
        generatedSetterHelperImpl(getOfferListPaginated, GETOFFERLISTPAGINATED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOfferListPaginated" element
     */
    public com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated addNewGetOfferListPaginated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated target = null;
            target = (com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated)get_store().add_element_user(GETOFFERLISTPAGINATED$0);
            return target;
        }
    }
    /**
     * An XML GetOfferListPaginated(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOfferListPaginatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferListPaginatedDocument.GetOfferListPaginated
    {
        private static final long serialVersionUID = 1L;
        
        public GetOfferListPaginatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName OFFERFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "offerFilter");
        
        
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
         * Gets the "offerFilter" element
         */
        public com.cdiscount.www.OfferFilterPaginated getOfferFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferFilterPaginated target = null;
                target = (com.cdiscount.www.OfferFilterPaginated)get_store().find_element_user(OFFERFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "offerFilter" element
         */
        public boolean isNilOfferFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferFilterPaginated target = null;
                target = (com.cdiscount.www.OfferFilterPaginated)get_store().find_element_user(OFFERFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "offerFilter" element
         */
        public boolean isSetOfferFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "offerFilter" element
         */
        public void setOfferFilter(com.cdiscount.www.OfferFilterPaginated offerFilter)
        {
            generatedSetterHelperImpl(offerFilter, OFFERFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "offerFilter" element
         */
        public com.cdiscount.www.OfferFilterPaginated addNewOfferFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferFilterPaginated target = null;
                target = (com.cdiscount.www.OfferFilterPaginated)get_store().add_element_user(OFFERFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "offerFilter" element
         */
        public void setNilOfferFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferFilterPaginated target = null;
                target = (com.cdiscount.www.OfferFilterPaginated)get_store().find_element_user(OFFERFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferFilterPaginated)get_store().add_element_user(OFFERFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "offerFilter" element
         */
        public void unsetOfferFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERFILTER$2, 0);
            }
        }
    }
}
