/*
 * XML Type:  ArrayOfMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfMessage
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Message");
    
    
    /**
     * Gets array of all "Message" elements
     */
    public com.cdiscount.www.Message[] getMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGE$0, targetList);
            com.cdiscount.www.Message[] result = new com.cdiscount.www.Message[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Message" element
     */
    public com.cdiscount.www.Message getMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().find_element_user(MESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Message" element
     */
    public boolean isNilMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().find_element_user(MESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Message" element
     */
    public int sizeOfMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$0);
        }
    }
    
    /**
     * Sets array of all "Message" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMessageArray(com.cdiscount.www.Message[] messageArray)
    {
        check_orphaned();
        arraySetterHelper(messageArray, MESSAGE$0);
    }
    
    /**
     * Sets ith "Message" element
     */
    public void setMessageArray(int i, com.cdiscount.www.Message message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().find_element_user(MESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(message);
        }
    }
    
    /**
     * Nils the ith "Message" element
     */
    public void setNilMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().find_element_user(MESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Message" element
     */
    public com.cdiscount.www.Message insertNewMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().insert_element_user(MESSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Message" element
     */
    public com.cdiscount.www.Message addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Message target = null;
            target = (com.cdiscount.www.Message)get_store().add_element_user(MESSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Message" element
     */
    public void removeMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$0, i);
        }
    }
}
