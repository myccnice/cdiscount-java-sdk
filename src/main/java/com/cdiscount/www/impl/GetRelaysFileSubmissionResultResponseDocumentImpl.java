/*
 * An XML document type.
 * Localname: GetRelaysFileSubmissionResultResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetRelaysFileSubmissionResultResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetRelaysFileSubmissionResultResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRelaysFileSubmissionResultResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRELAYSFILESUBMISSIONRESULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetRelaysFileSubmissionResultResponse");
    
    
    /**
     * Gets the "GetRelaysFileSubmissionResultResponse" element
     */
    public com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse getGetRelaysFileSubmissionResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse target = null;
            target = (com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse)get_store().find_element_user(GETRELAYSFILESUBMISSIONRESULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRelaysFileSubmissionResultResponse" element
     */
    public void setGetRelaysFileSubmissionResultResponse(com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse getRelaysFileSubmissionResultResponse)
    {
        generatedSetterHelperImpl(getRelaysFileSubmissionResultResponse, GETRELAYSFILESUBMISSIONRESULTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetRelaysFileSubmissionResultResponse" element
     */
    public com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse addNewGetRelaysFileSubmissionResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse target = null;
            target = (com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse)get_store().add_element_user(GETRELAYSFILESUBMISSIONRESULTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetRelaysFileSubmissionResultResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetRelaysFileSubmissionResultResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument.GetRelaysFileSubmissionResultResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetRelaysFileSubmissionResultResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETRELAYSFILESUBMISSIONRESULTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetRelaysFileSubmissionResultResult");
        
        
        /**
         * Gets the "GetRelaysFileSubmissionResultResult" element
         */
        public com.cdiscount.www.RelayIntegrationReportMessage getGetRelaysFileSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelayIntegrationReportMessage target = null;
                target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().find_element_user(GETRELAYSFILESUBMISSIONRESULTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetRelaysFileSubmissionResultResult" element
         */
        public boolean isNilGetRelaysFileSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelayIntegrationReportMessage target = null;
                target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().find_element_user(GETRELAYSFILESUBMISSIONRESULTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetRelaysFileSubmissionResultResult" element
         */
        public boolean isSetGetRelaysFileSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETRELAYSFILESUBMISSIONRESULTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetRelaysFileSubmissionResultResult" element
         */
        public void setGetRelaysFileSubmissionResultResult(com.cdiscount.www.RelayIntegrationReportMessage getRelaysFileSubmissionResultResult)
        {
            generatedSetterHelperImpl(getRelaysFileSubmissionResultResult, GETRELAYSFILESUBMISSIONRESULTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetRelaysFileSubmissionResultResult" element
         */
        public com.cdiscount.www.RelayIntegrationReportMessage addNewGetRelaysFileSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelayIntegrationReportMessage target = null;
                target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().add_element_user(GETRELAYSFILESUBMISSIONRESULTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetRelaysFileSubmissionResultResult" element
         */
        public void setNilGetRelaysFileSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.RelayIntegrationReportMessage target = null;
                target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().find_element_user(GETRELAYSFILESUBMISSIONRESULTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().add_element_user(GETRELAYSFILESUBMISSIONRESULTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetRelaysFileSubmissionResultResult" element
         */
        public void unsetGetRelaysFileSubmissionResultResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETRELAYSFILESUBMISSIONRESULTRESULT$0, 0);
            }
        }
    }
}
