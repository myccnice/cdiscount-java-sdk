/*
 * XML Type:  OrderFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderFilter
{
    private static final long serialVersionUID = 1L;
    
    public OrderFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINCREATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BeginCreationDate");
    private static final javax.xml.namespace.QName BEGINMODIFICATIONDATE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BeginModificationDate");
    private static final javax.xml.namespace.QName CORPORATIONCODE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CorporationCode");
    private static final javax.xml.namespace.QName ENDCREATIONDATE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EndCreationDate");
    private static final javax.xml.namespace.QName ENDMODIFICATIONDATE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EndModificationDate");
    private static final javax.xml.namespace.QName FETCHORDERLINES$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FetchOrderLines");
    private static final javax.xml.namespace.QName FETCHPARCELS$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FetchParcels");
    private static final javax.xml.namespace.QName INCLUDEEXTERNALFBCSITEID$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IncludeExternalFbcSiteId");
    private static final javax.xml.namespace.QName ORDERREFERENCELIST$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderReferenceList");
    private static final javax.xml.namespace.QName ORDERTYPE$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderType");
    private static final javax.xml.namespace.QName PARTNERORDERREF$20 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PartnerOrderRef");
    private static final javax.xml.namespace.QName STATES$22 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "States");
    
    
    /**
     * Gets the "BeginCreationDate" element
     */
    public java.util.Calendar getBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginCreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BeginCreationDate" element
     */
    public boolean isNilBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BeginCreationDate" element
     */
    public boolean isSetBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINCREATIONDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "BeginCreationDate" element
     */
    public void setBeginCreationDate(java.util.Calendar beginCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINCREATIONDATE$0);
            }
            target.setCalendarValue(beginCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "BeginCreationDate" element
     */
    public void xsetBeginCreationDate(org.apache.xmlbeans.XmlDateTime beginCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINCREATIONDATE$0);
            }
            target.set(beginCreationDate);
        }
    }
    
    /**
     * Nils the "BeginCreationDate" element
     */
    public void setNilBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINCREATIONDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BeginCreationDate" element
     */
    public void unsetBeginCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINCREATIONDATE$0, 0);
        }
    }
    
    /**
     * Gets the "BeginModificationDate" element
     */
    public java.util.Calendar getBeginModificationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
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
            return get_store().count_elements(BEGINMODIFICATIONDATE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINMODIFICATIONDATE$2);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINMODIFICATIONDATE$2);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINMODIFICATIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINMODIFICATIONDATE$2);
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
            get_store().remove_element(BEGINMODIFICATIONDATE$2, 0);
        }
    }
    
    /**
     * Gets the "CorporationCode" element
     */
    public java.lang.String getCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorporationCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CorporationCode" element
     */
    public boolean isNilCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CorporationCode" element
     */
    public boolean isSetCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORPORATIONCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "CorporationCode" element
     */
    public void setCorporationCode(java.lang.String corporationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATIONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPORATIONCODE$4);
            }
            target.setStringValue(corporationCode);
        }
    }
    
    /**
     * Sets (as xml) the "CorporationCode" element
     */
    public void xsetCorporationCode(org.apache.xmlbeans.XmlString corporationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATIONCODE$4);
            }
            target.set(corporationCode);
        }
    }
    
    /**
     * Nils the "CorporationCode" element
     */
    public void setNilCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATIONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATIONCODE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CorporationCode" element
     */
    public void unsetCorporationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORPORATIONCODE$4, 0);
        }
    }
    
    /**
     * Gets the "EndCreationDate" element
     */
    public java.util.Calendar getEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDCREATIONDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndCreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndCreationDate" element
     */
    public boolean isNilEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EndCreationDate" element
     */
    public boolean isSetEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDCREATIONDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "EndCreationDate" element
     */
    public void setEndCreationDate(java.util.Calendar endCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDCREATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDCREATIONDATE$6);
            }
            target.setCalendarValue(endCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndCreationDate" element
     */
    public void xsetEndCreationDate(org.apache.xmlbeans.XmlDateTime endCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDCREATIONDATE$6);
            }
            target.set(endCreationDate);
        }
    }
    
    /**
     * Nils the "EndCreationDate" element
     */
    public void setNilEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDCREATIONDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDCREATIONDATE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EndCreationDate" element
     */
    public void unsetEndCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDCREATIONDATE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDMODIFICATIONDATE$8, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$8, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$8, 0);
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
            return get_store().count_elements(ENDMODIFICATIONDATE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDMODIFICATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDMODIFICATIONDATE$8);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDMODIFICATIONDATE$8);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDMODIFICATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDMODIFICATIONDATE$8);
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
            get_store().remove_element(ENDMODIFICATIONDATE$8, 0);
        }
    }
    
    /**
     * Gets the "FetchOrderLines" element
     */
    public boolean getFetchOrderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHORDERLINES$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "FetchOrderLines" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFetchOrderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FETCHORDERLINES$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "FetchOrderLines" element
     */
    public boolean isSetFetchOrderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FETCHORDERLINES$10) != 0;
        }
    }
    
    /**
     * Sets the "FetchOrderLines" element
     */
    public void setFetchOrderLines(boolean fetchOrderLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHORDERLINES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FETCHORDERLINES$10);
            }
            target.setBooleanValue(fetchOrderLines);
        }
    }
    
    /**
     * Sets (as xml) the "FetchOrderLines" element
     */
    public void xsetFetchOrderLines(org.apache.xmlbeans.XmlBoolean fetchOrderLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FETCHORDERLINES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FETCHORDERLINES$10);
            }
            target.set(fetchOrderLines);
        }
    }
    
    /**
     * Unsets the "FetchOrderLines" element
     */
    public void unsetFetchOrderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FETCHORDERLINES$10, 0);
        }
    }
    
    /**
     * Gets the "FetchParcels" element
     */
    public boolean getFetchParcels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHPARCELS$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "FetchParcels" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFetchParcels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FETCHPARCELS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "FetchParcels" element
     */
    public boolean isSetFetchParcels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FETCHPARCELS$12) != 0;
        }
    }
    
    /**
     * Sets the "FetchParcels" element
     */
    public void setFetchParcels(boolean fetchParcels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHPARCELS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FETCHPARCELS$12);
            }
            target.setBooleanValue(fetchParcels);
        }
    }
    
    /**
     * Sets (as xml) the "FetchParcels" element
     */
    public void xsetFetchParcels(org.apache.xmlbeans.XmlBoolean fetchParcels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FETCHPARCELS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FETCHPARCELS$12);
            }
            target.set(fetchParcels);
        }
    }
    
    /**
     * Unsets the "FetchParcels" element
     */
    public void unsetFetchParcels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FETCHPARCELS$12, 0);
        }
    }
    
    /**
     * Gets the "IncludeExternalFbcSiteId" element
     */
    public boolean getIncludeExternalFbcSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEEXTERNALFBCSITEID$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncludeExternalFbcSiteId" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeExternalFbcSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEEXTERNALFBCSITEID$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "IncludeExternalFbcSiteId" element
     */
    public boolean isSetIncludeExternalFbcSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDEEXTERNALFBCSITEID$14) != 0;
        }
    }
    
    /**
     * Sets the "IncludeExternalFbcSiteId" element
     */
    public void setIncludeExternalFbcSiteId(boolean includeExternalFbcSiteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEEXTERNALFBCSITEID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDEEXTERNALFBCSITEID$14);
            }
            target.setBooleanValue(includeExternalFbcSiteId);
        }
    }
    
    /**
     * Sets (as xml) the "IncludeExternalFbcSiteId" element
     */
    public void xsetIncludeExternalFbcSiteId(org.apache.xmlbeans.XmlBoolean includeExternalFbcSiteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEEXTERNALFBCSITEID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDEEXTERNALFBCSITEID$14);
            }
            target.set(includeExternalFbcSiteId);
        }
    }
    
    /**
     * Unsets the "IncludeExternalFbcSiteId" element
     */
    public void unsetIncludeExternalFbcSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDEEXTERNALFBCSITEID$14, 0);
        }
    }
    
    /**
     * Gets the "OrderReferenceList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERREFERENCELIST$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderReferenceList" element
     */
    public boolean isNilOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERREFERENCELIST$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderReferenceList" element
     */
    public boolean isSetOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERREFERENCELIST$16) != 0;
        }
    }
    
    /**
     * Sets the "OrderReferenceList" element
     */
    public void setOrderReferenceList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring orderReferenceList)
    {
        generatedSetterHelperImpl(orderReferenceList, ORDERREFERENCELIST$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderReferenceList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ORDERREFERENCELIST$16);
            return target;
        }
    }
    
    /**
     * Nils the "OrderReferenceList" element
     */
    public void setNilOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERREFERENCELIST$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ORDERREFERENCELIST$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderReferenceList" element
     */
    public void unsetOrderReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERREFERENCELIST$16, 0);
        }
    }
    
    /**
     * Gets the "OrderType" element
     */
    public com.cdiscount.www.OrderTypeEnum.Enum getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OrderTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderType" element
     */
    public com.cdiscount.www.OrderTypeEnum xgetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPE$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderType" element
     */
    public boolean isNilOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderType" element
     */
    public boolean isSetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERTYPE$18) != 0;
        }
    }
    
    /**
     * Sets the "OrderType" element
     */
    public void setOrderType(com.cdiscount.www.OrderTypeEnum.Enum orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPE$18);
            }
            target.setEnumValue(orderType);
        }
    }
    
    /**
     * Sets (as xml) the "OrderType" element
     */
    public void xsetOrderType(com.cdiscount.www.OrderTypeEnum orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPE$18, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderTypeEnum)get_store().add_element_user(ORDERTYPE$18);
            }
            target.set(orderType);
        }
    }
    
    /**
     * Nils the "OrderType" element
     */
    public void setNilOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderTypeEnum target = null;
            target = (com.cdiscount.www.OrderTypeEnum)get_store().find_element_user(ORDERTYPE$18, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderTypeEnum)get_store().add_element_user(ORDERTYPE$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderType" element
     */
    public void unsetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERTYPE$18, 0);
        }
    }
    
    /**
     * Gets the "PartnerOrderRef" element
     */
    public java.lang.String getPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERORDERREF$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerOrderRef" element
     */
    public org.apache.xmlbeans.XmlString xgetPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PartnerOrderRef" element
     */
    public boolean isNilPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PartnerOrderRef" element
     */
    public boolean isSetPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERORDERREF$20) != 0;
        }
    }
    
    /**
     * Sets the "PartnerOrderRef" element
     */
    public void setPartnerOrderRef(java.lang.String partnerOrderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERORDERREF$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERORDERREF$20);
            }
            target.setStringValue(partnerOrderRef);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerOrderRef" element
     */
    public void xsetPartnerOrderRef(org.apache.xmlbeans.XmlString partnerOrderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERORDERREF$20);
            }
            target.set(partnerOrderRef);
        }
    }
    
    /**
     * Nils the "PartnerOrderRef" element
     */
    public void setNilPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERORDERREF$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERORDERREF$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PartnerOrderRef" element
     */
    public void unsetPartnerOrderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERORDERREF$20, 0);
        }
    }
    
    /**
     * Gets the "States" element
     */
    public com.cdiscount.www.ArrayOfOrderStateEnum getStates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().find_element_user(STATES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "States" element
     */
    public boolean isNilStates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().find_element_user(STATES$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "States" element
     */
    public boolean isSetStates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATES$22) != 0;
        }
    }
    
    /**
     * Sets the "States" element
     */
    public void setStates(com.cdiscount.www.ArrayOfOrderStateEnum states)
    {
        generatedSetterHelperImpl(states, STATES$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "States" element
     */
    public com.cdiscount.www.ArrayOfOrderStateEnum addNewStates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().add_element_user(STATES$22);
            return target;
        }
    }
    
    /**
     * Nils the "States" element
     */
    public void setNilStates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderStateEnum target = null;
            target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().find_element_user(STATES$22, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderStateEnum)get_store().add_element_user(STATES$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "States" element
     */
    public void unsetStates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATES$22, 0);
        }
    }
}
