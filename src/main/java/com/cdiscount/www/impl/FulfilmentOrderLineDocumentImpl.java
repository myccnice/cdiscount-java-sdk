/*
 * An XML document type.
 * Localname: FulfilmentOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOrderLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentOrderLine(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentOrderLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOrderLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOrderLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTORDERLINE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentOrderLine");
    
    
    /**
     * Gets the "FulfilmentOrderLine" element
     */
    public com.cdiscount.www.FulfilmentOrderLine getFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().find_element_user(FULFILMENTORDERLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentOrderLine" element
     */
    public boolean isNilFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().find_element_user(FULFILMENTORDERLINE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentOrderLine" element
     */
    public void setFulfilmentOrderLine(com.cdiscount.www.FulfilmentOrderLine fulfilmentOrderLine)
    {
        generatedSetterHelperImpl(fulfilmentOrderLine, FULFILMENTORDERLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentOrderLine" element
     */
    public com.cdiscount.www.FulfilmentOrderLine addNewFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().add_element_user(FULFILMENTORDERLINE$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentOrderLine" element
     */
    public void setNilFulfilmentOrderLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLine target = null;
            target = (com.cdiscount.www.FulfilmentOrderLine)get_store().find_element_user(FULFILMENTORDERLINE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentOrderLine)get_store().add_element_user(FULFILMENTORDERLINE$0);
            }
            target.setNil();
        }
    }
}
