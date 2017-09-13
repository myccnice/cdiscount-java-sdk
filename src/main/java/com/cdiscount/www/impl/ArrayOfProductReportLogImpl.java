/*
 * XML Type:  ArrayOfProductReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductReportLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfProductReportLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfProductReportLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductReportLog
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductReportLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTREPORTLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductReportLog");
    
    
    /**
     * Gets array of all "ProductReportLog" elements
     */
    public com.cdiscount.www.ProductReportLog[] getProductReportLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTREPORTLOG$0, targetList);
            com.cdiscount.www.ProductReportLog[] result = new com.cdiscount.www.ProductReportLog[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductReportLog" element
     */
    public com.cdiscount.www.ProductReportLog getProductReportLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().find_element_user(PRODUCTREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProductReportLog" element
     */
    public boolean isNilProductReportLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().find_element_user(PRODUCTREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProductReportLog" element
     */
    public int sizeOfProductReportLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTREPORTLOG$0);
        }
    }
    
    /**
     * Sets array of all "ProductReportLog" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductReportLogArray(com.cdiscount.www.ProductReportLog[] productReportLogArray)
    {
        check_orphaned();
        arraySetterHelper(productReportLogArray, PRODUCTREPORTLOG$0);
    }
    
    /**
     * Sets ith "ProductReportLog" element
     */
    public void setProductReportLogArray(int i, com.cdiscount.www.ProductReportLog productReportLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().find_element_user(PRODUCTREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productReportLog);
        }
    }
    
    /**
     * Nils the ith "ProductReportLog" element
     */
    public void setNilProductReportLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().find_element_user(PRODUCTREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductReportLog" element
     */
    public com.cdiscount.www.ProductReportLog insertNewProductReportLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().insert_element_user(PRODUCTREPORTLOG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductReportLog" element
     */
    public com.cdiscount.www.ProductReportLog addNewProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().add_element_user(PRODUCTREPORTLOG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductReportLog" element
     */
    public void removeProductReportLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTREPORTLOG$0, i);
        }
    }
}
