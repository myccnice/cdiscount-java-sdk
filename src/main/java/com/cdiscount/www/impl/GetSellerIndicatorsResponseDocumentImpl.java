/*
 * An XML document type.
 * Localname: GetSellerIndicatorsResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetSellerIndicatorsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetSellerIndicatorsResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetSellerIndicatorsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetSellerIndicatorsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSellerIndicatorsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELLERINDICATORSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetSellerIndicatorsResponse");
    
    
    /**
     * Gets the "GetSellerIndicatorsResponse" element
     */
    public com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse getGetSellerIndicatorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse target = null;
            target = (com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse)get_store().find_element_user(GETSELLERINDICATORSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSellerIndicatorsResponse" element
     */
    public void setGetSellerIndicatorsResponse(com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse getSellerIndicatorsResponse)
    {
        generatedSetterHelperImpl(getSellerIndicatorsResponse, GETSELLERINDICATORSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetSellerIndicatorsResponse" element
     */
    public com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse addNewGetSellerIndicatorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse target = null;
            target = (com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse)get_store().add_element_user(GETSELLERINDICATORSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetSellerIndicatorsResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetSellerIndicatorsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetSellerIndicatorsResponseDocument.GetSellerIndicatorsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetSellerIndicatorsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETSELLERINDICATORSRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetSellerIndicatorsResult");
        
        
        /**
         * Gets the "GetSellerIndicatorsResult" element
         */
        public com.cdiscount.www.SellerIndicatorsMessage getGetSellerIndicatorsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerIndicatorsMessage target = null;
                target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().find_element_user(GETSELLERINDICATORSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetSellerIndicatorsResult" element
         */
        public boolean isNilGetSellerIndicatorsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerIndicatorsMessage target = null;
                target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().find_element_user(GETSELLERINDICATORSRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetSellerIndicatorsResult" element
         */
        public boolean isSetGetSellerIndicatorsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETSELLERINDICATORSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetSellerIndicatorsResult" element
         */
        public void setGetSellerIndicatorsResult(com.cdiscount.www.SellerIndicatorsMessage getSellerIndicatorsResult)
        {
            generatedSetterHelperImpl(getSellerIndicatorsResult, GETSELLERINDICATORSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetSellerIndicatorsResult" element
         */
        public com.cdiscount.www.SellerIndicatorsMessage addNewGetSellerIndicatorsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerIndicatorsMessage target = null;
                target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().add_element_user(GETSELLERINDICATORSRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetSellerIndicatorsResult" element
         */
        public void setNilGetSellerIndicatorsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SellerIndicatorsMessage target = null;
                target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().find_element_user(GETSELLERINDICATORSRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SellerIndicatorsMessage)get_store().add_element_user(GETSELLERINDICATORSRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetSellerIndicatorsResult" element
         */
        public void unsetGetSellerIndicatorsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETSELLERINDICATORSRESULT$0, 0);
            }
        }
    }
}
