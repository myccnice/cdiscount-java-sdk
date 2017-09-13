/*
 * An XML document type.
 * Localname: SubmitFulfilmentOnDemandSupplyOrderResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitFulfilmentOnDemandSupplyOrderResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitFulfilmentOnDemandSupplyOrderResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitFulfilmentOnDemandSupplyOrderResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITFULFILMENTONDEMANDSUPPLYORDERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitFulfilmentOnDemandSupplyOrderResponse");
    
    
    /**
     * Gets the "SubmitFulfilmentOnDemandSupplyOrderResponse" element
     */
    public com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse getSubmitFulfilmentOnDemandSupplyOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse target = null;
            target = (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse)get_store().find_element_user(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitFulfilmentOnDemandSupplyOrderResponse" element
     */
    public void setSubmitFulfilmentOnDemandSupplyOrderResponse(com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse submitFulfilmentOnDemandSupplyOrderResponse)
    {
        generatedSetterHelperImpl(submitFulfilmentOnDemandSupplyOrderResponse, SUBMITFULFILMENTONDEMANDSUPPLYORDERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitFulfilmentOnDemandSupplyOrderResponse" element
     */
    public com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse addNewSubmitFulfilmentOnDemandSupplyOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse target = null;
            target = (com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse)get_store().add_element_user(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitFulfilmentOnDemandSupplyOrderResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitFulfilmentOnDemandSupplyOrderResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument.SubmitFulfilmentOnDemandSupplyOrderResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitFulfilmentOnDemandSupplyOrderResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitFulfilmentOnDemandSupplyOrderResult");
        
        
        /**
         * Gets the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        public com.cdiscount.www.SupplyOrderReportMessage getSubmitFulfilmentOnDemandSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        public boolean isNilSubmitFulfilmentOnDemandSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        public boolean isSetSubmitFulfilmentOnDemandSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        public void setSubmitFulfilmentOnDemandSupplyOrderResult(com.cdiscount.www.SupplyOrderReportMessage submitFulfilmentOnDemandSupplyOrderResult)
        {
            generatedSetterHelperImpl(submitFulfilmentOnDemandSupplyOrderResult, SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        public com.cdiscount.www.SupplyOrderReportMessage addNewSubmitFulfilmentOnDemandSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().add_element_user(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        public void setNilSubmitFulfilmentOnDemandSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderReportMessage target = null;
                target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().find_element_user(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SupplyOrderReportMessage)get_store().add_element_user(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "SubmitFulfilmentOnDemandSupplyOrderResult" element
         */
        public void unsetSubmitFulfilmentOnDemandSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITFULFILMENTONDEMANDSUPPLYORDERRESULT$0, 0);
            }
        }
    }
}
