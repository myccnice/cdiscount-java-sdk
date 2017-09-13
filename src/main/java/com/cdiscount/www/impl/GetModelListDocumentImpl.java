/*
 * An XML document type.
 * Localname: GetModelList
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetModelListDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetModelList(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetModelListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetModelListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetModelListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMODELLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetModelList");
    
    
    /**
     * Gets the "GetModelList" element
     */
    public com.cdiscount.www.GetModelListDocument.GetModelList getGetModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetModelListDocument.GetModelList target = null;
            target = (com.cdiscount.www.GetModelListDocument.GetModelList)get_store().find_element_user(GETMODELLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetModelList" element
     */
    public void setGetModelList(com.cdiscount.www.GetModelListDocument.GetModelList getModelList)
    {
        generatedSetterHelperImpl(getModelList, GETMODELLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetModelList" element
     */
    public com.cdiscount.www.GetModelListDocument.GetModelList addNewGetModelList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetModelListDocument.GetModelList target = null;
            target = (com.cdiscount.www.GetModelListDocument.GetModelList)get_store().add_element_user(GETMODELLIST$0);
            return target;
        }
    }
    /**
     * An XML GetModelList(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetModelListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetModelListDocument.GetModelList
    {
        private static final long serialVersionUID = 1L;
        
        public GetModelListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName MODELFILTER$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "modelFilter");
        
        
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
         * Gets the "modelFilter" element
         */
        public com.cdiscount.www.ModelFilter getModelFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ModelFilter target = null;
                target = (com.cdiscount.www.ModelFilter)get_store().find_element_user(MODELFILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "modelFilter" element
         */
        public boolean isNilModelFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ModelFilter target = null;
                target = (com.cdiscount.www.ModelFilter)get_store().find_element_user(MODELFILTER$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "modelFilter" element
         */
        public boolean isSetModelFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODELFILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "modelFilter" element
         */
        public void setModelFilter(com.cdiscount.www.ModelFilter modelFilter)
        {
            generatedSetterHelperImpl(modelFilter, MODELFILTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "modelFilter" element
         */
        public com.cdiscount.www.ModelFilter addNewModelFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ModelFilter target = null;
                target = (com.cdiscount.www.ModelFilter)get_store().add_element_user(MODELFILTER$2);
                return target;
            }
        }
        
        /**
         * Nils the "modelFilter" element
         */
        public void setNilModelFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.cdiscount.www.ModelFilter target = null;
                target = (com.cdiscount.www.ModelFilter)get_store().find_element_user(MODELFILTER$2, 0);
                if (target == null)
                {
                    target = (com.cdiscount.www.ModelFilter)get_store().add_element_user(MODELFILTER$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "modelFilter" element
         */
        public void unsetModelFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODELFILTER$2, 0);
            }
        }
    }
}
