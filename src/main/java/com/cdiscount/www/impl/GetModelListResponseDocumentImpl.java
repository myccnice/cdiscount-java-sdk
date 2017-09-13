/*
 * An XML document type.
 * Localname: GetModelListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetModelListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetModelListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetModelListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetModelListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetModelListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMODELLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetModelListResponse");
    
    
    /**
     * Gets the "GetModelListResponse" element
     */
    public com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse getGetModelListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse target = null;
            target = (com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse)get_store().find_element_user(GETMODELLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetModelListResponse" element
     */
    public void setGetModelListResponse(com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse getModelListResponse)
    {
        generatedSetterHelperImpl(getModelListResponse, GETMODELLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetModelListResponse" element
     */
    public com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse addNewGetModelListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse target = null;
            target = (com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse)get_store().add_element_user(GETMODELLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetModelListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetModelListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetModelListResponseDocument.GetModelListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetModelListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETMODELLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetModelListResult");
        
        
        /**
         * Gets the "GetModelListResult" element
         */
        public com.cdiscount.www.ProductModelListMessage getGetModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(GETMODELLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetModelListResult" element
         */
        public boolean isNilGetModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(GETMODELLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetModelListResult" element
         */
        public boolean isSetGetModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETMODELLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetModelListResult" element
         */
        public void setGetModelListResult(com.cdiscount.www.ProductModelListMessage getModelListResult)
        {
            generatedSetterHelperImpl(getModelListResult, GETMODELLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetModelListResult" element
         */
        public com.cdiscount.www.ProductModelListMessage addNewGetModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().add_element_user(GETMODELLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetModelListResult" element
         */
        public void setNilGetModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(GETMODELLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductModelListMessage)get_store().add_element_user(GETMODELLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetModelListResult" element
         */
        public void unsetGetModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETMODELLISTRESULT$0, 0);
            }
        }
    }
}
