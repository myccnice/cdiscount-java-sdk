/*
 * XML Type:  ManageParcelResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ManageParcelResultMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ManageParcelResultMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ManageParcelResultMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.ManageParcelResultMessage
{
    private static final long serialVersionUID = 1L;
    
    public ManageParcelResultMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELACTIONRESULTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelActionResultList");
    
    
    /**
     * Gets the "ParcelActionResultList" element
     */
    public com.cdiscount.www.ArrayOfParcelActionResult getParcelActionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().find_element_user(PARCELACTIONRESULTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelActionResultList" element
     */
    public boolean isNilParcelActionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().find_element_user(PARCELACTIONRESULTLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelActionResultList" element
     */
    public boolean isSetParcelActionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELACTIONRESULTLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ParcelActionResultList" element
     */
    public void setParcelActionResultList(com.cdiscount.www.ArrayOfParcelActionResult parcelActionResultList)
    {
        generatedSetterHelperImpl(parcelActionResultList, PARCELACTIONRESULTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelActionResultList" element
     */
    public com.cdiscount.www.ArrayOfParcelActionResult addNewParcelActionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().add_element_user(PARCELACTIONRESULTLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelActionResultList" element
     */
    public void setNilParcelActionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelActionResult target = null;
            target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().find_element_user(PARCELACTIONRESULTLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelActionResult)get_store().add_element_user(PARCELACTIONRESULTLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelActionResultList" element
     */
    public void unsetParcelActionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELACTIONRESULTLIST$0, 0);
        }
    }
}
