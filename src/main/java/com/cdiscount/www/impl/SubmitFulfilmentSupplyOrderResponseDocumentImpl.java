/*
 * An XML document type.
 * Localname: SubmitFulfilmentSupplyOrderResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitFulfilmentSupplyOrderResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitFulfilmentSupplyOrderResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitFulfilmentSupplyOrderResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITFULFILMENTSUPPLYORDERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitFulfilmentSupplyOrderResponse");
    
    
    /**
     * Gets the "SubmitFulfilmentSupplyOrderResponse" element
     */
    public com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse getSubmitFulfilmentSupplyOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse target = null;
            target = (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse)get_store().find_element_user(SUBMITFULFILMENTSUPPLYORDERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitFulfilmentSupplyOrderResponse" element
     */
    public void setSubmitFulfilmentSupplyOrderResponse(com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse submitFulfilmentSupplyOrderResponse)
    {
        generatedSetterHelperImpl(submitFulfilmentSupplyOrderResponse, SUBMITFULFILMENTSUPPLYORDERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitFulfilmentSupplyOrderResponse" element
     */
    public com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse addNewSubmitFulfilmentSupplyOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse target = null;
            target = (com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse)get_store().add_element_user(SUBMITFULFILMENTSUPPLYORDERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitFulfilmentSupplyOrderResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitFulfilmentSupplyOrderResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument.SubmitFulfilmentSupplyOrderResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitFulfilmentSupplyOrderResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBMITFULFILMENTSUPPLYORDERRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitFulfilmentSupplyOrderResult");
        
        
        /**
         * Gets the "SubmitFulfilmentSupplyOrderResult" element
         */
        public com.cdiscount.www.SupplyOrderReportMessage getSubmitFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUBMITFULFILMENTSUPPLYORDERRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SubmitFulfilmentSupplyOrderResult" element
         */
        public boolean isNilSubmitFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUBMITFULFILMENTSUPPLYORDERRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "SubmitFulfilmentSupplyOrderResult" element
         */
        public boolean isSetSubmitFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITFULFILMENTSUPPLYORDERRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SubmitFulfilmentSupplyOrderResult" element
         */
        public void setSubmitFulfilmentSupplyOrderResult(com.cdiscount.www.SupplyOrderReportMessage submitFulfilmentSupplyOrderResult)
        {
            generatedSetterHelperImpl(submitFulfilmentSupplyOrderResult, SUBMITFULFILMENTSUPPLYORDERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SubmitFulfilmentSupplyOrderResult" element
         */
        public com.cdiscount.www.SupplyOrderReportMessage addNewSubmitFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().add_element_user(SUBMITFULFILMENTSUPPLYORDERRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "SubmitFulfilmentSupplyOrderResult" element
         */
        public void setNilSubmitFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUBMITFULFILMENTSUPPLYORDERRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().add_element_user(SUBMITFULFILMENTSUPPLYORDERRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "SubmitFulfilmentSupplyOrderResult" element
         */
        public void unsetSubmitFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITFULFILMENTSUPPLYORDERRESULT$0, 0);
            }
        }
    }
}
