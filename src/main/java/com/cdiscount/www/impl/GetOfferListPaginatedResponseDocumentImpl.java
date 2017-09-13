/*
 * An XML document type.
 * Localname: GetOfferListPaginatedResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOfferListPaginatedResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOfferListPaginatedResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOfferListPaginatedResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferListPaginatedResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOfferListPaginatedResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERLISTPAGINATEDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferListPaginatedResponse");
    
    
    /**
     * Gets the "GetOfferListPaginatedResponse" element
     */
    public com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse getGetOfferListPaginatedResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse target = null;
            target = (com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse)get_store().find_element_user(GETOFFERLISTPAGINATEDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferListPaginatedResponse" element
     */
    public void setGetOfferListPaginatedResponse(com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse getOfferListPaginatedResponse)
    {
        generatedSetterHelperImpl(getOfferListPaginatedResponse, GETOFFERLISTPAGINATEDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOfferListPaginatedResponse" element
     */
    public com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse addNewGetOfferListPaginatedResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse target = null;
            target = (com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse)get_store().add_element_user(GETOFFERLISTPAGINATEDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOfferListPaginatedResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOfferListPaginatedResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferListPaginatedResponseDocument.GetOfferListPaginatedResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOfferListPaginatedResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETOFFERLISTPAGINATEDRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferListPaginatedResult");
        
        
        /**
         * Gets the "GetOfferListPaginatedResult" element
         */
        public com.cdiscount.www.OfferListPaginatedMessage getGetOfferListPaginatedResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListPaginatedMessage target = null;
                target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().find_element_user(GETOFFERLISTPAGINATEDRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetOfferListPaginatedResult" element
         */
        public boolean isNilGetOfferListPaginatedResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListPaginatedMessage target = null;
                target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().find_element_user(GETOFFERLISTPAGINATEDRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetOfferListPaginatedResult" element
         */
        public boolean isSetGetOfferListPaginatedResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETOFFERLISTPAGINATEDRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetOfferListPaginatedResult" element
         */
        public void setGetOfferListPaginatedResult(com.cdiscount.www.OfferListPaginatedMessage getOfferListPaginatedResult)
        {
            generatedSetterHelperImpl(getOfferListPaginatedResult, GETOFFERLISTPAGINATEDRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetOfferListPaginatedResult" element
         */
        public com.cdiscount.www.OfferListPaginatedMessage addNewGetOfferListPaginatedResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListPaginatedMessage target = null;
                target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().add_element_user(GETOFFERLISTPAGINATEDRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetOfferListPaginatedResult" element
         */
        public void setNilGetOfferListPaginatedResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferListPaginatedMessage target = null;
                target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().find_element_user(GETOFFERLISTPAGINATEDRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferListPaginatedMessage)get_store().add_element_user(GETOFFERLISTPAGINATEDRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetOfferListPaginatedResult" element
         */
        public void unsetGetOfferListPaginatedResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETOFFERLISTPAGINATEDRESULT$0, 0);
            }
        }
    }
}
