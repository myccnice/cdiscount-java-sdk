/*
 * XML Type:  ArrayOfOfferReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferReportLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOfferReportLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOfferReportLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferReportLog
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferReportLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERREPORTLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferReportLog");
    
    
    /**
     * Gets array of all "OfferReportLog" elements
     */
    public com.cdiscount.www.OfferReportLog[] getOfferReportLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFERREPORTLOG$0, targetList);
            com.cdiscount.www.OfferReportLog[] result = new com.cdiscount.www.OfferReportLog[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OfferReportLog" element
     */
    public com.cdiscount.www.OfferReportLog getOfferReportLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().find_element_user(OFFERREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OfferReportLog" element
     */
    public boolean isNilOfferReportLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().find_element_user(OFFERREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OfferReportLog" element
     */
    public int sizeOfOfferReportLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERREPORTLOG$0);
        }
    }
    
    /**
     * Sets array of all "OfferReportLog" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOfferReportLogArray(com.cdiscount.www.OfferReportLog[] offerReportLogArray)
    {
        check_orphaned();
        arraySetterHelper(offerReportLogArray, OFFERREPORTLOG$0);
    }
    
    /**
     * Sets ith "OfferReportLog" element
     */
    public void setOfferReportLogArray(int i, com.cdiscount.www.OfferReportLog offerReportLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().find_element_user(OFFERREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offerReportLog);
        }
    }
    
    /**
     * Nils the ith "OfferReportLog" element
     */
    public void setNilOfferReportLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().find_element_user(OFFERREPORTLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OfferReportLog" element
     */
    public com.cdiscount.www.OfferReportLog insertNewOfferReportLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().insert_element_user(OFFERREPORTLOG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OfferReportLog" element
     */
    public com.cdiscount.www.OfferReportLog addNewOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().add_element_user(OFFERREPORTLOG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OfferReportLog" element
     */
    public void removeOfferReportLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERREPORTLOG$0, i);
        }
    }
}
