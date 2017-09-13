/*
 * XML Type:  ArrayOfRelayIntegrationLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfRelayIntegrationLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfRelayIntegrationLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfRelayIntegrationLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfRelayIntegrationLog
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelayIntegrationLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYINTEGRATIONLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelayIntegrationLog");
    
    
    /**
     * Gets array of all "RelayIntegrationLog" elements
     */
    public com.cdiscount.www.RelayIntegrationLog[] getRelayIntegrationLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELAYINTEGRATIONLOG$0, targetList);
            com.cdiscount.www.RelayIntegrationLog[] result = new com.cdiscount.www.RelayIntegrationLog[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelayIntegrationLog" element
     */
    public com.cdiscount.www.RelayIntegrationLog getRelayIntegrationLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().find_element_user(RELAYINTEGRATIONLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RelayIntegrationLog" element
     */
    public boolean isNilRelayIntegrationLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().find_element_user(RELAYINTEGRATIONLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RelayIntegrationLog" element
     */
    public int sizeOfRelayIntegrationLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELAYINTEGRATIONLOG$0);
        }
    }
    
    /**
     * Sets array of all "RelayIntegrationLog" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelayIntegrationLogArray(com.cdiscount.www.RelayIntegrationLog[] relayIntegrationLogArray)
    {
        check_orphaned();
        arraySetterHelper(relayIntegrationLogArray, RELAYINTEGRATIONLOG$0);
    }
    
    /**
     * Sets ith "RelayIntegrationLog" element
     */
    public void setRelayIntegrationLogArray(int i, com.cdiscount.www.RelayIntegrationLog relayIntegrationLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().find_element_user(RELAYINTEGRATIONLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relayIntegrationLog);
        }
    }
    
    /**
     * Nils the ith "RelayIntegrationLog" element
     */
    public void setNilRelayIntegrationLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().find_element_user(RELAYINTEGRATIONLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelayIntegrationLog" element
     */
    public com.cdiscount.www.RelayIntegrationLog insertNewRelayIntegrationLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RelayIntegrationLog target = null;
            target = (com.cdiscount.www.RelayIntegrationLog)get_store().insert_element_user(RELAYINTEGRATIONLOG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelayIntegrationLog" element
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
     * Removes the ith "RelayIntegrationLog" element
     */
    public void removeRelayIntegrationLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELAYINTEGRATIONLOG$0, i);
        }
    }
}
