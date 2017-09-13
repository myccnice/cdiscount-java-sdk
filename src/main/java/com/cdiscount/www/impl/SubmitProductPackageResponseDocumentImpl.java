/*
 * An XML document type.
 * Localname: SubmitProductPackageResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitProductPackageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitProductPackageResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitProductPackageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitProductPackageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitProductPackageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITPRODUCTPACKAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitProductPackageResponse");
    
    
    /**
     * Gets the "SubmitProductPackageResponse" element
     */
    public com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse getSubmitProductPackageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse target = null;
            target = (com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse)get_store().find_element_user(SUBMITPRODUCTPACKAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitProductPackageResponse" element
     */
    public void setSubmitProductPackageResponse(com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse submitProductPackageResponse)
    {
        generatedSetterHelperImpl(submitProductPackageResponse, SUBMITPRODUCTPACKAGERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitProductPackageResponse" element
     */
    public com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse addNewSubmitProductPackageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse target = null;
            target = (com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse)get_store().add_element_user(SUBMITPRODUCTPACKAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitProductPackageResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitProductPackageResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitProductPackageResponseDocument.SubmitProductPackageResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitProductPackageResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBMITPRODUCTPACKAGERESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitProductPackageResult");
        
        
        /**
         * Gets the "SubmitProductPackageResult" element
         */
        public com.cdiscount.www.ProductIntegrationReportMessage getSubmitProductPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(SUBMITPRODUCTPACKAGERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SubmitProductPackageResult" element
         */
        public boolean isNilSubmitProductPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(SUBMITPRODUCTPACKAGERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "SubmitProductPackageResult" element
         */
        public boolean isSetSubmitProductPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITPRODUCTPACKAGERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SubmitProductPackageResult" element
         */
        public void setSubmitProductPackageResult(com.cdiscount.www.ProductIntegrationReportMessage submitProductPackageResult)
        {
            generatedSetterHelperImpl(submitProductPackageResult, SUBMITPRODUCTPACKAGERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SubmitProductPackageResult" element
         */
        public com.cdiscount.www.ProductIntegrationReportMessage addNewSubmitProductPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().add_element_user(SUBMITPRODUCTPACKAGERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "SubmitProductPackageResult" element
         */
        public void setNilSubmitProductPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductIntegrationReportMessage target = null;
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(SUBMITPRODUCTPACKAGERESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().add_element_user(SUBMITPRODUCTPACKAGERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "SubmitProductPackageResult" element
         */
        public void unsetSubmitProductPackageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITPRODUCTPACKAGERESULT$0, 0);
            }
        }
    }
}
