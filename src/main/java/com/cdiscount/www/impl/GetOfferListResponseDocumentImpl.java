/*
 * An XML document type.
 * Localname: GetOfferListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOfferListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOfferListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOfferListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOfferListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferListResponse");
    
    
    /**
     * Gets the "GetOfferListResponse" element
     */
    public com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse getGetOfferListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse target = null;
            target = (com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse)get_store().find_element_user(GETOFFERLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferListResponse" element
     */
    public void setGetOfferListResponse(com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse getOfferListResponse)
    {
        generatedSetterHelperImpl(getOfferListResponse, GETOFFERLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOfferListResponse" element
     */
    public com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse addNewGetOfferListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse target = null;
            target = (com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse)get_store().add_element_user(GETOFFERLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOfferListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOfferListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferListResponseDocument.GetOfferListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOfferListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETOFFERLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferListResult");
        
        
        /**
         * Gets the "GetOfferListResult" element
         */
        public com.cdiscount.www.OfferListMessage getGetOfferListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListMessage target = null;
                target = (com.cdiscount.www.OfferListMessage)get_store().find_element_user(GETOFFERLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetOfferListResult" element
         */
        public boolean isNilGetOfferListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListMessage target = null;
                target = (com.cdiscount.www.OfferListMessage)get_store().find_element_user(GETOFFERLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetOfferListResult" element
         */
        public boolean isSetGetOfferListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETOFFERLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetOfferListResult" element
         */
        public void setGetOfferListResult(com.cdiscount.www.OfferListMessage getOfferListResult)
        {
            generatedSetterHelperImpl(getOfferListResult, GETOFFERLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetOfferListResult" element
         */
        public com.cdiscount.www.OfferListMessage addNewGetOfferListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListMessage target = null;
                target = (com.cdiscount.www.OfferListMessage)get_store().add_element_user(GETOFFERLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetOfferListResult" element
         */
        public void setNilGetOfferListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListMessage target = null;
                target = (com.cdiscount.www.OfferListMessage)get_store().find_element_user(GETOFFERLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferListMessage)get_store().add_element_user(GETOFFERLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetOfferListResult" element
         */
        public void unsetGetOfferListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETOFFERLISTRESULT$0, 0);
            }
        }
    }
}
