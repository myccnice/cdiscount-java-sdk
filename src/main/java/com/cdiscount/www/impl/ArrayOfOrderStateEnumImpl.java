/*
 * XML Type:  ArrayOfOrderStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOrderStateEnum
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOrderStateEnum(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOrderStateEnumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOrderStateEnum
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderStateEnumImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERSTATEENUM$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderStateEnum");
    
    
    /**
     * Gets array of all "OrderStateEnum" elements
     */
    public com.cdiscount.www.OrderStateEnum.Enum[] getOrderStateEnumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERSTATEENUM$0, targetList);
            com.cdiscount.www.OrderStateEnum.Enum[] result = new com.cdiscount.www.OrderStateEnum.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.cdiscount.www.OrderStateEnum.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OrderStateEnum" element
     */
    public com.cdiscount.www.OrderStateEnum.Enum getOrderStateEnumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATEENUM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.cdiscount.www.OrderStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OrderStateEnum" elements
     */
    public com.cdiscount.www.OrderStateEnum[] xgetOrderStateEnumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDERSTATEENUM$0, targetList);
            com.cdiscount.www.OrderStateEnum[] result = new com.cdiscount.www.OrderStateEnum[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OrderStateEnum" element
     */
    public com.cdiscount.www.OrderStateEnum xgetOrderStateEnumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATEENUM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrderStateEnum" element
     */
    public int sizeOfOrderStateEnumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERSTATEENUM$0);
        }
    }
    
    /**
     * Sets array of all "OrderStateEnum" element
     */
    public void setOrderStateEnumArray(com.cdiscount.www.OrderStateEnum.Enum[] orderStateEnumArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orderStateEnumArray, ORDERSTATEENUM$0);
        }
    }
    
    /**
     * Sets ith "OrderStateEnum" element
     */
    public void setOrderStateEnumArray(int i, com.cdiscount.www.OrderStateEnum.Enum orderStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERSTATEENUM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(orderStateEnum);
        }
    }
    
    /**
     * Sets (as xml) array of all "OrderStateEnum" element
     */
    public void xsetOrderStateEnumArray(com.cdiscount.www.OrderStateEnum[]orderStateEnumArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orderStateEnumArray, ORDERSTATEENUM$0);
        }
    }
    
    /**
     * Sets (as xml) ith "OrderStateEnum" element
     */
    public void xsetOrderStateEnumArray(int i, com.cdiscount.www.OrderStateEnum orderStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().find_element_user(ORDERSTATEENUM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderStateEnum);
        }
    }
    
    /**
     * Inserts the value as the ith "OrderStateEnum" element
     */
    public void insertOrderStateEnum(int i, com.cdiscount.www.OrderStateEnum.Enum orderStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ORDERSTATEENUM$0, i);
            target.setEnumValue(orderStateEnum);
        }
    }
    
    /**
     * Appends the value as the last "OrderStateEnum" element
     */
    public void addOrderStateEnum(com.cdiscount.www.OrderStateEnum.Enum orderStateEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERSTATEENUM$0);
            target.setEnumValue(orderStateEnum);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderStateEnum" element
     */
    public com.cdiscount.www.OrderStateEnum insertNewOrderStateEnum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().insert_element_user(ORDERSTATEENUM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderStateEnum" element
     */
    public com.cdiscount.www.OrderStateEnum addNewOrderStateEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderStateEnum target = null;
            target = (com.cdiscount.www.OrderStateEnum)get_store().add_element_user(ORDERSTATEENUM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrderStateEnum" element
     */
    public void removeOrderStateEnum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERSTATEENUM$0, i);
        }
    }
}
