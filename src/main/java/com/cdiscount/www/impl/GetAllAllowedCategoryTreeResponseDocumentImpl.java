/*
 * An XML document type.
 * Localname: GetAllAllowedCategoryTreeResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetAllAllowedCategoryTreeResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetAllAllowedCategoryTreeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllAllowedCategoryTreeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLALLOWEDCATEGORYTREERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetAllAllowedCategoryTreeResponse");
    
    
    /**
     * Gets the "GetAllAllowedCategoryTreeResponse" element
     */
    public com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse getGetAllAllowedCategoryTreeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse target = null;
            target = (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse)get_store().find_element_user(GETALLALLOWEDCATEGORYTREERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAllAllowedCategoryTreeResponse" element
     */
    public void setGetAllAllowedCategoryTreeResponse(com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse getAllAllowedCategoryTreeResponse)
    {
        generatedSetterHelperImpl(getAllAllowedCategoryTreeResponse, GETALLALLOWEDCATEGORYTREERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetAllAllowedCategoryTreeResponse" element
     */
    public com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse addNewGetAllAllowedCategoryTreeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse target = null;
            target = (com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse)get_store().add_element_user(GETALLALLOWEDCATEGORYTREERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAllAllowedCategoryTreeResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetAllAllowedCategoryTreeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument.GetAllAllowedCategoryTreeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAllAllowedCategoryTreeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETALLALLOWEDCATEGORYTREERESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetAllAllowedCategoryTreeResult");
        
        
        /**
         * Gets the "GetAllAllowedCategoryTreeResult" element
         */
        public com.cdiscount.www.CategoryTreeMessage getGetAllAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(GETALLALLOWEDCATEGORYTREERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetAllAllowedCategoryTreeResult" element
         */
        public boolean isNilGetAllAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(GETALLALLOWEDCATEGORYTREERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetAllAllowedCategoryTreeResult" element
         */
        public boolean isSetGetAllAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETALLALLOWEDCATEGORYTREERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetAllAllowedCategoryTreeResult" element
         */
        public void setGetAllAllowedCategoryTreeResult(com.cdiscount.www.CategoryTreeMessage getAllAllowedCategoryTreeResult)
        {
            generatedSetterHelperImpl(getAllAllowedCategoryTreeResult, GETALLALLOWEDCATEGORYTREERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetAllAllowedCategoryTreeResult" element
         */
        public com.cdiscount.www.CategoryTreeMessage addNewGetAllAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().add_element_user(GETALLALLOWEDCATEGORYTREERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetAllAllowedCategoryTreeResult" element
         */
        public void setNilGetAllAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(GETALLALLOWEDCATEGORYTREERESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.CategoryTreeMessage)get_store().add_element_user(GETALLALLOWEDCATEGORYTREERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetAllAllowedCategoryTreeResult" element
         */
        public void unsetGetAllAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETALLALLOWEDCATEGORYTREERESULT$0, 0);
            }
        }
    }
}
