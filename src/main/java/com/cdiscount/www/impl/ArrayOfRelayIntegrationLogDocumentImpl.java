/*
 * An XML document type.
 * Localname: ArrayOfRelayIntegrationLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfRelayIntegrationLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfRelayIntegrationLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfRelayIntegrationLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfRelayIntegrationLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelayIntegrationLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRELAYINTEGRATIONLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfRelayIntegrationLog");
    
    
    /**
     * Gets the "ArrayOfRelayIntegrationLog" element
     */
    public com.cdiscount.www.ArrayOfRelayIntegrationLog getArrayOfRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().find_element_user(ARRAYOFRELAYINTEGRATIONLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRelayIntegrationLog" element
     */
    public boolean isNilArrayOfRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().find_element_user(ARRAYOFRELAYINTEGRATIONLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRelayIntegrationLog" element
     */
    public void setArrayOfRelayIntegrationLog(com.cdiscount.www.ArrayOfRelayIntegrationLog arrayOfRelayIntegrationLog)
    {
        generatedSetterHelperImpl(arrayOfRelayIntegrationLog, ARRAYOFRELAYINTEGRATIONLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRelayIntegrationLog" element
     */
    public com.cdiscount.www.ArrayOfRelayIntegrationLog addNewArrayOfRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().add_element_user(ARRAYOFRELAYINTEGRATIONLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRelayIntegrationLog" element
     */
    public void setNilArrayOfRelayIntegrationLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfRelayIntegrationLog target = null;
            target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().find_element_user(ARRAYOFRELAYINTEGRATIONLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfRelayIntegrationLog)get_store().add_element_user(ARRAYOFRELAYINTEGRATIONLOG$0);
            }
            target.setNil();
        }
    }
}
