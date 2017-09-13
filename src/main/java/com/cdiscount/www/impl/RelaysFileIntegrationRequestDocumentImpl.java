/*
 * An XML document type.
 * Localname: RelaysFileIntegrationRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelaysFileIntegrationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RelaysFileIntegrationRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RelaysFileIntegrationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RelaysFileIntegrationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelaysFileIntegrationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYSFILEINTEGRATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysFileIntegrationRequest");
    
    
    /**
     * Gets the "RelaysFileIntegrationRequest" element
     */
    public com.cdiscount.www.RelaysFileIntegrationRequest getRelaysFileIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileIntegrationRequest target = null;
            target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().find_element_user(RELAYSFILEINTEGRATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelaysFileIntegrationRequest" element
     */
    public boolean isNilRelaysFileIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileIntegrationRequest target = null;
            target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().find_element_user(RELAYSFILEINTEGRATIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelaysFileIntegrationRequest" element
     */
    public void setRelaysFileIntegrationRequest(com.cdiscount.www.RelaysFileIntegrationRequest relaysFileIntegrationRequest)
    {
        generatedSetterHelperImpl(relaysFileIntegrationRequest, RELAYSFILEINTEGRATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelaysFileIntegrationRequest" element
     */
    public com.cdiscount.www.RelaysFileIntegrationRequest addNewRelaysFileIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileIntegrationRequest target = null;
            target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().add_element_user(RELAYSFILEINTEGRATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelaysFileIntegrationRequest" element
     */
    public void setNilRelaysFileIntegrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelaysFileIntegrationRequest target = null;
            target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().find_element_user(RELAYSFILEINTEGRATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RelaysFileIntegrationRequest)get_store().add_element_user(RELAYSFILEINTEGRATIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
