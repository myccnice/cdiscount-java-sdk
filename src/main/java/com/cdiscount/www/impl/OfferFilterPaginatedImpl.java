/*
 * XML Type:  OfferFilterPaginated
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferFilterPaginated
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferFilterPaginated(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferFilterPaginatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferFilterPaginated
{
    private static final long serialVersionUID = 1L;
    
    public OfferFilterPaginatedImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERFILTERCRITERION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferFilterCriterion");
    private static final javax.xml.namespace.QName OFFERPOOLID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPoolId");
    private static final javax.xml.namespace.QName OFFERSORTORDER$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferSortOrder");
    private static final javax.xml.namespace.QName PAGENUMBER$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PageNumber");
    private static final javax.xml.namespace.QName SELLERPRODUCTIDLIST$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductIdList");
    
    
    /**
     * Gets the "OfferFilterCriterion" element
     */
    public com.cdiscount.www.OfferFilterCriterion.Enum getOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OfferFilterCriterion.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferFilterCriterion" element
     */
    public com.cdiscount.www.OfferFilterCriterion xgetOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferFilterCriterion" element
     */
    public boolean isNilOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferFilterCriterion" element
     */
    public boolean isSetOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERFILTERCRITERION$0) != 0;
        }
    }
    
    /**
     * Sets the "OfferFilterCriterion" element
     */
    public void setOfferFilterCriterion(com.cdiscount.www.OfferFilterCriterion.Enum offerFilterCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERFILTERCRITERION$0);
            }
            target.setEnumValue(offerFilterCriterion);
        }
    }
    
    /**
     * Sets (as xml) the "OfferFilterCriterion" element
     */
    public void xsetOfferFilterCriterion(com.cdiscount.www.OfferFilterCriterion offerFilterCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferFilterCriterion)get_store().add_element_user(OFFERFILTERCRITERION$0);
            }
            target.set(offerFilterCriterion);
        }
    }
    
    /**
     * Nils the "OfferFilterCriterion" element
     */
    public void setNilOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferFilterCriterion target = null;
            target = (com.cdiscount.www.OfferFilterCriterion)get_store().find_element_user(OFFERFILTERCRITERION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferFilterCriterion)get_store().add_element_user(OFFERFILTERCRITERION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferFilterCriterion" element
     */
    public void unsetOfferFilterCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERFILTERCRITERION$0, 0);
        }
    }
    
    /**
     * Gets the "OfferPoolId" element
     */
    public int getOfferPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERPOOLID$2, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$2, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$2, 0);
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
            return get_store().count_elements(OFFERPOOLID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERPOOLID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERPOOLID$2);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OFFERPOOLID$2);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFERPOOLID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OFFERPOOLID$2);
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
            get_store().remove_element(OFFERPOOLID$2, 0);
        }
    }
    
    /**
     * Gets the "OfferSortOrder" element
     */
    public com.cdiscount.www.OfferSortOrder.Enum getOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSORTORDER$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OfferSortOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferSortOrder" element
     */
    public com.cdiscount.www.OfferSortOrder xgetOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferSortOrder" element
     */
    public boolean isNilOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferSortOrder" element
     */
    public boolean isSetOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERSORTORDER$4) != 0;
        }
    }
    
    /**
     * Sets the "OfferSortOrder" element
     */
    public void setOfferSortOrder(com.cdiscount.www.OfferSortOrder.Enum offerSortOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSORTORDER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERSORTORDER$4);
            }
            target.setEnumValue(offerSortOrder);
        }
    }
    
    /**
     * Sets (as xml) the "OfferSortOrder" element
     */
    public void xsetOfferSortOrder(com.cdiscount.www.OfferSortOrder offerSortOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferSortOrder)get_store().add_element_user(OFFERSORTORDER$4);
            }
            target.set(offerSortOrder);
        }
    }
    
    /**
     * Nils the "OfferSortOrder" element
     */
    public void setNilOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferSortOrder target = null;
            target = (com.cdiscount.www.OfferSortOrder)get_store().find_element_user(OFFERSORTORDER$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferSortOrder)get_store().add_element_user(OFFERSORTORDER$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferSortOrder" element
     */
    public void unsetOfferSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERSORTORDER$4, 0);
        }
    }
    
    /**
     * Gets the "PageNumber" element
     */
    public int getPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PageNumber" element
     */
    public void setPageNumber(int pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGENUMBER$6);
            }
            target.setIntValue(pageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PageNumber" element
     */
    public void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$6);
            }
            target.set(pageNumber);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SELLERPRODUCTIDLIST$8, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SELLERPRODUCTIDLIST$8, 0);
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
            return get_store().count_elements(SELLERPRODUCTIDLIST$8) != 0;
        }
    }
    
    /**
     * Sets the "SellerProductIdList" element
     */
    public void setSellerProductIdList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring sellerProductIdList)
    {
        generatedSetterHelperImpl(sellerProductIdList, SELLERPRODUCTIDLIST$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(SELLERPRODUCTIDLIST$8);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SELLERPRODUCTIDLIST$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(SELLERPRODUCTIDLIST$8);
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
            get_store().remove_element(SELLERPRODUCTIDLIST$8, 0);
        }
    }
}
