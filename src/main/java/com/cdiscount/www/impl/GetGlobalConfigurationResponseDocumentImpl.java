/*
 * An XML document type.
 * Localname: GetGlobalConfigurationResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetGlobalConfigurationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetGlobalConfigurationResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetGlobalConfigurationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetGlobalConfigurationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetGlobalConfigurationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETGLOBALCONFIGURATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetGlobalConfigurationResponse");
    
    
    /**
     * Gets the "GetGlobalConfigurationResponse" element
     */
    public com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse getGetGlobalConfigurationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse target = null;
            target = (com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse)get_store().find_element_user(GETGLOBALCONFIGURATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetGlobalConfigurationResponse" element
     */
    public void setGetGlobalConfigurationResponse(com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse getGlobalConfigurationResponse)
    {
        generatedSetterHelperImpl(getGlobalConfigurationResponse, GETGLOBALCONFIGURATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetGlobalConfigurationResponse" element
     */
    public com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse addNewGetGlobalConfigurationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse target = null;
            target = (com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse)get_store().add_element_user(GETGLOBALCONFIGURATIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetGlobalConfigurationResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetGlobalConfigurationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetGlobalConfigurationResponseDocument.GetGlobalConfigurationResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetGlobalConfigurationResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETGLOBALCONFIGURATIONRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "GetGlobalConfigurationResult");
        
        
        /**
         * Gets the "GetGlobalConfigurationResult" element
         */
        public com.cdiscount.www.GlobalConfigurationMessage getGetGlobalConfigurationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.GlobalConfigurationMessage target = null;
                target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().find_element_user(GETGLOBALCONFIGURATIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "GetGlobalConfigurationResult" element
         */
        public boolean isNilGetGlobalConfigurationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.GlobalConfigurationMessage target = null;
                target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().find_element_user(GETGLOBALCONFIGURATIONRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "GetGlobalConfigurationResult" element
         */
        public boolean isSetGetGlobalConfigurationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETGLOBALCONFIGURATIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetGlobalConfigurationResult" element
         */
        public void setGetGlobalConfigurationResult(com.cdiscount.www.GlobalConfigurationMessage getGlobalConfigurationResult)
        {
            generatedSetterHelperImpl(getGlobalConfigurationResult, GETGLOBALCONFIGURATIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetGlobalConfigurationResult" element
         */
        public com.cdiscount.www.GlobalConfigurationMessage addNewGetGlobalConfigurationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.GlobalConfigurationMessage target = null;
                target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().add_element_user(GETGLOBALCONFIGURATIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "GetGlobalConfigurationResult" element
         */
        public void setNilGetGlobalConfigurationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.GlobalConfigurationMessage target = null;
                target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().find_element_user(GETGLOBALCONFIGURATIONRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().add_element_user(GETGLOBALCONFIGURATIONRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "GetGlobalConfigurationResult" element
         */
        public void unsetGetGlobalConfigurationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETGLOBALCONFIGURATIONRESULT$0, 0);
            }
        }
    }
}
