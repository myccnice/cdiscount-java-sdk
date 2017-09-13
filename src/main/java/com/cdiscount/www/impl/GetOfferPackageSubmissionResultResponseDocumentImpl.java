/*
 * An XML document type.
 * Localname: GetOfferPackageSubmissionResultResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetOfferPackageSubmissionResultResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetOfferPackageSubmissionResultResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetOfferPackageSubmissionResultResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERPACKAGESUBMISSIONRESULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferPackageSubmissionResultResponse");
    
    
    /**
     * Gets the "GetOfferPackageSubmissionResultResponse" element
     */
    public com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse getGetOfferPackageSubmissionResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse target = null;
            target = (com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse)get_store().find_element_user(GETOFFERPACKAGESUBMISSIONRESULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferPackageSubmissionResultResponse" element
     */
    public void setGetOfferPackageSubmissionResultResponse(com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse getOfferPackageSubmissionResultResponse)
    {
        generatedSetterHelperImpl(getOfferPackageSubmissionResultResponse, GETOFFERPACKAGESUBMISSIONRESULTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetOfferPackageSubmissionResultResponse" element
     */
    public com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse addNewGetOfferPackageSubmissionResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse target = null;
            target = (com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse)get_store().add_element_user(GETOFFERPACKAGESUBMISSIONRESULTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOfferPackageSubmissionResultResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetOfferPackageSubmissionResultResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument.GetOfferPackageSubmissionResultResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetOfferPackageSubmissionResultResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETOFFERPACKAGESUBMISSIONRESULTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetOfferPackageSubmissionResultResult");
        
        
        /**
         * Gets the "GetOfferPackageSubmissionResultResult" element
         */
        public com.cdiscount.www.OfferIntegrationReportMessage getGetOfferPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(GETOFFERPACKAGESUBMISSIONRESULTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetOfferPackageSubmissionResultResult" element
         */
        public boolean isNilGetOfferPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(GETOFFERPACKAGESUBMISSIONRESULTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetOfferPackageSubmissionResultResult" element
         */
        public boolean isSetGetOfferPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETOFFERPACKAGESUBMISSIONRESULTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetOfferPackageSubmissionResultResult" element
         */
        public void setGetOfferPackageSubmissionResultResult(com.cdiscount.www.OfferIntegrationReportMessage getOfferPackageSubmissionResultResult)
        {
            generatedSetterHelperImpl(getOfferPackageSubmissionResultResult, GETOFFERPACKAGESUBMISSIONRESULTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetOfferPackageSubmissionResultResult" element
         */
        public com.cdiscount.www.OfferIntegrationReportMessage addNewGetOfferPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().add_element_user(GETOFFERPACKAGESUBMISSIONRESULTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetOfferPackageSubmissionResultResult" element
         */
        public void setNilGetOfferPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(GETOFFERPACKAGESUBMISSIONRESULTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().add_element_user(GETOFFERPACKAGESUBMISSIONRESULTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetOfferPackageSubmissionResultResult" element
         */
        public void unsetGetOfferPackageSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETOFFERPACKAGESUBMISSIONRESULTRESULT$0, 0);
            }
        }
    }
}
