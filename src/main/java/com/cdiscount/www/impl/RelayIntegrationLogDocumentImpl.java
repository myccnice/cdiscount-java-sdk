/*
 * An XML document type.
 * Localname: RelayIntegrationLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelayIntegrationLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RelayIntegrationLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RelayIntegrationLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RelayIntegrationLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelayIntegrationLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYINTEGRATIONLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelayIntegrationLog");
    
    
    /**
     * Gets the "RelayIntegrationLog" element
     */
    public com.cdiscount.www.RelayIntegrationLog getRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().find_element_user(RELAYINTEGRATIONLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelayIntegrationLog" element
     */
    public boolean isNilRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().find_element_user(RELAYINTEGRATIONLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelayIntegrationLog" element
     */
    public void setRelayIntegrationLog(com.cdiscount.www.RelayIntegrationLog relayIntegrationLog)
    {
        generatedSetterHelperImpl(relayIntegrationLog, RELAYINTEGRATIONLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelayIntegrationLog" element
     */
    public com.cdiscount.www.RelayIntegrationLog addNewRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().add_element_user(RELAYINTEGRATIONLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelayIntegrationLog" element
     */
    public void setNilRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().find_element_user(RELAYINTEGRATIONLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RelayIntegrationLog)get_store().add_element_user(RELAYINTEGRATIONLOG$0);
            }
            target.setNil();
        }
    }
}
