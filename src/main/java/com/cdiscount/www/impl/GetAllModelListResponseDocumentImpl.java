/*
 * An XML document type.
 * Localname: GetAllModelListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetAllModelListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetAllModelListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetAllModelListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetAllModelListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllModelListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLMODELLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetAllModelListResponse");
    
    
    /**
     * Gets the "GetAllModelListResponse" element
     */
    public com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse getGetAllModelListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse target = null;
            target = (com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse)get_store().find_element_user(GETALLMODELLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAllModelListResponse" element
     */
    public void setGetAllModelListResponse(com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse getAllModelListResponse)
    {
        generatedSetterHelperImpl(getAllModelListResponse, GETALLMODELLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetAllModelListResponse" element
     */
    public com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse addNewGetAllModelListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse target = null;
            target = (com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse)get_store().add_element_user(GETALLMODELLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAllModelListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetAllModelListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetAllModelListResponseDocument.GetAllModelListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAllModelListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETALLMODELLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetAllModelListResult");
        
        
        /**
         * Gets the "GetAllModelListResult" element
         */
        public com.cdiscount.www.ProductModelListMessage getGetAllModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(GETALLMODELLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetAllModelListResult" element
         */
        public boolean isNilGetAllModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(GETALLMODELLISTRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetAllModelListResult" element
         */
        public boolean isSetGetAllModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETALLMODELLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetAllModelListResult" element
         */
        public void setGetAllModelListResult(com.cdiscount.www.ProductModelListMessage getAllModelListResult)
        {
            generatedSetterHelperImpl(getAllModelListResult, GETALLMODELLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetAllModelListResult" element
         */
        public com.cdiscount.www.ProductModelListMessage addNewGetAllModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().add_element_user(GETALLMODELLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetAllModelListResult" element
         */
        public void setNilGetAllModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductModelListMessage target = null;
                target = (com.cdiscount.www.ProductModelListMessage)get_store().find_element_user(GETALLMODELLISTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductModelListMessage)get_store().add_element_user(GETALLMODELLISTRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetAllModelListResult" element
         */
        public void unsetGetAllModelListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETALLMODELLISTRESULT$0, 0);
            }
        }
    }
}
