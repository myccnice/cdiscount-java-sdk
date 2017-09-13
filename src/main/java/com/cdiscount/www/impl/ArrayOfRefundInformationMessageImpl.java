/*
 * XML Type:  ArrayOfRefundInformationMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfRefundInformationMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfRefundInformationMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfRefundInformationMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfRefundInformationMessage
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRefundInformationMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFUNDINFORMATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundInformationMessage");
    
    
    /**
     * Gets array of all "RefundInformationMessage" elements
     */
    public com.cdiscount.www.RefundInformationMessage[] getRefundInformationMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFUNDINFORMATIONMESSAGE$0, targetList);
            com.cdiscount.www.RefundInformationMessage[] result = new com.cdiscount.www.RefundInformationMessage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RefundInformationMessage" element
     */
    public com.cdiscount.www.RefundInformationMessage getRefundInformationMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().find_element_user(REFUNDINFORMATIONMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RefundInformationMessage" element
     */
    public boolean isNilRefundInformationMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().find_element_user(REFUNDINFORMATIONMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RefundInformationMessage" element
     */
    public int sizeOfRefundInformationMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFUNDINFORMATIONMESSAGE$0);
        }
    }
    
    /**
     * Sets array of all "RefundInformationMessage" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRefundInformationMessageArray(com.cdiscount.www.RefundInformationMessage[] refundInformationMessageArray)
    {
        check_orphaned();
        arraySetterHelper(refundInformationMessageArray, REFUNDINFORMATIONMESSAGE$0);
    }
    
    /**
     * Sets ith "RefundInformationMessage" element
     */
    public void setRefundInformationMessageArray(int i, com.cdiscount.www.RefundInformationMessage refundInformationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().find_element_user(REFUNDINFORMATIONMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(refundInformationMessage);
        }
    }
    
    /**
     * Nils the ith "RefundInformationMessage" element
     */
    public void setNilRefundInformationMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().find_element_user(REFUNDINFORMATIONMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefundInformationMessage" element
     */
    public com.cdiscount.www.RefundInformationMessage insertNewRefundInformationMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().insert_element_user(REFUNDINFORMATIONMESSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RefundInformationMessage" element
     */
    public com.cdiscount.www.RefundInformationMessage addNewRefundInformationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformationMessage target = null;
            target = (com.cdiscount.www.RefundInformationMessage)get_store().add_element_user(REFUNDINFORMATIONMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RefundInformationMessage" element
     */
    public void removeRefundInformationMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFUNDINFORMATIONMESSAGE$0, i);
        }
    }
}
