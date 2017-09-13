/*
 * An XML document type.
 * Localname: GetParcelShopListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetParcelShopListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetParcelShopListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetParcelShopListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetParcelShopListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetParcelShopListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPARCELSHOPLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetParcelShopListResponse");
    
    
    /**
     * Gets the "GetParcelShopListResponse" element
     */
    public com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse getGetParcelShopListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse target = null;
            target = (com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse)get_store().find_element_user(GETPARCELSHOPLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetParcelShopListResponse" element
     */
    public void setGetParcelShopListResponse(com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse getParcelShopListResponse)
    {
        generatedSetterHelperImpl(getParcelShopListResponse, GETPARCELSHOPLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetParcelShopListResponse" element
     */
    public com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse addNewGetParcelShopListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse target = null;
            target = (com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse)get_store().add_element_user(GETPARCELSHOPLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetParcelShopListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetParcelShopListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetParcelShopListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPARCELSHOPLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetParcelShopListResult");
        
        
        /**
         * Gets the "GetParcelShopListResult" element
         */
        public com.cdiscount.www.ParcelShopListMessage getGetParcelShopListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ParcelShopListMessage target = null;
                target = (com.cdiscount.www.ParcelShopListMessage)get_store().find_element_user(GETPARCELSHOPLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetParcelShopListResult" element
         */
        public boolean isNilGetParcelShopListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ParcelShopListMessage target = null;
                target = (com.cdiscount.www.ParcelShopListMessage)get_store().find_element_user(GETPARCELSHOPLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetParcelShopListResult" element
         */
        public boolean isSetGetParcelShopListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPARCELSHOPLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetParcelShopListResult" element
         */
        public void setGetParcelShopListResult(com.cdiscount.www.ParcelShopListMessage getParcelShopListResult)
        {
            generatedSetterHelperImpl(getParcelShopListResult, GETPARCELSHOPLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetParcelShopListResult" element
         */
        public com.cdiscount.www.ParcelShopListMessage addNewGetParcelShopListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ParcelShopListMessage target = null;
                target = (com.cdiscount.www.ParcelShopListMessage)get_store().add_element_user(GETPARCELSHOPLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetParcelShopListResult" element
         */
        public void setNilGetParcelShopListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ParcelShopListMessage target = null;
                target = (com.cdiscount.www.ParcelShopListMessage)get_store().find_element_user(GETPARCELSHOPLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ParcelShopListMessage)get_store().add_element_user(GETPARCELSHOPLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetParcelShopListResult" element
         */
        public void unsetGetParcelShopListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPARCELSHOPLISTRESULT$0, 0);
            }
        }
    }
}
