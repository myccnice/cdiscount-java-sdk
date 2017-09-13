/*
 * XML Type:  VariationDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.VariationDescription
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML VariationDescription(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class VariationDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.VariationDescription
{
    private static final long serialVersionUID = 1L;
    
    public VariationDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIANTVALUEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VariantValueDescription");
    private static final javax.xml.namespace.QName VARIANTVALUEID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VariantValueId");
    
    
    /**
     * Gets the "VariantValueDescription" element
     */
    public java.lang.String getVariantValueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANTVALUEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VariantValueDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetVariantValueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANTVALUEDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "VariantValueDescription" element
     */
    public boolean isNilVariantValueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANTVALUEDESCRIPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "VariantValueDescription" element
     */
    public boolean isSetVariantValueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIANTVALUEDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "VariantValueDescription" element
     */
    public void setVariantValueDescription(java.lang.String variantValueDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANTVALUEDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIANTVALUEDESCRIPTION$0);
            }
            target.setStringValue(variantValueDescription);
        }
    }
    
    /**
     * Sets (as xml) the "VariantValueDescription" element
     */
    public void xsetVariantValueDescription(org.apache.xmlbeans.XmlString variantValueDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANTVALUEDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIANTVALUEDESCRIPTION$0);
            }
            target.set(variantValueDescription);
        }
    }
    
    /**
     * Nils the "VariantValueDescription" element
     */
    public void setNilVariantValueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIANTVALUEDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIANTVALUEDESCRIPTION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "VariantValueDescription" element
     */
    public void unsetVariantValueDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIANTVALUEDESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "VariantValueId" element
     */
    public int getVariantValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANTVALUEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "VariantValueId" element
     */
    public org.apache.xmlbeans.XmlInt xgetVariantValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VARIANTVALUEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "VariantValueId" element
     */
    public boolean isSetVariantValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIANTVALUEID$2) != 0;
        }
    }
    
    /**
     * Sets the "VariantValueId" element
     */
    public void setVariantValueId(int variantValueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANTVALUEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIANTVALUEID$2);
            }
            target.setIntValue(variantValueId);
        }
    }
    
    /**
     * Sets (as xml) the "VariantValueId" element
     */
    public void xsetVariantValueId(org.apache.xmlbeans.XmlInt variantValueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VARIANTVALUEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VARIANTVALUEID$2);
            }
            target.set(variantValueId);
        }
    }
    
    /**
     * Unsets the "VariantValueId" element
     */
    public void unsetVariantValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIANTVALUEID$2, 0);
        }
    }
}
