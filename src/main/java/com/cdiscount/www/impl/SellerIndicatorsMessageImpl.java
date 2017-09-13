/*
 * XML Type:  SellerIndicatorsMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerIndicatorsMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SellerIndicatorsMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerIndicatorsMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.SellerIndicatorsMessage
{
    private static final long serialVersionUID = 1L;
    
    public SellerIndicatorsMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELLERINDICATORS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerIndicators");
    
    
    /**
     * Gets the "SellerIndicators" element
     */
    public com.cdiscount.www.ArrayOfSellerIndicator getSellerIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().find_element_user(SELLERINDICATORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerIndicators" element
     */
    public boolean isNilSellerIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().find_element_user(SELLERINDICATORS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerIndicators" element
     */
    public boolean isSetSellerIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERINDICATORS$0) != 0;
        }
    }
    
    /**
     * Sets the "SellerIndicators" element
     */
    public void setSellerIndicators(com.cdiscount.www.ArrayOfSellerIndicator sellerIndicators)
    {
        generatedSetterHelperImpl(sellerIndicators, SELLERINDICATORS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerIndicators" element
     */
    public com.cdiscount.www.ArrayOfSellerIndicator addNewSellerIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().add_element_user(SELLERINDICATORS$0);
            return target;
        }
    }
    
    /**
     * Nils the "SellerIndicators" element
     */
    public void setNilSellerIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerIndicator target = null;
            target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().find_element_user(SELLERINDICATORS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerIndicator)get_store().add_element_user(SELLERINDICATORS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerIndicators" element
     */
    public void unsetSellerIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERINDICATORS$0, 0);
        }
    }
}
