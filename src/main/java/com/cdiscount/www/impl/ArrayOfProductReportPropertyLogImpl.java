/*
 * XML Type:  ArrayOfProductReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductReportPropertyLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfProductReportPropertyLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfProductReportPropertyLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductReportPropertyLog
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductReportPropertyLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTREPORTPROPERTYLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductReportPropertyLog");
    
    
    /**
     * Gets array of all "ProductReportPropertyLog" elements
     */
    public com.cdiscount.www.ProductReportPropertyLog[] getProductReportPropertyLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTREPORTPROPERTYLOG$0, targetList);
            com.cdiscount.www.ProductReportPropertyLog[] result = new com.cdiscount.www.ProductReportPropertyLog[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductReportPropertyLog" element
     */
    public com.cdiscount.www.ProductReportPropertyLog getProductReportPropertyLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().find_element_user(PRODUCTREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProductReportPropertyLog" element
     */
    public boolean isNilProductReportPropertyLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().find_element_user(PRODUCTREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProductReportPropertyLog" element
     */
    public int sizeOfProductReportPropertyLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTREPORTPROPERTYLOG$0);
        }
    }
    
    /**
     * Sets array of all "ProductReportPropertyLog" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductReportPropertyLogArray(com.cdiscount.www.ProductReportPropertyLog[] productReportPropertyLogArray)
    {
        check_orphaned();
        arraySetterHelper(productReportPropertyLogArray, PRODUCTREPORTPROPERTYLOG$0);
    }
    
    /**
     * Sets ith "ProductReportPropertyLog" element
     */
    public void setProductReportPropertyLogArray(int i, com.cdiscount.www.ProductReportPropertyLog productReportPropertyLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().find_element_user(PRODUCTREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productReportPropertyLog);
        }
    }
    
    /**
     * Nils the ith "ProductReportPropertyLog" element
     */
    public void setNilProductReportPropertyLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().find_element_user(PRODUCTREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductReportPropertyLog" element
     */
    public com.cdiscount.www.ProductReportPropertyLog insertNewProductReportPropertyLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().insert_element_user(PRODUCTREPORTPROPERTYLOG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductReportPropertyLog" element
     */
    public com.cdiscount.www.ProductReportPropertyLog addNewProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().add_element_user(PRODUCTREPORTPROPERTYLOG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductReportPropertyLog" element
     */
    public void removeProductReportPropertyLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTREPORTPROPERTYLOG$0, i);
        }
    }
}
