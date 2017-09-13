/*
 * An XML document type.
 * Localname: ServiceBaseAPIMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ServiceBaseAPIMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ServiceBaseAPIMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ServiceBaseAPIMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ServiceBaseAPIMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceBaseAPIMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEBASEAPIMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ServiceBaseAPIMessage");
    
    
    /**
     * Gets the "ServiceBaseAPIMessage" element
     */
    public com.cdiscount.www.ServiceBaseAPIMessage getServiceBaseAPIMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ServiceBaseAPIMessage target = null;
            target = (com.cdiscount.www.ServiceBaseAPIMessage)get_store().find_element_user(SERVICEBASEAPIMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ServiceBaseAPIMessage" element
     */
    public boolean isNilServiceBaseAPIMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ServiceBaseAPIMessage target = null;
            target = (com.cdiscount.www.ServiceBaseAPIMessage)get_store().find_element_user(SERVICEBASEAPIMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ServiceBaseAPIMessage" element
     */
    public void setServiceBaseAPIMessage(com.cdiscount.www.ServiceBaseAPIMessage serviceBaseAPIMessage)
    {
        generatedSetterHelperImpl(serviceBaseAPIMessage, SERVICEBASEAPIMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceBaseAPIMessage" element
     */
    public com.cdiscount.www.ServiceBaseAPIMessage addNewServiceBaseAPIMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ServiceBaseAPIMessage target = null;
            target = (com.cdiscount.www.ServiceBaseAPIMessage)get_store().add_element_user(SERVICEBASEAPIMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ServiceBaseAPIMessage" element
     */
    public void setNilServiceBaseAPIMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ServiceBaseAPIMessage target = null;
            target = (com.cdiscount.www.ServiceBaseAPIMessage)get_store().find_element_user(SERVICEBASEAPIMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ServiceBaseAPIMessage)get_store().add_element_user(SERVICEBASEAPIMESSAGE$0);
            }
            target.setNil();
        }
    }
}
