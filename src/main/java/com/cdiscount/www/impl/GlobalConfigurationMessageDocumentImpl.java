/*
 * An XML document type.
 * Localname: GlobalConfigurationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GlobalConfigurationMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GlobalConfigurationMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GlobalConfigurationMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GlobalConfigurationMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalConfigurationMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALCONFIGURATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GlobalConfigurationMessage");
    
    
    /**
     * Gets the "GlobalConfigurationMessage" element
     */
    public com.cdiscount.www.GlobalConfigurationMessage getGlobalConfigurationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GlobalConfigurationMessage target = null;
            target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().find_element_user(GLOBALCONFIGURATIONMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GlobalConfigurationMessage" element
     */
    public boolean isNilGlobalConfigurationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GlobalConfigurationMessage target = null;
            target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().find_element_user(GLOBALCONFIGURATIONMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "GlobalConfigurationMessage" element
     */
    public void setGlobalConfigurationMessage(com.cdiscount.www.GlobalConfigurationMessage globalConfigurationMessage)
    {
        generatedSetterHelperImpl(globalConfigurationMessage, GLOBALCONFIGURATIONMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GlobalConfigurationMessage" element
     */
    public com.cdiscount.www.GlobalConfigurationMessage addNewGlobalConfigurationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GlobalConfigurationMessage target = null;
            target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().add_element_user(GLOBALCONFIGURATIONMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "GlobalConfigurationMessage" element
     */
    public void setNilGlobalConfigurationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GlobalConfigurationMessage target = null;
            target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().find_element_user(GLOBALCONFIGURATIONMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.GlobalConfigurationMessage)get_store().add_element_user(GLOBALCONFIGURATIONMESSAGE$0);
            }
            target.setNil();
        }
    }
}
