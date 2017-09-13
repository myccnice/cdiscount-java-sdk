/*
 * XML Type:  SellerIndicator
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerIndicator
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SellerIndicator(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SellerIndicator
{
    private static final long serialVersionUID = 1L;
    
    public SellerIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPUTATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ComputationDate");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Description");
    private static final javax.xml.namespace.QName THRESHOLD$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Threshold");
    private static final javax.xml.namespace.QName THRESHOLDTYPE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ThresholdType");
    private static final javax.xml.namespace.QName VALUED30$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValueD30");
    private static final javax.xml.namespace.QName VALUED60$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValueD60");
    
    
    /**
     * Gets the "ComputationDate" element
     */
    public java.util.Calendar getComputationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPUTATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ComputationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetComputationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPUTATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ComputationDate" element
     */
    public boolean isNilComputationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPUTATIONDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ComputationDate" element
     */
    public boolean isSetComputationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPUTATIONDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "ComputationDate" element
     */
    public void setComputationDate(java.util.Calendar computationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPUTATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPUTATIONDATE$0);
            }
            target.setCalendarValue(computationDate);
        }
    }
    
    /**
     * Sets (as xml) the "ComputationDate" element
     */
    public void xsetComputationDate(org.apache.xmlbeans.XmlDateTime computationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPUTATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(COMPUTATIONDATE$0);
            }
            target.set(computationDate);
        }
    }
    
    /**
     * Nils the "ComputationDate" element
     */
    public void setNilComputationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPUTATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(COMPUTATIONDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ComputationDate" element
     */
    public void unsetComputationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPUTATIONDATE$0, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Description" element
     */
    public boolean isNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Nils the "Description" element
     */
    public void setNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "Threshold" element
     */
    public java.math.BigDecimal getThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THRESHOLD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Threshold" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(THRESHOLD$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Threshold" element
     */
    public boolean isNilThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(THRESHOLD$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Threshold" element
     */
    public boolean isSetThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THRESHOLD$4) != 0;
        }
    }
    
    /**
     * Sets the "Threshold" element
     */
    public void setThreshold(java.math.BigDecimal threshold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THRESHOLD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THRESHOLD$4);
            }
            target.setBigDecimalValue(threshold);
        }
    }
    
    /**
     * Sets (as xml) the "Threshold" element
     */
    public void xsetThreshold(org.apache.xmlbeans.XmlDecimal threshold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(THRESHOLD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(THRESHOLD$4);
            }
            target.set(threshold);
        }
    }
    
    /**
     * Nils the "Threshold" element
     */
    public void setNilThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(THRESHOLD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(THRESHOLD$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Threshold" element
     */
    public void unsetThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THRESHOLD$4, 0);
        }
    }
    
    /**
     * Gets the "ThresholdType" element
     */
    public com.cdiscount.www.TresholdType.Enum getThresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THRESHOLDTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.TresholdType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ThresholdType" element
     */
    public com.cdiscount.www.TresholdType xgetThresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.TresholdType target = null;
            target = (com.cdiscount.www.TresholdType)get_store().find_element_user(THRESHOLDTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ThresholdType" element
     */
    public boolean isSetThresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THRESHOLDTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "ThresholdType" element
     */
    public void setThresholdType(com.cdiscount.www.TresholdType.Enum thresholdType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THRESHOLDTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THRESHOLDTYPE$6);
            }
            target.setEnumValue(thresholdType);
        }
    }
    
    /**
     * Sets (as xml) the "ThresholdType" element
     */
    public void xsetThresholdType(com.cdiscount.www.TresholdType thresholdType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.TresholdType target = null;
            target = (com.cdiscount.www.TresholdType)get_store().find_element_user(THRESHOLDTYPE$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.TresholdType)get_store().add_element_user(THRESHOLDTYPE$6);
            }
            target.set(thresholdType);
        }
    }
    
    /**
     * Unsets the "ThresholdType" element
     */
    public void unsetThresholdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THRESHOLDTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "ValueD30" element
     */
    public java.math.BigDecimal getValueD30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUED30$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValueD30" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetValueD30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED30$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ValueD30" element
     */
    public boolean isNilValueD30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED30$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ValueD30" element
     */
    public boolean isSetValueD30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUED30$8) != 0;
        }
    }
    
    /**
     * Sets the "ValueD30" element
     */
    public void setValueD30(java.math.BigDecimal valueD30)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUED30$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUED30$8);
            }
            target.setBigDecimalValue(valueD30);
        }
    }
    
    /**
     * Sets (as xml) the "ValueD30" element
     */
    public void xsetValueD30(org.apache.xmlbeans.XmlDecimal valueD30)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED30$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALUED30$8);
            }
            target.set(valueD30);
        }
    }
    
    /**
     * Nils the "ValueD30" element
     */
    public void setNilValueD30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED30$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALUED30$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ValueD30" element
     */
    public void unsetValueD30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUED30$8, 0);
        }
    }
    
    /**
     * Gets the "ValueD60" element
     */
    public java.math.BigDecimal getValueD60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUED60$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValueD60" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetValueD60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED60$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ValueD60" element
     */
    public boolean isNilValueD60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED60$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ValueD60" element
     */
    public boolean isSetValueD60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUED60$10) != 0;
        }
    }
    
    /**
     * Sets the "ValueD60" element
     */
    public void setValueD60(java.math.BigDecimal valueD60)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUED60$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUED60$10);
            }
            target.setBigDecimalValue(valueD60);
        }
    }
    
    /**
     * Sets (as xml) the "ValueD60" element
     */
    public void xsetValueD60(org.apache.xmlbeans.XmlDecimal valueD60)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED60$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALUED60$10);
            }
            target.set(valueD60);
        }
    }
    
    /**
     * Nils the "ValueD60" element
     */
    public void setNilValueD60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUED60$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALUED60$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ValueD60" element
     */
    public void unsetValueD60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUED60$10, 0);
        }
    }
}
