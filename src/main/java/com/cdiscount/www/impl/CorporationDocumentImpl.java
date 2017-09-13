/*
 * An XML document type.
 * Localname: Corporation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CorporationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Corporation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CorporationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CorporationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorporationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORPORATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Corporation");
    
    
    /**
     * Gets the "Corporation" element
     */
    public com.cdiscount.www.Corporation getCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Corporation" element
     */
    public boolean isNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Corporation" element
     */
    public void setCorporation(com.cdiscount.www.Corporation corporation)
    {
        generatedSetterHelperImpl(corporation, CORPORATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Corporation" element
     */
    public com.cdiscount.www.Corporation addNewCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().add_element_user(CORPORATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "Corporation" element
     */
    public void setNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Corporation target = null;
            target = (com.cdiscount.www.Corporation)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Corporation)get_store().add_element_user(CORPORATION$0);
            }
            target.setNil();
        }
    }
}
