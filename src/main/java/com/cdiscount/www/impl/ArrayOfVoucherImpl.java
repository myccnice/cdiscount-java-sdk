/*
 * XML Type:  ArrayOfVoucher
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfVoucher
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfVoucher(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfVoucherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfVoucher
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfVoucherImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOUCHER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Voucher");
    
    
    /**
     * Gets array of all "Voucher" elements
     */
    public com.cdiscount.www.Voucher[] getVoucherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VOUCHER$0, targetList);
            com.cdiscount.www.Voucher[] result = new com.cdiscount.www.Voucher[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Voucher" element
     */
    public com.cdiscount.www.Voucher getVoucherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().find_element_user(VOUCHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Voucher" element
     */
    public boolean isNilVoucherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().find_element_user(VOUCHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Voucher" element
     */
    public int sizeOfVoucherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOUCHER$0);
        }
    }
    
    /**
     * Sets array of all "Voucher" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVoucherArray(com.cdiscount.www.Voucher[] voucherArray)
    {
        check_orphaned();
        arraySetterHelper(voucherArray, VOUCHER$0);
    }
    
    /**
     * Sets ith "Voucher" element
     */
    public void setVoucherArray(int i, com.cdiscount.www.Voucher voucher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().find_element_user(VOUCHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(voucher);
        }
    }
    
    /**
     * Nils the ith "Voucher" element
     */
    public void setNilVoucherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().find_element_user(VOUCHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Voucher" element
     */
    public com.cdiscount.www.Voucher insertNewVoucher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().insert_element_user(VOUCHER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Voucher" element
     */
    public com.cdiscount.www.Voucher addNewVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Voucher target = null;
            target = (com.cdiscount.www.Voucher)get_store().add_element_user(VOUCHER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Voucher" element
     */
    public void removeVoucher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOUCHER$0, i);
        }
    }
}
