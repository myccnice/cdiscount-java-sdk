/*
 * XML Type:  ManageParcelRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ManageParcelRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ManageParcelRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ManageParcelRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ManageParcelRequest
{
    private static final long serialVersionUID = 1L;
    
    public ManageParcelRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELACTIONSLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelActionsList");
    private static final javax.xml.namespace.QName SCOPUSID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ScopusId");
    
    
    /**
     * Gets the "ParcelActionsList" element
     */
    public com.cdiscount.www.ArrayOfParcelInfos getParcelActionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().find_element_user(PARCELACTIONSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelActionsList" element
     */
    public boolean isNilParcelActionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().find_element_user(PARCELACTIONSLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelActionsList" element
     */
    public boolean isSetParcelActionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELACTIONSLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ParcelActionsList" element
     */
    public void setParcelActionsList(com.cdiscount.www.ArrayOfParcelInfos parcelActionsList)
    {
        generatedSetterHelperImpl(parcelActionsList, PARCELACTIONSLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelActionsList" element
     */
    public com.cdiscount.www.ArrayOfParcelInfos addNewParcelActionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().add_element_user(PARCELACTIONSLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelActionsList" element
     */
    public void setNilParcelActionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().find_element_user(PARCELACTIONSLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().add_element_user(PARCELACTIONSLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelActionsList" element
     */
    public void unsetParcelActionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELACTIONSLIST$0, 0);
        }
    }
    
    /**
     * Gets the "ScopusId" element
     */
    public java.lang.String getScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPUSID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScopusId" element
     */
    public org.apache.xmlbeans.XmlString xgetScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ScopusId" element
     */
    public boolean isNilScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ScopusId" element
     */
    public boolean isSetScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPUSID$2) != 0;
        }
    }
    
    /**
     * Sets the "ScopusId" element
     */
    public void setScopusId(java.lang.String scopusId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPUSID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPUSID$2);
            }
            target.setStringValue(scopusId);
        }
    }
    
    /**
     * Sets (as xml) the "ScopusId" element
     */
    public void xsetScopusId(org.apache.xmlbeans.XmlString scopusId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPUSID$2);
            }
            target.set(scopusId);
        }
    }
    
    /**
     * Nils the "ScopusId" element
     */
    public void setNilScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPUSID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPUSID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ScopusId" element
     */
    public void unsetScopusId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPUSID$2, 0);
        }
    }
}
