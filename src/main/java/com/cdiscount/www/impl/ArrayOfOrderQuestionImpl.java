/*
 * XML Type:  ArrayOfOrderQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderQuestion
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOrderQuestion(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOrderQuestionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderQuestion
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderQuestionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERQUESTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderQuestion");
    
    
    /**
     * Gets array of all "OrderQuestion" elements
     */
    public com.cdiscount.www.OrderQuestion[] getOrderQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERQUESTION$0, targetList);
            com.cdiscount.www.OrderQuestion[] result = new com.cdiscount.www.OrderQuestion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrderQuestion" element
     */
    public com.cdiscount.www.OrderQuestion getOrderQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().find_element_user(ORDERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrderQuestion" element
     */
    public boolean isNilOrderQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().find_element_user(ORDERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrderQuestion" element
     */
    public int sizeOfOrderQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERQUESTION$0);
        }
    }
    
    /**
     * Sets array of all "OrderQuestion" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderQuestionArray(com.cdiscount.www.OrderQuestion[] orderQuestionArray)
    {
        check_orphaned();
        arraySetterHelper(orderQuestionArray, ORDERQUESTION$0);
    }
    
    /**
     * Sets ith "OrderQuestion" element
     */
    public void setOrderQuestionArray(int i, com.cdiscount.www.OrderQuestion orderQuestion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().find_element_user(ORDERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderQuestion);
        }
    }
    
    /**
     * Nils the ith "OrderQuestion" element
     */
    public void setNilOrderQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().find_element_user(ORDERQUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderQuestion" element
     */
    public com.cdiscount.www.OrderQuestion insertNewOrderQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().insert_element_user(ORDERQUESTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderQuestion" element
     */
    public com.cdiscount.www.OrderQuestion addNewOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().add_element_user(ORDERQUESTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrderQuestion" element
     */
    public void removeOrderQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERQUESTION$0, i);
        }
    }
}
