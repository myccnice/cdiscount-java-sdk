/*
 * An XML document type.
 * Localname: ManageParcelResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ManageParcelResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ManageParcelResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ManageParcelResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ManageParcelResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManageParcelResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEPARCELRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ManageParcelResponse");
    
    
    /**
     * Gets the "ManageParcelResponse" element
     */
    public com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse getManageParcelResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse target = null;
            target = (com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse)get_store().find_element_user(MANAGEPARCELRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ManageParcelResponse" element
     */
    public void setManageParcelResponse(com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse manageParcelResponse)
    {
        generatedSetterHelperImpl(manageParcelResponse, MANAGEPARCELRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManageParcelResponse" element
     */
    public com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse addNewManageParcelResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse target = null;
            target = (com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse)get_store().add_element_user(MANAGEPARCELRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ManageParcelResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class ManageParcelResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ManageParcelResponseDocument.ManageParcelResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ManageParcelResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MANAGEPARCELRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "ManageParcelResult");
        
        
        /**
         * Gets the "ManageParcelResult" element
         */
        public com.cdiscount.www.ManageParcelResultMessage getManageParcelResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelResultMessage target = null;
                target = (com.cdiscount.www.ManageParcelResultMessage)get_store().find_element_user(MANAGEPARCELRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "ManageParcelResult" element
         */
        public boolean isNilManageParcelResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelResultMessage target = null;
                target = (com.cdiscount.www.ManageParcelResultMessage)get_store().find_element_user(MANAGEPARCELRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "ManageParcelResult" element
         */
        public boolean isSetManageParcelResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MANAGEPARCELRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "ManageParcelResult" element
         */
        public void setManageParcelResult(com.cdiscount.www.ManageParcelResultMessage manageParcelResult)
        {
            generatedSetterHelperImpl(manageParcelResult, MANAGEPARCELRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ManageParcelResult" element
         */
        public com.cdiscount.www.ManageParcelResultMessage addNewManageParcelResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelResultMessage target = null;
                target = (com.cdiscount.www.ManageParcelResultMessage)get_store().add_element_user(MANAGEPARCELRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "ManageParcelResult" element
         */
        public void setNilManageParcelResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ManageParcelResultMessage target = null;
                target = (com.cdiscount.www.ManageParcelResultMessage)get_store().find_element_user(MANAGEPARCELRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ManageParcelResultMessage)get_store().add_element_user(MANAGEPARCELRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "ManageParcelResult" element
         */
        public void unsetManageParcelResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MANAGEPARCELRESULT$0, 0);
            }
        }
    }
}
