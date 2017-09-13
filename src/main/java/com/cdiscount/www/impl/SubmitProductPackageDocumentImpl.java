/*
 * An XML document type.
 * Localname: SubmitProductPackage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitProductPackageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SubmitProductPackage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SubmitProductPackageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitProductPackageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitProductPackageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITPRODUCTPACKAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SubmitProductPackage");
    
    
    /**
     * Gets the "SubmitProductPackage" element
     */
    public com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage getSubmitProductPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage target = null;
            target = (com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage)get_store().find_element_user(SUBMITPRODUCTPACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitProductPackage" element
     */
    public void setSubmitProductPackage(com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage submitProductPackage)
    {
        generatedSetterHelperImpl(submitProductPackage, SUBMITPRODUCTPACKAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SubmitProductPackage" element
     */
    public com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage addNewSubmitProductPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage target = null;
            target = (com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage)get_store().add_element_user(SUBMITPRODUCTPACKAGE$0);
            return target;
        }
    }
    /**
     * An XML SubmitProductPackage(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class SubmitProductPackageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SubmitProductPackageDocument.SubmitProductPackage
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitProductPackageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName PRODUCTPACKAGEREQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "productPackageRequest");
        
        
        /**
         * Gets the "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage getHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "headerMessage" element
         */
        public boolean isNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "headerMessage" element
         */
        public boolean isSetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADERMESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "headerMessage" element
         */
        public void setHeaderMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage headerMessage)
        {
            generatedSetterHelperImpl(headerMessage, HEADERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage addNewHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                return target;
            }
        }
        
        /**
         * Nils the "headerMessage" element
         */
        public void setNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "headerMessage" element
         */
        public void unsetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADERMESSAGE$0, 0);
            }
        }
        
        /**
         * Gets the "productPackageRequest" element
         */
        public com.cdiscount.www.ProductPackageRequest getProductPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductPackageRequest target = null;
                target = (com.cdiscount.www.ProductPackageRequest)get_store().find_element_user(PRODUCTPACKAGEREQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "productPackageRequest" element
         */
        public boolean isNilProductPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductPackageRequest target = null;
                target = (com.cdiscount.www.ProductPackageRequest)get_store().find_element_user(PRODUCTPACKAGEREQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "productPackageRequest" element
         */
        public boolean isSetProductPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTPACKAGEREQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "productPackageRequest" element
         */
        public void setProductPackageRequest(com.cdiscount.www.ProductPackageRequest productPackageRequest)
        {
            generatedSetterHelperImpl(productPackageRequest, PRODUCTPACKAGEREQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "productPackageRequest" element
         */
        public com.cdiscount.www.ProductPackageRequest addNewProductPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductPackageRequest target = null;
                target = (com.cdiscount.www.ProductPackageRequest)get_store().add_element_user(PRODUCTPACKAGEREQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "productPackageRequest" element
         */
        public void setNilProductPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductPackageRequest target = null;
                target = (com.cdiscount.www.ProductPackageRequest)get_store().find_element_user(PRODUCTPACKAGEREQUEST$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductPackageRequest)get_store().add_element_user(PRODUCTPACKAGEREQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "productPackageRequest" element
         */
        public void unsetProductPackageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTPACKAGEREQUEST$2, 0);
            }
        }
    }
}
