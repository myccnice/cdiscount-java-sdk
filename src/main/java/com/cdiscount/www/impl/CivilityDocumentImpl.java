/*
 * An XML document type.
 * Localname: Civility
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CivilityDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Civility(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CivilityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CivilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public CivilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIVILITY$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Civility");
    
    
    /**
     * Gets the "Civility" element
     */
    public com.cdiscount.www.Civility.Enum getCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.Civility.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Civility" element
     */
    public com.cdiscount.www.Civility xgetCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Civility" element
     */
    public boolean isNilCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Civility" element
     */
    public void setCivility(com.cdiscount.www.Civility.Enum civility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIVILITY$0);
            }
            target.setEnumValue(civility);
        }
    }
    
    /**
     * Sets (as xml) the "Civility" element
     */
    public void xsetCivility(com.cdiscount.www.Civility civility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Civility)get_store().add_element_user(CIVILITY$0);
            }
            target.set(civility);
        }
    }
    
    /**
     * Nils the "Civility" element
     */
    public void setNilCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Civility)get_store().add_element_user(CIVILITY$0);
            }
            target.setNil();
        }
    }
}
