/*
 * An XML document type.
 * Localname: GetProductList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetProductListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetProductList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetProductListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetProductList");
    
    
    /**
     * Gets the "GetProductList" element
     */
    public com.cdiscount.www.GetProductListDocument.GetProductList getGetProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListDocument.GetProductList target = null;
            target = (com.cdiscount.www.GetProductListDocument.GetProductList)get_store().find_element_user(GETPRODUCTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductList" element
     */
    public void setGetProductList(com.cdiscount.www.GetProductListDocument.GetProductList getProductList)
    {
        generatedSetterHelperImpl(getProductList, GETPRODUCTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetProductList" element
     */
    public com.cdiscount.www.GetProductListDocument.GetProductList addNewGetProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetProductListDocument.GetProductList target = null;
            target = (com.cdiscount.www.GetProductListDocument.GetProductList)get_store().add_element_user(GETPRODUCTLIST$0);
            return target;
        }
    }
    /**
     * An XML GetProductList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetProductListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetProductListDocument.GetProductList
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName PRODUCTFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "productFilter");
        
        
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
         * Gets the "productFilter" element
         */
        public com.cdiscount.www.ProductFilter getProductFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductFilter target = null;
                target = (com.cdiscount.www.ProductFilter)get_store().find_element_user(PRODUCTFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "productFilter" element
         */
        public boolean isNilProductFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductFilter target = null;
                target = (com.cdiscount.www.ProductFilter)get_store().find_element_user(PRODUCTFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "productFilter" element
         */
        public boolean isSetProductFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "productFilter" element
         */
        public void setProductFilter(com.cdiscount.www.ProductFilter productFilter)
        {
            generatedSetterHelperImpl(productFilter, PRODUCTFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "productFilter" element
         */
        public com.cdiscount.www.ProductFilter addNewProductFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductFilter target = null;
                target = (com.cdiscount.www.ProductFilter)get_store().add_element_user(PRODUCTFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "productFilter" element
         */
        public void setNilProductFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ProductFilter target = null;
                target = (com.cdiscount.www.ProductFilter)get_store().find_element_user(PRODUCTFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ProductFilter)get_store().add_element_user(PRODUCTFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "productFilter" element
         */
        public void unsetProductFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTFILTER$2, 0);
            }
        }
    }
}
