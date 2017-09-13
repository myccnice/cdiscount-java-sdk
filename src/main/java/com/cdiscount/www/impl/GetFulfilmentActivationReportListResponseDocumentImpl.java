/*
 * An XML document type.
 * Localname: GetFulfilmentActivationReportListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetFulfilmentActivationReportListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetFulfilmentActivationReportListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFulfilmentActivationReportListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULFILMENTACTIVATIONREPORTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentActivationReportListResponse");
    
    
    /**
     * Gets the "GetFulfilmentActivationReportListResponse" element
     */
    public com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse getGetFulfilmentActivationReportListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse)get_store().find_element_user(GETFULFILMENTACTIVATIONREPORTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFulfilmentActivationReportListResponse" element
     */
    public void setGetFulfilmentActivationReportListResponse(com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse getFulfilmentActivationReportListResponse)
    {
        generatedSetterHelperImpl(getFulfilmentActivationReportListResponse, GETFULFILMENTACTIVATIONREPORTLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetFulfilmentActivationReportListResponse" element
     */
    public com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse addNewGetFulfilmentActivationReportListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse)get_store().add_element_user(GETFULFILMENTACTIVATIONREPORTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetFulfilmentActivationReportListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetFulfilmentActivationReportListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument.GetFulfilmentActivationReportListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetFulfilmentActivationReportListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETFULFILMENTACTIVATIONREPORTLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentActivationReportListResult");
        
        
        /**
         * Gets the "GetFulfilmentActivationReportListResult" element
         */
        public com.cdiscount.www.FulfilmentActivationReportMessage getGetFulfilmentActivationReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().find_element_user(GETFULFILMENTACTIVATIONREPORTLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetFulfilmentActivationReportListResult" element
         */
        public boolean isNilGetFulfilmentActivationReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().find_element_user(GETFULFILMENTACTIVATIONREPORTLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetFulfilmentActivationReportListResult" element
         */
        public boolean isSetGetFulfilmentActivationReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETFULFILMENTACTIVATIONREPORTLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetFulfilmentActivationReportListResult" element
         */
        public void setGetFulfilmentActivationReportListResult(com.cdiscount.www.FulfilmentActivationReportMessage getFulfilmentActivationReportListResult)
        {
            generatedSetterHelperImpl(getFulfilmentActivationReportListResult, GETFULFILMENTACTIVATIONREPORTLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetFulfilmentActivationReportListResult" element
         */
        public com.cdiscount.www.FulfilmentActivationReportMessage addNewGetFulfilmentActivationReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().add_element_user(GETFULFILMENTACTIVATIONREPORTLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetFulfilmentActivationReportListResult" element
         */
        public void setNilGetFulfilmentActivationReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.FulfilmentActivationReportMessage target = null;
                target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().find_element_user(GETFULFILMENTACTIVATIONREPORTLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.FulfilmentActivationReportMessage)get_store().add_element_user(GETFULFILMENTACTIVATIONREPORTLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetFulfilmentActivationReportListResult" element
         */
        public void unsetGetFulfilmentActivationReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETFULFILMENTACTIVATIONREPORTLISTRESULT$0, 0);
            }
        }
    }
}
