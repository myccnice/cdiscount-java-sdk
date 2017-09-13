/*
 * XML Type:  OfferFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferFilter
{
    private static final long serialVersionUID = 1L;
    
    public OfferFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERPOOLID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPoolId");
    private static final javax.xml.namespace.QName SELLERPRODUCTIDLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductIdList");
    
    
    /**
     * Gets the "OfferPoolId" element
     */
    public int getOfferPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERPOOLID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferPoolId" element
     */
    public org.apache.xmlbeans.XmlInt xgetOfferPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferPoolId" element
     */
    public boolean isNilOfferPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferPoolId" element
     */
    public boolean isSetOfferPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERPOOLID$0) != 0;
        }
    }
    
    /**
     * Sets the "OfferPoolId" element
     */
    public void setOfferPoolId(int offerPoolId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERPOOLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERPOOLID$0);
            }
            target.setIntValue(offerPoolId);
        }
    }
    
    /**
     * Sets (as xml) the "OfferPoolId" element
     */
    public void xsetOfferPoolId(org.apache.xmlbeans.XmlInt offerPoolId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OFFERPOOLID$0);
            }
            target.set(offerPoolId);
        }
    }
    
    /**
     * Nils the "OfferPoolId" element
     */
    public void setNilOfferPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OFFERPOOLID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferPoolId" element
     */
    public void unsetOfferPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERPOOLID$0, 0);
        }
    }
    
    /**
     * Gets the "SellerProductIdList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getSellerProductIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SELLERPRODUCTIDLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerProductIdList" element
     */
    public boolean isNilSellerProductIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SELLERPRODUCTIDLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerProductIdList" element
     */
    public boolean isSetSellerProductIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERPRODUCTIDLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "SellerProductIdList" element
     */
    public void setSellerProductIdList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring sellerProductIdList)
    {
        generatedSetterHelperImpl(sellerProductIdList, SELLERPRODUCTIDLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerProductIdList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewSellerProductIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(SELLERPRODUCTIDLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "SellerProductIdList" element
     */
    public void setNilSellerProductIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SELLERPRODUCTIDLIST$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(SELLERPRODUCTIDLIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerProductIdList" element
     */
    public void unsetSellerProductIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERPRODUCTIDLIST$2, 0);
        }
    }
}
