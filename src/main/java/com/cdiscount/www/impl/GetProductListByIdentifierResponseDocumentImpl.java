/*
 * An XML document type.
 * Localname: GetProductListByIdentifierResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductListByIdentifierResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductListByIdentifierResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductListByIdentifierResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListByIdentifierResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductListByIdentifierResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTLISTBYIDENTIFIERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductListByIdentifierResponse");
    
    
    /**
     * Gets the "GetProductListByIdentifierResponse" element
     */
    public com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse getGetProductListByIdentifierResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse target = null;
            target = (com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse)get_store().find_element_user(GETPRODUCTLISTBYIDENTIFIERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductListByIdentifierResponse" element
     */
    public void setGetProductListByIdentifierResponse(com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse getProductListByIdentifierResponse)
    {
        generatedSetterHelperImpl(getProductListByIdentifierResponse, GETPRODUCTLISTBYIDENTIFIERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductListByIdentifierResponse" element
     */
    public com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse addNewGetProductListByIdentifierResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse target = null;
            target = (com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse)get_store().add_element_user(GETPRODUCTLISTBYIDENTIFIERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductListByIdentifierResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductListByIdentifierResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListByIdentifierResponseDocument.GetProductListByIdentifierResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductListByIdentifierResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPRODUCTLISTBYIDENTIFIERRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductListByIdentifierResult");
        
        
        /**
         * Gets the "GetProductListByIdentifierResult" element
         */
        public com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage getGetProductListByIdentifierResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
                target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().find_element_user(GETPRODUCTLISTBYIDENTIFIERRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetProductListByIdentifierResult" element
         */
        public boolean isNilGetProductListByIdentifierResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
                target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().find_element_user(GETPRODUCTLISTBYIDENTIFIERRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetProductListByIdentifierResult" element
         */
        public boolean isSetGetProductListByIdentifierResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPRODUCTLISTBYIDENTIFIERRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetProductListByIdentifierResult" element
         */
        public void setGetProductListByIdentifierResult(com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage getProductListByIdentifierResult)
        {
            generatedSetterHelperImpl(getProductListByIdentifierResult, GETPRODUCTLISTBYIDENTIFIERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetProductListByIdentifierResult" element
         */
        public com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage addNewGetProductListByIdentifierResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
                target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().add_element_user(GETPRODUCTLISTBYIDENTIFIERRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetProductListByIdentifierResult" element
         */
        public void setNilGetProductListByIdentifierResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage target = null;
                target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().find_element_user(GETPRODUCTLISTBYIDENTIFIERRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.productbyidentifier.ProductListByIdentifierMessage)get_store().add_element_user(GETPRODUCTLISTBYIDENTIFIERRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetProductListByIdentifierResult" element
         */
        public void unsetGetProductListByIdentifierResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPRODUCTLISTBYIDENTIFIERRESULT$0, 0);
            }
        }
    }
}
