/*
 * An XML document type.
 * Localname: GetSellerInformationResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetSellerInformationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetSellerInformationResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetSellerInformationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetSellerInformationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSellerInformationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELLERINFORMATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetSellerInformationResponse");
    
    
    /**
     * Gets the "GetSellerInformationResponse" element
     */
    public com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse getGetSellerInformationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse target = null;
            target = (com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse)get_store().find_element_user(GETSELLERINFORMATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSellerInformationResponse" element
     */
    public void setGetSellerInformationResponse(com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse getSellerInformationResponse)
    {
        generatedSetterHelperImpl(getSellerInformationResponse, GETSELLERINFORMATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetSellerInformationResponse" element
     */
    public com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse addNewGetSellerInformationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse target = null;
            target = (com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse)get_store().add_element_user(GETSELLERINFORMATIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetSellerInformationResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetSellerInformationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetSellerInformationResponseDocument.GetSellerInformationResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetSellerInformationResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETSELLERINFORMATIONRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetSellerInformationResult");
        
        
        /**
         * Gets the "GetSellerInformationResult" element
         */
        public com.cdiscount.www.SellerMessage getGetSellerInformationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerMessage target = null;
                target = (com.cdiscount.www.SellerMessage)get_store().find_element_user(GETSELLERINFORMATIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetSellerInformationResult" element
         */
        public boolean isNilGetSellerInformationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerMessage target = null;
                target = (com.cdiscount.www.SellerMessage)get_store().find_element_user(GETSELLERINFORMATIONRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetSellerInformationResult" element
         */
        public boolean isSetGetSellerInformationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETSELLERINFORMATIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetSellerInformationResult" element
         */
        public void setGetSellerInformationResult(com.cdiscount.www.SellerMessage getSellerInformationResult)
        {
            generatedSetterHelperImpl(getSellerInformationResult, GETSELLERINFORMATIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetSellerInformationResult" element
         */
        public com.cdiscount.www.SellerMessage addNewGetSellerInformationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerMessage target = null;
                target = (com.cdiscount.www.SellerMessage)get_store().add_element_user(GETSELLERINFORMATIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetSellerInformationResult" element
         */
        public void setNilGetSellerInformationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerMessage target = null;
                target = (com.cdiscount.www.SellerMessage)get_store().find_element_user(GETSELLERINFORMATIONRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SellerMessage)get_store().add_element_user(GETSELLERINFORMATIONRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetSellerInformationResult" element
         */
        public void unsetGetSellerInformationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETSELLERINFORMATIONRESULT$0, 0);
            }
        }
    }
}
