/*
 * An XML document type.
 * Localname: GetFulfilmentSupplyOrderResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetFulfilmentSupplyOrderResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetFulfilmentSupplyOrderResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFulfilmentSupplyOrderResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULFILMENTSUPPLYORDERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentSupplyOrderResponse");
    
    
    /**
     * Gets the "GetFulfilmentSupplyOrderResponse" element
     */
    public com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse getGetFulfilmentSupplyOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse)get_store().find_element_user(GETFULFILMENTSUPPLYORDERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFulfilmentSupplyOrderResponse" element
     */
    public void setGetFulfilmentSupplyOrderResponse(com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse getFulfilmentSupplyOrderResponse)
    {
        generatedSetterHelperImpl(getFulfilmentSupplyOrderResponse, GETFULFILMENTSUPPLYORDERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetFulfilmentSupplyOrderResponse" element
     */
    public com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse addNewGetFulfilmentSupplyOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse target = null;
            target = (com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse)get_store().add_element_user(GETFULFILMENTSUPPLYORDERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetFulfilmentSupplyOrderResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetFulfilmentSupplyOrderResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument.GetFulfilmentSupplyOrderResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetFulfilmentSupplyOrderResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETFULFILMENTSUPPLYORDERRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetFulfilmentSupplyOrderResult");
        
        
        /**
         * Gets the "GetFulfilmentSupplyOrderResult" element
         */
        public com.cdiscount.www.SupplyOrderMessage getGetFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderMessage target = null;
                target = (com.cdiscount.www.SupplyOrderMessage)get_store().find_element_user(GETFULFILMENTSUPPLYORDERRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetFulfilmentSupplyOrderResult" element
         */
        public boolean isNilGetFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderMessage target = null;
                target = (com.cdiscount.www.SupplyOrderMessage)get_store().find_element_user(GETFULFILMENTSUPPLYORDERRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetFulfilmentSupplyOrderResult" element
         */
        public boolean isSetGetFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETFULFILMENTSUPPLYORDERRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetFulfilmentSupplyOrderResult" element
         */
        public void setGetFulfilmentSupplyOrderResult(com.cdiscount.www.SupplyOrderMessage getFulfilmentSupplyOrderResult)
        {
            generatedSetterHelperImpl(getFulfilmentSupplyOrderResult, GETFULFILMENTSUPPLYORDERRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetFulfilmentSupplyOrderResult" element
         */
        public com.cdiscount.www.SupplyOrderMessage addNewGetFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderMessage target = null;
                target = (com.cdiscount.www.SupplyOrderMessage)get_store().add_element_user(GETFULFILMENTSUPPLYORDERRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetFulfilmentSupplyOrderResult" element
         */
        public void setNilGetFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.SupplyOrderMessage target = null;
                target = (com.cdiscount.www.SupplyOrderMessage)get_store().find_element_user(GETFULFILMENTSUPPLYORDERRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.SupplyOrderMessage)get_store().add_element_user(GETFULFILMENTSUPPLYORDERRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetFulfilmentSupplyOrderResult" element
         */
        public void unsetGetFulfilmentSupplyOrderResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETFULFILMENTSUPPLYORDERRESULT$0, 0);
            }
        }
    }
}
