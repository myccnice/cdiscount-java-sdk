/*
 * An XML document type.
 * Localname: GetProductPackageProductMatchingFileData
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductPackageProductMatchingFileData(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductPackageProductMatchingFileDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductPackageProductMatchingFileDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATA$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductPackageProductMatchingFileData");
    
    
    /**
     * Gets the "GetProductPackageProductMatchingFileData" element
     */
    public com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData getGetProductPackageProductMatchingFileData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData target = null;
            target = (com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData)get_store().find_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductPackageProductMatchingFileData" element
     */
    public void setGetProductPackageProductMatchingFileData(com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData getProductPackageProductMatchingFileData)
    {
        generatedSetterHelperImpl(getProductPackageProductMatchingFileData, GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductPackageProductMatchingFileData" element
     */
    public com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData addNewGetProductPackageProductMatchingFileData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData target = null;
            target = (com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData)get_store().add_element_user(GETPRODUCTPACKAGEPRODUCTMATCHINGFILEDATA$0);
            return target;
        }
    }
    /**
     * An XML GetProductPackageProductMatchingFileData(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductPackageProductMatchingFileDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductPackageProductMatchingFileDataDocument.GetProductPackageProductMatchingFileData
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductPackageProductMatchingFileDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName PRODUCTPACKAGEFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "productPackageFilter");
        
        
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
         * Gets the "productPackageFilter" element
         */
        public com.cdiscount.www.PackageFilter getProductPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(PRODUCTPACKAGEFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "productPackageFilter" element
         */
        public boolean isNilProductPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(PRODUCTPACKAGEFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "productPackageFilter" element
         */
        public boolean isSetProductPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTPACKAGEFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "productPackageFilter" element
         */
        public void setProductPackageFilter(com.cdiscount.www.PackageFilter productPackageFilter)
        {
            generatedSetterHelperImpl(productPackageFilter, PRODUCTPACKAGEFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "productPackageFilter" element
         */
        public com.cdiscount.www.PackageFilter addNewProductPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().add_element_user(PRODUCTPACKAGEFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "productPackageFilter" element
         */
        public void setNilProductPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.PackageFilter target = null;
                target = (com.cdiscount.www.PackageFilter)get_store().find_element_user(PRODUCTPACKAGEFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.PackageFilter)get_store().add_element_user(PRODUCTPACKAGEFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "productPackageFilter" element
         */
        public void unsetProductPackageFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTPACKAGEFILTER$2, 0);
            }
        }
    }
}
