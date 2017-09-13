/*
 * An XML document type.
 * Localname: GetProductPackageProductMatchingFileDataResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductPackageProductMatchingFileDataResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductPackageProductMatchingFileDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductPackageProductMatchingFileDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductPackageProductMatchingFileDataResponse");
    
    
    /**
     * Gets the "GetProductPackageProductMatchingFileDataResponse" element
     */
    public com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse getGetProductPackageProductMatchingFileDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse target = null;
            target = (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse)get_store().find_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductPackageProductMatchingFileDataResponse" element
     */
    public void setGetProductPackageProductMatchingFileDataResponse(com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse getProductPackageProductMatchingFileDataResponse)
    {
        generatedSetterHelperImpl(getProductPackageProductMatchingFileDataResponse, GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductPackageProductMatchingFileDataResponse" element
     */
    public com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse addNewGetProductPackageProductMatchingFileDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse target = null;
            target = (com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse)get_store().add_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductPackageProductMatchingFileDataResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductPackageProductMatchingFileDataResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument.GetProductPackageProductMatchingFileDataResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductPackageProductMatchingFileDataResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductPackageProductMatchingFileDataResult");
        
        
        /**
         * Gets the "GetProductPackageProductMatchingFileDataResult" element
         */
        public com.cdiscount.www.ProductMatchingFileMessage getGetProductPackageProductMatchingFileDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductMatchingFileMessage target = null;
                target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().find_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetProductPackageProductMatchingFileDataResult" element
         */
        public boolean isNilGetProductPackageProductMatchingFileDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductMatchingFileMessage target = null;
                target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().find_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetProductPackageProductMatchingFileDataResult" element
         */
        public boolean isSetGetProductPackageProductMatchingFileDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetProductPackageProductMatchingFileDataResult" element
         */
        public void setGetProductPackageProductMatchingFileDataResult(com.cdiscount.www.ProductMatchingFileMessage getProductPackageProductMatchingFileDataResult)
        {
            generatedSetterHelperImpl(getProductPackageProductMatchingFileDataResult, GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetProductPackageProductMatchingFileDataResult" element
         */
        public com.cdiscount.www.ProductMatchingFileMessage addNewGetProductPackageProductMatchingFileDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductMatchingFileMessage target = null;
                target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().add_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetProductPackageProductMatchingFileDataResult" element
         */
        public void setNilGetProductPackageProductMatchingFileDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductMatchingFileMessage target = null;
                target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().find_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductMatchingFileMessage)get_store().add_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetProductPackageProductMatchingFileDataResult" element
         */
        public void unsetGetProductPackageProductMatchingFileDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATARESULT$0, 0);
            }
        }
    }
}
