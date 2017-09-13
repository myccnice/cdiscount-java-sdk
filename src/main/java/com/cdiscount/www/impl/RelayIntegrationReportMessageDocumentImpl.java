/*
 * An XML document type.
 * Localname: RelayIntegrationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelayIntegrationReportMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RelayIntegrationReportMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RelayIntegrationReportMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RelayIntegrationReportMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelayIntegrationReportMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYINTEGRATIONREPORTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelayIntegrationReportMessage");
    
    
    /**
     * Gets the "RelayIntegrationReportMessage" element
     */
    public com.cdiscount.www.RelayIntegrationReportMessage getRelayIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationReportMessage target = null;
            target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().find_element_user(RELAYINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelayIntegrationReportMessage" element
     */
    public boolean isNilRelayIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationReportMessage target = null;
            target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().find_element_user(RELAYINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelayIntegrationReportMessage" element
     */
    public void setRelayIntegrationReportMessage(com.cdiscount.www.RelayIntegrationReportMessage relayIntegrationReportMessage)
    {
        generatedSetterHelperImpl(relayIntegrationReportMessage, RELAYINTEGRATIONREPORTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelayIntegrationReportMessage" element
     */
    public com.cdiscount.www.RelayIntegrationReportMessage addNewRelayIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationReportMessage target = null;
            target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().add_element_user(RELAYINTEGRATIONREPORTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelayIntegrationReportMessage" element
     */
    public void setNilRelayIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationReportMessage target = null;
            target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().find_element_user(RELAYINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RelayIntegrationReportMessage)get_store().add_element_user(RELAYINTEGRATIONREPORTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
