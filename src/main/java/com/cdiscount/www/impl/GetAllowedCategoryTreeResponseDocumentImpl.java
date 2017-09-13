/*
 * An XML document type.
 * Localname: GetAllowedCategoryTreeResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetAllowedCategoryTreeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetAllowedCategoryTreeResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetAllowedCategoryTreeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetAllowedCategoryTreeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllowedCategoryTreeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLOWEDCATEGORYTREERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetAllowedCategoryTreeResponse");
    
    
    /**
     * Gets the "GetAllowedCategoryTreeResponse" element
     */
    public com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse getGetAllowedCategoryTreeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse target = null;
            target = (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse)get_store().find_element_user(GETALLOWEDCATEGORYTREERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAllowedCategoryTreeResponse" element
     */
    public void setGetAllowedCategoryTreeResponse(com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse getAllowedCategoryTreeResponse)
    {
        generatedSetterHelperImpl(getAllowedCategoryTreeResponse, GETALLOWEDCATEGORYTREERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetAllowedCategoryTreeResponse" element
     */
    public com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse addNewGetAllowedCategoryTreeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse target = null;
            target = (com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse)get_store().add_element_user(GETALLOWEDCATEGORYTREERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAllowedCategoryTreeResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetAllowedCategoryTreeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetAllowedCategoryTreeResponseDocument.GetAllowedCategoryTreeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAllowedCategoryTreeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETALLOWEDCATEGORYTREERESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetAllowedCategoryTreeResult");
        
        
        /**
         * Gets the "GetAllowedCategoryTreeResult" element
         */
        public com.cdiscount.www.CategoryTreeMessage getGetAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(GETALLOWEDCATEGORYTREERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetAllowedCategoryTreeResult" element
         */
        public boolean isNilGetAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(GETALLOWEDCATEGORYTREERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetAllowedCategoryTreeResult" element
         */
        public boolean isSetGetAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETALLOWEDCATEGORYTREERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetAllowedCategoryTreeResult" element
         */
        public void setGetAllowedCategoryTreeResult(com.cdiscount.www.CategoryTreeMessage getAllowedCategoryTreeResult)
        {
            generatedSetterHelperImpl(getAllowedCategoryTreeResult, GETALLOWEDCATEGORYTREERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetAllowedCategoryTreeResult" element
         */
        public com.cdiscount.www.CategoryTreeMessage addNewGetAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().add_element_user(GETALLOWEDCATEGORYTREERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetAllowedCategoryTreeResult" element
         */
        public void setNilGetAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.CategoryTreeMessage target = null;
                target = (com.cdiscount.www.CategoryTreeMessage)get_store().find_element_user(GETALLOWEDCATEGORYTREERESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.CategoryTreeMessage)get_store().add_element_user(GETALLOWEDCATEGORYTREERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetAllowedCategoryTreeResult" element
         */
        public void unsetGetAllowedCategoryTreeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETALLOWEDCATEGORYTREERESULT$0, 0);
            }
        }
    }
}
