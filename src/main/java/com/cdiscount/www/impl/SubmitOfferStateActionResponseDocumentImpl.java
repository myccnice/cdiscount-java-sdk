/*
 * An XML document type.
 * Localname: SubmitOfferStateActionResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitOfferStateActionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitOfferStateActionResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitOfferStateActionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferStateActionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitOfferStateActionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITOFFERSTATEACTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitOfferStateActionResponse");
    
    
    /**
     * Gets the "SubmitOfferStateActionResponse" element
     */
    public com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse getSubmitOfferStateActionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse target = null;
            target = (com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse)get_store().find_element_user(SUBMITOFFERSTATEACTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitOfferStateActionResponse" element
     */
    public void setSubmitOfferStateActionResponse(com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse submitOfferStateActionResponse)
    {
        generatedSetterHelperImpl(submitOfferStateActionResponse, SUBMITOFFERSTATEACTIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitOfferStateActionResponse" element
     */
    public com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse addNewSubmitOfferStateActionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse target = null;
            target = (com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse)get_store().add_element_user(SUBMITOFFERSTATEACTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitOfferStateActionResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitOfferStateActionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitOfferStateActionResponseDocument.SubmitOfferStateActionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitOfferStateActionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBMITOFFERSTATEACTIONRESULT$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitOfferStateActionResult");
        
        
        /**
         * Gets the "SubmitOfferStateActionResult" element
         */
        public com.cdiscount.www.OfferStateReportMessage getSubmitOfferStateActionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateReportMessage target = null;
                target = (com.cdiscount.www.OfferStateReportMessage)get_store().find_element_user(SUBMITOFFERSTATEACTIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SubmitOfferStateActionResult" element
         */
        public boolean isNilSubmitOfferStateActionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateReportMessage target = null;
                target = (com.cdiscount.www.OfferStateReportMessage)get_store().find_element_user(SUBMITOFFERSTATEACTIONRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "SubmitOfferStateActionResult" element
         */
        public boolean isSetSubmitOfferStateActionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITOFFERSTATEACTIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SubmitOfferStateActionResult" element
         */
        public void setSubmitOfferStateActionResult(com.cdiscount.www.OfferStateReportMessage submitOfferStateActionResult)
        {
            generatedSetterHelperImpl(submitOfferStateActionResult, SUBMITOFFERSTATEACTIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SubmitOfferStateActionResult" element
         */
        public com.cdiscount.www.OfferStateReportMessage addNewSubmitOfferStateActionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateReportMessage target = null;
                target = (com.cdiscount.www.OfferStateReportMessage)get_store().add_element_user(SUBMITOFFERSTATEACTIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "SubmitOfferStateActionResult" element
         */
        public void setNilSubmitOfferStateActionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.OfferStateReportMessage target = null;
                target = (com.cdiscount.www.OfferStateReportMessage)get_store().find_element_user(SUBMITOFFERSTATEACTIONRESULT$0, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.OfferStateReportMessage)get_store().add_element_user(SUBMITOFFERSTATEACTIONRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "SubmitOfferStateActionResult" element
         */
        public void unsetSubmitOfferStateActionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITOFFERSTATEACTIONRESULT$0, 0);
            }
        }
    }
}
