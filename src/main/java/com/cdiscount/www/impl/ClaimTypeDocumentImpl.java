/*
 * An XML document type.
 * Localname: ClaimType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ClaimTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ClaimType(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ClaimTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ClaimTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClaimTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLAIMTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ClaimType");
    
    
    /**
     * Gets the "ClaimType" element
     */
    public com.cdiscount.www.ClaimType.Enum getClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ClaimType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClaimType" element
     */
    public com.cdiscount.www.ClaimType xgetClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ClaimType target = null;
            target = (com.cdiscount.www.ClaimType)get_store().find_element_user(CLAIMTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ClaimType" element
     */
    public boolean isNilClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ClaimType target = null;
            target = (com.cdiscount.www.ClaimType)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ClaimType" element
     */
    public void setClaimType(com.cdiscount.www.ClaimType.Enum claimType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLAIMTYPE$0);
            }
            target.setEnumValue(claimType);
        }
    }
    
    /**
     * Sets (as xml) the "ClaimType" element
     */
    public void xsetClaimType(com.cdiscount.www.ClaimType claimType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ClaimType target = null;
            target = (com.cdiscount.www.ClaimType)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ClaimType)get_store().add_element_user(CLAIMTYPE$0);
            }
            target.set(claimType);
        }
    }
    
    /**
     * Nils the "ClaimType" element
     */
    public void setNilClaimType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ClaimType target = null;
            target = (com.cdiscount.www.ClaimType)get_store().find_element_user(CLAIMTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ClaimType)get_store().add_element_user(CLAIMTYPE$0);
            }
            target.setNil();
        }
    }
}
