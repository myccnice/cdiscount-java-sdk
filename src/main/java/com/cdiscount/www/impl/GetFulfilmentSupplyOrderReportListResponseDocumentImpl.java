/*
 * An XML document type.
 * Localname: GetFulfilmentSupplyOrderReportListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetFulfilmentSupplyOrderReportListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetFulfilmentSupplyOrderReportListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFulfilmentSupplyOrderReportListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULFILMENTSUPPLYORDERREPORTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentSupplyOrderReportListResponse");
    
    
    /**
     * Gets the "GetFulfilmentSupplyOrderReportListResponse" element
     */
    public com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse getGetFulfilmentSupplyOrderReportListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse)get_store().find_element_user(GETFULFILMENTSUPPLYORDERREPORTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFulfilmentSupplyOrderReportListResponse" element
     */
    public void setGetFulfilmentSupplyOrderReportListResponse(com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse getFulfilmentSupplyOrderReportListResponse)
    {
        generatedSetterHelperImpl(getFulfilmentSupplyOrderReportListResponse, GETFULFILMENTSUPPLYORDERREPORTLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetFulfilmentSupplyOrderReportListResponse" element
     */
    public com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse addNewGetFulfilmentSupplyOrderReportListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse)get_store().add_element_user(GETFULFILMENTSUPPLYORDERREPORTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetFulfilmentSupplyOrderReportListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetFulfilmentSupplyOrderReportListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument.GetFulfilmentSupplyOrderReportListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetFulfilmentSupplyOrderReportListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentSupplyOrderReportListResult");
        
        
        /**
         * Gets the "GetFulfilmentSupplyOrderReportListResult" element
         */
        public com.cdiscount.www.SupplyOrderReportListMessage getGetFulfilmentSupplyOrderReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportListMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().find_element_user(GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetFulfilmentSupplyOrderReportListResult" element
         */
        public boolean isNilGetFulfilmentSupplyOrderReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportListMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().find_element_user(GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetFulfilmentSupplyOrderReportListResult" element
         */
        public boolean isSetGetFulfilmentSupplyOrderReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetFulfilmentSupplyOrderReportListResult" element
         */
        public void setGetFulfilmentSupplyOrderReportListResult(com.cdiscount.www.SupplyOrderReportListMessage getFulfilmentSupplyOrderReportListResult)
        {
            generatedSetterHelperImpl(getFulfilmentSupplyOrderReportListResult, GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetFulfilmentSupplyOrderReportListResult" element
         */
        public com.cdiscount.www.SupplyOrderReportListMessage addNewGetFulfilmentSupplyOrderReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportListMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().add_element_user(GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetFulfilmentSupplyOrderReportListResult" element
         */
        public void setNilGetFulfilmentSupplyOrderReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportListMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().find_element_user(GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SupplyOrderReportListMessage)get_store().add_element_user(GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetFulfilmentSupplyOrderReportListResult" element
         */
        public void unsetGetFulfilmentSupplyOrderReportListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETFULFILMENTSUPPLYORDERREPORTLISTRESULT$0, 0);
            }
        }
    }
}
