/*
 * XML Type:  SupplyOrderRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SupplyOrderRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SupplyOrderRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderRequest
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINMODIFICATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BeginModificationDate");
    private static final javax.xml.namespace.QName ENDMODIFICATIONDATE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EndModificationDate");
    private static final javax.xml.namespace.QName PAGENUMBER$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PageNumber");
    private static final javax.xml.namespace.QName PAGESIZE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PageSize");
    private static final javax.xml.namespace.QName SUPPLYORDERNUMBERLIST$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderNumberList");
    
    
    /**
     * Gets the "BeginModificationDate" element
     */
    public java.util.Calendar getBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINMODIFICATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginModificationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BeginModificationDate" element
     */
    public boolean isNilBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BeginModificationDate" element
     */
    public boolean isSetBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINMODIFICATIONDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "BeginModificationDate" element
     */
    public void setBeginModificationDate(java.util.Calendar beginModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINMODIFICATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINMODIFICATIONDATE$0);
            }
            target.setCalendarValue(beginModificationDate);
        }
    }
    
    /**
     * Sets (as xml) the "BeginModificationDate" element
     */
    public void xsetBeginModificationDate(org.apache.xmlbeans.XmlDateTime beginModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINMODIFICATIONDATE$0);
            }
            target.set(beginModificationDate);
        }
    }
    
    /**
     * Nils the "BeginModificationDate" element
     */
    public void setNilBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINMODIFICATIONDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BeginModificationDate" element
     */
    public void unsetBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINMODIFICATIONDATE$0, 0);
        }
    }
    
    /**
     * Gets the "EndModificationDate" element
     */
    public java.util.Calendar getEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndModificationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndModificationDate" element
     */
    public boolean isNilEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EndModificationDate" element
     */
    public boolean isSetEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDMODIFICATIONDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "EndModificationDate" element
     */
    public void setEndModificationDate(java.util.Calendar endModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDMODIFICATIONDATE$2);
            }
            target.setCalendarValue(endModificationDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndModificationDate" element
     */
    public void xsetEndModificationDate(org.apache.xmlbeans.XmlDateTime endModificationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDMODIFICATIONDATE$2);
            }
            target.set(endModificationDate);
        }
    }
    
    /**
     * Nils the "EndModificationDate" element
     */
    public void setNilEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDMODIFICATIONDATE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EndModificationDate" element
     */
    public void unsetEndModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDMODIFICATIONDATE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$4, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PageNumber" element
     */
    public boolean isNilPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PageNumber" element
     */
    public boolean isSetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGENUMBER$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGENUMBER$4);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$4);
            }
            target.set(pageNumber);
        }
    }
    
    /**
     * Nils the "PageNumber" element
     */
    public void setNilPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PageNumber" element
     */
    public void unsetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGENUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "PageSize" element
     */
    public int getPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGESIZE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PageSize" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PageSize" element
     */
    public boolean isNilPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PageSize" element
     */
    public boolean isSetPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGESIZE$6) != 0;
        }
    }
    
    /**
     * Sets the "PageSize" element
     */
    public void setPageSize(int pageSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGESIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGESIZE$6);
            }
            target.setIntValue(pageSize);
        }
    }
    
    /**
     * Sets (as xml) the "PageSize" element
     */
    public void xsetPageSize(org.apache.xmlbeans.XmlInt pageSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGESIZE$6);
            }
            target.set(pageSize);
        }
    }
    
    /**
     * Nils the "PageSize" element
     */
    public void setNilPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGESIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGESIZE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PageSize" element
     */
    public void unsetPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGESIZE$6, 0);
        }
    }
    
    /**
     * Gets the "SupplyOrderNumberList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getSupplyOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SUPPLYORDERNUMBERLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderNumberList" element
     */
    public boolean isNilSupplyOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SUPPLYORDERNUMBERLIST$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SupplyOrderNumberList" element
     */
    public boolean isSetSupplyOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYORDERNUMBERLIST$8) != 0;
        }
    }
    
    /**
     * Sets the "SupplyOrderNumberList" element
     */
    public void setSupplyOrderNumberList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring supplyOrderNumberList)
    {
        generatedSetterHelperImpl(supplyOrderNumberList, SUPPLYORDERNUMBERLIST$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderNumberList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewSupplyOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(SUPPLYORDERNUMBERLIST$8);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderNumberList" element
     */
    public void setNilSupplyOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(SUPPLYORDERNUMBERLIST$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(SUPPLYORDERNUMBERLIST$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SupplyOrderNumberList" element
     */
    public void unsetSupplyOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYORDERNUMBERLIST$8, 0);
        }
    }
}
