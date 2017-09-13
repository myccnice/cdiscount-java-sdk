/*
 * XML Type:  RelaysFileDepositMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelaysFileDepositMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML RelaysFileDepositMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class RelaysFileDepositMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.RelaysFileDepositMessage
{
    private static final long serialVersionUID = 1L;
    
    public RelaysFileDepositMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAYSFILEID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RelaysFileId");
    
    
    /**
     * Gets the "RelaysFileId" element
     */
    public int getRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelaysFileId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELAYSFILEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "RelaysFileId" element
     */
    public boolean isSetRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELAYSFILEID$0) != 0;
        }
    }
    
    /**
     * Sets the "RelaysFileId" element
     */
    public void setRelaysFileId(int relaysFileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELAYSFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELAYSFILEID$0);
            }
            target.setIntValue(relaysFileId);
        }
    }
    
    /**
     * Sets (as xml) the "RelaysFileId" element
     */
    public void xsetRelaysFileId(org.apache.xmlbeans.XmlInt relaysFileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELAYSFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RELAYSFILEID$0);
            }
            target.set(relaysFileId);
        }
    }
    
    /**
     * Unsets the "RelaysFileId" element
     */
    public void unsetRelaysFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELAYSFILEID$0, 0);
        }
    }
}
