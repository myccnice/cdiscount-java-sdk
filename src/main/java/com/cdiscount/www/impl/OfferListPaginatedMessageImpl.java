/*
 * XML Type:  OfferListPaginatedMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferListPaginatedMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferListPaginatedMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferListPaginatedMessageImpl extends com.cdiscount.www.impl.OfferListMessageImpl implements com.cdiscount.www.OfferListPaginatedMessage
{
    private static final long serialVersionUID = 1L;
    
    public OfferListPaginatedMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTPAGENUMBER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CurrentPageNumber");
    private static final javax.xml.namespace.QName NUMBEROFPAGES$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfPages");
    
    
    /**
     * Gets the "CurrentPageNumber" element
     */
    public int getCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentPageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentPageNumber" element
     */
    public boolean isSetCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTPAGENUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "CurrentPageNumber" element
     */
    public void setCurrentPageNumber(int currentPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTPAGENUMBER$0);
            }
            target.setIntValue(currentPageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentPageNumber" element
     */
    public void xsetCurrentPageNumber(org.apache.xmlbeans.XmlInt currentPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTPAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTPAGENUMBER$0);
            }
            target.set(currentPageNumber);
        }
    }
    
    /**
     * Unsets the "CurrentPageNumber" element
     */
    public void unsetCurrentPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTPAGENUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "NumberOfPages" element
     */
    public int getNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfPages" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfPages" element
     */
    public boolean isSetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFPAGES$2) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfPages" element
     */
    public void setNumberOfPages(int numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPAGES$2);
            }
            target.setIntValue(numberOfPages);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfPages" element
     */
    public void xsetNumberOfPages(org.apache.xmlbeans.XmlInt numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPAGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFPAGES$2);
            }
            target.set(numberOfPages);
        }
    }
    
    /**
     * Unsets the "NumberOfPages" element
     */
    public void unsetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFPAGES$2, 0);
        }
    }
}
