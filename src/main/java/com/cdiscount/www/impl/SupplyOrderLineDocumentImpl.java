/*
 * An XML document type.
 * Localname: SupplyOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderLine");
    
    
    /**
     * Gets the "SupplyOrderLine" element
     */
    public com.cdiscount.www.SupplyOrderLine getSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderLine" element
     */
    public boolean isNilSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderLine" element
     */
    public void setSupplyOrderLine(com.cdiscount.www.SupplyOrderLine supplyOrderLine)
    {
        generatedSetterHelperImpl(supplyOrderLine, SUPPLYORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderLine" element
     */
    public com.cdiscount.www.SupplyOrderLine addNewSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().add_element_user(SUPPLYORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderLine" element
     */
    public void setNilSupplyOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderLine target = null;
            target = (com.cdiscount.www.SupplyOrderLine)get_store().find_element_user(SUPPLYORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderLine)get_store().add_element_user(SUPPLYORDERLINE$0);
            }
            target.setNil();
        }
    }
}
