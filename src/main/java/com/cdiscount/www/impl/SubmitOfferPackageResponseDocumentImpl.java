/*
 * An XML document type.
 * Localname: SubmitOfferPackageResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitOfferPackageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitOfferPackageResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitOfferPackageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferPackageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitOfferPackageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITOFFERPACKAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitOfferPackageResponse");
    
    
    /**
     * Gets the "SubmitOfferPackageResponse" element
     */
    public com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse getSubmitOfferPackageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse target = null;
            target = (com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse)get_store().find_element_user(SUBMITOFFERPACKAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitOfferPackageResponse" element
     */
    public void setSubmitOfferPackageResponse(com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse submitOfferPackageResponse)
    {
        generatedSetterHelperImpl(submitOfferPackageResponse, SUBMITOFFERPACKAGERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitOfferPackageResponse" element
     */
    public com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse addNewSubmitOfferPackageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse target = null;
            target = (com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse)get_store().add_element_user(SUBMITOFFERPACKAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitOfferPackageResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitOfferPackageResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferPackageResponseDocument.SubmitOfferPackageResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitOfferPackageResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBMITOFFERPACKAGERESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitOfferPackageResult");
        
        
        /**
         * Gets the "SubmitOfferPackageResult" element
         */
        public com.cdiscount.www.OfferIntegrationReportMessage getSubmitOfferPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(SUBMITOFFERPACKAGERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SubmitOfferPackageResult" element
         */
        public boolean isNilSubmitOfferPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(SUBMITOFFERPACKAGERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "SubmitOfferPackageResult" element
         */
        public boolean isSetSubmitOfferPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITOFFERPACKAGERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SubmitOfferPackageResult" element
         */
        public void setSubmitOfferPackageResult(com.cdiscount.www.OfferIntegrationReportMessage submitOfferPackageResult)
        {
            generatedSetterHelperImpl(submitOfferPackageResult, SUBMITOFFERPACKAGERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SubmitOfferPackageResult" element
         */
        public com.cdiscount.www.OfferIntegrationReportMessage addNewSubmitOfferPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().add_element_user(SUBMITOFFERPACKAGERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "SubmitOfferPackageResult" element
         */
        public void setNilSubmitOfferPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferIntegrationReportMessage target = null;
                target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().find_element_user(SUBMITOFFERPACKAGERESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferIntegrationReportMessage)get_store().add_element_user(SUBMITOFFERPACKAGERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "SubmitOfferPackageResult" element
         */
        public void unsetSubmitOfferPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITOFFERPACKAGERESULT$0, 0);
            }
        }
    }
}
