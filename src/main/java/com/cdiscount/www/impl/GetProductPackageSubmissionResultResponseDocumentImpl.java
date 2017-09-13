/*
 * An XML document type.
 * Localname: GetProductPackageSubmissionResultResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductPackageSubmissionResultResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductPackageSubmissionResultResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductPackageSubmissionResultResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTPACKAGESUBMISSIONRESULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductPackageSubmissionResultResponse");
    
    
    /**
     * Gets the "GetProductPackageSubmissionResultResponse" element
     */
    public com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse getGetProductPackageSubmissionResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse target = null;
            target = (com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse)get_store().find_element_user(GETPRODUCTPACKAGESUBMISSIONRESULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductPackageSubmissionResultResponse" element
     */
    public void setGetProductPackageSubmissionResultResponse(com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse getProductPackageSubmissionResultResponse)
    {
        generatedSetterHelperImpl(getProductPackageSubmissionResultResponse, GETPRODUCTPACKAGESUBMISSIONRESULTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductPackageSubmissionResultResponse" element
     */
    public com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse addNewGetProductPackageSubmissionResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse target = null;
            target = (com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse)get_store().add_element_user(GETPRODUCTPACKAGESUBMISSIONRESULTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductPackageSubmissionResultResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductPackageSubmissionResultResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument.GetProductPackageSubmissionResultResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductPackageSubmissionResultResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductPackageSubmissionResultResult");
        
        
        /**
         * Gets the "GetProductPackageSubmissionResultResult" element
         */
        public com.cdiscount.www.ProductIntegrationReportMessage getGetProductPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetProductPackageSubmissionResultResult" element
         */
        public boolean isNilGetProductPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetProductPackageSubmissionResultResult" element
         */
        public boolean isSetGetProductPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetProductPackageSubmissionResultResult" element
         */
        public void setGetProductPackageSubmissionResultResult(com.cdiscount.www.ProductIntegrationReportMessage getProductPackageSubmissionResultResult)
        {
            generatedSetterHelperImpl(getProductPackageSubmissionResultResult, GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetProductPackageSubmissionResultResult" element
         */
        public com.cdiscount.www.ProductIntegrationReportMessage addNewGetProductPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().add_element_user(GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetProductPackageSubmissionResultResult" element
         */
        public void setNilGetProductPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().add_element_user(GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetProductPackageSubmissionResultResult" element
         */
        public void unsetGetProductPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPRODUCTPACKAGESUBMISSIONRESULTRESULT$0, 0);
            }
        }
    }
}
