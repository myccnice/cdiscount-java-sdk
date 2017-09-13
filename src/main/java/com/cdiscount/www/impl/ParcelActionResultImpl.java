/*
 * XML Type:  ParcelActionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelActionResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ParcelActionResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ParcelActionResultImpl extends org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl.ServiceMessageImpl implements com.cdiscount.www.ParcelActionResult
{
    private static final long serialVersionUID = 1L;
    
    public ParcelActionResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIONTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ActionType");
    private static final javax.xml.namespace.QName ISACTIONCREATED$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsActionCreated");
    private static final javax.xml.namespace.QName PARCELNUMBER$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelNumber");
    
    
    /**
     * Gets the "ActionType" element
     */
    public java.util.List getActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActionType" element
     */
    public com.cdiscount.www.ParcelActionTypes xgetActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(ACTIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActionType" element
     */
    public boolean isSetActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIONTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "ActionType" element
     */
    public void setActionType(java.util.List actionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIONTYPE$0);
            }
            target.setListValue(actionType);
        }
    }
    
    /**
     * Sets (as xml) the "ActionType" element
     */
    public void xsetActionType(com.cdiscount.www.ParcelActionTypes actionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionTypes target = null;
            target = (com.cdiscount.www.ParcelActionTypes)get_store().find_element_user(ACTIONTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelActionTypes)get_store().add_element_user(ACTIONTYPE$0);
            }
            target.set(actionType);
        }
    }
    
    /**
     * Unsets the "ActionType" element
     */
    public void unsetActionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIONTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "IsActionCreated" element
     */
    public boolean getIsActionCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIONCREATED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActionCreated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActionCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIONCREATED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsActionCreated" element
     */
    public boolean isSetIsActionCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIONCREATED$2) != 0;
        }
    }
    
    /**
     * Sets the "IsActionCreated" element
     */
    public void setIsActionCreated(boolean isActionCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIONCREATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIONCREATED$2);
            }
            target.setBooleanValue(isActionCreated);
        }
    }
    
    /**
     * Sets (as xml) the "IsActionCreated" element
     */
    public void xsetIsActionCreated(org.apache.xmlbeans.XmlBoolean isActionCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIONCREATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIONCREATED$2);
            }
            target.set(isActionCreated);
        }
    }
    
    /**
     * Unsets the "IsActionCreated" element
     */
    public void unsetIsActionCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIONCREATED$2, 0);
        }
    }
    
    /**
     * Gets the "ParcelNumber" element
     */
    public java.lang.String getParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParcelNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelNumber" element
     */
    public boolean isNilParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParcelNumber" element
     */
    public boolean isSetParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARCELNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "ParcelNumber" element
     */
    public void setParcelNumber(java.lang.String parcelNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARCELNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARCELNUMBER$4);
            }
            target.setStringValue(parcelNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ParcelNumber" element
     */
    public void xsetParcelNumber(org.apache.xmlbeans.XmlString parcelNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARCELNUMBER$4);
            }
            target.set(parcelNumber);
        }
    }
    
    /**
     * Nils the "ParcelNumber" element
     */
    public void setNilParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARCELNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARCELNUMBER$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParcelNumber" element
     */
    public void unsetParcelNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARCELNUMBER$4, 0);
        }
    }
}
