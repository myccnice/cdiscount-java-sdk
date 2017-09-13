/*
 * XML Type:  ArrayOfOfferReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferReportPropertyLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfOfferReportPropertyLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfOfferReportPropertyLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferReportPropertyLog
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferReportPropertyLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERREPORTPROPERTYLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferReportPropertyLog");
    
    
    /**
     * Gets array of all "OfferReportPropertyLog" elements
     */
    public com.cdiscount.www.OfferReportPropertyLog[] getOfferReportPropertyLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFERREPORTPROPERTYLOG$0, targetList);
            com.cdiscount.www.OfferReportPropertyLog[] result = new com.cdiscount.www.OfferReportPropertyLog[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OfferReportPropertyLog" element
     */
    public com.cdiscount.www.OfferReportPropertyLog getOfferReportPropertyLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().find_element_user(OFFERREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OfferReportPropertyLog" element
     */
    public boolean isNilOfferReportPropertyLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().find_element_user(OFFERREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OfferReportPropertyLog" element
     */
    public int sizeOfOfferReportPropertyLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERREPORTPROPERTYLOG$0);
        }
    }
    
    /**
     * Sets array of all "OfferReportPropertyLog" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOfferReportPropertyLogArray(com.cdiscount.www.OfferReportPropertyLog[] offerReportPropertyLogArray)
    {
        check_orphaned();
        arraySetterHelper(offerReportPropertyLogArray, OFFERREPORTPROPERTYLOG$0);
    }
    
    /**
     * Sets ith "OfferReportPropertyLog" element
     */
    public void setOfferReportPropertyLogArray(int i, com.cdiscount.www.OfferReportPropertyLog offerReportPropertyLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().find_element_user(OFFERREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offerReportPropertyLog);
        }
    }
    
    /**
     * Nils the ith "OfferReportPropertyLog" element
     */
    public void setNilOfferReportPropertyLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().find_element_user(OFFERREPORTPROPERTYLOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OfferReportPropertyLog" element
     */
    public com.cdiscount.www.OfferReportPropertyLog insertNewOfferReportPropertyLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().insert_element_user(OFFERREPORTPROPERTYLOG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OfferReportPropertyLog" element
     */
    public com.cdiscount.www.OfferReportPropertyLog addNewOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().add_element_user(OFFERREPORTPROPERTYLOG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OfferReportPropertyLog" element
     */
    public void removeOfferReportPropertyLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERREPORTPROPERTYLOG$0, i);
        }
    }
}
