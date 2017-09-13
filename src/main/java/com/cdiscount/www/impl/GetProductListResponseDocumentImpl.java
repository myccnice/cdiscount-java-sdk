/*
 * An XML document type.
 * Localname: GetProductListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductListResponse");
    
    
    /**
     * Gets the "GetProductListResponse" element
     */
    public com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse getGetProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse target = null;
            target = (com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse)get_store().find_element_user(GETPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductListResponse" element
     */
    public void setGetProductListResponse(com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse getProductListResponse)
    {
        generatedSetterHelperImpl(getProductListResponse, GETPRODUCTLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductListResponse" element
     */
    public com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse addNewGetProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse target = null;
            target = (com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse)get_store().add_element_user(GETPRODUCTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListResponseDocument.GetProductListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPRODUCTLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductListResult");
        
        
        /**
         * Gets the "GetProductListResult" element
         */
        public com.cdiscount.www.ProductListMessage getGetProductListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductListMessage target = null;
                target = (com.cdiscount.www.ProductListMessage)get_store().find_element_user(GETPRODUCTLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetProductListResult" element
         */
        public boolean isNilGetProductListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductListMessage target = null;
                target = (com.cdiscount.www.ProductListMessage)get_store().find_element_user(GETPRODUCTLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetProductListResult" element
         */
        public boolean isSetGetProductListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPRODUCTLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetProductListResult" element
         */
        public void setGetProductListResult(com.cdiscount.www.ProductListMessage getProductListResult)
        {
            generatedSetterHelperImpl(getProductListResult, GETPRODUCTLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetProductListResult" element
         */
        public com.cdiscount.www.ProductListMessage addNewGetProductListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductListMessage target = null;
                target = (com.cdiscount.www.ProductListMessage)get_store().add_element_user(GETPRODUCTLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetProductListResult" element
         */
        public void setNilGetProductListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductListMessage target = null;
                target = (com.cdiscount.www.ProductListMessage)get_store().find_element_user(GETPRODUCTLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductListMessage)get_store().add_element_user(GETPRODUCTLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetProductListResult" element
         */
        public void unsetGetProductListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPRODUCTLISTRESULT$0, 0);
            }
        }
    }
}
